public class Contract {
    private String contractId;
    private Freelancer freelancer;
    private Client client;
    private Work work;
    private String status;

    public Contract(Client client, String contractId, Freelancer freelancer, Work work, String status) {
        this.client = client;
        this.contractId = contractId;
        this.freelancer = freelancer;
        this.work = work;
        this.status = status;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
