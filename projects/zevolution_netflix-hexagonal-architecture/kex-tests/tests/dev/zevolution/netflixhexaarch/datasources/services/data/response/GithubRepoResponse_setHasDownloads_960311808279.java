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

public class GithubRepoResponse_setHasDownloads_960311808279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291302;

    public GithubRepoResponse_setHasDownloads_960311808279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291302 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291302, term291302.getClass(), "id", null);
        setField(term291302, term291302.getClass(), "nodeId", null);
        setField(term291302, term291302.getClass(), "name", null);
        setField(term291302, term291302.getClass(), "fullName", null);
        setField(term291302, term291302.getClass(), "_private", null);
        setField(term291302, term291302.getClass(), "owner", null);
        setField(term291302, term291302.getClass(), "htmlUrl", null);
        setField(term291302, term291302.getClass(), "description", null);
        setField(term291302, term291302.getClass(), "fork", null);
        setField(term291302, term291302.getClass(), "url", null);
        setField(term291302, term291302.getClass(), "forksUrl", null);
        setField(term291302, term291302.getClass(), "keysUrl", null);
        setField(term291302, term291302.getClass(), "collaboratorsUrl", null);
        setField(term291302, term291302.getClass(), "teamsUrl", null);
        setField(term291302, term291302.getClass(), "hooksUrl", null);
        setField(term291302, term291302.getClass(), "issueEventsUrl", null);
        setField(term291302, term291302.getClass(), "eventsUrl", null);
        setField(term291302, term291302.getClass(), "assigneesUrl", null);
        setField(term291302, term291302.getClass(), "branchesUrl", null);
        setField(term291302, term291302.getClass(), "tagsUrl", null);
        setField(term291302, term291302.getClass(), "blobsUrl", null);
        setField(term291302, term291302.getClass(), "gitTagsUrl", null);
        setField(term291302, term291302.getClass(), "gitRefsUrl", null);
        setField(term291302, term291302.getClass(), "treesUrl", null);
        setField(term291302, term291302.getClass(), "statusesUrl", null);
        setField(term291302, term291302.getClass(), "languagesUrl", null);
        setField(term291302, term291302.getClass(), "stargazersUrl", null);
        setField(term291302, term291302.getClass(), "contributorsUrl", null);
        setField(term291302, term291302.getClass(), "subscribersUrl", null);
        setField(term291302, term291302.getClass(), "subscriptionUrl", null);
        setField(term291302, term291302.getClass(), "commitsUrl", null);
        setField(term291302, term291302.getClass(), "gitCommitsUrl", null);
        setField(term291302, term291302.getClass(), "commentsUrl", null);
        setField(term291302, term291302.getClass(), "issueCommentUrl", null);
        setField(term291302, term291302.getClass(), "contentsUrl", null);
        setField(term291302, term291302.getClass(), "compareUrl", null);
        setField(term291302, term291302.getClass(), "mergesUrl", null);
        setField(term291302, term291302.getClass(), "archiveUrl", null);
        setField(term291302, term291302.getClass(), "downloadsUrl", null);
        setField(term291302, term291302.getClass(), "issuesUrl", null);
        setField(term291302, term291302.getClass(), "pullsUrl", null);
        setField(term291302, term291302.getClass(), "milestonesUrl", null);
        setField(term291302, term291302.getClass(), "notificationsUrl", null);
        setField(term291302, term291302.getClass(), "labelsUrl", null);
        setField(term291302, term291302.getClass(), "releasesUrl", null);
        setField(term291302, term291302.getClass(), "deploymentsUrl", null);
        setField(term291302, term291302.getClass(), "createdAt", null);
        setField(term291302, term291302.getClass(), "updatedAt", null);
        setField(term291302, term291302.getClass(), "pushedAt", null);
        setField(term291302, term291302.getClass(), "gitUrl", null);
        setField(term291302, term291302.getClass(), "sshUrl", null);
        setField(term291302, term291302.getClass(), "cloneUrl", null);
        setField(term291302, term291302.getClass(), "svnUrl", null);
        setField(term291302, term291302.getClass(), "homepage", null);
        setField(term291302, term291302.getClass(), "size", null);
        setField(term291302, term291302.getClass(), "stargazersCount", null);
        setField(term291302, term291302.getClass(), "watchersCount", null);
        setField(term291302, term291302.getClass(), "language", null);
        setField(term291302, term291302.getClass(), "hasIssues", null);
        setField(term291302, term291302.getClass(), "hasProjects", null);
        setField(term291302, term291302.getClass(), "hasDownloads", null);
        setField(term291302, term291302.getClass(), "hasWiki", null);
        setField(term291302, term291302.getClass(), "hasPages", null);
        setField(term291302, term291302.getClass(), "forksCount", null);
        setField(term291302, term291302.getClass(), "archived", null);
        setField(term291302, term291302.getClass(), "disabled", null);
        setField(term291302, term291302.getClass(), "openIssuesCount", null);
        setField(term291302, term291302.getClass(), "license", null);
        setField(term291302, term291302.getClass(), "allowForking", null);
        setField(term291302, term291302.getClass(), "isTemplate", null);
        setField(term291302, term291302.getClass(), "topics", null);
        setField(term291302, term291302.getClass(), "visibility", null);
        setField(term291302, term291302.getClass(), "forks", null);
        setField(term291302, term291302.getClass(), "openIssues", null);
        setField(term291302, term291302.getClass(), "watchers", null);
        setField(term291302, term291302.getClass(), "defaultBranch", null);
        setField(term291302, term291302.getClass(), "networkCount", null);
        setField(term291302, term291302.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasDownloads", argTypes, term291302, args);
    }

};


