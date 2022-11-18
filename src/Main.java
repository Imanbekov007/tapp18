public class Main {
    public static void main(String[] args) {
        Families []dormitoryfamily= {new Dormitory("Aybek",17),
                new Dormitory("Nursultan",18),
                new Dormitory("Kutman",16)
        };
        for (Families a:
             dormitoryfamily) {
            System.out.println("Dormitory family members "+a);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Families []hotelfamily= {new Hotel("Islam", 45),
                new Hotel("Arstan", 34),
                new Hotel("Erbol", 16),
                new Hotel("Aygul",74)
        };
        for (Families b:hotelfamily) {
            System.out.println("Hotel family members "+b);

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Families []apartmentfamily= {new Apartment("Manas", 54),
                new Apartment("Ayzhamal", 51),
                new Apartment("Ermek", 16),
                new Apartment("Eliza",12),
                new Apartment("Aydar",3),
                new Apartment("Eldar",3),
                new Apartment("Alikhan",23),
        };
        for (Families c:apartmentfamily) {
            System.out.println("Apartment family members "+c);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Apartment apartmentleader=new Apartment("Manas ",54);
        apartmentleader.Comusluga();
        Dormitory dormitoryleader=new Dormitory("Nursultan",18);
        dormitoryleader.Arenda();
        Hotel hotelleader=new Hotel("Islam",45);
        hotelleader.Arenda();


    }
}