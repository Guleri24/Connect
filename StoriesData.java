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
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Now that’s what I call stupid \n" +
                 " \n 2.  MeToo in the Drama Classroom\n" +
                 " \n 3.   I drew a penis with a glue stick on the whiteboard\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchComedy(choice);
     }

     void DataTragedy() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Lamb to the Slaughter \n" +
                 " \n 2.  DEAR MR.FATHER-IN-LAW\n" +
                 " \n 3.  THE LOVE AFFAIR THAT WENT SOUR THAT SUMMER\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchTragedy(choice);
     }

     void DataRebirth() throws Exception {
         System.out.println("\n\033[7;33m" +
                 " \n 1.  Captivate\n" +
                 " \n 2.  The beauty of the butterfly nets\n" +
                 " \n 3.  Bound: Toxic Bite \n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchRebirth(choice);
     }

     void DataRandom() throws Exception{
         System.out.println("\n\033[7;33m Welcome to the random choice :" +
                 "\n Enter any number in between 1 to 21 :\n\n");
         System.out.println("\n\033[7;34mEnter the choice: \033[0m\033[7;33m");
         choice = in.nextInt();
         switchRebirth(choice);
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
        switch (choice) {
            case 1: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://www.wattpad.com/734638468-funny-short-stories-now-that%27s-what-i-call-stupid"));
            }
            break;
            case 2: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://www.theatrefolk.com/blog/metoo-drama-classroom//"));
            }
            break;
            case 3: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://me.me/i/funny-story-my-whole-class-once-got-detention-because-i-074fc024fdbd4a42939c401e0b451b32"));
            }
            break;
            default: {
                System.out.println("\033[7;32m Invalid Entry \033[7;33m");
            }

        }

     }
    private void switchTragedy(int num) throws Exception{
        switch (choice) {
            case 1: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://lewebpedagogique.com/anglais/wp-content/blogs.dir/16/files/lamb-to-the-slaughter.pdf"));
            }
            break;
            case 2: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://yourstoryclub.com/short-stories-funny/funny-short-story-dear-father-in-law/"));
            }
            break;
            case 3: {
                System.out.println(" web-page open where you can read the story ->>>> ");
                UriCall.browse(new URI("https://www.0217.ml/DycpExRpDHqoE1uKDOyGESkqGEcKE11nGOkOJ1gUEE9NDScQFk5LJxqKUyIGI1AnEuuSJyWNTRMKKHNLDy1TEuuPE15MHRZq"));
            }
            break;
            default: {
                System.out.println("\033[7;32m Invalid Entry \033[7;33m");
            }

        }

     }
   private   void switchRebirth(int num) throws Exception{
       switch (choice) {
           case 1: {
               System.out.println(" web-page open where you can read the story ->>>> ");
               UriCall.browse(new URI("https://www.webnovel.com/book/12895115305866205/34615150778575860"));
           }
           break;
           case 2: {
               System.out.println(" web-page open where you can read the story ->>>> ");
               UriCall.browse(new URI("https://www.lepsoc.org/sites/all/themes/nevia/lepsoc/Conservation%20Matters%20-%20Butterfly%20nets.pdf"));
           }
           break;
           case 3: {
               System.out.println(" web-page open where you can read the story ->>>> ");
               UriCall.browse(new URI("https://www.wattpad.com/story/62460445-bound-toxic-bite-book-1"));
           }
           break;
           default: {
               System.out.println("\033[7;32m Invalid Entry \033[7;33m");
           }

       }

     }
  private    void switchRandom(int num) throws Exception{
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
          case 4: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.ngo-monitor.org/soros.pdf"));
          }
          break;
          case 5: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("http://www.oracle.com/us/corporate/profit/p27anniv-timeline-151918.pdf"));
          }
          break;
          case 6: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.inc.com/magazine/201306/liz-welch/the-way-i-work-john-paul-dejoria-john-paul-mitchell-systems.html"));
          }
          break;
          case 7: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("http://s-f-walker.org.uk/pubsebooks/pdfs/Voyage-of-the-Beagle.pdf"));
          }
          break;
          case 8: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://contentserver.adobe.com/store/books/HuckFinn.pdf"));
          }
          break;
          case 9: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.alrashed-alsaleh.com/uploads/posts/0a3b13b476ac67bbf142c769830c1d6b.pdf"));
          }
          break;
          case 10: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.adobe.com/be_en/active-use/pdf/Alice_in_Wonderland.pdf"));
          }
          break;
          case 11: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("http://classictales.educ.cam.ac.uk/stories/metamorphoses/orpheusandeurydice/transcriptorpheusandeurydice.pdf"));
          }
          break;
          case 12: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.fourmilab.ch/etexts/www/wells/timemach/timemach.pdf"));
          }
          break;
          case 13: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.wattpad.com/734638468-funny-short-stories-now-that%27s-what-i-call-stupid"));
          }
          break;
          case 14: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.theatrefolk.com/blog/metoo-drama-classroom//"));
          }
          break;
          case 15: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://me.me/i/funny-story-my-whole-class-once-got-detention-because-i-074fc024fdbd4a42939c401e0b451b32"));
          }
          break;
          case 16: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://lewebpedagogique.com/anglais/wp-content/blogs.dir/16/files/lamb-to-the-slaughter.pdf"));
          }
          break;
          case 17: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://yourstoryclub.com/short-stories-funny/funny-short-story-dear-father-in-law/"));
          }
          break;
          case 18: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.0217.ml/DycpExRpDHqoE1uKDOyGESkqGEcKE11nGOkOJ1gUEE9NDScQFk5LJxqKUyIGI1AnEuuSJyWNTRMKKHNLDy1TEuuPE15MHRZq"));
          }
          break;
          case 19: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.webnovel.com/book/12895115305866205/34615150778575860"));
          }
          break;
          case 20: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.lepsoc.org/sites/all/themes/nevia/lepsoc/Conservation%20Matters%20-%20Butterfly%20nets.pdf"));
          }
          break;
          case 21: {
              System.out.println(" web-page open where you can read the story ->>>> ");
              UriCall.browse(new URI("https://www.wattpad.com/story/62460445-bound-toxic-bite-book-1"));
          }
          break;
          default: {
              System.out.println("\033[7;32m Invalid Entry \033[7;33m");
          }
      }
     }
 }

