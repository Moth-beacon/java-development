package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String title, String givenName, String middleInitial, String familyName, String credential) {
        StringBuilder formattedName = new StringBuilder();

        formattedName.append(familyName).append(", ");
        if (title != null && !title.isEmpty()) formattedName.append(title).append(" ");
        formattedName.append(givenName);
        if (middleInitial != null && !middleInitial.isEmpty()) formattedName.append(" ").append(middleInitial);
        if (credential != null && !credential.isEmpty()) formattedName.append(", ").append(credential);

        return formattedName.toString();
    }

    public static String format(String FullName) {

        String[] nameParts = FullName.split(" ");
        String credential = "";

        if (FullName.contains(",")) {
            String[] splitByComma = FullName.split(",");
            credential = ", " + splitByComma[1].trim();
            nameParts = splitByComma[0].split(" ");
        }

        String familyName = nameParts[nameParts.length - 1];
        String title = (nameParts.length > 3) ? nameParts[0] : "";
        String givenName = (title.isEmpty()) ? nameParts[0] : nameParts[1];
        String middleInitial = (nameParts.length == 4) ? nameParts[2] : (nameParts.length == 5) ? nameParts[3] : "";

        StringBuilder formattedName = new StringBuilder();
        formattedName.append(familyName).append(", ");
        if (!title.isEmpty()) formattedName.append(title).append(" ");
        formattedName.append(givenName);
        if (!middleInitial.isEmpty()) formattedName.append(" ").append(middleInitial);
        formattedName.append(credential);

        return formattedName.toString();
    }
}