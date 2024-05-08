import java.util.ArrayList;
import java.util.List;
class PcLab {
    private String labName;
    private List<Pc> pcList=new ArrayList<Pc>();;
    private int id;
    private String labAssistant;
    private String labInCharge;
    private int pcCount = 0;

    PcLab(int id,String labName, String labAssistant, String labInCharge) {
        this.id=id;
        this.labName = labName;

        this.labAssistant = labAssistant;
        this.labInCharge = labInCharge;
    }
    PcLab(PcLab p)
    {
        this.id=p.id;
        this.labName=p.labName;
        this.labAssistant=p.labAssistant;
        this.labInCharge= p.labInCharge;
        for(int i=0;i<p.pcList.size();i++)
        {
            this.pcList.add(p.pcList.get(i));
        }
    }
    PcLab()
    {

    }


    // Getters and Setters

    public int getId()
    {
        return id;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabInCharge() {
        return labInCharge;
    }

    public void setLabInCharge(String labInCharge) {
        this.labInCharge = labInCharge;
    }

    public void addPc(Pc p) {

        pcList.add(p);

    }

    @Override
    public Object clone()
    {
        PcLab p= new PcLab(this.id,this.labName,this.labAssistant,this.labInCharge);
        // p.pcList= new Pc[this.pcList.length];
        for(int i=0;i<this.pcList.size();i++){
            p.addPc((Pc) this.pcList.get(i).clone());
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder pcDetails = new StringBuilder("\n\nPC's Details\n");
        for (int i = 0; i < pcList.size(); i++) {
            pcDetails.append("\n").append("Pc ").append(i+1).append(" :\n ").append(pcList.get(i));
        }

        if(pcList.get(0)!=null )
            return String.format("Lab id %d: Lab Name: %s\nLab InCharge: %s\nLab Assistant: %s\n", this.id,labName, labInCharge, labAssistant)+pcDetails;
        else
            return String.format("Lab id %d: Lab Name: %s\nLab InCharge: %s\nLab Assistant: %s\n", this.id,labName, labInCharge, labAssistant);

    }

    public List<Pc> getPcList(){
        return pcList;
    }
    public void setPc(Pc p1,Pc p2)
    {
        int index=pcList.indexOf(p1);
        pcList.set(index,p2);

    }

    public void setPcList(Pc newList[]){
        for (int i=0;i<newList.length;i++)
        {
            pcList.set(i,newList[i]);
        }

    }
    public void removePc(Pc p)
    {
        pcList.remove(p);
    }


}
