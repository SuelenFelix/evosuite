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

public class GithubRepoResponse_getCompareUrl_1772794954229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291252;

    public GithubRepoResponse_getCompareUrl_1772794954229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291252 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291252, term291252.getClass(), "id", null);
        setField(term291252, term291252.getClass(), "nodeId", null);
        setField(term291252, term291252.getClass(), "name", null);
        setField(term291252, term291252.getClass(), "fullName", null);
        setField(term291252, term291252.getClass(), "_private", null);
        setField(term291252, term291252.getClass(), "owner", null);
        setField(term291252, term291252.getClass(), "htmlUrl", null);
        setField(term291252, term291252.getClass(), "description", null);
        setField(term291252, term291252.getClass(), "fork", null);
        setField(term291252, term291252.getClass(), "url", null);
        setField(term291252, term291252.getClass(), "forksUrl", null);
        setField(term291252, term291252.getClass(), "keysUrl", null);
        setField(term291252, term291252.getClass(), "collaboratorsUrl", null);
        setField(term291252, term291252.getClass(), "teamsUrl", null);
        setField(term291252, term291252.getClass(), "hooksUrl", null);
        setField(term291252, term291252.getClass(), "issueEventsUrl", null);
        setField(term291252, term291252.getClass(), "eventsUrl", null);
        setField(term291252, term291252.getClass(), "assigneesUrl", null);
        setField(term291252, term291252.getClass(), "branchesUrl", null);
        setField(term291252, term291252.getClass(), "tagsUrl", null);
        setField(term291252, term291252.getClass(), "blobsUrl", null);
        setField(term291252, term291252.getClass(), "gitTagsUrl", null);
        setField(term291252, term291252.getClass(), "gitRefsUrl", null);
        setField(term291252, term291252.getClass(), "treesUrl", null);
        setField(term291252, term291252.getClass(), "statusesUrl", null);
        setField(term291252, term291252.getClass(), "languagesUrl", null);
        setField(term291252, term291252.getClass(), "stargazersUrl", null);
        setField(term291252, term291252.getClass(), "contributorsUrl", null);
        setField(term291252, term291252.getClass(), "subscribersUrl", null);
        setField(term291252, term291252.getClass(), "subscriptionUrl", null);
        setField(term291252, term291252.getClass(), "commitsUrl", null);
        setField(term291252, term291252.getClass(), "gitCommitsUrl", null);
        setField(term291252, term291252.getClass(), "commentsUrl", null);
        setField(term291252, term291252.getClass(), "issueCommentUrl", null);
        setField(term291252, term291252.getClass(), "contentsUrl", null);
        setField(term291252, term291252.getClass(), "compareUrl", null);
        setField(term291252, term291252.getClass(), "mergesUrl", null);
        setField(term291252, term291252.getClass(), "archiveUrl", null);
        setField(term291252, term291252.getClass(), "downloadsUrl", null);
        setField(term291252, term291252.getClass(), "issuesUrl", null);
        setField(term291252, term291252.getClass(), "pullsUrl", null);
        setField(term291252, term291252.getClass(), "milestonesUrl", null);
        setField(term291252, term291252.getClass(), "notificationsUrl", null);
        setField(term291252, term291252.getClass(), "labelsUrl", null);
        setField(term291252, term291252.getClass(), "releasesUrl", null);
        setField(term291252, term291252.getClass(), "deploymentsUrl", null);
        setField(term291252, term291252.getClass(), "createdAt", null);
        setField(term291252, term291252.getClass(), "updatedAt", null);
        setField(term291252, term291252.getClass(), "pushedAt", null);
        setField(term291252, term291252.getClass(), "gitUrl", null);
        setField(term291252, term291252.getClass(), "sshUrl", null);
        setField(term291252, term291252.getClass(), "cloneUrl", null);
        setField(term291252, term291252.getClass(), "svnUrl", null);
        setField(term291252, term291252.getClass(), "homepage", null);
        setField(term291252, term291252.getClass(), "size", null);
        setField(term291252, term291252.getClass(), "stargazersCount", null);
        setField(term291252, term291252.getClass(), "watchersCount", null);
        setField(term291252, term291252.getClass(), "language", null);
        setField(term291252, term291252.getClass(), "hasIssues", null);
        setField(term291252, term291252.getClass(), "hasProjects", null);
        setField(term291252, term291252.getClass(), "hasDownloads", null);
        setField(term291252, term291252.getClass(), "hasWiki", null);
        setField(term291252, term291252.getClass(), "hasPages", null);
        setField(term291252, term291252.getClass(), "forksCount", null);
        setField(term291252, term291252.getClass(), "archived", null);
        setField(term291252, term291252.getClass(), "disabled", null);
        setField(term291252, term291252.getClass(), "openIssuesCount", null);
        setField(term291252, term291252.getClass(), "license", null);
        setField(term291252, term291252.getClass(), "allowForking", null);
        setField(term291252, term291252.getClass(), "isTemplate", null);
        setField(term291252, term291252.getClass(), "topics", null);
        setField(term291252, term291252.getClass(), "visibility", null);
        setField(term291252, term291252.getClass(), "forks", null);
        setField(term291252, term291252.getClass(), "openIssues", null);
        setField(term291252, term291252.getClass(), "watchers", null);
        setField(term291252, term291252.getClass(), "defaultBranch", null);
        setField(term291252, term291252.getClass(), "networkCount", null);
        setField(term291252, term291252.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompareUrl", argTypes, term291252, args);
    }

};


