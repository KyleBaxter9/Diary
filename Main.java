public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Diary diary = new Diary("Workbook");

        Job roof = new Job("Roof", 1);
        Job floor = new Job("Floor", 2);

        roof.markCompleted();

        diary.addJob(roof);
        diary.addJob(floor);

        diary.sortDiary();

       // diary.printDiary();
       // diary.searchDiary("r");
        diary.purgeDiary();

    }
}
