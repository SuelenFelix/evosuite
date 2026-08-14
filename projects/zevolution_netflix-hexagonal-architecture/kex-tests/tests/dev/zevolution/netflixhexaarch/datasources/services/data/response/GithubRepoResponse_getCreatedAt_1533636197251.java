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

public class GithubRepoResponse_getCreatedAt_1533636197251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291274;

    public GithubRepoResponse_getCreatedAt_1533636197251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291274 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291274, term291274.getClass(), "id", null);
        setField(term291274, term291274.getClass(), "nodeId", null);
        setField(term291274, term291274.getClass(), "name", null);
        setField(term291274, term291274.getClass(), "fullName", null);
        setField(term291274, term291274.getClass(), "_private", null);
        setField(term291274, term291274.getClass(), "owner", null);
        setField(term291274, term291274.getClass(), "htmlUrl", null);
        setField(term291274, term291274.getClass(), "description", null);
        setField(term291274, term291274.getClass(), "fork", null);
        setField(term291274, term291274.getClass(), "url", null);
        setField(term291274, term291274.getClass(), "forksUrl", null);
        setField(term291274, term291274.getClass(), "keysUrl", null);
        setField(term291274, term291274.getClass(), "collaboratorsUrl", null);
        setField(term291274, term291274.getClass(), "teamsUrl", null);
        setField(term291274, term291274.getClass(), "hooksUrl", null);
        setField(term291274, term291274.getClass(), "issueEventsUrl", null);
        setField(term291274, term291274.getClass(), "eventsUrl", null);
        setField(term291274, term291274.getClass(), "assigneesUrl", null);
        setField(term291274, term291274.getClass(), "branchesUrl", null);
        setField(term291274, term291274.getClass(), "tagsUrl", null);
        setField(term291274, term291274.getClass(), "blobsUrl", null);
        setField(term291274, term291274.getClass(), "gitTagsUrl", null);
        setField(term291274, term291274.getClass(), "gitRefsUrl", null);
        setField(term291274, term291274.getClass(), "treesUrl", null);
        setField(term291274, term291274.getClass(), "statusesUrl", null);
        setField(term291274, term291274.getClass(), "languagesUrl", null);
        setField(term291274, term291274.getClass(), "stargazersUrl", null);
        setField(term291274, term291274.getClass(), "contributorsUrl", null);
        setField(term291274, term291274.getClass(), "subscribersUrl", null);
        setField(term291274, term291274.getClass(), "subscriptionUrl", null);
        setField(term291274, term291274.getClass(), "commitsUrl", null);
        setField(term291274, term291274.getClass(), "gitCommitsUrl", null);
        setField(term291274, term291274.getClass(), "commentsUrl", null);
        setField(term291274, term291274.getClass(), "issueCommentUrl", null);
        setField(term291274, term291274.getClass(), "contentsUrl", null);
        setField(term291274, term291274.getClass(), "compareUrl", null);
        setField(term291274, term291274.getClass(), "mergesUrl", null);
        setField(term291274, term291274.getClass(), "archiveUrl", null);
        setField(term291274, term291274.getClass(), "downloadsUrl", null);
        setField(term291274, term291274.getClass(), "issuesUrl", null);
        setField(term291274, term291274.getClass(), "pullsUrl", null);
        setField(term291274, term291274.getClass(), "milestonesUrl", null);
        setField(term291274, term291274.getClass(), "notificationsUrl", null);
        setField(term291274, term291274.getClass(), "labelsUrl", null);
        setField(term291274, term291274.getClass(), "releasesUrl", null);
        setField(term291274, term291274.getClass(), "deploymentsUrl", null);
        setField(term291274, term291274.getClass(), "createdAt", null);
        setField(term291274, term291274.getClass(), "updatedAt", null);
        setField(term291274, term291274.getClass(), "pushedAt", null);
        setField(term291274, term291274.getClass(), "gitUrl", null);
        setField(term291274, term291274.getClass(), "sshUrl", null);
        setField(term291274, term291274.getClass(), "cloneUrl", null);
        setField(term291274, term291274.getClass(), "svnUrl", null);
        setField(term291274, term291274.getClass(), "homepage", null);
        setField(term291274, term291274.getClass(), "size", null);
        setField(term291274, term291274.getClass(), "stargazersCount", null);
        setField(term291274, term291274.getClass(), "watchersCount", null);
        setField(term291274, term291274.getClass(), "language", null);
        setField(term291274, term291274.getClass(), "hasIssues", null);
        setField(term291274, term291274.getClass(), "hasProjects", null);
        setField(term291274, term291274.getClass(), "hasDownloads", null);
        setField(term291274, term291274.getClass(), "hasWiki", null);
        setField(term291274, term291274.getClass(), "hasPages", null);
        setField(term291274, term291274.getClass(), "forksCount", null);
        setField(term291274, term291274.getClass(), "archived", null);
        setField(term291274, term291274.getClass(), "disabled", null);
        setField(term291274, term291274.getClass(), "openIssuesCount", null);
        setField(term291274, term291274.getClass(), "license", null);
        setField(term291274, term291274.getClass(), "allowForking", null);
        setField(term291274, term291274.getClass(), "isTemplate", null);
        setField(term291274, term291274.getClass(), "topics", null);
        setField(term291274, term291274.getClass(), "visibility", null);
        setField(term291274, term291274.getClass(), "forks", null);
        setField(term291274, term291274.getClass(), "openIssues", null);
        setField(term291274, term291274.getClass(), "watchers", null);
        setField(term291274, term291274.getClass(), "defaultBranch", null);
        setField(term291274, term291274.getClass(), "networkCount", null);
        setField(term291274, term291274.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term291274, args);
    }

};


