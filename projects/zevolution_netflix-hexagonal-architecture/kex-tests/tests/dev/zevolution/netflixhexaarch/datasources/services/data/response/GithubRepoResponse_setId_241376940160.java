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

public class GithubRepoResponse_setId_241376940160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291183;

    public GithubRepoResponse_setId_241376940160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291183 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291183, term291183.getClass(), "id", null);
        setField(term291183, term291183.getClass(), "nodeId", null);
        setField(term291183, term291183.getClass(), "name", null);
        setField(term291183, term291183.getClass(), "fullName", null);
        setField(term291183, term291183.getClass(), "_private", null);
        setField(term291183, term291183.getClass(), "owner", null);
        setField(term291183, term291183.getClass(), "htmlUrl", null);
        setField(term291183, term291183.getClass(), "description", null);
        setField(term291183, term291183.getClass(), "fork", null);
        setField(term291183, term291183.getClass(), "url", null);
        setField(term291183, term291183.getClass(), "forksUrl", null);
        setField(term291183, term291183.getClass(), "keysUrl", null);
        setField(term291183, term291183.getClass(), "collaboratorsUrl", null);
        setField(term291183, term291183.getClass(), "teamsUrl", null);
        setField(term291183, term291183.getClass(), "hooksUrl", null);
        setField(term291183, term291183.getClass(), "issueEventsUrl", null);
        setField(term291183, term291183.getClass(), "eventsUrl", null);
        setField(term291183, term291183.getClass(), "assigneesUrl", null);
        setField(term291183, term291183.getClass(), "branchesUrl", null);
        setField(term291183, term291183.getClass(), "tagsUrl", null);
        setField(term291183, term291183.getClass(), "blobsUrl", null);
        setField(term291183, term291183.getClass(), "gitTagsUrl", null);
        setField(term291183, term291183.getClass(), "gitRefsUrl", null);
        setField(term291183, term291183.getClass(), "treesUrl", null);
        setField(term291183, term291183.getClass(), "statusesUrl", null);
        setField(term291183, term291183.getClass(), "languagesUrl", null);
        setField(term291183, term291183.getClass(), "stargazersUrl", null);
        setField(term291183, term291183.getClass(), "contributorsUrl", null);
        setField(term291183, term291183.getClass(), "subscribersUrl", null);
        setField(term291183, term291183.getClass(), "subscriptionUrl", null);
        setField(term291183, term291183.getClass(), "commitsUrl", null);
        setField(term291183, term291183.getClass(), "gitCommitsUrl", null);
        setField(term291183, term291183.getClass(), "commentsUrl", null);
        setField(term291183, term291183.getClass(), "issueCommentUrl", null);
        setField(term291183, term291183.getClass(), "contentsUrl", null);
        setField(term291183, term291183.getClass(), "compareUrl", null);
        setField(term291183, term291183.getClass(), "mergesUrl", null);
        setField(term291183, term291183.getClass(), "archiveUrl", null);
        setField(term291183, term291183.getClass(), "downloadsUrl", null);
        setField(term291183, term291183.getClass(), "issuesUrl", null);
        setField(term291183, term291183.getClass(), "pullsUrl", null);
        setField(term291183, term291183.getClass(), "milestonesUrl", null);
        setField(term291183, term291183.getClass(), "notificationsUrl", null);
        setField(term291183, term291183.getClass(), "labelsUrl", null);
        setField(term291183, term291183.getClass(), "releasesUrl", null);
        setField(term291183, term291183.getClass(), "deploymentsUrl", null);
        setField(term291183, term291183.getClass(), "createdAt", null);
        setField(term291183, term291183.getClass(), "updatedAt", null);
        setField(term291183, term291183.getClass(), "pushedAt", null);
        setField(term291183, term291183.getClass(), "gitUrl", null);
        setField(term291183, term291183.getClass(), "sshUrl", null);
        setField(term291183, term291183.getClass(), "cloneUrl", null);
        setField(term291183, term291183.getClass(), "svnUrl", null);
        setField(term291183, term291183.getClass(), "homepage", null);
        setField(term291183, term291183.getClass(), "size", null);
        setField(term291183, term291183.getClass(), "stargazersCount", null);
        setField(term291183, term291183.getClass(), "watchersCount", null);
        setField(term291183, term291183.getClass(), "language", null);
        setField(term291183, term291183.getClass(), "hasIssues", null);
        setField(term291183, term291183.getClass(), "hasProjects", null);
        setField(term291183, term291183.getClass(), "hasDownloads", null);
        setField(term291183, term291183.getClass(), "hasWiki", null);
        setField(term291183, term291183.getClass(), "hasPages", null);
        setField(term291183, term291183.getClass(), "forksCount", null);
        setField(term291183, term291183.getClass(), "archived", null);
        setField(term291183, term291183.getClass(), "disabled", null);
        setField(term291183, term291183.getClass(), "openIssuesCount", null);
        setField(term291183, term291183.getClass(), "license", null);
        setField(term291183, term291183.getClass(), "allowForking", null);
        setField(term291183, term291183.getClass(), "isTemplate", null);
        setField(term291183, term291183.getClass(), "topics", null);
        setField(term291183, term291183.getClass(), "visibility", null);
        setField(term291183, term291183.getClass(), "forks", null);
        setField(term291183, term291183.getClass(), "openIssues", null);
        setField(term291183, term291183.getClass(), "watchers", null);
        setField(term291183, term291183.getClass(), "defaultBranch", null);
        setField(term291183, term291183.getClass(), "networkCount", null);
        setField(term291183, term291183.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term291183, args);
    }

};


