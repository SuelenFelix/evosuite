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

public class GithubRepoResponse_getTemplate_631680169296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291319;

    public GithubRepoResponse_getTemplate_631680169296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291319 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291319, term291319.getClass(), "id", null);
        setField(term291319, term291319.getClass(), "nodeId", null);
        setField(term291319, term291319.getClass(), "name", null);
        setField(term291319, term291319.getClass(), "fullName", null);
        setField(term291319, term291319.getClass(), "_private", null);
        setField(term291319, term291319.getClass(), "owner", null);
        setField(term291319, term291319.getClass(), "htmlUrl", null);
        setField(term291319, term291319.getClass(), "description", null);
        setField(term291319, term291319.getClass(), "fork", null);
        setField(term291319, term291319.getClass(), "url", null);
        setField(term291319, term291319.getClass(), "forksUrl", null);
        setField(term291319, term291319.getClass(), "keysUrl", null);
        setField(term291319, term291319.getClass(), "collaboratorsUrl", null);
        setField(term291319, term291319.getClass(), "teamsUrl", null);
        setField(term291319, term291319.getClass(), "hooksUrl", null);
        setField(term291319, term291319.getClass(), "issueEventsUrl", null);
        setField(term291319, term291319.getClass(), "eventsUrl", null);
        setField(term291319, term291319.getClass(), "assigneesUrl", null);
        setField(term291319, term291319.getClass(), "branchesUrl", null);
        setField(term291319, term291319.getClass(), "tagsUrl", null);
        setField(term291319, term291319.getClass(), "blobsUrl", null);
        setField(term291319, term291319.getClass(), "gitTagsUrl", null);
        setField(term291319, term291319.getClass(), "gitRefsUrl", null);
        setField(term291319, term291319.getClass(), "treesUrl", null);
        setField(term291319, term291319.getClass(), "statusesUrl", null);
        setField(term291319, term291319.getClass(), "languagesUrl", null);
        setField(term291319, term291319.getClass(), "stargazersUrl", null);
        setField(term291319, term291319.getClass(), "contributorsUrl", null);
        setField(term291319, term291319.getClass(), "subscribersUrl", null);
        setField(term291319, term291319.getClass(), "subscriptionUrl", null);
        setField(term291319, term291319.getClass(), "commitsUrl", null);
        setField(term291319, term291319.getClass(), "gitCommitsUrl", null);
        setField(term291319, term291319.getClass(), "commentsUrl", null);
        setField(term291319, term291319.getClass(), "issueCommentUrl", null);
        setField(term291319, term291319.getClass(), "contentsUrl", null);
        setField(term291319, term291319.getClass(), "compareUrl", null);
        setField(term291319, term291319.getClass(), "mergesUrl", null);
        setField(term291319, term291319.getClass(), "archiveUrl", null);
        setField(term291319, term291319.getClass(), "downloadsUrl", null);
        setField(term291319, term291319.getClass(), "issuesUrl", null);
        setField(term291319, term291319.getClass(), "pullsUrl", null);
        setField(term291319, term291319.getClass(), "milestonesUrl", null);
        setField(term291319, term291319.getClass(), "notificationsUrl", null);
        setField(term291319, term291319.getClass(), "labelsUrl", null);
        setField(term291319, term291319.getClass(), "releasesUrl", null);
        setField(term291319, term291319.getClass(), "deploymentsUrl", null);
        setField(term291319, term291319.getClass(), "createdAt", null);
        setField(term291319, term291319.getClass(), "updatedAt", null);
        setField(term291319, term291319.getClass(), "pushedAt", null);
        setField(term291319, term291319.getClass(), "gitUrl", null);
        setField(term291319, term291319.getClass(), "sshUrl", null);
        setField(term291319, term291319.getClass(), "cloneUrl", null);
        setField(term291319, term291319.getClass(), "svnUrl", null);
        setField(term291319, term291319.getClass(), "homepage", null);
        setField(term291319, term291319.getClass(), "size", null);
        setField(term291319, term291319.getClass(), "stargazersCount", null);
        setField(term291319, term291319.getClass(), "watchersCount", null);
        setField(term291319, term291319.getClass(), "language", null);
        setField(term291319, term291319.getClass(), "hasIssues", null);
        setField(term291319, term291319.getClass(), "hasProjects", null);
        setField(term291319, term291319.getClass(), "hasDownloads", null);
        setField(term291319, term291319.getClass(), "hasWiki", null);
        setField(term291319, term291319.getClass(), "hasPages", null);
        setField(term291319, term291319.getClass(), "forksCount", null);
        setField(term291319, term291319.getClass(), "archived", null);
        setField(term291319, term291319.getClass(), "disabled", null);
        setField(term291319, term291319.getClass(), "openIssuesCount", null);
        setField(term291319, term291319.getClass(), "license", null);
        setField(term291319, term291319.getClass(), "allowForking", null);
        setField(term291319, term291319.getClass(), "isTemplate", null);
        setField(term291319, term291319.getClass(), "topics", null);
        setField(term291319, term291319.getClass(), "visibility", null);
        setField(term291319, term291319.getClass(), "forks", null);
        setField(term291319, term291319.getClass(), "openIssues", null);
        setField(term291319, term291319.getClass(), "watchers", null);
        setField(term291319, term291319.getClass(), "defaultBranch", null);
        setField(term291319, term291319.getClass(), "networkCount", null);
        setField(term291319, term291319.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplate", argTypes, term291319, args);
    }

};


