def selection_sort(unsorted: list) -> list:

    for i in range(0, len(unsorted) - 1):
        min = i

        for j in range(i + 1, len(unsorted)):
            if unsorted[j] < unsorted[min]:
                min = j

        if min != i:
            unsorted[i], unsorted[min] = unsorted[min], unsorted[i]

    return unsorted

def insertion_sort(unsorted: list) -> list:
    for i in range(1,len(unsorted)):
        key=unsorted[i]
        behind=i-1
        while(behind>=0 and key<unsorted[behind]):
            unsorted[i]=unsorted[behind]
            behind=behind-1
        unsorted[behind+1]=key
    return unsorted


def bubble_sort(unsorted: list) -> list:

    for i in range(0, len(unsorted)):
        for j in range(0, len(unsorted) - 1 - i):
            if unsorted[j] > unsorted[j + 1]:
                unsorted[j], unsorted[j + 1] = unsorted[j + 1], unsorted[j]

    return unsorted
