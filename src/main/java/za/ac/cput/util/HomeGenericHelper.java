package za.ac.cput.util;

import java.util.UUID;

public class HomeGenericHelper {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}

