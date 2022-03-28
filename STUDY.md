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
Fix - Refactor depositAmount to check if it's the first deposit or if we want to award every deposit set a minimum deposit to earn award.

