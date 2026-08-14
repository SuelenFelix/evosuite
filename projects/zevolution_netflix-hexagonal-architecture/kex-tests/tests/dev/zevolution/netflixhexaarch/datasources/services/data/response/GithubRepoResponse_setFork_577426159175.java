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

public class GithubRepoResponse_setFork_577426159175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291198;

    public GithubRepoResponse_setFork_577426159175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291198 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291198, term291198.getClass(), "id", null);
        setField(term291198, term291198.getClass(), "nodeId", null);
        setField(term291198, term291198.getClass(), "name", null);
        setField(term291198, term291198.getClass(), "fullName", null);
        setField(term291198, term291198.getClass(), "_private", null);
        setField(term291198, term291198.getClass(), "owner", null);
        setField(term291198, term291198.getClass(), "htmlUrl", null);
        setField(term291198, term291198.getClass(), "description", null);
        setField(term291198, term291198.getClass(), "fork", null);
        setField(term291198, term291198.getClass(), "url", null);
        setField(term291198, term291198.getClass(), "forksUrl", null);
        setField(term291198, term291198.getClass(), "keysUrl", null);
        setField(term291198, term291198.getClass(), "collaboratorsUrl", null);
        setField(term291198, term291198.getClass(), "teamsUrl", null);
        setField(term291198, term291198.getClass(), "hooksUrl", null);
        setField(term291198, term291198.getClass(), "issueEventsUrl", null);
        setField(term291198, term291198.getClass(), "eventsUrl", null);
        setField(term291198, term291198.getClass(), "assigneesUrl", null);
        setField(term291198, term291198.getClass(), "branchesUrl", null);
        setField(term291198, term291198.getClass(), "tagsUrl", null);
        setField(term291198, term291198.getClass(), "blobsUrl", null);
        setField(term291198, term291198.getClass(), "gitTagsUrl", null);
        setField(term291198, term291198.getClass(), "gitRefsUrl", null);
        setField(term291198, term291198.getClass(), "treesUrl", null);
        setField(term291198, term291198.getClass(), "statusesUrl", null);
        setField(term291198, term291198.getClass(), "languagesUrl", null);
        setField(term291198, term291198.getClass(), "stargazersUrl", null);
        setField(term291198, term291198.getClass(), "contributorsUrl", null);
        setField(term291198, term291198.getClass(), "subscribersUrl", null);
        setField(term291198, term291198.getClass(), "subscriptionUrl", null);
        setField(term291198, term291198.getClass(), "commitsUrl", null);
        setField(term291198, term291198.getClass(), "gitCommitsUrl", null);
        setField(term291198, term291198.getClass(), "commentsUrl", null);
        setField(term291198, term291198.getClass(), "issueCommentUrl", null);
        setField(term291198, term291198.getClass(), "contentsUrl", null);
        setField(term291198, term291198.getClass(), "compareUrl", null);
        setField(term291198, term291198.getClass(), "mergesUrl", null);
        setField(term291198, term291198.getClass(), "archiveUrl", null);
        setField(term291198, term291198.getClass(), "downloadsUrl", null);
        setField(term291198, term291198.getClass(), "issuesUrl", null);
        setField(term291198, term291198.getClass(), "pullsUrl", null);
        setField(term291198, term291198.getClass(), "milestonesUrl", null);
        setField(term291198, term291198.getClass(), "notificationsUrl", null);
        setField(term291198, term291198.getClass(), "labelsUrl", null);
        setField(term291198, term291198.getClass(), "releasesUrl", null);
        setField(term291198, term291198.getClass(), "deploymentsUrl", null);
        setField(term291198, term291198.getClass(), "createdAt", null);
        setField(term291198, term291198.getClass(), "updatedAt", null);
        setField(term291198, term291198.getClass(), "pushedAt", null);
        setField(term291198, term291198.getClass(), "gitUrl", null);
        setField(term291198, term291198.getClass(), "sshUrl", null);
        setField(term291198, term291198.getClass(), "cloneUrl", null);
        setField(term291198, term291198.getClass(), "svnUrl", null);
        setField(term291198, term291198.getClass(), "homepage", null);
        setField(term291198, term291198.getClass(), "size", null);
        setField(term291198, term291198.getClass(), "stargazersCount", null);
        setField(term291198, term291198.getClass(), "watchersCount", null);
        setField(term291198, term291198.getClass(), "language", null);
        setField(term291198, term291198.getClass(), "hasIssues", null);
        setField(term291198, term291198.getClass(), "hasProjects", null);
        setField(term291198, term291198.getClass(), "hasDownloads", null);
        setField(term291198, term291198.getClass(), "hasWiki", null);
        setField(term291198, term291198.getClass(), "hasPages", null);
        setField(term291198, term291198.getClass(), "forksCount", null);
        setField(term291198, term291198.getClass(), "archived", null);
        setField(term291198, term291198.getClass(), "disabled", null);
        setField(term291198, term291198.getClass(), "openIssuesCount", null);
        setField(term291198, term291198.getClass(), "license", null);
        setField(term291198, term291198.getClass(), "allowForking", null);
        setField(term291198, term291198.getClass(), "isTemplate", null);
        setField(term291198, term291198.getClass(), "topics", null);
        setField(term291198, term291198.getClass(), "visibility", null);
        setField(term291198, term291198.getClass(), "forks", null);
        setField(term291198, term291198.getClass(), "openIssues", null);
        setField(term291198, term291198.getClass(), "watchers", null);
        setField(term291198, term291198.getClass(), "defaultBranch", null);
        setField(term291198, term291198.getClass(), "networkCount", null);
        setField(term291198, term291198.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFork", argTypes, term291198, args);
    }

};


