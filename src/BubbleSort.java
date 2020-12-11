class BubbleSort {


    private void swap(int [] array,int position_1, int position_2) {
        int buffer = array[position_1];
        array[position_1] = array[position_2];
        array[position_2] = buffer;
    }

    void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i]>array[j]){
                    swap(array,i,j);
                }
            }
        }
    }
}
