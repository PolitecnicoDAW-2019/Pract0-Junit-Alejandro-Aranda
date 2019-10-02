package PRAC1_ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class TeamTest {
	public Team Team;
	
    @BeforeEach
    final void startup() throws Exception {
        Team = new Team();
    }

	@Test
	final void testTeam() throws Exception {
		Team team=new Team("shortName","longName","imageSrc","president","sponsor",100,200,2019);
	}

	/*@Test
	final void testTeamStringStringStringStringStringIntIntInt() {
		fail("Not yet implemented"); // TODO
	}
*/
	@Test
	final void testGetShortName() throws Exception {
		Team.setShortName("example");
		Assertions.assertEquals("example", Team.getShortName());
	}

	@Test
	final void testSetShortName() throws Exception {
		Team.setShortName("example");
		Assertions.assertEquals("example", Team.getShortName());
	}
	
	final void testSetShortNameMoreThan40() throws Exception {
		Team.setShortName("asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf");
		Assertions.assertEquals(null,Team.getShortName());;
	}
	
	@Test
	final void testGetLongName() {
		Team.setLongName("sample");
		Assertions.assertEquals("sample", Team.getLongName());
	}

	@Test
	final void testSetLongName() {
		Team.setLongName("sample");
		Assertions.assertEquals("sample", Team.getLongName());
	}

	@Test
	final void testGetImageSrc() {
		Team.setImageSrc("asdfasdfasdf");
		Assertions.assertEquals("asdfasdfasdf",Team.getImageSrc());
	}

	@Test
	final void testSetImageSrc() {
		Team.setImageSrc("asdfasdfasdf");
		Assertions.assertEquals("asdfasdfasdf",Team.getImageSrc());
	}

	@Test
	final void testGetPresident() {
		Team.setPresident("president");
		Assertions.assertEquals("president",Team.getPresident());
	}

	@Test
	final void testSetPresident() {
		Team.setPresident("president");
		Assertions.assertEquals("president",Team.getPresident());
	}

	@Test
	final void testGetSponsor() {
		Team.setSponsor("sponsor");
		Assertions.assertEquals("sponsor",Team.getSponsor());
	}

	@Test
	final void testSetSponsor() {
		Team.setSponsor("sponsor");
		Assertions.assertEquals("sponsor",Team.getSponsor());
	}

	@Test
	final void testGetMembers() {
		Team.setMembers(345);
		Assertions.assertEquals(345,Team.getMembers());
	}

	@Test
	final void testSetMembersTrue() {
		Assertions.assertEquals(true, Team.setMembers(11234));
	}
	
	@Test
	final void testSetMembersFalse() {
		Assertions.assertEquals(false, Team.setMembers(-1));
	}
	
	@Test
	final void testGetBudget() {
		Team.setBudget(11234);
		Assertions.assertEquals(11234, Team.getBudget());
	}

	@Test
	final void testSetBudgetTrue() {
		Assertions.assertEquals(true, Team.setBudget(11234));
	}
	
	@Test
	final void testSetBudgetFalse() {
		Assertions.assertEquals(false, Team.setBudget(-1));
	}

	
	@Test
	final void testGetFounded() {
		Team.setFounded(2010);
		Assertions.assertEquals(2010, Team.getFounded());
	}

	@Test
	final void testSetFoundedTrue() {
		Assertions.assertEquals(true, Team.setFounded(2010));
	}
	
	@Test
	final void testSetFoundedFalse() {
		Assertions.assertEquals(false, Team.setFounded(1899));
	}

}
