package okuken.iste.plugin.api;

public interface IIsteMessage {

	String getProtocol();
	Integer getPort();
	String getHost();

	byte[] getRequest();
	byte[] getResponse();

}
