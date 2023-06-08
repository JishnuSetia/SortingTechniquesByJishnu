def bubbleSort(arr):
    i = 0
    while i<len(arr)-1:
        j=0
        while j<len(arr)-1-i:
            if arr[j]>arr[j+1]:
                tmp = arr[j+1]
                arr[j+1] = arr[j]
                arr[j] = tmp
            j+=1
        i+=1

arr = [4,23,6,1,5,7,8,20]
print(arr)
print()
bubbleSort(arr)
print(arr)


