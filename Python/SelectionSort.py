def selectionSort(arr):
    i = 0
    while i<len(arr):
        min = i
        j=i+1
        while j<len(arr):
            if arr[min]>arr[j]:
                min = j
            j+=1    
        tmp = arr[min]
        arr[min] = arr[i]
        arr[i] = tmp
        i+=1   

arr = [4,23,6,1,5,7,8,20]
print(arr)
print()
selectionSort(arr)
print(arr)