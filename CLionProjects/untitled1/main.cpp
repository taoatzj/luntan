#include <iostream>
#include "windows.h"

int main() {
    std::cout << "Hello, World!" << std::endl;
    MessageBox(NULL, "hello", "caption", MB_OK);
    return 0;
}