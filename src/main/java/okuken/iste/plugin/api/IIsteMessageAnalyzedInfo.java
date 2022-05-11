package okuken.iste.plugin.api;

/**
 * HTTPメッセージ分析結果のインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteMessageAnalyzedInfo {

	/**
	 * URL(URLパラメータを含む)を取得します。
	 * @return URL
	 */
	String getUrl();
	/**
	 * URL(URLパラメータを含まない)を取得します。
	 * @return URL
	 */
	String getUrlWithoutQuery();

	/**
	 * HTTPメソッドを取得します。
	 * @return HTTPメソッド
	 */
	String getMethod();
	/**
	 * URLパスを取得します。
	 * @return URLパス
	 */
	String getPath();
	/**
	 * URLパラメータを取得します。
	 * @return URLパラメータ
	 */
	String getQuery();
	/**
	 * パラメータ数を取得します。
	 * @return パラメータ数
	 */
	Integer getParamCount();

	/**
	 * HTTPステータスを取得します。
	 * @return HTTPステータス
	 */
	Short getStatus();
	/**
	 * レスポンスサイズを取得します。
	 * @return レスポンスサイズ
	 */
	Integer getLength();
	/**
	 * マイムタイプを取得します。
	 * @return マイムタイプ
	 */
	String getMimeType();
	/**
	 * レスポンスのCookieを取得します。
	 * @return レスポンスのCookie
	 */
	String getCookies();

}
