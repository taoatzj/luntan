//
// Created by isesol on 2017/11/16.
//
#include "person.h"

using namespace std; // 这个不建议

Person::Person() : name("anonymous"), age(18) {
    cout << "default constructor called" << endl;
}
Person::Person(const string &_name) : name(_name) {
    cout << "Person(const string&) constructor called" << endl;
}
Person::Person(const string &_name, const int &_age) : name(_name), age(_age) {
    cout << "Person(const string&, const int&) constructor called" << endl;
}

void Person::printSM()
{
    cout << "SMSMSMSM" << endl;
}
Person::~Person() {
    cout << "before default destructor" << endl;
}