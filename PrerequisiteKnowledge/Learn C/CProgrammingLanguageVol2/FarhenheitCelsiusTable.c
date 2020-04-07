#include <stdio.h>

#define LOWER 0
#define UPPER 300
#define STEP 20
/*
* print the fahrenheit-celsius table
*/

int main(){
    float fahr, celsius;
    int lower, upper, step;

    lower = LOWER;
    upper = UPPER;
    step = STEP;

    fahr = lower;
    printf("%3s\t%6s\n", "F", "C");
    while(fahr <= upper){
        celsius = (5.0/ 9.0) * (fahr - 32.0) ;
        printf("%3.0f\t%6.1f\n", fahr, celsius);
        fahr = fahr + step;
    }
}