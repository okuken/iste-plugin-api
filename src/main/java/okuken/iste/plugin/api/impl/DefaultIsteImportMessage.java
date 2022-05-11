package okuken.iste.plugin.api.impl;

import okuken.iste.plugin.api.IIsteImportMessage;
import okuken.iste.plugin.api.IIsteMessage;
import okuken.iste.plugin.api.IIsteMessageNotes;

/**
 * {@link IIsteImportMessage}の既定実装クラスです。
 * 
 * @author okuken
 *
 */
public class DefaultIsteImportMessage implements IIsteImportMessage {

	private IIsteMessage message;
	private IIsteMessageNotes notes;

	@Override
	public IIsteMessage getMessage() {
		return message;
	}
	@Override
	public IIsteMessageNotes getNotes() {
		return notes;
	}

	public void setMessage(IIsteMessage message) {
		this.message = message;
	}
	public void setNotes(IIsteMessageNotes notes) {
		this.notes = notes;
	}

}
