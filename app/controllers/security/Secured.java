package controllers.security;

import controllers.security.LogonController;
import play.mvc.*;
import play.mvc.Http.*;



public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx){
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx){
        return redirect(routes.LogonController.login());
    }

}
