package apps.pee.client.outlines;

import java.util.List;
import java.util.Set;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TreeMenuType;
import org.eclipse.scout.rt.client.ui.basic.tree.ITreeNode;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import apps.pee.client.pages.HelloWorldPage;
import apps.pee.shared.Icons;

/**
 * <h3>{@link WorkOutline}</h3>
 *
 * @author oleg
 */
@Order(1000)
public class WorkOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new HelloWorldPage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Work");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Pencil;
	}

	@Override
	protected boolean getConfiguredOutlineOverviewVisible() {

		return false;//super.getConfiguredOutlineOverviewVisible();
	}

	@Override
	protected boolean getConfiguredNavigateButtonsVisible() {

		return false;//*/super.getConfiguredNavigateButtonsVisible();
	}

	@Override
	protected boolean getConfiguredRootNodeVisible() {

		return false;//super.getConfiguredRootNodeVisible();
	}

	@Override
	protected boolean getConfiguredRootHandlesVisible() {

		return/* false;//*/super.getConfiguredRootHandlesVisible();
	}@Override
	public void addChildNode(int startIndex, ITreeNode parent, ITreeNode child) {
		// TODO Auto-generated method stub
		super.addChildNode(startIndex, parent, child);
	}
	@Order(1000)
	public class WorkOutlineMenu extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("WorkOutlineMenu");
		}

		@Override
		protected Set<? extends IMenuType> getConfiguredMenuTypes() {
			return CollectionUtility.hashSet(TreeMenuType.SingleSelection, TreeMenuType.MultiSelection);
		}

		@Override
		protected void execAction() {
		}
	}
	
}
