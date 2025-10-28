public class Task5 {

    private String formattedNumber;

    public Task5(String inputNumber) {
        formattedNumber = parseNumber(inputNumber);
    }

    private String parseNumber(String number) {

        number = number.replaceAll("[^0-9+]", "");  // Убираем все кроме цифр и +

        String countryCode;
        String phone;

        if (number.startsWith("+")) {
            countryCode = number.substring(1, number.length() - 10);
            phone = number.substring(number.length() - 10);

        } else if (number.startsWith("8")) {
            countryCode = "7";
            phone = number.substring(1);

        } else {
            throw new IllegalArgumentException("Неверный формат номера.");
        }

        String part1 = phone.substring(0, 3);
        String part2 = phone.substring(3, 6);
        String part3 = phone.substring(6);

        return "+" + countryCode + "-" + part1 + "-" + part2 + "-" + part3;
    }

    @Override
    public String toString() {
        return formattedNumber;
    }
}
