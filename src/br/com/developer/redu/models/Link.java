package br.com.developer.redu.models;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 8/31/12
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Link {
    public String rel;
    public String href;


    @Override
    public String toString(){
        return String.format("rel: %s\nhref: %s", rel, href);
    }
}
