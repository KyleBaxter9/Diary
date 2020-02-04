import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Diary {

    private ArrayList <Job> jobsList = new ArrayList<>();
    private String diaryName;

    public Diary() {

    }

    public Diary(String diaryName) {
        this.diaryName = diaryName;
        this.jobsList = new ArrayList<>();
    }

    public void addJob(Job j) {
        this.jobsList.add(j);
    }

    public void printDiary() {

        System.out.printf("%-20s%-11s%-11s%n", "Description", "Priority", "Completed");

        for (Job job : jobsList) {
            System.out.printf("%-20s%-11d%-11s%n", job.getDescription(), job.getPriority(), job.isCompleted());
        }
    }

    public void searchDiary(String search) {

        System.out.println("Jobs containing the string: " + search);
        System.out.printf("%-20s%-11s%-11s%n", "Description", "Priority", "Completed");

        for (Job job : jobsList) {
            String lower = job.getDescription().toLowerCase();
            if (lower.contains(search)) {
                System.out.printf("%-20s%-11d%-11s%n", job.getDescription(), job.getPriority(), job.isCompleted());
            }
        }
    }

    public void purgeDiary() {
        System.out.println("All current active jobs");
        System.out.printf("%-20s%-11s%-11s%n", "Description", "Priority", "Completed");
        for (Job job : jobsList) {
            if (job.isCompleted() == true) {
                break;
            }else {
                System.out.printf("%-20s%-11d%-11s%n", job.getDescription(), job.getPriority(), job.isCompleted());
            }

        }
    }

    public void sortDiary() {
        Collections.sort(this.jobsList, new Comparator<Job>() {
            @Override
            public int compare(Job job, Job t1) {
                if (job.getPriority() < t1.getPriority()) {
                    return 1;
                } else if(job.getPriority() > t1.getPriority()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
