package apps.pee.client.helloworld;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.mock.BeanMock;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;

import apps.pee.client.pages.HelloWorldForm;
import apps.pee.client.pages.HelloWorldForm.MainBox.TopBox.MessageField;
import apps.pee.shared.helloworld.HelloWorldFormData;
import apps.pee.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldFormTest}</h3> Contains Tests for the
 * {@link HelloWorldForm}.
 *
 * @author oleg
 */
@RunWith(ClientTestRunner.class)
@RunWithSubject("anonymous")
@RunWithClientSession(TestEnvironmentClientSession.class)
public class HelloWorldFormTest {

	private static final String MESSAGE_VALUE = "testData";

	// Register a mock service for {@link IHelloWorldService}
	@BeanMock
	private IHelloWorldService m_mockSvc;

	/**
	 * Return a reference {@link HelloWorldFormData} on method
	 * {@link IHelloWorldService#load(HelloWorldFormData)}.
	 */
	@Before
	public void setup() {
		HelloWorldFormData result = new HelloWorldFormData();
		result.getMessage().setValue(MESSAGE_VALUE);

		Mockito.when(m_mockSvc.load(Matchers.any(HelloWorldFormData.class))).thenReturn(result);
	}

	/**
	 * Tests that the {@link MessageField} is disabled.
	 */
	@Test
	public void testMessageFieldDisabled() {
		HelloWorldForm frm = new HelloWorldForm();
		Assert.assertFalse(frm.getMessageField().isEnabled());
	}

	/**
	 * Tests that the {@link MessageField} is correctly filled after start.
	 */
	@Test
	public void testMessageCorrectlyImported() {
		HelloWorldForm frm = new HelloWorldForm();
		frm.start();

		Assert.assertEquals(MESSAGE_VALUE, frm.getMessageField().getValue());
	}
}
