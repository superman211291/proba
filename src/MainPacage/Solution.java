package MainPacage;

/**
 * Created by superman on 25.06.17.
 */
public class Solution {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    boolean isNew(){
        return (this.id==null);
    }
}
