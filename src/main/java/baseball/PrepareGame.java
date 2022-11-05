package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class PrepareGame {
    public List<Integer> setComputerNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if(!isEachDigit(computer, randomNumber)){
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public Boolean isEachDigit(List<Integer> digitList, int digitNumber) {
        return digitList.contains(digitNumber);
    }

    public String setUserNumber(){
        String userNumber = Console.readLine();
        if(!isNumber(userNumber) || !isThreeDigitNumber(userNumber)){
        }
        return userNumber;
    }

    public Boolean isNumber(String number){
        return number.matches("-?\\d+");
    }

    public Boolean isThreeDigitNumber(String number){
        return number.length() == 3;
    }
}
