package exception;

public class CSVBuilderException extends RuntimeException {
    public enum ExceptionType {
        UNABLE_TO_PARSE, FILE_NOT_FOUND, INCORRECT_FILE,NO_CENSUS_DATA;
    }
    public ExceptionType type;
    public CSVBuilderException(String message, CSVBuilderException.ExceptionType type) {
        super(message);
        this.type = type;
    }
}
