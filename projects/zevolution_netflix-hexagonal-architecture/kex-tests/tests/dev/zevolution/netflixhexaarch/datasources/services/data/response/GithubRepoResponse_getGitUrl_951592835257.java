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

public class GithubRepoResponse_getGitUrl_951592835257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291280;

    public GithubRepoResponse_getGitUrl_951592835257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291280 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291280, term291280.getClass(), "id", null);
        setField(term291280, term291280.getClass(), "nodeId", null);
        setField(term291280, term291280.getClass(), "name", null);
        setField(term291280, term291280.getClass(), "fullName", null);
        setField(term291280, term291280.getClass(), "_private", null);
        setField(term291280, term291280.getClass(), "owner", null);
        setField(term291280, term291280.getClass(), "htmlUrl", null);
        setField(term291280, term291280.getClass(), "description", null);
        setField(term291280, term291280.getClass(), "fork", null);
        setField(term291280, term291280.getClass(), "url", null);
        setField(term291280, term291280.getClass(), "forksUrl", null);
        setField(term291280, term291280.getClass(), "keysUrl", null);
        setField(term291280, term291280.getClass(), "collaboratorsUrl", null);
        setField(term291280, term291280.getClass(), "teamsUrl", null);
        setField(term291280, term291280.getClass(), "hooksUrl", null);
        setField(term291280, term291280.getClass(), "issueEventsUrl", null);
        setField(term291280, term291280.getClass(), "eventsUrl", null);
        setField(term291280, term291280.getClass(), "assigneesUrl", null);
        setField(term291280, term291280.getClass(), "branchesUrl", null);
        setField(term291280, term291280.getClass(), "tagsUrl", null);
        setField(term291280, term291280.getClass(), "blobsUrl", null);
        setField(term291280, term291280.getClass(), "gitTagsUrl", null);
        setField(term291280, term291280.getClass(), "gitRefsUrl", null);
        setField(term291280, term291280.getClass(), "treesUrl", null);
        setField(term291280, term291280.getClass(), "statusesUrl", null);
        setField(term291280, term291280.getClass(), "languagesUrl", null);
        setField(term291280, term291280.getClass(), "stargazersUrl", null);
        setField(term291280, term291280.getClass(), "contributorsUrl", null);
        setField(term291280, term291280.getClass(), "subscribersUrl", null);
        setField(term291280, term291280.getClass(), "subscriptionUrl", null);
        setField(term291280, term291280.getClass(), "commitsUrl", null);
        setField(term291280, term291280.getClass(), "gitCommitsUrl", null);
        setField(term291280, term291280.getClass(), "commentsUrl", null);
        setField(term291280, term291280.getClass(), "issueCommentUrl", null);
        setField(term291280, term291280.getClass(), "contentsUrl", null);
        setField(term291280, term291280.getClass(), "compareUrl", null);
        setField(term291280, term291280.getClass(), "mergesUrl", null);
        setField(term291280, term291280.getClass(), "archiveUrl", null);
        setField(term291280, term291280.getClass(), "downloadsUrl", null);
        setField(term291280, term291280.getClass(), "issuesUrl", null);
        setField(term291280, term291280.getClass(), "pullsUrl", null);
        setField(term291280, term291280.getClass(), "milestonesUrl", null);
        setField(term291280, term291280.getClass(), "notificationsUrl", null);
        setField(term291280, term291280.getClass(), "labelsUrl", null);
        setField(term291280, term291280.getClass(), "releasesUrl", null);
        setField(term291280, term291280.getClass(), "deploymentsUrl", null);
        setField(term291280, term291280.getClass(), "createdAt", null);
        setField(term291280, term291280.getClass(), "updatedAt", null);
        setField(term291280, term291280.getClass(), "pushedAt", null);
        setField(term291280, term291280.getClass(), "gitUrl", null);
        setField(term291280, term291280.getClass(), "sshUrl", null);
        setField(term291280, term291280.getClass(), "cloneUrl", null);
        setField(term291280, term291280.getClass(), "svnUrl", null);
        setField(term291280, term291280.getClass(), "homepage", null);
        setField(term291280, term291280.getClass(), "size", null);
        setField(term291280, term291280.getClass(), "stargazersCount", null);
        setField(term291280, term291280.getClass(), "watchersCount", null);
        setField(term291280, term291280.getClass(), "language", null);
        setField(term291280, term291280.getClass(), "hasIssues", null);
        setField(term291280, term291280.getClass(), "hasProjects", null);
        setField(term291280, term291280.getClass(), "hasDownloads", null);
        setField(term291280, term291280.getClass(), "hasWiki", null);
        setField(term291280, term291280.getClass(), "hasPages", null);
        setField(term291280, term291280.getClass(), "forksCount", null);
        setField(term291280, term291280.getClass(), "archived", null);
        setField(term291280, term291280.getClass(), "disabled", null);
        setField(term291280, term291280.getClass(), "openIssuesCount", null);
        setField(term291280, term291280.getClass(), "license", null);
        setField(term291280, term291280.getClass(), "allowForking", null);
        setField(term291280, term291280.getClass(), "isTemplate", null);
        setField(term291280, term291280.getClass(), "topics", null);
        setField(term291280, term291280.getClass(), "visibility", null);
        setField(term291280, term291280.getClass(), "forks", null);
        setField(term291280, term291280.getClass(), "openIssues", null);
        setField(term291280, term291280.getClass(), "watchers", null);
        setField(term291280, term291280.getClass(), "defaultBranch", null);
        setField(term291280, term291280.getClass(), "networkCount", null);
        setField(term291280, term291280.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitUrl", argTypes, term291280, args);
    }

};


