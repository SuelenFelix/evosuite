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

public class GithubRepoResponse_setHasPages_915196569283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291306;

    public GithubRepoResponse_setHasPages_915196569283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291306 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291306, term291306.getClass(), "id", null);
        setField(term291306, term291306.getClass(), "nodeId", null);
        setField(term291306, term291306.getClass(), "name", null);
        setField(term291306, term291306.getClass(), "fullName", null);
        setField(term291306, term291306.getClass(), "_private", null);
        setField(term291306, term291306.getClass(), "owner", null);
        setField(term291306, term291306.getClass(), "htmlUrl", null);
        setField(term291306, term291306.getClass(), "description", null);
        setField(term291306, term291306.getClass(), "fork", null);
        setField(term291306, term291306.getClass(), "url", null);
        setField(term291306, term291306.getClass(), "forksUrl", null);
        setField(term291306, term291306.getClass(), "keysUrl", null);
        setField(term291306, term291306.getClass(), "collaboratorsUrl", null);
        setField(term291306, term291306.getClass(), "teamsUrl", null);
        setField(term291306, term291306.getClass(), "hooksUrl", null);
        setField(term291306, term291306.getClass(), "issueEventsUrl", null);
        setField(term291306, term291306.getClass(), "eventsUrl", null);
        setField(term291306, term291306.getClass(), "assigneesUrl", null);
        setField(term291306, term291306.getClass(), "branchesUrl", null);
        setField(term291306, term291306.getClass(), "tagsUrl", null);
        setField(term291306, term291306.getClass(), "blobsUrl", null);
        setField(term291306, term291306.getClass(), "gitTagsUrl", null);
        setField(term291306, term291306.getClass(), "gitRefsUrl", null);
        setField(term291306, term291306.getClass(), "treesUrl", null);
        setField(term291306, term291306.getClass(), "statusesUrl", null);
        setField(term291306, term291306.getClass(), "languagesUrl", null);
        setField(term291306, term291306.getClass(), "stargazersUrl", null);
        setField(term291306, term291306.getClass(), "contributorsUrl", null);
        setField(term291306, term291306.getClass(), "subscribersUrl", null);
        setField(term291306, term291306.getClass(), "subscriptionUrl", null);
        setField(term291306, term291306.getClass(), "commitsUrl", null);
        setField(term291306, term291306.getClass(), "gitCommitsUrl", null);
        setField(term291306, term291306.getClass(), "commentsUrl", null);
        setField(term291306, term291306.getClass(), "issueCommentUrl", null);
        setField(term291306, term291306.getClass(), "contentsUrl", null);
        setField(term291306, term291306.getClass(), "compareUrl", null);
        setField(term291306, term291306.getClass(), "mergesUrl", null);
        setField(term291306, term291306.getClass(), "archiveUrl", null);
        setField(term291306, term291306.getClass(), "downloadsUrl", null);
        setField(term291306, term291306.getClass(), "issuesUrl", null);
        setField(term291306, term291306.getClass(), "pullsUrl", null);
        setField(term291306, term291306.getClass(), "milestonesUrl", null);
        setField(term291306, term291306.getClass(), "notificationsUrl", null);
        setField(term291306, term291306.getClass(), "labelsUrl", null);
        setField(term291306, term291306.getClass(), "releasesUrl", null);
        setField(term291306, term291306.getClass(), "deploymentsUrl", null);
        setField(term291306, term291306.getClass(), "createdAt", null);
        setField(term291306, term291306.getClass(), "updatedAt", null);
        setField(term291306, term291306.getClass(), "pushedAt", null);
        setField(term291306, term291306.getClass(), "gitUrl", null);
        setField(term291306, term291306.getClass(), "sshUrl", null);
        setField(term291306, term291306.getClass(), "cloneUrl", null);
        setField(term291306, term291306.getClass(), "svnUrl", null);
        setField(term291306, term291306.getClass(), "homepage", null);
        setField(term291306, term291306.getClass(), "size", null);
        setField(term291306, term291306.getClass(), "stargazersCount", null);
        setField(term291306, term291306.getClass(), "watchersCount", null);
        setField(term291306, term291306.getClass(), "language", null);
        setField(term291306, term291306.getClass(), "hasIssues", null);
        setField(term291306, term291306.getClass(), "hasProjects", null);
        setField(term291306, term291306.getClass(), "hasDownloads", null);
        setField(term291306, term291306.getClass(), "hasWiki", null);
        setField(term291306, term291306.getClass(), "hasPages", null);
        setField(term291306, term291306.getClass(), "forksCount", null);
        setField(term291306, term291306.getClass(), "archived", null);
        setField(term291306, term291306.getClass(), "disabled", null);
        setField(term291306, term291306.getClass(), "openIssuesCount", null);
        setField(term291306, term291306.getClass(), "license", null);
        setField(term291306, term291306.getClass(), "allowForking", null);
        setField(term291306, term291306.getClass(), "isTemplate", null);
        setField(term291306, term291306.getClass(), "topics", null);
        setField(term291306, term291306.getClass(), "visibility", null);
        setField(term291306, term291306.getClass(), "forks", null);
        setField(term291306, term291306.getClass(), "openIssues", null);
        setField(term291306, term291306.getClass(), "watchers", null);
        setField(term291306, term291306.getClass(), "defaultBranch", null);
        setField(term291306, term291306.getClass(), "networkCount", null);
        setField(term291306, term291306.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasPages", argTypes, term291306, args);
    }

};


