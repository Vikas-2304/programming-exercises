//A tad bit unnecessarily lengthy solution for what could've been a one line return statement!!! 
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int[] hourArray = getHours(seconds);
    int[] minArray = getMinutes(hourArray[1]);
    return String.format("%02d:%02d:%02d", hourArray[0], minArray[0], minArray[1]);
  }

  public static int[] getHours(int seconds) {
    int[] qAndR = new int[2];
    qAndR[0] = Math.floorDiv(seconds, 3600);
    qAndR[1] = seconds % 3600;
    return qAndR;
  }

  public static int[] getMinutes(int remainderOfHours) {
    int[] qAndR = new int[2];
    qAndR[0] = Math.floorDiv(remainderOfHours, 60);
    qAndR[1] = remainderOfHours % 60;
    return qAndR;
  }
}
