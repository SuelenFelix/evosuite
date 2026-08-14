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

public class GithubRepoResponse_getForksCount_1664105059285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291308;

    public GithubRepoResponse_getForksCount_1664105059285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291308 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291308, term291308.getClass(), "id", null);
        setField(term291308, term291308.getClass(), "nodeId", null);
        setField(term291308, term291308.getClass(), "name", null);
        setField(term291308, term291308.getClass(), "fullName", null);
        setField(term291308, term291308.getClass(), "_private", null);
        setField(term291308, term291308.getClass(), "owner", null);
        setField(term291308, term291308.getClass(), "htmlUrl", null);
        setField(term291308, term291308.getClass(), "description", null);
        setField(term291308, term291308.getClass(), "fork", null);
        setField(term291308, term291308.getClass(), "url", null);
        setField(term291308, term291308.getClass(), "forksUrl", null);
        setField(term291308, term291308.getClass(), "keysUrl", null);
        setField(term291308, term291308.getClass(), "collaboratorsUrl", null);
        setField(term291308, term291308.getClass(), "teamsUrl", null);
        setField(term291308, term291308.getClass(), "hooksUrl", null);
        setField(term291308, term291308.getClass(), "issueEventsUrl", null);
        setField(term291308, term291308.getClass(), "eventsUrl", null);
        setField(term291308, term291308.getClass(), "assigneesUrl", null);
        setField(term291308, term291308.getClass(), "branchesUrl", null);
        setField(term291308, term291308.getClass(), "tagsUrl", null);
        setField(term291308, term291308.getClass(), "blobsUrl", null);
        setField(term291308, term291308.getClass(), "gitTagsUrl", null);
        setField(term291308, term291308.getClass(), "gitRefsUrl", null);
        setField(term291308, term291308.getClass(), "treesUrl", null);
        setField(term291308, term291308.getClass(), "statusesUrl", null);
        setField(term291308, term291308.getClass(), "languagesUrl", null);
        setField(term291308, term291308.getClass(), "stargazersUrl", null);
        setField(term291308, term291308.getClass(), "contributorsUrl", null);
        setField(term291308, term291308.getClass(), "subscribersUrl", null);
        setField(term291308, term291308.getClass(), "subscriptionUrl", null);
        setField(term291308, term291308.getClass(), "commitsUrl", null);
        setField(term291308, term291308.getClass(), "gitCommitsUrl", null);
        setField(term291308, term291308.getClass(), "commentsUrl", null);
        setField(term291308, term291308.getClass(), "issueCommentUrl", null);
        setField(term291308, term291308.getClass(), "contentsUrl", null);
        setField(term291308, term291308.getClass(), "compareUrl", null);
        setField(term291308, term291308.getClass(), "mergesUrl", null);
        setField(term291308, term291308.getClass(), "archiveUrl", null);
        setField(term291308, term291308.getClass(), "downloadsUrl", null);
        setField(term291308, term291308.getClass(), "issuesUrl", null);
        setField(term291308, term291308.getClass(), "pullsUrl", null);
        setField(term291308, term291308.getClass(), "milestonesUrl", null);
        setField(term291308, term291308.getClass(), "notificationsUrl", null);
        setField(term291308, term291308.getClass(), "labelsUrl", null);
        setField(term291308, term291308.getClass(), "releasesUrl", null);
        setField(term291308, term291308.getClass(), "deploymentsUrl", null);
        setField(term291308, term291308.getClass(), "createdAt", null);
        setField(term291308, term291308.getClass(), "updatedAt", null);
        setField(term291308, term291308.getClass(), "pushedAt", null);
        setField(term291308, term291308.getClass(), "gitUrl", null);
        setField(term291308, term291308.getClass(), "sshUrl", null);
        setField(term291308, term291308.getClass(), "cloneUrl", null);
        setField(term291308, term291308.getClass(), "svnUrl", null);
        setField(term291308, term291308.getClass(), "homepage", null);
        setField(term291308, term291308.getClass(), "size", null);
        setField(term291308, term291308.getClass(), "stargazersCount", null);
        setField(term291308, term291308.getClass(), "watchersCount", null);
        setField(term291308, term291308.getClass(), "language", null);
        setField(term291308, term291308.getClass(), "hasIssues", null);
        setField(term291308, term291308.getClass(), "hasProjects", null);
        setField(term291308, term291308.getClass(), "hasDownloads", null);
        setField(term291308, term291308.getClass(), "hasWiki", null);
        setField(term291308, term291308.getClass(), "hasPages", null);
        setField(term291308, term291308.getClass(), "forksCount", null);
        setField(term291308, term291308.getClass(), "archived", null);
        setField(term291308, term291308.getClass(), "disabled", null);
        setField(term291308, term291308.getClass(), "openIssuesCount", null);
        setField(term291308, term291308.getClass(), "license", null);
        setField(term291308, term291308.getClass(), "allowForking", null);
        setField(term291308, term291308.getClass(), "isTemplate", null);
        setField(term291308, term291308.getClass(), "topics", null);
        setField(term291308, term291308.getClass(), "visibility", null);
        setField(term291308, term291308.getClass(), "forks", null);
        setField(term291308, term291308.getClass(), "openIssues", null);
        setField(term291308, term291308.getClass(), "watchers", null);
        setField(term291308, term291308.getClass(), "defaultBranch", null);
        setField(term291308, term291308.getClass(), "networkCount", null);
        setField(term291308, term291308.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForksCount", argTypes, term291308, args);
    }

};


