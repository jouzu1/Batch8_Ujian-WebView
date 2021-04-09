package com.kuliah.main.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
public interface ModelPlotInterface {
	public List<PlotMataKuliah> getAllPlot();
	public PlotMataKuliah addPlot(PlotMataKuliah plotmatakuliah);
	public void deletePlot(String id);
}
