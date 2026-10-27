interface payment{
    void pay(double amount);
}
class creditcardpayment implements payment{
    public void pay(double amount){
        System.out.println("paid rs."+amount+" successfully using credit card");
    }
}
class upipayment implements payment{
    public void pay(double amount){
        System.out.println("paid rs."+amount+" successfully using upi");
    }
}
class netbanking implements payment{
    public void pay(double amount){
        System.out.println("paid rs."+amount+" successfully using netbanking");
    }
}
class ques2{
    static void main(String[] args) {
        payment p1=new creditcardpayment();
        p1.pay(5000);
        payment p2=new netbanking();
        p2.pay(120000);
        payment p3=new upipayment();
        p3.pay(40);
    }
}