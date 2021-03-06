package com.bryanreinero.hum.element;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.bryanreinero.hum.server.HumException;
import com.bryanreinero.hum.visitor.*;
import com.bryanreinero.hum.element.http.*;

public class Specification extends HumElement implements Visitable {

	private ObjectId id;
	private String name;
	private int client;
	private int timeToLive;
	private String type;
	
	private List<Visitable> children = new ArrayList<Visitable>();
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public int getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(int timeToLive) {
		this.timeToLive = timeToLive;
	}

	public List<Visitable> getChildren() {
		return children;
	}

	public void setChildren( List<Visitable> children) {
		this.children = children;
	}

	@Override
	public void addParent(HumElement element) throws IllegalArgumentException {
		element.addChild(this);
	}

	@Override
	public void accept( Visitor visitor) throws HumException {
		visitor.visit(this);
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void addChild(If element){
		children.add(element);
	}
	
	@Override
	public void addChild(Redirect element){
		children.add(element);
	}
	
	@Override
	public void addChild(ResponseBody element){
		children.add(element);
	}
	
	@Override
	public void addChild(ResponseCode element){
		children.add(element);
	}
	
	@Override
	public void addChild(ResponseHeader element){
		children.add(element);
	}
	
	@Override
	public void addChild(SetCookie element){
		children.add(element);
	}
	
	@Override
	public void addChild(SetVariable element){
		children.add(element);
	}
	
	@Override
	public void addChild(Block element){
		children.add(element);
	}
	
	@Override
	public void addChild(SubTree element){
		children.add(element);
	}
	
	@Override
	public void addChild(RegularExpression element){
		children.add(element);
	}
}
