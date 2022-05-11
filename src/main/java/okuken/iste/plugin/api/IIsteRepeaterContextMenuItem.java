package okuken.iste.plugin.api;

import java.util.List;

/**
 * Repeat履歴テーブル用コンテキストメニューアイテムのインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteRepeaterContextMenuItem extends IIsteContextMenuNode {

	/**
	 * コンテキストメニューアイテムの処理を実行します。
	 * @param isteExportRepeatMessages 選択されているレコードのリスト
	 */
	void invoke(List<? extends IIsteExportRepeatMessage> isteExportRepeatMessages);

}
