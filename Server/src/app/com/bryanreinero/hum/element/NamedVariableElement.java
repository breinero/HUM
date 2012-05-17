package com.bryanreinero.hum.element;
import com.google.code.morphia.annotations.Embedded;

@Embedded
public abstract class NamedVariableElement extends HumElement {

	private Name name;
	
	public Name getName() {
		return name;
	}

	public Value getValue() {
		return value;
	}

	private Value value;
	
	@Override
	public void addChild(Name element){
		this.name = element;
	}

	@Override
	public void addChild(Value element){
		this.value = element;
	}
}
