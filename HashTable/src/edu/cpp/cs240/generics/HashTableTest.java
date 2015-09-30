package edu.cpp.cs240.generics;

public class HashTableTest {


	public static void main(String[] args) {
		FedexPackage p1 = new FedexPackage("abddre89", "SEA", 213123l);
		FedexPackage p2 = new FedexPackage("2213jkj2", "LAX", 321312l);
		FedexPackage p3 = new FedexPackage("32321232", "NYC", 434343l);
		FedexPackage p4 = new FedexPackage("sdsd2233", "BHM", 123213l);
		FedexPackage p5 = new FedexPackage("4343sdsd", "BNA", 343434l);

		HashTable<String, FedexPackage> hashTable = new HashTableImpl<String, FedexPackage>();
		hashTable.put("abddre89", p1);
		hashTable.put("2213jkj2", p2);
		hashTable.put("32321232", p3);
		hashTable.put("sdsd2233", p4);
		hashTable.put("4343sdsd", p5);

		System.out.println(hashTable);

		// update p4
		p4.setDestination("ATL");
		hashTable.put("sdsd2233", p4);

		System.out.println(hashTable);

		// remove p3
		hashTable.remove("32321232");
		System.out.println(hashTable);
	}

}

class FedexPackage {

	private String trackingNum;
	private String destination;
	private long estiTime;

	public FedexPackage(String trackingNum, String destination, long estiTime) {
		this.trackingNum = trackingNum;
		this.destination = destination;
		this.estiTime = estiTime;
	}
	public String getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public long getEstiTime() {
		return estiTime;
	}
	public void setEstiTime(long estiTime) {
		this.estiTime = estiTime;
	}

	public String toString() {
		return trackingNum + "-" + destination + "-" + estiTime;
	}
}
