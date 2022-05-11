package okuken.iste.plugin.api;

/**
 * ISTEプラグインの開発に役立つヘルパーのインタフェースです。
 * {@link IIstePluginCallbacks#getHelpers()}にて取得可能です。
 * 
 * @author okuken
 *
 */
public interface IIstePluginHelpers {

	/**
	 * JSON文字列をパースし、指定されたクラスのインスタンスへ変換して返します。
	 * @param <T> 変換先クラス
	 * @param json パース対象のJSON文字列
	 * @param classOfT 変換先クラス
	 * @return 変換先クラスのインスタンス
	 */
	<T> T fromJson(String json, Class<T> classOfT);

	/**
	 * オブジェクトをJSON文字列へ変換して返します。
	 * @param src 変換元のオブジェクト
	 * @return JSON文字列
	 */
	String toJson(Object src);

}
