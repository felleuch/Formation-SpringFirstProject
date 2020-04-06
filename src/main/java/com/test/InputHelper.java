package com.test;



public class InputHelper {
	
	
	
	
	IInputGenerator inputGenerator;

	public void generateInput() {
		inputGenerator.generateInput();
	}

	//DI via constructor
	public InputHelper(IInputGenerator inputGenerator){
		this.inputGenerator = inputGenerator;
	}
	
}
