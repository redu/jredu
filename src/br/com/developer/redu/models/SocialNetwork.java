package br.com.developer.redu.models;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 8/31/12
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class SocialNetwork {
    public String name;
    public String profile;

    @Override
    public String toString(){
        return String.format("name: %s\nprofile: %s", name, profile);
    }
}
