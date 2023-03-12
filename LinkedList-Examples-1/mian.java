package homeWork;
import java.util.Scanner; // input alabilmek için gerekli kütüphane
public class main {
	public static void main(String[] args) {
		// Kullanıcıdan sürekli veri bekleyebilmek için bu döngü devam edecek.
		while(true) {
			//Scanner kütüphanesi aracılığı ile kullanıcıdan input alacağız.
			Scanner dataInput = new Scanner(System.in);
			// Kullanıcıya print ile serial ekrandan soruyoruz.
			System.out.println("İyi Günler, Lütfen yapmak istediğiniz işlemi ekrana a,b,c,d,e şeklinde yazınız.\n------------------------------------------");
			System.out.println("a-) Dışarıdan alınan veriyi listeye ekleyin.");
			System.out.println("b-) Listeden index değerine göre silme işlemi yapın.");
			System.out.println("c-) Listenin eleman sayısını döndürün.");
			System.out.println("d-) Listeyi tersten yazdırın.");
			System.out.println("e-) Dışarıdan alınan veriyi liste içerisinde arayın, sonuç olarak aranan veri listede \nx.sırasındadır diyerek indix değerini döndürün.");
			System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.");
			String userData = dataInput.next();// gelen a,b,c,d,e verisini değişkene atıyoruz.
			
//*** A şıkkı
			LinkedList list1 = new LinkedList(); // A şıkkı için ekleme yapabilmek adına bir liste tanımlıyoruz.
			list1 = list1.insert(list1, "ahmet");list1 = list1.insert(list1, "mehmet");list1 = list1.insert(list1, "2");
			//Eğer gelen veri a veya A ise o şıktaki işleme yönlendiriyoruz.
			if(userData.equals("a")||userData.equals("A")) {
				//Burada döngü kurup kullanıcı çıkış yapmak istemediği sürece işlemlerin sonlanması engelliyoruz.
				System.out.print("Şu an ki güncel listemiz : ");
				list1.print2(list1);
				System.out.println("\n------------------------------------------\nLütfen listeye eklemek istediğiniz eleman sayısını giriniz.");
				int elemanSayisi = dataInput.nextInt();
				for(int i = 0;i<elemanSayisi;i++) {
					//Dışarıdan bir veri isteyeceğiz ve bunu listeye ekleyeceğiz.
					System.out.println("Lütfen eklemek istediğiniz veriyi giriniz.");
					String userDataA1 = dataInput.next();
					System.out.print("Şu an ki güncel listemiz : ");
					list1 = list1.insert(list1, userDataA1);
					list1.print2(list1);
					System.out.println(" ");
				}
				System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.\nDevam etmek için lütfen 'menü' yazıp enter'a basınız.");
				String userDataA2 = dataInput.next();
				if(userDataA2.equals("bitir")== true||userDataA2.equals("Bitir")== true) {break;}
			}
//*** B şıkkı
			LinkedList list2 = new LinkedList(); // A şıkkının hazır listesi -1-
			LinkedList list3 = new LinkedList(); // A şıkkının hazır listesi -2-
			LinkedList list4 = new LinkedList(); // A şıkkının hazır listesi -3-
			LinkedList list5 = new LinkedList(); // B şıkkının B şıkkı için ekleme yapabilmek adına bir liste tanımlıyoruz.
			
			list2 = list2.insert(list2, "0");list2 = list2.insert(list2, "8");list2 = list2.insert(list2, "7");list2 = list2.insert(list2, "3");
			list3 = list3.insert(list3, "15");list3 = list3.insert(list3, "18");list3 = list3.insert(list3, "4");list3 = list3.insert(list3, "13");
			list4 = list4.insert(list4, "22");list4 = list4.insert(list4, "13");list4 = list4.insert(list4, "32");list4 = list4.insert(list4, "1");
			
			//Eğer gelen veri b veya B ise o şıktaki işleme yönlendiriyoruz.
			if(userData.equals("b")||userData.equals("B")) {				
				while(true) {
					//Listeden index değerine göre silme.
					System.out.println("Hazır listemizi mi yoksa kendi oluşturacağınız listeyi mi istersiniz  ?");
					System.out.println("A-)Hazır liste lütfen \nB-)Kendim oluşturacağım.");
					System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.");
					String userDataB1 = dataInput.next();
					if(userDataB1.equals("bitir")== true||userDataB1.equals("Bitir")== true) {break;}
	// A seçeneği seçilirse ..
					if(userDataB1.equals("A")||userDataB1.equals("a")) {
						System.out.println("Hazır listelerimizden hangisini seçmek istersiniz ?");
						System.out.print("a = "); list2.print2(list2);System.out.println(" ");
						System.out.print("b = "); list3.print2(list3);System.out.println(" ");
						System.out.print("c = "); list4.print2(list4);System.out.println(" ");
						System.out.println("------------------------------------------\nMenüye dönmek için \'menü\' yazınız.");
						String userDataB11 = dataInput.next();
						if(userDataB11.equals("bitir")== true||userDataB11.equals("Bitir")== true) {break;}
		//A içerisindeki a seçilirse
						if(userDataB11.equals("a")) {
							list2.print2(list2);
							System.out.println("Hangi indexe sahip elemanı silmek istersiniz ?");
							int userDataB1111 = dataInput.nextInt();
							//Silme işlemi
							list2.delete1(list2,userDataB1111);
							list2.print2(list2);
							System.out.println("\n-------------Silme işlemi başarılı.\nDevam etmek için menü yazıp enter'a basınız...");
							System.out.println("Eğer çıkmak isterseniz 'Bitir' yazıp enter tuşuna basınız.");
							String userDataB1112 = dataInput.next();
							if(userDataB1112.equals("bitir")== true||userDataB1112.equals("Bitir")== true) {break;}
						}
		//A içerisindeki b seçilirse
						if(userDataB11.equals("b")) {
							list3.print2(list3);
							System.out.println("Hangi indexe sahip elemanı silmek istersiniz ?");
							int userDataB1121 = dataInput.nextInt();
							//Silme işlemi
							list2.delete1(list3,userDataB1121);
							list3.print2(list3);
							System.out.println("\n-------------Silme işlemi başarılı.\nDevam etmek için menü yazıp enter'a basınız...");
							System.out.println("Eğer çıkmak isterseniz 'Bitir' yazıp enter tuşuna basınız.");
							String userDataB1122 = dataInput.next();
							if(userDataB1122.equals("bitir")== true||userDataB1122.equals("Bitir")== true) {break;}
						}
		//A içerisindeki c seçilirse
						if(userDataB11.equals("c")) {
							list4.print2(list4);
							System.out.println("Hangi indexe sahip elemanı silmek istersiniz ?");
							int userDataB1131 = dataInput.nextInt();
							//Silme işlemi
							list4.delete1(list4,userDataB1131);
							list4.print2(list4);
							System.out.println("\n-------------Silme işlemi başarılı.\nDevam etmek için menü yazıp enter'a basınız...");
							System.out.println("Eğer çıkmak isterseniz 'Bitir' yazıp enter tuşuna basınız.");
							String userDataB1132 = dataInput.next();
							if(userDataB1132.equals("bitir")== true||userDataB1132.equals("Bitir")== true) {break;}
						}
					}
	// B seçeneği seçilirse ..
					if(userDataB1.equals("B")||userDataB1.equals("b")) {
						System.out.println("Lütfen oluşturacağınız listenin eleman sayısını giriniz.");
						int elemanSayisi = dataInput.nextInt();
						for(int i = 0;i<elemanSayisi;i++) {
							//Dışarıdan bir veri isteyeceğiz ve bunu listeye ekleyeceğiz.
							System.out.println("Lütfen eklemek istediğiniz veriyi giriniz.");
							String userDataB11 = dataInput.next();
							list5 = list5.insert(list5, userDataB11);
						}
						
						System.out.print("liste : ");
						list5.print2(list5);
						System.out.println("\nHangi indexe sahip elemanı silmek istersiniz ?");
						int userDataB33 = dataInput.nextInt();
						//Silme işlemi
						list5.delete1(list5,userDataB33);
						list5.print2(list5);
						System.out.println("\n-------------Silme işlemi başarılı.\nÇıkış yapmak için \'bitir\' yazınız. \nDevam etmek için lütfen 'menü' yazıp enter'a basınız.");
						String userDataB2 = dataInput.next();
						if(userDataB2.equals("bitir")== true||userDataB2.equals("Bitir")== true) {break;}
					}
				}
			}
//*** C şıkkı
			LinkedList list7 = new LinkedList(); // C şıkkı A bölümü hazır listesi -1-
			LinkedList list8 = new LinkedList(); // C şıkkı A bölümü hazır listesi -2-
			LinkedList list9 = new LinkedList(); // C şıkkı A bölümü hazır listesi -3-
			LinkedList list10 = new LinkedList(); // C şıkkı B bölümü
			
			list7 = list7.insert(list7, "a");list7 = list7.insert(list7, "meh");list7 = list7.insert(list7, "ali");list7 = list7.insert(list7, "saat");list7 = list7.insert(list7, "akrepçik");list7 = list7.insert(list7, "denemee");list7 = list7.insert(list7, "ucdort");
			list8 = list8.insert(list8, "hm");list8 = list8.insert(list8, "me");list8 = list8.insert(list8, "veliabdulrezzak");
			list9 = list9.insert(list9, "et");list9 = list9.insert(list9, "tt");list9 = list9.insert(list9, "ay5e");list9 = list9.insert(list9, "asfwkeafd");list9 = list9.insert(list9, "sfaf2123fsa");list9 = list9.insert(list9, "biriki");list9 = list9.insert(list9, "beşaltı");list9 = list9.insert(list9, "yedisekşzzz");list9 = list9.insert(list9, "911dokuzyüz");list9 = list9.insert(list9, "11onbir");list9 = list9.insert(list9, "aloacilyardımm");list9 = list9.insert(list9, "başımaa düştü moloz");list9 = list9.insert(list9, "gelinnnn");list9 = list9.insert(list9, "lütfennn");
			
			//Eğer gelen veri c veya C ise o şıktaki işleme yönlendiriyoruz.
			if(userData.equals("c")||userData.equals("C")) {
				while(true) {
					//Listenin eleman sayısını döndürme.
					System.out.println("Yeni bir liste mi oluşturmak istersiniz veya hazır listemizi mi istersiniz ?");
					System.out.println("A-)Hazır liste lütfen \nB-)Kendim oluşturacağım.");
					System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.");
					String userDataC = dataInput.next();
					if(userDataC.equals("bitir")== true||userDataC.equals("Bitir")== true) {break;}
	// A seçeneği seçilirse ..
					if(userDataC.equals("A")||userDataC.equals("a")) {
						System.out.println("Hazır listelerimizden hangisini seçmek istersiniz ?");
						System.out.print("a = "); list7.print2(list7);System.out.println(" ");
						System.out.print("b = "); list8.print2(list8);System.out.println(" ");
						System.out.print("c = "); list9.print2(list9);System.out.println(" ");
						System.out.println("------------------------------------------\nMenüye dönmek için \'menü\' yazınız.");
						String userDataC1 = dataInput.next();
						if(userDataC1.equals("bitir")== true||userDataC1.equals("Bitir")== true) {break;}
		//A içerisindeki a seçilirse
						if(userDataC1.equals("a")) {
							System.out.print("Listemizin eleman sayısı :");
							list7.elemanSayyi(list7);
							System.out.println("******************************************");
						}
		//A içerisindeki b seçilirse
						if(userDataC1.equals("b")) {
							System.out.print("Listemizin eleman sayısı : ");
							list8.elemanSayyi(list8);
							System.out.println("******************************************");
						}
		//A içerisindeki c seçilirse
						if(userDataC1.equals("c")) {
							System.out.print("Listemizin eleman sayısı : ");
							list9.elemanSayyi(list9);
							System.out.println("******************************************");
						}
					}
	// B seçeneği seçilirse ..
					if(userDataC.equals("B")||userDataC.equals("b")) {
						System.out.println("******************************************");
						System.out.println("Veri girişiniz bitince lütfen \"bitti\" yazıp enter'a basınız.\nLütfen her veriden sonra enter'a basınız.");
						System.out.println("******************************************");
						while(true) {
							String userDataC2 = dataInput.next();
							//Gelen veriyi listeye ekleyecek.
							if(userDataC2.equals("bitti")== true||userDataC2.equals("Bitti")== true) {break;}
							System.out.print("Şu an ki güncel listemiz : ");
							list10 = list10.insert(list10, userDataC2);
							list10.print2(list10);
							System.out.println(" ");
						}
						System.out.print("Listemizin eleman sayısı : ");
						list10.elemanSayyi(list10);
						System.out.println("******************************************");
					}
				}
			}
//*** D şıkkı
			
			LinkedList list11 = new LinkedList(); // D şıkkı A bölümü hazır listesi -1-
			LinkedList list12 = new LinkedList(); // D şıkkı A bölümü hazır listesi -2-
			LinkedList list13 = new LinkedList(); // D şıkkı A bölümü hazır listesi -3-
			LinkedList list14 = new LinkedList(); // D şıkkı B bölümü
			
			list11 = list11.insert(list11, "a");list11 = list11.insert(list11, "MEH");list11 = list11.insert(list11, "ahmet");list11 = list11.insert(list11, "saat");
			list12 = list12.insert(list12, "hm");list12 = list12.insert(list12, "N");list12 = list12.insert(list12, "zeydan");list12 = list12.insert(list12, "akıll");list12 = list12.insert(list12, "inceelik");
			list13 = list13.insert(list13, "et");list13 = list13.insert(list13, "eets");list13 = list13.insert(list13, "samett");list13 = list13.insert(list13, "takıll");list13 = list13.insert(list13, "etiyografya");list13 = list13.insert(list13, "abdullahhh");
			
			//Eğer gelen veri d veya D ise o şıktaki işleme yönlendiriyoruz.
			if(userData.equals("d")||userData.equals("D")) {
				while(true) {
					//Listeyi tersten yazdırma.
					System.out.println("Yeni bir liste mi oluşturmak istersiniz veya hazır listemizi mi istersiniz ?");
					System.out.println("A-)Hazır liste lütfen \nB-)Kendim oluşturacağım.");
					System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.");
					String userDataD = dataInput.next();
					if(userDataD.equals("bitir")== true||userDataD.equals("Bitir")== true) {break;}
	// A seçeneği seçilirse ..
					if(userDataD.equals("A")||userDataD.equals("a")) {
						System.out.println("Hazır listelerimizden hangisini seçmek istersiniz ?");
						System.out.print("a = "); list11.print2(list11);System.out.println(" ");
						System.out.print("b = "); list12.print2(list12);System.out.println(" ");
						System.out.print("c = "); list13.print2(list13);System.out.println(" ");
						System.out.println("------------------------------------------\nMenüye dönmek için \'menü\' yazınız.");
						String userDataD1 = dataInput.next();
						if(userDataD1.equals("bitir")== true||userDataD1.equals("Bitir")== true) {break;}
		//A içerisindeki a seçilirse
						if(userDataD1.equals("a")) {
							System.out.print("Listemizin tersten yazılışı :");
							list11.tersten(list11);
							list11.print2(list11);
							System.out.println("\n******************************************");
						}
		//A içerisindeki b seçilirse
						if(userDataD1.equals("b")) {
							System.out.print("Listemizin tersten yazılışı :");
							list12.tersten(list12);
							list12.print2(list12);
							System.out.println("\n******************************************");
						}
		//A içerisindeki c seçilirse
						if(userDataD1.equals("c")) {
							System.out.print("Listemizin tersten yazılışı :");
							list13.tersten(list13);
							list13.print2(list13);
							System.out.println("\n******************************************");
						}
					}
	// B seçeneği seçilirse ..
					if(userDataD.equals("B")||userDataD.equals("b")) {
						System.out.println("******************************************");
						System.out.println("Veri girişiniz bitince lütfen \"bitti\" yazıp enter'a basınız.\nLütfen her veriden sonra enter'a basınız.");
						System.out.println("******************************************");
						while(true) {
							String userDataD2 = dataInput.next();
							//Gelen veriyi listeye ekleyecek.
							if(userDataD2.equals("bitti")== true||userDataD2.equals("Bitti")== true) {break;}
							System.out.print("Şu an ki güncel listemiz : ");
							list14 = list14.insert(list14, userDataD2);
							list14.print2(list14);
							System.out.println(" ");
						}
						System.out.print("Listemizin tersten yazılışı :");
						list14.tersten(list14);
						list14.print2(list14);
						System.out.println("\n******************************************");
					}
				}
			}
//*** E şıkkı
			
			LinkedList list15 = new LinkedList(); // E şıkkı A bölümü hazır listesi -1-
			LinkedList list16 = new LinkedList(); // E şıkkı A bölümü hazır listesi -2-
			LinkedList list17 = new LinkedList(); // E şıkkı A bölümü hazır listesi -3-
			LinkedList list18 = new LinkedList(); // E şıkkı B bölümü
			
			list15 = list15.insert(list15, "a");list15 = list15.insert(list15, "ahmet");list15 = list15.insert(list15, "nesne");list15 = list15.insert(list15, "özneler");
			list16 = list16.insert(list16, "hm");list16 = list16.insert(list16, "murrem");list16 = list16.insert(list16, "123465a");list16 = list16.insert(list16, "gedikler");
			list17 = list17.insert(list17, "et");list17 = list17.insert(list17, "holing");list17 = list17.insert(list17, "sanal");list17 = list17.insert(list17, "zanaat");list17 = list17.insert(list17, "işçilik");
			
			//Eğer gelen veri e veya E ise o şıktaki işleme yönlendiriyoruz.
			if(userData.equals("e")||userData.equals("E")) {
				while(true) {
					//Listede arama yaptırma
					System.out.println("Yeni bir liste mi oluşturmak istersiniz veya hazır listemizi mi istersiniz ?");
					System.out.println("A-)Hazır liste lütfen \nB-)Kendim oluşturacağım.");
					System.out.println("------------------------------------------\nÇıkış yapmak için \'bitir\' yazınız.");
					String userDataE = dataInput.next();
					if(userDataE.equals("bitir")== true||userDataE.equals("Bitir")== true) {break;}
	// A seçeneği seçilirse ..
					if(userDataE.equals("A")||userDataE.equals("a")) {
						System.out.println("Hazır listelerimizden hangisini seçmek istersiniz ?");
						System.out.print("a = "); list15.print2(list15);System.out.println(" ");
						System.out.print("b = "); list16.print2(list16);System.out.println(" ");
						System.out.print("c = "); list17.print2(list17);System.out.println(" ");
						System.out.println("------------------------------------------\nMenüye dönmek için \'menü\' yazınız.");
						String userDataE1 = dataInput.next();
						if(userDataE1.equals("bitir")== true||userDataE1.equals("Bitir")== true) {break;}
		//A içerisindeki a seçilirse
						if(userDataE1.equals("a")) {
							System.out.println("******************************************");
							list15.print2(list15);
							System.out.print("\nAradığınız veriyi giriniz lütfen :");
							String userDataE11 = dataInput.next();
							list15.arama(list15, userDataE11);
							System.out.println("\n Devam etmek için \"menü\" yazıp enter'a basınız.");
							dataInput.next();
							System.out.println("\n******************************************");
						}
		//A içerisindeki b seçilirse
						if(userDataE1.equals("b")) {
							System.out.print("Aradığınız veriyi giriniz lütfen :");
							String userDataE12 = dataInput.next();
							list16.arama(list16, userDataE12);
							System.out.println("\n Devam etmek için \"menü\" yazıp enter'a basınız.");
							dataInput.next();
							System.out.println("\n******************************************");
						}
		//A içerisindeki c seçilirse
						if(userDataE1.equals("c")) {
							System.out.print("Aradığınız veriyi giriniz lütfen :");
							String userDataE13 = dataInput.next();
							list17.arama(list17, userDataE13);
							System.out.println("\n Devam etmek için \"menü\" yazıp enter'a basınız.");
							dataInput.next();
							System.out.println("\n******************************************");
						}
					}
	// B seçeneği seçilirse ..
					if(userDataE.equals("B")||userDataE.equals("b")) {
						System.out.println("******************************************");
						System.out.println("Veri girişiniz bitince lütfen \"bitti\" yazıp enter'a basınız.\nLütfen her veriden sonra enter'a basınız.");
						System.out.println("******************************************");
						while(true) {
							String userDataE2 = dataInput.next();
							//Gelen veriyi listeye ekleyecek.
							if(userDataE2.equals("bitti")== true||userDataE2.equals("Bitti")== true) {break;}
							System.out.print("Şu an ki güncel listemiz : ");
							list18 = list18.insert(list18, userDataE2);
							list18.print2(list18);
							System.out.println(" ");
						}
						System.out.print("Aradığınız veriyi giriniz lütfen :");
						String userDataE21 = dataInput.next();
						list18.arama(list18, userDataE21);
						System.out.println("\n Devam etmek için \"menü\" yazıp enter'a basınız.");
						dataInput.next();
						System.out.println("\n******************************************");
					}
				}
			}
			if(userData.equals("bitir")== true||userData.equals("Bitir")== true) {break;}
		}
	}
}
