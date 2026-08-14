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

public class GithubRepoResponse_getHasDownloads_1979042080278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291301;

    public GithubRepoResponse_getHasDownloads_1979042080278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291301 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291301, term291301.getClass(), "id", null);
        setField(term291301, term291301.getClass(), "nodeId", null);
        setField(term291301, term291301.getClass(), "name", null);
        setField(term291301, term291301.getClass(), "fullName", null);
        setField(term291301, term291301.getClass(), "_private", null);
        setField(term291301, term291301.getClass(), "owner", null);
        setField(term291301, term291301.getClass(), "htmlUrl", null);
        setField(term291301, term291301.getClass(), "description", null);
        setField(term291301, term291301.getClass(), "fork", null);
        setField(term291301, term291301.getClass(), "url", null);
        setField(term291301, term291301.getClass(), "forksUrl", null);
        setField(term291301, term291301.getClass(), "keysUrl", null);
        setField(term291301, term291301.getClass(), "collaboratorsUrl", null);
        setField(term291301, term291301.getClass(), "teamsUrl", null);
        setField(term291301, term291301.getClass(), "hooksUrl", null);
        setField(term291301, term291301.getClass(), "issueEventsUrl", null);
        setField(term291301, term291301.getClass(), "eventsUrl", null);
        setField(term291301, term291301.getClass(), "assigneesUrl", null);
        setField(term291301, term291301.getClass(), "branchesUrl", null);
        setField(term291301, term291301.getClass(), "tagsUrl", null);
        setField(term291301, term291301.getClass(), "blobsUrl", null);
        setField(term291301, term291301.getClass(), "gitTagsUrl", null);
        setField(term291301, term291301.getClass(), "gitRefsUrl", null);
        setField(term291301, term291301.getClass(), "treesUrl", null);
        setField(term291301, term291301.getClass(), "statusesUrl", null);
        setField(term291301, term291301.getClass(), "languagesUrl", null);
        setField(term291301, term291301.getClass(), "stargazersUrl", null);
        setField(term291301, term291301.getClass(), "contributorsUrl", null);
        setField(term291301, term291301.getClass(), "subscribersUrl", null);
        setField(term291301, term291301.getClass(), "subscriptionUrl", null);
        setField(term291301, term291301.getClass(), "commitsUrl", null);
        setField(term291301, term291301.getClass(), "gitCommitsUrl", null);
        setField(term291301, term291301.getClass(), "commentsUrl", null);
        setField(term291301, term291301.getClass(), "issueCommentUrl", null);
        setField(term291301, term291301.getClass(), "contentsUrl", null);
        setField(term291301, term291301.getClass(), "compareUrl", null);
        setField(term291301, term291301.getClass(), "mergesUrl", null);
        setField(term291301, term291301.getClass(), "archiveUrl", null);
        setField(term291301, term291301.getClass(), "downloadsUrl", null);
        setField(term291301, term291301.getClass(), "issuesUrl", null);
        setField(term291301, term291301.getClass(), "pullsUrl", null);
        setField(term291301, term291301.getClass(), "milestonesUrl", null);
        setField(term291301, term291301.getClass(), "notificationsUrl", null);
        setField(term291301, term291301.getClass(), "labelsUrl", null);
        setField(term291301, term291301.getClass(), "releasesUrl", null);
        setField(term291301, term291301.getClass(), "deploymentsUrl", null);
        setField(term291301, term291301.getClass(), "createdAt", null);
        setField(term291301, term291301.getClass(), "updatedAt", null);
        setField(term291301, term291301.getClass(), "pushedAt", null);
        setField(term291301, term291301.getClass(), "gitUrl", null);
        setField(term291301, term291301.getClass(), "sshUrl", null);
        setField(term291301, term291301.getClass(), "cloneUrl", null);
        setField(term291301, term291301.getClass(), "svnUrl", null);
        setField(term291301, term291301.getClass(), "homepage", null);
        setField(term291301, term291301.getClass(), "size", null);
        setField(term291301, term291301.getClass(), "stargazersCount", null);
        setField(term291301, term291301.getClass(), "watchersCount", null);
        setField(term291301, term291301.getClass(), "language", null);
        setField(term291301, term291301.getClass(), "hasIssues", null);
        setField(term291301, term291301.getClass(), "hasProjects", null);
        setField(term291301, term291301.getClass(), "hasDownloads", null);
        setField(term291301, term291301.getClass(), "hasWiki", null);
        setField(term291301, term291301.getClass(), "hasPages", null);
        setField(term291301, term291301.getClass(), "forksCount", null);
        setField(term291301, term291301.getClass(), "archived", null);
        setField(term291301, term291301.getClass(), "disabled", null);
        setField(term291301, term291301.getClass(), "openIssuesCount", null);
        setField(term291301, term291301.getClass(), "license", null);
        setField(term291301, term291301.getClass(), "allowForking", null);
        setField(term291301, term291301.getClass(), "isTemplate", null);
        setField(term291301, term291301.getClass(), "topics", null);
        setField(term291301, term291301.getClass(), "visibility", null);
        setField(term291301, term291301.getClass(), "forks", null);
        setField(term291301, term291301.getClass(), "openIssues", null);
        setField(term291301, term291301.getClass(), "watchers", null);
        setField(term291301, term291301.getClass(), "defaultBranch", null);
        setField(term291301, term291301.getClass(), "networkCount", null);
        setField(term291301, term291301.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasDownloads", argTypes, term291301, args);
    }

};


