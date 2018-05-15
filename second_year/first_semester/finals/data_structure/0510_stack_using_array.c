#include <stdio.h>
#define MAX_STACK 100
int top;

void init(){
    top = -1;
}
int push(int array[], int data){
    if(top == MAX_STACK-1){
        fprintf(stderr, "Stack is Full!");
        return -1;
    }
    else return array[++top] = data;
}
int pop(int array[]){
    if(top == -1){
//        fprintf(stderr, "Stack is empty!");
        printf("%s\n", "There's no data in a stack");
    }
    else return array[top--];
}
void peek(int array[]){

    if(top == -1) printf("%s\n", "A stack is empty");
    else{
        printf("%s\n", "peeking a stack");
        for(int i=top; i>=0;i--){
            printf("No.%d top: %d\n", i+1, array[i]);
        }
        printf("\n");
    }
}
void isEmpty(int array[]){
    if(top==-1) printf("yes. stack is emtpy.");
    else printf("a stack has %d data\n", top+1);
}

void main() {
    int array[MAX_STACK];
    init();
    push(array, 1);
    push(array, 2);
    push(array, 3);
    push(array, 4);
    push(array, 5);
    peek(array);
    isEmpty(array);
//    pop(array);
//    pop(array);
//    pop(array);
//    pop(array);
//    pop(array);
//    pop(array);
//    peek(array);
}
