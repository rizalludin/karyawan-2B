public class KaryawanTest{
	public static void main(String[] args) {
		Designer x = new Designer();
		x.nama = "Rizalludin" ;
		x.alamat = "Indramayu";
		System.out.println("Nama Karyawan :" + x.getNama());
		System.out.println("Alamat Karyawan :" + x.getAlamat());
		x.setGaji(40);
		x.setGaji(30,"Tambahan Neh");
		System.out.println("Max Gaji = "+x.maxGajiDes);
		x.setGaji(10);
		System.out.println("");

		Programmer y = new Programmer();
		y.nama = "Zizi" ;
		y.alamat = "Celeng";
		System.out.println("Nama Karyawan :" + y.getNama());
		System.out.println("Alamat Karyawan :" + y.getAlamat());
		y.setGaji(40);
		y.setGaji(25,"Tambahan Neh");
		System.out.println("Max Gaji = "+x.maxGajiPro);
		y.setGaji(20);
		System.out.println("");

		ProjectManager z = new ProjectManager();
		z.nama = "Wiliam";
		z.alamat = "Lohbener";
		System.out.println("Nama Karyawan :" + z.getNama());
		System.out.println("Alamat Karyawan :" + z.getAlamat());
		z.setGaji(60);
		z.setGaji(40,"Tambahan Neh");
		System.out.println("Max Gaji = "+x.maxGajiPm);
		z.setGaji(25);
		System.out.println("");

	}
}