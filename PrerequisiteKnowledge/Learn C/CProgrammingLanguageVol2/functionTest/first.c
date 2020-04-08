#include <stdio.h>

// In this way no other files can access this function
static void privateFirst(){
    static int i = 0;
    printf("First function called %d times\n", i++);
}

void first(){
    privateFirst();
    privateFirst();
    privateFirst();
    privateFirst();
    privateFirst();
    privateFirst();
    privateFirst();
}
