public class ProjectManager extends Karyawan{
	public void setGaji (int kasihUang){
		if((gaji + kasihUang) <= maxGajiPm){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
		}else{
			gaji = maxGajiPm;
			System.out.println("Gaji Anda kelebihan");
		}
	}

	public void setGaji (int kasihUang, String pesan){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + kasihUang) <= maxGajiPm){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
			System.out.println("Pesan : " + pesan);
		}else{
			gaji = maxGajiPm;
			System.out.println("Gaji Anda kelebihan");
		}
	}

}