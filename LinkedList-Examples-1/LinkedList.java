package homeWork;
public class LinkedList {
	Node root;
//----------------------------------------------------------------------------------------------------------------------------------------\\
	// Ekleme işlemi (insert)
	public LinkedList insert(LinkedList liste, String data) { 
	// Fonksiyonumuz iki parametre almakta, 1.'si LinkedList türünde eklenecek olan listenin adı, 2.'si String türünde eklenecek data.	
		
		// Düğümümüze yeni bir düğüm eklemek istediğimiz zaman gelen veriyi yeni düğümün içine aktarabilmemizi sağlayan yeniDugum değişkenimizi tanımladık.
		Node yeniDugum = new Node(data);
		
			
		// Eğer içerisine ekleme yapmak istediğimiz listede herhangi bir düğüm yok ise eklenen ilk düğümün root düğümü olmasını sağladık.
		if(liste.root == null) {
			liste.root = yeniDugum;
		}
		
		
		// Node düğüm türünde bir iterasyon oluşturuyoruz ve root'un değerlerini atıyoruz. Sonra while döngüsü ile bütün listeyi geziyoruz.
		else {
			Node iter = liste.root;
			while(iter.next != null) {
				iter = iter.next;
			}
			
			//Sondaki next değerimize gelen yenidugum değerimizi atıyoruz ve bu sayede listemizin sonuna ekleme yapmış oluyoruz.
			iter.next = yeniDugum;
			
		}
		
		//En son olarak da geriye Listemizin güncel halini yolluyoruz.
		return liste;
	}
//----------------------------------------------------------------------------------------------------------------------------------------\\	
	// Yazdırma işlemi
	public void print2(LinkedList liste) {
	// Fonksiyonumuz tek parametre almakta o da liste.
		
		// Node düğüm türünde bir iterasyon oluşturuyoruz ve root'un değerlerini atıyoruz. Sonra while döngüsü ile bütün listeyi geziyoruz.
		Node iter = liste.root;
		while(iter != null) {
			
			//Listemizi gezerken bütün dataları ekrana yan yana olacak şekilde yazdırıyoruz.
			System.out.print(iter.data+" ");
			iter = iter.next; // Her işlemin sonunda iterimizi bir sonraki nexte aktarıyoruz ve bu sayede null değerine kadar devam ediyoruz.
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------\\	
	//Silme İşlemi
	public LinkedList delete1(LinkedList liste, int sayac) {
		
		switch(sayac) {
		  case 0:
			  liste.root = liste.root.next;
		    break;
		  case 1:
			  liste.root.next = liste.root.next.next;
		    break;
		  case 2:
			  liste.root.next.next = liste.root.next.next.next;
			    break;
		  case 3:
			  liste.root.next.next.next = liste.root.next.next.next.next;
			    break;
		  case 4:
			  liste.root.next.next.next.next = liste.root.next.next.next.next.next;
			    break;
		  case 5:
			  liste.root.next.next.next.next.next = liste.root.next.next.next.next.next.next;
			    break;
		  case 6:
			  liste.root.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next;
			    break;
		  case 7:
			  liste.root.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next;
			    break;
		  case 8:
			  liste.root.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next;
			    break;
		  case 9:
			  liste.root.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 10:
			  liste.root.next.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 11:
			  liste.root.next.next.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 12:
			  liste.root.next.next.next.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 13:
			  liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 14:
			  liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next.next = liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next;
			    break;
		  case 15:
			  liste.root.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = null;
			    break;
		  default:
		    System.out.println("sea");
		}
		
		
		
		return liste;
	}

//----------------------------------------------------------------------------------------------------------------------------------------\\
	// Eleman sayısı
	public void elemanSayyi(LinkedList liste) {
	// Fonksiyonumuz tek parametre almakta o da liste.
		
		// Node düğüm türünde bir iterasyon oluşturuyoruz ve root'un değerlerini atıyoruz. Sonra while döngüsü ile bütün listeyi geziyoruz.
		Node iter = liste.root;
		int sayac = 0; // Eleman sayısı hesaplayabilmek için oluşturduğumuz sayaç.
		while(iter != null) {
			
			sayac++; // Her elemandan sonra sayacı 1 arttırıyoruz.
			iter = iter.next; // Her işlemin sonunda iterimizi bir sonraki nexte aktarıyoruz ve bu sayede null değerine kadar devam ediyoruz.
		}
		System.out.println(sayac); // Döngümüz bittikten sonra eleman sayımızı ekrana basıyoruz.
	}
//----------------------------------------------------------------------------------------------------------------------------------------\\
	//Tersine çevirme
	public void tersten(LinkedList liste) {

		Node iter = liste.root;
		Node temp = null;
		Node last = null;
		
		while(iter != null) {
			
			temp = iter.next;
			iter.next = last;
			last = iter;
			iter = temp;
		}
		liste.root = last;
	}
//----------------------------------------------------------------------------------------------------------------------------------------\\
	// Arama
	public void arama(LinkedList liste,String data) {

		Node iter = liste.root;
		int sayac = 0;
		int sıra = 1;
		while(iter != null) {
			if(iter.data.equals(data)) {
				System.out.println("\nAradığınız veri listenin içerisinde ("+sıra+"). sırada ve ["+sayac+"] indisine sahip.");
			}
			sıra++;
			sayac++;
			iter = iter.next;
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------\\
}
