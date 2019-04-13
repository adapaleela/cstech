Feature: CS_Tech website
Scenario: CS_Tech searching a job 
Given launch site
When click on menu icon
And click on careers
And click on current openings
And enter skills and designation
And enter location
And enter experience
And click on search button
Then validate list of jobs are available or not
When close site