package okuken.iste.plugin.api;

import java.util.List;

/**
 * コンテキストメニューグループのインタフェースです。
 * コンテキストメニューに階層構造を持たせる場合に使用します。
 * 
 * @author okuken
 *
 */
public interface IIsteContextMenuGroup extends IIsteContextMenuNode {

	/**
	 * 子ノードを取得します。
	 * @return 子ノードのリスト
	 */
	List<? extends IIsteContextMenuNode> getChildren();

}
