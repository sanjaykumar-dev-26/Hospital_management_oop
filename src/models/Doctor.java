package models;
class Doctor extends person{
    private String specialization;

    public Doctor(int id,String name, String   specialization){
        super(id,name);
        this.specialization=specialization;
    }

    public String getSpecicalization(String specialization){
        return specialization;
    }

    public void treatDisease(Patient patient){
        System.out.println("Dr"+name +"is treating patient for"+patient.getDisease());
    }

    @Override    
    public void showDetails(){
        System.out.println("Doctor id:"+ id);
        System.out.println("Doctor name:" +name);
        System.out.println("Doctor specialiation:"+specialization);
    }

};