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

public class GithubRepoResponse_getDeploymentsUrl_1205641601249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291272;

    public GithubRepoResponse_getDeploymentsUrl_1205641601249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291272 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291272, term291272.getClass(), "id", null);
        setField(term291272, term291272.getClass(), "nodeId", null);
        setField(term291272, term291272.getClass(), "name", null);
        setField(term291272, term291272.getClass(), "fullName", null);
        setField(term291272, term291272.getClass(), "_private", null);
        setField(term291272, term291272.getClass(), "owner", null);
        setField(term291272, term291272.getClass(), "htmlUrl", null);
        setField(term291272, term291272.getClass(), "description", null);
        setField(term291272, term291272.getClass(), "fork", null);
        setField(term291272, term291272.getClass(), "url", null);
        setField(term291272, term291272.getClass(), "forksUrl", null);
        setField(term291272, term291272.getClass(), "keysUrl", null);
        setField(term291272, term291272.getClass(), "collaboratorsUrl", null);
        setField(term291272, term291272.getClass(), "teamsUrl", null);
        setField(term291272, term291272.getClass(), "hooksUrl", null);
        setField(term291272, term291272.getClass(), "issueEventsUrl", null);
        setField(term291272, term291272.getClass(), "eventsUrl", null);
        setField(term291272, term291272.getClass(), "assigneesUrl", null);
        setField(term291272, term291272.getClass(), "branchesUrl", null);
        setField(term291272, term291272.getClass(), "tagsUrl", null);
        setField(term291272, term291272.getClass(), "blobsUrl", null);
        setField(term291272, term291272.getClass(), "gitTagsUrl", null);
        setField(term291272, term291272.getClass(), "gitRefsUrl", null);
        setField(term291272, term291272.getClass(), "treesUrl", null);
        setField(term291272, term291272.getClass(), "statusesUrl", null);
        setField(term291272, term291272.getClass(), "languagesUrl", null);
        setField(term291272, term291272.getClass(), "stargazersUrl", null);
        setField(term291272, term291272.getClass(), "contributorsUrl", null);
        setField(term291272, term291272.getClass(), "subscribersUrl", null);
        setField(term291272, term291272.getClass(), "subscriptionUrl", null);
        setField(term291272, term291272.getClass(), "commitsUrl", null);
        setField(term291272, term291272.getClass(), "gitCommitsUrl", null);
        setField(term291272, term291272.getClass(), "commentsUrl", null);
        setField(term291272, term291272.getClass(), "issueCommentUrl", null);
        setField(term291272, term291272.getClass(), "contentsUrl", null);
        setField(term291272, term291272.getClass(), "compareUrl", null);
        setField(term291272, term291272.getClass(), "mergesUrl", null);
        setField(term291272, term291272.getClass(), "archiveUrl", null);
        setField(term291272, term291272.getClass(), "downloadsUrl", null);
        setField(term291272, term291272.getClass(), "issuesUrl", null);
        setField(term291272, term291272.getClass(), "pullsUrl", null);
        setField(term291272, term291272.getClass(), "milestonesUrl", null);
        setField(term291272, term291272.getClass(), "notificationsUrl", null);
        setField(term291272, term291272.getClass(), "labelsUrl", null);
        setField(term291272, term291272.getClass(), "releasesUrl", null);
        setField(term291272, term291272.getClass(), "deploymentsUrl", null);
        setField(term291272, term291272.getClass(), "createdAt", null);
        setField(term291272, term291272.getClass(), "updatedAt", null);
        setField(term291272, term291272.getClass(), "pushedAt", null);
        setField(term291272, term291272.getClass(), "gitUrl", null);
        setField(term291272, term291272.getClass(), "sshUrl", null);
        setField(term291272, term291272.getClass(), "cloneUrl", null);
        setField(term291272, term291272.getClass(), "svnUrl", null);
        setField(term291272, term291272.getClass(), "homepage", null);
        setField(term291272, term291272.getClass(), "size", null);
        setField(term291272, term291272.getClass(), "stargazersCount", null);
        setField(term291272, term291272.getClass(), "watchersCount", null);
        setField(term291272, term291272.getClass(), "language", null);
        setField(term291272, term291272.getClass(), "hasIssues", null);
        setField(term291272, term291272.getClass(), "hasProjects", null);
        setField(term291272, term291272.getClass(), "hasDownloads", null);
        setField(term291272, term291272.getClass(), "hasWiki", null);
        setField(term291272, term291272.getClass(), "hasPages", null);
        setField(term291272, term291272.getClass(), "forksCount", null);
        setField(term291272, term291272.getClass(), "archived", null);
        setField(term291272, term291272.getClass(), "disabled", null);
        setField(term291272, term291272.getClass(), "openIssuesCount", null);
        setField(term291272, term291272.getClass(), "license", null);
        setField(term291272, term291272.getClass(), "allowForking", null);
        setField(term291272, term291272.getClass(), "isTemplate", null);
        setField(term291272, term291272.getClass(), "topics", null);
        setField(term291272, term291272.getClass(), "visibility", null);
        setField(term291272, term291272.getClass(), "forks", null);
        setField(term291272, term291272.getClass(), "openIssues", null);
        setField(term291272, term291272.getClass(), "watchers", null);
        setField(term291272, term291272.getClass(), "defaultBranch", null);
        setField(term291272, term291272.getClass(), "networkCount", null);
        setField(term291272, term291272.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeploymentsUrl", argTypes, term291272, args);
    }

};


