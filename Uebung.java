public class Uebung {
    private String name;
    private String dozent;
    Student[] zertifizierteTeilnehmer;
    private int anzahlZertifizierte;

    public Uebung( String name, String dozent, int maxTeilnehmer){
        this.name = name;
        this.dozent = dozent;
        this.zertifizierteTeilnehmer = new Student[maxTeilnehmer];
        this.anzahlZertifizierte = 0;
    }

    public int  zertifikatErwerben(Student student){
        if(anzahlZertifizierte >= zertifizierteTeilnehmer.length){
            System.out.println("voll");
            return anzahlZertifizierte;
        }
        if(hatZertifikat(student)){
            System.out.println("already certified");
            return anzahlZertifizierte;
        }
        this.zertifizierteTeilnehmer[anzahlZertifizierte] = student;
        this.anzahlZertifizierte +=1;
        return anzahlZertifizierte;
    }


    public boolean hatZertifikat(Student student){
        for (Student zertifizierterTeilnehmer: zertifizierteTeilnehmer){
            if (zertifizierterTeilnehmer.equals(student)){
                return true;
            }
        }
        return false;
    }

    public void print(){
        System.out.println("Veranstaltungstyp: Uebung");
        System.out.println("Name der Vdranstaltung: " + name);
        System.out.println("Dozent: " + dozent);
        if ( anzahlZertifizierte >0){
            System.out.println("Zertifizierte teilnehmer: " );
            for (int i = 0; i< anzahlZertifizierte; i++){
            System.out.println("-" + zertifizierteTeilnehmer[i]);
            }
        }
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDozent() {
        return dozent;
    }
    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    
}
