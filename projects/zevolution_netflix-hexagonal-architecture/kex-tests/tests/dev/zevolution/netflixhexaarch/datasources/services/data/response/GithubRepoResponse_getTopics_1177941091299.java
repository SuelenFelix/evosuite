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

public class GithubRepoResponse_getTopics_1177941091299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291322;

    public GithubRepoResponse_getTopics_1177941091299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291322 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291322, term291322.getClass(), "id", null);
        setField(term291322, term291322.getClass(), "nodeId", null);
        setField(term291322, term291322.getClass(), "name", null);
        setField(term291322, term291322.getClass(), "fullName", null);
        setField(term291322, term291322.getClass(), "_private", null);
        setField(term291322, term291322.getClass(), "owner", null);
        setField(term291322, term291322.getClass(), "htmlUrl", null);
        setField(term291322, term291322.getClass(), "description", null);
        setField(term291322, term291322.getClass(), "fork", null);
        setField(term291322, term291322.getClass(), "url", null);
        setField(term291322, term291322.getClass(), "forksUrl", null);
        setField(term291322, term291322.getClass(), "keysUrl", null);
        setField(term291322, term291322.getClass(), "collaboratorsUrl", null);
        setField(term291322, term291322.getClass(), "teamsUrl", null);
        setField(term291322, term291322.getClass(), "hooksUrl", null);
        setField(term291322, term291322.getClass(), "issueEventsUrl", null);
        setField(term291322, term291322.getClass(), "eventsUrl", null);
        setField(term291322, term291322.getClass(), "assigneesUrl", null);
        setField(term291322, term291322.getClass(), "branchesUrl", null);
        setField(term291322, term291322.getClass(), "tagsUrl", null);
        setField(term291322, term291322.getClass(), "blobsUrl", null);
        setField(term291322, term291322.getClass(), "gitTagsUrl", null);
        setField(term291322, term291322.getClass(), "gitRefsUrl", null);
        setField(term291322, term291322.getClass(), "treesUrl", null);
        setField(term291322, term291322.getClass(), "statusesUrl", null);
        setField(term291322, term291322.getClass(), "languagesUrl", null);
        setField(term291322, term291322.getClass(), "stargazersUrl", null);
        setField(term291322, term291322.getClass(), "contributorsUrl", null);
        setField(term291322, term291322.getClass(), "subscribersUrl", null);
        setField(term291322, term291322.getClass(), "subscriptionUrl", null);
        setField(term291322, term291322.getClass(), "commitsUrl", null);
        setField(term291322, term291322.getClass(), "gitCommitsUrl", null);
        setField(term291322, term291322.getClass(), "commentsUrl", null);
        setField(term291322, term291322.getClass(), "issueCommentUrl", null);
        setField(term291322, term291322.getClass(), "contentsUrl", null);
        setField(term291322, term291322.getClass(), "compareUrl", null);
        setField(term291322, term291322.getClass(), "mergesUrl", null);
        setField(term291322, term291322.getClass(), "archiveUrl", null);
        setField(term291322, term291322.getClass(), "downloadsUrl", null);
        setField(term291322, term291322.getClass(), "issuesUrl", null);
        setField(term291322, term291322.getClass(), "pullsUrl", null);
        setField(term291322, term291322.getClass(), "milestonesUrl", null);
        setField(term291322, term291322.getClass(), "notificationsUrl", null);
        setField(term291322, term291322.getClass(), "labelsUrl", null);
        setField(term291322, term291322.getClass(), "releasesUrl", null);
        setField(term291322, term291322.getClass(), "deploymentsUrl", null);
        setField(term291322, term291322.getClass(), "createdAt", null);
        setField(term291322, term291322.getClass(), "updatedAt", null);
        setField(term291322, term291322.getClass(), "pushedAt", null);
        setField(term291322, term291322.getClass(), "gitUrl", null);
        setField(term291322, term291322.getClass(), "sshUrl", null);
        setField(term291322, term291322.getClass(), "cloneUrl", null);
        setField(term291322, term291322.getClass(), "svnUrl", null);
        setField(term291322, term291322.getClass(), "homepage", null);
        setField(term291322, term291322.getClass(), "size", null);
        setField(term291322, term291322.getClass(), "stargazersCount", null);
        setField(term291322, term291322.getClass(), "watchersCount", null);
        setField(term291322, term291322.getClass(), "language", null);
        setField(term291322, term291322.getClass(), "hasIssues", null);
        setField(term291322, term291322.getClass(), "hasProjects", null);
        setField(term291322, term291322.getClass(), "hasDownloads", null);
        setField(term291322, term291322.getClass(), "hasWiki", null);
        setField(term291322, term291322.getClass(), "hasPages", null);
        setField(term291322, term291322.getClass(), "forksCount", null);
        setField(term291322, term291322.getClass(), "archived", null);
        setField(term291322, term291322.getClass(), "disabled", null);
        setField(term291322, term291322.getClass(), "openIssuesCount", null);
        setField(term291322, term291322.getClass(), "license", null);
        setField(term291322, term291322.getClass(), "allowForking", null);
        setField(term291322, term291322.getClass(), "isTemplate", null);
        setField(term291322, term291322.getClass(), "topics", null);
        setField(term291322, term291322.getClass(), "visibility", null);
        setField(term291322, term291322.getClass(), "forks", null);
        setField(term291322, term291322.getClass(), "openIssues", null);
        setField(term291322, term291322.getClass(), "watchers", null);
        setField(term291322, term291322.getClass(), "defaultBranch", null);
        setField(term291322, term291322.getClass(), "networkCount", null);
        setField(term291322, term291322.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopics", argTypes, term291322, args);
    }

};


