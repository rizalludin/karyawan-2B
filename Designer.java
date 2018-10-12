public class Designer extends Karyawan{
	public void setGaji (int kasihUang){
		if((gaji + kasihUang) <= maxGajiDes){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
		}else{
			gaji = maxGajiDes;
			System.out.println("Gaji Anda kelebihan");
		}
	}

	public void setGaji (int kasihUang, String pesan){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + kasihUang) <= maxGajiDes){
			gaji += kasihUang;
			System.out.println("Gaji Anda yang sudah ditambah : " + kasihUang);
			System.out.println("Gaji Anda Sekarang : " + gaji);
			System.out.println("Pesan : " + pesan);
		}else{
			gaji = maxGajiDes;
			System.out.println("Gaji Anda kelebihan");
		}
	}

}