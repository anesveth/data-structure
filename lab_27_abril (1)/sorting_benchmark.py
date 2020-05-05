from random import sample, randint
from sorting import selection_sort, bubble_sort, insertion_sort

unsorted_list1 = sample(range(1, 5000), 4999)
sorted_list1 = list(range(1, 5000))

unsorted_list2 = sample(range(1,20),19)
sorted_list2 = list(range(1, 20))

unsorted_list3 = sample(range(1, 1000), 999)
sorted_list3 = list(range(1, 1000))


def test_selection_sort_fivethousand(benchmark):
    result = benchmark(selection_sort, unsorted_list1)
    assert result == sorted_list1
def test_bubble_sort_fivethousand(benchmark):
    result = benchmark(bubble_sort, unsorted_list1)
    assert result == sorted_list1
def test_insertion_fivethousand(benchmark):
    result=benchmark(insertion_sort,unsorted_list1)
    assert result == sorted_list1
################## - 2
# def test_selection_sort_twenty(benchmark):
#     result = benchmark(selection_sort, unsorted_list2)
#     assert result == sorted_list2
# def test_bubble_sort_twenty(benchmark):
#     result = benchmark(bubble_sort, unsorted_list2)
#     assert result == sorted_list2
# def test_insertion_sort_twenty(benchmark):
#     result=benchmark(insertion_sort,unsorted_list2)
#     assert result == sorted_list2
# ################## - 3
# def test_selection_sort_1000(benchmark):
#     result = benchmark(selection_sort, unsorted_list3)
#     assert result == sorted_list3
# def test_bubble_sort_1000(benchmark):
#     result = benchmark(bubble_sort, unsorted_list3)
#     assert result == sorted_list3
# def test_insertion_sort_1000(benchmark):
#     result=benchmark(insertion_sort,unsorted_list3)
#     assert result == sorted_list3




