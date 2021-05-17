package okuken.iste.plugin.api;

import java.io.OutputStream;
import java.util.List;

public interface IIstePluginCallbacks {

	void setIstePluginName(String name);

	void addIstePluginTab(IIstePluginTab tab);
	void removeIstePluginTab(IIstePluginTab tab);

	void registerIsteContextMenuFactory(IIsteContextMenuFactory factory);
	void removeIsteContextMenuFactory(IIsteContextMenuFactory factory);

	void registerIsteRepeaterContextMenuFactory(IIsteContextMenuFactory factory);
	void removeIsteRepeaterContextMenuFactory(IIsteContextMenuFactory factory);

	void importIsteMessages(List<IIsteImportMessage> importMessages);

	void saveIstePluginProjectOption(String name, String value);
	String loadIstePluginProjectOption(String name);

	void saveIstePluginUserOption(String name, String value);
	String loadIstePluginUserOption(String name);

	OutputStream getStdout();
	OutputStream getStderr();

	IIstePluginHelpers getHelpers();

}
