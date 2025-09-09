class Quest3 {
    String name;
    int age;

    Quest3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Quest3(Quest3 other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
s
    public static void main(String[] args) {
        Quest3 person1 = new Quest3("Rishav", 21);
        Quest3 person2 = new Quest3(person1);

        person1.display();
        person2.display();
    }
}
