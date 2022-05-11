package okuken.iste.plugin.api.impl;

import java.util.List;
import java.util.function.Consumer;

import okuken.iste.plugin.api.IIsteContextMenuItem;
import okuken.iste.plugin.api.IIsteExportMessage;

/**
 * {@link IIsteContextMenuItem}の既定実装クラスです。
 * 
 * @author okuken
 *
 */
public class DefaultIsteContextMenuItem extends AbstractIsteContextMenuNode implements IIsteContextMenuItem {

	private Consumer<List<? extends IIsteExportMessage>> action;

	public DefaultIsteContextMenuItem() {
		super();
	}
	public DefaultIsteContextMenuItem(String caption) {
		super();
		setCaption(caption);
	}

	@Override
	public void invoke(List<? extends IIsteExportMessage> isteExportMessages) {
		action.accept(isteExportMessages);
	} 

	public void setAction(Consumer<List<? extends IIsteExportMessage>> action) {
		this.action = action;
	}

}
