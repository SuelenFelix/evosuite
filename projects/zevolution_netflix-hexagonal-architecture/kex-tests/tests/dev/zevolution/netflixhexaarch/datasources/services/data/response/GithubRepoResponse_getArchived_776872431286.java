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

public class GithubRepoResponse_getArchived_776872431286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291309;

    public GithubRepoResponse_getArchived_776872431286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291309 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291309, term291309.getClass(), "id", null);
        setField(term291309, term291309.getClass(), "nodeId", null);
        setField(term291309, term291309.getClass(), "name", null);
        setField(term291309, term291309.getClass(), "fullName", null);
        setField(term291309, term291309.getClass(), "_private", null);
        setField(term291309, term291309.getClass(), "owner", null);
        setField(term291309, term291309.getClass(), "htmlUrl", null);
        setField(term291309, term291309.getClass(), "description", null);
        setField(term291309, term291309.getClass(), "fork", null);
        setField(term291309, term291309.getClass(), "url", null);
        setField(term291309, term291309.getClass(), "forksUrl", null);
        setField(term291309, term291309.getClass(), "keysUrl", null);
        setField(term291309, term291309.getClass(), "collaboratorsUrl", null);
        setField(term291309, term291309.getClass(), "teamsUrl", null);
        setField(term291309, term291309.getClass(), "hooksUrl", null);
        setField(term291309, term291309.getClass(), "issueEventsUrl", null);
        setField(term291309, term291309.getClass(), "eventsUrl", null);
        setField(term291309, term291309.getClass(), "assigneesUrl", null);
        setField(term291309, term291309.getClass(), "branchesUrl", null);
        setField(term291309, term291309.getClass(), "tagsUrl", null);
        setField(term291309, term291309.getClass(), "blobsUrl", null);
        setField(term291309, term291309.getClass(), "gitTagsUrl", null);
        setField(term291309, term291309.getClass(), "gitRefsUrl", null);
        setField(term291309, term291309.getClass(), "treesUrl", null);
        setField(term291309, term291309.getClass(), "statusesUrl", null);
        setField(term291309, term291309.getClass(), "languagesUrl", null);
        setField(term291309, term291309.getClass(), "stargazersUrl", null);
        setField(term291309, term291309.getClass(), "contributorsUrl", null);
        setField(term291309, term291309.getClass(), "subscribersUrl", null);
        setField(term291309, term291309.getClass(), "subscriptionUrl", null);
        setField(term291309, term291309.getClass(), "commitsUrl", null);
        setField(term291309, term291309.getClass(), "gitCommitsUrl", null);
        setField(term291309, term291309.getClass(), "commentsUrl", null);
        setField(term291309, term291309.getClass(), "issueCommentUrl", null);
        setField(term291309, term291309.getClass(), "contentsUrl", null);
        setField(term291309, term291309.getClass(), "compareUrl", null);
        setField(term291309, term291309.getClass(), "mergesUrl", null);
        setField(term291309, term291309.getClass(), "archiveUrl", null);
        setField(term291309, term291309.getClass(), "downloadsUrl", null);
        setField(term291309, term291309.getClass(), "issuesUrl", null);
        setField(term291309, term291309.getClass(), "pullsUrl", null);
        setField(term291309, term291309.getClass(), "milestonesUrl", null);
        setField(term291309, term291309.getClass(), "notificationsUrl", null);
        setField(term291309, term291309.getClass(), "labelsUrl", null);
        setField(term291309, term291309.getClass(), "releasesUrl", null);
        setField(term291309, term291309.getClass(), "deploymentsUrl", null);
        setField(term291309, term291309.getClass(), "createdAt", null);
        setField(term291309, term291309.getClass(), "updatedAt", null);
        setField(term291309, term291309.getClass(), "pushedAt", null);
        setField(term291309, term291309.getClass(), "gitUrl", null);
        setField(term291309, term291309.getClass(), "sshUrl", null);
        setField(term291309, term291309.getClass(), "cloneUrl", null);
        setField(term291309, term291309.getClass(), "svnUrl", null);
        setField(term291309, term291309.getClass(), "homepage", null);
        setField(term291309, term291309.getClass(), "size", null);
        setField(term291309, term291309.getClass(), "stargazersCount", null);
        setField(term291309, term291309.getClass(), "watchersCount", null);
        setField(term291309, term291309.getClass(), "language", null);
        setField(term291309, term291309.getClass(), "hasIssues", null);
        setField(term291309, term291309.getClass(), "hasProjects", null);
        setField(term291309, term291309.getClass(), "hasDownloads", null);
        setField(term291309, term291309.getClass(), "hasWiki", null);
        setField(term291309, term291309.getClass(), "hasPages", null);
        setField(term291309, term291309.getClass(), "forksCount", null);
        setField(term291309, term291309.getClass(), "archived", null);
        setField(term291309, term291309.getClass(), "disabled", null);
        setField(term291309, term291309.getClass(), "openIssuesCount", null);
        setField(term291309, term291309.getClass(), "license", null);
        setField(term291309, term291309.getClass(), "allowForking", null);
        setField(term291309, term291309.getClass(), "isTemplate", null);
        setField(term291309, term291309.getClass(), "topics", null);
        setField(term291309, term291309.getClass(), "visibility", null);
        setField(term291309, term291309.getClass(), "forks", null);
        setField(term291309, term291309.getClass(), "openIssues", null);
        setField(term291309, term291309.getClass(), "watchers", null);
        setField(term291309, term291309.getClass(), "defaultBranch", null);
        setField(term291309, term291309.getClass(), "networkCount", null);
        setField(term291309, term291309.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArchived", argTypes, term291309, args);
    }

};


