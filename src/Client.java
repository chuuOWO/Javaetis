public class Client {
    private String clientId;
    private String firstNameCL;
    private String lastNameCL;

    public Client(String clientId, String firstNameCL, String lastNameCL) {
        this.clientId = clientId;
        this.firstNameCL = firstNameCL;
        this.lastNameCL = lastNameCL;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getFirstNameCL() {
        return firstNameCL;
    }

    public void setFirstNameCL(String firstNameCL) {
        this.firstNameCL = firstNameCL;
    }

    public String getLastNameCL() {
        return lastNameCL;
    }

    public void setLastNameCL(String lastNameCL) {
        this.lastNameCL = lastNameCL;
    }
    
    public void hireFreelancer() {

    }
    public void displayWorkStatus(){

    }
    public void deleteContract(){

    }
    public void rateAFreelancer(Freelancer freelancer, double rating){
        freelancer.setRating(rating);
    }
    public void displayFLRankings(){}
    

}
