package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {
    private String mOwner;
    private boolean mPool;

    House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    House(int length, int width, int lotLength, int lotWidth, String owner, boolean
            pool) {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public void setPool(Boolean pool) {
        mPool = pool;
    }

    public String toString() {
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if (this.calcLotArea() > 2 * this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }

    public boolean equals(Object object) {
        if (object instanceof House) {
            House otherHouse = (House) object;
            if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
                return true;
        }
        return false;
    }
}
