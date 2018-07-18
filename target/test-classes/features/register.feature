Feature: Register 
	I as a user of The Ninja Store I want to enter a new address in my account

Scenario: Register to the web page 
	Given I want be a user of The Ninja Store 
	When Input my register data 
		|First Name|Last Name|Email            |Telephone |Password|
		|User      |Test     |usertest@test.com|3210987654|usertest|
	Then Successful Register