# 03. 삽입 정렬

각 숫자를 적절한 위치에 삽입하는 방법
다른 정렬방식들은 무조건 위치를 바꾸는 방식이였다면 삽입 정렬은 필요할 때만 위치를 바꾼다.

정렬이 되어있다고 가정한다는 점에서 특정한 경우에 따라 굉장히 빠른속도를 자랑함
선택정렬이랑 버블정렬보다 효율적이다.

<img src='https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile25.uf.tistory.com%2Fimage%2F2569FD3854508BE8114B33'/>
출처 : https://wonjayk.tistory.com/m/218

### code
```c
printf("03. Insertion Sort\n");
int i,j ,min,index,temp;

int array[10] ={1,10,5,8,7,6,4,3,2,9};
for(i=0;i<9;i++){
    j=i;
    while(array[j]>array[j+1]){
        temp=array[j];
        array[j]=array[j+1];
        array[j+1]=temp;
        j--;
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

선택,버블정렬과 같이 O(N^2)이지만 정렬이 되면 연산을 멈추기때문에
효율적이다. 

거의 정렬된 상태라면 삽입정렬이 제일 빠르다.
