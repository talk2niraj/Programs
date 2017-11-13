import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MySingleton implements Serializable {

	private static MySingleton mySingleton = null;
	
	private MySingleton() {}
	
	public static MySingleton getInstance() {
		
		if (mySingleton == null) {
			synchronized(MySingletonTest.class) {
				if (mySingleton == null) {
					mySingleton = new MySingleton();
				}
			}
		}
		return mySingleton;
	}
	
	
	public Object readResolve() {
		return getInstance();
		
	}
}

public class MySingletonTest{
	public static void main(String[] args) {
		MySingleton mySingleton = MySingleton.getInstance();
		System.out.println(mySingleton.hashCode());
		
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		
		try {
			fos = new FileOutputStream("c://users/nirkumar/test.ser");
			os = new ObjectOutputStream(fos);
			os.writeObject(mySingleton);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				os.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		MySingleton mySingleton1 = null;
		ObjectInputStream is = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c://users/nirkumar/test.ser");
			is = new ObjectInputStream(fis);
			mySingleton1 = (MySingleton)is.readObject();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				is.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(mySingleton1.hashCode());
		
		
	
		
	}
}
