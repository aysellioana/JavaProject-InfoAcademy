package CreareContact;

/**@author Aysel */
public class NrMobil extends NrTel{

    public NrMobil(String telefon) {
        super(telefon);
    }

    @Override
    public void validareNumar() {
        if(telefon.length() <10){
            System.out.println("Numarul nu este valid");
        }else{
            System.out.println("Numarul este valid");
        }
    }
        public void valideazaMobil(){
       if(telefon.startsWith("07")){
           System.out.println("Numarul este mobil");
       }else{
           System.out.println("Numarul nu este mobil");
       }
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    
}
