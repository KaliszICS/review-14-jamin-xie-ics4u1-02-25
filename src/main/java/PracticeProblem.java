public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static int calculate(int num, int num2, char operator) {
		int result = 0;

		switch (operator) {
			case '+':
				result = num + num2;
				break;
			case '-':
				result = num - num2;
				break;
			case '*':
				result = num * num2;
				break;
			case '/':
				if (num2 != 0) {
					result = num / num2;
				}
				break;
			case '%':
				if (num2 != 0) {
					result = num % num2;
				}
				break;
			case '^':
				result = (int) Math.pow(num, num2);
		}
		return result;
	}

	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String sentence) {
        if (sentence.trim().isEmpty()) {
            return true;
        }

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.toLowerCase().trim().length(); i++) {
            char c = sentence.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || (c == '\'' && i > 0 && i < sentence.length() - 1)) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                    if (wordCount > MAXIMUM) {
                        return false;
                    }
                }
            } else {
                inWord = false;
            }
        }

        return wordCount <= MAXIMUM;
    }

	public static String minString(String str1, String str2, String str3) {

        String min = str1.toLowerCase();
        if (str2.toLowerCase().compareTo(min) < 0) {
            min = str2;
        }
        if (str3.toLowerCase().compareTo(min) < 0) {
            min = str3;
        }

        if (min.equals(str1)) {
            return str1;
        } else if (min.equals(str2)) {
            return str2;
        } else {
            return str3;
        }
    }
}
