Feature: Login into Application

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://www.qaclickacademy.com/" Site
    And Click on Login link in home page to land on secure sing in page
    When User enters <username> and <password> and logs in

    And Close Browsers

    Examples:


      |username         |password   |
      |test99@gmail.com |123456     |
      #|teasd9@gmail.com |123456     |