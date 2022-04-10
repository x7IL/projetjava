import java.io.File;
public class supp {
    public static void main(String[] args) {
        try{

            File file = new File("/Users/wx/IdeaProjects/projet java/compressed.zip");

            if(file.delete()){
                System.out.println(file.getName() + " est supprimé.");
            }else{
                System.out.println("Opération de suppression echouée");
            }
            File dossier = new File("c:\\dossier_log");

            if(dossier.delete()){
                System.out.println(dossier.getName() + " est supprimé.");
            }else{
                System.out.println("Opération de suppression echouée");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}