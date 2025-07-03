public class Main {
    public static void main(String[] args) {
        Table table = new HashTable();

        // Добавляем начальные значения
        table.put("1", "one");
        table.put("2", "two");
        table.put("3", "three");
        table.put("4", "four");
        table.put("5", "five");
        table.put("6", "six");

        System.out.println("Размер таблицы : " + table.size());
        System.out.println("Значение ключа '1': " + table.get("1"));
        table.put("1", "new one");
        System.out.println("Новое значение ключа '1': " + table.get("1"));
        table.remove("1");
        System.out.println("удаленный: " + table.get("1"));
        System.out.println("Размер таблицы после удаления: " + table.size());
        System.out.println("Поставьте пожалуйста!!!: " + table.size());
    }
}