package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData etd = new EncapsulateTheData();
	@Test
	void testItemsReceived() {
		etd.setItemsReceived(-3);
		if(etd.getItemsReceived() != 0) {
			fail("itemsReceived failed");
		}
	}
	void testDegreesTurned() {
		etd.setDegreesTurned((float) 361.3);
		if(etd.getDegreesTurned() != 1.3) {
			fail("degreesTurned failed");
		}
	}
	void testNomenclature() {
		etd.setNomenclature("Hi!");
		if(!etd.getNomenclature().equals("Hi!")) {
			fail("nomenclature failed");
		}
	}
	void testMemberObj() {
		etd.setMemberObj(6);
		if(!etd.getMemberObj().equals((Object) 6)) {
			fail("memberObj failed");
		}
	}
}
