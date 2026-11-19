package Bootcamp_day3_module7;
public class CustomExceptionActivity extends Exception {
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}