package okuken.iste.plugin.api;

import java.io.OutputStream;
import java.util.List;

/**
 * ISTEを拡張する際の入口となるインタフェースです。
 * {@link IIstePlugin#registerCallbacks(IIstePluginCallbacks)}の引数として渡されます。
 * 
 * @author okuken
 *
 */
public interface IIstePluginCallbacks {

	/**
	 * ISTEプラグインの名称を設定します。
	 * @param name ISTEプラグインの名称
	 */
	void setIstePluginName(String name);

	/**
	 * ISTEプラグイン用のタブを追加します。
	 * @param tab
	 */
	void addIstePluginTab(IIstePluginTab tab);
	/**
	 * 追加済みのISTEプラグイン用タブを除去します。
	 * @param tab
	 */
	void removeIstePluginTab(IIstePluginTab tab);

	/**
	 * URL一覧テーブルのコンテキストメニューに追加するプラグイン独自メニューの、ファクトリークラスを追加します。
	 * 登録されたファクトリーの生成メソッドは、コンテキストメニューが表示される毎に呼び出されます。
	 * @param factory
	 */
	void registerIsteContextMenuFactory(IIsteContextMenuFactory factory);
	/**
	 * 登録済みのURL一覧テーブル用コンテキストメニューファクトリーを除去します。
	 * @param factory
	 */
	void removeIsteContextMenuFactory(IIsteContextMenuFactory factory);

	/**
	 * Repeat履歴テーブルのコンテキストメニューに追加するプラグイン独自メニューの、ファクトリークラスを追加します。
	 * 登録されたファクトリーの生成メソッドは、コンテキストメニューが表示される毎に呼び出されます。
	 * @param factory
	 */
	void registerIsteRepeaterContextMenuFactory(IIsteContextMenuFactory factory);
	/**
	 * 登録済みのRepeat履歴テーブル用コンテキストメニューファクトリーを除去します。
	 * @param factory
	 */
	void removeIsteRepeaterContextMenuFactory(IIsteContextMenuFactory factory);

	/**
	 * URL一覧にレコードを追加します。
	 * @param importMessages
	 */
	void importIsteMessages(List<IIsteImportMessage> importMessages);

	/**
	 * ISTEプラグインのプロジェクトレベルオプションを登録します。
	 * 既に存在する場合は値を上書きします。
	 * @param name オプションのキー
	 * @param value オプションの値
	 */
	void saveIstePluginProjectOption(String name, String value);
	/**
	 * 登録済みのプロジェクトレベルオプションを取得します。
	 * @param name オプションのキー
	 * @return オプションの値。存在しない場合は{@code null}を返します。
	 */
	String loadIstePluginProjectOption(String name);

	/**
	 * ISTEプラグインのユーザレベルオプションを登録します。
	 * 既に存在する場合は値を上書きします。
	 * @param name オプションのキー
	 * @param value オプションの値
	 */
	void saveIstePluginUserOption(String name, String value);
	/**
	 * 登録済みのユーザレベルオプションを取得します。
	 * @param name オプションのキー
	 * @return オプションの値。存在しない場合は{@code null}を返します。
	 */
	String loadIstePluginUserOption(String name);

	/**
	 * ISTE本体の標準出力用ストリームを取得します。
	 * @return 標準出力用ストリーム
	 */
	OutputStream getStdout();
	/**
	 * ISTE本体の標準エラー出力用ストリームを取得します。
	 * @return 標準エラー出力用ストリーム
	 */
	OutputStream getStderr();

	/**
	 * ISTEプラグインの開発に役立つヘルパーを取得します。
	 * @return ヘルパー
	 */
	IIstePluginHelpers getHelpers();

}
