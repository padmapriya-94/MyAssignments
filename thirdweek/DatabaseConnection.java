package home.thirdweek;

public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();

}
