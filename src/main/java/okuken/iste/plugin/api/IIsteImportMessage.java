package okuken.iste.plugin.api;

/**
 * URL一覧レコードの登録時インタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteImportMessage {

	/**
	 * HTTPメッセージを取得します。
	 * @return HTTPメッセージ
	 */
	IIsteMessage getMessage();

	/**
	 * メモを取得します。
	 * @return メモ
	 */
	IIsteMessageNotes getNotes();

}
