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

public class GithubRepoResponse_setPushedAt_906732062255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291278;

    public GithubRepoResponse_setPushedAt_906732062255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291278 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291278, term291278.getClass(), "id", null);
        setField(term291278, term291278.getClass(), "nodeId", null);
        setField(term291278, term291278.getClass(), "name", null);
        setField(term291278, term291278.getClass(), "fullName", null);
        setField(term291278, term291278.getClass(), "_private", null);
        setField(term291278, term291278.getClass(), "owner", null);
        setField(term291278, term291278.getClass(), "htmlUrl", null);
        setField(term291278, term291278.getClass(), "description", null);
        setField(term291278, term291278.getClass(), "fork", null);
        setField(term291278, term291278.getClass(), "url", null);
        setField(term291278, term291278.getClass(), "forksUrl", null);
        setField(term291278, term291278.getClass(), "keysUrl", null);
        setField(term291278, term291278.getClass(), "collaboratorsUrl", null);
        setField(term291278, term291278.getClass(), "teamsUrl", null);
        setField(term291278, term291278.getClass(), "hooksUrl", null);
        setField(term291278, term291278.getClass(), "issueEventsUrl", null);
        setField(term291278, term291278.getClass(), "eventsUrl", null);
        setField(term291278, term291278.getClass(), "assigneesUrl", null);
        setField(term291278, term291278.getClass(), "branchesUrl", null);
        setField(term291278, term291278.getClass(), "tagsUrl", null);
        setField(term291278, term291278.getClass(), "blobsUrl", null);
        setField(term291278, term291278.getClass(), "gitTagsUrl", null);
        setField(term291278, term291278.getClass(), "gitRefsUrl", null);
        setField(term291278, term291278.getClass(), "treesUrl", null);
        setField(term291278, term291278.getClass(), "statusesUrl", null);
        setField(term291278, term291278.getClass(), "languagesUrl", null);
        setField(term291278, term291278.getClass(), "stargazersUrl", null);
        setField(term291278, term291278.getClass(), "contributorsUrl", null);
        setField(term291278, term291278.getClass(), "subscribersUrl", null);
        setField(term291278, term291278.getClass(), "subscriptionUrl", null);
        setField(term291278, term291278.getClass(), "commitsUrl", null);
        setField(term291278, term291278.getClass(), "gitCommitsUrl", null);
        setField(term291278, term291278.getClass(), "commentsUrl", null);
        setField(term291278, term291278.getClass(), "issueCommentUrl", null);
        setField(term291278, term291278.getClass(), "contentsUrl", null);
        setField(term291278, term291278.getClass(), "compareUrl", null);
        setField(term291278, term291278.getClass(), "mergesUrl", null);
        setField(term291278, term291278.getClass(), "archiveUrl", null);
        setField(term291278, term291278.getClass(), "downloadsUrl", null);
        setField(term291278, term291278.getClass(), "issuesUrl", null);
        setField(term291278, term291278.getClass(), "pullsUrl", null);
        setField(term291278, term291278.getClass(), "milestonesUrl", null);
        setField(term291278, term291278.getClass(), "notificationsUrl", null);
        setField(term291278, term291278.getClass(), "labelsUrl", null);
        setField(term291278, term291278.getClass(), "releasesUrl", null);
        setField(term291278, term291278.getClass(), "deploymentsUrl", null);
        setField(term291278, term291278.getClass(), "createdAt", null);
        setField(term291278, term291278.getClass(), "updatedAt", null);
        setField(term291278, term291278.getClass(), "pushedAt", null);
        setField(term291278, term291278.getClass(), "gitUrl", null);
        setField(term291278, term291278.getClass(), "sshUrl", null);
        setField(term291278, term291278.getClass(), "cloneUrl", null);
        setField(term291278, term291278.getClass(), "svnUrl", null);
        setField(term291278, term291278.getClass(), "homepage", null);
        setField(term291278, term291278.getClass(), "size", null);
        setField(term291278, term291278.getClass(), "stargazersCount", null);
        setField(term291278, term291278.getClass(), "watchersCount", null);
        setField(term291278, term291278.getClass(), "language", null);
        setField(term291278, term291278.getClass(), "hasIssues", null);
        setField(term291278, term291278.getClass(), "hasProjects", null);
        setField(term291278, term291278.getClass(), "hasDownloads", null);
        setField(term291278, term291278.getClass(), "hasWiki", null);
        setField(term291278, term291278.getClass(), "hasPages", null);
        setField(term291278, term291278.getClass(), "forksCount", null);
        setField(term291278, term291278.getClass(), "archived", null);
        setField(term291278, term291278.getClass(), "disabled", null);
        setField(term291278, term291278.getClass(), "openIssuesCount", null);
        setField(term291278, term291278.getClass(), "license", null);
        setField(term291278, term291278.getClass(), "allowForking", null);
        setField(term291278, term291278.getClass(), "isTemplate", null);
        setField(term291278, term291278.getClass(), "topics", null);
        setField(term291278, term291278.getClass(), "visibility", null);
        setField(term291278, term291278.getClass(), "forks", null);
        setField(term291278, term291278.getClass(), "openIssues", null);
        setField(term291278, term291278.getClass(), "watchers", null);
        setField(term291278, term291278.getClass(), "defaultBranch", null);
        setField(term291278, term291278.getClass(), "networkCount", null);
        setField(term291278, term291278.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPushedAt", argTypes, term291278, args);
    }

};


