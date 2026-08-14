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

public class GithubRepoResponse_getFork_52651505174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291197;

    public GithubRepoResponse_getFork_52651505174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291197 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291197, term291197.getClass(), "id", null);
        setField(term291197, term291197.getClass(), "nodeId", null);
        setField(term291197, term291197.getClass(), "name", null);
        setField(term291197, term291197.getClass(), "fullName", null);
        setField(term291197, term291197.getClass(), "_private", null);
        setField(term291197, term291197.getClass(), "owner", null);
        setField(term291197, term291197.getClass(), "htmlUrl", null);
        setField(term291197, term291197.getClass(), "description", null);
        setField(term291197, term291197.getClass(), "fork", null);
        setField(term291197, term291197.getClass(), "url", null);
        setField(term291197, term291197.getClass(), "forksUrl", null);
        setField(term291197, term291197.getClass(), "keysUrl", null);
        setField(term291197, term291197.getClass(), "collaboratorsUrl", null);
        setField(term291197, term291197.getClass(), "teamsUrl", null);
        setField(term291197, term291197.getClass(), "hooksUrl", null);
        setField(term291197, term291197.getClass(), "issueEventsUrl", null);
        setField(term291197, term291197.getClass(), "eventsUrl", null);
        setField(term291197, term291197.getClass(), "assigneesUrl", null);
        setField(term291197, term291197.getClass(), "branchesUrl", null);
        setField(term291197, term291197.getClass(), "tagsUrl", null);
        setField(term291197, term291197.getClass(), "blobsUrl", null);
        setField(term291197, term291197.getClass(), "gitTagsUrl", null);
        setField(term291197, term291197.getClass(), "gitRefsUrl", null);
        setField(term291197, term291197.getClass(), "treesUrl", null);
        setField(term291197, term291197.getClass(), "statusesUrl", null);
        setField(term291197, term291197.getClass(), "languagesUrl", null);
        setField(term291197, term291197.getClass(), "stargazersUrl", null);
        setField(term291197, term291197.getClass(), "contributorsUrl", null);
        setField(term291197, term291197.getClass(), "subscribersUrl", null);
        setField(term291197, term291197.getClass(), "subscriptionUrl", null);
        setField(term291197, term291197.getClass(), "commitsUrl", null);
        setField(term291197, term291197.getClass(), "gitCommitsUrl", null);
        setField(term291197, term291197.getClass(), "commentsUrl", null);
        setField(term291197, term291197.getClass(), "issueCommentUrl", null);
        setField(term291197, term291197.getClass(), "contentsUrl", null);
        setField(term291197, term291197.getClass(), "compareUrl", null);
        setField(term291197, term291197.getClass(), "mergesUrl", null);
        setField(term291197, term291197.getClass(), "archiveUrl", null);
        setField(term291197, term291197.getClass(), "downloadsUrl", null);
        setField(term291197, term291197.getClass(), "issuesUrl", null);
        setField(term291197, term291197.getClass(), "pullsUrl", null);
        setField(term291197, term291197.getClass(), "milestonesUrl", null);
        setField(term291197, term291197.getClass(), "notificationsUrl", null);
        setField(term291197, term291197.getClass(), "labelsUrl", null);
        setField(term291197, term291197.getClass(), "releasesUrl", null);
        setField(term291197, term291197.getClass(), "deploymentsUrl", null);
        setField(term291197, term291197.getClass(), "createdAt", null);
        setField(term291197, term291197.getClass(), "updatedAt", null);
        setField(term291197, term291197.getClass(), "pushedAt", null);
        setField(term291197, term291197.getClass(), "gitUrl", null);
        setField(term291197, term291197.getClass(), "sshUrl", null);
        setField(term291197, term291197.getClass(), "cloneUrl", null);
        setField(term291197, term291197.getClass(), "svnUrl", null);
        setField(term291197, term291197.getClass(), "homepage", null);
        setField(term291197, term291197.getClass(), "size", null);
        setField(term291197, term291197.getClass(), "stargazersCount", null);
        setField(term291197, term291197.getClass(), "watchersCount", null);
        setField(term291197, term291197.getClass(), "language", null);
        setField(term291197, term291197.getClass(), "hasIssues", null);
        setField(term291197, term291197.getClass(), "hasProjects", null);
        setField(term291197, term291197.getClass(), "hasDownloads", null);
        setField(term291197, term291197.getClass(), "hasWiki", null);
        setField(term291197, term291197.getClass(), "hasPages", null);
        setField(term291197, term291197.getClass(), "forksCount", null);
        setField(term291197, term291197.getClass(), "archived", null);
        setField(term291197, term291197.getClass(), "disabled", null);
        setField(term291197, term291197.getClass(), "openIssuesCount", null);
        setField(term291197, term291197.getClass(), "license", null);
        setField(term291197, term291197.getClass(), "allowForking", null);
        setField(term291197, term291197.getClass(), "isTemplate", null);
        setField(term291197, term291197.getClass(), "topics", null);
        setField(term291197, term291197.getClass(), "visibility", null);
        setField(term291197, term291197.getClass(), "forks", null);
        setField(term291197, term291197.getClass(), "openIssues", null);
        setField(term291197, term291197.getClass(), "watchers", null);
        setField(term291197, term291197.getClass(), "defaultBranch", null);
        setField(term291197, term291197.getClass(), "networkCount", null);
        setField(term291197, term291197.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFork", argTypes, term291197, args);
    }

};


