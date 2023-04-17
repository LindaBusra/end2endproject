@DatabaseTest @E2ETest
Feature: Database_Feature
  Scenario: TC03_DB_Test
  Given user connects to the database
  When user sends the query to get the names of "created_by" column from "room" table
  Then assert that there are some rooms created by "john_doe"
  And close the connection





  #Database test  -->I need JDBC

  # 1-UI test   2-API test  3-Database test  -->end to end test

  # link for end to end test video : https://lms.techproeducation.com/mod/book/view.php?id=3769&chapterid=16530


