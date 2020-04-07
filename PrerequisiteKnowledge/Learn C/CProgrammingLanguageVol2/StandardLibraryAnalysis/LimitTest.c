#include <limits.h>
#include <stdio.h>

int main(){
    /*
        Constants for the sizes of integral types
    */

    printf("%d\n", CHAR_BIT); // So one character is a byte
    printf("%d\n", CHAR_MAX); // 127 is maximum signed char
    printf("%d\n", SCHAR_MAX);
    printf("%d\n", UCHAR_MAX); // Unsigned is 255

    // Deductions
    signed char c = 60;
    printf("%c\n", c);

    printf("%d\n", CHAR_MIN);
    printf("%d\n", SCHAR_MIN);
    return 0; 
}