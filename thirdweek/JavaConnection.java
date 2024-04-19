package home.thirdweek;

public class JavaConnection extends MySqlConnection{

	public void connect() {
		System.out.println("Connect to the Database");
		
	}

	public void disconnect() {
		System.out.println("Disconnect from the database");
		
	}

	public void executeUpdate() {
		System.out.println("Execute the update");
		
	}
	public static void main(String[] args) {
		
	JavaConnection jc=new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
	jc.executeQuery();
	}
}
