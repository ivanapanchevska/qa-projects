# Automation Testing

# Selenium Automation tests

* [Selenium Automation tests](https://github.com/ivanapanchevska/qa-projects/tree/master/Automation%20Testing/README.md)

## Selenium
Selenium tests are automated scripts which helps Software development process to automate Testing phase.
Selenium tests are written in Java programming language, with combination with Selenium testing framework

Main job for selenium is to simplify selecting of Html tags and perform actions where needed.
Most used selectors in Selenium are:
```
    By.cssSelector
    By.xpath
    By.id
```

## TestNG
Test NG is framework that verify results in automation Selenium tests.
For those purpose to validate result, we are using Assertsions like Assert and SoftAssertion.
To organize tests TestNG provide script configuration, and also annotations to setup properly each test case, like
```
    @Before Class
    @After Class
    @Before Method
    @After Method
``` 


# Postman Automation tests for API 
* [Postman Automation tests](https://github.com/ivanapanchevska/qa-projects/tree/master/Automation%20Testing/Postman%20Automation%20tests) 

Postman is incredible tool that help QA engineers to maintain automation tests that will fulfill API integration. Postman uses Javascript language for writing Test cases.

Here is short list of used postman tests examples 

```
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("number of users per page=six", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.per_page).to.eql(6);
});

pm.test("Check name for ID=5", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[4].first_name).to.eql("Charles");
});

pm.test("Response time is less than 200ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(200);
});

pm.test("Status code name has string", function () {
    pm.response.to.have.status("OK");
});
```
