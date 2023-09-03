#include "Ship.cpp"
#include <iostream>

int main() {
    Ship ferry = Ship();

    std::cout << "Initially, this ship has " <<  ferry.getCrew() <<  " crew.\n";


    if(ferry.getCrew() < 30) {
        ferry.setCrew(30);
    }

    std::cout << "But then, now this ship has " <<  ferry.getCrew() <<  " crew.";

    return 0;
}