Fibonacci-Series-Java/ │ ├── Fabonacci.java └── Main.java

---

## 💻 Code

### Fabonacci.java

```java
public class Fabonacci {

    public void printSeries(int n) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        Fabonacci fb = new Fabonacci();
        fb.printSeries(n);

        sc.close();
    }
}

Enter number of terms: 7
Fibonacci Series: 0 1 1 2 3 5 8

🚀 How to Run
1. Clone the repository
git clone https://github.com/your-username/Fibonacci-Series-Java.git
2.Open the project in your IDE
3.Compile the files
javac Main.java Fabonacci.java
4.Run the program
java Main


📚 Concepts Used
OOP in Java
Methods
Loops
User Input
Fibonacci Logic

⭐ Author

Abdul Malik

<img width="1536" height="1024" alt="ChatGPT Image May 18, 2026, 11_48_09 PM" src="https://github.com/user-attachments/assets/dd4649c2-e9b6-4fb1-857c-22e78bc8c769" />
<img width="1536" height="1024" alt="ChatGPT Image May 18, 2026, 11_48_09 PM" src="https://github.com/user-attachments/assets/26841493-04d3-4d78-9717-66b56928053d" />

