package br.com.developer.redu;

import br.com.developer.redu.models.*;

import com.google.gson.reflect.TypeToken;

import java.util.List;


/**
 * @author igor
 * Classe que faz uma implementação concreta do Wrapper. Herda do ReduClient que fez 
 * a implementação das requisições. Objetivo dessa classe é servir como um Factory dos modelos.
 * Aqui são definidos os  parametros do ReduClient  e o seus respectivos tipos no initTypes.
 */
public class DefaultReduClient extends ReduClient<Course, Enrollment, Environment, Space, Subject,
        User, Status, ChatMessage, Chat> {

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
        super.chatMessageClass = ChatMessage.class;
        super.chatMessageList= new TypeToken<List<ChatMessage>>(){}.getType();
        super.chatClass = Chat.class;
        super.chatList = new TypeToken<List<Chat>>(){}.getType();
    }
}
