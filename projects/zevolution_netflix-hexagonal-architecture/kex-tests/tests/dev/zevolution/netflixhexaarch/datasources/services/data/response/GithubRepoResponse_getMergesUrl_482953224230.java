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

public class GithubRepoResponse_getMergesUrl_482953224230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291253;

    public GithubRepoResponse_getMergesUrl_482953224230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291253 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291253, term291253.getClass(), "id", null);
        setField(term291253, term291253.getClass(), "nodeId", null);
        setField(term291253, term291253.getClass(), "name", null);
        setField(term291253, term291253.getClass(), "fullName", null);
        setField(term291253, term291253.getClass(), "_private", null);
        setField(term291253, term291253.getClass(), "owner", null);
        setField(term291253, term291253.getClass(), "htmlUrl", null);
        setField(term291253, term291253.getClass(), "description", null);
        setField(term291253, term291253.getClass(), "fork", null);
        setField(term291253, term291253.getClass(), "url", null);
        setField(term291253, term291253.getClass(), "forksUrl", null);
        setField(term291253, term291253.getClass(), "keysUrl", null);
        setField(term291253, term291253.getClass(), "collaboratorsUrl", null);
        setField(term291253, term291253.getClass(), "teamsUrl", null);
        setField(term291253, term291253.getClass(), "hooksUrl", null);
        setField(term291253, term291253.getClass(), "issueEventsUrl", null);
        setField(term291253, term291253.getClass(), "eventsUrl", null);
        setField(term291253, term291253.getClass(), "assigneesUrl", null);
        setField(term291253, term291253.getClass(), "branchesUrl", null);
        setField(term291253, term291253.getClass(), "tagsUrl", null);
        setField(term291253, term291253.getClass(), "blobsUrl", null);
        setField(term291253, term291253.getClass(), "gitTagsUrl", null);
        setField(term291253, term291253.getClass(), "gitRefsUrl", null);
        setField(term291253, term291253.getClass(), "treesUrl", null);
        setField(term291253, term291253.getClass(), "statusesUrl", null);
        setField(term291253, term291253.getClass(), "languagesUrl", null);
        setField(term291253, term291253.getClass(), "stargazersUrl", null);
        setField(term291253, term291253.getClass(), "contributorsUrl", null);
        setField(term291253, term291253.getClass(), "subscribersUrl", null);
        setField(term291253, term291253.getClass(), "subscriptionUrl", null);
        setField(term291253, term291253.getClass(), "commitsUrl", null);
        setField(term291253, term291253.getClass(), "gitCommitsUrl", null);
        setField(term291253, term291253.getClass(), "commentsUrl", null);
        setField(term291253, term291253.getClass(), "issueCommentUrl", null);
        setField(term291253, term291253.getClass(), "contentsUrl", null);
        setField(term291253, term291253.getClass(), "compareUrl", null);
        setField(term291253, term291253.getClass(), "mergesUrl", null);
        setField(term291253, term291253.getClass(), "archiveUrl", null);
        setField(term291253, term291253.getClass(), "downloadsUrl", null);
        setField(term291253, term291253.getClass(), "issuesUrl", null);
        setField(term291253, term291253.getClass(), "pullsUrl", null);
        setField(term291253, term291253.getClass(), "milestonesUrl", null);
        setField(term291253, term291253.getClass(), "notificationsUrl", null);
        setField(term291253, term291253.getClass(), "labelsUrl", null);
        setField(term291253, term291253.getClass(), "releasesUrl", null);
        setField(term291253, term291253.getClass(), "deploymentsUrl", null);
        setField(term291253, term291253.getClass(), "createdAt", null);
        setField(term291253, term291253.getClass(), "updatedAt", null);
        setField(term291253, term291253.getClass(), "pushedAt", null);
        setField(term291253, term291253.getClass(), "gitUrl", null);
        setField(term291253, term291253.getClass(), "sshUrl", null);
        setField(term291253, term291253.getClass(), "cloneUrl", null);
        setField(term291253, term291253.getClass(), "svnUrl", null);
        setField(term291253, term291253.getClass(), "homepage", null);
        setField(term291253, term291253.getClass(), "size", null);
        setField(term291253, term291253.getClass(), "stargazersCount", null);
        setField(term291253, term291253.getClass(), "watchersCount", null);
        setField(term291253, term291253.getClass(), "language", null);
        setField(term291253, term291253.getClass(), "hasIssues", null);
        setField(term291253, term291253.getClass(), "hasProjects", null);
        setField(term291253, term291253.getClass(), "hasDownloads", null);
        setField(term291253, term291253.getClass(), "hasWiki", null);
        setField(term291253, term291253.getClass(), "hasPages", null);
        setField(term291253, term291253.getClass(), "forksCount", null);
        setField(term291253, term291253.getClass(), "archived", null);
        setField(term291253, term291253.getClass(), "disabled", null);
        setField(term291253, term291253.getClass(), "openIssuesCount", null);
        setField(term291253, term291253.getClass(), "license", null);
        setField(term291253, term291253.getClass(), "allowForking", null);
        setField(term291253, term291253.getClass(), "isTemplate", null);
        setField(term291253, term291253.getClass(), "topics", null);
        setField(term291253, term291253.getClass(), "visibility", null);
        setField(term291253, term291253.getClass(), "forks", null);
        setField(term291253, term291253.getClass(), "openIssues", null);
        setField(term291253, term291253.getClass(), "watchers", null);
        setField(term291253, term291253.getClass(), "defaultBranch", null);
        setField(term291253, term291253.getClass(), "networkCount", null);
        setField(term291253, term291253.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMergesUrl", argTypes, term291253, args);
    }

};


