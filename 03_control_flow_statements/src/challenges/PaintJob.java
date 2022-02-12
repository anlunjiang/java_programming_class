package challenges;

public class PaintJob {

    public static int getBucketCount(
        double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        int numBuckets = (int) Math.ceil((width * height) / areaPerBucket) - extraBuckets;
        return Math.max(numBuckets, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int numBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        return Math.max(numBuckets, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int numBuckets = (int) Math.ceil(area / areaPerBucket);
        return Math.max(numBuckets, 0);
    }

    public static void main(String[] args) {
        int ret = getBucketCount(3.26, 0.75);
        System.out.println(ret);
    }
}
