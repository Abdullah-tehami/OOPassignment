import java.util.Objects;

public class Computer{
    private String computerNumber;
    private String IcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGpu;
    public Computer(String computerNumber,String icdModel,int ramSize,int hddSize,boolean hasGpu){
        this.computerNumber=computerNumber;
        this.IcdModel=icdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGpu=hasGpu;

    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && hddSize == computer.hddSize && Objects.equals(computerNumber, computer.computerNumber) && Objects.equals(IcdModel, computer.IcdModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerNumber, IcdModel, ramSize, hddSize);
    }
}