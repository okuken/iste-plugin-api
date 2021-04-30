package okuken.iste.plugin.api;

public interface IIsteMessageAnalyzedInfo {

	String getUrl();
	String getUrlWithoutQuery();

	String getMethod();
	String getPath();
	String getQuery();
	Integer getParamCount();

	Short getStatus();
	Integer getLength();
	String getMimeType();
	String getCookies();

}
