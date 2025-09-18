#include <iostream>
using namespace std;

class TIME {
    int h, m, s;
public:
    TIME() {}
    TIME(int hh,int mm,int ss){ h=hh; m=mm; s=ss; }
    void display(){ cout << h << ":" << m << ":" << s << endl; }
    TIME add(TIME t) {
        TIME temp;
        temp.s = s + t.s;
        temp.m = m + t.m + temp.s/60;
        temp.h = h + t.h + temp.m/60;
        temp.s %= 60;
        temp.m %= 60;
        return temp;
    }
};

int main() {
    TIME t1(2,45,50), t2(1,20,30);
    TIME t3 = t1.add(t2);
    cout << "Time1: "; t1.display();
    cout << "Time2: "; t2.display();
    cout << "Sum:   "; t3.display();
    return 0;
}
