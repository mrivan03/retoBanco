Feature: Failed login
	I want a Failed login in The Ninja Store

Scenario: Failed login to the web page 
	Given I want a Failed login
	When Input wrong data
		|Email            |Password|
		|123xxxabcd       |        |
	Then Successful Failed login