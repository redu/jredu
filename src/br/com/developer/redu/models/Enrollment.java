package br.com.developer.redu.models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 8/31/12
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enrollment {
    public String id;
    public String state;
    public String created_at;
    public List<Link> links;

    @Override
    public String toString(){
        return String.format("id: %s\nstate: %s\ncreated_at: %s\nlinks: %s",
        id, state ,created_at , links);
    }

}
