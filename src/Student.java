/**
 *对象类
 */
public class Student implements  Comparable<Student>{
     private String name;
     private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student that) {
       if(this.score>that.score){
           return 1;
       }
       if(this.score<that.score){
           return -1;
       }
       return this.name.compareTo(that.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    // 定义Student实例的打印输出方式
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }
}
