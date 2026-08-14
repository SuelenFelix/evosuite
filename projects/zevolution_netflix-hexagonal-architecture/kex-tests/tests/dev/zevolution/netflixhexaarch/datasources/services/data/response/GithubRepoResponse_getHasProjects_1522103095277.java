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

public class GithubRepoResponse_getHasProjects_1522103095277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291300;

    public GithubRepoResponse_getHasProjects_1522103095277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291300 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291300, term291300.getClass(), "id", null);
        setField(term291300, term291300.getClass(), "nodeId", null);
        setField(term291300, term291300.getClass(), "name", null);
        setField(term291300, term291300.getClass(), "fullName", null);
        setField(term291300, term291300.getClass(), "_private", null);
        setField(term291300, term291300.getClass(), "owner", null);
        setField(term291300, term291300.getClass(), "htmlUrl", null);
        setField(term291300, term291300.getClass(), "description", null);
        setField(term291300, term291300.getClass(), "fork", null);
        setField(term291300, term291300.getClass(), "url", null);
        setField(term291300, term291300.getClass(), "forksUrl", null);
        setField(term291300, term291300.getClass(), "keysUrl", null);
        setField(term291300, term291300.getClass(), "collaboratorsUrl", null);
        setField(term291300, term291300.getClass(), "teamsUrl", null);
        setField(term291300, term291300.getClass(), "hooksUrl", null);
        setField(term291300, term291300.getClass(), "issueEventsUrl", null);
        setField(term291300, term291300.getClass(), "eventsUrl", null);
        setField(term291300, term291300.getClass(), "assigneesUrl", null);
        setField(term291300, term291300.getClass(), "branchesUrl", null);
        setField(term291300, term291300.getClass(), "tagsUrl", null);
        setField(term291300, term291300.getClass(), "blobsUrl", null);
        setField(term291300, term291300.getClass(), "gitTagsUrl", null);
        setField(term291300, term291300.getClass(), "gitRefsUrl", null);
        setField(term291300, term291300.getClass(), "treesUrl", null);
        setField(term291300, term291300.getClass(), "statusesUrl", null);
        setField(term291300, term291300.getClass(), "languagesUrl", null);
        setField(term291300, term291300.getClass(), "stargazersUrl", null);
        setField(term291300, term291300.getClass(), "contributorsUrl", null);
        setField(term291300, term291300.getClass(), "subscribersUrl", null);
        setField(term291300, term291300.getClass(), "subscriptionUrl", null);
        setField(term291300, term291300.getClass(), "commitsUrl", null);
        setField(term291300, term291300.getClass(), "gitCommitsUrl", null);
        setField(term291300, term291300.getClass(), "commentsUrl", null);
        setField(term291300, term291300.getClass(), "issueCommentUrl", null);
        setField(term291300, term291300.getClass(), "contentsUrl", null);
        setField(term291300, term291300.getClass(), "compareUrl", null);
        setField(term291300, term291300.getClass(), "mergesUrl", null);
        setField(term291300, term291300.getClass(), "archiveUrl", null);
        setField(term291300, term291300.getClass(), "downloadsUrl", null);
        setField(term291300, term291300.getClass(), "issuesUrl", null);
        setField(term291300, term291300.getClass(), "pullsUrl", null);
        setField(term291300, term291300.getClass(), "milestonesUrl", null);
        setField(term291300, term291300.getClass(), "notificationsUrl", null);
        setField(term291300, term291300.getClass(), "labelsUrl", null);
        setField(term291300, term291300.getClass(), "releasesUrl", null);
        setField(term291300, term291300.getClass(), "deploymentsUrl", null);
        setField(term291300, term291300.getClass(), "createdAt", null);
        setField(term291300, term291300.getClass(), "updatedAt", null);
        setField(term291300, term291300.getClass(), "pushedAt", null);
        setField(term291300, term291300.getClass(), "gitUrl", null);
        setField(term291300, term291300.getClass(), "sshUrl", null);
        setField(term291300, term291300.getClass(), "cloneUrl", null);
        setField(term291300, term291300.getClass(), "svnUrl", null);
        setField(term291300, term291300.getClass(), "homepage", null);
        setField(term291300, term291300.getClass(), "size", null);
        setField(term291300, term291300.getClass(), "stargazersCount", null);
        setField(term291300, term291300.getClass(), "watchersCount", null);
        setField(term291300, term291300.getClass(), "language", null);
        setField(term291300, term291300.getClass(), "hasIssues", null);
        setField(term291300, term291300.getClass(), "hasProjects", null);
        setField(term291300, term291300.getClass(), "hasDownloads", null);
        setField(term291300, term291300.getClass(), "hasWiki", null);
        setField(term291300, term291300.getClass(), "hasPages", null);
        setField(term291300, term291300.getClass(), "forksCount", null);
        setField(term291300, term291300.getClass(), "archived", null);
        setField(term291300, term291300.getClass(), "disabled", null);
        setField(term291300, term291300.getClass(), "openIssuesCount", null);
        setField(term291300, term291300.getClass(), "license", null);
        setField(term291300, term291300.getClass(), "allowForking", null);
        setField(term291300, term291300.getClass(), "isTemplate", null);
        setField(term291300, term291300.getClass(), "topics", null);
        setField(term291300, term291300.getClass(), "visibility", null);
        setField(term291300, term291300.getClass(), "forks", null);
        setField(term291300, term291300.getClass(), "openIssues", null);
        setField(term291300, term291300.getClass(), "watchers", null);
        setField(term291300, term291300.getClass(), "defaultBranch", null);
        setField(term291300, term291300.getClass(), "networkCount", null);
        setField(term291300, term291300.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasProjects", argTypes, term291300, args);
    }

};


