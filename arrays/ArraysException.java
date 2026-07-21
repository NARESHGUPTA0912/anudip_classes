class ArraysException {
    public static void main(String[] args) {

        // 1) NegativeArraySizeException
        // int []arr = new int[-5];

        // 2) NullPointerException
        // String[] arr = new String[5];
        // System.out.println(arr[0].charAt(2));

        // 3) ArrayIndexOutOfBoundsException
        // int[] arr = new int[0];
        // System.out.println(arr[0]);

        // 4) ArrayStoreException
        // Object[] arr = new String[5];
        // arr[0] = 10;

        // 5) ClassCastException
        Object[] objArray = new Object[]{"Apple", "Banana", "Cherry"};
        String[] strArray = (String[]) objArray;
        System.out.println(strArray[0]);
    }
}