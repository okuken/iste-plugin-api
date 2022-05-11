package okuken.iste.plugin.api;

import java.util.List;

/**
 * コンテキストメニューアイテムのインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteContextMenuItem extends IIsteContextMenuNode {

	/**
	 * コンテキストメニューアイテムの処理を実行します。
	 * @param isteExportMessages 選択されているレコードのリスト
	 */
	void invoke(List<? extends IIsteExportMessage> isteExportMessages);

}
