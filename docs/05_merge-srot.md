# 병합 정렬
병합 정렬도 `분할 정복`방법을 채택한 알고리즘

정확히 반절씩 나눈다는 점에서 최악의 경우에도 O(N*logN)을 보장

일단 쪼개고 나중에 합친다.

- 항상 반으로 쪼갠다 -> logN이 되도록 함
- 합치는 순간에 정렬한다.

![img](https://gmlwjd9405.github.io/images/algorithm-merge-sort/merge-sort-concepts.png)

출처 : https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html



### 코드

```c
void merge(int a[],int m,int middle,int n){
	int i = m;
	int j = middle +1;
	int k = m;
	
	//작은 순서대로 배열에 삽입
	while(i<=middle && j<=n){
		if(a[i] <= a[j]){
			sorted[k]=a[i];
			i++;
		}else{
			sorted[k]=a[j];
			j++;
		}
		k++;
	}
	//남은 데이터도 삽입
	if(i>middle){
		for(int t = j;t<=n;t++){
			sorted[k]=a[t];
			k++;
		}
	}else{
		for(int t = i;t<=middle;t++){
			sorted[k]=a[t];
			k++;
		}
	}
	//정렬된 배열을 삽입
	for(int t=m;t<=n;t++){
		a[t] = sorted[t];
	}
}

void mergeSort(int a[],int m,int n){
	//크기가 1보다 큰경우
	if(m<n){
		int middle = (m+n)/2;
		mergeSort(a,m,middle);
		mergeSort(a,middle+1,n);
		merge(a,m,middle,n);
	}
}
int main(int argc, char* argv[]) {
	printf("05. Merge Sort\n");
	int i,j ,min,index,temp;
	int array[8] ={7,6,5,8,3,5,9,1};
	mergeSort(array,0,7);
	for(i=0;i<8;i++){
		printf("%d  ",array[i]);
	}
}
```





### 시간 복잡도

너비 N번, 높이 logN번 

= O(N*logN)

평균적으로 퀵정렬보다 빠르진 않다.

하지만 최악의 경우에도 O(N*logN) 보장한다.

