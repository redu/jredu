package br.com.developer.redu.models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 8/31/12
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Environment {
    public String name;
    public String created_at;
    public String initials;
    public String path;

    public List<Link> links;

    @Override
    public String toString(){
        return String.format("name: %s\ncreated_at: %s\ninitials: %s\npath: %s\nlinks: %s",
                name, created_at,initials, path, links);

    }

}
