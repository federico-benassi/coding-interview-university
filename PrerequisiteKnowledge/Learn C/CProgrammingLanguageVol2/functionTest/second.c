#include <stdio.h>


static void privateSecond(){
    register int i = 0;

    while(1){
        printf("%d\n", i++);
    }
}
void second(){
    // privateSecond();
}
