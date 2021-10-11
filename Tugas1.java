public class Tugas1 {

    public static class ConanCariAnggota {
    public String nama;
    public int umur;
    public String tempatTinggal;
    public int tabungan;

    ConanCariAnggota(String nama, int umur, String tempatTinggal, int tabungan) {
      this.nama = nama;
      this.umur = umur;
      this.tempatTinggal = tempatTinggal;
      this.tabungan = tabungan;
    }
  }

  public static void main(String[] args) {
    ConanCariAnggota jebolanDon = new ConanCariAnggota("Gabriel Bulakbalik", 46, "Havana", 19000000);
    ConanCariAnggota jebolanUnderboss = new ConanCariAnggota("Sadam Husein", 39, "Nevada", 1900000 );
    ConanCariAnggota jebolanCapo = new ConanCariAnggota("Huzaimah Dordor", 21, "detroit", 750000);
    ConanCariAnggota jebolanPKI = new ConanCariAnggota("Jarjit Singh", 19, "Serawak", 100);
    System.out.println(getWarning(jebolanDon));
    System.out.println(getWarning(jebolanUnderboss));
    System.out.println(getWarning(jebolanCapo));
    System.out.println(getWarning(jebolanPKI));
  }

  public static String getWarning(ConanCariAnggota anggota) {
    String syndicate = getSyndicate(
      anggota.umur,
      anggota.tempatTinggal,
      anggota.tabungan
    );


        return switch (syndicate.toLowerCase()) {
            case "don", "underboss", "capo" -> anggota.nama + " Dia adalah salah satu anggota mafia yang dicurigai anggota " + syndicate;
            default -> anggota.nama + " Sepertinya dia bukan orang yang mencurigakan.";
        };
  }

  public static String getSyndicate(
      int umur, 
      String tempatTinggal, 
      int tabungan
  ) {
    if ( umur > 40 & tabungan > 10000000) {
        return switch (tempatTinggal.toLowerCase()) {
            case "nevada", "havana", "new york" -> "Don";
            default -> "";
        };
    }
    
    else if (
      ( umur >= 25 & umur <= 40 ) && 
      ( tabungan > 1000000 || tabungan <= 2000000 )
    ) {
        return switch (tempatTinggal.toLowerCase()) {
            case "new jersey", "manhattan", "nevada" -> "Underboss";
            default -> "";
        };
    }

    else if (
      ( umur >= 18 & umur <= 24 ) && 
      ( tabungan < 1000000 )
    ) {
        return switch (tempatTinggal.toLowerCase()) {
            case "california", "detroit", "boston" -> "Capo";
            default -> "";
        };
    }

    else {
      return "";
    }
  }


}
