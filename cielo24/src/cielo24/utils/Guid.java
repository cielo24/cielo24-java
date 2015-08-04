package cielo24.utils;

import java.util.UUID;

public class Guid {

    private UUID uuid;

    public Guid(String g) {
        String uuidFormatted = g.substring(0, 8) + "-" +
                               g.substring(8, 12) + "-" +
                               g.substring(12, 16) + "-" +
                               g.substring(16, 20) + "-" +
                               g.substring(20, 32);
        this.uuid = UUID.fromString(uuidFormatted);
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass().equals(this.getClass())) {
            Guid otherGuid = (Guid) other;
            return this.toUUID().equals(otherGuid.toUUID());
        } else {
            return false;
        }
    }

    public UUID toUUID() {
        return this.uuid;
    }

    @Override
    public String toString() {
        return this.uuid.toString().replaceAll("-", "");
    }
}