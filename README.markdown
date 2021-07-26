A [Giter8][g8] template for EPAM Scala Competency Center Akka Http + Slick web application!

# How to use this project

First of all, you'll need [SBT](https://www.scala-sbt.org). Follow its [installation instructions](https://www.scala-sbt.org/download.html) and make sure `sbt console` opens Scala REPL.

Next, you'll need to run `sbt new EpamLifeSciencesTeam/scc_mentoring_be_akka.g8` and answer its questions about organization name (package name) and project name.

This scaffolded project will contain:
- [Akka Http](https://doc.akka.io/docs/akka-http/current/index.html)
- [Akka Actor](https://doc.akka.io/docs/akka/current/typed/index.html)
- [Akka Stream](https://doc.akka.io/docs/akka/current/stream/index.html)
- [circe](https://circe.github.io/circe/)
- [pureconfig](https://pureconfig.github.io)
- [slick](https://scala-slick.org)

To run this project first run docker-compose to start PostgreSql with configured settings.

Then execute `sbt build run` to start server on the default 8080 port — or edit `application.conf` and provide your desired port number instead.

Also you might want to check another template from Epam Scala Competency Center with Http4s + ZIO + Doobie stack: https://github.com/EpamLifeSciencesTeam/scc_mentoring_be_zio.g8

Template license
----------------
Written in 2021 by Ilia Onishchenko \<onishenko@hey.com>

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
