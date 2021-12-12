import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Cell {

    private List<BankNote> bankNotes;
    private Set<Stamp> stamps;
}
