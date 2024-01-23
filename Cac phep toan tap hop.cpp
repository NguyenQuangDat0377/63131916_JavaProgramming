#include <iostream>
#include <fstream>
#include <set>
#include <algorithm>
#include <iterator>

using namespace std;

set<int> performOperation(const set<int>& A, const set<int>& B, int operation) {
    set<int> result;
    if (operation == 1) {
        set_intersection(A.begin(), A.end(), B.begin(), B.end(), inserter(result, result.begin()));
    } else if (operation == 2) {
        set_union(A.begin(), A.end(), B.begin(), B.end(), inserter(result, result.begin()));
    } else if (operation == 3) {
        set_difference(A.begin(), A.end(), B.begin(), B.end(), inserter(result, result.begin()));
    } else if (operation == 4) {
        for (int a : A) {
            for (int b : B) {
                result.insert(a * 10 + b);
            }
        }
    }
    return result;
}

void printSet(const set<int>& s) {
    cout << "{ ";
    for (int element : s) {
        cout << element << " ";
    }
    cout << "}" << endl;
}

int main() {
    set<int> A, B;
    int operation, inputMode;

    cout << "Chon che do nhap du lieu: \n";
    cout << "Nhap 5 de chon che do nhap tu ban phim\n";
    cout << "Nhap 6 de chon che do nhap tu file\n";
    cin >> inputMode;

    if (inputMode == 5) {
        int n;
        cout << "Nhap so phan tu cua tap A: ";
        cin >> n;
        cout << "Nhap tap A: ";
        for (int i = 0; i < n; ++i) {
            int element;
            cin >> element;
            A.insert(element);
        }

        cout << "Nhap so phan tu cua tap B: ";
        cin >> n;
        cout << "Nhap tap B: ";
        for (int i = 0; i < n; ++i) {
            int element;
            cin >> element;
            B.insert(element);
        }
    } else if (inputMode == 6) {
        string fileA, fileB;

        cout << "Nhap ten file cho tap A: ";
        cin >> fileA;
        ifstream fileAStream(fileA);
        copy(istream_iterator<int>(fileAStream), istream_iterator<int>(), inserter(A, A.begin()));
        fileAStream.close();

        cout << "Nhap ten file cho tap B: ";
        cin >> fileB;
        ifstream fileBStream(fileB);
        copy(istream_iterator<int>(fileBStream), istream_iterator<int>(), inserter(B, B.begin()));
        fileBStream.close();
    }

    cout << "Chon phuong thuc tinh toan: \n";
    cout << "Nhap 1 de chon phuong thuc giao\n";
    cout << "Nhap 2 de chon phuong thuc hop\n";
    cout << "Nhap 3 de chon phuong thuc hieu\n";
    cout << "Nhap 4 de chon phuong thuc tich Descartes\n";
    cin >> operation;

    set<int> result = performOperation(A, B, operation);
    cout << "Nhap tap A: ";
    printSet(A);
    cout << "Nhap tap B: ";
    printSet(B);
    cout << "Ket qua cua A ";
    if (operation == 1) {
        cout << "giao";
    } else if (operation == 2) {
        cout << "hop";
    } else if (operation == 3) {
        cout << "hieu";
    } else if (operation == 4) {
        cout << "tich Descartes";
    }
    cout << " B la: ";
    printSet(result);

    return 0;
}

