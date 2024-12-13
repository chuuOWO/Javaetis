public class Work {
    private String workId;
    private String desc;
    private String status;

    public Work(String desc, String status, String workId) {
        this.desc = desc;
        this.status = status;
        this.workId = workId;
    }


    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkDetails() {
        return "ang werk ID: " + workId + ", ang description: " + desc + ", ang status: " + status;
    }



}