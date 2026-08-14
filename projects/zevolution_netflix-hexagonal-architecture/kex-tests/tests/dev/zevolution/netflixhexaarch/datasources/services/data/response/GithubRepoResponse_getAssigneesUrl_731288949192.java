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

public class GithubRepoResponse_getAssigneesUrl_731288949192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291215;

    public GithubRepoResponse_getAssigneesUrl_731288949192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291215 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291215, term291215.getClass(), "id", null);
        setField(term291215, term291215.getClass(), "nodeId", null);
        setField(term291215, term291215.getClass(), "name", null);
        setField(term291215, term291215.getClass(), "fullName", null);
        setField(term291215, term291215.getClass(), "_private", null);
        setField(term291215, term291215.getClass(), "owner", null);
        setField(term291215, term291215.getClass(), "htmlUrl", null);
        setField(term291215, term291215.getClass(), "description", null);
        setField(term291215, term291215.getClass(), "fork", null);
        setField(term291215, term291215.getClass(), "url", null);
        setField(term291215, term291215.getClass(), "forksUrl", null);
        setField(term291215, term291215.getClass(), "keysUrl", null);
        setField(term291215, term291215.getClass(), "collaboratorsUrl", null);
        setField(term291215, term291215.getClass(), "teamsUrl", null);
        setField(term291215, term291215.getClass(), "hooksUrl", null);
        setField(term291215, term291215.getClass(), "issueEventsUrl", null);
        setField(term291215, term291215.getClass(), "eventsUrl", null);
        setField(term291215, term291215.getClass(), "assigneesUrl", null);
        setField(term291215, term291215.getClass(), "branchesUrl", null);
        setField(term291215, term291215.getClass(), "tagsUrl", null);
        setField(term291215, term291215.getClass(), "blobsUrl", null);
        setField(term291215, term291215.getClass(), "gitTagsUrl", null);
        setField(term291215, term291215.getClass(), "gitRefsUrl", null);
        setField(term291215, term291215.getClass(), "treesUrl", null);
        setField(term291215, term291215.getClass(), "statusesUrl", null);
        setField(term291215, term291215.getClass(), "languagesUrl", null);
        setField(term291215, term291215.getClass(), "stargazersUrl", null);
        setField(term291215, term291215.getClass(), "contributorsUrl", null);
        setField(term291215, term291215.getClass(), "subscribersUrl", null);
        setField(term291215, term291215.getClass(), "subscriptionUrl", null);
        setField(term291215, term291215.getClass(), "commitsUrl", null);
        setField(term291215, term291215.getClass(), "gitCommitsUrl", null);
        setField(term291215, term291215.getClass(), "commentsUrl", null);
        setField(term291215, term291215.getClass(), "issueCommentUrl", null);
        setField(term291215, term291215.getClass(), "contentsUrl", null);
        setField(term291215, term291215.getClass(), "compareUrl", null);
        setField(term291215, term291215.getClass(), "mergesUrl", null);
        setField(term291215, term291215.getClass(), "archiveUrl", null);
        setField(term291215, term291215.getClass(), "downloadsUrl", null);
        setField(term291215, term291215.getClass(), "issuesUrl", null);
        setField(term291215, term291215.getClass(), "pullsUrl", null);
        setField(term291215, term291215.getClass(), "milestonesUrl", null);
        setField(term291215, term291215.getClass(), "notificationsUrl", null);
        setField(term291215, term291215.getClass(), "labelsUrl", null);
        setField(term291215, term291215.getClass(), "releasesUrl", null);
        setField(term291215, term291215.getClass(), "deploymentsUrl", null);
        setField(term291215, term291215.getClass(), "createdAt", null);
        setField(term291215, term291215.getClass(), "updatedAt", null);
        setField(term291215, term291215.getClass(), "pushedAt", null);
        setField(term291215, term291215.getClass(), "gitUrl", null);
        setField(term291215, term291215.getClass(), "sshUrl", null);
        setField(term291215, term291215.getClass(), "cloneUrl", null);
        setField(term291215, term291215.getClass(), "svnUrl", null);
        setField(term291215, term291215.getClass(), "homepage", null);
        setField(term291215, term291215.getClass(), "size", null);
        setField(term291215, term291215.getClass(), "stargazersCount", null);
        setField(term291215, term291215.getClass(), "watchersCount", null);
        setField(term291215, term291215.getClass(), "language", null);
        setField(term291215, term291215.getClass(), "hasIssues", null);
        setField(term291215, term291215.getClass(), "hasProjects", null);
        setField(term291215, term291215.getClass(), "hasDownloads", null);
        setField(term291215, term291215.getClass(), "hasWiki", null);
        setField(term291215, term291215.getClass(), "hasPages", null);
        setField(term291215, term291215.getClass(), "forksCount", null);
        setField(term291215, term291215.getClass(), "archived", null);
        setField(term291215, term291215.getClass(), "disabled", null);
        setField(term291215, term291215.getClass(), "openIssuesCount", null);
        setField(term291215, term291215.getClass(), "license", null);
        setField(term291215, term291215.getClass(), "allowForking", null);
        setField(term291215, term291215.getClass(), "isTemplate", null);
        setField(term291215, term291215.getClass(), "topics", null);
        setField(term291215, term291215.getClass(), "visibility", null);
        setField(term291215, term291215.getClass(), "forks", null);
        setField(term291215, term291215.getClass(), "openIssues", null);
        setField(term291215, term291215.getClass(), "watchers", null);
        setField(term291215, term291215.getClass(), "defaultBranch", null);
        setField(term291215, term291215.getClass(), "networkCount", null);
        setField(term291215, term291215.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssigneesUrl", argTypes, term291215, args);
    }

};


