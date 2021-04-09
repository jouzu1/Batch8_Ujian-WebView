package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kuliah.main.entity.Mahasiswa;
import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.services.ModelPertanyaan;
import com.kuliah.main.services.ModelPlot;

@Controller
public class PlotController {
	
	@Autowired
	ModelPlot mp;
	
	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	@GetMapping("/plot/view/")
	public String viewPlot(Model model) {
		
		model.addAttribute("listPlot",mp.getAllPlot());
		model.addAttribute("active",6);
		return "view_plot";
	}
	
	@GetMapping("/plot/add/")
	public String viewAddPlot(Model model) {
		
		// buat penampung data mahasiswa di halaman htmlnya
		model.addAttribute("plot_mk",new PlotMataKuliah());
		return "add_plot";
	}
	
	@PostMapping("/plot/view/")
	  public String addPlot(@ModelAttribute PlotMataKuliah plotmatakuliah, Model model) {
		
		// buat penampung data mahasiswa di halaman htmlnya
//		this.modelMahasiswa.addMahasiswa(mahasiswa);
		this.mp.addPlot(plotmatakuliah);
//		model.addAttribute("listMahasisw",modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listPlot",mp.getAllPlot());
		
		
		return "redirect:/plot/view/";
	}
	
//	@GetMapping("/plot/update/{id}")
//	public String viewUpdatePlot(@PathVariable String id, Model model) {
//		
//		Mahasiswa mahasiswa = modelMahasiswa.getMahasiswaById(id);
//		// buat penampung data mahasiswa di halaman htmlnya
//		model.addAttribute("mahasiswa",mahasiswa);
//		
//		return "add_mahasiswa";
//	}
	
	@GetMapping("/plot/delete/{id}")
	public String deletePlot(@PathVariable String id, Model model) {
		
		this.mp.deletePlot(id);
		model.addAttribute("listPlot",mp.getAllPlot());
		
		
		return "redirect:/plot/view/";
	}
	
	@GetMapping("/ujian/view")
	public String viewIndexPertanyaan(Model model) {
		model.addAttribute("listpertanyaan",modelPertanyaan.getAllPertanyaan());
		return "ujian";
	}
//	@GetMapping("/plot/view/ujian")
//	public String viewUjianPlot(Model model) {
//		
//		model.addAttribute("listPlot",mp.getAllPlot());
//		return "view_plot";
//	}
}
