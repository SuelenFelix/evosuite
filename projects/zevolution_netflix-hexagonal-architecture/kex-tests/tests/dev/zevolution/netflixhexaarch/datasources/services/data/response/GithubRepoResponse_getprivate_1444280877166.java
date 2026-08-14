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

public class GithubRepoResponse_getprivate_1444280877166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291189;

    public GithubRepoResponse_getprivate_1444280877166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291189 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291189, term291189.getClass(), "id", null);
        setField(term291189, term291189.getClass(), "nodeId", null);
        setField(term291189, term291189.getClass(), "name", null);
        setField(term291189, term291189.getClass(), "fullName", null);
        setField(term291189, term291189.getClass(), "_private", null);
        setField(term291189, term291189.getClass(), "owner", null);
        setField(term291189, term291189.getClass(), "htmlUrl", null);
        setField(term291189, term291189.getClass(), "description", null);
        setField(term291189, term291189.getClass(), "fork", null);
        setField(term291189, term291189.getClass(), "url", null);
        setField(term291189, term291189.getClass(), "forksUrl", null);
        setField(term291189, term291189.getClass(), "keysUrl", null);
        setField(term291189, term291189.getClass(), "collaboratorsUrl", null);
        setField(term291189, term291189.getClass(), "teamsUrl", null);
        setField(term291189, term291189.getClass(), "hooksUrl", null);
        setField(term291189, term291189.getClass(), "issueEventsUrl", null);
        setField(term291189, term291189.getClass(), "eventsUrl", null);
        setField(term291189, term291189.getClass(), "assigneesUrl", null);
        setField(term291189, term291189.getClass(), "branchesUrl", null);
        setField(term291189, term291189.getClass(), "tagsUrl", null);
        setField(term291189, term291189.getClass(), "blobsUrl", null);
        setField(term291189, term291189.getClass(), "gitTagsUrl", null);
        setField(term291189, term291189.getClass(), "gitRefsUrl", null);
        setField(term291189, term291189.getClass(), "treesUrl", null);
        setField(term291189, term291189.getClass(), "statusesUrl", null);
        setField(term291189, term291189.getClass(), "languagesUrl", null);
        setField(term291189, term291189.getClass(), "stargazersUrl", null);
        setField(term291189, term291189.getClass(), "contributorsUrl", null);
        setField(term291189, term291189.getClass(), "subscribersUrl", null);
        setField(term291189, term291189.getClass(), "subscriptionUrl", null);
        setField(term291189, term291189.getClass(), "commitsUrl", null);
        setField(term291189, term291189.getClass(), "gitCommitsUrl", null);
        setField(term291189, term291189.getClass(), "commentsUrl", null);
        setField(term291189, term291189.getClass(), "issueCommentUrl", null);
        setField(term291189, term291189.getClass(), "contentsUrl", null);
        setField(term291189, term291189.getClass(), "compareUrl", null);
        setField(term291189, term291189.getClass(), "mergesUrl", null);
        setField(term291189, term291189.getClass(), "archiveUrl", null);
        setField(term291189, term291189.getClass(), "downloadsUrl", null);
        setField(term291189, term291189.getClass(), "issuesUrl", null);
        setField(term291189, term291189.getClass(), "pullsUrl", null);
        setField(term291189, term291189.getClass(), "milestonesUrl", null);
        setField(term291189, term291189.getClass(), "notificationsUrl", null);
        setField(term291189, term291189.getClass(), "labelsUrl", null);
        setField(term291189, term291189.getClass(), "releasesUrl", null);
        setField(term291189, term291189.getClass(), "deploymentsUrl", null);
        setField(term291189, term291189.getClass(), "createdAt", null);
        setField(term291189, term291189.getClass(), "updatedAt", null);
        setField(term291189, term291189.getClass(), "pushedAt", null);
        setField(term291189, term291189.getClass(), "gitUrl", null);
        setField(term291189, term291189.getClass(), "sshUrl", null);
        setField(term291189, term291189.getClass(), "cloneUrl", null);
        setField(term291189, term291189.getClass(), "svnUrl", null);
        setField(term291189, term291189.getClass(), "homepage", null);
        setField(term291189, term291189.getClass(), "size", null);
        setField(term291189, term291189.getClass(), "stargazersCount", null);
        setField(term291189, term291189.getClass(), "watchersCount", null);
        setField(term291189, term291189.getClass(), "language", null);
        setField(term291189, term291189.getClass(), "hasIssues", null);
        setField(term291189, term291189.getClass(), "hasProjects", null);
        setField(term291189, term291189.getClass(), "hasDownloads", null);
        setField(term291189, term291189.getClass(), "hasWiki", null);
        setField(term291189, term291189.getClass(), "hasPages", null);
        setField(term291189, term291189.getClass(), "forksCount", null);
        setField(term291189, term291189.getClass(), "archived", null);
        setField(term291189, term291189.getClass(), "disabled", null);
        setField(term291189, term291189.getClass(), "openIssuesCount", null);
        setField(term291189, term291189.getClass(), "license", null);
        setField(term291189, term291189.getClass(), "allowForking", null);
        setField(term291189, term291189.getClass(), "isTemplate", null);
        setField(term291189, term291189.getClass(), "topics", null);
        setField(term291189, term291189.getClass(), "visibility", null);
        setField(term291189, term291189.getClass(), "forks", null);
        setField(term291189, term291189.getClass(), "openIssues", null);
        setField(term291189, term291189.getClass(), "watchers", null);
        setField(term291189, term291189.getClass(), "defaultBranch", null);
        setField(term291189, term291189.getClass(), "networkCount", null);
        setField(term291189, term291189.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get_private", argTypes, term291189, args);
    }

};


