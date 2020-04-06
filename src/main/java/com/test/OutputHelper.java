package com.test;



public class OutputHelper {
	
	
	IOutputGenerator outputGenerator;
	
	IInputGenerator inputGenerator;
	
	
	public void initIt() throws Exception{
		System.out.println("Init method ");
	}
	
	public void cleanUp() throws Exception{
		System.out.println("Spring context detruit !");
	}
	

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via constructor
	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}
