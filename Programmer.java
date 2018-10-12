public class Programmer extends Karyawan{
	public void setGaji (int kasihUang){
		if((gaji + kasihUang) <= maxGajiPro){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
		}else{
			gaji = maxGajiPro;
			System.out.println("Gaji Anda kelebihan");
		}
	}

	public void setGaji (int kasihUang, String pesan){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + kasihUang) <= maxGajiPro){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
			System.out.println("Pesan : " + pesan);
		}else{
			gaji = maxGajiPro;
			System.out.println("Gaji Anda kelebihan");
		}
	}

}