package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces = 0;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName,
           int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mBusinessName = null;
        mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    public void setBusinessName(String name) {
        this.mBusinessName = name;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }

    public String toString() {
        String result = "Business: ";
        if (this.getBusinessName() != null) {
            result += mBusinessName;
        } else {
            result += "unoccupied";
        }
        if (this.getParkingSpaces() > 0) {
            result += "; has " + mParkingSpaces + " parking spaces";
        }
        return result + " (total offices: " + sTotalOffices + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof Office) {
            Office otherOffice = (Office) object;
            if (otherOffice.calcBuildingArea() == this.calcBuildingArea() && otherOffice.getParkingSpaces() == this.getParkingSpaces())
                return true;
        }
        return false;
    }
}
