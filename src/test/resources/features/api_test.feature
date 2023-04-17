@ApiTest @E2ETest
Feature:Api_Feature
  Scenario:TC02_Get_Request
    Given user sends GET request to the "https://restful-booker.herokuapp.com/booking/10"
    Then HTTP Status Code should be 200


    #API test

    # 1-UI test   2-API test  3-Database test  -->end to end test


