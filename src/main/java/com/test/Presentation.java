package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[] {"spring-ioc.xml"});
		
		/*   exemple d appel */
		IMetier metier =(IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
		
		/*  injection par constructeur  */
		
		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
        
        InputHelper input = (InputHelper)context.getBean("InputHelper");
        input.generateInput();
		
        /*  injection par setter  */
        
        OutputHelperSetter outputSetter = (OutputHelperSetter)context.getBean("OutputHelperSetter");
        outputSetter.generateOutput();
        

	}

}
