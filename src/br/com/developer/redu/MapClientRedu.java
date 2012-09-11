package br.com.developer.redu;

import com.google.gson.internal.StringMap;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/4/12
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */

public class MapClientRedu extends ReduClient<StringMap, StringMap, StringMap,StringMap, StringMap,
        StringMap, StringMap> {
    public MapClientRedu(String consumerKey, String consumerSecret, String pin) {
        super(consumerKey, consumerSecret, pin);
    }

    @Override
    protected void initTypes() {
        super.userClass = StringMap.class;
        super.userList = new TypeToken<List<StringMap>>(){}.getType();
        super.subjectClass =StringMap.class;
        super.subjectList = new TypeToken<List<StringMap>>(){}.getType();
        super.enrollmentClass = StringMap.class;
        super.enrollmentList = new TypeToken<List<StringMap>>(){}.getType();
        super.courseClass = StringMap.class;
        super.courseList = new TypeToken<List<StringMap>>(){}.getType();
        super.spaceClass = StringMap.class;
        super.spaceList = new TypeToken<List<StringMap>>(){}.getType();
        super.statusClass = StringMap.class;
        super.statusList = new TypeToken<List<StringMap>>(){}.getType();
        super.environmentClass = StringMap.class;
    }
}
