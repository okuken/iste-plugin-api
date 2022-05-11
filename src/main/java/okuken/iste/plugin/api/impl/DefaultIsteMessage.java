package okuken.iste.plugin.api.impl;

import okuken.iste.plugin.api.IIsteMessage;

/**
 * {@link IIsteMessage}の既定実装クラスです。
 * 
 * @author okuken
 *
 */
public class DefaultIsteMessage implements IIsteMessage {

	private String protocol;
	private Integer port;
	private String host;

	private byte[] request;
	private byte[] response;

	@Override
	public String getProtocol() {
		return protocol;
	}
	@Override
	public Integer getPort() {
		return port;
	}
	@Override
	public String getHost() {
		return host;
	}
	@Override
	public byte[] getRequest() {
		return request;
	}
	@Override
	public byte[] getResponse() {
		return response;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setRequest(byte[] request) {
		this.request = request;
	}
	public void setResponse(byte[] response) {
		this.response = response;
	}

}
