class FindIndex{
    int findIndex(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1; 
        }
        return mid;
    }
 
    public static void main(String args[])
    {
        FindIndex object = new FindIndex();
        int arr[] = { 0, 1, 2, 3, 10};
        int key = 4;
        int index = object.findIndex(arr, key);
        System.out.println("index = " + index);
    }
}

