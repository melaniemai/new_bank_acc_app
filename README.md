## Goal: Create an application that can handle new customer bank account requests.

The application will read a .csv file that contains the:

- names
- SSN
- account type
- initial deposit from the customer

The customer's savings and checking account will have various properties such as:

- deposit
- withdrawal
- transfer
- show information

An 11-digit account number will be generated based on:

- 1 or 2 depending on if the account is a savings or checking account
- the last 2 digits of the customer's SSN
- a unique 5-digit number
- random 3-digit number

It should be noted that savings account holders are given a safety deposit box that is identified by a 3-digit number and can be accessed with a 4-digit code.<br>Checking account holders are assigned a debit card that has a 12-digit number and a 4-digit pin.<br>Both accounts use an interface that determines the customer's base rate of interest.

- Savings accounts use .25 point less than base rate
- Checking accounts use 15% of base rate
