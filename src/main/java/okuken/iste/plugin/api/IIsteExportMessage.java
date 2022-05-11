package okuken.iste.plugin.api;

/**
 * URL一覧レコードの取得時インタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteExportMessage {

	/**
	 * HTTPメッセージを取得します。
	 * @return HTTPメッセージ
	 */
	IIsteMessage getMessage();

	/**
	 * HTTPメッセージの分析結果を取得します。
	 * @return HTTPメッセージの分析結果
	 */
	IIsteMessageAnalyzedInfo getAnalyzedInfo();

	/**
	 * メモを取得します。
	 * @return メモ
	 */
	IIsteMessageNotes getNotes();

}
