interface confidential{

}
class document{
    private String title;
    document(String title){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
}
class publicreport extends document{
    publicreport(String title){
        super(title);
    }
}
class spreadsheet extends document{
    spreadsheet(String title){
        super(title);
    }
}
class annualbudgetreport extends document{
    annualbudgetreport(String title){
        super(title);
    }
}
public class ques4 {
    static void checkconfidentiality(document d1){
        if(d1 instanceof confidential){
            System.out.println("access restricted : "+d1.getTitle()+"is a confidential file");
        }
        else{
            System.out.println("access granted : "+d1.getTitle());
        }
    }

    static void main(String[] args) {
        document[] d2={
                new annualbudgetreport("2026 annual budget report"),
                new spreadsheet("marks 2026"),
                new publicreport("health concerns in 2026")
        };
        System.out.println("Document Management System");
        for (document d1 : d2){
            checkconfidentiality(d1);
        }
    }
}