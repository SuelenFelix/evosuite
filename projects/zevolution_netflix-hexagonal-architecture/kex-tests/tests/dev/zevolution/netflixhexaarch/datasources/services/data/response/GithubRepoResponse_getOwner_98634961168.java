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

public class GithubRepoResponse_getOwner_98634961168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291191;

    public GithubRepoResponse_getOwner_98634961168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291191 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291191, term291191.getClass(), "id", null);
        setField(term291191, term291191.getClass(), "nodeId", null);
        setField(term291191, term291191.getClass(), "name", null);
        setField(term291191, term291191.getClass(), "fullName", null);
        setField(term291191, term291191.getClass(), "_private", null);
        setField(term291191, term291191.getClass(), "owner", null);
        setField(term291191, term291191.getClass(), "htmlUrl", null);
        setField(term291191, term291191.getClass(), "description", null);
        setField(term291191, term291191.getClass(), "fork", null);
        setField(term291191, term291191.getClass(), "url", null);
        setField(term291191, term291191.getClass(), "forksUrl", null);
        setField(term291191, term291191.getClass(), "keysUrl", null);
        setField(term291191, term291191.getClass(), "collaboratorsUrl", null);
        setField(term291191, term291191.getClass(), "teamsUrl", null);
        setField(term291191, term291191.getClass(), "hooksUrl", null);
        setField(term291191, term291191.getClass(), "issueEventsUrl", null);
        setField(term291191, term291191.getClass(), "eventsUrl", null);
        setField(term291191, term291191.getClass(), "assigneesUrl", null);
        setField(term291191, term291191.getClass(), "branchesUrl", null);
        setField(term291191, term291191.getClass(), "tagsUrl", null);
        setField(term291191, term291191.getClass(), "blobsUrl", null);
        setField(term291191, term291191.getClass(), "gitTagsUrl", null);
        setField(term291191, term291191.getClass(), "gitRefsUrl", null);
        setField(term291191, term291191.getClass(), "treesUrl", null);
        setField(term291191, term291191.getClass(), "statusesUrl", null);
        setField(term291191, term291191.getClass(), "languagesUrl", null);
        setField(term291191, term291191.getClass(), "stargazersUrl", null);
        setField(term291191, term291191.getClass(), "contributorsUrl", null);
        setField(term291191, term291191.getClass(), "subscribersUrl", null);
        setField(term291191, term291191.getClass(), "subscriptionUrl", null);
        setField(term291191, term291191.getClass(), "commitsUrl", null);
        setField(term291191, term291191.getClass(), "gitCommitsUrl", null);
        setField(term291191, term291191.getClass(), "commentsUrl", null);
        setField(term291191, term291191.getClass(), "issueCommentUrl", null);
        setField(term291191, term291191.getClass(), "contentsUrl", null);
        setField(term291191, term291191.getClass(), "compareUrl", null);
        setField(term291191, term291191.getClass(), "mergesUrl", null);
        setField(term291191, term291191.getClass(), "archiveUrl", null);
        setField(term291191, term291191.getClass(), "downloadsUrl", null);
        setField(term291191, term291191.getClass(), "issuesUrl", null);
        setField(term291191, term291191.getClass(), "pullsUrl", null);
        setField(term291191, term291191.getClass(), "milestonesUrl", null);
        setField(term291191, term291191.getClass(), "notificationsUrl", null);
        setField(term291191, term291191.getClass(), "labelsUrl", null);
        setField(term291191, term291191.getClass(), "releasesUrl", null);
        setField(term291191, term291191.getClass(), "deploymentsUrl", null);
        setField(term291191, term291191.getClass(), "createdAt", null);
        setField(term291191, term291191.getClass(), "updatedAt", null);
        setField(term291191, term291191.getClass(), "pushedAt", null);
        setField(term291191, term291191.getClass(), "gitUrl", null);
        setField(term291191, term291191.getClass(), "sshUrl", null);
        setField(term291191, term291191.getClass(), "cloneUrl", null);
        setField(term291191, term291191.getClass(), "svnUrl", null);
        setField(term291191, term291191.getClass(), "homepage", null);
        setField(term291191, term291191.getClass(), "size", null);
        setField(term291191, term291191.getClass(), "stargazersCount", null);
        setField(term291191, term291191.getClass(), "watchersCount", null);
        setField(term291191, term291191.getClass(), "language", null);
        setField(term291191, term291191.getClass(), "hasIssues", null);
        setField(term291191, term291191.getClass(), "hasProjects", null);
        setField(term291191, term291191.getClass(), "hasDownloads", null);
        setField(term291191, term291191.getClass(), "hasWiki", null);
        setField(term291191, term291191.getClass(), "hasPages", null);
        setField(term291191, term291191.getClass(), "forksCount", null);
        setField(term291191, term291191.getClass(), "archived", null);
        setField(term291191, term291191.getClass(), "disabled", null);
        setField(term291191, term291191.getClass(), "openIssuesCount", null);
        setField(term291191, term291191.getClass(), "license", null);
        setField(term291191, term291191.getClass(), "allowForking", null);
        setField(term291191, term291191.getClass(), "isTemplate", null);
        setField(term291191, term291191.getClass(), "topics", null);
        setField(term291191, term291191.getClass(), "visibility", null);
        setField(term291191, term291191.getClass(), "forks", null);
        setField(term291191, term291191.getClass(), "openIssues", null);
        setField(term291191, term291191.getClass(), "watchers", null);
        setField(term291191, term291191.getClass(), "defaultBranch", null);
        setField(term291191, term291191.getClass(), "networkCount", null);
        setField(term291191, term291191.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term291191, args);
    }

};


