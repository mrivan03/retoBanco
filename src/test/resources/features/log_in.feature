Feature: Log in 
	I as a user of The Ninja Store I want to enter in my account

Scenario: log in to the web page 
	Given I am a user of The Ninja Store 
	When Input my login data 
		|Email            |Password|
		|usertest@test.com|usertest|
	Then Successful login