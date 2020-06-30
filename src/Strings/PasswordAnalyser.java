package Strings;

public class PasswordAnalyser {

    //CRITERIA:
    //1) Minimum length of 8 characters
    //2) Not more than 16 characters
    //3) At least one upper case
    //4) At least one lower case
    //5) At least one numeric character
    //6) At least one special character (other than space)
    //7) More than 2 Upper-case or lower-case characters do not appear consecutively
    //8) Consecutive numbers are not used


    private String password;
    private int numOfPassedCriteria;

    public PasswordAnalyser() {
    }

    public static void main(String[] args) {

        PasswordAnalyser passwordAnalyser = new PasswordAnalyser();

        int testCase1 = passwordAnalyser.analysePassword("Password");
        System.out.println("Passed Criteria = " + passwordAnalyser.numOfPassedCriteria + ", Password Strength = " + testCase1);

        int testCase2 = passwordAnalyser.analysePassword("Abcd123");
        System.out.println("Passed Criteria = " + passwordAnalyser.numOfPassedCriteria + ", Password Strength =" + testCase2);

        int testCase3 = passwordAnalyser.analysePassword("BsKNkq7Y&+Y#3#C?");
        System.out.println("Passed Criteria = " + passwordAnalyser.numOfPassedCriteria + ", Password Strength =" + testCase3);


    }

    public int analysePassword(String password) {
        this.password = password;
        this.numOfPassedCriteria = 0;

        if (password == null) {
            return numOfPassedCriteria;
        }

//        Code for filtering password strength based on length
//        before proceeding with other criteria.
//        if(password.replaceAll(" ","").length() < 8){
//            return 0;
//        }

        //checks for criteria 1,2
        checkLength();

        //checks for criteria 3,4,5,6
        checkCase(password.replaceAll(" ", "").toCharArray());

        //checks for criteria 7,8
        consecutiveCaseCheck(password.replaceAll(" ", "").toCharArray());

        if (numOfPassedCriteria < 2) {
            return 0;
        } else if (numOfPassedCriteria <= 4) {
            return 1;
        } else if (numOfPassedCriteria <= 7) {
            return 2;
        } else {
            return 3;
        }

    }

    public void checkLength() {

        int length = password.replaceAll(" ", "").length();
        if (length >= 8 && length <= 16) {
            numOfPassedCriteria += 2;
        } else if (length > 16) {
            numOfPassedCriteria++;
        }

    }


    private void checkCase(char[] passwordArray) {

        if (passwordArray.length == 0 || passwordArray.length == 1) {
            return;
        }

        int[] caseArray = new int[4];

        for (char c : passwordArray) {
            if (Character.isUpperCase(c)) {
                caseArray[0]++;
            }
            if (Character.isDigit(c)) {
                caseArray[1]++;
            }
            if (Character.isLowerCase(c)) {
                caseArray[2]++;
            }
            if (!Character.isLetterOrDigit(c)) {
                caseArray[3]++;
            }
        }

        for (int i : caseArray) {
            if (i > 0) {
                numOfPassedCriteria++;
            }
        }
    }


    public void consecutiveCaseCheck(char[] passwordArray) {

        if (passwordArray.length == 0 || passwordArray.length == 1) {
            return;
        }

        boolean isConsecutiveAlpha = false;
        boolean isConsecutiveNum = false;

        for (int i = 0; i < passwordArray.length - 1; ) {

            if (i + 2 < passwordArray.length && Character.isUpperCase(passwordArray[i]) && Character.isUpperCase(passwordArray[i + 1]) &&
                    Character.isUpperCase(passwordArray[i + 2])) {
                isConsecutiveAlpha = true;
                i += 3;
                continue;

            }

            if (i + 2 < passwordArray.length && Character.isLowerCase(passwordArray[i]) && Character.isLowerCase(passwordArray[i + 1]) &&
                    Character.isLowerCase(passwordArray[i + 2])) {
                isConsecutiveAlpha = true;
                i += 3;
                continue;

            }
            if (Character.isDigit(passwordArray[i]) && Character.isDigit(passwordArray[i + 1])) {
                if (passwordArray[i + 1] - passwordArray[i] == 1 ||
                        passwordArray[i + 1] - passwordArray[i] == -1) {
                    isConsecutiveNum = true;
                    i += 2;
                    continue;
                }
            }
            i++;
        }

        // Code for miscellaneous passwords like : "aaaa4" which essentially falls under invalid password
        // but gets passed for the criteria: consecutive numbers not used and falls under weak password.
        //string numbersPresent = password.replace("[//W^\\d.]","");
        //if(numbersPresent.length() == 0 || numbersPresent.length() == 1){
        //isConsecutiveNum = true; }

        numOfPassedCriteria += !isConsecutiveAlpha && !isConsecutiveNum ? 2 : ((!isConsecutiveAlpha || !isConsecutiveNum) ? 1 : 0);

    }


}
