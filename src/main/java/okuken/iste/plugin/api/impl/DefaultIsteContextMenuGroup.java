package okuken.iste.plugin.api.impl;

import java.util.ArrayList;
import java.util.List;

import okuken.iste.plugin.api.IIsteContextMenuGroup;
import okuken.iste.plugin.api.IIsteContextMenuNode;

public class DefaultIsteContextMenuGroup extends AbstractIsteContextMenuNode implements IIsteContextMenuGroup {

	private List<IIsteContextMenuNode> children = new ArrayList<IIsteContextMenuNode>();

	public DefaultIsteContextMenuGroup() {
		super();
	}
	public DefaultIsteContextMenuGroup(String caption) {
		super();
		setCaption(caption);
	}

	@Override
	public List<? extends IIsteContextMenuNode> getChildren() {
		return children;
	}

	public void addChild(IIsteContextMenuNode child) {
		children.add(child);
	}

	public void removeChild(IIsteContextMenuNode child) {
		children.remove(child);
	}

}
