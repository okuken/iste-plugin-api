package okuken.iste.plugin.api.impl;

import java.util.List;
import java.util.function.Consumer;

import okuken.iste.plugin.api.IIsteExportRepeatMessage;
import okuken.iste.plugin.api.IIsteRepeaterContextMenuItem;

public class DefaultIsteRepeaterContextMenuItem extends AbstractIsteContextMenuNode implements IIsteRepeaterContextMenuItem {

	private Consumer<List<? extends IIsteExportRepeatMessage>> action;

	public DefaultIsteRepeaterContextMenuItem() {
		super();
	}
	public DefaultIsteRepeaterContextMenuItem(String caption) {
		super();
		setCaption(caption);
	}

	@Override
	public void invoke(List<? extends IIsteExportRepeatMessage> isteExportMessages) {
		action.accept(isteExportMessages);
	} 

	public void setAction(Consumer<List<? extends IIsteExportRepeatMessage>> action) {
		this.action = action;
	}

}
