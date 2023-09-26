Feature:
user order the bus ticket to place get order id

Scenario:
user click the search button for bus booking

Given user should be in official page of makemytrip
When user click the bus icon 
And user fill the from and to details
And user pass the date for departure and return
Then user click the search button for bus details

Scenario:
to user check new buses available or not

Given user click the newbusSearch button
When user click date of departure
And user choose decsixth for departure
And user again click searcch button for available check
Then will see the NoBusFound image take screen shot










