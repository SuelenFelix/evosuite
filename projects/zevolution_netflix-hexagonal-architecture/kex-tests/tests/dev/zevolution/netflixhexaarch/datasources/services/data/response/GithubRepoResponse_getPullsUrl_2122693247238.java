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

public class GithubRepoResponse_getPullsUrl_2122693247238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291261;

    public GithubRepoResponse_getPullsUrl_2122693247238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291261 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291261, term291261.getClass(), "id", null);
        setField(term291261, term291261.getClass(), "nodeId", null);
        setField(term291261, term291261.getClass(), "name", null);
        setField(term291261, term291261.getClass(), "fullName", null);
        setField(term291261, term291261.getClass(), "_private", null);
        setField(term291261, term291261.getClass(), "owner", null);
        setField(term291261, term291261.getClass(), "htmlUrl", null);
        setField(term291261, term291261.getClass(), "description", null);
        setField(term291261, term291261.getClass(), "fork", null);
        setField(term291261, term291261.getClass(), "url", null);
        setField(term291261, term291261.getClass(), "forksUrl", null);
        setField(term291261, term291261.getClass(), "keysUrl", null);
        setField(term291261, term291261.getClass(), "collaboratorsUrl", null);
        setField(term291261, term291261.getClass(), "teamsUrl", null);
        setField(term291261, term291261.getClass(), "hooksUrl", null);
        setField(term291261, term291261.getClass(), "issueEventsUrl", null);
        setField(term291261, term291261.getClass(), "eventsUrl", null);
        setField(term291261, term291261.getClass(), "assigneesUrl", null);
        setField(term291261, term291261.getClass(), "branchesUrl", null);
        setField(term291261, term291261.getClass(), "tagsUrl", null);
        setField(term291261, term291261.getClass(), "blobsUrl", null);
        setField(term291261, term291261.getClass(), "gitTagsUrl", null);
        setField(term291261, term291261.getClass(), "gitRefsUrl", null);
        setField(term291261, term291261.getClass(), "treesUrl", null);
        setField(term291261, term291261.getClass(), "statusesUrl", null);
        setField(term291261, term291261.getClass(), "languagesUrl", null);
        setField(term291261, term291261.getClass(), "stargazersUrl", null);
        setField(term291261, term291261.getClass(), "contributorsUrl", null);
        setField(term291261, term291261.getClass(), "subscribersUrl", null);
        setField(term291261, term291261.getClass(), "subscriptionUrl", null);
        setField(term291261, term291261.getClass(), "commitsUrl", null);
        setField(term291261, term291261.getClass(), "gitCommitsUrl", null);
        setField(term291261, term291261.getClass(), "commentsUrl", null);
        setField(term291261, term291261.getClass(), "issueCommentUrl", null);
        setField(term291261, term291261.getClass(), "contentsUrl", null);
        setField(term291261, term291261.getClass(), "compareUrl", null);
        setField(term291261, term291261.getClass(), "mergesUrl", null);
        setField(term291261, term291261.getClass(), "archiveUrl", null);
        setField(term291261, term291261.getClass(), "downloadsUrl", null);
        setField(term291261, term291261.getClass(), "issuesUrl", null);
        setField(term291261, term291261.getClass(), "pullsUrl", null);
        setField(term291261, term291261.getClass(), "milestonesUrl", null);
        setField(term291261, term291261.getClass(), "notificationsUrl", null);
        setField(term291261, term291261.getClass(), "labelsUrl", null);
        setField(term291261, term291261.getClass(), "releasesUrl", null);
        setField(term291261, term291261.getClass(), "deploymentsUrl", null);
        setField(term291261, term291261.getClass(), "createdAt", null);
        setField(term291261, term291261.getClass(), "updatedAt", null);
        setField(term291261, term291261.getClass(), "pushedAt", null);
        setField(term291261, term291261.getClass(), "gitUrl", null);
        setField(term291261, term291261.getClass(), "sshUrl", null);
        setField(term291261, term291261.getClass(), "cloneUrl", null);
        setField(term291261, term291261.getClass(), "svnUrl", null);
        setField(term291261, term291261.getClass(), "homepage", null);
        setField(term291261, term291261.getClass(), "size", null);
        setField(term291261, term291261.getClass(), "stargazersCount", null);
        setField(term291261, term291261.getClass(), "watchersCount", null);
        setField(term291261, term291261.getClass(), "language", null);
        setField(term291261, term291261.getClass(), "hasIssues", null);
        setField(term291261, term291261.getClass(), "hasProjects", null);
        setField(term291261, term291261.getClass(), "hasDownloads", null);
        setField(term291261, term291261.getClass(), "hasWiki", null);
        setField(term291261, term291261.getClass(), "hasPages", null);
        setField(term291261, term291261.getClass(), "forksCount", null);
        setField(term291261, term291261.getClass(), "archived", null);
        setField(term291261, term291261.getClass(), "disabled", null);
        setField(term291261, term291261.getClass(), "openIssuesCount", null);
        setField(term291261, term291261.getClass(), "license", null);
        setField(term291261, term291261.getClass(), "allowForking", null);
        setField(term291261, term291261.getClass(), "isTemplate", null);
        setField(term291261, term291261.getClass(), "topics", null);
        setField(term291261, term291261.getClass(), "visibility", null);
        setField(term291261, term291261.getClass(), "forks", null);
        setField(term291261, term291261.getClass(), "openIssues", null);
        setField(term291261, term291261.getClass(), "watchers", null);
        setField(term291261, term291261.getClass(), "defaultBranch", null);
        setField(term291261, term291261.getClass(), "networkCount", null);
        setField(term291261, term291261.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPullsUrl", argTypes, term291261, args);
    }

};


