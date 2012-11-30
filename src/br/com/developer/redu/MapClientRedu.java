package br.com.developer.redu;

import com.google.gson.internal.StringMap;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.lang.reflect.Type;


/**
 * @author igor
 * 
 * Implementação concreta alternativa para o ReduClient, nessa classe todos os recursos são
 * representados pela classe generica StringMap que é basicamente uma accessor para jsons
 */
public class MapClientRedu extends ReduClient<StringMap, StringMap, StringMap,StringMap, StringMap,
        StringMap, StringMap, StringMap, StringMap> {
    public MapClientRedu(String consumerKey, String consumerSecret, String pin) {
        super(consumerKey, consumerSecret, pin);
    }

    @Override
    protected void initTypes() {
    	Type stringMapListType = new TypeToken<List<StringMap>>(){}.getType();
    	
        super.userClass = StringMap.class;
        super.userList = stringMapListType;
        super.subjectClass =StringMap.class;
        super.subjectList = stringMapListType;
        super.enrollmentClass = StringMap.class;
        super.enrollmentList = stringMapListType;
        super.courseClass = StringMap.class;
        super.courseList = stringMapListType;
        super.spaceClass = StringMap.class;
        super.spaceList = stringMapListType;
        super.statusClass = StringMap.class;
        super.statusList = stringMapListType;
        super.environmentClass = StringMap.class;
        super.chatMessageClass = StringMap.class;
        super.chatMessageList = stringMapListType;
        super.chatClass = StringMap.class;
        super.chatList = stringMapListType;
        
    }

}
