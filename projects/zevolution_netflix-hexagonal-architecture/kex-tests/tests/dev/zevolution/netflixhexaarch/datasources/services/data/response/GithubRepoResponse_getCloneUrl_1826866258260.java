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

public class GithubRepoResponse_getCloneUrl_1826866258260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291283;

    public GithubRepoResponse_getCloneUrl_1826866258260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291283 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291283, term291283.getClass(), "id", null);
        setField(term291283, term291283.getClass(), "nodeId", null);
        setField(term291283, term291283.getClass(), "name", null);
        setField(term291283, term291283.getClass(), "fullName", null);
        setField(term291283, term291283.getClass(), "_private", null);
        setField(term291283, term291283.getClass(), "owner", null);
        setField(term291283, term291283.getClass(), "htmlUrl", null);
        setField(term291283, term291283.getClass(), "description", null);
        setField(term291283, term291283.getClass(), "fork", null);
        setField(term291283, term291283.getClass(), "url", null);
        setField(term291283, term291283.getClass(), "forksUrl", null);
        setField(term291283, term291283.getClass(), "keysUrl", null);
        setField(term291283, term291283.getClass(), "collaboratorsUrl", null);
        setField(term291283, term291283.getClass(), "teamsUrl", null);
        setField(term291283, term291283.getClass(), "hooksUrl", null);
        setField(term291283, term291283.getClass(), "issueEventsUrl", null);
        setField(term291283, term291283.getClass(), "eventsUrl", null);
        setField(term291283, term291283.getClass(), "assigneesUrl", null);
        setField(term291283, term291283.getClass(), "branchesUrl", null);
        setField(term291283, term291283.getClass(), "tagsUrl", null);
        setField(term291283, term291283.getClass(), "blobsUrl", null);
        setField(term291283, term291283.getClass(), "gitTagsUrl", null);
        setField(term291283, term291283.getClass(), "gitRefsUrl", null);
        setField(term291283, term291283.getClass(), "treesUrl", null);
        setField(term291283, term291283.getClass(), "statusesUrl", null);
        setField(term291283, term291283.getClass(), "languagesUrl", null);
        setField(term291283, term291283.getClass(), "stargazersUrl", null);
        setField(term291283, term291283.getClass(), "contributorsUrl", null);
        setField(term291283, term291283.getClass(), "subscribersUrl", null);
        setField(term291283, term291283.getClass(), "subscriptionUrl", null);
        setField(term291283, term291283.getClass(), "commitsUrl", null);
        setField(term291283, term291283.getClass(), "gitCommitsUrl", null);
        setField(term291283, term291283.getClass(), "commentsUrl", null);
        setField(term291283, term291283.getClass(), "issueCommentUrl", null);
        setField(term291283, term291283.getClass(), "contentsUrl", null);
        setField(term291283, term291283.getClass(), "compareUrl", null);
        setField(term291283, term291283.getClass(), "mergesUrl", null);
        setField(term291283, term291283.getClass(), "archiveUrl", null);
        setField(term291283, term291283.getClass(), "downloadsUrl", null);
        setField(term291283, term291283.getClass(), "issuesUrl", null);
        setField(term291283, term291283.getClass(), "pullsUrl", null);
        setField(term291283, term291283.getClass(), "milestonesUrl", null);
        setField(term291283, term291283.getClass(), "notificationsUrl", null);
        setField(term291283, term291283.getClass(), "labelsUrl", null);
        setField(term291283, term291283.getClass(), "releasesUrl", null);
        setField(term291283, term291283.getClass(), "deploymentsUrl", null);
        setField(term291283, term291283.getClass(), "createdAt", null);
        setField(term291283, term291283.getClass(), "updatedAt", null);
        setField(term291283, term291283.getClass(), "pushedAt", null);
        setField(term291283, term291283.getClass(), "gitUrl", null);
        setField(term291283, term291283.getClass(), "sshUrl", null);
        setField(term291283, term291283.getClass(), "cloneUrl", null);
        setField(term291283, term291283.getClass(), "svnUrl", null);
        setField(term291283, term291283.getClass(), "homepage", null);
        setField(term291283, term291283.getClass(), "size", null);
        setField(term291283, term291283.getClass(), "stargazersCount", null);
        setField(term291283, term291283.getClass(), "watchersCount", null);
        setField(term291283, term291283.getClass(), "language", null);
        setField(term291283, term291283.getClass(), "hasIssues", null);
        setField(term291283, term291283.getClass(), "hasProjects", null);
        setField(term291283, term291283.getClass(), "hasDownloads", null);
        setField(term291283, term291283.getClass(), "hasWiki", null);
        setField(term291283, term291283.getClass(), "hasPages", null);
        setField(term291283, term291283.getClass(), "forksCount", null);
        setField(term291283, term291283.getClass(), "archived", null);
        setField(term291283, term291283.getClass(), "disabled", null);
        setField(term291283, term291283.getClass(), "openIssuesCount", null);
        setField(term291283, term291283.getClass(), "license", null);
        setField(term291283, term291283.getClass(), "allowForking", null);
        setField(term291283, term291283.getClass(), "isTemplate", null);
        setField(term291283, term291283.getClass(), "topics", null);
        setField(term291283, term291283.getClass(), "visibility", null);
        setField(term291283, term291283.getClass(), "forks", null);
        setField(term291283, term291283.getClass(), "openIssues", null);
        setField(term291283, term291283.getClass(), "watchers", null);
        setField(term291283, term291283.getClass(), "defaultBranch", null);
        setField(term291283, term291283.getClass(), "networkCount", null);
        setField(term291283, term291283.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCloneUrl", argTypes, term291283, args);
    }

};


