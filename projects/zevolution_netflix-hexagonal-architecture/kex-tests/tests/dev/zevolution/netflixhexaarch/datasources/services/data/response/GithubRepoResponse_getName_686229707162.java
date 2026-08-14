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

public class GithubRepoResponse_getName_686229707162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291185;

    public GithubRepoResponse_getName_686229707162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291185 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291185, term291185.getClass(), "id", null);
        setField(term291185, term291185.getClass(), "nodeId", null);
        setField(term291185, term291185.getClass(), "name", null);
        setField(term291185, term291185.getClass(), "fullName", null);
        setField(term291185, term291185.getClass(), "_private", null);
        setField(term291185, term291185.getClass(), "owner", null);
        setField(term291185, term291185.getClass(), "htmlUrl", null);
        setField(term291185, term291185.getClass(), "description", null);
        setField(term291185, term291185.getClass(), "fork", null);
        setField(term291185, term291185.getClass(), "url", null);
        setField(term291185, term291185.getClass(), "forksUrl", null);
        setField(term291185, term291185.getClass(), "keysUrl", null);
        setField(term291185, term291185.getClass(), "collaboratorsUrl", null);
        setField(term291185, term291185.getClass(), "teamsUrl", null);
        setField(term291185, term291185.getClass(), "hooksUrl", null);
        setField(term291185, term291185.getClass(), "issueEventsUrl", null);
        setField(term291185, term291185.getClass(), "eventsUrl", null);
        setField(term291185, term291185.getClass(), "assigneesUrl", null);
        setField(term291185, term291185.getClass(), "branchesUrl", null);
        setField(term291185, term291185.getClass(), "tagsUrl", null);
        setField(term291185, term291185.getClass(), "blobsUrl", null);
        setField(term291185, term291185.getClass(), "gitTagsUrl", null);
        setField(term291185, term291185.getClass(), "gitRefsUrl", null);
        setField(term291185, term291185.getClass(), "treesUrl", null);
        setField(term291185, term291185.getClass(), "statusesUrl", null);
        setField(term291185, term291185.getClass(), "languagesUrl", null);
        setField(term291185, term291185.getClass(), "stargazersUrl", null);
        setField(term291185, term291185.getClass(), "contributorsUrl", null);
        setField(term291185, term291185.getClass(), "subscribersUrl", null);
        setField(term291185, term291185.getClass(), "subscriptionUrl", null);
        setField(term291185, term291185.getClass(), "commitsUrl", null);
        setField(term291185, term291185.getClass(), "gitCommitsUrl", null);
        setField(term291185, term291185.getClass(), "commentsUrl", null);
        setField(term291185, term291185.getClass(), "issueCommentUrl", null);
        setField(term291185, term291185.getClass(), "contentsUrl", null);
        setField(term291185, term291185.getClass(), "compareUrl", null);
        setField(term291185, term291185.getClass(), "mergesUrl", null);
        setField(term291185, term291185.getClass(), "archiveUrl", null);
        setField(term291185, term291185.getClass(), "downloadsUrl", null);
        setField(term291185, term291185.getClass(), "issuesUrl", null);
        setField(term291185, term291185.getClass(), "pullsUrl", null);
        setField(term291185, term291185.getClass(), "milestonesUrl", null);
        setField(term291185, term291185.getClass(), "notificationsUrl", null);
        setField(term291185, term291185.getClass(), "labelsUrl", null);
        setField(term291185, term291185.getClass(), "releasesUrl", null);
        setField(term291185, term291185.getClass(), "deploymentsUrl", null);
        setField(term291185, term291185.getClass(), "createdAt", null);
        setField(term291185, term291185.getClass(), "updatedAt", null);
        setField(term291185, term291185.getClass(), "pushedAt", null);
        setField(term291185, term291185.getClass(), "gitUrl", null);
        setField(term291185, term291185.getClass(), "sshUrl", null);
        setField(term291185, term291185.getClass(), "cloneUrl", null);
        setField(term291185, term291185.getClass(), "svnUrl", null);
        setField(term291185, term291185.getClass(), "homepage", null);
        setField(term291185, term291185.getClass(), "size", null);
        setField(term291185, term291185.getClass(), "stargazersCount", null);
        setField(term291185, term291185.getClass(), "watchersCount", null);
        setField(term291185, term291185.getClass(), "language", null);
        setField(term291185, term291185.getClass(), "hasIssues", null);
        setField(term291185, term291185.getClass(), "hasProjects", null);
        setField(term291185, term291185.getClass(), "hasDownloads", null);
        setField(term291185, term291185.getClass(), "hasWiki", null);
        setField(term291185, term291185.getClass(), "hasPages", null);
        setField(term291185, term291185.getClass(), "forksCount", null);
        setField(term291185, term291185.getClass(), "archived", null);
        setField(term291185, term291185.getClass(), "disabled", null);
        setField(term291185, term291185.getClass(), "openIssuesCount", null);
        setField(term291185, term291185.getClass(), "license", null);
        setField(term291185, term291185.getClass(), "allowForking", null);
        setField(term291185, term291185.getClass(), "isTemplate", null);
        setField(term291185, term291185.getClass(), "topics", null);
        setField(term291185, term291185.getClass(), "visibility", null);
        setField(term291185, term291185.getClass(), "forks", null);
        setField(term291185, term291185.getClass(), "openIssues", null);
        setField(term291185, term291185.getClass(), "watchers", null);
        setField(term291185, term291185.getClass(), "defaultBranch", null);
        setField(term291185, term291185.getClass(), "networkCount", null);
        setField(term291185, term291185.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term291185, args);
    }

};


