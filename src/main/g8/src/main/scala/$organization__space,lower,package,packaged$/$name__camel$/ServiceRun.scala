import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import com.typesafe.scalalogging.LazyLogging
import $organization;format="space,lower,package"$.$name;format="camel"$.config.AppConfig
import $organization;format="space,lower,package"$.$name;format="camel"$.database.DatabaseEngine
import $organization;format="space,lower,package"$.$name;format="camel"$.uptime.{UptimeRepository, UptimeRoute}

object ServiceRun extends App with LazyLogging {
  implicit val system: ActorSystem = ActorSystem()
  import system.dispatcher
  logger.info("Starting the service...")

  AppConfig.create() match {
    case Right(appConfig) =>
      val dbEngine         = new DatabaseEngine(appConfig.postgres)
      val uptimeRepository = new UptimeRepository(dbEngine)
      val uptimeRoute      = new UptimeRoute(uptimeRepository)

      Http().newServerAt(appConfig.api.endpoint, appConfig.api.port).bind(uptimeRoute.route)
      logger.info("Server is ready")
    case Left(error)      =>
      logger.error("Failed to start the server", error.toString)
  }
}
