package home.thirdweek;

public abstract class MySqlConnection implements DatabaseConnection{
public void executeQuery() {
	System.out.println("Execute the Query");
}
}
