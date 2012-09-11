package br.com.developer.redu.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: igor
 * Date: 9/3/12
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public interface WallMethods<T> {
    public T getStatus(String statusId);

    public List<T> getAnswers(String statusId);

    public T postAnswer(String statusId, String text);

    public List<T> getStatusByUser(String userId);

    public List<T> getStatusByUser(String userId, String type);

    public List<T> getStatusByUser(String userId, String type, int page);

    public List<T> getStatusTimelineByUser(String userId);

    public List<T> getStatusTimelineByUser(String userId, String type);

    public List<T> getStatusTimelineByUser(String userId, String type, int page);

    public List<T> getStatusTimelineBySpace(String spaceId);

    public List<T> getStatusTimelineBySpace(String spaceId, String type);

    public List<T> getStatusTimelineBySpace(String spaceId, String type, int page);

    public T postStatusUser(String userId, String status);

    public List<T> getStatusBySpace(String spaceId);

    public List<T> getStatusBySpace(String spaceId, String type);

    public List<T> getStatusBySpace(String spaceId, String type, int page);

    public T postStatusSpace(String spaceId, String text);

    public List<T> getStatusByLecture(String lectureId);

    public T postStatusLecture(String lectureId, String status, String type);

    public void deleteStatus(String statusId);

}
