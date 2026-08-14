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

public class GithubRepoResponse_getVisibility_1020437742300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291323;

    public GithubRepoResponse_getVisibility_1020437742300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291323 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291323, term291323.getClass(), "id", null);
        setField(term291323, term291323.getClass(), "nodeId", null);
        setField(term291323, term291323.getClass(), "name", null);
        setField(term291323, term291323.getClass(), "fullName", null);
        setField(term291323, term291323.getClass(), "_private", null);
        setField(term291323, term291323.getClass(), "owner", null);
        setField(term291323, term291323.getClass(), "htmlUrl", null);
        setField(term291323, term291323.getClass(), "description", null);
        setField(term291323, term291323.getClass(), "fork", null);
        setField(term291323, term291323.getClass(), "url", null);
        setField(term291323, term291323.getClass(), "forksUrl", null);
        setField(term291323, term291323.getClass(), "keysUrl", null);
        setField(term291323, term291323.getClass(), "collaboratorsUrl", null);
        setField(term291323, term291323.getClass(), "teamsUrl", null);
        setField(term291323, term291323.getClass(), "hooksUrl", null);
        setField(term291323, term291323.getClass(), "issueEventsUrl", null);
        setField(term291323, term291323.getClass(), "eventsUrl", null);
        setField(term291323, term291323.getClass(), "assigneesUrl", null);
        setField(term291323, term291323.getClass(), "branchesUrl", null);
        setField(term291323, term291323.getClass(), "tagsUrl", null);
        setField(term291323, term291323.getClass(), "blobsUrl", null);
        setField(term291323, term291323.getClass(), "gitTagsUrl", null);
        setField(term291323, term291323.getClass(), "gitRefsUrl", null);
        setField(term291323, term291323.getClass(), "treesUrl", null);
        setField(term291323, term291323.getClass(), "statusesUrl", null);
        setField(term291323, term291323.getClass(), "languagesUrl", null);
        setField(term291323, term291323.getClass(), "stargazersUrl", null);
        setField(term291323, term291323.getClass(), "contributorsUrl", null);
        setField(term291323, term291323.getClass(), "subscribersUrl", null);
        setField(term291323, term291323.getClass(), "subscriptionUrl", null);
        setField(term291323, term291323.getClass(), "commitsUrl", null);
        setField(term291323, term291323.getClass(), "gitCommitsUrl", null);
        setField(term291323, term291323.getClass(), "commentsUrl", null);
        setField(term291323, term291323.getClass(), "issueCommentUrl", null);
        setField(term291323, term291323.getClass(), "contentsUrl", null);
        setField(term291323, term291323.getClass(), "compareUrl", null);
        setField(term291323, term291323.getClass(), "mergesUrl", null);
        setField(term291323, term291323.getClass(), "archiveUrl", null);
        setField(term291323, term291323.getClass(), "downloadsUrl", null);
        setField(term291323, term291323.getClass(), "issuesUrl", null);
        setField(term291323, term291323.getClass(), "pullsUrl", null);
        setField(term291323, term291323.getClass(), "milestonesUrl", null);
        setField(term291323, term291323.getClass(), "notificationsUrl", null);
        setField(term291323, term291323.getClass(), "labelsUrl", null);
        setField(term291323, term291323.getClass(), "releasesUrl", null);
        setField(term291323, term291323.getClass(), "deploymentsUrl", null);
        setField(term291323, term291323.getClass(), "createdAt", null);
        setField(term291323, term291323.getClass(), "updatedAt", null);
        setField(term291323, term291323.getClass(), "pushedAt", null);
        setField(term291323, term291323.getClass(), "gitUrl", null);
        setField(term291323, term291323.getClass(), "sshUrl", null);
        setField(term291323, term291323.getClass(), "cloneUrl", null);
        setField(term291323, term291323.getClass(), "svnUrl", null);
        setField(term291323, term291323.getClass(), "homepage", null);
        setField(term291323, term291323.getClass(), "size", null);
        setField(term291323, term291323.getClass(), "stargazersCount", null);
        setField(term291323, term291323.getClass(), "watchersCount", null);
        setField(term291323, term291323.getClass(), "language", null);
        setField(term291323, term291323.getClass(), "hasIssues", null);
        setField(term291323, term291323.getClass(), "hasProjects", null);
        setField(term291323, term291323.getClass(), "hasDownloads", null);
        setField(term291323, term291323.getClass(), "hasWiki", null);
        setField(term291323, term291323.getClass(), "hasPages", null);
        setField(term291323, term291323.getClass(), "forksCount", null);
        setField(term291323, term291323.getClass(), "archived", null);
        setField(term291323, term291323.getClass(), "disabled", null);
        setField(term291323, term291323.getClass(), "openIssuesCount", null);
        setField(term291323, term291323.getClass(), "license", null);
        setField(term291323, term291323.getClass(), "allowForking", null);
        setField(term291323, term291323.getClass(), "isTemplate", null);
        setField(term291323, term291323.getClass(), "topics", null);
        setField(term291323, term291323.getClass(), "visibility", null);
        setField(term291323, term291323.getClass(), "forks", null);
        setField(term291323, term291323.getClass(), "openIssues", null);
        setField(term291323, term291323.getClass(), "watchers", null);
        setField(term291323, term291323.getClass(), "defaultBranch", null);
        setField(term291323, term291323.getClass(), "networkCount", null);
        setField(term291323, term291323.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVisibility", argTypes, term291323, args);
    }

};


