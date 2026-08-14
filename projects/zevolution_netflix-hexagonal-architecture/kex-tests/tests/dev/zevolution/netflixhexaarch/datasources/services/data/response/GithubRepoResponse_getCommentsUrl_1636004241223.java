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

public class GithubRepoResponse_getCommentsUrl_1636004241223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291246;

    public GithubRepoResponse_getCommentsUrl_1636004241223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291246 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291246, term291246.getClass(), "id", null);
        setField(term291246, term291246.getClass(), "nodeId", null);
        setField(term291246, term291246.getClass(), "name", null);
        setField(term291246, term291246.getClass(), "fullName", null);
        setField(term291246, term291246.getClass(), "_private", null);
        setField(term291246, term291246.getClass(), "owner", null);
        setField(term291246, term291246.getClass(), "htmlUrl", null);
        setField(term291246, term291246.getClass(), "description", null);
        setField(term291246, term291246.getClass(), "fork", null);
        setField(term291246, term291246.getClass(), "url", null);
        setField(term291246, term291246.getClass(), "forksUrl", null);
        setField(term291246, term291246.getClass(), "keysUrl", null);
        setField(term291246, term291246.getClass(), "collaboratorsUrl", null);
        setField(term291246, term291246.getClass(), "teamsUrl", null);
        setField(term291246, term291246.getClass(), "hooksUrl", null);
        setField(term291246, term291246.getClass(), "issueEventsUrl", null);
        setField(term291246, term291246.getClass(), "eventsUrl", null);
        setField(term291246, term291246.getClass(), "assigneesUrl", null);
        setField(term291246, term291246.getClass(), "branchesUrl", null);
        setField(term291246, term291246.getClass(), "tagsUrl", null);
        setField(term291246, term291246.getClass(), "blobsUrl", null);
        setField(term291246, term291246.getClass(), "gitTagsUrl", null);
        setField(term291246, term291246.getClass(), "gitRefsUrl", null);
        setField(term291246, term291246.getClass(), "treesUrl", null);
        setField(term291246, term291246.getClass(), "statusesUrl", null);
        setField(term291246, term291246.getClass(), "languagesUrl", null);
        setField(term291246, term291246.getClass(), "stargazersUrl", null);
        setField(term291246, term291246.getClass(), "contributorsUrl", null);
        setField(term291246, term291246.getClass(), "subscribersUrl", null);
        setField(term291246, term291246.getClass(), "subscriptionUrl", null);
        setField(term291246, term291246.getClass(), "commitsUrl", null);
        setField(term291246, term291246.getClass(), "gitCommitsUrl", null);
        setField(term291246, term291246.getClass(), "commentsUrl", null);
        setField(term291246, term291246.getClass(), "issueCommentUrl", null);
        setField(term291246, term291246.getClass(), "contentsUrl", null);
        setField(term291246, term291246.getClass(), "compareUrl", null);
        setField(term291246, term291246.getClass(), "mergesUrl", null);
        setField(term291246, term291246.getClass(), "archiveUrl", null);
        setField(term291246, term291246.getClass(), "downloadsUrl", null);
        setField(term291246, term291246.getClass(), "issuesUrl", null);
        setField(term291246, term291246.getClass(), "pullsUrl", null);
        setField(term291246, term291246.getClass(), "milestonesUrl", null);
        setField(term291246, term291246.getClass(), "notificationsUrl", null);
        setField(term291246, term291246.getClass(), "labelsUrl", null);
        setField(term291246, term291246.getClass(), "releasesUrl", null);
        setField(term291246, term291246.getClass(), "deploymentsUrl", null);
        setField(term291246, term291246.getClass(), "createdAt", null);
        setField(term291246, term291246.getClass(), "updatedAt", null);
        setField(term291246, term291246.getClass(), "pushedAt", null);
        setField(term291246, term291246.getClass(), "gitUrl", null);
        setField(term291246, term291246.getClass(), "sshUrl", null);
        setField(term291246, term291246.getClass(), "cloneUrl", null);
        setField(term291246, term291246.getClass(), "svnUrl", null);
        setField(term291246, term291246.getClass(), "homepage", null);
        setField(term291246, term291246.getClass(), "size", null);
        setField(term291246, term291246.getClass(), "stargazersCount", null);
        setField(term291246, term291246.getClass(), "watchersCount", null);
        setField(term291246, term291246.getClass(), "language", null);
        setField(term291246, term291246.getClass(), "hasIssues", null);
        setField(term291246, term291246.getClass(), "hasProjects", null);
        setField(term291246, term291246.getClass(), "hasDownloads", null);
        setField(term291246, term291246.getClass(), "hasWiki", null);
        setField(term291246, term291246.getClass(), "hasPages", null);
        setField(term291246, term291246.getClass(), "forksCount", null);
        setField(term291246, term291246.getClass(), "archived", null);
        setField(term291246, term291246.getClass(), "disabled", null);
        setField(term291246, term291246.getClass(), "openIssuesCount", null);
        setField(term291246, term291246.getClass(), "license", null);
        setField(term291246, term291246.getClass(), "allowForking", null);
        setField(term291246, term291246.getClass(), "isTemplate", null);
        setField(term291246, term291246.getClass(), "topics", null);
        setField(term291246, term291246.getClass(), "visibility", null);
        setField(term291246, term291246.getClass(), "forks", null);
        setField(term291246, term291246.getClass(), "openIssues", null);
        setField(term291246, term291246.getClass(), "watchers", null);
        setField(term291246, term291246.getClass(), "defaultBranch", null);
        setField(term291246, term291246.getClass(), "networkCount", null);
        setField(term291246, term291246.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommentsUrl", argTypes, term291246, args);
    }

};


