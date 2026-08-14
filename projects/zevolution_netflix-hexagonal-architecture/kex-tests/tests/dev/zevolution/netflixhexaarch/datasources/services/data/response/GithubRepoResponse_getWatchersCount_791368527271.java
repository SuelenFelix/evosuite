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

public class GithubRepoResponse_getWatchersCount_791368527271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291294;

    public GithubRepoResponse_getWatchersCount_791368527271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291294 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291294, term291294.getClass(), "id", null);
        setField(term291294, term291294.getClass(), "nodeId", null);
        setField(term291294, term291294.getClass(), "name", null);
        setField(term291294, term291294.getClass(), "fullName", null);
        setField(term291294, term291294.getClass(), "_private", null);
        setField(term291294, term291294.getClass(), "owner", null);
        setField(term291294, term291294.getClass(), "htmlUrl", null);
        setField(term291294, term291294.getClass(), "description", null);
        setField(term291294, term291294.getClass(), "fork", null);
        setField(term291294, term291294.getClass(), "url", null);
        setField(term291294, term291294.getClass(), "forksUrl", null);
        setField(term291294, term291294.getClass(), "keysUrl", null);
        setField(term291294, term291294.getClass(), "collaboratorsUrl", null);
        setField(term291294, term291294.getClass(), "teamsUrl", null);
        setField(term291294, term291294.getClass(), "hooksUrl", null);
        setField(term291294, term291294.getClass(), "issueEventsUrl", null);
        setField(term291294, term291294.getClass(), "eventsUrl", null);
        setField(term291294, term291294.getClass(), "assigneesUrl", null);
        setField(term291294, term291294.getClass(), "branchesUrl", null);
        setField(term291294, term291294.getClass(), "tagsUrl", null);
        setField(term291294, term291294.getClass(), "blobsUrl", null);
        setField(term291294, term291294.getClass(), "gitTagsUrl", null);
        setField(term291294, term291294.getClass(), "gitRefsUrl", null);
        setField(term291294, term291294.getClass(), "treesUrl", null);
        setField(term291294, term291294.getClass(), "statusesUrl", null);
        setField(term291294, term291294.getClass(), "languagesUrl", null);
        setField(term291294, term291294.getClass(), "stargazersUrl", null);
        setField(term291294, term291294.getClass(), "contributorsUrl", null);
        setField(term291294, term291294.getClass(), "subscribersUrl", null);
        setField(term291294, term291294.getClass(), "subscriptionUrl", null);
        setField(term291294, term291294.getClass(), "commitsUrl", null);
        setField(term291294, term291294.getClass(), "gitCommitsUrl", null);
        setField(term291294, term291294.getClass(), "commentsUrl", null);
        setField(term291294, term291294.getClass(), "issueCommentUrl", null);
        setField(term291294, term291294.getClass(), "contentsUrl", null);
        setField(term291294, term291294.getClass(), "compareUrl", null);
        setField(term291294, term291294.getClass(), "mergesUrl", null);
        setField(term291294, term291294.getClass(), "archiveUrl", null);
        setField(term291294, term291294.getClass(), "downloadsUrl", null);
        setField(term291294, term291294.getClass(), "issuesUrl", null);
        setField(term291294, term291294.getClass(), "pullsUrl", null);
        setField(term291294, term291294.getClass(), "milestonesUrl", null);
        setField(term291294, term291294.getClass(), "notificationsUrl", null);
        setField(term291294, term291294.getClass(), "labelsUrl", null);
        setField(term291294, term291294.getClass(), "releasesUrl", null);
        setField(term291294, term291294.getClass(), "deploymentsUrl", null);
        setField(term291294, term291294.getClass(), "createdAt", null);
        setField(term291294, term291294.getClass(), "updatedAt", null);
        setField(term291294, term291294.getClass(), "pushedAt", null);
        setField(term291294, term291294.getClass(), "gitUrl", null);
        setField(term291294, term291294.getClass(), "sshUrl", null);
        setField(term291294, term291294.getClass(), "cloneUrl", null);
        setField(term291294, term291294.getClass(), "svnUrl", null);
        setField(term291294, term291294.getClass(), "homepage", null);
        setField(term291294, term291294.getClass(), "size", null);
        setField(term291294, term291294.getClass(), "stargazersCount", null);
        setField(term291294, term291294.getClass(), "watchersCount", null);
        setField(term291294, term291294.getClass(), "language", null);
        setField(term291294, term291294.getClass(), "hasIssues", null);
        setField(term291294, term291294.getClass(), "hasProjects", null);
        setField(term291294, term291294.getClass(), "hasDownloads", null);
        setField(term291294, term291294.getClass(), "hasWiki", null);
        setField(term291294, term291294.getClass(), "hasPages", null);
        setField(term291294, term291294.getClass(), "forksCount", null);
        setField(term291294, term291294.getClass(), "archived", null);
        setField(term291294, term291294.getClass(), "disabled", null);
        setField(term291294, term291294.getClass(), "openIssuesCount", null);
        setField(term291294, term291294.getClass(), "license", null);
        setField(term291294, term291294.getClass(), "allowForking", null);
        setField(term291294, term291294.getClass(), "isTemplate", null);
        setField(term291294, term291294.getClass(), "topics", null);
        setField(term291294, term291294.getClass(), "visibility", null);
        setField(term291294, term291294.getClass(), "forks", null);
        setField(term291294, term291294.getClass(), "openIssues", null);
        setField(term291294, term291294.getClass(), "watchers", null);
        setField(term291294, term291294.getClass(), "defaultBranch", null);
        setField(term291294, term291294.getClass(), "networkCount", null);
        setField(term291294, term291294.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWatchersCount", argTypes, term291294, args);
    }

};


