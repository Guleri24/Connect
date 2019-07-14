
package Guleri;

class StoriesDataAccess {
    StoriesData DataAccess = new StoriesData();

    void OvercomingTheMonsterAccess() throws Exception{
        System.out.println("Choose the story to read :");
        DataAccess.DataOvercomingTheMonster();
    }

    void RagsToRichesAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataRagsToRiches();

    }

    void TheQuestAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataTheQuest();
    }

    void VoyageAndReturnAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataVoyageAndReturn();
    }

    void ComedyAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataComedy();
    }

    void TragedyAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataTragedy();
    }

    void RebirthAccess() throws Exception {
        System.out.println("Choose the story to read :");
        DataAccess.DataRebirth();
    }

    void RandomAccess() throws Exception {
        DataAccess.DataRandom();
    }
}
 }

