package com.ecole.pratique.rapport.service;

import java.util.List;
import com.ecole.pratique.rapport.entite.Rapport;


public interface RapportServiceItf {
	List<Rapport> listRapport();
	Rapport findRapportById(Long id);
	Rapport updateRapport(Long id, Rapport rapport);
	Rapport deleteById(Long id);
}