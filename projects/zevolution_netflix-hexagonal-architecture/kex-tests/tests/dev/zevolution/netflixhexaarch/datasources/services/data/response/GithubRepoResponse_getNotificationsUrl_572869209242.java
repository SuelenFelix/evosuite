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

public class GithubRepoResponse_getNotificationsUrl_572869209242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291265;

    public GithubRepoResponse_getNotificationsUrl_572869209242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291265 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291265, term291265.getClass(), "id", null);
        setField(term291265, term291265.getClass(), "nodeId", null);
        setField(term291265, term291265.getClass(), "name", null);
        setField(term291265, term291265.getClass(), "fullName", null);
        setField(term291265, term291265.getClass(), "_private", null);
        setField(term291265, term291265.getClass(), "owner", null);
        setField(term291265, term291265.getClass(), "htmlUrl", null);
        setField(term291265, term291265.getClass(), "description", null);
        setField(term291265, term291265.getClass(), "fork", null);
        setField(term291265, term291265.getClass(), "url", null);
        setField(term291265, term291265.getClass(), "forksUrl", null);
        setField(term291265, term291265.getClass(), "keysUrl", null);
        setField(term291265, term291265.getClass(), "collaboratorsUrl", null);
        setField(term291265, term291265.getClass(), "teamsUrl", null);
        setField(term291265, term291265.getClass(), "hooksUrl", null);
        setField(term291265, term291265.getClass(), "issueEventsUrl", null);
        setField(term291265, term291265.getClass(), "eventsUrl", null);
        setField(term291265, term291265.getClass(), "assigneesUrl", null);
        setField(term291265, term291265.getClass(), "branchesUrl", null);
        setField(term291265, term291265.getClass(), "tagsUrl", null);
        setField(term291265, term291265.getClass(), "blobsUrl", null);
        setField(term291265, term291265.getClass(), "gitTagsUrl", null);
        setField(term291265, term291265.getClass(), "gitRefsUrl", null);
        setField(term291265, term291265.getClass(), "treesUrl", null);
        setField(term291265, term291265.getClass(), "statusesUrl", null);
        setField(term291265, term291265.getClass(), "languagesUrl", null);
        setField(term291265, term291265.getClass(), "stargazersUrl", null);
        setField(term291265, term291265.getClass(), "contributorsUrl", null);
        setField(term291265, term291265.getClass(), "subscribersUrl", null);
        setField(term291265, term291265.getClass(), "subscriptionUrl", null);
        setField(term291265, term291265.getClass(), "commitsUrl", null);
        setField(term291265, term291265.getClass(), "gitCommitsUrl", null);
        setField(term291265, term291265.getClass(), "commentsUrl", null);
        setField(term291265, term291265.getClass(), "issueCommentUrl", null);
        setField(term291265, term291265.getClass(), "contentsUrl", null);
        setField(term291265, term291265.getClass(), "compareUrl", null);
        setField(term291265, term291265.getClass(), "mergesUrl", null);
        setField(term291265, term291265.getClass(), "archiveUrl", null);
        setField(term291265, term291265.getClass(), "downloadsUrl", null);
        setField(term291265, term291265.getClass(), "issuesUrl", null);
        setField(term291265, term291265.getClass(), "pullsUrl", null);
        setField(term291265, term291265.getClass(), "milestonesUrl", null);
        setField(term291265, term291265.getClass(), "notificationsUrl", null);
        setField(term291265, term291265.getClass(), "labelsUrl", null);
        setField(term291265, term291265.getClass(), "releasesUrl", null);
        setField(term291265, term291265.getClass(), "deploymentsUrl", null);
        setField(term291265, term291265.getClass(), "createdAt", null);
        setField(term291265, term291265.getClass(), "updatedAt", null);
        setField(term291265, term291265.getClass(), "pushedAt", null);
        setField(term291265, term291265.getClass(), "gitUrl", null);
        setField(term291265, term291265.getClass(), "sshUrl", null);
        setField(term291265, term291265.getClass(), "cloneUrl", null);
        setField(term291265, term291265.getClass(), "svnUrl", null);
        setField(term291265, term291265.getClass(), "homepage", null);
        setField(term291265, term291265.getClass(), "size", null);
        setField(term291265, term291265.getClass(), "stargazersCount", null);
        setField(term291265, term291265.getClass(), "watchersCount", null);
        setField(term291265, term291265.getClass(), "language", null);
        setField(term291265, term291265.getClass(), "hasIssues", null);
        setField(term291265, term291265.getClass(), "hasProjects", null);
        setField(term291265, term291265.getClass(), "hasDownloads", null);
        setField(term291265, term291265.getClass(), "hasWiki", null);
        setField(term291265, term291265.getClass(), "hasPages", null);
        setField(term291265, term291265.getClass(), "forksCount", null);
        setField(term291265, term291265.getClass(), "archived", null);
        setField(term291265, term291265.getClass(), "disabled", null);
        setField(term291265, term291265.getClass(), "openIssuesCount", null);
        setField(term291265, term291265.getClass(), "license", null);
        setField(term291265, term291265.getClass(), "allowForking", null);
        setField(term291265, term291265.getClass(), "isTemplate", null);
        setField(term291265, term291265.getClass(), "topics", null);
        setField(term291265, term291265.getClass(), "visibility", null);
        setField(term291265, term291265.getClass(), "forks", null);
        setField(term291265, term291265.getClass(), "openIssues", null);
        setField(term291265, term291265.getClass(), "watchers", null);
        setField(term291265, term291265.getClass(), "defaultBranch", null);
        setField(term291265, term291265.getClass(), "networkCount", null);
        setField(term291265, term291265.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNotificationsUrl", argTypes, term291265, args);
    }

};


