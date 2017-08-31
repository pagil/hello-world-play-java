package controllers;

//import play.api.i18n.Messages;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import services.Counter;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class contains an
 * action that shows an incrementing count to users. The {@link Counter}
 * object is injected by the Guice dependency injection system.
 */
@Singleton
public class CountController extends Controller {

    private final Counter counter;

    @Inject
    public CountController(Counter counter) {
        this.counter = counter;
    }

    /**
     * An action that responds with the {@link Counter}'s current
     * count. The result is plain text. This action is mapped to
     * <code>GET</code> requests with a path of <code>/count</code>
     * requests by an entry in the <code>routes</code> config file.
     */
    public Result count() {
        // String msg = Messages.get("files.summary");
        // msg = String.format(msg, 123);
        String msg = Messages.get("files.summary", "100", "disk name");
        // return ok(Integer.toString(counter.nextCount()));
        return ok(msg);
    }

}
