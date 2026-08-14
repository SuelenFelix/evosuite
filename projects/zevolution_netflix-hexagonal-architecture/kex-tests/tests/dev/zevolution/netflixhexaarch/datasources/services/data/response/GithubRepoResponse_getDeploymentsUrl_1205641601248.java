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

public class GithubRepoResponse_getDeploymentsUrl_1205641601248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291271;

    public GithubRepoResponse_getDeploymentsUrl_1205641601248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291271 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291271, term291271.getClass(), "id", null);
        setField(term291271, term291271.getClass(), "nodeId", null);
        setField(term291271, term291271.getClass(), "name", null);
        setField(term291271, term291271.getClass(), "fullName", null);
        setField(term291271, term291271.getClass(), "_private", null);
        setField(term291271, term291271.getClass(), "owner", null);
        setField(term291271, term291271.getClass(), "htmlUrl", null);
        setField(term291271, term291271.getClass(), "description", null);
        setField(term291271, term291271.getClass(), "fork", null);
        setField(term291271, term291271.getClass(), "url", null);
        setField(term291271, term291271.getClass(), "forksUrl", null);
        setField(term291271, term291271.getClass(), "keysUrl", null);
        setField(term291271, term291271.getClass(), "collaboratorsUrl", null);
        setField(term291271, term291271.getClass(), "teamsUrl", null);
        setField(term291271, term291271.getClass(), "hooksUrl", null);
        setField(term291271, term291271.getClass(), "issueEventsUrl", null);
        setField(term291271, term291271.getClass(), "eventsUrl", null);
        setField(term291271, term291271.getClass(), "assigneesUrl", null);
        setField(term291271, term291271.getClass(), "branchesUrl", null);
        setField(term291271, term291271.getClass(), "tagsUrl", null);
        setField(term291271, term291271.getClass(), "blobsUrl", null);
        setField(term291271, term291271.getClass(), "gitTagsUrl", null);
        setField(term291271, term291271.getClass(), "gitRefsUrl", null);
        setField(term291271, term291271.getClass(), "treesUrl", null);
        setField(term291271, term291271.getClass(), "statusesUrl", null);
        setField(term291271, term291271.getClass(), "languagesUrl", null);
        setField(term291271, term291271.getClass(), "stargazersUrl", null);
        setField(term291271, term291271.getClass(), "contributorsUrl", null);
        setField(term291271, term291271.getClass(), "subscribersUrl", null);
        setField(term291271, term291271.getClass(), "subscriptionUrl", null);
        setField(term291271, term291271.getClass(), "commitsUrl", null);
        setField(term291271, term291271.getClass(), "gitCommitsUrl", null);
        setField(term291271, term291271.getClass(), "commentsUrl", null);
        setField(term291271, term291271.getClass(), "issueCommentUrl", null);
        setField(term291271, term291271.getClass(), "contentsUrl", null);
        setField(term291271, term291271.getClass(), "compareUrl", null);
        setField(term291271, term291271.getClass(), "mergesUrl", null);
        setField(term291271, term291271.getClass(), "archiveUrl", null);
        setField(term291271, term291271.getClass(), "downloadsUrl", null);
        setField(term291271, term291271.getClass(), "issuesUrl", null);
        setField(term291271, term291271.getClass(), "pullsUrl", null);
        setField(term291271, term291271.getClass(), "milestonesUrl", null);
        setField(term291271, term291271.getClass(), "notificationsUrl", null);
        setField(term291271, term291271.getClass(), "labelsUrl", null);
        setField(term291271, term291271.getClass(), "releasesUrl", null);
        setField(term291271, term291271.getClass(), "deploymentsUrl", null);
        setField(term291271, term291271.getClass(), "createdAt", null);
        setField(term291271, term291271.getClass(), "updatedAt", null);
        setField(term291271, term291271.getClass(), "pushedAt", null);
        setField(term291271, term291271.getClass(), "gitUrl", null);
        setField(term291271, term291271.getClass(), "sshUrl", null);
        setField(term291271, term291271.getClass(), "cloneUrl", null);
        setField(term291271, term291271.getClass(), "svnUrl", null);
        setField(term291271, term291271.getClass(), "homepage", null);
        setField(term291271, term291271.getClass(), "size", null);
        setField(term291271, term291271.getClass(), "stargazersCount", null);
        setField(term291271, term291271.getClass(), "watchersCount", null);
        setField(term291271, term291271.getClass(), "language", null);
        setField(term291271, term291271.getClass(), "hasIssues", null);
        setField(term291271, term291271.getClass(), "hasProjects", null);
        setField(term291271, term291271.getClass(), "hasDownloads", null);
        setField(term291271, term291271.getClass(), "hasWiki", null);
        setField(term291271, term291271.getClass(), "hasPages", null);
        setField(term291271, term291271.getClass(), "forksCount", null);
        setField(term291271, term291271.getClass(), "archived", null);
        setField(term291271, term291271.getClass(), "disabled", null);
        setField(term291271, term291271.getClass(), "openIssuesCount", null);
        setField(term291271, term291271.getClass(), "license", null);
        setField(term291271, term291271.getClass(), "allowForking", null);
        setField(term291271, term291271.getClass(), "isTemplate", null);
        setField(term291271, term291271.getClass(), "topics", null);
        setField(term291271, term291271.getClass(), "visibility", null);
        setField(term291271, term291271.getClass(), "forks", null);
        setField(term291271, term291271.getClass(), "openIssues", null);
        setField(term291271, term291271.getClass(), "watchers", null);
        setField(term291271, term291271.getClass(), "defaultBranch", null);
        setField(term291271, term291271.getClass(), "networkCount", null);
        setField(term291271, term291271.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeploymentsUrl", argTypes, term291271, args);
    }

};


