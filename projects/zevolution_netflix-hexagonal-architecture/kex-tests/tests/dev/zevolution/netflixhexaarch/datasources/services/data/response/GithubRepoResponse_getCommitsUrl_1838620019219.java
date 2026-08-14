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

public class GithubRepoResponse_getCommitsUrl_1838620019219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291242;

    public GithubRepoResponse_getCommitsUrl_1838620019219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291242 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291242, term291242.getClass(), "id", null);
        setField(term291242, term291242.getClass(), "nodeId", null);
        setField(term291242, term291242.getClass(), "name", null);
        setField(term291242, term291242.getClass(), "fullName", null);
        setField(term291242, term291242.getClass(), "_private", null);
        setField(term291242, term291242.getClass(), "owner", null);
        setField(term291242, term291242.getClass(), "htmlUrl", null);
        setField(term291242, term291242.getClass(), "description", null);
        setField(term291242, term291242.getClass(), "fork", null);
        setField(term291242, term291242.getClass(), "url", null);
        setField(term291242, term291242.getClass(), "forksUrl", null);
        setField(term291242, term291242.getClass(), "keysUrl", null);
        setField(term291242, term291242.getClass(), "collaboratorsUrl", null);
        setField(term291242, term291242.getClass(), "teamsUrl", null);
        setField(term291242, term291242.getClass(), "hooksUrl", null);
        setField(term291242, term291242.getClass(), "issueEventsUrl", null);
        setField(term291242, term291242.getClass(), "eventsUrl", null);
        setField(term291242, term291242.getClass(), "assigneesUrl", null);
        setField(term291242, term291242.getClass(), "branchesUrl", null);
        setField(term291242, term291242.getClass(), "tagsUrl", null);
        setField(term291242, term291242.getClass(), "blobsUrl", null);
        setField(term291242, term291242.getClass(), "gitTagsUrl", null);
        setField(term291242, term291242.getClass(), "gitRefsUrl", null);
        setField(term291242, term291242.getClass(), "treesUrl", null);
        setField(term291242, term291242.getClass(), "statusesUrl", null);
        setField(term291242, term291242.getClass(), "languagesUrl", null);
        setField(term291242, term291242.getClass(), "stargazersUrl", null);
        setField(term291242, term291242.getClass(), "contributorsUrl", null);
        setField(term291242, term291242.getClass(), "subscribersUrl", null);
        setField(term291242, term291242.getClass(), "subscriptionUrl", null);
        setField(term291242, term291242.getClass(), "commitsUrl", null);
        setField(term291242, term291242.getClass(), "gitCommitsUrl", null);
        setField(term291242, term291242.getClass(), "commentsUrl", null);
        setField(term291242, term291242.getClass(), "issueCommentUrl", null);
        setField(term291242, term291242.getClass(), "contentsUrl", null);
        setField(term291242, term291242.getClass(), "compareUrl", null);
        setField(term291242, term291242.getClass(), "mergesUrl", null);
        setField(term291242, term291242.getClass(), "archiveUrl", null);
        setField(term291242, term291242.getClass(), "downloadsUrl", null);
        setField(term291242, term291242.getClass(), "issuesUrl", null);
        setField(term291242, term291242.getClass(), "pullsUrl", null);
        setField(term291242, term291242.getClass(), "milestonesUrl", null);
        setField(term291242, term291242.getClass(), "notificationsUrl", null);
        setField(term291242, term291242.getClass(), "labelsUrl", null);
        setField(term291242, term291242.getClass(), "releasesUrl", null);
        setField(term291242, term291242.getClass(), "deploymentsUrl", null);
        setField(term291242, term291242.getClass(), "createdAt", null);
        setField(term291242, term291242.getClass(), "updatedAt", null);
        setField(term291242, term291242.getClass(), "pushedAt", null);
        setField(term291242, term291242.getClass(), "gitUrl", null);
        setField(term291242, term291242.getClass(), "sshUrl", null);
        setField(term291242, term291242.getClass(), "cloneUrl", null);
        setField(term291242, term291242.getClass(), "svnUrl", null);
        setField(term291242, term291242.getClass(), "homepage", null);
        setField(term291242, term291242.getClass(), "size", null);
        setField(term291242, term291242.getClass(), "stargazersCount", null);
        setField(term291242, term291242.getClass(), "watchersCount", null);
        setField(term291242, term291242.getClass(), "language", null);
        setField(term291242, term291242.getClass(), "hasIssues", null);
        setField(term291242, term291242.getClass(), "hasProjects", null);
        setField(term291242, term291242.getClass(), "hasDownloads", null);
        setField(term291242, term291242.getClass(), "hasWiki", null);
        setField(term291242, term291242.getClass(), "hasPages", null);
        setField(term291242, term291242.getClass(), "forksCount", null);
        setField(term291242, term291242.getClass(), "archived", null);
        setField(term291242, term291242.getClass(), "disabled", null);
        setField(term291242, term291242.getClass(), "openIssuesCount", null);
        setField(term291242, term291242.getClass(), "license", null);
        setField(term291242, term291242.getClass(), "allowForking", null);
        setField(term291242, term291242.getClass(), "isTemplate", null);
        setField(term291242, term291242.getClass(), "topics", null);
        setField(term291242, term291242.getClass(), "visibility", null);
        setField(term291242, term291242.getClass(), "forks", null);
        setField(term291242, term291242.getClass(), "openIssues", null);
        setField(term291242, term291242.getClass(), "watchers", null);
        setField(term291242, term291242.getClass(), "defaultBranch", null);
        setField(term291242, term291242.getClass(), "networkCount", null);
        setField(term291242, term291242.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommitsUrl", argTypes, term291242, args);
    }

};


