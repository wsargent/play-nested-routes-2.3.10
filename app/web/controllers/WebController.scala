package web.controllers

import play.api._
import play.api.mvc._

object WebController extends Controller {

  def hello() = Action {
    Ok("hello world!")
  }
}
