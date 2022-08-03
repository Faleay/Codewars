class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        int d = v2-v1;
        double time = g/(double)d;
        return v2 > v1 ? new int[]{(int)time, (int)(time*60)%60, (int)(time*3600)%60} : null;
    }
}