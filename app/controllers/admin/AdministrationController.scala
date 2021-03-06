package controllers.admin

import com.google.inject.Inject
import controllers.{routes => normalroutes}
import dao.UserDAO
import play.api.Environment
import play.api.i18n.MessagesApi

import scala.concurrent.{ExecutionContext, Future}

/**
  * @author Camilo Sampedro <camilo.sampedro@udea.edu.co>
  */
class AdministrationController @Inject()(val messagesApi: MessagesApi)(implicit executionContext: ExecutionContext, userDAO: UserDAO, environment: Environment) extends ControllerWithAuthRequired {
  def administrationPanel = AuthRequiredAction { implicit request =>
    Future.successful(Redirect(normalroutes.HomeController.home()))
  }
}
