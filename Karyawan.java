public class Karyawan{
	 final int maxGajiDes = 70;
	 final int maxGajiPro = 90;
	 final int maxGajiPm = 100;
	 String nama;
	 String alamat;
	 int gaji;


	public void setGaji (int kasihUang){
		gaji += kasihUang;
		System.out.println("Gaji Anda : " + gaji);
	}

	public void setGaji (int kasihUang, String pesan){
		gaji += kasihUang;
		System.out.println("Gaji Anda : " + gaji + " "+pesan);
	}

	public void setNama (String newNama){
		nama = newNama;
	}

	public void setAlamat (String newAlamat){
		alamat = newAlamat;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

}