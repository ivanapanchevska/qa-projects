# Automation Testing

# Postman Automation tests for API 
* [Postman Automation tests](https://github.com/ivanapanchevska/qa-projects/tree/master/Automation%20Testing/Postman%20Automation%20tests) 

Postman is incredible tool that help QA engineers to maintain automation tests that will fulfill API integration. Postman uses Javascript language for writing Test cases.

Here is short list of used examples
```
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("check if page number is one", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.page).to.eql(1);
});

pm.test("number of users per page=six", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.per_page).to.eql(6);
});

pm.test("total number of users=12", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.total).to.eql(12);
});

pm.test("total number of users !=13", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.total).not.eql(13);
});

pm.test("number of total pages=2", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.total_pages).to.eql(2);
});

pm.test("number of total pages !=3", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.total_pages).not.eql(3);
}); 

pm.test("first user on page one has ID=1", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].id).to.eql(1);
});

pm.test("last user on page one has ID=6", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[5].id).to.eql(6);
});

pm.test("last user on page one has ID !=7", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[5].id).not.eql(7);
});

pm.test("check name for ID=1", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].first_name).to.eql("George");
});

pm.test("George's ID=1", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].id).to.eql(1);
});

pm.test(" Check George's email", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].email).to.eql("george.bluth@reqres.in");
});
  
pm.test("Check George's last name", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].last_name).to.eql("Bluth");
});
    
pm.test("Check George's avatar", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[0].avatar).to.eql("https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
});

pm.test(" Check Janet's email", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[1].email).to.eql("janet.weaver@reqres.in");
});

pm.test("Check if Emma's last name !=Weaver", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[2].last_name).not.eql("Weaver");
});

pm.test("Check if Eve's ID=4", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[3].id).to.eql(4);
});

pm.test("Check name for ID=5", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[4].first_name).to.eql("Charles");
});

pm.test("Check Tracey's last name", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data[5].last_name).to.eql("Ramos");
});

pm.test("Response time is less than 200ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(200);
});

pm.test("Status code name has string", function () {
    pm.response.to.have.status("OK");
});
```


* [Selenium Automation tests](https://github.com/ivanapanchevska/qa-projects/tree/master/Automation%20Testing/README.md)



