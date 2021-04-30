package okuken.iste.plugin.api;

public interface IIsteMessageNotes {

	static final Integer PROGRESS_NEW = 0;
	static final Integer PROGRESS_WORK = 1;
	static final Integer PROGRESS_HOLD = 5;
	static final Integer PROGRESS_ABORT = 8;
	static final Integer PROGRESS_DONE = 9;


	String getName();
	String getRemark();
	String getPriority();

	Integer getProgress();
	String getProgressNotes();

	String getNotes();

}
