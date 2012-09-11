package br.com.developer.redu.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public interface EnrollnmentMethods<T> {
    public T getEnrollment(String enrollmentId);

    public T postEnrollment(String courseId, String email);

    public List<T> getEnrollmentsByCourse(String courseId);

    public void deleteEnrollment(String enrollmentId);
}
