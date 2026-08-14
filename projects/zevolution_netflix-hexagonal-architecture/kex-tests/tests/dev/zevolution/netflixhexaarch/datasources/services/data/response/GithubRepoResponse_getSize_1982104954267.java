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

public class GithubRepoResponse_getSize_1982104954267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291290;

    public GithubRepoResponse_getSize_1982104954267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291290 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291290, term291290.getClass(), "id", null);
        setField(term291290, term291290.getClass(), "nodeId", null);
        setField(term291290, term291290.getClass(), "name", null);
        setField(term291290, term291290.getClass(), "fullName", null);
        setField(term291290, term291290.getClass(), "_private", null);
        setField(term291290, term291290.getClass(), "owner", null);
        setField(term291290, term291290.getClass(), "htmlUrl", null);
        setField(term291290, term291290.getClass(), "description", null);
        setField(term291290, term291290.getClass(), "fork", null);
        setField(term291290, term291290.getClass(), "url", null);
        setField(term291290, term291290.getClass(), "forksUrl", null);
        setField(term291290, term291290.getClass(), "keysUrl", null);
        setField(term291290, term291290.getClass(), "collaboratorsUrl", null);
        setField(term291290, term291290.getClass(), "teamsUrl", null);
        setField(term291290, term291290.getClass(), "hooksUrl", null);
        setField(term291290, term291290.getClass(), "issueEventsUrl", null);
        setField(term291290, term291290.getClass(), "eventsUrl", null);
        setField(term291290, term291290.getClass(), "assigneesUrl", null);
        setField(term291290, term291290.getClass(), "branchesUrl", null);
        setField(term291290, term291290.getClass(), "tagsUrl", null);
        setField(term291290, term291290.getClass(), "blobsUrl", null);
        setField(term291290, term291290.getClass(), "gitTagsUrl", null);
        setField(term291290, term291290.getClass(), "gitRefsUrl", null);
        setField(term291290, term291290.getClass(), "treesUrl", null);
        setField(term291290, term291290.getClass(), "statusesUrl", null);
        setField(term291290, term291290.getClass(), "languagesUrl", null);
        setField(term291290, term291290.getClass(), "stargazersUrl", null);
        setField(term291290, term291290.getClass(), "contributorsUrl", null);
        setField(term291290, term291290.getClass(), "subscribersUrl", null);
        setField(term291290, term291290.getClass(), "subscriptionUrl", null);
        setField(term291290, term291290.getClass(), "commitsUrl", null);
        setField(term291290, term291290.getClass(), "gitCommitsUrl", null);
        setField(term291290, term291290.getClass(), "commentsUrl", null);
        setField(term291290, term291290.getClass(), "issueCommentUrl", null);
        setField(term291290, term291290.getClass(), "contentsUrl", null);
        setField(term291290, term291290.getClass(), "compareUrl", null);
        setField(term291290, term291290.getClass(), "mergesUrl", null);
        setField(term291290, term291290.getClass(), "archiveUrl", null);
        setField(term291290, term291290.getClass(), "downloadsUrl", null);
        setField(term291290, term291290.getClass(), "issuesUrl", null);
        setField(term291290, term291290.getClass(), "pullsUrl", null);
        setField(term291290, term291290.getClass(), "milestonesUrl", null);
        setField(term291290, term291290.getClass(), "notificationsUrl", null);
        setField(term291290, term291290.getClass(), "labelsUrl", null);
        setField(term291290, term291290.getClass(), "releasesUrl", null);
        setField(term291290, term291290.getClass(), "deploymentsUrl", null);
        setField(term291290, term291290.getClass(), "createdAt", null);
        setField(term291290, term291290.getClass(), "updatedAt", null);
        setField(term291290, term291290.getClass(), "pushedAt", null);
        setField(term291290, term291290.getClass(), "gitUrl", null);
        setField(term291290, term291290.getClass(), "sshUrl", null);
        setField(term291290, term291290.getClass(), "cloneUrl", null);
        setField(term291290, term291290.getClass(), "svnUrl", null);
        setField(term291290, term291290.getClass(), "homepage", null);
        setField(term291290, term291290.getClass(), "size", null);
        setField(term291290, term291290.getClass(), "stargazersCount", null);
        setField(term291290, term291290.getClass(), "watchersCount", null);
        setField(term291290, term291290.getClass(), "language", null);
        setField(term291290, term291290.getClass(), "hasIssues", null);
        setField(term291290, term291290.getClass(), "hasProjects", null);
        setField(term291290, term291290.getClass(), "hasDownloads", null);
        setField(term291290, term291290.getClass(), "hasWiki", null);
        setField(term291290, term291290.getClass(), "hasPages", null);
        setField(term291290, term291290.getClass(), "forksCount", null);
        setField(term291290, term291290.getClass(), "archived", null);
        setField(term291290, term291290.getClass(), "disabled", null);
        setField(term291290, term291290.getClass(), "openIssuesCount", null);
        setField(term291290, term291290.getClass(), "license", null);
        setField(term291290, term291290.getClass(), "allowForking", null);
        setField(term291290, term291290.getClass(), "isTemplate", null);
        setField(term291290, term291290.getClass(), "topics", null);
        setField(term291290, term291290.getClass(), "visibility", null);
        setField(term291290, term291290.getClass(), "forks", null);
        setField(term291290, term291290.getClass(), "openIssues", null);
        setField(term291290, term291290.getClass(), "watchers", null);
        setField(term291290, term291290.getClass(), "defaultBranch", null);
        setField(term291290, term291290.getClass(), "networkCount", null);
        setField(term291290, term291290.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term291290, args);
    }

};


