package br.com.developer.redu.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 8/31/12
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserMethods<T> {
    public T getUser(String userId);

    public T getMe();

    public List<T> getUsersBySpace(String spaceId);

    public List<T> getUsersBySpace(String spaceId, String role);


}
