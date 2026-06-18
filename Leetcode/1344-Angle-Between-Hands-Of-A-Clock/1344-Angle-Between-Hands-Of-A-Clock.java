class Solution {
    final float HOURS_ANGLE_RATIO = 360 / 12;
    final float MINUTES_ANGLE_RATIO = 360 / 60;

    public double angleClock(int hour, int minutes) {
        float hourAngle = (float) hour * HOURS_ANGLE_RATIO + (float) minutes / 2;
        float minutesAngle = (float) minutes * MINUTES_ANGLE_RATIO;
        float result = Math.abs(hourAngle % 360 - minutesAngle % 360);

        return Math.min(result, 360 - result);
    }
}
