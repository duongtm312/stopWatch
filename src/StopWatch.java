public class StopWatch {
    double startTime, endTime;

    public void start() {
        this.startTime = System.currentTimeMillis()/1000;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis()/1000;
    }
  public double getElapsedTime(){
        return this.endTime-this.startTime;
  }
}
