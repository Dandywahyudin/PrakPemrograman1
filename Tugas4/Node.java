package Tugas4;

public class Node {
		private double data;//Menyimpan data bertipe double dalam node.
		private Node next;//menyimpan referensi ke node berikutnya dalam linked list.
		
		public Node(double data) {
			this.data = data;
		}
		//setter dan getter
		public void setData(double data) {
			this.data = data;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public double getData() {
			return data; 
		}
		public Node getNext() {
			return next;
		}
	}