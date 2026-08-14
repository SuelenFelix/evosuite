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

public class GithubRepoResponse_getUpdatedAt_1613508114252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291275;

    public GithubRepoResponse_getUpdatedAt_1613508114252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291275 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291275, term291275.getClass(), "id", null);
        setField(term291275, term291275.getClass(), "nodeId", null);
        setField(term291275, term291275.getClass(), "name", null);
        setField(term291275, term291275.getClass(), "fullName", null);
        setField(term291275, term291275.getClass(), "_private", null);
        setField(term291275, term291275.getClass(), "owner", null);
        setField(term291275, term291275.getClass(), "htmlUrl", null);
        setField(term291275, term291275.getClass(), "description", null);
        setField(term291275, term291275.getClass(), "fork", null);
        setField(term291275, term291275.getClass(), "url", null);
        setField(term291275, term291275.getClass(), "forksUrl", null);
        setField(term291275, term291275.getClass(), "keysUrl", null);
        setField(term291275, term291275.getClass(), "collaboratorsUrl", null);
        setField(term291275, term291275.getClass(), "teamsUrl", null);
        setField(term291275, term291275.getClass(), "hooksUrl", null);
        setField(term291275, term291275.getClass(), "issueEventsUrl", null);
        setField(term291275, term291275.getClass(), "eventsUrl", null);
        setField(term291275, term291275.getClass(), "assigneesUrl", null);
        setField(term291275, term291275.getClass(), "branchesUrl", null);
        setField(term291275, term291275.getClass(), "tagsUrl", null);
        setField(term291275, term291275.getClass(), "blobsUrl", null);
        setField(term291275, term291275.getClass(), "gitTagsUrl", null);
        setField(term291275, term291275.getClass(), "gitRefsUrl", null);
        setField(term291275, term291275.getClass(), "treesUrl", null);
        setField(term291275, term291275.getClass(), "statusesUrl", null);
        setField(term291275, term291275.getClass(), "languagesUrl", null);
        setField(term291275, term291275.getClass(), "stargazersUrl", null);
        setField(term291275, term291275.getClass(), "contributorsUrl", null);
        setField(term291275, term291275.getClass(), "subscribersUrl", null);
        setField(term291275, term291275.getClass(), "subscriptionUrl", null);
        setField(term291275, term291275.getClass(), "commitsUrl", null);
        setField(term291275, term291275.getClass(), "gitCommitsUrl", null);
        setField(term291275, term291275.getClass(), "commentsUrl", null);
        setField(term291275, term291275.getClass(), "issueCommentUrl", null);
        setField(term291275, term291275.getClass(), "contentsUrl", null);
        setField(term291275, term291275.getClass(), "compareUrl", null);
        setField(term291275, term291275.getClass(), "mergesUrl", null);
        setField(term291275, term291275.getClass(), "archiveUrl", null);
        setField(term291275, term291275.getClass(), "downloadsUrl", null);
        setField(term291275, term291275.getClass(), "issuesUrl", null);
        setField(term291275, term291275.getClass(), "pullsUrl", null);
        setField(term291275, term291275.getClass(), "milestonesUrl", null);
        setField(term291275, term291275.getClass(), "notificationsUrl", null);
        setField(term291275, term291275.getClass(), "labelsUrl", null);
        setField(term291275, term291275.getClass(), "releasesUrl", null);
        setField(term291275, term291275.getClass(), "deploymentsUrl", null);
        setField(term291275, term291275.getClass(), "createdAt", null);
        setField(term291275, term291275.getClass(), "updatedAt", null);
        setField(term291275, term291275.getClass(), "pushedAt", null);
        setField(term291275, term291275.getClass(), "gitUrl", null);
        setField(term291275, term291275.getClass(), "sshUrl", null);
        setField(term291275, term291275.getClass(), "cloneUrl", null);
        setField(term291275, term291275.getClass(), "svnUrl", null);
        setField(term291275, term291275.getClass(), "homepage", null);
        setField(term291275, term291275.getClass(), "size", null);
        setField(term291275, term291275.getClass(), "stargazersCount", null);
        setField(term291275, term291275.getClass(), "watchersCount", null);
        setField(term291275, term291275.getClass(), "language", null);
        setField(term291275, term291275.getClass(), "hasIssues", null);
        setField(term291275, term291275.getClass(), "hasProjects", null);
        setField(term291275, term291275.getClass(), "hasDownloads", null);
        setField(term291275, term291275.getClass(), "hasWiki", null);
        setField(term291275, term291275.getClass(), "hasPages", null);
        setField(term291275, term291275.getClass(), "forksCount", null);
        setField(term291275, term291275.getClass(), "archived", null);
        setField(term291275, term291275.getClass(), "disabled", null);
        setField(term291275, term291275.getClass(), "openIssuesCount", null);
        setField(term291275, term291275.getClass(), "license", null);
        setField(term291275, term291275.getClass(), "allowForking", null);
        setField(term291275, term291275.getClass(), "isTemplate", null);
        setField(term291275, term291275.getClass(), "topics", null);
        setField(term291275, term291275.getClass(), "visibility", null);
        setField(term291275, term291275.getClass(), "forks", null);
        setField(term291275, term291275.getClass(), "openIssues", null);
        setField(term291275, term291275.getClass(), "watchers", null);
        setField(term291275, term291275.getClass(), "defaultBranch", null);
        setField(term291275, term291275.getClass(), "networkCount", null);
        setField(term291275, term291275.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term291275, args);
    }

};


