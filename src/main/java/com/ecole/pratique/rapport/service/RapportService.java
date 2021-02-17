package com.ecole.pratique.rapport.service;

import com.ecole.pratique.rapport.dao.RapportDaoItf;
import com.ecole.pratique.rapport.entite.Rapport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RapportService implements RapportServiceItf {
	@Autowired
	private RapportDaoItf rapportDao;
	
	@Override
	public List<Rapport> listRapport() {
		return rapportDao.findAll();
	}

	@Override
	public Rapport findRapportById(Long id) {
		return rapportDao.findById(id).get();
	}

	@Override
	public Rapport updateRapport(Long id, Rapport rapport) {
		rapport.setId(id);
		return rapportDao.save(rapport);
	}
	@Override
	public Rapport deleteById(Long id) {
		Rapport rapport = findRapportById(id);
				return rapport;
	}
	

}
