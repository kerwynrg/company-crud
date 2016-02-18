package company;

import java.util.List;
import org.springframework.data.annotation.Id;

public class Company {

    @Id private String id;

    private String name;
    private String address;
    private String city;
    private String country;
    private String email;
    private String phone;
    private List<String> owners;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
