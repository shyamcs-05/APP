import java.util.*;
class Candidate{
    int candidate_id;
    String name;
    int aptitude;
    int technical;
    int communication;
    Candidate(int candidate_id, String name, int aptitude, int technical, int communication){
        this.candidate_id = candidate_id;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }
    int getTotalScore(){
        return aptitude+technical+communication;
    }
}
public class ques6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of candidates: ");
        int n = inp.nextInt();
        System.out.print("\nEnter the number of candidates to shortlist: ");
        int K = inp.nextInt();
        Candidate[] candi = new Candidate[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the candidate id: ");
            int candidate_id = inp.nextInt();
            System.out.print("\nEnter the name: ");
            String name = inp.next();
            System.out.print("\nEnter the score in aptitude: ");
            int aptitude = inp.nextInt();
            System.out.print("\nEnter the score in technical: ");
            int technical = inp.nextInt();
            System.out.print("\nEnter the score in communication: ");
            int communication = inp.nextInt();
            candi[i] = new Candidate(candidate_id, name, aptitude, technical, communication);
        }
        Arrays.sort(candi, new Comparator<Candidate>() {
            public int compare(Candidate c1, Candidate c2) {
                int score1 = c1.getTotalScore();
                int score2 = c2.getTotalScore();
                if (score1 != score2) {
                    return Integer.compare(score2, score1);
                }
                return Integer.compare(c1.candidate_id, c2.candidate_id);
            }
        });
        for (int i = 0; i <K && i< n; i++) {
            System.out.println(candi[i].candidate_id + " " + candi[i].name + " " + candi[i].getTotalScore());
        }
    }
}