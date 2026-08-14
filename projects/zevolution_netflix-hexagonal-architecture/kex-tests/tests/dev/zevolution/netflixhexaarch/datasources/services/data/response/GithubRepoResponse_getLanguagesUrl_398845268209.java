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

public class GithubRepoResponse_getLanguagesUrl_398845268209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291232;

    public GithubRepoResponse_getLanguagesUrl_398845268209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291232 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291232, term291232.getClass(), "id", null);
        setField(term291232, term291232.getClass(), "nodeId", null);
        setField(term291232, term291232.getClass(), "name", null);
        setField(term291232, term291232.getClass(), "fullName", null);
        setField(term291232, term291232.getClass(), "_private", null);
        setField(term291232, term291232.getClass(), "owner", null);
        setField(term291232, term291232.getClass(), "htmlUrl", null);
        setField(term291232, term291232.getClass(), "description", null);
        setField(term291232, term291232.getClass(), "fork", null);
        setField(term291232, term291232.getClass(), "url", null);
        setField(term291232, term291232.getClass(), "forksUrl", null);
        setField(term291232, term291232.getClass(), "keysUrl", null);
        setField(term291232, term291232.getClass(), "collaboratorsUrl", null);
        setField(term291232, term291232.getClass(), "teamsUrl", null);
        setField(term291232, term291232.getClass(), "hooksUrl", null);
        setField(term291232, term291232.getClass(), "issueEventsUrl", null);
        setField(term291232, term291232.getClass(), "eventsUrl", null);
        setField(term291232, term291232.getClass(), "assigneesUrl", null);
        setField(term291232, term291232.getClass(), "branchesUrl", null);
        setField(term291232, term291232.getClass(), "tagsUrl", null);
        setField(term291232, term291232.getClass(), "blobsUrl", null);
        setField(term291232, term291232.getClass(), "gitTagsUrl", null);
        setField(term291232, term291232.getClass(), "gitRefsUrl", null);
        setField(term291232, term291232.getClass(), "treesUrl", null);
        setField(term291232, term291232.getClass(), "statusesUrl", null);
        setField(term291232, term291232.getClass(), "languagesUrl", null);
        setField(term291232, term291232.getClass(), "stargazersUrl", null);
        setField(term291232, term291232.getClass(), "contributorsUrl", null);
        setField(term291232, term291232.getClass(), "subscribersUrl", null);
        setField(term291232, term291232.getClass(), "subscriptionUrl", null);
        setField(term291232, term291232.getClass(), "commitsUrl", null);
        setField(term291232, term291232.getClass(), "gitCommitsUrl", null);
        setField(term291232, term291232.getClass(), "commentsUrl", null);
        setField(term291232, term291232.getClass(), "issueCommentUrl", null);
        setField(term291232, term291232.getClass(), "contentsUrl", null);
        setField(term291232, term291232.getClass(), "compareUrl", null);
        setField(term291232, term291232.getClass(), "mergesUrl", null);
        setField(term291232, term291232.getClass(), "archiveUrl", null);
        setField(term291232, term291232.getClass(), "downloadsUrl", null);
        setField(term291232, term291232.getClass(), "issuesUrl", null);
        setField(term291232, term291232.getClass(), "pullsUrl", null);
        setField(term291232, term291232.getClass(), "milestonesUrl", null);
        setField(term291232, term291232.getClass(), "notificationsUrl", null);
        setField(term291232, term291232.getClass(), "labelsUrl", null);
        setField(term291232, term291232.getClass(), "releasesUrl", null);
        setField(term291232, term291232.getClass(), "deploymentsUrl", null);
        setField(term291232, term291232.getClass(), "createdAt", null);
        setField(term291232, term291232.getClass(), "updatedAt", null);
        setField(term291232, term291232.getClass(), "pushedAt", null);
        setField(term291232, term291232.getClass(), "gitUrl", null);
        setField(term291232, term291232.getClass(), "sshUrl", null);
        setField(term291232, term291232.getClass(), "cloneUrl", null);
        setField(term291232, term291232.getClass(), "svnUrl", null);
        setField(term291232, term291232.getClass(), "homepage", null);
        setField(term291232, term291232.getClass(), "size", null);
        setField(term291232, term291232.getClass(), "stargazersCount", null);
        setField(term291232, term291232.getClass(), "watchersCount", null);
        setField(term291232, term291232.getClass(), "language", null);
        setField(term291232, term291232.getClass(), "hasIssues", null);
        setField(term291232, term291232.getClass(), "hasProjects", null);
        setField(term291232, term291232.getClass(), "hasDownloads", null);
        setField(term291232, term291232.getClass(), "hasWiki", null);
        setField(term291232, term291232.getClass(), "hasPages", null);
        setField(term291232, term291232.getClass(), "forksCount", null);
        setField(term291232, term291232.getClass(), "archived", null);
        setField(term291232, term291232.getClass(), "disabled", null);
        setField(term291232, term291232.getClass(), "openIssuesCount", null);
        setField(term291232, term291232.getClass(), "license", null);
        setField(term291232, term291232.getClass(), "allowForking", null);
        setField(term291232, term291232.getClass(), "isTemplate", null);
        setField(term291232, term291232.getClass(), "topics", null);
        setField(term291232, term291232.getClass(), "visibility", null);
        setField(term291232, term291232.getClass(), "forks", null);
        setField(term291232, term291232.getClass(), "openIssues", null);
        setField(term291232, term291232.getClass(), "watchers", null);
        setField(term291232, term291232.getClass(), "defaultBranch", null);
        setField(term291232, term291232.getClass(), "networkCount", null);
        setField(term291232, term291232.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguagesUrl", argTypes, term291232, args);
    }

};


