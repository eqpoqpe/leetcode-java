```
[0, 0, 1, 2, 2]

loop the array, when some index'value not eq 0,
settings check_lock be true,
and break the loop. Got a new int[] ([2, 2, 1]) reversed from array.

index=0 => 2   { array[index=0]*10**index=0 };
index=1 => 20  { array[index=1]*10**index=1 };
index=2 => 200 { array[index=2]*10**index=2 };

result_first = 221;
result = result_first + 1 => 222;
```
