# Lab assignment - A short exercise to explore Object-Oriented Programming

---

## Encapsulation

### Study prompts:

The `main` method on the `Main` class instantiates new instances of the DodgyBankAccount and SecureBankAccount classes.  
It also calls several methods on each instance from their relative classes.

#### Problems with the design of DodgyBankAccount class:

1. Class fields are public so:
    1. account balance is not a final and can be set from outside the class.
    2. reward amount is not a final and can be set from outside the class.
    3. account number is not a final and can be set from outside the class.

2. Add reward method is public and can be called from outside the class.

#### Design differences of SecureBankAccount class:

1. Class fields are private so:
    1. account balance is a final and cannot be set from outside the class.
    2. reward amount is a final and cannot be set from outside the class.
    3. account number is a final and cannot be set from outside the class.

2. Add reward method is private and cannot be called from outside the class.

3. displayAccountBalance is a more descriptive method name.

## Problem with SecureBankAccount class:

It's possible to deposit an amount of 0 and earn a 50 reward each time you call mySecureBankAccount.depositAmount(0).  
Suggested fix - Refactor depositAmount to check if it's the first deposit or if we want to award every deposit set a minimum deposit to earn award.  

---
## Extension Challenge

### Refactored:  
1. Abstracted conversion to fahrenheit into its own method.  
2. Changed string value comparisons from == to equals().  
3. Changed if statement of checkLocation() to switch statement.  
4. Renamed check1() method to checkLocation().  
5. Renamed check2() method to checkTemperature.
6. Removed braces from if/elseif statements in checkTemperature().  
7. Renamed print() to printMessage().  
8. Made class fields finals.  

### Considerations:
1. I considered using finals for the hard coded numbers, I came to the conclusion that they don't repeat, and to be honest I didn't know what to call them.  

### Unit Tests:
I've written four unit tests to test for the correct messages.
I'll add more at a later date 🤓

