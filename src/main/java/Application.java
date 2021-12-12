import java.util.*;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class Application {

    public static void main(String[] args) {

        Bank OTP = new Bank();
        UUID key = OTP.createCell();
        Cell cell = OTP.getCell(key);

        List<BankNote> bankNotes = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bankNotes.add(new BankNote(100));
        }

        Set<Stamp> stamps = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            stamps.add(new Stamp(randomAlphabetic(2)));
        }

        cell.setBankNotes(bankNotes);
        cell.setStamps(stamps);

        System.out.println(cell);
    }
}
