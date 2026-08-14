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

public class GithubRepoResponse_getOpenIssues_2037338857304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291327;

    public GithubRepoResponse_getOpenIssues_2037338857304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291327 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291327, term291327.getClass(), "id", null);
        setField(term291327, term291327.getClass(), "nodeId", null);
        setField(term291327, term291327.getClass(), "name", null);
        setField(term291327, term291327.getClass(), "fullName", null);
        setField(term291327, term291327.getClass(), "_private", null);
        setField(term291327, term291327.getClass(), "owner", null);
        setField(term291327, term291327.getClass(), "htmlUrl", null);
        setField(term291327, term291327.getClass(), "description", null);
        setField(term291327, term291327.getClass(), "fork", null);
        setField(term291327, term291327.getClass(), "url", null);
        setField(term291327, term291327.getClass(), "forksUrl", null);
        setField(term291327, term291327.getClass(), "keysUrl", null);
        setField(term291327, term291327.getClass(), "collaboratorsUrl", null);
        setField(term291327, term291327.getClass(), "teamsUrl", null);
        setField(term291327, term291327.getClass(), "hooksUrl", null);
        setField(term291327, term291327.getClass(), "issueEventsUrl", null);
        setField(term291327, term291327.getClass(), "eventsUrl", null);
        setField(term291327, term291327.getClass(), "assigneesUrl", null);
        setField(term291327, term291327.getClass(), "branchesUrl", null);
        setField(term291327, term291327.getClass(), "tagsUrl", null);
        setField(term291327, term291327.getClass(), "blobsUrl", null);
        setField(term291327, term291327.getClass(), "gitTagsUrl", null);
        setField(term291327, term291327.getClass(), "gitRefsUrl", null);
        setField(term291327, term291327.getClass(), "treesUrl", null);
        setField(term291327, term291327.getClass(), "statusesUrl", null);
        setField(term291327, term291327.getClass(), "languagesUrl", null);
        setField(term291327, term291327.getClass(), "stargazersUrl", null);
        setField(term291327, term291327.getClass(), "contributorsUrl", null);
        setField(term291327, term291327.getClass(), "subscribersUrl", null);
        setField(term291327, term291327.getClass(), "subscriptionUrl", null);
        setField(term291327, term291327.getClass(), "commitsUrl", null);
        setField(term291327, term291327.getClass(), "gitCommitsUrl", null);
        setField(term291327, term291327.getClass(), "commentsUrl", null);
        setField(term291327, term291327.getClass(), "issueCommentUrl", null);
        setField(term291327, term291327.getClass(), "contentsUrl", null);
        setField(term291327, term291327.getClass(), "compareUrl", null);
        setField(term291327, term291327.getClass(), "mergesUrl", null);
        setField(term291327, term291327.getClass(), "archiveUrl", null);
        setField(term291327, term291327.getClass(), "downloadsUrl", null);
        setField(term291327, term291327.getClass(), "issuesUrl", null);
        setField(term291327, term291327.getClass(), "pullsUrl", null);
        setField(term291327, term291327.getClass(), "milestonesUrl", null);
        setField(term291327, term291327.getClass(), "notificationsUrl", null);
        setField(term291327, term291327.getClass(), "labelsUrl", null);
        setField(term291327, term291327.getClass(), "releasesUrl", null);
        setField(term291327, term291327.getClass(), "deploymentsUrl", null);
        setField(term291327, term291327.getClass(), "createdAt", null);
        setField(term291327, term291327.getClass(), "updatedAt", null);
        setField(term291327, term291327.getClass(), "pushedAt", null);
        setField(term291327, term291327.getClass(), "gitUrl", null);
        setField(term291327, term291327.getClass(), "sshUrl", null);
        setField(term291327, term291327.getClass(), "cloneUrl", null);
        setField(term291327, term291327.getClass(), "svnUrl", null);
        setField(term291327, term291327.getClass(), "homepage", null);
        setField(term291327, term291327.getClass(), "size", null);
        setField(term291327, term291327.getClass(), "stargazersCount", null);
        setField(term291327, term291327.getClass(), "watchersCount", null);
        setField(term291327, term291327.getClass(), "language", null);
        setField(term291327, term291327.getClass(), "hasIssues", null);
        setField(term291327, term291327.getClass(), "hasProjects", null);
        setField(term291327, term291327.getClass(), "hasDownloads", null);
        setField(term291327, term291327.getClass(), "hasWiki", null);
        setField(term291327, term291327.getClass(), "hasPages", null);
        setField(term291327, term291327.getClass(), "forksCount", null);
        setField(term291327, term291327.getClass(), "archived", null);
        setField(term291327, term291327.getClass(), "disabled", null);
        setField(term291327, term291327.getClass(), "openIssuesCount", null);
        setField(term291327, term291327.getClass(), "license", null);
        setField(term291327, term291327.getClass(), "allowForking", null);
        setField(term291327, term291327.getClass(), "isTemplate", null);
        setField(term291327, term291327.getClass(), "topics", null);
        setField(term291327, term291327.getClass(), "visibility", null);
        setField(term291327, term291327.getClass(), "forks", null);
        setField(term291327, term291327.getClass(), "openIssues", null);
        setField(term291327, term291327.getClass(), "watchers", null);
        setField(term291327, term291327.getClass(), "defaultBranch", null);
        setField(term291327, term291327.getClass(), "networkCount", null);
        setField(term291327, term291327.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpenIssues", argTypes, term291327, args);
    }

};


