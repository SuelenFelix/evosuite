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

public class GithubRepoResponse_getTeamsUrl_862820455184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291207;

    public GithubRepoResponse_getTeamsUrl_862820455184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291207 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291207, term291207.getClass(), "id", null);
        setField(term291207, term291207.getClass(), "nodeId", null);
        setField(term291207, term291207.getClass(), "name", null);
        setField(term291207, term291207.getClass(), "fullName", null);
        setField(term291207, term291207.getClass(), "_private", null);
        setField(term291207, term291207.getClass(), "owner", null);
        setField(term291207, term291207.getClass(), "htmlUrl", null);
        setField(term291207, term291207.getClass(), "description", null);
        setField(term291207, term291207.getClass(), "fork", null);
        setField(term291207, term291207.getClass(), "url", null);
        setField(term291207, term291207.getClass(), "forksUrl", null);
        setField(term291207, term291207.getClass(), "keysUrl", null);
        setField(term291207, term291207.getClass(), "collaboratorsUrl", null);
        setField(term291207, term291207.getClass(), "teamsUrl", null);
        setField(term291207, term291207.getClass(), "hooksUrl", null);
        setField(term291207, term291207.getClass(), "issueEventsUrl", null);
        setField(term291207, term291207.getClass(), "eventsUrl", null);
        setField(term291207, term291207.getClass(), "assigneesUrl", null);
        setField(term291207, term291207.getClass(), "branchesUrl", null);
        setField(term291207, term291207.getClass(), "tagsUrl", null);
        setField(term291207, term291207.getClass(), "blobsUrl", null);
        setField(term291207, term291207.getClass(), "gitTagsUrl", null);
        setField(term291207, term291207.getClass(), "gitRefsUrl", null);
        setField(term291207, term291207.getClass(), "treesUrl", null);
        setField(term291207, term291207.getClass(), "statusesUrl", null);
        setField(term291207, term291207.getClass(), "languagesUrl", null);
        setField(term291207, term291207.getClass(), "stargazersUrl", null);
        setField(term291207, term291207.getClass(), "contributorsUrl", null);
        setField(term291207, term291207.getClass(), "subscribersUrl", null);
        setField(term291207, term291207.getClass(), "subscriptionUrl", null);
        setField(term291207, term291207.getClass(), "commitsUrl", null);
        setField(term291207, term291207.getClass(), "gitCommitsUrl", null);
        setField(term291207, term291207.getClass(), "commentsUrl", null);
        setField(term291207, term291207.getClass(), "issueCommentUrl", null);
        setField(term291207, term291207.getClass(), "contentsUrl", null);
        setField(term291207, term291207.getClass(), "compareUrl", null);
        setField(term291207, term291207.getClass(), "mergesUrl", null);
        setField(term291207, term291207.getClass(), "archiveUrl", null);
        setField(term291207, term291207.getClass(), "downloadsUrl", null);
        setField(term291207, term291207.getClass(), "issuesUrl", null);
        setField(term291207, term291207.getClass(), "pullsUrl", null);
        setField(term291207, term291207.getClass(), "milestonesUrl", null);
        setField(term291207, term291207.getClass(), "notificationsUrl", null);
        setField(term291207, term291207.getClass(), "labelsUrl", null);
        setField(term291207, term291207.getClass(), "releasesUrl", null);
        setField(term291207, term291207.getClass(), "deploymentsUrl", null);
        setField(term291207, term291207.getClass(), "createdAt", null);
        setField(term291207, term291207.getClass(), "updatedAt", null);
        setField(term291207, term291207.getClass(), "pushedAt", null);
        setField(term291207, term291207.getClass(), "gitUrl", null);
        setField(term291207, term291207.getClass(), "sshUrl", null);
        setField(term291207, term291207.getClass(), "cloneUrl", null);
        setField(term291207, term291207.getClass(), "svnUrl", null);
        setField(term291207, term291207.getClass(), "homepage", null);
        setField(term291207, term291207.getClass(), "size", null);
        setField(term291207, term291207.getClass(), "stargazersCount", null);
        setField(term291207, term291207.getClass(), "watchersCount", null);
        setField(term291207, term291207.getClass(), "language", null);
        setField(term291207, term291207.getClass(), "hasIssues", null);
        setField(term291207, term291207.getClass(), "hasProjects", null);
        setField(term291207, term291207.getClass(), "hasDownloads", null);
        setField(term291207, term291207.getClass(), "hasWiki", null);
        setField(term291207, term291207.getClass(), "hasPages", null);
        setField(term291207, term291207.getClass(), "forksCount", null);
        setField(term291207, term291207.getClass(), "archived", null);
        setField(term291207, term291207.getClass(), "disabled", null);
        setField(term291207, term291207.getClass(), "openIssuesCount", null);
        setField(term291207, term291207.getClass(), "license", null);
        setField(term291207, term291207.getClass(), "allowForking", null);
        setField(term291207, term291207.getClass(), "isTemplate", null);
        setField(term291207, term291207.getClass(), "topics", null);
        setField(term291207, term291207.getClass(), "visibility", null);
        setField(term291207, term291207.getClass(), "forks", null);
        setField(term291207, term291207.getClass(), "openIssues", null);
        setField(term291207, term291207.getClass(), "watchers", null);
        setField(term291207, term291207.getClass(), "defaultBranch", null);
        setField(term291207, term291207.getClass(), "networkCount", null);
        setField(term291207, term291207.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeamsUrl", argTypes, term291207, args);
    }

};


