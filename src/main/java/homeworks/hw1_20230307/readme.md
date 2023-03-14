####Описание задания.
1. Palindrome Number
   Given an integer x, return true if x is a palindrome, and false otherwise.

2. Find the element that appears once in a sorted array
   Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.

####Decision Algorithms.
1. (1) Mit StringBuilder
`
start
Number input: a

declare numberString = a
create StringBuilder from numberString
reverse StringBuilder
if (StringBuilder = numberString) true
else false

print isPalidrome
end`
2. (1) Mit Char Array
`
start
Number input: a

METHOD
declare data (char array) = a
declare j = last element array
declare i = 0
while (i < j)
if data[i] != data[j] then exit from method with FALSE
i++ and j--
end while exit from method with TRUE

print isPalidrome
end`

3. (2) Find one Number in SortArray
`
start
Sorted Array init: sortArray

METHOD (original = sortArray)
declare i = 0
while (i < original.length)
if ((i + 1 == original.length) || (original[i] != original[i + 1])) exit from method with FOUND INDEX = i
i = i + 2
end while exit from method with FOUND INDEX = -1

declare indexElement = RESULT METHOD
if (==-1) print "No found"
else print "Found number=N"
end
`
