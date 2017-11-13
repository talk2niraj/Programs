
public class TryCatchInsideFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Test");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {

			} catch (Exception e) {

			}
		}
	}
}
