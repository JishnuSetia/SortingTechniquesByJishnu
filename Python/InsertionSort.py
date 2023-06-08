def insertionSort(arr):
    i=1
    while i<len(arr):
        if arr[i]<arr[i-1]:
            a = i
            while not a<1:
                if arr[a]>arr[a-1]:
                    break
                tmp = arr[a-1]
                arr[a-1] = arr[a]
                arr[a] = tmp
                a-=1
        i+=1        

arr = [4,23,6,1,5,7,8,20]
print(arr)
print()
insertionSort(arr)
print(arr)