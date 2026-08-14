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

public class GithubRepoResponse_getSshUrl_1571152889259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291282;

    public GithubRepoResponse_getSshUrl_1571152889259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291282 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291282, term291282.getClass(), "id", null);
        setField(term291282, term291282.getClass(), "nodeId", null);
        setField(term291282, term291282.getClass(), "name", null);
        setField(term291282, term291282.getClass(), "fullName", null);
        setField(term291282, term291282.getClass(), "_private", null);
        setField(term291282, term291282.getClass(), "owner", null);
        setField(term291282, term291282.getClass(), "htmlUrl", null);
        setField(term291282, term291282.getClass(), "description", null);
        setField(term291282, term291282.getClass(), "fork", null);
        setField(term291282, term291282.getClass(), "url", null);
        setField(term291282, term291282.getClass(), "forksUrl", null);
        setField(term291282, term291282.getClass(), "keysUrl", null);
        setField(term291282, term291282.getClass(), "collaboratorsUrl", null);
        setField(term291282, term291282.getClass(), "teamsUrl", null);
        setField(term291282, term291282.getClass(), "hooksUrl", null);
        setField(term291282, term291282.getClass(), "issueEventsUrl", null);
        setField(term291282, term291282.getClass(), "eventsUrl", null);
        setField(term291282, term291282.getClass(), "assigneesUrl", null);
        setField(term291282, term291282.getClass(), "branchesUrl", null);
        setField(term291282, term291282.getClass(), "tagsUrl", null);
        setField(term291282, term291282.getClass(), "blobsUrl", null);
        setField(term291282, term291282.getClass(), "gitTagsUrl", null);
        setField(term291282, term291282.getClass(), "gitRefsUrl", null);
        setField(term291282, term291282.getClass(), "treesUrl", null);
        setField(term291282, term291282.getClass(), "statusesUrl", null);
        setField(term291282, term291282.getClass(), "languagesUrl", null);
        setField(term291282, term291282.getClass(), "stargazersUrl", null);
        setField(term291282, term291282.getClass(), "contributorsUrl", null);
        setField(term291282, term291282.getClass(), "subscribersUrl", null);
        setField(term291282, term291282.getClass(), "subscriptionUrl", null);
        setField(term291282, term291282.getClass(), "commitsUrl", null);
        setField(term291282, term291282.getClass(), "gitCommitsUrl", null);
        setField(term291282, term291282.getClass(), "commentsUrl", null);
        setField(term291282, term291282.getClass(), "issueCommentUrl", null);
        setField(term291282, term291282.getClass(), "contentsUrl", null);
        setField(term291282, term291282.getClass(), "compareUrl", null);
        setField(term291282, term291282.getClass(), "mergesUrl", null);
        setField(term291282, term291282.getClass(), "archiveUrl", null);
        setField(term291282, term291282.getClass(), "downloadsUrl", null);
        setField(term291282, term291282.getClass(), "issuesUrl", null);
        setField(term291282, term291282.getClass(), "pullsUrl", null);
        setField(term291282, term291282.getClass(), "milestonesUrl", null);
        setField(term291282, term291282.getClass(), "notificationsUrl", null);
        setField(term291282, term291282.getClass(), "labelsUrl", null);
        setField(term291282, term291282.getClass(), "releasesUrl", null);
        setField(term291282, term291282.getClass(), "deploymentsUrl", null);
        setField(term291282, term291282.getClass(), "createdAt", null);
        setField(term291282, term291282.getClass(), "updatedAt", null);
        setField(term291282, term291282.getClass(), "pushedAt", null);
        setField(term291282, term291282.getClass(), "gitUrl", null);
        setField(term291282, term291282.getClass(), "sshUrl", null);
        setField(term291282, term291282.getClass(), "cloneUrl", null);
        setField(term291282, term291282.getClass(), "svnUrl", null);
        setField(term291282, term291282.getClass(), "homepage", null);
        setField(term291282, term291282.getClass(), "size", null);
        setField(term291282, term291282.getClass(), "stargazersCount", null);
        setField(term291282, term291282.getClass(), "watchersCount", null);
        setField(term291282, term291282.getClass(), "language", null);
        setField(term291282, term291282.getClass(), "hasIssues", null);
        setField(term291282, term291282.getClass(), "hasProjects", null);
        setField(term291282, term291282.getClass(), "hasDownloads", null);
        setField(term291282, term291282.getClass(), "hasWiki", null);
        setField(term291282, term291282.getClass(), "hasPages", null);
        setField(term291282, term291282.getClass(), "forksCount", null);
        setField(term291282, term291282.getClass(), "archived", null);
        setField(term291282, term291282.getClass(), "disabled", null);
        setField(term291282, term291282.getClass(), "openIssuesCount", null);
        setField(term291282, term291282.getClass(), "license", null);
        setField(term291282, term291282.getClass(), "allowForking", null);
        setField(term291282, term291282.getClass(), "isTemplate", null);
        setField(term291282, term291282.getClass(), "topics", null);
        setField(term291282, term291282.getClass(), "visibility", null);
        setField(term291282, term291282.getClass(), "forks", null);
        setField(term291282, term291282.getClass(), "openIssues", null);
        setField(term291282, term291282.getClass(), "watchers", null);
        setField(term291282, term291282.getClass(), "defaultBranch", null);
        setField(term291282, term291282.getClass(), "networkCount", null);
        setField(term291282, term291282.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSshUrl", argTypes, term291282, args);
    }

};


