package okuken.iste.plugin.api;

/**
 * HTTPメッセージのインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteMessage {

	/**
	 * プロトコルを取得します。
	 * @return プロトコル
	 */
	String getProtocol();
	/**
	 * ポート番号を取得します。
	 * @return ポート番号
	 */
	Integer getPort();
	/**
	 * ホストを取得します。
	 * @return ホスト
	 */
	String getHost();

	/**
	 * リクエストを取得します。
	 * @return リクエスト
	 */
	byte[] getRequest();
	/**
	 * レスポンスを取得します。
	 * @return レスポンス
	 */
	byte[] getResponse();

}
