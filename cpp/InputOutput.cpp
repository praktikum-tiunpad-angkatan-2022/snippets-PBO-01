#include <iostream>
#include <string>

// operasi i/o pada cpp bisa menggunakan sintaks cin dan cout dar iostream. 
// meskipun ada juga alternatif lain, seperti getch dan printf

// perlu diingat lagi bahwa string bukan tipe data primitif di cpp, melainkan bawaan dari library <string> 

int main() {
    int age;
    std::string name;
    
    std::cin >> name;
    std::cin >> age;

    std::cout << "\nThy shall know i as " << name;
    std::cout << "\nfor i am " << age << " years old.";
}