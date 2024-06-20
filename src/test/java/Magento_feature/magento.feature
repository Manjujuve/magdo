Feature: login to Magento

Scenario: use valid credentials

Given launch the url and maximizing
When click signin button
And enter valid email id
Then enter valid password
Then click sigin button
And click womens tab
Then click Tops button
Then click hoodies and sweatshits tab
Then select the required model
Then select the required size
And select the required color
Then enter the required quantity 
