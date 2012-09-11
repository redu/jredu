package br.com.developer.redu.api;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 10:09 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CourseMethods<T> {
    public T getCourse(String courseId);

    public T postCourse(String environmentId, String name, String path, String workload, String description);;

    public void editCourse(String courseId, String name, String path, String workload, String description);

    public void deleteCourse(String courseId);



}
