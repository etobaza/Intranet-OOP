package Main;
import java.lang.*;

/**
 */
public class Manager extends Employee implements ViewInfoStudents, ViewTransript, ViewTeachers, Create {
    /**
     */
    private ManagerType type;

    /**
     */
    private ArrayList<News> news;

    /**
     */
    private Vector<Teacher> teachers;

    /**
     */
    private Vector<Strudent> students;

    /**
     * @return 
     */
    public boolean approveStrudentRegistr() {
        return false;
    }

    /**
     * @return 
     */
    public boolean assignCoursesTeacher() {
        return false;
    }

    /**
     * @return 
     */
    public boolean addCoursesForRegistr() {
        return false;
    }

    /**
     */
    public void viewStrudentInfo() {
    }

    /**
     */
    public void manageNews() {
    }

    /**
     * @param news 
     * @return 
     */
    public boolean addNews(News news) {
        return false;
    }

    /**
     * @param news 
     * @return 
     */
    public boolean removeNews(News news) {
        return false;
    }

    /**
     * @param news 
     * @return 
     */
    public boolean updateNews(News news) {
        return false;
    }

    /**
     * @return 
     */
    public String generateReport() {
        return null;
    }

    /**
     */
    public void assignTeacher() {
    }

    /**
     * @return 
     */
    public boolean addOrganisation() {
        return false;
    }

    /**
     * @return 
     */
    public boolean updateOrganisation() {
        return false;
    }

    /**
     * @return 
     */
    public boolean removeOrganisation() {
        return false;
    }

    /**
     * @return 
     */
    public boolean assignOrgLeader() {
        return false;
    }

    /**
     * @return 
     */
    public boolean removerOrgLeader() {
        return false;
    }

    /**
     * @return 
     */
    public boolean sendMessage() {
        return false;
    }

    /**
     */
    public void viewTeacher() {
    }
}

