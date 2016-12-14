Can See Price After Login
Narrative:
In order to informed about the monthly price
As an software tester
I want to see the price after login

Scenario: Login successfull at usertesting website
Given the user is on the Login page
When the user logs in with username 'droidzig+usertesting@gmail.com' and password 'aA123456'
Then they should see the dashboard

Scenario: Can see the price '$49/video'
Given the user is logged in
When the user is on the Dashboard page
Then they should see the price '$49/video'