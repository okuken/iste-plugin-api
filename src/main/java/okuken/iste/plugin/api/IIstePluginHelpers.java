package okuken.iste.plugin.api;

public interface IIstePluginHelpers {

	<T> T fromJson(String json, Class<T> classOfT);
	String toJson(Object src);

}
