
package Guleri;

class StoriesDataAccess {
    StoriesData DataAccess = new StoriesData();

    void OvercomingTheMonsterAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataOvercomingTheMonster();
    }

    void RagsToRichesAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataRagsToRiches();

    }

    void TheQuestAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataTheQuest();
    }

    void VoyageAndReturnAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataVoyageAndReturn();
    }

    void ComedyAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataComedy();
    }

    void TragedyAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataTragedy();
    }

    void RebirthAccess() {
        System.out.println("Choose the story to read :");
        DataAccess.DataRebirth();
    }

    void RandomAccess() {
        DataAccess.DataRandom();
    }
}
