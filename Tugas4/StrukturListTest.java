package Tugas4;

public class StrukturListTest {
	    public static void main(String[] args) {
	        //Latihan ke3
	        StrukturList list1 = new StrukturList();//Membuat objek baru dari kelas StrukturList bernama list
	        list1.addTail(3);
	        list1.addTail(4);
	        list1.addMid(7,2);
	        list1.addMid(8,2);
	        list1.addHead(5);
	        list1.displayElement();

	        // Tugas a. 2.1 3.4 4.5
	        StrukturList list2 = new StrukturList();//Membuat objek baru dari kelas StrukturList bernama list2
	        list2.addTail(3.4);
	        list2.addMid(4.5, 2);
	        list2.addHead(2.1);
	        list2.displayElement();

	        // Tugas b. 3.4 2.1 1.1 4.5 5.5
	        StrukturList list3 = new StrukturList();//Membuat objek baru dari kelas StrukturList bernama list3
	        list3.addTail(1.1);
	        list3.addTail(4.5);
	        list3.addMid(5.5, 3);
	        list3.addHead(2.1);
	        list3.addHead(3.4);
	        list3.displayElement();
	    }
	}