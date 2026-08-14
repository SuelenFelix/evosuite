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

public class GithubRepoResponse_getBranchesUrl_257041427194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291217;

    public GithubRepoResponse_getBranchesUrl_257041427194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291217 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291217, term291217.getClass(), "id", null);
        setField(term291217, term291217.getClass(), "nodeId", null);
        setField(term291217, term291217.getClass(), "name", null);
        setField(term291217, term291217.getClass(), "fullName", null);
        setField(term291217, term291217.getClass(), "_private", null);
        setField(term291217, term291217.getClass(), "owner", null);
        setField(term291217, term291217.getClass(), "htmlUrl", null);
        setField(term291217, term291217.getClass(), "description", null);
        setField(term291217, term291217.getClass(), "fork", null);
        setField(term291217, term291217.getClass(), "url", null);
        setField(term291217, term291217.getClass(), "forksUrl", null);
        setField(term291217, term291217.getClass(), "keysUrl", null);
        setField(term291217, term291217.getClass(), "collaboratorsUrl", null);
        setField(term291217, term291217.getClass(), "teamsUrl", null);
        setField(term291217, term291217.getClass(), "hooksUrl", null);
        setField(term291217, term291217.getClass(), "issueEventsUrl", null);
        setField(term291217, term291217.getClass(), "eventsUrl", null);
        setField(term291217, term291217.getClass(), "assigneesUrl", null);
        setField(term291217, term291217.getClass(), "branchesUrl", null);
        setField(term291217, term291217.getClass(), "tagsUrl", null);
        setField(term291217, term291217.getClass(), "blobsUrl", null);
        setField(term291217, term291217.getClass(), "gitTagsUrl", null);
        setField(term291217, term291217.getClass(), "gitRefsUrl", null);
        setField(term291217, term291217.getClass(), "treesUrl", null);
        setField(term291217, term291217.getClass(), "statusesUrl", null);
        setField(term291217, term291217.getClass(), "languagesUrl", null);
        setField(term291217, term291217.getClass(), "stargazersUrl", null);
        setField(term291217, term291217.getClass(), "contributorsUrl", null);
        setField(term291217, term291217.getClass(), "subscribersUrl", null);
        setField(term291217, term291217.getClass(), "subscriptionUrl", null);
        setField(term291217, term291217.getClass(), "commitsUrl", null);
        setField(term291217, term291217.getClass(), "gitCommitsUrl", null);
        setField(term291217, term291217.getClass(), "commentsUrl", null);
        setField(term291217, term291217.getClass(), "issueCommentUrl", null);
        setField(term291217, term291217.getClass(), "contentsUrl", null);
        setField(term291217, term291217.getClass(), "compareUrl", null);
        setField(term291217, term291217.getClass(), "mergesUrl", null);
        setField(term291217, term291217.getClass(), "archiveUrl", null);
        setField(term291217, term291217.getClass(), "downloadsUrl", null);
        setField(term291217, term291217.getClass(), "issuesUrl", null);
        setField(term291217, term291217.getClass(), "pullsUrl", null);
        setField(term291217, term291217.getClass(), "milestonesUrl", null);
        setField(term291217, term291217.getClass(), "notificationsUrl", null);
        setField(term291217, term291217.getClass(), "labelsUrl", null);
        setField(term291217, term291217.getClass(), "releasesUrl", null);
        setField(term291217, term291217.getClass(), "deploymentsUrl", null);
        setField(term291217, term291217.getClass(), "createdAt", null);
        setField(term291217, term291217.getClass(), "updatedAt", null);
        setField(term291217, term291217.getClass(), "pushedAt", null);
        setField(term291217, term291217.getClass(), "gitUrl", null);
        setField(term291217, term291217.getClass(), "sshUrl", null);
        setField(term291217, term291217.getClass(), "cloneUrl", null);
        setField(term291217, term291217.getClass(), "svnUrl", null);
        setField(term291217, term291217.getClass(), "homepage", null);
        setField(term291217, term291217.getClass(), "size", null);
        setField(term291217, term291217.getClass(), "stargazersCount", null);
        setField(term291217, term291217.getClass(), "watchersCount", null);
        setField(term291217, term291217.getClass(), "language", null);
        setField(term291217, term291217.getClass(), "hasIssues", null);
        setField(term291217, term291217.getClass(), "hasProjects", null);
        setField(term291217, term291217.getClass(), "hasDownloads", null);
        setField(term291217, term291217.getClass(), "hasWiki", null);
        setField(term291217, term291217.getClass(), "hasPages", null);
        setField(term291217, term291217.getClass(), "forksCount", null);
        setField(term291217, term291217.getClass(), "archived", null);
        setField(term291217, term291217.getClass(), "disabled", null);
        setField(term291217, term291217.getClass(), "openIssuesCount", null);
        setField(term291217, term291217.getClass(), "license", null);
        setField(term291217, term291217.getClass(), "allowForking", null);
        setField(term291217, term291217.getClass(), "isTemplate", null);
        setField(term291217, term291217.getClass(), "topics", null);
        setField(term291217, term291217.getClass(), "visibility", null);
        setField(term291217, term291217.getClass(), "forks", null);
        setField(term291217, term291217.getClass(), "openIssues", null);
        setField(term291217, term291217.getClass(), "watchers", null);
        setField(term291217, term291217.getClass(), "defaultBranch", null);
        setField(term291217, term291217.getClass(), "networkCount", null);
        setField(term291217, term291217.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBranchesUrl", argTypes, term291217, args);
    }

};


