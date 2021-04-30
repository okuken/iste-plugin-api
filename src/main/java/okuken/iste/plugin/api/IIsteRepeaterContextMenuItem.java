package okuken.iste.plugin.api;

import java.util.List;

public interface IIsteRepeaterContextMenuItem extends IIsteContextMenuNode {
	void invoke(List<? extends IIsteExportRepeatMessage> isteExportRepeatMessages);
}
