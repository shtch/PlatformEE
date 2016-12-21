package apps.pee.client.settings;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.shared.TEXTS;

import apps.pee.shared.Icons;

/**
 * <h3>{@link SettingsOutline}</h3>
 *
 * @author oleg
 */
@Order(3000)
public class SettingsOutline extends AbstractOutline {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Settings");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Gear;
	}
}
