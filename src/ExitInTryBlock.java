
public class ExitInTryBlock {

	public static void main(String[] args) {
		try {
			System.out.println("In try");
			System.exit(1);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			System.out.println("Finally");
		}
	}
}
