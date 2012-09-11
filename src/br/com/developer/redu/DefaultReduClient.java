package br.com.developer.redu;

import br.com.developer.redu.models.*;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/4/12
 * Time: 9:20 AM
 * To change this template use File | Settings | File Templates.
 */

public class DefaultReduClient extends ReduClient<Course, Enrollment, Environment, Space, Subject,
        User, Status> {

    public DefaultReduClient(String consumerKey, String consumerSecret) {
        super(consumerKey, consumerSecret);
    }
    public DefaultReduClient(String consumerKey, String consumerSecret, String pin){
        super(consumerKey, consumerSecret, pin);
    }

    @Override
    protected void initTypes() {
        super.userClass = User.class;
        super.userList = new TypeToken<List<User>>(){}.getType();
        super.subjectClass = Subject.class;
        super.subjectList = new TypeToken<List<Subject>>(){}.getType();
        super.enrollmentClass = Enrollment.class;
        super.enrollmentList = new TypeToken<List<Enrollment>>(){}.getType();
        super.courseClass = Course.class;
        super.courseList = new TypeToken<List<Course>>(){}.getType();
        super.spaceClass = Space.class;
        super.spaceList = new TypeToken<List<Space>>(){}.getType();
        super.statusList = new TypeToken<List<Status>>() {}.getType();
        super.statusClass = Status.class;
        super.environmentClass = Environment.class;
    }

}
