public class Teacher {

    private String courses;
    //public static void main = you can ignore static, void means not used, main is field

    public void setCourses(String info){

        courses = info;
    }

    public String getCourses(){
        return courses;
    }

    public void display(){
        System.out.println("I had this "+ getCourses());
    }
}
