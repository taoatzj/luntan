#include <iostream>
#include "windows.h"

using namespace std;

int main() {
    std::cout << "Hello, World!" << std::endl;
    MessageBox(NULL, "hello", "caption", MB_OK);
#ifdef WIN32
    cout << "i am windows" << std::endl;
#else
    cout << "i am unix" << std::endl;
#endif
    return 0;
}