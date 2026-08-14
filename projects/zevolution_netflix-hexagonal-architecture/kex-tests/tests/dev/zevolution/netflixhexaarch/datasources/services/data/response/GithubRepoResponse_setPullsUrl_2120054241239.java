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

public class GithubRepoResponse_setPullsUrl_2120054241239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291262;

    public GithubRepoResponse_setPullsUrl_2120054241239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291262 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291262, term291262.getClass(), "id", null);
        setField(term291262, term291262.getClass(), "nodeId", null);
        setField(term291262, term291262.getClass(), "name", null);
        setField(term291262, term291262.getClass(), "fullName", null);
        setField(term291262, term291262.getClass(), "_private", null);
        setField(term291262, term291262.getClass(), "owner", null);
        setField(term291262, term291262.getClass(), "htmlUrl", null);
        setField(term291262, term291262.getClass(), "description", null);
        setField(term291262, term291262.getClass(), "fork", null);
        setField(term291262, term291262.getClass(), "url", null);
        setField(term291262, term291262.getClass(), "forksUrl", null);
        setField(term291262, term291262.getClass(), "keysUrl", null);
        setField(term291262, term291262.getClass(), "collaboratorsUrl", null);
        setField(term291262, term291262.getClass(), "teamsUrl", null);
        setField(term291262, term291262.getClass(), "hooksUrl", null);
        setField(term291262, term291262.getClass(), "issueEventsUrl", null);
        setField(term291262, term291262.getClass(), "eventsUrl", null);
        setField(term291262, term291262.getClass(), "assigneesUrl", null);
        setField(term291262, term291262.getClass(), "branchesUrl", null);
        setField(term291262, term291262.getClass(), "tagsUrl", null);
        setField(term291262, term291262.getClass(), "blobsUrl", null);
        setField(term291262, term291262.getClass(), "gitTagsUrl", null);
        setField(term291262, term291262.getClass(), "gitRefsUrl", null);
        setField(term291262, term291262.getClass(), "treesUrl", null);
        setField(term291262, term291262.getClass(), "statusesUrl", null);
        setField(term291262, term291262.getClass(), "languagesUrl", null);
        setField(term291262, term291262.getClass(), "stargazersUrl", null);
        setField(term291262, term291262.getClass(), "contributorsUrl", null);
        setField(term291262, term291262.getClass(), "subscribersUrl", null);
        setField(term291262, term291262.getClass(), "subscriptionUrl", null);
        setField(term291262, term291262.getClass(), "commitsUrl", null);
        setField(term291262, term291262.getClass(), "gitCommitsUrl", null);
        setField(term291262, term291262.getClass(), "commentsUrl", null);
        setField(term291262, term291262.getClass(), "issueCommentUrl", null);
        setField(term291262, term291262.getClass(), "contentsUrl", null);
        setField(term291262, term291262.getClass(), "compareUrl", null);
        setField(term291262, term291262.getClass(), "mergesUrl", null);
        setField(term291262, term291262.getClass(), "archiveUrl", null);
        setField(term291262, term291262.getClass(), "downloadsUrl", null);
        setField(term291262, term291262.getClass(), "issuesUrl", null);
        setField(term291262, term291262.getClass(), "pullsUrl", null);
        setField(term291262, term291262.getClass(), "milestonesUrl", null);
        setField(term291262, term291262.getClass(), "notificationsUrl", null);
        setField(term291262, term291262.getClass(), "labelsUrl", null);
        setField(term291262, term291262.getClass(), "releasesUrl", null);
        setField(term291262, term291262.getClass(), "deploymentsUrl", null);
        setField(term291262, term291262.getClass(), "createdAt", null);
        setField(term291262, term291262.getClass(), "updatedAt", null);
        setField(term291262, term291262.getClass(), "pushedAt", null);
        setField(term291262, term291262.getClass(), "gitUrl", null);
        setField(term291262, term291262.getClass(), "sshUrl", null);
        setField(term291262, term291262.getClass(), "cloneUrl", null);
        setField(term291262, term291262.getClass(), "svnUrl", null);
        setField(term291262, term291262.getClass(), "homepage", null);
        setField(term291262, term291262.getClass(), "size", null);
        setField(term291262, term291262.getClass(), "stargazersCount", null);
        setField(term291262, term291262.getClass(), "watchersCount", null);
        setField(term291262, term291262.getClass(), "language", null);
        setField(term291262, term291262.getClass(), "hasIssues", null);
        setField(term291262, term291262.getClass(), "hasProjects", null);
        setField(term291262, term291262.getClass(), "hasDownloads", null);
        setField(term291262, term291262.getClass(), "hasWiki", null);
        setField(term291262, term291262.getClass(), "hasPages", null);
        setField(term291262, term291262.getClass(), "forksCount", null);
        setField(term291262, term291262.getClass(), "archived", null);
        setField(term291262, term291262.getClass(), "disabled", null);
        setField(term291262, term291262.getClass(), "openIssuesCount", null);
        setField(term291262, term291262.getClass(), "license", null);
        setField(term291262, term291262.getClass(), "allowForking", null);
        setField(term291262, term291262.getClass(), "isTemplate", null);
        setField(term291262, term291262.getClass(), "topics", null);
        setField(term291262, term291262.getClass(), "visibility", null);
        setField(term291262, term291262.getClass(), "forks", null);
        setField(term291262, term291262.getClass(), "openIssues", null);
        setField(term291262, term291262.getClass(), "watchers", null);
        setField(term291262, term291262.getClass(), "defaultBranch", null);
        setField(term291262, term291262.getClass(), "networkCount", null);
        setField(term291262, term291262.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPullsUrl", argTypes, term291262, args);
    }

};


