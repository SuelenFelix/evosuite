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

public class GithubRepoResponse_setReleasesUrl_364529437247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291270;

    public GithubRepoResponse_setReleasesUrl_364529437247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291270 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291270, term291270.getClass(), "id", null);
        setField(term291270, term291270.getClass(), "nodeId", null);
        setField(term291270, term291270.getClass(), "name", null);
        setField(term291270, term291270.getClass(), "fullName", null);
        setField(term291270, term291270.getClass(), "_private", null);
        setField(term291270, term291270.getClass(), "owner", null);
        setField(term291270, term291270.getClass(), "htmlUrl", null);
        setField(term291270, term291270.getClass(), "description", null);
        setField(term291270, term291270.getClass(), "fork", null);
        setField(term291270, term291270.getClass(), "url", null);
        setField(term291270, term291270.getClass(), "forksUrl", null);
        setField(term291270, term291270.getClass(), "keysUrl", null);
        setField(term291270, term291270.getClass(), "collaboratorsUrl", null);
        setField(term291270, term291270.getClass(), "teamsUrl", null);
        setField(term291270, term291270.getClass(), "hooksUrl", null);
        setField(term291270, term291270.getClass(), "issueEventsUrl", null);
        setField(term291270, term291270.getClass(), "eventsUrl", null);
        setField(term291270, term291270.getClass(), "assigneesUrl", null);
        setField(term291270, term291270.getClass(), "branchesUrl", null);
        setField(term291270, term291270.getClass(), "tagsUrl", null);
        setField(term291270, term291270.getClass(), "blobsUrl", null);
        setField(term291270, term291270.getClass(), "gitTagsUrl", null);
        setField(term291270, term291270.getClass(), "gitRefsUrl", null);
        setField(term291270, term291270.getClass(), "treesUrl", null);
        setField(term291270, term291270.getClass(), "statusesUrl", null);
        setField(term291270, term291270.getClass(), "languagesUrl", null);
        setField(term291270, term291270.getClass(), "stargazersUrl", null);
        setField(term291270, term291270.getClass(), "contributorsUrl", null);
        setField(term291270, term291270.getClass(), "subscribersUrl", null);
        setField(term291270, term291270.getClass(), "subscriptionUrl", null);
        setField(term291270, term291270.getClass(), "commitsUrl", null);
        setField(term291270, term291270.getClass(), "gitCommitsUrl", null);
        setField(term291270, term291270.getClass(), "commentsUrl", null);
        setField(term291270, term291270.getClass(), "issueCommentUrl", null);
        setField(term291270, term291270.getClass(), "contentsUrl", null);
        setField(term291270, term291270.getClass(), "compareUrl", null);
        setField(term291270, term291270.getClass(), "mergesUrl", null);
        setField(term291270, term291270.getClass(), "archiveUrl", null);
        setField(term291270, term291270.getClass(), "downloadsUrl", null);
        setField(term291270, term291270.getClass(), "issuesUrl", null);
        setField(term291270, term291270.getClass(), "pullsUrl", null);
        setField(term291270, term291270.getClass(), "milestonesUrl", null);
        setField(term291270, term291270.getClass(), "notificationsUrl", null);
        setField(term291270, term291270.getClass(), "labelsUrl", null);
        setField(term291270, term291270.getClass(), "releasesUrl", null);
        setField(term291270, term291270.getClass(), "deploymentsUrl", null);
        setField(term291270, term291270.getClass(), "createdAt", null);
        setField(term291270, term291270.getClass(), "updatedAt", null);
        setField(term291270, term291270.getClass(), "pushedAt", null);
        setField(term291270, term291270.getClass(), "gitUrl", null);
        setField(term291270, term291270.getClass(), "sshUrl", null);
        setField(term291270, term291270.getClass(), "cloneUrl", null);
        setField(term291270, term291270.getClass(), "svnUrl", null);
        setField(term291270, term291270.getClass(), "homepage", null);
        setField(term291270, term291270.getClass(), "size", null);
        setField(term291270, term291270.getClass(), "stargazersCount", null);
        setField(term291270, term291270.getClass(), "watchersCount", null);
        setField(term291270, term291270.getClass(), "language", null);
        setField(term291270, term291270.getClass(), "hasIssues", null);
        setField(term291270, term291270.getClass(), "hasProjects", null);
        setField(term291270, term291270.getClass(), "hasDownloads", null);
        setField(term291270, term291270.getClass(), "hasWiki", null);
        setField(term291270, term291270.getClass(), "hasPages", null);
        setField(term291270, term291270.getClass(), "forksCount", null);
        setField(term291270, term291270.getClass(), "archived", null);
        setField(term291270, term291270.getClass(), "disabled", null);
        setField(term291270, term291270.getClass(), "openIssuesCount", null);
        setField(term291270, term291270.getClass(), "license", null);
        setField(term291270, term291270.getClass(), "allowForking", null);
        setField(term291270, term291270.getClass(), "isTemplate", null);
        setField(term291270, term291270.getClass(), "topics", null);
        setField(term291270, term291270.getClass(), "visibility", null);
        setField(term291270, term291270.getClass(), "forks", null);
        setField(term291270, term291270.getClass(), "openIssues", null);
        setField(term291270, term291270.getClass(), "watchers", null);
        setField(term291270, term291270.getClass(), "defaultBranch", null);
        setField(term291270, term291270.getClass(), "networkCount", null);
        setField(term291270, term291270.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setReleasesUrl", argTypes, term291270, args);
    }

};


