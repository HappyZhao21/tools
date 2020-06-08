package xiqing.org.entity;


/**
 * @author ThinkPad
 */
public  class Score {
    private Integer id;
    private String name;
    private Integer StuId;

    public Score() {
    }

    public Score(Integer id, String name, Integer stuId) {
        this.id = id;
        this.name = name;
        StuId = stuId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStuId() {
        return StuId;
    }

    public void setStuId(Integer stuId) {
        StuId = stuId;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", StuId=" + StuId +
                '}';
    }
}