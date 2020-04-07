#include <stdio.h>

int power(int base, int exponent);

int main(){
    printf("%d\n", power(2, 5));
}

int power(int base, int exponent){
    int i, p;

    p = 1;

    for(i = 1; i <= exponent; ++i)
        p = p * base;

    return p;
}