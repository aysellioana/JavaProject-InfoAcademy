package CreareContact;

import java.time.Instant;
import java.util.Objects;
import java.util.function.Predicate;

/*@author Aysel */
public class Contact {
    private String nume;
    private String prenume;
    int zi, luna, an;
    private String telefon;

  private Contact(String nume, String prenume, int zi, int luna, int an, String telefon){
        this.nume = nume;
        this.prenume = prenume;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
        this.zi = zi;
        this.telefon = telefon;
}
    public static Contact getInstance(String nume, String prenume, String dataNastere, String telefon){
        if(!valideazaNumele(nume)){
             System.out.println("numele: " + nume + " nu este valid");
             return null;
         }
         if(!valideazaPrenume(prenume)){
             System.out.println("Prenumele: " + prenume + " nu este valid");
             return null;
         }
         if(!valideazaDataNasterii(dataNastere)){
             System.out.println("data nastere: " + dataNastere + " nu este valida");
             return null;
         }
    String[] elemente = dataNastere.split("-");
         int zi = Integer.parseInt(elemente[0]),
                 luna=Integer.parseInt(elemente[1]),
                 an =Integer.parseInt(elemente[2]);
         return new Contact(nume,prenume, zi, luna, an, telefon);
    }
         
    public static boolean valideazaNumele(String nume){
        if(nume == null || nume.length() <2 ){
             System.out.println("Numele nu este valid!");
             return false;
        }
           return true;
    }
    public static boolean valideazaPrenume(String prenume){
         if(prenume == null || prenume.length() <2 ){
             System.out.println("Prenumele nu este valid!");
             return false;
        }
           return true;
    }
    
     private static boolean valideazaDataNasterii(String data){
         if(data == null){
             System.out.println("data nasterii is null");
             return false;
         }
         if(data.length() !=10){
             System.out.println("data nu are fix 10 caractere");
             return false;       
         }
         if(data.indexOf("-")!=2 || data.lastIndexOf("-")!=5){
             System.out.println("data nu este in format valid: zz-ll-aaaa");
             return false;
         }
         String[] elemente = data.split("-");
         if(elemente.length !=3){
             System.out.println("data nu este in format corect: zz-ll-aaaa");
             return false;
         }
         
         int zi =Integer.parseInt(elemente[0]);
         if(zi < 1 || zi > 31){
             System.out.println("ziua: " + zi + " este invalida");
             return false;
         }
             
         int luna =Integer.parseInt(elemente[1]);
         if(luna < 1 || luna > 12){
             System.out.println("luna: " + luna + " luna nu este valida");
             return false;
         }
         int an =Integer.parseInt(elemente[2]);
         return true;
     }
//     private static boolean valideazaTelefon(String telefon){
//         if(telefon.length() < 10){
//             System.out.println("Numarul este invalid");
//             return false;
//         }
//         return true;
//         
//     }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAn() {
        return an;
    }

    public int getLuna() {
        return luna;
    }

    public int getZi() {
        return zi;
    }

    public String getTelefon() {
        return telefon;
    }
    public String getDataNasterii_asSTR(){
        return zi + "-" + luna + "-" + an;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (this.an != other.an) {
            return false;
        }
        if (this.luna != other.luna) {
            return false;
        }
        if (this.zi != other.zi) {
            return false;
        }
        if (!Objects.equals(this.nume, other.nume)) {
            return false;
        }
        if (!Objects.equals(this.prenume, other.prenume)) {
            return false;
        }
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        return true;
    }
    
    public boolean filtruNepersonalizat(String sFarama){
        if (nume.toLowerCase().contains(sFarama) || prenume.toLowerCase().contains(sFarama) || telefon.toLowerCase().contains(sFarama) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  nume + " " + prenume + ", " + zi + "-" + luna + "-" + an + ", " + telefon ;
    }


 
}
