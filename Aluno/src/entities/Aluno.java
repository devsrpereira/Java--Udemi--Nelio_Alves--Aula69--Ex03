package entities;

public class Aluno{
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double gradeFinal(){
        return n1 + n2 +n3;
    }

    public String passOrFailed(){
        return gradeFinal()>60 ? "PASS" : "FAILED";
    }

    public double missingPoints(){
        double point = 60 - gradeFinal();
        return point;
    }

}
