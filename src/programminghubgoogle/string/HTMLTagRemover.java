package programminghubgoogle.string;

public class HTMLTagRemover {

	public static void main(String[] args) {
		String text = "<p>This tags going to disappear.</p>";
		System.out.println(text);
		
		String textFormater = text.replaceAll("<[^>]++>", "");
		System.out.println("le text formater : " +textFormater);
	}

}
