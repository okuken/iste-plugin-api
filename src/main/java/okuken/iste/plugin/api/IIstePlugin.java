package okuken.iste.plugin.api;

public interface IIstePlugin {
	void registerCallbacks(IIstePluginCallbacks callbacks);
	default void projectChanged() {};
	default void unloaded() {};
}
