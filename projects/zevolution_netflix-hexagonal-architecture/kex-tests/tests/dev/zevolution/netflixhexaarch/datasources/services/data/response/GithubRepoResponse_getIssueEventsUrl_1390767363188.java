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

public class GithubRepoResponse_getIssueEventsUrl_1390767363188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291211;

    public GithubRepoResponse_getIssueEventsUrl_1390767363188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291211 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291211, term291211.getClass(), "id", null);
        setField(term291211, term291211.getClass(), "nodeId", null);
        setField(term291211, term291211.getClass(), "name", null);
        setField(term291211, term291211.getClass(), "fullName", null);
        setField(term291211, term291211.getClass(), "_private", null);
        setField(term291211, term291211.getClass(), "owner", null);
        setField(term291211, term291211.getClass(), "htmlUrl", null);
        setField(term291211, term291211.getClass(), "description", null);
        setField(term291211, term291211.getClass(), "fork", null);
        setField(term291211, term291211.getClass(), "url", null);
        setField(term291211, term291211.getClass(), "forksUrl", null);
        setField(term291211, term291211.getClass(), "keysUrl", null);
        setField(term291211, term291211.getClass(), "collaboratorsUrl", null);
        setField(term291211, term291211.getClass(), "teamsUrl", null);
        setField(term291211, term291211.getClass(), "hooksUrl", null);
        setField(term291211, term291211.getClass(), "issueEventsUrl", null);
        setField(term291211, term291211.getClass(), "eventsUrl", null);
        setField(term291211, term291211.getClass(), "assigneesUrl", null);
        setField(term291211, term291211.getClass(), "branchesUrl", null);
        setField(term291211, term291211.getClass(), "tagsUrl", null);
        setField(term291211, term291211.getClass(), "blobsUrl", null);
        setField(term291211, term291211.getClass(), "gitTagsUrl", null);
        setField(term291211, term291211.getClass(), "gitRefsUrl", null);
        setField(term291211, term291211.getClass(), "treesUrl", null);
        setField(term291211, term291211.getClass(), "statusesUrl", null);
        setField(term291211, term291211.getClass(), "languagesUrl", null);
        setField(term291211, term291211.getClass(), "stargazersUrl", null);
        setField(term291211, term291211.getClass(), "contributorsUrl", null);
        setField(term291211, term291211.getClass(), "subscribersUrl", null);
        setField(term291211, term291211.getClass(), "subscriptionUrl", null);
        setField(term291211, term291211.getClass(), "commitsUrl", null);
        setField(term291211, term291211.getClass(), "gitCommitsUrl", null);
        setField(term291211, term291211.getClass(), "commentsUrl", null);
        setField(term291211, term291211.getClass(), "issueCommentUrl", null);
        setField(term291211, term291211.getClass(), "contentsUrl", null);
        setField(term291211, term291211.getClass(), "compareUrl", null);
        setField(term291211, term291211.getClass(), "mergesUrl", null);
        setField(term291211, term291211.getClass(), "archiveUrl", null);
        setField(term291211, term291211.getClass(), "downloadsUrl", null);
        setField(term291211, term291211.getClass(), "issuesUrl", null);
        setField(term291211, term291211.getClass(), "pullsUrl", null);
        setField(term291211, term291211.getClass(), "milestonesUrl", null);
        setField(term291211, term291211.getClass(), "notificationsUrl", null);
        setField(term291211, term291211.getClass(), "labelsUrl", null);
        setField(term291211, term291211.getClass(), "releasesUrl", null);
        setField(term291211, term291211.getClass(), "deploymentsUrl", null);
        setField(term291211, term291211.getClass(), "createdAt", null);
        setField(term291211, term291211.getClass(), "updatedAt", null);
        setField(term291211, term291211.getClass(), "pushedAt", null);
        setField(term291211, term291211.getClass(), "gitUrl", null);
        setField(term291211, term291211.getClass(), "sshUrl", null);
        setField(term291211, term291211.getClass(), "cloneUrl", null);
        setField(term291211, term291211.getClass(), "svnUrl", null);
        setField(term291211, term291211.getClass(), "homepage", null);
        setField(term291211, term291211.getClass(), "size", null);
        setField(term291211, term291211.getClass(), "stargazersCount", null);
        setField(term291211, term291211.getClass(), "watchersCount", null);
        setField(term291211, term291211.getClass(), "language", null);
        setField(term291211, term291211.getClass(), "hasIssues", null);
        setField(term291211, term291211.getClass(), "hasProjects", null);
        setField(term291211, term291211.getClass(), "hasDownloads", null);
        setField(term291211, term291211.getClass(), "hasWiki", null);
        setField(term291211, term291211.getClass(), "hasPages", null);
        setField(term291211, term291211.getClass(), "forksCount", null);
        setField(term291211, term291211.getClass(), "archived", null);
        setField(term291211, term291211.getClass(), "disabled", null);
        setField(term291211, term291211.getClass(), "openIssuesCount", null);
        setField(term291211, term291211.getClass(), "license", null);
        setField(term291211, term291211.getClass(), "allowForking", null);
        setField(term291211, term291211.getClass(), "isTemplate", null);
        setField(term291211, term291211.getClass(), "topics", null);
        setField(term291211, term291211.getClass(), "visibility", null);
        setField(term291211, term291211.getClass(), "forks", null);
        setField(term291211, term291211.getClass(), "openIssues", null);
        setField(term291211, term291211.getClass(), "watchers", null);
        setField(term291211, term291211.getClass(), "defaultBranch", null);
        setField(term291211, term291211.getClass(), "networkCount", null);
        setField(term291211, term291211.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIssueEventsUrl", argTypes, term291211, args);
    }

};


