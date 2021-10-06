package programming;

// на решение ушло 7 минут

public class Task1 {

    // решение
    //-----------------------------------------------------
    public String townsToString(Town[] towns) {
        String str = "";

        for (int i = 0; i < towns.length; i++) {
            if (i == towns.length-1) {
                str = str + towns[i].getName() + ".";
            } else {
                str = str + towns[i].getName() + ", ";
            }
        }
        return str;
    }
    //-----------------------------------------------------

    // создан для удобства
    public class Town {
        private String name;

        public Town(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
