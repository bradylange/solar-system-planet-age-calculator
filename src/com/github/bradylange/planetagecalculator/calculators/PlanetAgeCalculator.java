/*
 * Developer: Brady Lange
 * Course: CSIS 161 - Programming I
 * Institution: University of Wisconsin-River Falls
 * Class: PlanetAgeCalculator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.planetagecalculator.calculators;

// Import swing library - message box
import javax.swing.JOptionPane;

/**
 * <p>
 * 		Calculates a person's age on the planets in the Solar System such as 
 * 		Mercury, Venus, Jupiter, and Saturn. Contains the {@link #main} method 
 * 		which instantiates and sets up the program.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 10/06/2016
 */
public class PlanetAgeCalculator 
{ 
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up the program.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 10/06/2016
	 */
	public static void main(String[] args) 
	{ 
		// --------------------------------------------------------------------
		// General Variables 
		// --------------------------------------------------------------------
		// Identification name
		String name; 			
		// Output for all planets
		String agePlanetsOutput;									
		
		// --------------------------------------------------------------------
		// Earth Variables 
		// --------------------------------------------------------------------
		// Earth's orbit around Sun
		final int EARTH_ORBIT = 365; 	
		// Earth age
		double earthAge; 		
		// Age on Earth
		double ageOnEarth; 	
		// Age on Earth formatted
		String earthAgeFrm;
		
		// --------------------------------------------------------------------
		// Mercury Variables
		// --------------------------------------------------------------------
		// Mercury's orbit around Sun 
		final int MERCURY_ORBIT = 88; 		
		// Age on Mercury
		double mercuryAge; 	
		// Age on Mercury formatted
		String mercuryAgeFrm;

		// --------------------------------------------------------------------
		// Venus Variables
		// --------------------------------------------------------------------
		// Venus's orbit around Sun 
		final int VENUS_ORBIT = 225; 			
		// Age on Venus
		double venusAge; 
		// Age on Venus formatted
		String venusAgeFrm;
		
		// --------------------------------------------------------------------
		// Jupiter Variables
		// --------------------------------------------------------------------
		// Jupiter's orbit around Sun 
		final int JUPITER_ORBIT = 4380; 			
		// Age on Jupiter
		double jupiterAge; 	
		// Age on Jupiter formatted
		String jupiterAgeFrm;
		
		// --------------------------------------------------------------------
		// Saturn Variables
		// --------------------------------------------------------------------
		// Saturn's orbit around Sun 
		final int SATURN_ORBIT = 10767; 	
		// Age on Saturn
		double saturnAge; 
		// Age on Saturn formatted
		String saturnAgeFrm;
		
		System.out.println("************************************************");
		System.out.println("Age On Solar System Planets Calculator:");
		System.out.println("************************************************");
		// Ask for and retrieve name
		name = JOptionPane.showInputDialog("What is your name? ");	
		// Ask for and retrieve age
		String earthAgeStr = JOptionPane.showInputDialog("What is your age? ");	
		// Convert age from String to Integer
		earthAge = Integer.parseInt(earthAgeStr); 					
		
		// --------------------------------------------------------------------
		// Calculations
		// --------------------------------------------------------------------
		// age on planet = earth age x earth's orbit / planet's orbit
		// --------------------------------------------------------------------
		ageOnEarth = earthAge * EARTH_ORBIT / EARTH_ORBIT;
		mercuryAge = earthAge * EARTH_ORBIT / MERCURY_ORBIT;	
		venusAge = earthAge * EARTH_ORBIT / VENUS_ORBIT;		
		jupiterAge = earthAge * EARTH_ORBIT / JUPITER_ORBIT;
		saturnAge = earthAge * EARTH_ORBIT / SATURN_ORBIT;			
		// Format planet ages to two decimal places
		earthAgeFrm = String.format("%.2f", ageOnEarth);
		mercuryAgeFrm = String.format("%.2f", mercuryAge);
		venusAgeFrm = String.format("%.2f", venusAge);
		jupiterAgeFrm = String.format("%.2f", jupiterAge);
		saturnAgeFrm = String.format("%.2f", saturnAge);
		// Store planet ages output into a String
		agePlanetsOutput = name + ", you are " + earthAgeFrm + " years old on "
		                   + "Earth and much older on Mercury with " 
		                   + mercuryAgeFrm + " years. \nYou are a little bit "
		                   + "older on Venus with " + venusAgeFrm + " years, "
		                   + "but very young on Jupiter with\n" + jupiterAgeFrm 
		                   + " years and even more young on "+ "Saturn with " 
		                   + saturnAgeFrm + " years."; 
		// Display planet ages output with an output dialog box
		JOptionPane.showMessageDialog(null, agePlanetsOutput);								  	
	} 
} 