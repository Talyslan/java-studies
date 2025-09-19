#include <iostream>
using namespace std;

class A {
private:
    int j;
    float g;
    B b;
public:
    void f2() {
        // ...
        try {
            // ...
            try {
                // ...
                b.f1();   // pode lançar int (propagado de B: f1()) ou tratar float dentro de B: f1()
                // ...
                if (/* ... */)
                    throw j;  // exceção do tipo int, capturada no catch(int) abaixo
                // ...
                if (/* ... */)
                    throw g;  // exceção do tipo float, não tem catch(float) aqui dentro, então sobe para o catch(float) externo
                // ...
            } catch (int) {
                // Aqui será tratado:
                // - o "throw k" que veio de B: f1()
                // - o "throw j" de A: f2()
            }
            // ...
        } catch (float) {
            // Aqui será tratado:
            // - o "throw g" de A: f2()
        }
        // ...
    }
};


class B {
private:
    int k;
    float f;
public:
    void f1() {
        // ...
        try {
            // ...
            if (/* ... */)
                throw k;    // exceção do tipo int, não há catch(int) aqui, logo será propagada para quem chamou (classe A: f2())
            // ...
            if (/* ... */)
                throw f;    // exceção do tipo float capturada pelo catch(float) logo abaixo
        } catch (float) {
            // Aqui será tratado o "throw f"
        }
        // ...
    }
};