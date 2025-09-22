class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

public class FileUploadValidator {
    public static void main(String[] args) {
        String fileName = "data.csv"; // Example file

        try {
            validateCSV(fileName);
            System.out.println("CSV file validated successfully!");
        } catch (InvalidFileFormatException e) {
            System.out.println("Invalid CSV Format: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void validateCSV(String fileName) throws IOException, InvalidFileFormatException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String header = br.readLine();

        if (header == null || !header.contains("Name") || !header.contains("Age")) {
            throw new InvalidFileFormatException("Required headers (Name, Age) missing!");
        }
        br.close();
    }
}
