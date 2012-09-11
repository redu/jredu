package br.com.developer.redu.api;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 */
public interface EnvironmentMethods<T> {
    public T getEnvironment(String environmentId);

    public T postEnvironment(String name, String path, String initials, String description);

    public void editEnvironment(String environmentId,String name, String path, String initials, String description);

    public void deleteEnvironment(String environmentId);

}
