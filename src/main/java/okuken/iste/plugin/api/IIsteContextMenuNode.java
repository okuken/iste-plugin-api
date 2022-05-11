package okuken.iste.plugin.api;

/**
 * コンテキストメニューノードのインタフェースです。
 * コンテキストメニューを構成する際は、本インタフェースのサブインタフェースの実装クラスを用います。
 * 
 * @author okuken
 *
 */
public interface IIsteContextMenuNode {

	/**
	 * コンテキストメニューノードのキャプションを取得します。
	 * @return キャプション
	 */
	String getCaption();

}
