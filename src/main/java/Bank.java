import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank {

    private final Map<UUID, Cell> cells = new HashMap();

    public UUID createCell() {
        return createCell(UUID.randomUUID());
    }

    public Cell getCell(UUID key) {
        if (key == null) throw new IllegalArgumentException("Key must not be null!");

        Cell cell = this.cells.get(key);
        if (cell == null) {
            createCell(key);
        }

        return cells.get(key);
    }

    private UUID createCell(UUID key) {
        this.cells.put(key, new Cell());

        return key;
    }
}
