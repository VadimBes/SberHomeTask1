class BinarySearch {


    int binarySearch(int[] array, int searchEl, int low, int high) {
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if (array[midPoint] < searchEl) {
                low = midPoint + 1;
            } else {
                if (array[midPoint] > searchEl){
                    high = midPoint - 1;
                } else {
                    return midPoint;
                }
            }
        }
        return -1;

    }

}
