package okuken.iste.plugin.api;

/**
 * Repeat履歴テーブルレコードの取得時インタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteExportRepeatMessage extends IIsteExportMessage {

	/**
	 * Repeat履歴情報を取得します。
	 * @return Repeat履歴情報
	 */
	IIsteRepeatInfo getRepeatInfo();

}
