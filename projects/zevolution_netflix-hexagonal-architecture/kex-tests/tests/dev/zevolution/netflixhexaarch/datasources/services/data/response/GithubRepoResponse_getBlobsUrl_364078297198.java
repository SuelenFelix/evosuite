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

public class GithubRepoResponse_getBlobsUrl_364078297198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291221;

    public GithubRepoResponse_getBlobsUrl_364078297198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291221 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291221, term291221.getClass(), "id", null);
        setField(term291221, term291221.getClass(), "nodeId", null);
        setField(term291221, term291221.getClass(), "name", null);
        setField(term291221, term291221.getClass(), "fullName", null);
        setField(term291221, term291221.getClass(), "_private", null);
        setField(term291221, term291221.getClass(), "owner", null);
        setField(term291221, term291221.getClass(), "htmlUrl", null);
        setField(term291221, term291221.getClass(), "description", null);
        setField(term291221, term291221.getClass(), "fork", null);
        setField(term291221, term291221.getClass(), "url", null);
        setField(term291221, term291221.getClass(), "forksUrl", null);
        setField(term291221, term291221.getClass(), "keysUrl", null);
        setField(term291221, term291221.getClass(), "collaboratorsUrl", null);
        setField(term291221, term291221.getClass(), "teamsUrl", null);
        setField(term291221, term291221.getClass(), "hooksUrl", null);
        setField(term291221, term291221.getClass(), "issueEventsUrl", null);
        setField(term291221, term291221.getClass(), "eventsUrl", null);
        setField(term291221, term291221.getClass(), "assigneesUrl", null);
        setField(term291221, term291221.getClass(), "branchesUrl", null);
        setField(term291221, term291221.getClass(), "tagsUrl", null);
        setField(term291221, term291221.getClass(), "blobsUrl", null);
        setField(term291221, term291221.getClass(), "gitTagsUrl", null);
        setField(term291221, term291221.getClass(), "gitRefsUrl", null);
        setField(term291221, term291221.getClass(), "treesUrl", null);
        setField(term291221, term291221.getClass(), "statusesUrl", null);
        setField(term291221, term291221.getClass(), "languagesUrl", null);
        setField(term291221, term291221.getClass(), "stargazersUrl", null);
        setField(term291221, term291221.getClass(), "contributorsUrl", null);
        setField(term291221, term291221.getClass(), "subscribersUrl", null);
        setField(term291221, term291221.getClass(), "subscriptionUrl", null);
        setField(term291221, term291221.getClass(), "commitsUrl", null);
        setField(term291221, term291221.getClass(), "gitCommitsUrl", null);
        setField(term291221, term291221.getClass(), "commentsUrl", null);
        setField(term291221, term291221.getClass(), "issueCommentUrl", null);
        setField(term291221, term291221.getClass(), "contentsUrl", null);
        setField(term291221, term291221.getClass(), "compareUrl", null);
        setField(term291221, term291221.getClass(), "mergesUrl", null);
        setField(term291221, term291221.getClass(), "archiveUrl", null);
        setField(term291221, term291221.getClass(), "downloadsUrl", null);
        setField(term291221, term291221.getClass(), "issuesUrl", null);
        setField(term291221, term291221.getClass(), "pullsUrl", null);
        setField(term291221, term291221.getClass(), "milestonesUrl", null);
        setField(term291221, term291221.getClass(), "notificationsUrl", null);
        setField(term291221, term291221.getClass(), "labelsUrl", null);
        setField(term291221, term291221.getClass(), "releasesUrl", null);
        setField(term291221, term291221.getClass(), "deploymentsUrl", null);
        setField(term291221, term291221.getClass(), "createdAt", null);
        setField(term291221, term291221.getClass(), "updatedAt", null);
        setField(term291221, term291221.getClass(), "pushedAt", null);
        setField(term291221, term291221.getClass(), "gitUrl", null);
        setField(term291221, term291221.getClass(), "sshUrl", null);
        setField(term291221, term291221.getClass(), "cloneUrl", null);
        setField(term291221, term291221.getClass(), "svnUrl", null);
        setField(term291221, term291221.getClass(), "homepage", null);
        setField(term291221, term291221.getClass(), "size", null);
        setField(term291221, term291221.getClass(), "stargazersCount", null);
        setField(term291221, term291221.getClass(), "watchersCount", null);
        setField(term291221, term291221.getClass(), "language", null);
        setField(term291221, term291221.getClass(), "hasIssues", null);
        setField(term291221, term291221.getClass(), "hasProjects", null);
        setField(term291221, term291221.getClass(), "hasDownloads", null);
        setField(term291221, term291221.getClass(), "hasWiki", null);
        setField(term291221, term291221.getClass(), "hasPages", null);
        setField(term291221, term291221.getClass(), "forksCount", null);
        setField(term291221, term291221.getClass(), "archived", null);
        setField(term291221, term291221.getClass(), "disabled", null);
        setField(term291221, term291221.getClass(), "openIssuesCount", null);
        setField(term291221, term291221.getClass(), "license", null);
        setField(term291221, term291221.getClass(), "allowForking", null);
        setField(term291221, term291221.getClass(), "isTemplate", null);
        setField(term291221, term291221.getClass(), "topics", null);
        setField(term291221, term291221.getClass(), "visibility", null);
        setField(term291221, term291221.getClass(), "forks", null);
        setField(term291221, term291221.getClass(), "openIssues", null);
        setField(term291221, term291221.getClass(), "watchers", null);
        setField(term291221, term291221.getClass(), "defaultBranch", null);
        setField(term291221, term291221.getClass(), "networkCount", null);
        setField(term291221, term291221.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlobsUrl", argTypes, term291221, args);
    }

};


