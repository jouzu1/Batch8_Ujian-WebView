package com.kuliah.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kuliah.main.entity.Dosen;
import com.kuliah.main.entity.Mahasiswa;
import com.kuliah.main.entity.MataKuliah;
import com.kuliah.main.entity.Nilai;
import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.PertanyaanRepository;
import com.kuliah.main.repository.PlotMataKuliahRepository;
import com.kuliah.main.repository.SoalRepository;

@SpringBootApplication
public class Ujian implements CommandLineRunner{

	
	@Autowired
	private PlotMataKuliahRepository plotMK;
	
//	@Autowired
//	private SoalRepository soalRepo;
//	
//	@Autowired
//	private PertanyaanRepository pertanyaanRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Ujian.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		PlotMataKuliah plotMK = new PlotMataKuliah();
//	
//		
//		Mahasiswa mahasiswa = new Mahasiswa();
//		mahasiswa.setNamaMahasiswa("Dewabrata");
//		mahasiswa.setJenisKelamin("Pria");
//		mahasiswa.setNim("67890");
//		mahasiswa.setPassword("gelap");
//		
//		Mahasiswa mahasiswa1 = new Mahasiswa();
//		mahasiswa1.setNamaMahasiswa("Dewi");
//		mahasiswa1.setJenisKelamin("Pria");
//		mahasiswa1.setNim("67890");
//		mahasiswa1.setPassword("gelap");
//		
//		Mahasiswa mahasiswa2 = new Mahasiswa();
//		mahasiswa2.setNamaMahasiswa("Aqil");
//		mahasiswa2.setJenisKelamin("Pria");
//		mahasiswa2.setNim("67890");
//		mahasiswa2.setPassword("gelap");
		
//		plotMK.setMahasiswa(mahasiswa);
//		plotMK.setMahasiswa(mahasiswa1);
//		plotMK.setMahasiswa(mahasiswa2);
		
//		Dosen dosen = new Dosen();
//		dosen.setNamaDosen("Chelsea Islan");
//		dosen.setUsername("monica");
//		dosen.setPassword("catur");
//		plotMK.setDosen(dosen);
//		
//		MataKuliah matakuliah = new MataKuliah();
//		matakuliah.setNamaMataKuliah("Matematika");
//		plotMK.setMatakuliah(matakuliah);
//		
//		List<Soal> lstSoal = new ArrayList<Soal>();
//		
//		Soal soal1 = new Soal();
//		soal1.setNamaSoal("Matematika Terapan");
//		soal1.setStatus(1);
//		
//		Nilai nilai = new Nilai();
//		nilai.setNilai("80");
//		soal1.setNilai(nilai);
//		
//		Pertanyaan pertanyaan1 = new Pertanyaan();
//		pertanyaan1.setPertanyaan1("Siapakah nama artis di samping ini?");
//		pertanyaan1.setJawaban1("Chelsea Islan");
//		pertanyaan1.setJawaban2("Dadang");
//		pertanyaan1.setJawaban3("Jouzu");
//		pertanyaan1.setJawaban4("Tidak ada yang benar");
//		pertanyaan1.setJawabanBenar("1");
//		pertanyaan1.setStatusGambar("https://www.pinterest.com/pin/182818066107767411/");
//		
//		Pertanyaan pertanyaan2 = new Pertanyaan();
//		pertanyaan2.setPertanyaan1("Ini ikan cupang jenis?");
//		pertanyaan2.setJawaban1("Avatar");
//		pertanyaan2.setJawaban2("Nemo");
//		pertanyaan2.setJawaban3("Fancy");
//		pertanyaan2.setJawaban4("Blue Rim");
//		pertanyaan2.setJawabanBenar("4");
//		pertanyaan2.setStatusGambar("https://i.pinimg.com/736x/86/53/e5/8653e5eb2f63f6a2d21ce1f414f601b3.jpg");
//		
//		List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
//		lstPertanyaan.add(pertanyaan1);
//		lstPertanyaan.add(pertanyaan2);
//		soal1.setLstPertanyaan(lstPertanyaan);
//		
//		
//		
//		lstSoal.add(soal1);
//		
//		plotMK.setLstSoal(lstSoal);
//		plotMK.setSoal(soal1);
//		this.plotMK.save(plotMK);
		
		
//		Soal soalx = this.soalRepo.findByNamaSoal("Soal Percintaan");
//		
//		System.out.println(soalx.getNamaSoal());
		
		
	/*	Pertanyaan pertanyaan1 = new Pertanyaan();
		pertanyaan1.setPertanyaan("Siapa Dewabrata");
		pertanyaan1.setJawaban1("Trainer");
		pertanyaan1.setJawaban2("Artis");
		pertanyaan1.setJawaban3("Pedagang");
		pertanyaan1.setJawaban4("Pengangguran");
		pertanyaan1.setJawabanBenar("1");
		pertanyaan1.setStatusGambar("https://akcdn.detik.net.id/community/media/visual/2021/03/19/dadang-subur-dewa-kipas-1_169.jpeg");

		this.pertanyaanRepo.save(pertanyaan1);
		*/
	}

}
