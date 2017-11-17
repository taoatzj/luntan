//
// Created by isesol on 2017/11/16.
//

#ifndef UNTITLED_TEST_H
#define UNTITLED_TEST_H
#include <iostream>
#include <string>

using namespace std; // 这个不建议

class Person {
private:
    string name;
    int age;

public:
    Person();
    Person(const string &_name);
    Person(const string &_name, const int &_age);
    void printSM();

public:
    ~Person();
};


#endif //UNTITLED_TEST_H
