package de.hfu.residents.repository;

import java.util.List;

import de.hfu.residents.domain.Resident;

import java.util.ArrayList;
import java.util.Date;

public class ResidentRepositoryStub implements ResidentRepository {
	@Override
	public List<Resident> getResidents() {
		List<Resident> residents = new ArrayList<>();
		Resident add = new Resident("Max", "Mustermann", "Musterstraße", "Musterstadt", new Date(1989,1,1));
		residents.add(add);
		add = new Resident("Edgar", "Huber", "Balweg", "Emmingen", new Date(1953,4,18));
		residents.add(add);
		add = new Resident("Dagmar", "Viennua", "Fronalee", "Neuhausen", new Date(1977,12,3));
		residents.add(add);
		add = new Resident("Frederik", "Gannmann", "Spreestraße", "Mummeln", new Date(2000,5,16));
		residents.add(add);
		add = new Resident("Helene", "Nichta", "Wachholderweg", "Dresden", new Date(1969,6,9));
		residents.add(add);
		add = new Resident("Katharina", "Müller", "Mehlstraße", "Berlin", new Date(1999,6,6));
		residents.add(add);
		add = new Resident("Mareike", "Kannas", "Wegweg", "München", new Date(1999,7,7));
		residents.add(add);
		add = new Resident("Matthias", "Kanosti", "Sachstraße", "Ludwigsburg", new Date(2002,9,24));
		residents.add(add);
		return residents;
	}
}
