
import java.util.Random;

public class StopWatch {
    private double startTime;
    private double endTime;

    private StopWatch(){
    }

    private StopWatch(double startTime){
        this.startTime=startTime;
    }

    private double getStartTime() {
        return startTime;
    }

    private double getEndTime() {
        return endTime;
    }

    private void setStart(double startTime) {
        this.startTime = System.currentTimeMillis();
    }

    private void setStop(double endTime) {
        this.endTime = System.currentTimeMillis();
    }
    private double getElapsedTime(){
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        double startTime = 0;
        double endTime=0;
        stopWatch.setStart(startTime);
        System.out.println("Start Time:"+stopWatch.getStartTime());
        int[] array=new int[100];
        Random random = new Random();
        for (int i=0;i<100;i++){
            array[i]=random.nextInt(100);
        }
        int tempSort;
        for (int i = 0; i < 100 - 1; i++) {
            for (int j = 100 - 1; j >= 1; j--) {

                if (array[j] < array[j - 1]) {
                    tempSort = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tempSort;
                }
            }
        }
        stopWatch.setStop(endTime);
        System.out.println("End Time:"+stopWatch.getEndTime());
        System.out.println("Time process:"+stopWatch.getElapsedTime());
    }
}
