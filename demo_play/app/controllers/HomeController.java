package controllers;

import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {

	/**
	 * An action that renders an HTML page with a welcome message. The configuration
	 * in the <code>routes</code> file means that this method will be called when
	 * the application receives a <code>GET</code> request with a path of
	 * <code>/</code>.
	 */
	public Result index() {
		return ok(views.html.index.render());
	}

	public Result hello(Request request, String name) {
		String remoteAddress =request.remoteAddress();
        System.out.println("RemoteAddress: "+remoteAddress);
		return ok(views.html.hello.render(name));
	}

}
