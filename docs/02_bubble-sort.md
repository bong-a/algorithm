# 02. 버블 정렬

가장 비효율적인 알고리즘

1 10 5 8 7 6 4 3 2 9
1 5 10 8 7 6 4 3 2 9
1 5 8 10 7 6 4 3 2 9
...
1 2 3 4 5 6 7 8 9 10

<img src='https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F9957E0355AE346722E06E3'/>
출처 : https://javaplant.tistory.com/16

### code
```c
printf("02. Bubble Sort\n");
int i,j ,min,index,temp;

int array[10] ={1,10,5,8,7,6,4,3,2,9};
for(i=0;i<10;i++){
    for(j=0;j<9-i;j++){
        if(array[j]>array[j+1]){
            temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
        }
    }
}
for(i=0;i<10;i++){
    printf("%d  ",array[i]);
}
```



### 시간 복잡도

10+9+8+...+1
= N*(N+1)/2
= O(N*N)
= O(N^2)

#### 실제 속도비교
버블정렬 < 선택정렬 (선택정렬보다 느림)

버블정렬 매번 연산이 일어나기 때문에 가장 비효율적이다.
가장느린게 버블정렬이다.