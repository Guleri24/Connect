
package Guleri;
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
 class StoriesData  {

     static private int choice;
     static private Scanner in = new Scanner(System.in);
     static Desktop UriCall = Desktop.getDesktop();

     void DataOvercomingTheMonster() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Jurassic Park\n" +
                 " \n 2.  James Bond\n" +
                 " \n 3.  Rocky franchise\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchOverComingTheMonster(choice);
     }

     void DataRagsToRiches() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Bad Investment\n" +
                 " \n 2.  Defying Conventional Wisdom\n" +
                 " \n 3. The Way I Work\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchRagsToRiches(choice);

     }

     void DataTheQuest() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  A Naturalist’s Voyage Round the WorldJurassic Park\n" +
                 " \n 2.  The Adventures of Huckleberry Finn\n" +
                 " \n 3.  The Alchemist\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchTheQuest(choice);
     }

     void DataVoyageAndReturn() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Alice in Wonderland\n" +
                 " \n 2.  Orpheus and Eurydice\n" +
                 " \n 3.  .G. Well's The Time Machine\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchVoyageAndReturn(choice);
     }

     void DataComedy() throws Exception {
         System.out.println("welcome abhishek please add data");

     }

     void DataTragedy() throws Exception {
         System.out.println("welcome abhishek please add data");

     }

     void DataRebirth() throws Exception {
         System.out.println("welcome abhishek please add data");

     }

     void DataRandom() throws Exception{
         System.out.println("welcome abhishek please add data");

     }

   private  void switchOverComingTheMonster(int choice) throws Exception {
         switch (choice) {
             case 1: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("http://www.ompersonal.com.ar/OMFIRST/JurassicPark-MichaelCrichton.pdf"));
             }
             break;
             case 2: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.fadedpage.com/books/20151102/html.php"));
             }
             break;
             case 3: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.empireonline.com/movies/features/rocky-complete-history/"));
             }
             break;
             default: {
                 System.out.println("\033[7;32m Invalid Entry \033[7;33m");
             }
         }
     }

  private   void switchRagsToRiches(int choice) throws Exception {
         switch (choice) {
             case 1: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.ngo-monitor.org/soros.pdf"));
             }
             break;
             case 2: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("http://www.oracle.com/us/corporate/profit/p27anniv-timeline-151918.pdf"));
             }
             break;
             case 3: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.inc.com/magazine/201306/liz-welch/the-way-i-work-john-paul-dejoria-john-paul-mitchell-systems.html"));
             }
             break;
             default: {
                 System.out.println("\033[7;32m Invalid Entry \033[7;33m");
             }

         }
     }
   private   void switchTheQuest(int num) throws Exception{
         switch (choice) {
             case 1: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("http://s-f-walker.org.uk/pubsebooks/pdfs/Voyage-of-the-Beagle.pdf"));
             }
             break;
             case 2: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://contentserver.adobe.com/store/books/HuckFinn.pdf"));
             }
             break;
             case 3: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.alrashed-alsaleh.com/uploads/posts/0a3b13b476ac67bbf142c769830c1d6b.pdf"));
             }
             break;
             default: {
                 System.out.println("\033[7;32m Invalid Entry \033[7;33m");
             }

         }
     }
   private   void switchVoyageAndReturn(int num) throws Exception{
         switch (choice) {
             case 1: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.adobe.com/be_en/active-use/pdf/Alice_in_Wonderland.pdf"));
             }
             break;
             case 2: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("http://classictales.educ.cam.ac.uk/stories/metamorphoses/orpheusandeurydice/transcriptorpheusandeurydice.pdf"));
             }
             break;
             case 3: {
                 System.out.println(" web-page open where you can read the story ->>>> ");
                 UriCall.browse(new URI("https://www.fourmilab.ch/etexts/www/wells/timemach/timemach.pdf"));
             }
             break;
             default: {
                 System.out.println("\033[7;32m Invalid Entry \033[7;33m");
             }

         }

     }
    private void switchComedy(int num) throws Exception{

     }
    private void switchTragedy(int num) throws Exception{

     }
   private   void switchRebirth(int num) throws Exception{

     }
  private    void switchRandom(int num) throws Exception{

     }
 }

