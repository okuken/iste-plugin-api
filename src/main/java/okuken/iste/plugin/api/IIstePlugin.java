package okuken.iste.plugin.api;

/**
 * ISTEプラグインのメインインタフェースです。
 * ISTEプラグインクラスは必ず本インタフェースを実装し、完全修飾名を iste.IstePlugin とする必要があります。
 * 
 * @author okuken
 *
 */
public interface IIstePlugin {

	/**
	 * ISTEプラグインのロード時に呼び出されるメソッドです。
	 * 引数の callbacks を用いて、ISTEプラグインによる拡張機能をISTEに登録します。
	 * @param callbacks
	 */
	void registerCallbacks(IIstePluginCallbacks callbacks);

	/**
	 * ISTEプロジェクトの選択が変更された際に呼び出されるメソッドです。
	 * プロジェクト依存データの再読み込み処理などを実装します。
	 */
	default void projectChanged() {};

	/**
	 * ISTEプラグインのアンロード時に呼び出されるメソッドです。
	 * リソース解放処理などを実装します。
	 */
	default void unloaded() {};

}
