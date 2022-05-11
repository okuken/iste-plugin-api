package okuken.iste.plugin.api;

import java.util.Date;

/**
 * Repeat履歴情報のインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteRepeatInfo {

	/**
	 * 送信日時を取得します。
	 * @return 送信日時
	 */
	Date getSendDate();
	/**
	 * 送信ユーザIDを取得します。
	 * @return 送信ユーザID
	 */
	String getUserId();

	/**
	 * レスポンスタイム(ms)を取得します。
	 * @return レスポンスタイム(ms)
	 */
	Integer getTime();

	/**
	 * メモを取得します。
	 * @return メモ
	 */
	String getNotes();

}
