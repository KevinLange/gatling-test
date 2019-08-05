package de.kla.gatlingtest.api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class WeaponControllerSimulation extends Simulation {
  val httpConf = http.baseUrl("http://localhost:8080/api/")
  val scn = scenario("Get all weapons")
    .exec(http("request_1")
      .get("v1/weapon-management/weapons"))
    .pause(5)
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
