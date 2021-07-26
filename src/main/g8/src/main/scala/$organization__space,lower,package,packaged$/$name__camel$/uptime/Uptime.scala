package $organization;format="space,lower,package"$.$name;format="camel"$.uptime

import java.time.LocalDateTime

final case class Uptime(now: LocalDateTime, uptime: Long, status: String)