public class Module1 {

    String name, father_name, uni_id, userid;
    int sem;

    public void getData(String name, String father_name, String uni_id, String userid, int sem){
        this.name = name;
        this.father_name = father_name;
        this.uni_id = uni_id;
        this.userid = userid;
        this.sem = sem;
    }

    public void setData(){
        System.out.println("Student's name: "+name);
        System.out.println("Student Father's name: "+father_name);
        System.out.println("University id: "+uni_id);
        System.out.println("User Id: "+userid);
        System.out.println("sem: "+sem);
    }
}
