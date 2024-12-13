
import java.util.ArrayList;
import java.util.List;

public class Freelancer {
    private String freelancerId;
    private String firstNameFL;
    private String lastNameFL;
    private double rating;
    private List<Work> workList = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    

    public Freelancer(String freelancerId, String firstNameFL, String lastNameFL, double rating) {
        this.firstNameFL = firstNameFL;
        this.freelancerId = freelancerId;
        this.lastNameFL = lastNameFL;
        this.rating = rating;
    }

    public String getFreelancerId() {
        return freelancerId;
    }

    public void setFreelancerId(String freelancerId) {
        this.freelancerId = freelancerId;
    }

    public String getFirstNameFL() {
        return firstNameFL;
    }

    public void setFirstNameFL(String firstNameFL) {
        this.firstNameFL = firstNameFL;
    }

    public String getLastNameFL() {
        return lastNameFL;
    }

    public void setLastNameFL(String lastNameFL) {
        this.lastNameFL = lastNameFL;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addClient(Client client) {
        clients.add(client);
    }
    public void addWork(Work work) {
        workList.add(work);
    }
    public void displayWorkStatus() {
        for (Work work : workList) {
            System.out.println(work.getWorkDetails());
        }
    }
    public void updateWorkStatus(Work work, String status) {
        work.setStatus(status);
    }
    public void removeCorntact(Client client){
        clients.remove(client);
    }
    public void calculateTheRatingz(){}

    
}
