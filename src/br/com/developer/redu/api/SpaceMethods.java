package br.com.developer.redu.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
public interface SpaceMethods<T> {
    public T getSpace(String spaceId);

    public void editSpace(String spaceId, String name, String description);

    public T postSpace(String courseId, String name, String description);

    public List<T> getSpacesByCourse(String courseId);

    public void deleteSpace(String spaceId);
}
