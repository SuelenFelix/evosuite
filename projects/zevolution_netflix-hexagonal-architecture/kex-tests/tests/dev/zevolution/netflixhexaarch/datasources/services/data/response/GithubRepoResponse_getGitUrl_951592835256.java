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

public class GithubRepoResponse_getGitUrl_951592835256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291279;

    public GithubRepoResponse_getGitUrl_951592835256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291279 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291279, term291279.getClass(), "id", null);
        setField(term291279, term291279.getClass(), "nodeId", null);
        setField(term291279, term291279.getClass(), "name", null);
        setField(term291279, term291279.getClass(), "fullName", null);
        setField(term291279, term291279.getClass(), "_private", null);
        setField(term291279, term291279.getClass(), "owner", null);
        setField(term291279, term291279.getClass(), "htmlUrl", null);
        setField(term291279, term291279.getClass(), "description", null);
        setField(term291279, term291279.getClass(), "fork", null);
        setField(term291279, term291279.getClass(), "url", null);
        setField(term291279, term291279.getClass(), "forksUrl", null);
        setField(term291279, term291279.getClass(), "keysUrl", null);
        setField(term291279, term291279.getClass(), "collaboratorsUrl", null);
        setField(term291279, term291279.getClass(), "teamsUrl", null);
        setField(term291279, term291279.getClass(), "hooksUrl", null);
        setField(term291279, term291279.getClass(), "issueEventsUrl", null);
        setField(term291279, term291279.getClass(), "eventsUrl", null);
        setField(term291279, term291279.getClass(), "assigneesUrl", null);
        setField(term291279, term291279.getClass(), "branchesUrl", null);
        setField(term291279, term291279.getClass(), "tagsUrl", null);
        setField(term291279, term291279.getClass(), "blobsUrl", null);
        setField(term291279, term291279.getClass(), "gitTagsUrl", null);
        setField(term291279, term291279.getClass(), "gitRefsUrl", null);
        setField(term291279, term291279.getClass(), "treesUrl", null);
        setField(term291279, term291279.getClass(), "statusesUrl", null);
        setField(term291279, term291279.getClass(), "languagesUrl", null);
        setField(term291279, term291279.getClass(), "stargazersUrl", null);
        setField(term291279, term291279.getClass(), "contributorsUrl", null);
        setField(term291279, term291279.getClass(), "subscribersUrl", null);
        setField(term291279, term291279.getClass(), "subscriptionUrl", null);
        setField(term291279, term291279.getClass(), "commitsUrl", null);
        setField(term291279, term291279.getClass(), "gitCommitsUrl", null);
        setField(term291279, term291279.getClass(), "commentsUrl", null);
        setField(term291279, term291279.getClass(), "issueCommentUrl", null);
        setField(term291279, term291279.getClass(), "contentsUrl", null);
        setField(term291279, term291279.getClass(), "compareUrl", null);
        setField(term291279, term291279.getClass(), "mergesUrl", null);
        setField(term291279, term291279.getClass(), "archiveUrl", null);
        setField(term291279, term291279.getClass(), "downloadsUrl", null);
        setField(term291279, term291279.getClass(), "issuesUrl", null);
        setField(term291279, term291279.getClass(), "pullsUrl", null);
        setField(term291279, term291279.getClass(), "milestonesUrl", null);
        setField(term291279, term291279.getClass(), "notificationsUrl", null);
        setField(term291279, term291279.getClass(), "labelsUrl", null);
        setField(term291279, term291279.getClass(), "releasesUrl", null);
        setField(term291279, term291279.getClass(), "deploymentsUrl", null);
        setField(term291279, term291279.getClass(), "createdAt", null);
        setField(term291279, term291279.getClass(), "updatedAt", null);
        setField(term291279, term291279.getClass(), "pushedAt", null);
        setField(term291279, term291279.getClass(), "gitUrl", null);
        setField(term291279, term291279.getClass(), "sshUrl", null);
        setField(term291279, term291279.getClass(), "cloneUrl", null);
        setField(term291279, term291279.getClass(), "svnUrl", null);
        setField(term291279, term291279.getClass(), "homepage", null);
        setField(term291279, term291279.getClass(), "size", null);
        setField(term291279, term291279.getClass(), "stargazersCount", null);
        setField(term291279, term291279.getClass(), "watchersCount", null);
        setField(term291279, term291279.getClass(), "language", null);
        setField(term291279, term291279.getClass(), "hasIssues", null);
        setField(term291279, term291279.getClass(), "hasProjects", null);
        setField(term291279, term291279.getClass(), "hasDownloads", null);
        setField(term291279, term291279.getClass(), "hasWiki", null);
        setField(term291279, term291279.getClass(), "hasPages", null);
        setField(term291279, term291279.getClass(), "forksCount", null);
        setField(term291279, term291279.getClass(), "archived", null);
        setField(term291279, term291279.getClass(), "disabled", null);
        setField(term291279, term291279.getClass(), "openIssuesCount", null);
        setField(term291279, term291279.getClass(), "license", null);
        setField(term291279, term291279.getClass(), "allowForking", null);
        setField(term291279, term291279.getClass(), "isTemplate", null);
        setField(term291279, term291279.getClass(), "topics", null);
        setField(term291279, term291279.getClass(), "visibility", null);
        setField(term291279, term291279.getClass(), "forks", null);
        setField(term291279, term291279.getClass(), "openIssues", null);
        setField(term291279, term291279.getClass(), "watchers", null);
        setField(term291279, term291279.getClass(), "defaultBranch", null);
        setField(term291279, term291279.getClass(), "networkCount", null);
        setField(term291279, term291279.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitUrl", argTypes, term291279, args);
    }

};


