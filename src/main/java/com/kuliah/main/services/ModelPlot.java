package com.kuliah.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.repository.PlotMataKuliahRepository;

@Service
public class ModelPlot implements ModelPlotInterface{

	@Autowired
	PlotMataKuliahRepository pmkr;

	@Override
	public List<PlotMataKuliah> getAllPlot() {
		// TODO Auto-generated method stub
		return (List<PlotMataKuliah>) this.pmkr.findAll();
	}

	@Override
	public PlotMataKuliah addPlot(PlotMataKuliah plotmatakuliah) {
		// TODO Auto-generated method stub
		return this.pmkr.save(plotmatakuliah);
	}

	@Override
	public void deletePlot(String id) {
		// TODO Auto-generated method stub
		this.pmkr.deleteById(Long.parseLong(id));
	}
	
//	@Override
//	public void deletePlot(String id) {
//		// TODO Auto-generated method stub
//		this.pmkr.deleteById(Long.parseLong(id));
//	}
}
