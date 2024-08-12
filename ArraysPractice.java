public class ArraysPractice {
    public static void main(String[] args) {
        // int nums[] = new int[4];
        // int nums[] = { 3, 7, 2, 4 };
        // nums[1] = 6;
        // nums[0] = 4;
        // nums[1] = 6;
        // nums[2] = 3;
        // nums[3] = 5;

        // for (int i = 0; i <= nums.length - 1; i++) {
        // System.out.println(nums[i]);
        // }
        // System.out.println(nums[1]);

        int nums[][] = new int[3][4];

        // (int)Math.random() * 100;
        // arr[0][0] = 10;
        // arr[0][1] = 11;
        // arr[0][2] = 12;
        // arr[1][1] = 15;
        // arr[1][2] = 16;
        // arr[1][3] = 17;
        // arr[2][0] = 18;
        // arr[2][1] = 19;
        // arr[2][2] = 20;
        // arr[2][3] = 20;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // System.out.print(arr[i][j]);
                nums[i][j] = (int) (Math.random() * 100);
                // System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
