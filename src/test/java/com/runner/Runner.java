package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Yadav\\eclipse-workspace\\CucummberProject\\src\\test\\resources\\Features",glue={"com.stepDefinations"},
monochrome = true,
plugin= {"html:Reports\\HTMLReports", "json:Reports\\jsonReports\\cucumber.json","junit:Reports\\JUnitReport\\cucumber.xml"})
public class Runner {

}
