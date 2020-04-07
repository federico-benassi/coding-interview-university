#include <ctype.h>
#include <stdio.h>

#define FALSE 0

int main(){

    char a = 'a';
    char one = '1';

    if(isalnum(a) != FALSE){
        printf("%c is an alphanumeric character\n", a);
    }

    if(isalnum(one) != FALSE){
        printf("%c is an alphanumeric character\n", one);
    }

    if(isalpha(a) != FALSE){
        printf("%c is an alphabet character\n", a);
    }

    if(isalpha(one) == FALSE){
        printf("%c is NOT an alphabet character\n", a);
    }

    return 0;
}