package okuken.iste.plugin.api;

import java.util.List;

/**
 * コンテキストメニューファクトリーのインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteContextMenuFactory {

	/**
	 * コンテキストメニューを生成します。
	 * @return コンテキストメニューのリスト
	 */
	List<? extends IIsteContextMenuNode> createContextMenu();

}
