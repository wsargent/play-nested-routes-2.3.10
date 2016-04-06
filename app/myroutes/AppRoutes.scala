// package controllers
// NOTE: the controllers package is just confusing here, so put this off to the side

package myroutes

import play.api.mvc.Call

object AppRoutes {

  object WebControllerRoutes {
    val hello = web.controllers.routes.WebController.hello()

    private val helloRoutes = Seq(
      hello.url
    )
  }

  val index: Call = controllers.routes.HomeController.index()
}
