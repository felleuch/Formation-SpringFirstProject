package com.test;

public class OutputHelperSetter {
	
	
	IOutputGenerator outputGenerator;

	//INputGenerator inputGenerator;
	
	
	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via setter method
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
