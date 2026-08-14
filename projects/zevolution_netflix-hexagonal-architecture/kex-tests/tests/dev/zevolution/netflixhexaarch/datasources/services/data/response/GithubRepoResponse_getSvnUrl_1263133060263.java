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

public class GithubRepoResponse_getSvnUrl_1263133060263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291286;

    public GithubRepoResponse_getSvnUrl_1263133060263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291286 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291286, term291286.getClass(), "id", null);
        setField(term291286, term291286.getClass(), "nodeId", null);
        setField(term291286, term291286.getClass(), "name", null);
        setField(term291286, term291286.getClass(), "fullName", null);
        setField(term291286, term291286.getClass(), "_private", null);
        setField(term291286, term291286.getClass(), "owner", null);
        setField(term291286, term291286.getClass(), "htmlUrl", null);
        setField(term291286, term291286.getClass(), "description", null);
        setField(term291286, term291286.getClass(), "fork", null);
        setField(term291286, term291286.getClass(), "url", null);
        setField(term291286, term291286.getClass(), "forksUrl", null);
        setField(term291286, term291286.getClass(), "keysUrl", null);
        setField(term291286, term291286.getClass(), "collaboratorsUrl", null);
        setField(term291286, term291286.getClass(), "teamsUrl", null);
        setField(term291286, term291286.getClass(), "hooksUrl", null);
        setField(term291286, term291286.getClass(), "issueEventsUrl", null);
        setField(term291286, term291286.getClass(), "eventsUrl", null);
        setField(term291286, term291286.getClass(), "assigneesUrl", null);
        setField(term291286, term291286.getClass(), "branchesUrl", null);
        setField(term291286, term291286.getClass(), "tagsUrl", null);
        setField(term291286, term291286.getClass(), "blobsUrl", null);
        setField(term291286, term291286.getClass(), "gitTagsUrl", null);
        setField(term291286, term291286.getClass(), "gitRefsUrl", null);
        setField(term291286, term291286.getClass(), "treesUrl", null);
        setField(term291286, term291286.getClass(), "statusesUrl", null);
        setField(term291286, term291286.getClass(), "languagesUrl", null);
        setField(term291286, term291286.getClass(), "stargazersUrl", null);
        setField(term291286, term291286.getClass(), "contributorsUrl", null);
        setField(term291286, term291286.getClass(), "subscribersUrl", null);
        setField(term291286, term291286.getClass(), "subscriptionUrl", null);
        setField(term291286, term291286.getClass(), "commitsUrl", null);
        setField(term291286, term291286.getClass(), "gitCommitsUrl", null);
        setField(term291286, term291286.getClass(), "commentsUrl", null);
        setField(term291286, term291286.getClass(), "issueCommentUrl", null);
        setField(term291286, term291286.getClass(), "contentsUrl", null);
        setField(term291286, term291286.getClass(), "compareUrl", null);
        setField(term291286, term291286.getClass(), "mergesUrl", null);
        setField(term291286, term291286.getClass(), "archiveUrl", null);
        setField(term291286, term291286.getClass(), "downloadsUrl", null);
        setField(term291286, term291286.getClass(), "issuesUrl", null);
        setField(term291286, term291286.getClass(), "pullsUrl", null);
        setField(term291286, term291286.getClass(), "milestonesUrl", null);
        setField(term291286, term291286.getClass(), "notificationsUrl", null);
        setField(term291286, term291286.getClass(), "labelsUrl", null);
        setField(term291286, term291286.getClass(), "releasesUrl", null);
        setField(term291286, term291286.getClass(), "deploymentsUrl", null);
        setField(term291286, term291286.getClass(), "createdAt", null);
        setField(term291286, term291286.getClass(), "updatedAt", null);
        setField(term291286, term291286.getClass(), "pushedAt", null);
        setField(term291286, term291286.getClass(), "gitUrl", null);
        setField(term291286, term291286.getClass(), "sshUrl", null);
        setField(term291286, term291286.getClass(), "cloneUrl", null);
        setField(term291286, term291286.getClass(), "svnUrl", null);
        setField(term291286, term291286.getClass(), "homepage", null);
        setField(term291286, term291286.getClass(), "size", null);
        setField(term291286, term291286.getClass(), "stargazersCount", null);
        setField(term291286, term291286.getClass(), "watchersCount", null);
        setField(term291286, term291286.getClass(), "language", null);
        setField(term291286, term291286.getClass(), "hasIssues", null);
        setField(term291286, term291286.getClass(), "hasProjects", null);
        setField(term291286, term291286.getClass(), "hasDownloads", null);
        setField(term291286, term291286.getClass(), "hasWiki", null);
        setField(term291286, term291286.getClass(), "hasPages", null);
        setField(term291286, term291286.getClass(), "forksCount", null);
        setField(term291286, term291286.getClass(), "archived", null);
        setField(term291286, term291286.getClass(), "disabled", null);
        setField(term291286, term291286.getClass(), "openIssuesCount", null);
        setField(term291286, term291286.getClass(), "license", null);
        setField(term291286, term291286.getClass(), "allowForking", null);
        setField(term291286, term291286.getClass(), "isTemplate", null);
        setField(term291286, term291286.getClass(), "topics", null);
        setField(term291286, term291286.getClass(), "visibility", null);
        setField(term291286, term291286.getClass(), "forks", null);
        setField(term291286, term291286.getClass(), "openIssues", null);
        setField(term291286, term291286.getClass(), "watchers", null);
        setField(term291286, term291286.getClass(), "defaultBranch", null);
        setField(term291286, term291286.getClass(), "networkCount", null);
        setField(term291286, term291286.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSvnUrl", argTypes, term291286, args);
    }

};


