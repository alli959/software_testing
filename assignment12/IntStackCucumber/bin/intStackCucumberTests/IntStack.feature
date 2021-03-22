Feature: Basic Integer Stack
  As a programmer, I want a stack for integers 
  so that I can store numbers in a last-in-first-out manner.
  
  Scenario: A new stack is empty
    Given a new stack
    When I check whether it is empty
    Then it should answer yes
    
  Scenario: A new stack is not full
  	Given a new stack
  	When I check whether it is full
  	Then it should answer no
  	
  Scenario:	A new stack push and pop
  	Given a new stack
  	When I push value 5
  	Then the pop value should answer 5
  	
  Scenario: A new stack push 10 times and pop
  	Given a new stack
  	When I push value 5 10 times and check whether it is full then pop
  	Then it should answer yes and 5
  	
  Scenario: A new stack and I want to check on size
  	Given a new stack
  	When I check on the size
  	Then it should answer 0
  	
  Scenario: A stack is not full
  	Given a new stack
  	When I push value 1
  	Then it should answer the value 1
  	
  Scenario: A new stack is not full and I want to push and check size
  	Given a new stack
  	When I push value 1 4 times
  	Then it should answer 4
  	
  	