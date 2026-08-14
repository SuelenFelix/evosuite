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

public class GithubRepoResponse_getIssuesUrl_1741656041237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291260;

    public GithubRepoResponse_getIssuesUrl_1741656041237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291260 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291260, term291260.getClass(), "id", null);
        setField(term291260, term291260.getClass(), "nodeId", null);
        setField(term291260, term291260.getClass(), "name", null);
        setField(term291260, term291260.getClass(), "fullName", null);
        setField(term291260, term291260.getClass(), "_private", null);
        setField(term291260, term291260.getClass(), "owner", null);
        setField(term291260, term291260.getClass(), "htmlUrl", null);
        setField(term291260, term291260.getClass(), "description", null);
        setField(term291260, term291260.getClass(), "fork", null);
        setField(term291260, term291260.getClass(), "url", null);
        setField(term291260, term291260.getClass(), "forksUrl", null);
        setField(term291260, term291260.getClass(), "keysUrl", null);
        setField(term291260, term291260.getClass(), "collaboratorsUrl", null);
        setField(term291260, term291260.getClass(), "teamsUrl", null);
        setField(term291260, term291260.getClass(), "hooksUrl", null);
        setField(term291260, term291260.getClass(), "issueEventsUrl", null);
        setField(term291260, term291260.getClass(), "eventsUrl", null);
        setField(term291260, term291260.getClass(), "assigneesUrl", null);
        setField(term291260, term291260.getClass(), "branchesUrl", null);
        setField(term291260, term291260.getClass(), "tagsUrl", null);
        setField(term291260, term291260.getClass(), "blobsUrl", null);
        setField(term291260, term291260.getClass(), "gitTagsUrl", null);
        setField(term291260, term291260.getClass(), "gitRefsUrl", null);
        setField(term291260, term291260.getClass(), "treesUrl", null);
        setField(term291260, term291260.getClass(), "statusesUrl", null);
        setField(term291260, term291260.getClass(), "languagesUrl", null);
        setField(term291260, term291260.getClass(), "stargazersUrl", null);
        setField(term291260, term291260.getClass(), "contributorsUrl", null);
        setField(term291260, term291260.getClass(), "subscribersUrl", null);
        setField(term291260, term291260.getClass(), "subscriptionUrl", null);
        setField(term291260, term291260.getClass(), "commitsUrl", null);
        setField(term291260, term291260.getClass(), "gitCommitsUrl", null);
        setField(term291260, term291260.getClass(), "commentsUrl", null);
        setField(term291260, term291260.getClass(), "issueCommentUrl", null);
        setField(term291260, term291260.getClass(), "contentsUrl", null);
        setField(term291260, term291260.getClass(), "compareUrl", null);
        setField(term291260, term291260.getClass(), "mergesUrl", null);
        setField(term291260, term291260.getClass(), "archiveUrl", null);
        setField(term291260, term291260.getClass(), "downloadsUrl", null);
        setField(term291260, term291260.getClass(), "issuesUrl", null);
        setField(term291260, term291260.getClass(), "pullsUrl", null);
        setField(term291260, term291260.getClass(), "milestonesUrl", null);
        setField(term291260, term291260.getClass(), "notificationsUrl", null);
        setField(term291260, term291260.getClass(), "labelsUrl", null);
        setField(term291260, term291260.getClass(), "releasesUrl", null);
        setField(term291260, term291260.getClass(), "deploymentsUrl", null);
        setField(term291260, term291260.getClass(), "createdAt", null);
        setField(term291260, term291260.getClass(), "updatedAt", null);
        setField(term291260, term291260.getClass(), "pushedAt", null);
        setField(term291260, term291260.getClass(), "gitUrl", null);
        setField(term291260, term291260.getClass(), "sshUrl", null);
        setField(term291260, term291260.getClass(), "cloneUrl", null);
        setField(term291260, term291260.getClass(), "svnUrl", null);
        setField(term291260, term291260.getClass(), "homepage", null);
        setField(term291260, term291260.getClass(), "size", null);
        setField(term291260, term291260.getClass(), "stargazersCount", null);
        setField(term291260, term291260.getClass(), "watchersCount", null);
        setField(term291260, term291260.getClass(), "language", null);
        setField(term291260, term291260.getClass(), "hasIssues", null);
        setField(term291260, term291260.getClass(), "hasProjects", null);
        setField(term291260, term291260.getClass(), "hasDownloads", null);
        setField(term291260, term291260.getClass(), "hasWiki", null);
        setField(term291260, term291260.getClass(), "hasPages", null);
        setField(term291260, term291260.getClass(), "forksCount", null);
        setField(term291260, term291260.getClass(), "archived", null);
        setField(term291260, term291260.getClass(), "disabled", null);
        setField(term291260, term291260.getClass(), "openIssuesCount", null);
        setField(term291260, term291260.getClass(), "license", null);
        setField(term291260, term291260.getClass(), "allowForking", null);
        setField(term291260, term291260.getClass(), "isTemplate", null);
        setField(term291260, term291260.getClass(), "topics", null);
        setField(term291260, term291260.getClass(), "visibility", null);
        setField(term291260, term291260.getClass(), "forks", null);
        setField(term291260, term291260.getClass(), "openIssues", null);
        setField(term291260, term291260.getClass(), "watchers", null);
        setField(term291260, term291260.getClass(), "defaultBranch", null);
        setField(term291260, term291260.getClass(), "networkCount", null);
        setField(term291260, term291260.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIssuesUrl", argTypes, term291260, args);
    }

};


