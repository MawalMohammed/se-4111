public class Singleton {
	
private static Singleton uniqueInstance;
// other useful instance variables here

private Singleton() {
	
}


private int temp;


public static Singleton getInstance() {
	if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
	}

	return uniqueInstance;
}
// other useful methods here

/* 
 * this function to set port number
 * @param port number
 *
 * 
 */
public void setConfig1(int con) {
	assert con>0;
	temp=con;
}

public int getConfig1() {
	
	return temp;
}

}




