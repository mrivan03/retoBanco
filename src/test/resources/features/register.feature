Feature: Register
	I as a user of The Ninja Store I want to enter a new address in my account

Scenario: Register to the web page 
	Given I want be a user of The Ninja Store
	When Input my register data 
		|First Name|Last Name|Email                 |Telephone |Password|
		|Ivan      |Salazar  |ivansalazar95@live.com|3147987255|abcd1234|
	Then Successful Register