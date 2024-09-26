package com.techlabs.behavioural.state.model;

public interface IPacketState {
	
	void current(Packet packet);
	void previous(Packet packet);
	void next(Packet packet);
}
