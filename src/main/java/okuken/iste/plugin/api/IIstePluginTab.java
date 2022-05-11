package okuken.iste.plugin.api;

import java.awt.Component;

/**
 * ISTEプラグイン用タブのインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIstePluginTab {

	/**
	 * タブのキャプションを取得します。
	 * @return キャプション
	 */
	String getTabCaption();

	/**
	 * タブのUIコンポーネントを取得します。
	 * @return コンポーネント
	 */
	Component getUiComponent();

}
