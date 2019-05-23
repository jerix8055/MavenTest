package de.hfu.residents.repository;

import java.util.List;

import de.hfu.residents.domain.Resident;

import java.util.ArrayList;
import java.util.Date;

public class ResidentRepositoryStub implements ResidentRepository {
	@Override
	public List<Resident> getResidents() {
		List<Resident> residents = new ArrayList<>();
		Resident add = new Resident("Max", "Mustermann", "Musterstraße", "Musterstadt", new Date(20000));
		residents.add(add);
		add = new Resident("Edgar", "Huber", "Balweg", "Emmingen", new Date(320000));
		residents.add(add);
		add = new Resident("Dagmar", "Viennua", "Fronalee", "Neuhausen", new Date(-340000));
		residents.add(add);
		add = new Resident("Frederik", "Gannmann", "Spreestraße", "Mummeln", new Date(2650000));
		residents.add(add);
		add = new Resident("Helene", "Nichta", "Wachholderweg", "Dresden", new Date(6780000));
		residents.add(add);
		add = new Resident("Katharina", "Müller", "Mehlstraße", "Berlin", new Date(20000));
		residents.add(add);
		add = new Resident("Mareike", "Kannas", "Wegweg", "München", new Date(-4650000));
		residents.add(add);
		add = new Resident("Matthias", "Kanosti", "Sachstraße", "Ludwigsburg", new Date(-265000));
		residents.add(add);
		return residents;
	}
}
