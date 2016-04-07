// package controllers
// NOTE: the controllers package is just confusing here, so put this off to the side

package myroutes

import play.api.mvc.Call

object AppRoutes {

  object WebControllerRoutes {
    //  target/scala-2.10/src_managed/main/web/controllers/routes.scala
    val hello = web.controllers.routes.WebController.hello()

    private val helloUrls = Seq(
      hello.url
    )
  }

  // target/scala-2.10/src_managed/main/controllers/routes.java
  val index: Call = controllers.routes.HomeController.index()
}
