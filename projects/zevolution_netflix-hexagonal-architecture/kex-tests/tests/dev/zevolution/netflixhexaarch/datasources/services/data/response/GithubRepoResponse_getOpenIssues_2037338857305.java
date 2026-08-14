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

public class GithubRepoResponse_getOpenIssues_2037338857305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291328;

    public GithubRepoResponse_getOpenIssues_2037338857305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291328 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291328, term291328.getClass(), "id", null);
        setField(term291328, term291328.getClass(), "nodeId", null);
        setField(term291328, term291328.getClass(), "name", null);
        setField(term291328, term291328.getClass(), "fullName", null);
        setField(term291328, term291328.getClass(), "_private", null);
        setField(term291328, term291328.getClass(), "owner", null);
        setField(term291328, term291328.getClass(), "htmlUrl", null);
        setField(term291328, term291328.getClass(), "description", null);
        setField(term291328, term291328.getClass(), "fork", null);
        setField(term291328, term291328.getClass(), "url", null);
        setField(term291328, term291328.getClass(), "forksUrl", null);
        setField(term291328, term291328.getClass(), "keysUrl", null);
        setField(term291328, term291328.getClass(), "collaboratorsUrl", null);
        setField(term291328, term291328.getClass(), "teamsUrl", null);
        setField(term291328, term291328.getClass(), "hooksUrl", null);
        setField(term291328, term291328.getClass(), "issueEventsUrl", null);
        setField(term291328, term291328.getClass(), "eventsUrl", null);
        setField(term291328, term291328.getClass(), "assigneesUrl", null);
        setField(term291328, term291328.getClass(), "branchesUrl", null);
        setField(term291328, term291328.getClass(), "tagsUrl", null);
        setField(term291328, term291328.getClass(), "blobsUrl", null);
        setField(term291328, term291328.getClass(), "gitTagsUrl", null);
        setField(term291328, term291328.getClass(), "gitRefsUrl", null);
        setField(term291328, term291328.getClass(), "treesUrl", null);
        setField(term291328, term291328.getClass(), "statusesUrl", null);
        setField(term291328, term291328.getClass(), "languagesUrl", null);
        setField(term291328, term291328.getClass(), "stargazersUrl", null);
        setField(term291328, term291328.getClass(), "contributorsUrl", null);
        setField(term291328, term291328.getClass(), "subscribersUrl", null);
        setField(term291328, term291328.getClass(), "subscriptionUrl", null);
        setField(term291328, term291328.getClass(), "commitsUrl", null);
        setField(term291328, term291328.getClass(), "gitCommitsUrl", null);
        setField(term291328, term291328.getClass(), "commentsUrl", null);
        setField(term291328, term291328.getClass(), "issueCommentUrl", null);
        setField(term291328, term291328.getClass(), "contentsUrl", null);
        setField(term291328, term291328.getClass(), "compareUrl", null);
        setField(term291328, term291328.getClass(), "mergesUrl", null);
        setField(term291328, term291328.getClass(), "archiveUrl", null);
        setField(term291328, term291328.getClass(), "downloadsUrl", null);
        setField(term291328, term291328.getClass(), "issuesUrl", null);
        setField(term291328, term291328.getClass(), "pullsUrl", null);
        setField(term291328, term291328.getClass(), "milestonesUrl", null);
        setField(term291328, term291328.getClass(), "notificationsUrl", null);
        setField(term291328, term291328.getClass(), "labelsUrl", null);
        setField(term291328, term291328.getClass(), "releasesUrl", null);
        setField(term291328, term291328.getClass(), "deploymentsUrl", null);
        setField(term291328, term291328.getClass(), "createdAt", null);
        setField(term291328, term291328.getClass(), "updatedAt", null);
        setField(term291328, term291328.getClass(), "pushedAt", null);
        setField(term291328, term291328.getClass(), "gitUrl", null);
        setField(term291328, term291328.getClass(), "sshUrl", null);
        setField(term291328, term291328.getClass(), "cloneUrl", null);
        setField(term291328, term291328.getClass(), "svnUrl", null);
        setField(term291328, term291328.getClass(), "homepage", null);
        setField(term291328, term291328.getClass(), "size", null);
        setField(term291328, term291328.getClass(), "stargazersCount", null);
        setField(term291328, term291328.getClass(), "watchersCount", null);
        setField(term291328, term291328.getClass(), "language", null);
        setField(term291328, term291328.getClass(), "hasIssues", null);
        setField(term291328, term291328.getClass(), "hasProjects", null);
        setField(term291328, term291328.getClass(), "hasDownloads", null);
        setField(term291328, term291328.getClass(), "hasWiki", null);
        setField(term291328, term291328.getClass(), "hasPages", null);
        setField(term291328, term291328.getClass(), "forksCount", null);
        setField(term291328, term291328.getClass(), "archived", null);
        setField(term291328, term291328.getClass(), "disabled", null);
        setField(term291328, term291328.getClass(), "openIssuesCount", null);
        setField(term291328, term291328.getClass(), "license", null);
        setField(term291328, term291328.getClass(), "allowForking", null);
        setField(term291328, term291328.getClass(), "isTemplate", null);
        setField(term291328, term291328.getClass(), "topics", null);
        setField(term291328, term291328.getClass(), "visibility", null);
        setField(term291328, term291328.getClass(), "forks", null);
        setField(term291328, term291328.getClass(), "openIssues", null);
        setField(term291328, term291328.getClass(), "watchers", null);
        setField(term291328, term291328.getClass(), "defaultBranch", null);
        setField(term291328, term291328.getClass(), "networkCount", null);
        setField(term291328, term291328.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpenIssues", argTypes, term291328, args);
    }

};


