from random import randint
from searching import linear_search, jump_search, binary_search

sorted_list = list(range(1, 5000))
search_value = randint(1, 4999)

def test_linear_search(benchmark):
    benchmark(linear_search, sorted_list, search_value)

def test_jump_search(benchmark):
    benchmark(jump_search, sorted_list, search_value, 10)

def test_binary_search(benchmark):
    benchmark(binary_search,sorted_list,search_value)
print(linear_search(sorted_list,search_value))
print(binary_search(sorted_list,search_value))
