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

public class GithubRepoResponse_getCloneUrl_1826866258261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291284;

    public GithubRepoResponse_getCloneUrl_1826866258261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291284 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291284, term291284.getClass(), "id", null);
        setField(term291284, term291284.getClass(), "nodeId", null);
        setField(term291284, term291284.getClass(), "name", null);
        setField(term291284, term291284.getClass(), "fullName", null);
        setField(term291284, term291284.getClass(), "_private", null);
        setField(term291284, term291284.getClass(), "owner", null);
        setField(term291284, term291284.getClass(), "htmlUrl", null);
        setField(term291284, term291284.getClass(), "description", null);
        setField(term291284, term291284.getClass(), "fork", null);
        setField(term291284, term291284.getClass(), "url", null);
        setField(term291284, term291284.getClass(), "forksUrl", null);
        setField(term291284, term291284.getClass(), "keysUrl", null);
        setField(term291284, term291284.getClass(), "collaboratorsUrl", null);
        setField(term291284, term291284.getClass(), "teamsUrl", null);
        setField(term291284, term291284.getClass(), "hooksUrl", null);
        setField(term291284, term291284.getClass(), "issueEventsUrl", null);
        setField(term291284, term291284.getClass(), "eventsUrl", null);
        setField(term291284, term291284.getClass(), "assigneesUrl", null);
        setField(term291284, term291284.getClass(), "branchesUrl", null);
        setField(term291284, term291284.getClass(), "tagsUrl", null);
        setField(term291284, term291284.getClass(), "blobsUrl", null);
        setField(term291284, term291284.getClass(), "gitTagsUrl", null);
        setField(term291284, term291284.getClass(), "gitRefsUrl", null);
        setField(term291284, term291284.getClass(), "treesUrl", null);
        setField(term291284, term291284.getClass(), "statusesUrl", null);
        setField(term291284, term291284.getClass(), "languagesUrl", null);
        setField(term291284, term291284.getClass(), "stargazersUrl", null);
        setField(term291284, term291284.getClass(), "contributorsUrl", null);
        setField(term291284, term291284.getClass(), "subscribersUrl", null);
        setField(term291284, term291284.getClass(), "subscriptionUrl", null);
        setField(term291284, term291284.getClass(), "commitsUrl", null);
        setField(term291284, term291284.getClass(), "gitCommitsUrl", null);
        setField(term291284, term291284.getClass(), "commentsUrl", null);
        setField(term291284, term291284.getClass(), "issueCommentUrl", null);
        setField(term291284, term291284.getClass(), "contentsUrl", null);
        setField(term291284, term291284.getClass(), "compareUrl", null);
        setField(term291284, term291284.getClass(), "mergesUrl", null);
        setField(term291284, term291284.getClass(), "archiveUrl", null);
        setField(term291284, term291284.getClass(), "downloadsUrl", null);
        setField(term291284, term291284.getClass(), "issuesUrl", null);
        setField(term291284, term291284.getClass(), "pullsUrl", null);
        setField(term291284, term291284.getClass(), "milestonesUrl", null);
        setField(term291284, term291284.getClass(), "notificationsUrl", null);
        setField(term291284, term291284.getClass(), "labelsUrl", null);
        setField(term291284, term291284.getClass(), "releasesUrl", null);
        setField(term291284, term291284.getClass(), "deploymentsUrl", null);
        setField(term291284, term291284.getClass(), "createdAt", null);
        setField(term291284, term291284.getClass(), "updatedAt", null);
        setField(term291284, term291284.getClass(), "pushedAt", null);
        setField(term291284, term291284.getClass(), "gitUrl", null);
        setField(term291284, term291284.getClass(), "sshUrl", null);
        setField(term291284, term291284.getClass(), "cloneUrl", null);
        setField(term291284, term291284.getClass(), "svnUrl", null);
        setField(term291284, term291284.getClass(), "homepage", null);
        setField(term291284, term291284.getClass(), "size", null);
        setField(term291284, term291284.getClass(), "stargazersCount", null);
        setField(term291284, term291284.getClass(), "watchersCount", null);
        setField(term291284, term291284.getClass(), "language", null);
        setField(term291284, term291284.getClass(), "hasIssues", null);
        setField(term291284, term291284.getClass(), "hasProjects", null);
        setField(term291284, term291284.getClass(), "hasDownloads", null);
        setField(term291284, term291284.getClass(), "hasWiki", null);
        setField(term291284, term291284.getClass(), "hasPages", null);
        setField(term291284, term291284.getClass(), "forksCount", null);
        setField(term291284, term291284.getClass(), "archived", null);
        setField(term291284, term291284.getClass(), "disabled", null);
        setField(term291284, term291284.getClass(), "openIssuesCount", null);
        setField(term291284, term291284.getClass(), "license", null);
        setField(term291284, term291284.getClass(), "allowForking", null);
        setField(term291284, term291284.getClass(), "isTemplate", null);
        setField(term291284, term291284.getClass(), "topics", null);
        setField(term291284, term291284.getClass(), "visibility", null);
        setField(term291284, term291284.getClass(), "forks", null);
        setField(term291284, term291284.getClass(), "openIssues", null);
        setField(term291284, term291284.getClass(), "watchers", null);
        setField(term291284, term291284.getClass(), "defaultBranch", null);
        setField(term291284, term291284.getClass(), "networkCount", null);
        setField(term291284, term291284.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCloneUrl", argTypes, term291284, args);
    }

};


