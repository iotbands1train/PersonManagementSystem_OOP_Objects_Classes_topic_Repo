package module02.objectclassestopics;

/**
 * This class provides methods to generate random data for creating Person objects.
 */
public class MyRandomPersonData {

    /**
     * Generates a random first name from a predefined list.
     */
    public static String randomFname() {
        String[] FIRST_NAMES = {
            "Emma", "Liam", "Olivia", "Noah", "Ava", "Isabella", "Sophia", "Mia",
            "Charlotte", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Sofia", "Avery", "Ella",
            "Scarlett", "Grace", "Victoria", "Riley", "Aria", "Lily", "Aubrey", "Zoey", "Penelope", "Hannah", "Layla",
            "Nora", "Lily", "Lillian", "Addison", "Eleanor", "Natalie", "Ellie", "Leah", "Aubrey", "Hazel", "Violet",
            "Aurora", "Savannah", "Audrey", "Brooklyn", "Bella", "Claire", "Skylar", "Lucy", "Paisley", "Everly"
        }; 
        int randomIndex = new java.util.Random().nextInt(0, FIRST_NAMES.length-1);
        String randomFirstName = FIRST_NAMES[randomIndex];
        return randomFirstName;
    }

    /**
     * Generates a random last name from a predefined list.
     */
    public static String randomLname() {
        String[] LAST_NAMES = {
            "Smith", "Johnson", "Brown", "Taylor", "Miller", "Jones", "Garcia", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin"
            // ... Add more last names as needed
        };
        int randomIndex = new java.util.Random().nextInt(0, LAST_NAMES.length-1);
        String randomLastName = LAST_NAMES[randomIndex];
        return randomLastName;
    }

    /**
     * Generates a random short number within a specified range.
     */
    public static short randomNumber(long min, long max) {
        return (short) new java.util.Random().nextLong(min>0?min:0, max);
    }


    /**
     * Generates a random short number within a specified range.
     */
    public static int randomNumber(int min, long max) {
        return (int) new java.util.Random().nextLong(min>0?min:0, max);
    }
    /**
     * Generates a random short number within a specified range.
     */
    public static short randomNumber(int min, int max) {
        return (short) new java.util.Random().nextInt(min>0?min:0, max);
    }

    /**
     * Generates a random street name by combining a random street type and name.
     */
    public static String randomStreet() {
        String[] STREET_TYPES = {
            "St.", "Ave.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl.", "Cir.", "Blvd.", "Way"
        };

        String[] STREET_NAMES = {
            "Maple", "Oak", "Cedar", "Pine", "Elm", "Birch", "Willow", "Hickory", "Ash", "Poplar",
            "Cherry", "Spruce", "Sycamore", "Cypress", "Alder", "Dogwood", "Juniper", "Magnolia", "Redwood", "Fir"
            // ... Add more street names as needed
        };
        int randomTypeIndex = new java.util.Random().nextInt(0, STREET_TYPES.length-1);
        int randomNameIndex = new java.util.Random().nextInt(0, STREET_NAMES.length-1); 
        String randomStreetType = STREET_TYPES[randomTypeIndex];
        String randomStreetName = STREET_NAMES[randomNameIndex];
        return randomStreetName + " " + randomStreetType;
    }

    /**
     * Generates a random street name by combining a random street type and name.
     */
    public static String randomCity() {
        String[] CITIES = {
            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose",
            "Austin", "Jacksonville", "San Francisco", "Columbus", "Indianapolis", "Fort Worth", "Charlotte", "Seattle", "Denver", "Washington"
            // ... Add more cities as needed
        };
        int randomIndex = new java.util.Random().nextInt(0, CITIES.length-1);
        String randomCity = CITIES[randomIndex];
        return randomCity;
    }

    /**
     * Generates a random street name by combining a random street type and name.
     */
    public static String randomState() {
        String[] STATES = {
            "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
            "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey"
            // ... Add more states as needed
        };
        int randomIndex = new java.util.Random().nextInt(0, STATES.length-1);
        String randomState = STATES[randomIndex];
        return randomState;
    }

    /**
     * Generates a random street name by combining a random street type and name.
     */
    public static Long randomBigNumber(long min, long max) {
        return new java.util.Random().nextLong(min, max);
    } 
}





