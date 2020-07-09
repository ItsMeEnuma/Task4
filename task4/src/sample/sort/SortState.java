package sample.sort;

public class SortState {
    private int elementsCount;
    private int swapCount;
    private int compCount;

    public SortState(int elementsCount, int swapCount, int compCount) {
        this.elementsCount = elementsCount;
        this.swapCount = swapCount;
        this.compCount = compCount;
    }

    public int getElementsCount() {
        return elementsCount;
    }

    public void setElementsCount(int elementsCount) {
        this.elementsCount = elementsCount;
    }

    public int getSwapCount() {
        return swapCount;
    }

    public void setSwapCount(int swapCount) {
        this.swapCount = swapCount;
    }

    public int getCompCount() {
        return compCount;
    }

    public void setCompCount(int compCount) {
        this.compCount = compCount;
    }
}
