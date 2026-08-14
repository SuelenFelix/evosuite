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

public class GithubRepoResponse_getWatchers_1126619196307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291330;

    public GithubRepoResponse_getWatchers_1126619196307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291330 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291330, term291330.getClass(), "id", null);
        setField(term291330, term291330.getClass(), "nodeId", null);
        setField(term291330, term291330.getClass(), "name", null);
        setField(term291330, term291330.getClass(), "fullName", null);
        setField(term291330, term291330.getClass(), "_private", null);
        setField(term291330, term291330.getClass(), "owner", null);
        setField(term291330, term291330.getClass(), "htmlUrl", null);
        setField(term291330, term291330.getClass(), "description", null);
        setField(term291330, term291330.getClass(), "fork", null);
        setField(term291330, term291330.getClass(), "url", null);
        setField(term291330, term291330.getClass(), "forksUrl", null);
        setField(term291330, term291330.getClass(), "keysUrl", null);
        setField(term291330, term291330.getClass(), "collaboratorsUrl", null);
        setField(term291330, term291330.getClass(), "teamsUrl", null);
        setField(term291330, term291330.getClass(), "hooksUrl", null);
        setField(term291330, term291330.getClass(), "issueEventsUrl", null);
        setField(term291330, term291330.getClass(), "eventsUrl", null);
        setField(term291330, term291330.getClass(), "assigneesUrl", null);
        setField(term291330, term291330.getClass(), "branchesUrl", null);
        setField(term291330, term291330.getClass(), "tagsUrl", null);
        setField(term291330, term291330.getClass(), "blobsUrl", null);
        setField(term291330, term291330.getClass(), "gitTagsUrl", null);
        setField(term291330, term291330.getClass(), "gitRefsUrl", null);
        setField(term291330, term291330.getClass(), "treesUrl", null);
        setField(term291330, term291330.getClass(), "statusesUrl", null);
        setField(term291330, term291330.getClass(), "languagesUrl", null);
        setField(term291330, term291330.getClass(), "stargazersUrl", null);
        setField(term291330, term291330.getClass(), "contributorsUrl", null);
        setField(term291330, term291330.getClass(), "subscribersUrl", null);
        setField(term291330, term291330.getClass(), "subscriptionUrl", null);
        setField(term291330, term291330.getClass(), "commitsUrl", null);
        setField(term291330, term291330.getClass(), "gitCommitsUrl", null);
        setField(term291330, term291330.getClass(), "commentsUrl", null);
        setField(term291330, term291330.getClass(), "issueCommentUrl", null);
        setField(term291330, term291330.getClass(), "contentsUrl", null);
        setField(term291330, term291330.getClass(), "compareUrl", null);
        setField(term291330, term291330.getClass(), "mergesUrl", null);
        setField(term291330, term291330.getClass(), "archiveUrl", null);
        setField(term291330, term291330.getClass(), "downloadsUrl", null);
        setField(term291330, term291330.getClass(), "issuesUrl", null);
        setField(term291330, term291330.getClass(), "pullsUrl", null);
        setField(term291330, term291330.getClass(), "milestonesUrl", null);
        setField(term291330, term291330.getClass(), "notificationsUrl", null);
        setField(term291330, term291330.getClass(), "labelsUrl", null);
        setField(term291330, term291330.getClass(), "releasesUrl", null);
        setField(term291330, term291330.getClass(), "deploymentsUrl", null);
        setField(term291330, term291330.getClass(), "createdAt", null);
        setField(term291330, term291330.getClass(), "updatedAt", null);
        setField(term291330, term291330.getClass(), "pushedAt", null);
        setField(term291330, term291330.getClass(), "gitUrl", null);
        setField(term291330, term291330.getClass(), "sshUrl", null);
        setField(term291330, term291330.getClass(), "cloneUrl", null);
        setField(term291330, term291330.getClass(), "svnUrl", null);
        setField(term291330, term291330.getClass(), "homepage", null);
        setField(term291330, term291330.getClass(), "size", null);
        setField(term291330, term291330.getClass(), "stargazersCount", null);
        setField(term291330, term291330.getClass(), "watchersCount", null);
        setField(term291330, term291330.getClass(), "language", null);
        setField(term291330, term291330.getClass(), "hasIssues", null);
        setField(term291330, term291330.getClass(), "hasProjects", null);
        setField(term291330, term291330.getClass(), "hasDownloads", null);
        setField(term291330, term291330.getClass(), "hasWiki", null);
        setField(term291330, term291330.getClass(), "hasPages", null);
        setField(term291330, term291330.getClass(), "forksCount", null);
        setField(term291330, term291330.getClass(), "archived", null);
        setField(term291330, term291330.getClass(), "disabled", null);
        setField(term291330, term291330.getClass(), "openIssuesCount", null);
        setField(term291330, term291330.getClass(), "license", null);
        setField(term291330, term291330.getClass(), "allowForking", null);
        setField(term291330, term291330.getClass(), "isTemplate", null);
        setField(term291330, term291330.getClass(), "topics", null);
        setField(term291330, term291330.getClass(), "visibility", null);
        setField(term291330, term291330.getClass(), "forks", null);
        setField(term291330, term291330.getClass(), "openIssues", null);
        setField(term291330, term291330.getClass(), "watchers", null);
        setField(term291330, term291330.getClass(), "defaultBranch", null);
        setField(term291330, term291330.getClass(), "networkCount", null);
        setField(term291330, term291330.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWatchers", argTypes, term291330, args);
    }

};


