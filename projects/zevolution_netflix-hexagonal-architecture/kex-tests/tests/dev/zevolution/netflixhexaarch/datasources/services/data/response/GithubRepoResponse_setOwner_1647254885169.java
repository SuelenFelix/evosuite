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

public class GithubRepoResponse_setOwner_1647254885169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291192;

    public GithubRepoResponse_setOwner_1647254885169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291192 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291192, term291192.getClass(), "id", null);
        setField(term291192, term291192.getClass(), "nodeId", null);
        setField(term291192, term291192.getClass(), "name", null);
        setField(term291192, term291192.getClass(), "fullName", null);
        setField(term291192, term291192.getClass(), "_private", null);
        setField(term291192, term291192.getClass(), "owner", null);
        setField(term291192, term291192.getClass(), "htmlUrl", null);
        setField(term291192, term291192.getClass(), "description", null);
        setField(term291192, term291192.getClass(), "fork", null);
        setField(term291192, term291192.getClass(), "url", null);
        setField(term291192, term291192.getClass(), "forksUrl", null);
        setField(term291192, term291192.getClass(), "keysUrl", null);
        setField(term291192, term291192.getClass(), "collaboratorsUrl", null);
        setField(term291192, term291192.getClass(), "teamsUrl", null);
        setField(term291192, term291192.getClass(), "hooksUrl", null);
        setField(term291192, term291192.getClass(), "issueEventsUrl", null);
        setField(term291192, term291192.getClass(), "eventsUrl", null);
        setField(term291192, term291192.getClass(), "assigneesUrl", null);
        setField(term291192, term291192.getClass(), "branchesUrl", null);
        setField(term291192, term291192.getClass(), "tagsUrl", null);
        setField(term291192, term291192.getClass(), "blobsUrl", null);
        setField(term291192, term291192.getClass(), "gitTagsUrl", null);
        setField(term291192, term291192.getClass(), "gitRefsUrl", null);
        setField(term291192, term291192.getClass(), "treesUrl", null);
        setField(term291192, term291192.getClass(), "statusesUrl", null);
        setField(term291192, term291192.getClass(), "languagesUrl", null);
        setField(term291192, term291192.getClass(), "stargazersUrl", null);
        setField(term291192, term291192.getClass(), "contributorsUrl", null);
        setField(term291192, term291192.getClass(), "subscribersUrl", null);
        setField(term291192, term291192.getClass(), "subscriptionUrl", null);
        setField(term291192, term291192.getClass(), "commitsUrl", null);
        setField(term291192, term291192.getClass(), "gitCommitsUrl", null);
        setField(term291192, term291192.getClass(), "commentsUrl", null);
        setField(term291192, term291192.getClass(), "issueCommentUrl", null);
        setField(term291192, term291192.getClass(), "contentsUrl", null);
        setField(term291192, term291192.getClass(), "compareUrl", null);
        setField(term291192, term291192.getClass(), "mergesUrl", null);
        setField(term291192, term291192.getClass(), "archiveUrl", null);
        setField(term291192, term291192.getClass(), "downloadsUrl", null);
        setField(term291192, term291192.getClass(), "issuesUrl", null);
        setField(term291192, term291192.getClass(), "pullsUrl", null);
        setField(term291192, term291192.getClass(), "milestonesUrl", null);
        setField(term291192, term291192.getClass(), "notificationsUrl", null);
        setField(term291192, term291192.getClass(), "labelsUrl", null);
        setField(term291192, term291192.getClass(), "releasesUrl", null);
        setField(term291192, term291192.getClass(), "deploymentsUrl", null);
        setField(term291192, term291192.getClass(), "createdAt", null);
        setField(term291192, term291192.getClass(), "updatedAt", null);
        setField(term291192, term291192.getClass(), "pushedAt", null);
        setField(term291192, term291192.getClass(), "gitUrl", null);
        setField(term291192, term291192.getClass(), "sshUrl", null);
        setField(term291192, term291192.getClass(), "cloneUrl", null);
        setField(term291192, term291192.getClass(), "svnUrl", null);
        setField(term291192, term291192.getClass(), "homepage", null);
        setField(term291192, term291192.getClass(), "size", null);
        setField(term291192, term291192.getClass(), "stargazersCount", null);
        setField(term291192, term291192.getClass(), "watchersCount", null);
        setField(term291192, term291192.getClass(), "language", null);
        setField(term291192, term291192.getClass(), "hasIssues", null);
        setField(term291192, term291192.getClass(), "hasProjects", null);
        setField(term291192, term291192.getClass(), "hasDownloads", null);
        setField(term291192, term291192.getClass(), "hasWiki", null);
        setField(term291192, term291192.getClass(), "hasPages", null);
        setField(term291192, term291192.getClass(), "forksCount", null);
        setField(term291192, term291192.getClass(), "archived", null);
        setField(term291192, term291192.getClass(), "disabled", null);
        setField(term291192, term291192.getClass(), "openIssuesCount", null);
        setField(term291192, term291192.getClass(), "license", null);
        setField(term291192, term291192.getClass(), "allowForking", null);
        setField(term291192, term291192.getClass(), "isTemplate", null);
        setField(term291192, term291192.getClass(), "topics", null);
        setField(term291192, term291192.getClass(), "visibility", null);
        setField(term291192, term291192.getClass(), "forks", null);
        setField(term291192, term291192.getClass(), "openIssues", null);
        setField(term291192, term291192.getClass(), "watchers", null);
        setField(term291192, term291192.getClass(), "defaultBranch", null);
        setField(term291192, term291192.getClass(), "networkCount", null);
        setField(term291192, term291192.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOwner", argTypes, term291192, args);
    }

};


