#include <stdio.h>

int main(){
    long lc = 0;
    char c;

    while((c = getchar()) != EOF){
        if(c == '\n'){
            lc++;
        }
    }

    printf("The count of lines is: %ld\n", lc);
}