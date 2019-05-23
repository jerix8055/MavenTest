package de.hfu.residents.service;
import static org.easymock.EasyMock.*;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;

public class BaseResidentServiceEasyMockTest {
	@Test(expected=ResidentServiceException.class)
	public void test() throws ResidentServiceException{
		ResidentRepository residentRepositoryMock = createMock(ResidentRepository.class);
		//residentRepositoryMock.getResidents().add(new Resident("Max", "Mustermann", "Musterstraße", "Musterstadt", new Date(20000)));
		expect(residentRepositoryMock.getResidents()).andReturn(null);
		replay(residentRepositoryMock);
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(residentRepositoryMock);
		Resident filter = new Resident();
		filter.setGivenName("Ma*");
		baseTest.getUniqueResident(filter);
	}
}
