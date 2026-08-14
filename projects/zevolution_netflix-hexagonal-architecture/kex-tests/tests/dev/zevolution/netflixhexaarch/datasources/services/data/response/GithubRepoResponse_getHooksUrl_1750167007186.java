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

public class GithubRepoResponse_getHooksUrl_1750167007186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291209;

    public GithubRepoResponse_getHooksUrl_1750167007186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291209 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291209, term291209.getClass(), "id", null);
        setField(term291209, term291209.getClass(), "nodeId", null);
        setField(term291209, term291209.getClass(), "name", null);
        setField(term291209, term291209.getClass(), "fullName", null);
        setField(term291209, term291209.getClass(), "_private", null);
        setField(term291209, term291209.getClass(), "owner", null);
        setField(term291209, term291209.getClass(), "htmlUrl", null);
        setField(term291209, term291209.getClass(), "description", null);
        setField(term291209, term291209.getClass(), "fork", null);
        setField(term291209, term291209.getClass(), "url", null);
        setField(term291209, term291209.getClass(), "forksUrl", null);
        setField(term291209, term291209.getClass(), "keysUrl", null);
        setField(term291209, term291209.getClass(), "collaboratorsUrl", null);
        setField(term291209, term291209.getClass(), "teamsUrl", null);
        setField(term291209, term291209.getClass(), "hooksUrl", null);
        setField(term291209, term291209.getClass(), "issueEventsUrl", null);
        setField(term291209, term291209.getClass(), "eventsUrl", null);
        setField(term291209, term291209.getClass(), "assigneesUrl", null);
        setField(term291209, term291209.getClass(), "branchesUrl", null);
        setField(term291209, term291209.getClass(), "tagsUrl", null);
        setField(term291209, term291209.getClass(), "blobsUrl", null);
        setField(term291209, term291209.getClass(), "gitTagsUrl", null);
        setField(term291209, term291209.getClass(), "gitRefsUrl", null);
        setField(term291209, term291209.getClass(), "treesUrl", null);
        setField(term291209, term291209.getClass(), "statusesUrl", null);
        setField(term291209, term291209.getClass(), "languagesUrl", null);
        setField(term291209, term291209.getClass(), "stargazersUrl", null);
        setField(term291209, term291209.getClass(), "contributorsUrl", null);
        setField(term291209, term291209.getClass(), "subscribersUrl", null);
        setField(term291209, term291209.getClass(), "subscriptionUrl", null);
        setField(term291209, term291209.getClass(), "commitsUrl", null);
        setField(term291209, term291209.getClass(), "gitCommitsUrl", null);
        setField(term291209, term291209.getClass(), "commentsUrl", null);
        setField(term291209, term291209.getClass(), "issueCommentUrl", null);
        setField(term291209, term291209.getClass(), "contentsUrl", null);
        setField(term291209, term291209.getClass(), "compareUrl", null);
        setField(term291209, term291209.getClass(), "mergesUrl", null);
        setField(term291209, term291209.getClass(), "archiveUrl", null);
        setField(term291209, term291209.getClass(), "downloadsUrl", null);
        setField(term291209, term291209.getClass(), "issuesUrl", null);
        setField(term291209, term291209.getClass(), "pullsUrl", null);
        setField(term291209, term291209.getClass(), "milestonesUrl", null);
        setField(term291209, term291209.getClass(), "notificationsUrl", null);
        setField(term291209, term291209.getClass(), "labelsUrl", null);
        setField(term291209, term291209.getClass(), "releasesUrl", null);
        setField(term291209, term291209.getClass(), "deploymentsUrl", null);
        setField(term291209, term291209.getClass(), "createdAt", null);
        setField(term291209, term291209.getClass(), "updatedAt", null);
        setField(term291209, term291209.getClass(), "pushedAt", null);
        setField(term291209, term291209.getClass(), "gitUrl", null);
        setField(term291209, term291209.getClass(), "sshUrl", null);
        setField(term291209, term291209.getClass(), "cloneUrl", null);
        setField(term291209, term291209.getClass(), "svnUrl", null);
        setField(term291209, term291209.getClass(), "homepage", null);
        setField(term291209, term291209.getClass(), "size", null);
        setField(term291209, term291209.getClass(), "stargazersCount", null);
        setField(term291209, term291209.getClass(), "watchersCount", null);
        setField(term291209, term291209.getClass(), "language", null);
        setField(term291209, term291209.getClass(), "hasIssues", null);
        setField(term291209, term291209.getClass(), "hasProjects", null);
        setField(term291209, term291209.getClass(), "hasDownloads", null);
        setField(term291209, term291209.getClass(), "hasWiki", null);
        setField(term291209, term291209.getClass(), "hasPages", null);
        setField(term291209, term291209.getClass(), "forksCount", null);
        setField(term291209, term291209.getClass(), "archived", null);
        setField(term291209, term291209.getClass(), "disabled", null);
        setField(term291209, term291209.getClass(), "openIssuesCount", null);
        setField(term291209, term291209.getClass(), "license", null);
        setField(term291209, term291209.getClass(), "allowForking", null);
        setField(term291209, term291209.getClass(), "isTemplate", null);
        setField(term291209, term291209.getClass(), "topics", null);
        setField(term291209, term291209.getClass(), "visibility", null);
        setField(term291209, term291209.getClass(), "forks", null);
        setField(term291209, term291209.getClass(), "openIssues", null);
        setField(term291209, term291209.getClass(), "watchers", null);
        setField(term291209, term291209.getClass(), "defaultBranch", null);
        setField(term291209, term291209.getClass(), "networkCount", null);
        setField(term291209, term291209.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHooksUrl", argTypes, term291209, args);
    }

};


