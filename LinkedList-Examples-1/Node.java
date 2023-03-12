package homeWork;
//Düğüm classımızı oluşturduk.
public class Node {
	String data; //Verimizi tanımladık string türünde.
	Node next; // Düğüm türünde sıradaki düğümü göstermesi için değişken tanımladık.

	public Node(String dataParametre){ //Node fonksiyonumuzu içerisine bir data gelecek şekilde tanımladık.
		this.data = dataParametre; // Daha önce tanımladığımız veriye gelen datayı aktarıyoruz.
		this.next = null; // Default olarak ilk datamızın göstereceği sıradaki düğümü null yani boş olarak tanımlıyoruz.
	}
}
