# 01. 선택 정렬


```
// 오름차순으로 정렬하라
1 10 5 8 7 6 4 3 2 9
```

### 작은 것을 앞으로 보내자
1 10 5 8 7 6 4 3 2 9
1 2 5 8 7 6 4 3 10 9
1 2 3 8 7 6 4 5 10 9
1 2 3 4 7 6 8 5 10 9
...
1 2 3 4 5 6 7 8 9 10
    
### code
```c
#include <stdio.h>

int main(int argc, char* argv[]) {
	printf("01. Selection Sort\n");
	int i,j ,min,index,temp;
	
	int array[10] ={1,2,3,4,5,6,7,8,9,10};
	
	for(i=0;i<10;i++){
		min=9999;
		for(j=i;j<10;j++){
			if(min >array[j]){
				min = array[j];
				index=j;
			}
		}
		temp = array[i];
		array[i]=array[index];
		array[index]=temp;
	}
	
	for(i=0;i<10;i++){
		printf("%d  ",array[i]);
	}
	return 0;
}
```


## 시간복잡도
10 * (10 + 1)/2 = 55
=> N * (N+1)/2
=> O(N*N)
=> O(N^2)