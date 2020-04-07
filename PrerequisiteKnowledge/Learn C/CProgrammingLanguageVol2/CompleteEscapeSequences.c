#include <stdio.h>

int main(){

    printf("%c\n", '\a'); // Should make a sound
    printf("%c\n", '\b'); // Should be a backspace
    printf("%c\n", '\f'); // FormFeed
    printf("\r\n"); // Carriage Return
    printf("\tciao\n"); // Horizontal Tab
    printf("\vciao\n"); // Vertical Tab
    return 0;
}