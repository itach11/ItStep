package com.aldebaran.hirarchy;

import com.aldebaran.exception.*;
public  class Person 
{
 void work()
{}


public void validate (int age) throws InvalidAgeException
{
	if(age< 18 ) throw new InvalidAgeException("Grow up !");
	else System.out.println("u good");
}
}
