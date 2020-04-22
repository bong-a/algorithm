# 04.퀵 정렬

대표적인 `분할 정복` 알고리즘

특정한 값을 기준으로 큰숫자와 작은 숫자를 나누면 어떨까?

특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나눈다.
퀵 정렬에는 기준 값이 있다. 이를 피벗(pivot)이라고 한다.
보통 첫번째 원소를 피벗값으로 설정하고 사용한다.

```
    ->                <-
[3] (7) 8 1 5 9 6 10 (2) 4
[3] (2) 8 1 5 9 6 10 (7) 4
[3] 2 1 8 5 9 6 10 7 4
([1] 2) 3 ([8] 5 9 6 10 7 4)
(1 [2]) 3 ([8] 5 9 6 10 7 4)
1 2 3 ([8] 5 (9) 6 10 7 (4))
1 2 3 ([8] 5 (4) 6 10 7 (9))
...
1 2 3 4 5 6 7 8 9 10
```


![img](https://gmlwjd9405.github.io/images/algorithm-quick-sort/quick-sort-concepts.png)

출처 : https://gmlwjd9405.github.io/2018/05/10/algorithm-quick-sort.html



### code

```c
void quickSort(int *data, int start,int end){
	if(start>=end){//원소가 1개인 경우
		return;
	}
	
	int key = start; //키는 첫번째 원소
	int i = start +1;
	int j = end;
	int temp;
	
	while(i<=j){ //엇갈릴 때까지 반복
		while(data[i]<=data[key]){ //키 값보다 큰 값을 만날 때까지
			i++;
		}
		while(data[j]>=data[key]&& j > start){ //키 값보다 작은 값을 만날 때까지
			j--;
		}
		if(i > j){ //현재 엇갈린 상태라면 키값 교체
			temp = data[j];
			data[j]=data[key];
			data[key]=temp;
		}else{
			temp = data[j];
			data[j]=data[i];
			data[i]=temp;
		}
	}
	quickSort(data,start,j-1);
	quickSort(data,j+1,end);
}

int main(int argc, char* argv[]) {
    printf("03. Quick Sort\n");
    int i,j ,min,index,temp;
    int array[10] ={1,10,5,8,7,6,4,3,2,9};
    quickSort(array,0,10);
    for(i=0;i<10;i++){
        printf("%d  ",array[i]);
    }
    return 0;
}

```



### 시간 복잡도

평균 속도 : O(N*logN)

최악 시간 복잡도  = O(N^2)
- 이미 정렬되어 있는 경우



내림차순으로 바꿀려면 다음 부분을 바꿔준다.

```
while(data[i]>=data[key]){ //키 값보다 큰 값을 만날 때까지
	i++;
}
while(data[j]<=data[key]&& j > start){ //키 값보다 작은 값을 만날 때까지
	j--;
}
```



