# 🍫Rechteckberechnung mit Zufallszahlen
### **🚀Beschreibung:**
* Dieses Java-Programm berechnet den `Umfang` und die `Fläche` eines Rechtecks, dessen Seitenlängen zufällig generiert werden. Die Zufallszahlen sind Gleitkommazahlen (double) mit `zwei Nachkommastellen` und liegen im Bereich von `0.00 bis 10.00`.

### 🩼Funktionalität:

* Zwei Seitenlängen (`num1` und `num2`) werden zufällig generiert.

* Jede Zahl wird auf **zwei Dezimalstellen** gerundet.

* Der Umfang wird mit der Formel `2 × (a + b)` berechnet.

* Die Fläche wird mit der Formel `a × b` berechnet.

* Alle Werte werden auf der Konsole ausgegeben.

### ⛔️Hinweis:

* Die Methode `Math.round(... * 100.0) / 100.0` sorgt dafür, dass die Zahlen genau zwei Nachkommastellen haben.

## 🟡 code: 
```java
public class rectangle {
    public static void main(String[] args) {
        Random random = new Random();

        double num1 = Math.round(random.nextDouble() * 10 * 100.0) / 100.0;
        double num2 = Math.round(random.nextDouble() * 10 * 100.0) / 100.0;

        System.out.println(num1);
        System.out.println(num2);

        double rectangle = 2 * (num1 + num2);
        System.out.println("Perimeter of a rectangle: " + rectangle);

        double area = (num1 * num2);
        System.out.println("Area of a rectangle: " + area);
    }
}
```




