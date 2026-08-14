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

public class GithubRepoResponse_getNodeId_1051286787164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296002;

    public GithubRepoResponse_getNodeId_1051286787164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296002 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term296002, term296002.getClass(), "id", null);
        setField(term296002, term296002.getClass(), "nodeId", null);
        setField(term296002, term296002.getClass(), "name", null);
        setField(term296002, term296002.getClass(), "fullName", null);
        setField(term296002, term296002.getClass(), "_private", null);
        setField(term296002, term296002.getClass(), "owner", null);
        setField(term296002, term296002.getClass(), "htmlUrl", null);
        setField(term296002, term296002.getClass(), "description", null);
        setField(term296002, term296002.getClass(), "fork", null);
        setField(term296002, term296002.getClass(), "url", null);
        setField(term296002, term296002.getClass(), "forksUrl", null);
        setField(term296002, term296002.getClass(), "keysUrl", null);
        setField(term296002, term296002.getClass(), "collaboratorsUrl", null);
        setField(term296002, term296002.getClass(), "teamsUrl", null);
        setField(term296002, term296002.getClass(), "hooksUrl", null);
        setField(term296002, term296002.getClass(), "issueEventsUrl", null);
        setField(term296002, term296002.getClass(), "eventsUrl", null);
        setField(term296002, term296002.getClass(), "assigneesUrl", null);
        setField(term296002, term296002.getClass(), "branchesUrl", null);
        setField(term296002, term296002.getClass(), "tagsUrl", null);
        setField(term296002, term296002.getClass(), "blobsUrl", null);
        setField(term296002, term296002.getClass(), "gitTagsUrl", null);
        setField(term296002, term296002.getClass(), "gitRefsUrl", null);
        setField(term296002, term296002.getClass(), "treesUrl", null);
        setField(term296002, term296002.getClass(), "statusesUrl", null);
        setField(term296002, term296002.getClass(), "languagesUrl", null);
        setField(term296002, term296002.getClass(), "stargazersUrl", null);
        setField(term296002, term296002.getClass(), "contributorsUrl", null);
        setField(term296002, term296002.getClass(), "subscribersUrl", null);
        setField(term296002, term296002.getClass(), "subscriptionUrl", null);
        setField(term296002, term296002.getClass(), "commitsUrl", null);
        setField(term296002, term296002.getClass(), "gitCommitsUrl", null);
        setField(term296002, term296002.getClass(), "commentsUrl", null);
        setField(term296002, term296002.getClass(), "issueCommentUrl", null);
        setField(term296002, term296002.getClass(), "contentsUrl", null);
        setField(term296002, term296002.getClass(), "compareUrl", null);
        setField(term296002, term296002.getClass(), "mergesUrl", null);
        setField(term296002, term296002.getClass(), "archiveUrl", null);
        setField(term296002, term296002.getClass(), "downloadsUrl", null);
        setField(term296002, term296002.getClass(), "issuesUrl", null);
        setField(term296002, term296002.getClass(), "pullsUrl", null);
        setField(term296002, term296002.getClass(), "milestonesUrl", null);
        setField(term296002, term296002.getClass(), "notificationsUrl", null);
        setField(term296002, term296002.getClass(), "labelsUrl", null);
        setField(term296002, term296002.getClass(), "releasesUrl", null);
        setField(term296002, term296002.getClass(), "deploymentsUrl", null);
        setField(term296002, term296002.getClass(), "createdAt", null);
        setField(term296002, term296002.getClass(), "updatedAt", null);
        setField(term296002, term296002.getClass(), "pushedAt", null);
        setField(term296002, term296002.getClass(), "gitUrl", null);
        setField(term296002, term296002.getClass(), "sshUrl", null);
        setField(term296002, term296002.getClass(), "cloneUrl", null);
        setField(term296002, term296002.getClass(), "svnUrl", null);
        setField(term296002, term296002.getClass(), "homepage", null);
        setField(term296002, term296002.getClass(), "size", null);
        setField(term296002, term296002.getClass(), "stargazersCount", null);
        setField(term296002, term296002.getClass(), "watchersCount", null);
        setField(term296002, term296002.getClass(), "language", null);
        setField(term296002, term296002.getClass(), "hasIssues", null);
        setField(term296002, term296002.getClass(), "hasProjects", null);
        setField(term296002, term296002.getClass(), "hasDownloads", null);
        setField(term296002, term296002.getClass(), "hasWiki", null);
        setField(term296002, term296002.getClass(), "hasPages", null);
        setField(term296002, term296002.getClass(), "forksCount", null);
        setField(term296002, term296002.getClass(), "archived", null);
        setField(term296002, term296002.getClass(), "disabled", null);
        setField(term296002, term296002.getClass(), "openIssuesCount", null);
        setField(term296002, term296002.getClass(), "license", null);
        setField(term296002, term296002.getClass(), "allowForking", null);
        setField(term296002, term296002.getClass(), "isTemplate", null);
        setField(term296002, term296002.getClass(), "topics", null);
        setField(term296002, term296002.getClass(), "visibility", null);
        setField(term296002, term296002.getClass(), "forks", null);
        setField(term296002, term296002.getClass(), "openIssues", null);
        setField(term296002, term296002.getClass(), "watchers", null);
        setField(term296002, term296002.getClass(), "defaultBranch", null);
        setField(term296002, term296002.getClass(), "networkCount", null);
        setField(term296002, term296002.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeId", argTypes, term296002, args);
    }

};


