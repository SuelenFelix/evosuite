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

public class GithubRepoResponse_getArchiveUrl_23727475232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291255;

    public GithubRepoResponse_getArchiveUrl_23727475232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291255 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291255, term291255.getClass(), "id", null);
        setField(term291255, term291255.getClass(), "nodeId", null);
        setField(term291255, term291255.getClass(), "name", null);
        setField(term291255, term291255.getClass(), "fullName", null);
        setField(term291255, term291255.getClass(), "_private", null);
        setField(term291255, term291255.getClass(), "owner", null);
        setField(term291255, term291255.getClass(), "htmlUrl", null);
        setField(term291255, term291255.getClass(), "description", null);
        setField(term291255, term291255.getClass(), "fork", null);
        setField(term291255, term291255.getClass(), "url", null);
        setField(term291255, term291255.getClass(), "forksUrl", null);
        setField(term291255, term291255.getClass(), "keysUrl", null);
        setField(term291255, term291255.getClass(), "collaboratorsUrl", null);
        setField(term291255, term291255.getClass(), "teamsUrl", null);
        setField(term291255, term291255.getClass(), "hooksUrl", null);
        setField(term291255, term291255.getClass(), "issueEventsUrl", null);
        setField(term291255, term291255.getClass(), "eventsUrl", null);
        setField(term291255, term291255.getClass(), "assigneesUrl", null);
        setField(term291255, term291255.getClass(), "branchesUrl", null);
        setField(term291255, term291255.getClass(), "tagsUrl", null);
        setField(term291255, term291255.getClass(), "blobsUrl", null);
        setField(term291255, term291255.getClass(), "gitTagsUrl", null);
        setField(term291255, term291255.getClass(), "gitRefsUrl", null);
        setField(term291255, term291255.getClass(), "treesUrl", null);
        setField(term291255, term291255.getClass(), "statusesUrl", null);
        setField(term291255, term291255.getClass(), "languagesUrl", null);
        setField(term291255, term291255.getClass(), "stargazersUrl", null);
        setField(term291255, term291255.getClass(), "contributorsUrl", null);
        setField(term291255, term291255.getClass(), "subscribersUrl", null);
        setField(term291255, term291255.getClass(), "subscriptionUrl", null);
        setField(term291255, term291255.getClass(), "commitsUrl", null);
        setField(term291255, term291255.getClass(), "gitCommitsUrl", null);
        setField(term291255, term291255.getClass(), "commentsUrl", null);
        setField(term291255, term291255.getClass(), "issueCommentUrl", null);
        setField(term291255, term291255.getClass(), "contentsUrl", null);
        setField(term291255, term291255.getClass(), "compareUrl", null);
        setField(term291255, term291255.getClass(), "mergesUrl", null);
        setField(term291255, term291255.getClass(), "archiveUrl", null);
        setField(term291255, term291255.getClass(), "downloadsUrl", null);
        setField(term291255, term291255.getClass(), "issuesUrl", null);
        setField(term291255, term291255.getClass(), "pullsUrl", null);
        setField(term291255, term291255.getClass(), "milestonesUrl", null);
        setField(term291255, term291255.getClass(), "notificationsUrl", null);
        setField(term291255, term291255.getClass(), "labelsUrl", null);
        setField(term291255, term291255.getClass(), "releasesUrl", null);
        setField(term291255, term291255.getClass(), "deploymentsUrl", null);
        setField(term291255, term291255.getClass(), "createdAt", null);
        setField(term291255, term291255.getClass(), "updatedAt", null);
        setField(term291255, term291255.getClass(), "pushedAt", null);
        setField(term291255, term291255.getClass(), "gitUrl", null);
        setField(term291255, term291255.getClass(), "sshUrl", null);
        setField(term291255, term291255.getClass(), "cloneUrl", null);
        setField(term291255, term291255.getClass(), "svnUrl", null);
        setField(term291255, term291255.getClass(), "homepage", null);
        setField(term291255, term291255.getClass(), "size", null);
        setField(term291255, term291255.getClass(), "stargazersCount", null);
        setField(term291255, term291255.getClass(), "watchersCount", null);
        setField(term291255, term291255.getClass(), "language", null);
        setField(term291255, term291255.getClass(), "hasIssues", null);
        setField(term291255, term291255.getClass(), "hasProjects", null);
        setField(term291255, term291255.getClass(), "hasDownloads", null);
        setField(term291255, term291255.getClass(), "hasWiki", null);
        setField(term291255, term291255.getClass(), "hasPages", null);
        setField(term291255, term291255.getClass(), "forksCount", null);
        setField(term291255, term291255.getClass(), "archived", null);
        setField(term291255, term291255.getClass(), "disabled", null);
        setField(term291255, term291255.getClass(), "openIssuesCount", null);
        setField(term291255, term291255.getClass(), "license", null);
        setField(term291255, term291255.getClass(), "allowForking", null);
        setField(term291255, term291255.getClass(), "isTemplate", null);
        setField(term291255, term291255.getClass(), "topics", null);
        setField(term291255, term291255.getClass(), "visibility", null);
        setField(term291255, term291255.getClass(), "forks", null);
        setField(term291255, term291255.getClass(), "openIssues", null);
        setField(term291255, term291255.getClass(), "watchers", null);
        setField(term291255, term291255.getClass(), "defaultBranch", null);
        setField(term291255, term291255.getClass(), "networkCount", null);
        setField(term291255, term291255.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArchiveUrl", argTypes, term291255, args);
    }

};


