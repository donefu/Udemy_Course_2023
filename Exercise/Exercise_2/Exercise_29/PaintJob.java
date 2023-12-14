package Exercise_29;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        // double height = 7.25;
        // double width = 4.3;
        // double areaPerBucket = 2.35;
        // double area = (width * height) / areaPerBucket;
        // System.out.println(area);
        // int result = (int) Math.ceil(area);
        // System.out.println(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double area = (width * height) - (areaPerBucket * extraBucket);
        int bucketNeeded = (int) Math.ceil((area / areaPerBucket));
        return bucketNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = (width * height) / areaPerBucket;
        int bucketNeeded = (int) Math.ceil(area);
        return bucketNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int bucketNeeded = (int) Math.ceil(area / areaPerBucket);
        return bucketNeeded;
    }
}
