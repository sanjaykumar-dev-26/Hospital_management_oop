package models;
public class Patient extends person{

    private String disease;
    private boolean admitted;
    private int roomNo;

    public Patient(int id, String name, String disease){
        super(id,name);
        this.disease=disease;
        this.admitted=false;
        this.roomNo=-1;
    }

    public String getDisease(){
        return disease;
    }

    public boolean Isadmitted(){
        return admitted;
    }   

    public int GetroomNo(){
        return roomNo;
    }

    public void admitPatient(int roomNo){
        admitted=true;
        this.roomNo=roomNo;
    }

    public void dischargePatient(int roomNo){
        admitted=false;
        roomNo=-1;
    }
    @Override
    public void showDetails( ){
        System.out.println("PatinetId: "+id);
        System.out.println("PatinetName: "+name);
        System.out.println("PatinetDisease: "+disease);
        System.out.println("PatinetAdmitted: "+admitted);
        System.out.println("PatinetRoomNo: "+roomNo);
    }


}