public class HashTable implements Table {
    private String[] values = new String[7]; // Индексы 1-6

    @Override
    public void put(String key, String value) {
        int num = Integer.parseInt(key);
        if (num >= 1 && num <= 6) {
            values[num] = value;
        }
    }

    @Override
    public String get(String key) {
        int num = Integer.parseInt(key);
        if (num >= 1 && num <= 6) {
            return values[num];
        }
        return null;
    }

    @Override
    public void remove(String key) {
        int num = Integer.parseInt(key);
        if (num >= 1 && num <= 6) {
            values[num] = null;
        }
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if (values[i] != null) {
                count++;
            }
        }
        return count;
    }
}