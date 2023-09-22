package dad.codesignal;

public class CheckPalindrome {

    boolean solution(String inputString) {

// Convierte la cadena a minúsculas y quita los espacios
        inputString = inputString.toLowerCase().replaceAll("\\s+", "");

        // Comprueba si la cadena es un palíndromo
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false; // No es un palíndromo
            }
            left++;
            right--;
        }

        return true; // Es un palíndromo
    }

}
