package okuken.iste.plugin.api;

import java.util.List;

public interface IIsteContextMenuFactory {
	List<? extends IIsteContextMenuNode> createContextMenu();
}
