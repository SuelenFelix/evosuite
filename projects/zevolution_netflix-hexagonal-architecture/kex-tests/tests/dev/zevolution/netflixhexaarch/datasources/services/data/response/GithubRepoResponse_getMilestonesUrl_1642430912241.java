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

public class GithubRepoResponse_getMilestonesUrl_1642430912241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291264;

    public GithubRepoResponse_getMilestonesUrl_1642430912241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291264 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291264, term291264.getClass(), "id", null);
        setField(term291264, term291264.getClass(), "nodeId", null);
        setField(term291264, term291264.getClass(), "name", null);
        setField(term291264, term291264.getClass(), "fullName", null);
        setField(term291264, term291264.getClass(), "_private", null);
        setField(term291264, term291264.getClass(), "owner", null);
        setField(term291264, term291264.getClass(), "htmlUrl", null);
        setField(term291264, term291264.getClass(), "description", null);
        setField(term291264, term291264.getClass(), "fork", null);
        setField(term291264, term291264.getClass(), "url", null);
        setField(term291264, term291264.getClass(), "forksUrl", null);
        setField(term291264, term291264.getClass(), "keysUrl", null);
        setField(term291264, term291264.getClass(), "collaboratorsUrl", null);
        setField(term291264, term291264.getClass(), "teamsUrl", null);
        setField(term291264, term291264.getClass(), "hooksUrl", null);
        setField(term291264, term291264.getClass(), "issueEventsUrl", null);
        setField(term291264, term291264.getClass(), "eventsUrl", null);
        setField(term291264, term291264.getClass(), "assigneesUrl", null);
        setField(term291264, term291264.getClass(), "branchesUrl", null);
        setField(term291264, term291264.getClass(), "tagsUrl", null);
        setField(term291264, term291264.getClass(), "blobsUrl", null);
        setField(term291264, term291264.getClass(), "gitTagsUrl", null);
        setField(term291264, term291264.getClass(), "gitRefsUrl", null);
        setField(term291264, term291264.getClass(), "treesUrl", null);
        setField(term291264, term291264.getClass(), "statusesUrl", null);
        setField(term291264, term291264.getClass(), "languagesUrl", null);
        setField(term291264, term291264.getClass(), "stargazersUrl", null);
        setField(term291264, term291264.getClass(), "contributorsUrl", null);
        setField(term291264, term291264.getClass(), "subscribersUrl", null);
        setField(term291264, term291264.getClass(), "subscriptionUrl", null);
        setField(term291264, term291264.getClass(), "commitsUrl", null);
        setField(term291264, term291264.getClass(), "gitCommitsUrl", null);
        setField(term291264, term291264.getClass(), "commentsUrl", null);
        setField(term291264, term291264.getClass(), "issueCommentUrl", null);
        setField(term291264, term291264.getClass(), "contentsUrl", null);
        setField(term291264, term291264.getClass(), "compareUrl", null);
        setField(term291264, term291264.getClass(), "mergesUrl", null);
        setField(term291264, term291264.getClass(), "archiveUrl", null);
        setField(term291264, term291264.getClass(), "downloadsUrl", null);
        setField(term291264, term291264.getClass(), "issuesUrl", null);
        setField(term291264, term291264.getClass(), "pullsUrl", null);
        setField(term291264, term291264.getClass(), "milestonesUrl", null);
        setField(term291264, term291264.getClass(), "notificationsUrl", null);
        setField(term291264, term291264.getClass(), "labelsUrl", null);
        setField(term291264, term291264.getClass(), "releasesUrl", null);
        setField(term291264, term291264.getClass(), "deploymentsUrl", null);
        setField(term291264, term291264.getClass(), "createdAt", null);
        setField(term291264, term291264.getClass(), "updatedAt", null);
        setField(term291264, term291264.getClass(), "pushedAt", null);
        setField(term291264, term291264.getClass(), "gitUrl", null);
        setField(term291264, term291264.getClass(), "sshUrl", null);
        setField(term291264, term291264.getClass(), "cloneUrl", null);
        setField(term291264, term291264.getClass(), "svnUrl", null);
        setField(term291264, term291264.getClass(), "homepage", null);
        setField(term291264, term291264.getClass(), "size", null);
        setField(term291264, term291264.getClass(), "stargazersCount", null);
        setField(term291264, term291264.getClass(), "watchersCount", null);
        setField(term291264, term291264.getClass(), "language", null);
        setField(term291264, term291264.getClass(), "hasIssues", null);
        setField(term291264, term291264.getClass(), "hasProjects", null);
        setField(term291264, term291264.getClass(), "hasDownloads", null);
        setField(term291264, term291264.getClass(), "hasWiki", null);
        setField(term291264, term291264.getClass(), "hasPages", null);
        setField(term291264, term291264.getClass(), "forksCount", null);
        setField(term291264, term291264.getClass(), "archived", null);
        setField(term291264, term291264.getClass(), "disabled", null);
        setField(term291264, term291264.getClass(), "openIssuesCount", null);
        setField(term291264, term291264.getClass(), "license", null);
        setField(term291264, term291264.getClass(), "allowForking", null);
        setField(term291264, term291264.getClass(), "isTemplate", null);
        setField(term291264, term291264.getClass(), "topics", null);
        setField(term291264, term291264.getClass(), "visibility", null);
        setField(term291264, term291264.getClass(), "forks", null);
        setField(term291264, term291264.getClass(), "openIssues", null);
        setField(term291264, term291264.getClass(), "watchers", null);
        setField(term291264, term291264.getClass(), "defaultBranch", null);
        setField(term291264, term291264.getClass(), "networkCount", null);
        setField(term291264, term291264.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMilestonesUrl", argTypes, term291264, args);
    }

};


