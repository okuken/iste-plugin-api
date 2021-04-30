package okuken.iste.plugin.api.impl;

import okuken.iste.plugin.api.IIsteContextMenuNode;

public abstract class AbstractIsteContextMenuNode implements IIsteContextMenuNode {

	private String caption;

	@Override
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

}
