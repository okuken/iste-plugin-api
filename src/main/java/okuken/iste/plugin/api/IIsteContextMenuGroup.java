package okuken.iste.plugin.api;

import java.util.List;

public interface IIsteContextMenuGroup extends IIsteContextMenuNode {
	List<? extends IIsteContextMenuNode> getChildren();
}
