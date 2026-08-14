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

public class GithubRepoResponse_getContributorsUrl_551878933212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291235;

    public GithubRepoResponse_getContributorsUrl_551878933212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291235 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291235, term291235.getClass(), "id", null);
        setField(term291235, term291235.getClass(), "nodeId", null);
        setField(term291235, term291235.getClass(), "name", null);
        setField(term291235, term291235.getClass(), "fullName", null);
        setField(term291235, term291235.getClass(), "_private", null);
        setField(term291235, term291235.getClass(), "owner", null);
        setField(term291235, term291235.getClass(), "htmlUrl", null);
        setField(term291235, term291235.getClass(), "description", null);
        setField(term291235, term291235.getClass(), "fork", null);
        setField(term291235, term291235.getClass(), "url", null);
        setField(term291235, term291235.getClass(), "forksUrl", null);
        setField(term291235, term291235.getClass(), "keysUrl", null);
        setField(term291235, term291235.getClass(), "collaboratorsUrl", null);
        setField(term291235, term291235.getClass(), "teamsUrl", null);
        setField(term291235, term291235.getClass(), "hooksUrl", null);
        setField(term291235, term291235.getClass(), "issueEventsUrl", null);
        setField(term291235, term291235.getClass(), "eventsUrl", null);
        setField(term291235, term291235.getClass(), "assigneesUrl", null);
        setField(term291235, term291235.getClass(), "branchesUrl", null);
        setField(term291235, term291235.getClass(), "tagsUrl", null);
        setField(term291235, term291235.getClass(), "blobsUrl", null);
        setField(term291235, term291235.getClass(), "gitTagsUrl", null);
        setField(term291235, term291235.getClass(), "gitRefsUrl", null);
        setField(term291235, term291235.getClass(), "treesUrl", null);
        setField(term291235, term291235.getClass(), "statusesUrl", null);
        setField(term291235, term291235.getClass(), "languagesUrl", null);
        setField(term291235, term291235.getClass(), "stargazersUrl", null);
        setField(term291235, term291235.getClass(), "contributorsUrl", null);
        setField(term291235, term291235.getClass(), "subscribersUrl", null);
        setField(term291235, term291235.getClass(), "subscriptionUrl", null);
        setField(term291235, term291235.getClass(), "commitsUrl", null);
        setField(term291235, term291235.getClass(), "gitCommitsUrl", null);
        setField(term291235, term291235.getClass(), "commentsUrl", null);
        setField(term291235, term291235.getClass(), "issueCommentUrl", null);
        setField(term291235, term291235.getClass(), "contentsUrl", null);
        setField(term291235, term291235.getClass(), "compareUrl", null);
        setField(term291235, term291235.getClass(), "mergesUrl", null);
        setField(term291235, term291235.getClass(), "archiveUrl", null);
        setField(term291235, term291235.getClass(), "downloadsUrl", null);
        setField(term291235, term291235.getClass(), "issuesUrl", null);
        setField(term291235, term291235.getClass(), "pullsUrl", null);
        setField(term291235, term291235.getClass(), "milestonesUrl", null);
        setField(term291235, term291235.getClass(), "notificationsUrl", null);
        setField(term291235, term291235.getClass(), "labelsUrl", null);
        setField(term291235, term291235.getClass(), "releasesUrl", null);
        setField(term291235, term291235.getClass(), "deploymentsUrl", null);
        setField(term291235, term291235.getClass(), "createdAt", null);
        setField(term291235, term291235.getClass(), "updatedAt", null);
        setField(term291235, term291235.getClass(), "pushedAt", null);
        setField(term291235, term291235.getClass(), "gitUrl", null);
        setField(term291235, term291235.getClass(), "sshUrl", null);
        setField(term291235, term291235.getClass(), "cloneUrl", null);
        setField(term291235, term291235.getClass(), "svnUrl", null);
        setField(term291235, term291235.getClass(), "homepage", null);
        setField(term291235, term291235.getClass(), "size", null);
        setField(term291235, term291235.getClass(), "stargazersCount", null);
        setField(term291235, term291235.getClass(), "watchersCount", null);
        setField(term291235, term291235.getClass(), "language", null);
        setField(term291235, term291235.getClass(), "hasIssues", null);
        setField(term291235, term291235.getClass(), "hasProjects", null);
        setField(term291235, term291235.getClass(), "hasDownloads", null);
        setField(term291235, term291235.getClass(), "hasWiki", null);
        setField(term291235, term291235.getClass(), "hasPages", null);
        setField(term291235, term291235.getClass(), "forksCount", null);
        setField(term291235, term291235.getClass(), "archived", null);
        setField(term291235, term291235.getClass(), "disabled", null);
        setField(term291235, term291235.getClass(), "openIssuesCount", null);
        setField(term291235, term291235.getClass(), "license", null);
        setField(term291235, term291235.getClass(), "allowForking", null);
        setField(term291235, term291235.getClass(), "isTemplate", null);
        setField(term291235, term291235.getClass(), "topics", null);
        setField(term291235, term291235.getClass(), "visibility", null);
        setField(term291235, term291235.getClass(), "forks", null);
        setField(term291235, term291235.getClass(), "openIssues", null);
        setField(term291235, term291235.getClass(), "watchers", null);
        setField(term291235, term291235.getClass(), "defaultBranch", null);
        setField(term291235, term291235.getClass(), "networkCount", null);
        setField(term291235, term291235.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContributorsUrl", argTypes, term291235, args);
    }

};


