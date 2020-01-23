package ua.lviv.iot.firstLab;

public class ColdStore {
	
	private static double numberOfCompressorsAndCircuits;
	
	protected String compressorType;
	protected String freon;
	
	private String producer = "Unknown(";
	private double volumeInLitres;
	private double weightInKg;
	private double powerConsumptionInWatt;
	
	private double coolingCapacity;
	private double refrigerationCoefficient;
	
	ColdStore(){}
	
	ColdStore(String producer, double volumeInLitres, double weightInKg, double powerConsumptionInWatt) {
		this.producer = producer;
		this.volumeInLitres = volumeInLitres;
		this.weightInKg = weightInKg;
		this.powerConsumptionInWatt = powerConsumptionInWatt;
	}
	
	ColdStore(String producer, double volumeInLitres, double weightInKg, double powerConsumptionInWatt,
	double coolingCapacity, double refrigerationCoefficient, String freon, String compressorType,
	double numberOfCompressorsAndCircuits) {
		this(producer, volumeInLitres, weightInKg, powerConsumptionInWatt);
		this.coolingCapacity = coolingCapacity;
		this.refrigerationCoefficient = refrigerationCoefficient;
		this.compressorType = compressorType;
		this.freon = freon;
		ColdStore.numberOfCompressorsAndCircuits = numberOfCompressorsAndCircuits;
	}
	
	double getCoolingCapacity() {
		return this.coolingCapacity;
	}
	
	double getRefrigerationCoefficient() {
		return this.refrigerationCoefficient;
	}
	
	void setCoolingCapacity(double coolingCapacity) {
		this.coolingCapacity = coolingCapacity;
	}
	
	void setRefrigerationCoefficient(double refrigerationCoefficient) {
		this.refrigerationCoefficient = refrigerationCoefficient;
	}
	
	void resetValues(String producer, double volumeInLitres, double weightInKg, double powerConsumptionInWatt,
			double coolingCapacity, double refrigerationCoefficient, String freon, String compressorType,
			double numberOfCompressorsAndCircuits) {
		this.producer = producer;
		this.volumeInLitres = volumeInLitres;
		this.weightInKg = weightInKg;
		this.powerConsumptionInWatt = powerConsumptionInWatt;
		this.coolingCapacity = coolingCapacity;
		this.refrigerationCoefficient = refrigerationCoefficient;
		this.compressorType = compressorType;
		this.freon = freon;
		ColdStore.numberOfCompressorsAndCircuits = numberOfCompressorsAndCircuits;
	}
	
	public static String printStaticNumberOfCompressorsAndCircuits() {
		return "Number of Compressors/Circuits = " + numberOfCompressorsAndCircuits ;
	}
	
	
	public String printNumberOfCompressorsAndCircuits() {
		return "Number of Compressors/Circuits = " + numberOfCompressorsAndCircuits ;
	}
	
	@Override
    public String toString() {
		return "Producer: " + producer + "\n" +
			   "Compressor Type: " + compressorType + "\n" +
		       "Freon: " + freon + "\n" +
			   "Volume: " + volumeInLitres + " litres" + "\n" +
		       "Weight: " + weightInKg + " kg" + "\n" +
			   "Power Consumption: " + powerConsumptionInWatt + " Watt" + "\n" + 
		       "Cooling Capacity: " + coolingCapacity + " Watt" + "\n" +
			   "Refrigeration Coefficient " + refrigerationCoefficient + "\n" +
			    printNumberOfCompressorsAndCircuits() ;
	}
	

}
