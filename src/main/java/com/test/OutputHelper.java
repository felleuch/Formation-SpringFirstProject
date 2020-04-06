package com.test;



public class OutputHelper {
	
	
	IOutputGenerator outputGenerator;
	
	//IInputGenerator inputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via constructor
	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}
