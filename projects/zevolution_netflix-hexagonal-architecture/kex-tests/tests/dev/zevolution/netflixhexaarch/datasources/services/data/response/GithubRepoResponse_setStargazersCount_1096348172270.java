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

public class GithubRepoResponse_setStargazersCount_1096348172270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291293;

    public GithubRepoResponse_setStargazersCount_1096348172270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291293 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291293, term291293.getClass(), "id", null);
        setField(term291293, term291293.getClass(), "nodeId", null);
        setField(term291293, term291293.getClass(), "name", null);
        setField(term291293, term291293.getClass(), "fullName", null);
        setField(term291293, term291293.getClass(), "_private", null);
        setField(term291293, term291293.getClass(), "owner", null);
        setField(term291293, term291293.getClass(), "htmlUrl", null);
        setField(term291293, term291293.getClass(), "description", null);
        setField(term291293, term291293.getClass(), "fork", null);
        setField(term291293, term291293.getClass(), "url", null);
        setField(term291293, term291293.getClass(), "forksUrl", null);
        setField(term291293, term291293.getClass(), "keysUrl", null);
        setField(term291293, term291293.getClass(), "collaboratorsUrl", null);
        setField(term291293, term291293.getClass(), "teamsUrl", null);
        setField(term291293, term291293.getClass(), "hooksUrl", null);
        setField(term291293, term291293.getClass(), "issueEventsUrl", null);
        setField(term291293, term291293.getClass(), "eventsUrl", null);
        setField(term291293, term291293.getClass(), "assigneesUrl", null);
        setField(term291293, term291293.getClass(), "branchesUrl", null);
        setField(term291293, term291293.getClass(), "tagsUrl", null);
        setField(term291293, term291293.getClass(), "blobsUrl", null);
        setField(term291293, term291293.getClass(), "gitTagsUrl", null);
        setField(term291293, term291293.getClass(), "gitRefsUrl", null);
        setField(term291293, term291293.getClass(), "treesUrl", null);
        setField(term291293, term291293.getClass(), "statusesUrl", null);
        setField(term291293, term291293.getClass(), "languagesUrl", null);
        setField(term291293, term291293.getClass(), "stargazersUrl", null);
        setField(term291293, term291293.getClass(), "contributorsUrl", null);
        setField(term291293, term291293.getClass(), "subscribersUrl", null);
        setField(term291293, term291293.getClass(), "subscriptionUrl", null);
        setField(term291293, term291293.getClass(), "commitsUrl", null);
        setField(term291293, term291293.getClass(), "gitCommitsUrl", null);
        setField(term291293, term291293.getClass(), "commentsUrl", null);
        setField(term291293, term291293.getClass(), "issueCommentUrl", null);
        setField(term291293, term291293.getClass(), "contentsUrl", null);
        setField(term291293, term291293.getClass(), "compareUrl", null);
        setField(term291293, term291293.getClass(), "mergesUrl", null);
        setField(term291293, term291293.getClass(), "archiveUrl", null);
        setField(term291293, term291293.getClass(), "downloadsUrl", null);
        setField(term291293, term291293.getClass(), "issuesUrl", null);
        setField(term291293, term291293.getClass(), "pullsUrl", null);
        setField(term291293, term291293.getClass(), "milestonesUrl", null);
        setField(term291293, term291293.getClass(), "notificationsUrl", null);
        setField(term291293, term291293.getClass(), "labelsUrl", null);
        setField(term291293, term291293.getClass(), "releasesUrl", null);
        setField(term291293, term291293.getClass(), "deploymentsUrl", null);
        setField(term291293, term291293.getClass(), "createdAt", null);
        setField(term291293, term291293.getClass(), "updatedAt", null);
        setField(term291293, term291293.getClass(), "pushedAt", null);
        setField(term291293, term291293.getClass(), "gitUrl", null);
        setField(term291293, term291293.getClass(), "sshUrl", null);
        setField(term291293, term291293.getClass(), "cloneUrl", null);
        setField(term291293, term291293.getClass(), "svnUrl", null);
        setField(term291293, term291293.getClass(), "homepage", null);
        setField(term291293, term291293.getClass(), "size", null);
        setField(term291293, term291293.getClass(), "stargazersCount", null);
        setField(term291293, term291293.getClass(), "watchersCount", null);
        setField(term291293, term291293.getClass(), "language", null);
        setField(term291293, term291293.getClass(), "hasIssues", null);
        setField(term291293, term291293.getClass(), "hasProjects", null);
        setField(term291293, term291293.getClass(), "hasDownloads", null);
        setField(term291293, term291293.getClass(), "hasWiki", null);
        setField(term291293, term291293.getClass(), "hasPages", null);
        setField(term291293, term291293.getClass(), "forksCount", null);
        setField(term291293, term291293.getClass(), "archived", null);
        setField(term291293, term291293.getClass(), "disabled", null);
        setField(term291293, term291293.getClass(), "openIssuesCount", null);
        setField(term291293, term291293.getClass(), "license", null);
        setField(term291293, term291293.getClass(), "allowForking", null);
        setField(term291293, term291293.getClass(), "isTemplate", null);
        setField(term291293, term291293.getClass(), "topics", null);
        setField(term291293, term291293.getClass(), "visibility", null);
        setField(term291293, term291293.getClass(), "forks", null);
        setField(term291293, term291293.getClass(), "openIssues", null);
        setField(term291293, term291293.getClass(), "watchers", null);
        setField(term291293, term291293.getClass(), "defaultBranch", null);
        setField(term291293, term291293.getClass(), "networkCount", null);
        setField(term291293, term291293.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStargazersCount", argTypes, term291293, args);
    }

};


