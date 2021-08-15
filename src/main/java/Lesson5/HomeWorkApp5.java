package Lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Вовов Вова", "дворник", "vovo@mailbox.com", "12345", 30000, 25);
        employee[1] = new Employee("Вовов Коля", "инженер", "voko@mailbox.com", "431856", 50000, 41);
        employee[2] = new Employee("Вовов Вася", "бухгалтер", "vosya@mailbox.com", "868253", 400000, 33);
        employee[3] = new Employee("Вовов Оля", "электрик", "voolya@mailbox.com", "547325", 35000, 55);
        employee[4] = new Employee("Вовов Катя", "дизайнер", "votya@mailbox.com", "134543", 55000, 29);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40){
                employee[i].info();
            }
        }
    }
    
}
