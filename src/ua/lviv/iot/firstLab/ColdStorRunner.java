package ua.lviv.iot.firstLab;

public class ColdStorRunner {

	public static void main(String[] args) {
		ColdStore C1 = new ColdStore();
		ColdStore C2 = new ColdStore("Chillnemo?", 101, 501, 14800);
		ColdStore C3 = new ColdStore("UltraChill", 1001, 5001, 43120, 117300, 3.55, "R410E", "Spiral", 1);
		
		System.out.println(" First Cold Store(Refrigerator): ");
		System.out.println(C1);
		System.out.println(" Second Cold Store(Refrigerator): ");
		System.out.println(C2);
		System.out.println(" Third Cold Store(Refrigerator): ");
		System.out.println(C3);
		System.out.println("Printed Static variable by non-static method:");
		System.out.println(C3.printNumberOfCompressorsAndCircuits());
		System.out.println("Printed Static variable by static method: ");
		System.out.println(ColdStore.printStaticNumberOfCompressorsAndCircuits());
		System.out.println();

	
	
	ColdStore[] arrayOfColdStores = new ColdStore[4];
     int iterator = 0 ;
     while (iterator < 4) {
    	 arrayOfColdStores[iterator] = new ColdStore();
    	 System.out.println("Cold Store" + iterator);
    	 System.out.println(arrayOfColdStores[iterator]);
         iterator++;
     }

  }

}
