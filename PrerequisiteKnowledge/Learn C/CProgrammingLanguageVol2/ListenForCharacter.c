#include <stdio.h>

int main(){
    int c;

    printf("Insert a char\n");
    while((c = getchar()) != EOF){
        putchar(c);
    }

    printf("EOF Detected\n");
}