public class Barang {
		private String namaBarang;
		private String kodeBarang;
		private int jumlah;
		private boolean kondisiBagus;
		private date tglMasuk;
		private date tglKeluar;
		
		public class Barang(String nb,String kb,int jum,boolean k,date tglM,date tglK){}
			this.nb = namaBarang;
			this.kb = kodeBarang;
			this.jum = jumlah;
			this.k = kondisiBagus;
			this.tglM = tglMasuk;
			this.tglK = tglKeluar;
		}
		
		public String getNamaBarang {
			return namaBarang;
		}
		
		public int Jumlah  {
			return jumlah;
		}
		
		public boolean getKondisiBagus {
			return kondisiBagus;
		}
		
		public date getTglMasuk {
			return tglMasuk;
		}
		
		public date getTglKeluar {
			return tglKeluar;
		}	
		
		}