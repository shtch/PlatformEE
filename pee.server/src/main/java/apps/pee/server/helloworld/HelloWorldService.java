package apps.pee.server.helloworld;

import apps.pee.server.ServerSession;
import apps.pee.shared.helloworld.HelloWorldFormData;
import apps.pee.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author oleg
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuffer msg = new StringBuffer();
		msg.append("Привет ").append(ServerSession.get().getUserId()).append("!!!");
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
