package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GithubRepoResponse_getHtmlUrl_1828088808170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291193;

    public GithubRepoResponse_getHtmlUrl_1828088808170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291193 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291193, term291193.getClass(), "id", null);
        setField(term291193, term291193.getClass(), "nodeId", null);
        setField(term291193, term291193.getClass(), "name", null);
        setField(term291193, term291193.getClass(), "fullName", null);
        setField(term291193, term291193.getClass(), "_private", null);
        setField(term291193, term291193.getClass(), "owner", null);
        setField(term291193, term291193.getClass(), "htmlUrl", null);
        setField(term291193, term291193.getClass(), "description", null);
        setField(term291193, term291193.getClass(), "fork", null);
        setField(term291193, term291193.getClass(), "url", null);
        setField(term291193, term291193.getClass(), "forksUrl", null);
        setField(term291193, term291193.getClass(), "keysUrl", null);
        setField(term291193, term291193.getClass(), "collaboratorsUrl", null);
        setField(term291193, term291193.getClass(), "teamsUrl", null);
        setField(term291193, term291193.getClass(), "hooksUrl", null);
        setField(term291193, term291193.getClass(), "issueEventsUrl", null);
        setField(term291193, term291193.getClass(), "eventsUrl", null);
        setField(term291193, term291193.getClass(), "assigneesUrl", null);
        setField(term291193, term291193.getClass(), "branchesUrl", null);
        setField(term291193, term291193.getClass(), "tagsUrl", null);
        setField(term291193, term291193.getClass(), "blobsUrl", null);
        setField(term291193, term291193.getClass(), "gitTagsUrl", null);
        setField(term291193, term291193.getClass(), "gitRefsUrl", null);
        setField(term291193, term291193.getClass(), "treesUrl", null);
        setField(term291193, term291193.getClass(), "statusesUrl", null);
        setField(term291193, term291193.getClass(), "languagesUrl", null);
        setField(term291193, term291193.getClass(), "stargazersUrl", null);
        setField(term291193, term291193.getClass(), "contributorsUrl", null);
        setField(term291193, term291193.getClass(), "subscribersUrl", null);
        setField(term291193, term291193.getClass(), "subscriptionUrl", null);
        setField(term291193, term291193.getClass(), "commitsUrl", null);
        setField(term291193, term291193.getClass(), "gitCommitsUrl", null);
        setField(term291193, term291193.getClass(), "commentsUrl", null);
        setField(term291193, term291193.getClass(), "issueCommentUrl", null);
        setField(term291193, term291193.getClass(), "contentsUrl", null);
        setField(term291193, term291193.getClass(), "compareUrl", null);
        setField(term291193, term291193.getClass(), "mergesUrl", null);
        setField(term291193, term291193.getClass(), "archiveUrl", null);
        setField(term291193, term291193.getClass(), "downloadsUrl", null);
        setField(term291193, term291193.getClass(), "issuesUrl", null);
        setField(term291193, term291193.getClass(), "pullsUrl", null);
        setField(term291193, term291193.getClass(), "milestonesUrl", null);
        setField(term291193, term291193.getClass(), "notificationsUrl", null);
        setField(term291193, term291193.getClass(), "labelsUrl", null);
        setField(term291193, term291193.getClass(), "releasesUrl", null);
        setField(term291193, term291193.getClass(), "deploymentsUrl", null);
        setField(term291193, term291193.getClass(), "createdAt", null);
        setField(term291193, term291193.getClass(), "updatedAt", null);
        setField(term291193, term291193.getClass(), "pushedAt", null);
        setField(term291193, term291193.getClass(), "gitUrl", null);
        setField(term291193, term291193.getClass(), "sshUrl", null);
        setField(term291193, term291193.getClass(), "cloneUrl", null);
        setField(term291193, term291193.getClass(), "svnUrl", null);
        setField(term291193, term291193.getClass(), "homepage", null);
        setField(term291193, term291193.getClass(), "size", null);
        setField(term291193, term291193.getClass(), "stargazersCount", null);
        setField(term291193, term291193.getClass(), "watchersCount", null);
        setField(term291193, term291193.getClass(), "language", null);
        setField(term291193, term291193.getClass(), "hasIssues", null);
        setField(term291193, term291193.getClass(), "hasProjects", null);
        setField(term291193, term291193.getClass(), "hasDownloads", null);
        setField(term291193, term291193.getClass(), "hasWiki", null);
        setField(term291193, term291193.getClass(), "hasPages", null);
        setField(term291193, term291193.getClass(), "forksCount", null);
        setField(term291193, term291193.getClass(), "archived", null);
        setField(term291193, term291193.getClass(), "disabled", null);
        setField(term291193, term291193.getClass(), "openIssuesCount", null);
        setField(term291193, term291193.getClass(), "license", null);
        setField(term291193, term291193.getClass(), "allowForking", null);
        setField(term291193, term291193.getClass(), "isTemplate", null);
        setField(term291193, term291193.getClass(), "topics", null);
        setField(term291193, term291193.getClass(), "visibility", null);
        setField(term291193, term291193.getClass(), "forks", null);
        setField(term291193, term291193.getClass(), "openIssues", null);
        setField(term291193, term291193.getClass(), "watchers", null);
        setField(term291193, term291193.getClass(), "defaultBranch", null);
        setField(term291193, term291193.getClass(), "networkCount", null);
        setField(term291193, term291193.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlUrl", argTypes, term291193, args);
    }

};


