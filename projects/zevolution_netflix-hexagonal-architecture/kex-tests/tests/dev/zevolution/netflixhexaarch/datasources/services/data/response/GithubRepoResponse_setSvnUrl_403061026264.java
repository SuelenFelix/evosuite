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

public class GithubRepoResponse_setSvnUrl_403061026264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291287;

    public GithubRepoResponse_setSvnUrl_403061026264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291287 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291287, term291287.getClass(), "id", null);
        setField(term291287, term291287.getClass(), "nodeId", null);
        setField(term291287, term291287.getClass(), "name", null);
        setField(term291287, term291287.getClass(), "fullName", null);
        setField(term291287, term291287.getClass(), "_private", null);
        setField(term291287, term291287.getClass(), "owner", null);
        setField(term291287, term291287.getClass(), "htmlUrl", null);
        setField(term291287, term291287.getClass(), "description", null);
        setField(term291287, term291287.getClass(), "fork", null);
        setField(term291287, term291287.getClass(), "url", null);
        setField(term291287, term291287.getClass(), "forksUrl", null);
        setField(term291287, term291287.getClass(), "keysUrl", null);
        setField(term291287, term291287.getClass(), "collaboratorsUrl", null);
        setField(term291287, term291287.getClass(), "teamsUrl", null);
        setField(term291287, term291287.getClass(), "hooksUrl", null);
        setField(term291287, term291287.getClass(), "issueEventsUrl", null);
        setField(term291287, term291287.getClass(), "eventsUrl", null);
        setField(term291287, term291287.getClass(), "assigneesUrl", null);
        setField(term291287, term291287.getClass(), "branchesUrl", null);
        setField(term291287, term291287.getClass(), "tagsUrl", null);
        setField(term291287, term291287.getClass(), "blobsUrl", null);
        setField(term291287, term291287.getClass(), "gitTagsUrl", null);
        setField(term291287, term291287.getClass(), "gitRefsUrl", null);
        setField(term291287, term291287.getClass(), "treesUrl", null);
        setField(term291287, term291287.getClass(), "statusesUrl", null);
        setField(term291287, term291287.getClass(), "languagesUrl", null);
        setField(term291287, term291287.getClass(), "stargazersUrl", null);
        setField(term291287, term291287.getClass(), "contributorsUrl", null);
        setField(term291287, term291287.getClass(), "subscribersUrl", null);
        setField(term291287, term291287.getClass(), "subscriptionUrl", null);
        setField(term291287, term291287.getClass(), "commitsUrl", null);
        setField(term291287, term291287.getClass(), "gitCommitsUrl", null);
        setField(term291287, term291287.getClass(), "commentsUrl", null);
        setField(term291287, term291287.getClass(), "issueCommentUrl", null);
        setField(term291287, term291287.getClass(), "contentsUrl", null);
        setField(term291287, term291287.getClass(), "compareUrl", null);
        setField(term291287, term291287.getClass(), "mergesUrl", null);
        setField(term291287, term291287.getClass(), "archiveUrl", null);
        setField(term291287, term291287.getClass(), "downloadsUrl", null);
        setField(term291287, term291287.getClass(), "issuesUrl", null);
        setField(term291287, term291287.getClass(), "pullsUrl", null);
        setField(term291287, term291287.getClass(), "milestonesUrl", null);
        setField(term291287, term291287.getClass(), "notificationsUrl", null);
        setField(term291287, term291287.getClass(), "labelsUrl", null);
        setField(term291287, term291287.getClass(), "releasesUrl", null);
        setField(term291287, term291287.getClass(), "deploymentsUrl", null);
        setField(term291287, term291287.getClass(), "createdAt", null);
        setField(term291287, term291287.getClass(), "updatedAt", null);
        setField(term291287, term291287.getClass(), "pushedAt", null);
        setField(term291287, term291287.getClass(), "gitUrl", null);
        setField(term291287, term291287.getClass(), "sshUrl", null);
        setField(term291287, term291287.getClass(), "cloneUrl", null);
        setField(term291287, term291287.getClass(), "svnUrl", null);
        setField(term291287, term291287.getClass(), "homepage", null);
        setField(term291287, term291287.getClass(), "size", null);
        setField(term291287, term291287.getClass(), "stargazersCount", null);
        setField(term291287, term291287.getClass(), "watchersCount", null);
        setField(term291287, term291287.getClass(), "language", null);
        setField(term291287, term291287.getClass(), "hasIssues", null);
        setField(term291287, term291287.getClass(), "hasProjects", null);
        setField(term291287, term291287.getClass(), "hasDownloads", null);
        setField(term291287, term291287.getClass(), "hasWiki", null);
        setField(term291287, term291287.getClass(), "hasPages", null);
        setField(term291287, term291287.getClass(), "forksCount", null);
        setField(term291287, term291287.getClass(), "archived", null);
        setField(term291287, term291287.getClass(), "disabled", null);
        setField(term291287, term291287.getClass(), "openIssuesCount", null);
        setField(term291287, term291287.getClass(), "license", null);
        setField(term291287, term291287.getClass(), "allowForking", null);
        setField(term291287, term291287.getClass(), "isTemplate", null);
        setField(term291287, term291287.getClass(), "topics", null);
        setField(term291287, term291287.getClass(), "visibility", null);
        setField(term291287, term291287.getClass(), "forks", null);
        setField(term291287, term291287.getClass(), "openIssues", null);
        setField(term291287, term291287.getClass(), "watchers", null);
        setField(term291287, term291287.getClass(), "defaultBranch", null);
        setField(term291287, term291287.getClass(), "networkCount", null);
        setField(term291287, term291287.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSvnUrl", argTypes, term291287, args);
    }

};


