package gent.datastructureandalgorithms.binarysearch;

class Main {
    public static void main(String[] args) {

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};


        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 7));
        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(iterativeBinarySearch(intArray, 8888));


        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length, -15));
        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length, 7));
        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length, 55));
        System.out.println(recursiveBinarySearch(intArray, 0, intArray.length, 8888));

    }


    public static int iterativeBinarySearch(int[] vargu , int vlera){
        int starti  = 0 ;
        int endi = vargu.length;

        while (starti<endi){
            int mesi = starti + (endi - starti) / 2;

            if (vargu[mesi] == vlera){
                return vlera;
            } else if (vargu[mesi] > vlera){
                endi = mesi;
            } else if(vargu[mesi] < vlera){
                starti = mesi +1;
            }
        }
        return  -1;
    }


    public static int recursiveBinarySearch(int[] input, int start, int end, int value){

        if (start >= end) {
            return -1;
        }

        int midpoint = start + (end - start) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] > value) {
            return recursiveBinarySearch(input, start, midpoint, value);
        } else {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
    }


}
