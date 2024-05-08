class Pc {

    private static  int count=0;
    private int id;
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;

    Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id=id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }

    Pc(Pc p) {
        this.id=p.id;
        this.cpu = p.cpu;
        this.ram = p.ram;
        this.storage = p.storage;
        this.lcdMaker = p.lcdMaker;
        this.hasGpu = p.hasGpu;
    }

    Pc(String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id = ++count;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public boolean hasGpu() {
        return hasGpu;
    }

    public void setGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }


    @Override

    public boolean equals(Object o)
    {
        Pc p= (Pc)o;

        return this.cpu.equals(p.cpu)&&this.ram.equals(p.ram)&&this.storage.equals(p.storage)&&this.lcdMaker.equals(p.lcdMaker)&&this.hasGpu==p.hasGpu;

    }
    @Override
    public Object clone()
    {
        return new Pc(this.cpu,this.ram,this.storage,this.lcdMaker,this.hasGpu);
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
    }
}
