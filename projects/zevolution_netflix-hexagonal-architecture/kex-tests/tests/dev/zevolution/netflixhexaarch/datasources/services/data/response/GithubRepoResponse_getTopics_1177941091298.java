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

public class GithubRepoResponse_getTopics_1177941091298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291321;

    public GithubRepoResponse_getTopics_1177941091298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291321 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291321, term291321.getClass(), "id", null);
        setField(term291321, term291321.getClass(), "nodeId", null);
        setField(term291321, term291321.getClass(), "name", null);
        setField(term291321, term291321.getClass(), "fullName", null);
        setField(term291321, term291321.getClass(), "_private", null);
        setField(term291321, term291321.getClass(), "owner", null);
        setField(term291321, term291321.getClass(), "htmlUrl", null);
        setField(term291321, term291321.getClass(), "description", null);
        setField(term291321, term291321.getClass(), "fork", null);
        setField(term291321, term291321.getClass(), "url", null);
        setField(term291321, term291321.getClass(), "forksUrl", null);
        setField(term291321, term291321.getClass(), "keysUrl", null);
        setField(term291321, term291321.getClass(), "collaboratorsUrl", null);
        setField(term291321, term291321.getClass(), "teamsUrl", null);
        setField(term291321, term291321.getClass(), "hooksUrl", null);
        setField(term291321, term291321.getClass(), "issueEventsUrl", null);
        setField(term291321, term291321.getClass(), "eventsUrl", null);
        setField(term291321, term291321.getClass(), "assigneesUrl", null);
        setField(term291321, term291321.getClass(), "branchesUrl", null);
        setField(term291321, term291321.getClass(), "tagsUrl", null);
        setField(term291321, term291321.getClass(), "blobsUrl", null);
        setField(term291321, term291321.getClass(), "gitTagsUrl", null);
        setField(term291321, term291321.getClass(), "gitRefsUrl", null);
        setField(term291321, term291321.getClass(), "treesUrl", null);
        setField(term291321, term291321.getClass(), "statusesUrl", null);
        setField(term291321, term291321.getClass(), "languagesUrl", null);
        setField(term291321, term291321.getClass(), "stargazersUrl", null);
        setField(term291321, term291321.getClass(), "contributorsUrl", null);
        setField(term291321, term291321.getClass(), "subscribersUrl", null);
        setField(term291321, term291321.getClass(), "subscriptionUrl", null);
        setField(term291321, term291321.getClass(), "commitsUrl", null);
        setField(term291321, term291321.getClass(), "gitCommitsUrl", null);
        setField(term291321, term291321.getClass(), "commentsUrl", null);
        setField(term291321, term291321.getClass(), "issueCommentUrl", null);
        setField(term291321, term291321.getClass(), "contentsUrl", null);
        setField(term291321, term291321.getClass(), "compareUrl", null);
        setField(term291321, term291321.getClass(), "mergesUrl", null);
        setField(term291321, term291321.getClass(), "archiveUrl", null);
        setField(term291321, term291321.getClass(), "downloadsUrl", null);
        setField(term291321, term291321.getClass(), "issuesUrl", null);
        setField(term291321, term291321.getClass(), "pullsUrl", null);
        setField(term291321, term291321.getClass(), "milestonesUrl", null);
        setField(term291321, term291321.getClass(), "notificationsUrl", null);
        setField(term291321, term291321.getClass(), "labelsUrl", null);
        setField(term291321, term291321.getClass(), "releasesUrl", null);
        setField(term291321, term291321.getClass(), "deploymentsUrl", null);
        setField(term291321, term291321.getClass(), "createdAt", null);
        setField(term291321, term291321.getClass(), "updatedAt", null);
        setField(term291321, term291321.getClass(), "pushedAt", null);
        setField(term291321, term291321.getClass(), "gitUrl", null);
        setField(term291321, term291321.getClass(), "sshUrl", null);
        setField(term291321, term291321.getClass(), "cloneUrl", null);
        setField(term291321, term291321.getClass(), "svnUrl", null);
        setField(term291321, term291321.getClass(), "homepage", null);
        setField(term291321, term291321.getClass(), "size", null);
        setField(term291321, term291321.getClass(), "stargazersCount", null);
        setField(term291321, term291321.getClass(), "watchersCount", null);
        setField(term291321, term291321.getClass(), "language", null);
        setField(term291321, term291321.getClass(), "hasIssues", null);
        setField(term291321, term291321.getClass(), "hasProjects", null);
        setField(term291321, term291321.getClass(), "hasDownloads", null);
        setField(term291321, term291321.getClass(), "hasWiki", null);
        setField(term291321, term291321.getClass(), "hasPages", null);
        setField(term291321, term291321.getClass(), "forksCount", null);
        setField(term291321, term291321.getClass(), "archived", null);
        setField(term291321, term291321.getClass(), "disabled", null);
        setField(term291321, term291321.getClass(), "openIssuesCount", null);
        setField(term291321, term291321.getClass(), "license", null);
        setField(term291321, term291321.getClass(), "allowForking", null);
        setField(term291321, term291321.getClass(), "isTemplate", null);
        setField(term291321, term291321.getClass(), "topics", null);
        setField(term291321, term291321.getClass(), "visibility", null);
        setField(term291321, term291321.getClass(), "forks", null);
        setField(term291321, term291321.getClass(), "openIssues", null);
        setField(term291321, term291321.getClass(), "watchers", null);
        setField(term291321, term291321.getClass(), "defaultBranch", null);
        setField(term291321, term291321.getClass(), "networkCount", null);
        setField(term291321, term291321.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopics", argTypes, term291321, args);
    }

};


