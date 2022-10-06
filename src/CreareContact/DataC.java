package CreareContact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**@author Aysel */
public class DataC {
    
    private List<Contact> contact = new ArrayList<>();
    
    public DataC(){
        fillListaContacte();
    }

    private void fillListaContacte() {
        contact.add(Contact.getInstance("Ion", "Maria","10-12-2001", "0769929357"));
        contact.add(Contact.getInstance("Vlad", "Mihai","23-11-2000", "0765523476"));
        contact.add(Contact.getInstance("Mares", "Rares", "01-03-1998", "0256295487"));
        contact.add(Contact.getInstance("Andronache", "Camelia","07-05-1995","0367183892"));
        contact.add(Contact.getInstance("Balea","Daria", "10-01-1995", "0234547383"));
        
    }
    private void fillListaContactFroDataBase(){
        
    }
    
    public List<Contact> getAllContacts(){
        return contact;
    }
    private Predicate<Contact> getFilter(eFiltrare eFiltru, String sFarama){
        switch (eFiltru){
        case eFiltrareNumarFix:
            return (p) -> p.getTelefon().toLowerCase().contains(sFarama.toLowerCase());
        case eFiltrareNumarMobil:
            return (p) -> p.getTelefon().toLowerCase().contains(sFarama.toLowerCase());
        case eFiltrareDataNastereAzi:
           return (p) -> (boolean) p.getDataNasterii_asSTR().toLowerCase().contains(sFarama.toLowerCase());
        case eFiltrareDataNastereLuna:
            return (p) -> (boolean) p.getDataNasterii_asSTR().toLowerCase().contains(sFarama.toLowerCase());
        case eFiltrarePersonalizata:
           return (p) -> p.filtruNepersonalizat(sFarama);
        default:
            return (p) -> true;
    }
    }
    private Comparator<Contact> getOrdine(eOrdonare eOrdine){
        Comparator<Contact> comp = null;
        switch (eOrdine){
            case eOrdonareNume:
                return (p1, p2) -> p1.getNume().compareToIgnoreCase(p2.getNume());
            case eOrdonarePrenume:
                return (p1, p2) -> p1.getPrenume().compareToIgnoreCase(p2.getPrenume());
            default:
            case eOrdonareDataNastere:
                return (p1, p2) -> p1.getDataNasterii_asSTR().compareToIgnoreCase(p2.getDataNasterii_asSTR());
        }
    }
    public List<Contact> getContacteDeAfisat(eFiltrare eFiltru, String sFarama, eOrdonare eOrdine){
        Predicate<Contact> filtru = getFilter(eFiltru,sFarama);
        Comparator<Contact> comp = getOrdine(eOrdine);
        
        List<Contact> contacteDeAfisat = contact.stream()
                .filter(filtru)
                .sorted(comp)
                .collect(Collectors.toList());
        
        return contacteDeAfisat;
    }
    
    public boolean stergeContact(Contact contacte){
        return contact.remove(contacte);
    }
    public boolean modificareContact(Contact cSelectat, Contact cEditat){
        if(!cSelectat.getNume().equals(cEditat.getNume())){
            System.out.println("Something is wrong!");
            return false;
        }
       int idxContact = getIdxContact(cSelectat);
       if(idxContact >= 0){
           contact.set(idxContact, cEditat);
           return true;
       }
       return false;
    }
    public int getIdxContact(Contact c){
        for(int i = 0; i < contact.size(); i++){
            if(contact.get(i).getNume() == c.getNume()){
                return i;
            }
        }
        return -1;
    }
    public boolean adaugaContact(Contact cAdd){
        if(getIdxContact(cAdd) >= 0){
            System.out.println("Contactul cu aceaste date deja exista in lista" );
            return false;
        }
        contact.add(cAdd);
        return true;
    }
    
}
