package okuken.iste.plugin.api;

/**
 * URL一覧レコードのメモ情報のインタフェースです。
 * 
 * @author okuken
 *
 */
public interface IIsteMessageNotes {

	/**
	 * 進捗：新規
	 */
	static final Integer PROGRESS_NEW = 0;
	/**
	 * 進捗：作業中
	 */
	static final Integer PROGRESS_WORK = 1;
	/**
	 * 進捗：保留
	 */
	static final Integer PROGRESS_HOLD = 5;
	/**
	 * 進捗：破棄
	 */
	static final Integer PROGRESS_ABORT = 8;
	/**
	 * 進捗：完了
	 */
	static final Integer PROGRESS_DONE = 9;


	/**
	 * 名称を取得します。
	 * @return 名称
	 */
	String getName();
	/**
	 * 備考を取得します。
	 * @return 備考
	 */
	String getRemark();
	/**
	 * 優先度を取得します。
	 * @return 優先度
	 */
	String getPriority();

	/**
	 * 進捗を取得します。
	 * @return 進捗
	 */
	Integer getProgress();
	/**
	 * 進捗メモを取得します。
	 * @return 進捗メモ
	 */
	String getProgressNotes();

	/**
	 * メモを取得します。
	 * @return メモ
	 */
	String getNotes();

}
