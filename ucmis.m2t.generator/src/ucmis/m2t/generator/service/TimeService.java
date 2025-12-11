package ucmis.m2t.generator.service;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeService {

    public String getCurrentTime(Object object) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
    }
}