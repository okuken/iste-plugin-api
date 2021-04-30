package okuken.iste.plugin.api;

import java.util.List;

public interface IIsteContextMenuItem extends IIsteContextMenuNode {
	void invoke(List<? extends IIsteExportMessage> isteExportMessages);
}
