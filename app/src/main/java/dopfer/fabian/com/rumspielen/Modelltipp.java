package dopfer.fabian.com.rumspielen;

public class Modelltipp {

    String Name;
    String Ziel;
    String Benutzer;
    String Text;


    public Modelltipp(String name, String ziel, String benutzer, String text) {
        Name = name;
        Ziel = ziel;
        Benutzer = benutzer;
        Text = text;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getZiel() {
        return Ziel;
    }

    public void setZiel(String ziel) {
        Ziel = ziel;
    }

    public String getBenutzer() {
        return Benutzer;
    }

    public void setBenutzer(String benutzer) {
        Benutzer = benutzer;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
