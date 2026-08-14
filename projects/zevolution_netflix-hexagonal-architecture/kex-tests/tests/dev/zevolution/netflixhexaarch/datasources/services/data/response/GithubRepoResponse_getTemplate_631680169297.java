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

public class GithubRepoResponse_getTemplate_631680169297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291320;

    public GithubRepoResponse_getTemplate_631680169297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291320 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291320, term291320.getClass(), "id", null);
        setField(term291320, term291320.getClass(), "nodeId", null);
        setField(term291320, term291320.getClass(), "name", null);
        setField(term291320, term291320.getClass(), "fullName", null);
        setField(term291320, term291320.getClass(), "_private", null);
        setField(term291320, term291320.getClass(), "owner", null);
        setField(term291320, term291320.getClass(), "htmlUrl", null);
        setField(term291320, term291320.getClass(), "description", null);
        setField(term291320, term291320.getClass(), "fork", null);
        setField(term291320, term291320.getClass(), "url", null);
        setField(term291320, term291320.getClass(), "forksUrl", null);
        setField(term291320, term291320.getClass(), "keysUrl", null);
        setField(term291320, term291320.getClass(), "collaboratorsUrl", null);
        setField(term291320, term291320.getClass(), "teamsUrl", null);
        setField(term291320, term291320.getClass(), "hooksUrl", null);
        setField(term291320, term291320.getClass(), "issueEventsUrl", null);
        setField(term291320, term291320.getClass(), "eventsUrl", null);
        setField(term291320, term291320.getClass(), "assigneesUrl", null);
        setField(term291320, term291320.getClass(), "branchesUrl", null);
        setField(term291320, term291320.getClass(), "tagsUrl", null);
        setField(term291320, term291320.getClass(), "blobsUrl", null);
        setField(term291320, term291320.getClass(), "gitTagsUrl", null);
        setField(term291320, term291320.getClass(), "gitRefsUrl", null);
        setField(term291320, term291320.getClass(), "treesUrl", null);
        setField(term291320, term291320.getClass(), "statusesUrl", null);
        setField(term291320, term291320.getClass(), "languagesUrl", null);
        setField(term291320, term291320.getClass(), "stargazersUrl", null);
        setField(term291320, term291320.getClass(), "contributorsUrl", null);
        setField(term291320, term291320.getClass(), "subscribersUrl", null);
        setField(term291320, term291320.getClass(), "subscriptionUrl", null);
        setField(term291320, term291320.getClass(), "commitsUrl", null);
        setField(term291320, term291320.getClass(), "gitCommitsUrl", null);
        setField(term291320, term291320.getClass(), "commentsUrl", null);
        setField(term291320, term291320.getClass(), "issueCommentUrl", null);
        setField(term291320, term291320.getClass(), "contentsUrl", null);
        setField(term291320, term291320.getClass(), "compareUrl", null);
        setField(term291320, term291320.getClass(), "mergesUrl", null);
        setField(term291320, term291320.getClass(), "archiveUrl", null);
        setField(term291320, term291320.getClass(), "downloadsUrl", null);
        setField(term291320, term291320.getClass(), "issuesUrl", null);
        setField(term291320, term291320.getClass(), "pullsUrl", null);
        setField(term291320, term291320.getClass(), "milestonesUrl", null);
        setField(term291320, term291320.getClass(), "notificationsUrl", null);
        setField(term291320, term291320.getClass(), "labelsUrl", null);
        setField(term291320, term291320.getClass(), "releasesUrl", null);
        setField(term291320, term291320.getClass(), "deploymentsUrl", null);
        setField(term291320, term291320.getClass(), "createdAt", null);
        setField(term291320, term291320.getClass(), "updatedAt", null);
        setField(term291320, term291320.getClass(), "pushedAt", null);
        setField(term291320, term291320.getClass(), "gitUrl", null);
        setField(term291320, term291320.getClass(), "sshUrl", null);
        setField(term291320, term291320.getClass(), "cloneUrl", null);
        setField(term291320, term291320.getClass(), "svnUrl", null);
        setField(term291320, term291320.getClass(), "homepage", null);
        setField(term291320, term291320.getClass(), "size", null);
        setField(term291320, term291320.getClass(), "stargazersCount", null);
        setField(term291320, term291320.getClass(), "watchersCount", null);
        setField(term291320, term291320.getClass(), "language", null);
        setField(term291320, term291320.getClass(), "hasIssues", null);
        setField(term291320, term291320.getClass(), "hasProjects", null);
        setField(term291320, term291320.getClass(), "hasDownloads", null);
        setField(term291320, term291320.getClass(), "hasWiki", null);
        setField(term291320, term291320.getClass(), "hasPages", null);
        setField(term291320, term291320.getClass(), "forksCount", null);
        setField(term291320, term291320.getClass(), "archived", null);
        setField(term291320, term291320.getClass(), "disabled", null);
        setField(term291320, term291320.getClass(), "openIssuesCount", null);
        setField(term291320, term291320.getClass(), "license", null);
        setField(term291320, term291320.getClass(), "allowForking", null);
        setField(term291320, term291320.getClass(), "isTemplate", null);
        setField(term291320, term291320.getClass(), "topics", null);
        setField(term291320, term291320.getClass(), "visibility", null);
        setField(term291320, term291320.getClass(), "forks", null);
        setField(term291320, term291320.getClass(), "openIssues", null);
        setField(term291320, term291320.getClass(), "watchers", null);
        setField(term291320, term291320.getClass(), "defaultBranch", null);
        setField(term291320, term291320.getClass(), "networkCount", null);
        setField(term291320, term291320.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplate", argTypes, term291320, args);
    }

};


