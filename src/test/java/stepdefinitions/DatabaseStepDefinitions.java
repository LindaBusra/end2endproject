package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;
import utilities.JdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DatabaseStepDefinitions {

    Connection connection;
    Statement statement;
    List<Object> createdByList;

    @Given("user connects to the database")
    public void user_connects_to_the_database() throws ClassNotFoundException, SQLException {

//        Class.forName("org.postgresql.Driver");
//        connection = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");
//        statement = connection.createStatement();

        JdbcUtils.connectToDatabase("medunna.com", "medunna_db", "medunna_user","medunna_pass_987");
        JdbcUtils.createStatement();
    }


    @When("user sends the query to get the names of {string} column from {string} table")
    public void user_sends_the_query_to_get_the_names_of_column_from_table(String column, String table) {

        createdByList = JdbcUtils.getColumnList(column, table);
//        System.out.println("createdByList : " + createdByList);

    }


    @Then("assert that there are some rooms created by {string}")
    public void assert_that_there_are_some_rooms_created_by(String name) throws SQLException {

      assertTrue(createdByList.contains(name));
    }


    @Then("close the connection")
    public void close_the_connection() {
        JdbcUtils.closeConnectionAndStatement();

    }



}
