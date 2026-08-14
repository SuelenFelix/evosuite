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

public class GithubRepoResponse_getHasWiki_552274195280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291303;

    public GithubRepoResponse_getHasWiki_552274195280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291303 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291303, term291303.getClass(), "id", null);
        setField(term291303, term291303.getClass(), "nodeId", null);
        setField(term291303, term291303.getClass(), "name", null);
        setField(term291303, term291303.getClass(), "fullName", null);
        setField(term291303, term291303.getClass(), "_private", null);
        setField(term291303, term291303.getClass(), "owner", null);
        setField(term291303, term291303.getClass(), "htmlUrl", null);
        setField(term291303, term291303.getClass(), "description", null);
        setField(term291303, term291303.getClass(), "fork", null);
        setField(term291303, term291303.getClass(), "url", null);
        setField(term291303, term291303.getClass(), "forksUrl", null);
        setField(term291303, term291303.getClass(), "keysUrl", null);
        setField(term291303, term291303.getClass(), "collaboratorsUrl", null);
        setField(term291303, term291303.getClass(), "teamsUrl", null);
        setField(term291303, term291303.getClass(), "hooksUrl", null);
        setField(term291303, term291303.getClass(), "issueEventsUrl", null);
        setField(term291303, term291303.getClass(), "eventsUrl", null);
        setField(term291303, term291303.getClass(), "assigneesUrl", null);
        setField(term291303, term291303.getClass(), "branchesUrl", null);
        setField(term291303, term291303.getClass(), "tagsUrl", null);
        setField(term291303, term291303.getClass(), "blobsUrl", null);
        setField(term291303, term291303.getClass(), "gitTagsUrl", null);
        setField(term291303, term291303.getClass(), "gitRefsUrl", null);
        setField(term291303, term291303.getClass(), "treesUrl", null);
        setField(term291303, term291303.getClass(), "statusesUrl", null);
        setField(term291303, term291303.getClass(), "languagesUrl", null);
        setField(term291303, term291303.getClass(), "stargazersUrl", null);
        setField(term291303, term291303.getClass(), "contributorsUrl", null);
        setField(term291303, term291303.getClass(), "subscribersUrl", null);
        setField(term291303, term291303.getClass(), "subscriptionUrl", null);
        setField(term291303, term291303.getClass(), "commitsUrl", null);
        setField(term291303, term291303.getClass(), "gitCommitsUrl", null);
        setField(term291303, term291303.getClass(), "commentsUrl", null);
        setField(term291303, term291303.getClass(), "issueCommentUrl", null);
        setField(term291303, term291303.getClass(), "contentsUrl", null);
        setField(term291303, term291303.getClass(), "compareUrl", null);
        setField(term291303, term291303.getClass(), "mergesUrl", null);
        setField(term291303, term291303.getClass(), "archiveUrl", null);
        setField(term291303, term291303.getClass(), "downloadsUrl", null);
        setField(term291303, term291303.getClass(), "issuesUrl", null);
        setField(term291303, term291303.getClass(), "pullsUrl", null);
        setField(term291303, term291303.getClass(), "milestonesUrl", null);
        setField(term291303, term291303.getClass(), "notificationsUrl", null);
        setField(term291303, term291303.getClass(), "labelsUrl", null);
        setField(term291303, term291303.getClass(), "releasesUrl", null);
        setField(term291303, term291303.getClass(), "deploymentsUrl", null);
        setField(term291303, term291303.getClass(), "createdAt", null);
        setField(term291303, term291303.getClass(), "updatedAt", null);
        setField(term291303, term291303.getClass(), "pushedAt", null);
        setField(term291303, term291303.getClass(), "gitUrl", null);
        setField(term291303, term291303.getClass(), "sshUrl", null);
        setField(term291303, term291303.getClass(), "cloneUrl", null);
        setField(term291303, term291303.getClass(), "svnUrl", null);
        setField(term291303, term291303.getClass(), "homepage", null);
        setField(term291303, term291303.getClass(), "size", null);
        setField(term291303, term291303.getClass(), "stargazersCount", null);
        setField(term291303, term291303.getClass(), "watchersCount", null);
        setField(term291303, term291303.getClass(), "language", null);
        setField(term291303, term291303.getClass(), "hasIssues", null);
        setField(term291303, term291303.getClass(), "hasProjects", null);
        setField(term291303, term291303.getClass(), "hasDownloads", null);
        setField(term291303, term291303.getClass(), "hasWiki", null);
        setField(term291303, term291303.getClass(), "hasPages", null);
        setField(term291303, term291303.getClass(), "forksCount", null);
        setField(term291303, term291303.getClass(), "archived", null);
        setField(term291303, term291303.getClass(), "disabled", null);
        setField(term291303, term291303.getClass(), "openIssuesCount", null);
        setField(term291303, term291303.getClass(), "license", null);
        setField(term291303, term291303.getClass(), "allowForking", null);
        setField(term291303, term291303.getClass(), "isTemplate", null);
        setField(term291303, term291303.getClass(), "topics", null);
        setField(term291303, term291303.getClass(), "visibility", null);
        setField(term291303, term291303.getClass(), "forks", null);
        setField(term291303, term291303.getClass(), "openIssues", null);
        setField(term291303, term291303.getClass(), "watchers", null);
        setField(term291303, term291303.getClass(), "defaultBranch", null);
        setField(term291303, term291303.getClass(), "networkCount", null);
        setField(term291303, term291303.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasWiki", argTypes, term291303, args);
    }

};


