package _04_hospital;

public class GeneralPractitioner extends Doctor{

	boolean performsSurgery() {
		return false;
	}

	boolean makesHouseCalls() {
		return true;
	}
	
}
