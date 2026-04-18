[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zXGcalOT)
# In_Class_Exercise_2
Consider the following loops:
```java
// Loop A
    for (i = 1; i <= n; i++)
       for (j = 1; j <= 10000; j++)
          sum = sum + j;

// Loop B
for (i = 1; i <= n; i++)
   for (j = 1; j <= n; j++)
      sum = sum + j;

// Loop C
    for (i = 1; i <= n; i++)
       for (j = 1; j <= n; j++)
          for (k = 1; k <= n; k++)
             sum = sum + k;

```
**Task 1:** Although Loop A is O(𝑛)and Loop B is O(𝑛^2), Loop B can be faster than Loop A for small values of n. Design and implement an experiment to find a value of n for which Loop B is faster.


**Task 2:** Although Loop A is O(𝑛)and Loop C is O(𝑛^3), Loop C can be faster than Loop A for small values of n. Design and implement an experiment to find a value of n for which Loop C is faster.

Hint: You may use the below method to find the current time in Java.

```java
current = new Date();                
current.getTime();
```
