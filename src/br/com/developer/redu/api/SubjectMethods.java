package br.com.developer.redu.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public interface SubjectMethods<T> {
    public T getSubject(String subjectId);

    public List<T> getSubjectsBySpace(String spaceId);

    public T postSubject(String spaceId, String title, String description);

    public void editSubject(String subjectId, String title, String description);

    public void deleteSubject(String subjectId);

}


