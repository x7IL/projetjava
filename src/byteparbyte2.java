import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class byteparbyte2 extends JFrame {

    String cc = "salut";

    public byteparbyte2(){
        setTitle("VLC Wish");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose_on_close permet de libérer les ressource de la frame et si c'est la dernière ca rend la main
        setSize(new Dimension(1000,1000)); // bien mettre ce avant la localisation
        setLocationRelativeTo(null);// on centre la fenetre

        //ajoute le bar de menu //helper menu peux etre ??
        //il faudra mettre la bar de menu apres la fenetre de fichier
        MenuBar mbr=new MenuBar();
        Menu mnuInsert=new Menu("Extension");
        mbr.add(mnuInsert);
        CheckboxMenuItem ext1=new CheckboxMenuItem(".mp4");
        ext1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e)
            {
                //mettre le code de ce qu'on veut faire si la case ext1 est coché
                //attention le code ne gère pas la décoche si on ne met pas de condition
                if(ext1.getState()){
                    setTitle("VLC Wish 2");
                }
                else{
                    setTitle("VLC Wish");
                }
            }
        });
        CheckboxMenuItem ext2=new CheckboxMenuItem(".avi");
        CheckboxMenuItem ext3=new CheckboxMenuItem(".mp3");
        mnuInsert.add(ext1);
        mnuInsert.add(ext2);
        mnuInsert.add(ext3);
        setMenuBar(mbr);

        //on set la fenetre
        JPanel contentpane = (JPanel) getContentPane();
        contentpane.setLayout(new BorderLayout()); //les 20 c'est pour les marges autour des objects
        //zone de texte multiligne
        JTextArea ZoneTexteArea = new JTextArea();
        ZoneTexteArea.setBackground(Color.black);
        ZoneTexteArea.setForeground(Color.white);
        contentpane.add(ZoneTexteArea);
        //premier boutton
        JButton PushMe1 = new JButton("1er_bouton");
        PushMe1.addActionListener(new ActionListener(){  // donne l'action au bouton
            public void actionPerformed(ActionEvent evt){ // quand l'action evt ce produit avec la barre espace
                cc = ZoneTexteArea.getText();
                ZoneTexteArea.setText("");
            }
        });

        //affichage de texte
        JLabel ZoneAffichageAuteur = new JLabel("Auteur :   "+cc); // on peut afficher les truc recuperer dans des variables !!!!!
        ZoneAffichageAuteur.setForeground(Color.white);
        JLabel ZoneAffichageTitre = new JLabel("Titre :     "+cc);
        ZoneAffichageTitre.setForeground(Color.white);
        JLabel ZoneAffichageDateC = new JLabel("Date de création :     "+cc);
        ZoneAffichageDateC.setForeground(Color.white);
        JLabel ZoneAffichageTitre3 = new JLabel("Titre :     "+cc);
        ZoneAffichageTitre3.setForeground(Color.white);
        ZoneAffichageAuteur.setMaximumSize(new Dimension(20,0));
        //fenetre dossier
        JPanel panel1 = new JPanel(); //ma fenetre gauche
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.black);
        panel1.setForeground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        panel1.setPreferredSize(new Dimension(200,0));
        //contentpane.add(panel1,BorderLayout.WEST);
        //panel1.add(PushMe1,BorderLayout.CENTER);
        //panel1.add(PushMe1);

        //la scrollbar pour la fenetre de dossier
        JScrollPane JCB = new JScrollPane(new JTree());
        JCB.setPreferredSize(new Dimension(200,0));
        contentpane.add(JCB,BorderLayout.WEST);
        //fenetre info
        JPanel panel2 = new JPanel(); // ma fenetre au sud pour les info
        panel2.setLayout(new GridLayout(4,1)); // ligne, colonne
        panel2.setBackground(Color.black);
        panel2.setForeground(Color.white);
        panel2.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        JScrollPane JSP = new JScrollPane(panel2);
        contentpane.add(panel2,BorderLayout.SOUTH);
        panel2.add(ZoneAffichageTitre);
        panel2.add(ZoneAffichageAuteur);
        panel2.add(ZoneAffichageDateC);
        panel2.add(ZoneAffichageTitre3);
        panel2.setPreferredSize(new Dimension(0,50));
        //zone de texte recherche (pas besoin de boutton on va faire la recherche en temps réel)
        JTextField ZoneDeTexte = new JTextField("edit me");
        ZoneDeTexte.setBackground(Color.black);
        ZoneDeTexte.setForeground(Color.white);
        contentpane.add(ZoneDeTexte,BorderLayout.NORTH); //fenetre a ecrire
    }

    public static void main(String[] args) throws Exception {

        //mettre un look
        UIManager.setLookAndFeel(new NimbusLookAndFeel()); //look nimbus

        //créer la fenetre avec le constructeur DebutFenetre
        byteparbyte2 fenetre = new byteparbyte2();
    }
}