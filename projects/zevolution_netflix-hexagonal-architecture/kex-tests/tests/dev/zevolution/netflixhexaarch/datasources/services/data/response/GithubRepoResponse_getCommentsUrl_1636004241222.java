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

public class GithubRepoResponse_getCommentsUrl_1636004241222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291245;

    public GithubRepoResponse_getCommentsUrl_1636004241222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291245 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291245, term291245.getClass(), "id", null);
        setField(term291245, term291245.getClass(), "nodeId", null);
        setField(term291245, term291245.getClass(), "name", null);
        setField(term291245, term291245.getClass(), "fullName", null);
        setField(term291245, term291245.getClass(), "_private", null);
        setField(term291245, term291245.getClass(), "owner", null);
        setField(term291245, term291245.getClass(), "htmlUrl", null);
        setField(term291245, term291245.getClass(), "description", null);
        setField(term291245, term291245.getClass(), "fork", null);
        setField(term291245, term291245.getClass(), "url", null);
        setField(term291245, term291245.getClass(), "forksUrl", null);
        setField(term291245, term291245.getClass(), "keysUrl", null);
        setField(term291245, term291245.getClass(), "collaboratorsUrl", null);
        setField(term291245, term291245.getClass(), "teamsUrl", null);
        setField(term291245, term291245.getClass(), "hooksUrl", null);
        setField(term291245, term291245.getClass(), "issueEventsUrl", null);
        setField(term291245, term291245.getClass(), "eventsUrl", null);
        setField(term291245, term291245.getClass(), "assigneesUrl", null);
        setField(term291245, term291245.getClass(), "branchesUrl", null);
        setField(term291245, term291245.getClass(), "tagsUrl", null);
        setField(term291245, term291245.getClass(), "blobsUrl", null);
        setField(term291245, term291245.getClass(), "gitTagsUrl", null);
        setField(term291245, term291245.getClass(), "gitRefsUrl", null);
        setField(term291245, term291245.getClass(), "treesUrl", null);
        setField(term291245, term291245.getClass(), "statusesUrl", null);
        setField(term291245, term291245.getClass(), "languagesUrl", null);
        setField(term291245, term291245.getClass(), "stargazersUrl", null);
        setField(term291245, term291245.getClass(), "contributorsUrl", null);
        setField(term291245, term291245.getClass(), "subscribersUrl", null);
        setField(term291245, term291245.getClass(), "subscriptionUrl", null);
        setField(term291245, term291245.getClass(), "commitsUrl", null);
        setField(term291245, term291245.getClass(), "gitCommitsUrl", null);
        setField(term291245, term291245.getClass(), "commentsUrl", null);
        setField(term291245, term291245.getClass(), "issueCommentUrl", null);
        setField(term291245, term291245.getClass(), "contentsUrl", null);
        setField(term291245, term291245.getClass(), "compareUrl", null);
        setField(term291245, term291245.getClass(), "mergesUrl", null);
        setField(term291245, term291245.getClass(), "archiveUrl", null);
        setField(term291245, term291245.getClass(), "downloadsUrl", null);
        setField(term291245, term291245.getClass(), "issuesUrl", null);
        setField(term291245, term291245.getClass(), "pullsUrl", null);
        setField(term291245, term291245.getClass(), "milestonesUrl", null);
        setField(term291245, term291245.getClass(), "notificationsUrl", null);
        setField(term291245, term291245.getClass(), "labelsUrl", null);
        setField(term291245, term291245.getClass(), "releasesUrl", null);
        setField(term291245, term291245.getClass(), "deploymentsUrl", null);
        setField(term291245, term291245.getClass(), "createdAt", null);
        setField(term291245, term291245.getClass(), "updatedAt", null);
        setField(term291245, term291245.getClass(), "pushedAt", null);
        setField(term291245, term291245.getClass(), "gitUrl", null);
        setField(term291245, term291245.getClass(), "sshUrl", null);
        setField(term291245, term291245.getClass(), "cloneUrl", null);
        setField(term291245, term291245.getClass(), "svnUrl", null);
        setField(term291245, term291245.getClass(), "homepage", null);
        setField(term291245, term291245.getClass(), "size", null);
        setField(term291245, term291245.getClass(), "stargazersCount", null);
        setField(term291245, term291245.getClass(), "watchersCount", null);
        setField(term291245, term291245.getClass(), "language", null);
        setField(term291245, term291245.getClass(), "hasIssues", null);
        setField(term291245, term291245.getClass(), "hasProjects", null);
        setField(term291245, term291245.getClass(), "hasDownloads", null);
        setField(term291245, term291245.getClass(), "hasWiki", null);
        setField(term291245, term291245.getClass(), "hasPages", null);
        setField(term291245, term291245.getClass(), "forksCount", null);
        setField(term291245, term291245.getClass(), "archived", null);
        setField(term291245, term291245.getClass(), "disabled", null);
        setField(term291245, term291245.getClass(), "openIssuesCount", null);
        setField(term291245, term291245.getClass(), "license", null);
        setField(term291245, term291245.getClass(), "allowForking", null);
        setField(term291245, term291245.getClass(), "isTemplate", null);
        setField(term291245, term291245.getClass(), "topics", null);
        setField(term291245, term291245.getClass(), "visibility", null);
        setField(term291245, term291245.getClass(), "forks", null);
        setField(term291245, term291245.getClass(), "openIssues", null);
        setField(term291245, term291245.getClass(), "watchers", null);
        setField(term291245, term291245.getClass(), "defaultBranch", null);
        setField(term291245, term291245.getClass(), "networkCount", null);
        setField(term291245, term291245.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommentsUrl", argTypes, term291245, args);
    }

};


