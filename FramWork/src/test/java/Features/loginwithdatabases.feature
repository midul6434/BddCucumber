Feature: databases
@databases
Scenario: Login with invalid credentials
Given  User is in login page
     #When   Enter invalid email and password
When   Enter invalid email and password from Data_Table
| userName          | password |
| tlover781@gmail.com| 84969o4 |
| myname@gmail.com | 768368  |

Then   Error message appear