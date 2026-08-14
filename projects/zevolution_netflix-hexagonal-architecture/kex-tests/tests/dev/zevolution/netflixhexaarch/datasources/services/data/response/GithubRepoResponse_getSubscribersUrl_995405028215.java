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

public class GithubRepoResponse_getSubscribersUrl_995405028215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291238;

    public GithubRepoResponse_getSubscribersUrl_995405028215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291238 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291238, term291238.getClass(), "id", null);
        setField(term291238, term291238.getClass(), "nodeId", null);
        setField(term291238, term291238.getClass(), "name", null);
        setField(term291238, term291238.getClass(), "fullName", null);
        setField(term291238, term291238.getClass(), "_private", null);
        setField(term291238, term291238.getClass(), "owner", null);
        setField(term291238, term291238.getClass(), "htmlUrl", null);
        setField(term291238, term291238.getClass(), "description", null);
        setField(term291238, term291238.getClass(), "fork", null);
        setField(term291238, term291238.getClass(), "url", null);
        setField(term291238, term291238.getClass(), "forksUrl", null);
        setField(term291238, term291238.getClass(), "keysUrl", null);
        setField(term291238, term291238.getClass(), "collaboratorsUrl", null);
        setField(term291238, term291238.getClass(), "teamsUrl", null);
        setField(term291238, term291238.getClass(), "hooksUrl", null);
        setField(term291238, term291238.getClass(), "issueEventsUrl", null);
        setField(term291238, term291238.getClass(), "eventsUrl", null);
        setField(term291238, term291238.getClass(), "assigneesUrl", null);
        setField(term291238, term291238.getClass(), "branchesUrl", null);
        setField(term291238, term291238.getClass(), "tagsUrl", null);
        setField(term291238, term291238.getClass(), "blobsUrl", null);
        setField(term291238, term291238.getClass(), "gitTagsUrl", null);
        setField(term291238, term291238.getClass(), "gitRefsUrl", null);
        setField(term291238, term291238.getClass(), "treesUrl", null);
        setField(term291238, term291238.getClass(), "statusesUrl", null);
        setField(term291238, term291238.getClass(), "languagesUrl", null);
        setField(term291238, term291238.getClass(), "stargazersUrl", null);
        setField(term291238, term291238.getClass(), "contributorsUrl", null);
        setField(term291238, term291238.getClass(), "subscribersUrl", null);
        setField(term291238, term291238.getClass(), "subscriptionUrl", null);
        setField(term291238, term291238.getClass(), "commitsUrl", null);
        setField(term291238, term291238.getClass(), "gitCommitsUrl", null);
        setField(term291238, term291238.getClass(), "commentsUrl", null);
        setField(term291238, term291238.getClass(), "issueCommentUrl", null);
        setField(term291238, term291238.getClass(), "contentsUrl", null);
        setField(term291238, term291238.getClass(), "compareUrl", null);
        setField(term291238, term291238.getClass(), "mergesUrl", null);
        setField(term291238, term291238.getClass(), "archiveUrl", null);
        setField(term291238, term291238.getClass(), "downloadsUrl", null);
        setField(term291238, term291238.getClass(), "issuesUrl", null);
        setField(term291238, term291238.getClass(), "pullsUrl", null);
        setField(term291238, term291238.getClass(), "milestonesUrl", null);
        setField(term291238, term291238.getClass(), "notificationsUrl", null);
        setField(term291238, term291238.getClass(), "labelsUrl", null);
        setField(term291238, term291238.getClass(), "releasesUrl", null);
        setField(term291238, term291238.getClass(), "deploymentsUrl", null);
        setField(term291238, term291238.getClass(), "createdAt", null);
        setField(term291238, term291238.getClass(), "updatedAt", null);
        setField(term291238, term291238.getClass(), "pushedAt", null);
        setField(term291238, term291238.getClass(), "gitUrl", null);
        setField(term291238, term291238.getClass(), "sshUrl", null);
        setField(term291238, term291238.getClass(), "cloneUrl", null);
        setField(term291238, term291238.getClass(), "svnUrl", null);
        setField(term291238, term291238.getClass(), "homepage", null);
        setField(term291238, term291238.getClass(), "size", null);
        setField(term291238, term291238.getClass(), "stargazersCount", null);
        setField(term291238, term291238.getClass(), "watchersCount", null);
        setField(term291238, term291238.getClass(), "language", null);
        setField(term291238, term291238.getClass(), "hasIssues", null);
        setField(term291238, term291238.getClass(), "hasProjects", null);
        setField(term291238, term291238.getClass(), "hasDownloads", null);
        setField(term291238, term291238.getClass(), "hasWiki", null);
        setField(term291238, term291238.getClass(), "hasPages", null);
        setField(term291238, term291238.getClass(), "forksCount", null);
        setField(term291238, term291238.getClass(), "archived", null);
        setField(term291238, term291238.getClass(), "disabled", null);
        setField(term291238, term291238.getClass(), "openIssuesCount", null);
        setField(term291238, term291238.getClass(), "license", null);
        setField(term291238, term291238.getClass(), "allowForking", null);
        setField(term291238, term291238.getClass(), "isTemplate", null);
        setField(term291238, term291238.getClass(), "topics", null);
        setField(term291238, term291238.getClass(), "visibility", null);
        setField(term291238, term291238.getClass(), "forks", null);
        setField(term291238, term291238.getClass(), "openIssues", null);
        setField(term291238, term291238.getClass(), "watchers", null);
        setField(term291238, term291238.getClass(), "defaultBranch", null);
        setField(term291238, term291238.getClass(), "networkCount", null);
        setField(term291238, term291238.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubscribersUrl", argTypes, term291238, args);
    }

};


