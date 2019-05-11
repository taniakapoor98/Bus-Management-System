package newpackage;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bus_sch {
    private String bus_no;
    @Id
    @GeneratedValue
    private int id;
    private String route_no;
    private String dname;
    private String city;
    private String route;

    public String getBus_no() {
        return bus_no;
    }

    public int getId() {
        return id;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }

    public String getRoute_no() {
        return route_no;
    }

    public void setRoute_no(String route_no) {
        this.route_no = route_no;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    
}
