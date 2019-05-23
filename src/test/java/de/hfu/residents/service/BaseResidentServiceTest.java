package de.hfu.residents.service;

import java.util.Date;

import org.junit.Test;

import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.repository.ResidentRepositoryStub;
import de.hfu.residents.domain.Resident;

public class BaseResidentServiceTest {
	
	@Test(expected=ResidentServiceException.class)
	public void testGetUniqueResidentWildcard() throws ResidentServiceException{
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setGivenName("Ma*");
		baseTest.getUniqueResident(filter);
	}
	@Test(expected=ResidentServiceException.class)
	public void testGetUniqueResidentWildcard1() throws ResidentServiceException{
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setFamilyName("T*");
		baseTest.getUniqueResident(filter);
	}
	@Test(expected=ResidentServiceException.class)
	public void testGetUniqueResidentWildcard2() throws ResidentServiceException{
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setStreet("*weg");
		baseTest.getUniqueResident(filter);
	}
	@Test
	public void testGetUniqueResidentNoWildcard1() throws ResidentServiceException {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setGivenName("Max");
		baseTest.getUniqueResident(filter);
	}
	@Test(expected=ResidentServiceException.class)
	public void testGetUniqueResidentNoWildcard2() throws ResidentServiceException {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setGivenName("Melodie");
		baseTest.getUniqueResident(filter);
	}
	@Test
	public void testGetFilteredResidentsList1() {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setGivenName("Ma*");
		baseTest.getFilteredResidentsList(filter);
	}
	@Test
	public void testGetFilteredResidentsList2() {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setFamilyName("Ka*");
		baseTest.getFilteredResidentsList(filter);
	}
	@Test
	public void testGetFilteredResidentsList3() {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setStreet("*straße");
		baseTest.getFilteredResidentsList(filter);
	}
	@Test
	public void testGetFilteredResidentsList4() {
		ResidentRepository stub = new ResidentRepositoryStub();
		BaseResidentService baseTest = new BaseResidentService();
		baseTest.setResidentRepository(stub);
		Resident filter = new Resident();
		filter.setDateOfBirth(new Date(320000));
		baseTest.getFilteredResidentsList(filter);
	}
}
