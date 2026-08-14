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

public class GithubRepoResponse_getStargazersUrl_575262453211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291234;

    public GithubRepoResponse_getStargazersUrl_575262453211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291234 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291234, term291234.getClass(), "id", null);
        setField(term291234, term291234.getClass(), "nodeId", null);
        setField(term291234, term291234.getClass(), "name", null);
        setField(term291234, term291234.getClass(), "fullName", null);
        setField(term291234, term291234.getClass(), "_private", null);
        setField(term291234, term291234.getClass(), "owner", null);
        setField(term291234, term291234.getClass(), "htmlUrl", null);
        setField(term291234, term291234.getClass(), "description", null);
        setField(term291234, term291234.getClass(), "fork", null);
        setField(term291234, term291234.getClass(), "url", null);
        setField(term291234, term291234.getClass(), "forksUrl", null);
        setField(term291234, term291234.getClass(), "keysUrl", null);
        setField(term291234, term291234.getClass(), "collaboratorsUrl", null);
        setField(term291234, term291234.getClass(), "teamsUrl", null);
        setField(term291234, term291234.getClass(), "hooksUrl", null);
        setField(term291234, term291234.getClass(), "issueEventsUrl", null);
        setField(term291234, term291234.getClass(), "eventsUrl", null);
        setField(term291234, term291234.getClass(), "assigneesUrl", null);
        setField(term291234, term291234.getClass(), "branchesUrl", null);
        setField(term291234, term291234.getClass(), "tagsUrl", null);
        setField(term291234, term291234.getClass(), "blobsUrl", null);
        setField(term291234, term291234.getClass(), "gitTagsUrl", null);
        setField(term291234, term291234.getClass(), "gitRefsUrl", null);
        setField(term291234, term291234.getClass(), "treesUrl", null);
        setField(term291234, term291234.getClass(), "statusesUrl", null);
        setField(term291234, term291234.getClass(), "languagesUrl", null);
        setField(term291234, term291234.getClass(), "stargazersUrl", null);
        setField(term291234, term291234.getClass(), "contributorsUrl", null);
        setField(term291234, term291234.getClass(), "subscribersUrl", null);
        setField(term291234, term291234.getClass(), "subscriptionUrl", null);
        setField(term291234, term291234.getClass(), "commitsUrl", null);
        setField(term291234, term291234.getClass(), "gitCommitsUrl", null);
        setField(term291234, term291234.getClass(), "commentsUrl", null);
        setField(term291234, term291234.getClass(), "issueCommentUrl", null);
        setField(term291234, term291234.getClass(), "contentsUrl", null);
        setField(term291234, term291234.getClass(), "compareUrl", null);
        setField(term291234, term291234.getClass(), "mergesUrl", null);
        setField(term291234, term291234.getClass(), "archiveUrl", null);
        setField(term291234, term291234.getClass(), "downloadsUrl", null);
        setField(term291234, term291234.getClass(), "issuesUrl", null);
        setField(term291234, term291234.getClass(), "pullsUrl", null);
        setField(term291234, term291234.getClass(), "milestonesUrl", null);
        setField(term291234, term291234.getClass(), "notificationsUrl", null);
        setField(term291234, term291234.getClass(), "labelsUrl", null);
        setField(term291234, term291234.getClass(), "releasesUrl", null);
        setField(term291234, term291234.getClass(), "deploymentsUrl", null);
        setField(term291234, term291234.getClass(), "createdAt", null);
        setField(term291234, term291234.getClass(), "updatedAt", null);
        setField(term291234, term291234.getClass(), "pushedAt", null);
        setField(term291234, term291234.getClass(), "gitUrl", null);
        setField(term291234, term291234.getClass(), "sshUrl", null);
        setField(term291234, term291234.getClass(), "cloneUrl", null);
        setField(term291234, term291234.getClass(), "svnUrl", null);
        setField(term291234, term291234.getClass(), "homepage", null);
        setField(term291234, term291234.getClass(), "size", null);
        setField(term291234, term291234.getClass(), "stargazersCount", null);
        setField(term291234, term291234.getClass(), "watchersCount", null);
        setField(term291234, term291234.getClass(), "language", null);
        setField(term291234, term291234.getClass(), "hasIssues", null);
        setField(term291234, term291234.getClass(), "hasProjects", null);
        setField(term291234, term291234.getClass(), "hasDownloads", null);
        setField(term291234, term291234.getClass(), "hasWiki", null);
        setField(term291234, term291234.getClass(), "hasPages", null);
        setField(term291234, term291234.getClass(), "forksCount", null);
        setField(term291234, term291234.getClass(), "archived", null);
        setField(term291234, term291234.getClass(), "disabled", null);
        setField(term291234, term291234.getClass(), "openIssuesCount", null);
        setField(term291234, term291234.getClass(), "license", null);
        setField(term291234, term291234.getClass(), "allowForking", null);
        setField(term291234, term291234.getClass(), "isTemplate", null);
        setField(term291234, term291234.getClass(), "topics", null);
        setField(term291234, term291234.getClass(), "visibility", null);
        setField(term291234, term291234.getClass(), "forks", null);
        setField(term291234, term291234.getClass(), "openIssues", null);
        setField(term291234, term291234.getClass(), "watchers", null);
        setField(term291234, term291234.getClass(), "defaultBranch", null);
        setField(term291234, term291234.getClass(), "networkCount", null);
        setField(term291234, term291234.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStargazersUrl", argTypes, term291234, args);
    }

};


