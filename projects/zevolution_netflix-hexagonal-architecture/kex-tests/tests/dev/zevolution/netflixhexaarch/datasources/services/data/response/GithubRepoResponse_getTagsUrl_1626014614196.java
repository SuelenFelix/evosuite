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

public class GithubRepoResponse_getTagsUrl_1626014614196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291219;

    public GithubRepoResponse_getTagsUrl_1626014614196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291219 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291219, term291219.getClass(), "id", null);
        setField(term291219, term291219.getClass(), "nodeId", null);
        setField(term291219, term291219.getClass(), "name", null);
        setField(term291219, term291219.getClass(), "fullName", null);
        setField(term291219, term291219.getClass(), "_private", null);
        setField(term291219, term291219.getClass(), "owner", null);
        setField(term291219, term291219.getClass(), "htmlUrl", null);
        setField(term291219, term291219.getClass(), "description", null);
        setField(term291219, term291219.getClass(), "fork", null);
        setField(term291219, term291219.getClass(), "url", null);
        setField(term291219, term291219.getClass(), "forksUrl", null);
        setField(term291219, term291219.getClass(), "keysUrl", null);
        setField(term291219, term291219.getClass(), "collaboratorsUrl", null);
        setField(term291219, term291219.getClass(), "teamsUrl", null);
        setField(term291219, term291219.getClass(), "hooksUrl", null);
        setField(term291219, term291219.getClass(), "issueEventsUrl", null);
        setField(term291219, term291219.getClass(), "eventsUrl", null);
        setField(term291219, term291219.getClass(), "assigneesUrl", null);
        setField(term291219, term291219.getClass(), "branchesUrl", null);
        setField(term291219, term291219.getClass(), "tagsUrl", null);
        setField(term291219, term291219.getClass(), "blobsUrl", null);
        setField(term291219, term291219.getClass(), "gitTagsUrl", null);
        setField(term291219, term291219.getClass(), "gitRefsUrl", null);
        setField(term291219, term291219.getClass(), "treesUrl", null);
        setField(term291219, term291219.getClass(), "statusesUrl", null);
        setField(term291219, term291219.getClass(), "languagesUrl", null);
        setField(term291219, term291219.getClass(), "stargazersUrl", null);
        setField(term291219, term291219.getClass(), "contributorsUrl", null);
        setField(term291219, term291219.getClass(), "subscribersUrl", null);
        setField(term291219, term291219.getClass(), "subscriptionUrl", null);
        setField(term291219, term291219.getClass(), "commitsUrl", null);
        setField(term291219, term291219.getClass(), "gitCommitsUrl", null);
        setField(term291219, term291219.getClass(), "commentsUrl", null);
        setField(term291219, term291219.getClass(), "issueCommentUrl", null);
        setField(term291219, term291219.getClass(), "contentsUrl", null);
        setField(term291219, term291219.getClass(), "compareUrl", null);
        setField(term291219, term291219.getClass(), "mergesUrl", null);
        setField(term291219, term291219.getClass(), "archiveUrl", null);
        setField(term291219, term291219.getClass(), "downloadsUrl", null);
        setField(term291219, term291219.getClass(), "issuesUrl", null);
        setField(term291219, term291219.getClass(), "pullsUrl", null);
        setField(term291219, term291219.getClass(), "milestonesUrl", null);
        setField(term291219, term291219.getClass(), "notificationsUrl", null);
        setField(term291219, term291219.getClass(), "labelsUrl", null);
        setField(term291219, term291219.getClass(), "releasesUrl", null);
        setField(term291219, term291219.getClass(), "deploymentsUrl", null);
        setField(term291219, term291219.getClass(), "createdAt", null);
        setField(term291219, term291219.getClass(), "updatedAt", null);
        setField(term291219, term291219.getClass(), "pushedAt", null);
        setField(term291219, term291219.getClass(), "gitUrl", null);
        setField(term291219, term291219.getClass(), "sshUrl", null);
        setField(term291219, term291219.getClass(), "cloneUrl", null);
        setField(term291219, term291219.getClass(), "svnUrl", null);
        setField(term291219, term291219.getClass(), "homepage", null);
        setField(term291219, term291219.getClass(), "size", null);
        setField(term291219, term291219.getClass(), "stargazersCount", null);
        setField(term291219, term291219.getClass(), "watchersCount", null);
        setField(term291219, term291219.getClass(), "language", null);
        setField(term291219, term291219.getClass(), "hasIssues", null);
        setField(term291219, term291219.getClass(), "hasProjects", null);
        setField(term291219, term291219.getClass(), "hasDownloads", null);
        setField(term291219, term291219.getClass(), "hasWiki", null);
        setField(term291219, term291219.getClass(), "hasPages", null);
        setField(term291219, term291219.getClass(), "forksCount", null);
        setField(term291219, term291219.getClass(), "archived", null);
        setField(term291219, term291219.getClass(), "disabled", null);
        setField(term291219, term291219.getClass(), "openIssuesCount", null);
        setField(term291219, term291219.getClass(), "license", null);
        setField(term291219, term291219.getClass(), "allowForking", null);
        setField(term291219, term291219.getClass(), "isTemplate", null);
        setField(term291219, term291219.getClass(), "topics", null);
        setField(term291219, term291219.getClass(), "visibility", null);
        setField(term291219, term291219.getClass(), "forks", null);
        setField(term291219, term291219.getClass(), "openIssues", null);
        setField(term291219, term291219.getClass(), "watchers", null);
        setField(term291219, term291219.getClass(), "defaultBranch", null);
        setField(term291219, term291219.getClass(), "networkCount", null);
        setField(term291219, term291219.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTagsUrl", argTypes, term291219, args);
    }

};


