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

public class GithubRepoResponse_setTreesUrl_1283926200205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291228;

    public GithubRepoResponse_setTreesUrl_1283926200205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291228 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291228, term291228.getClass(), "id", null);
        setField(term291228, term291228.getClass(), "nodeId", null);
        setField(term291228, term291228.getClass(), "name", null);
        setField(term291228, term291228.getClass(), "fullName", null);
        setField(term291228, term291228.getClass(), "_private", null);
        setField(term291228, term291228.getClass(), "owner", null);
        setField(term291228, term291228.getClass(), "htmlUrl", null);
        setField(term291228, term291228.getClass(), "description", null);
        setField(term291228, term291228.getClass(), "fork", null);
        setField(term291228, term291228.getClass(), "url", null);
        setField(term291228, term291228.getClass(), "forksUrl", null);
        setField(term291228, term291228.getClass(), "keysUrl", null);
        setField(term291228, term291228.getClass(), "collaboratorsUrl", null);
        setField(term291228, term291228.getClass(), "teamsUrl", null);
        setField(term291228, term291228.getClass(), "hooksUrl", null);
        setField(term291228, term291228.getClass(), "issueEventsUrl", null);
        setField(term291228, term291228.getClass(), "eventsUrl", null);
        setField(term291228, term291228.getClass(), "assigneesUrl", null);
        setField(term291228, term291228.getClass(), "branchesUrl", null);
        setField(term291228, term291228.getClass(), "tagsUrl", null);
        setField(term291228, term291228.getClass(), "blobsUrl", null);
        setField(term291228, term291228.getClass(), "gitTagsUrl", null);
        setField(term291228, term291228.getClass(), "gitRefsUrl", null);
        setField(term291228, term291228.getClass(), "treesUrl", null);
        setField(term291228, term291228.getClass(), "statusesUrl", null);
        setField(term291228, term291228.getClass(), "languagesUrl", null);
        setField(term291228, term291228.getClass(), "stargazersUrl", null);
        setField(term291228, term291228.getClass(), "contributorsUrl", null);
        setField(term291228, term291228.getClass(), "subscribersUrl", null);
        setField(term291228, term291228.getClass(), "subscriptionUrl", null);
        setField(term291228, term291228.getClass(), "commitsUrl", null);
        setField(term291228, term291228.getClass(), "gitCommitsUrl", null);
        setField(term291228, term291228.getClass(), "commentsUrl", null);
        setField(term291228, term291228.getClass(), "issueCommentUrl", null);
        setField(term291228, term291228.getClass(), "contentsUrl", null);
        setField(term291228, term291228.getClass(), "compareUrl", null);
        setField(term291228, term291228.getClass(), "mergesUrl", null);
        setField(term291228, term291228.getClass(), "archiveUrl", null);
        setField(term291228, term291228.getClass(), "downloadsUrl", null);
        setField(term291228, term291228.getClass(), "issuesUrl", null);
        setField(term291228, term291228.getClass(), "pullsUrl", null);
        setField(term291228, term291228.getClass(), "milestonesUrl", null);
        setField(term291228, term291228.getClass(), "notificationsUrl", null);
        setField(term291228, term291228.getClass(), "labelsUrl", null);
        setField(term291228, term291228.getClass(), "releasesUrl", null);
        setField(term291228, term291228.getClass(), "deploymentsUrl", null);
        setField(term291228, term291228.getClass(), "createdAt", null);
        setField(term291228, term291228.getClass(), "updatedAt", null);
        setField(term291228, term291228.getClass(), "pushedAt", null);
        setField(term291228, term291228.getClass(), "gitUrl", null);
        setField(term291228, term291228.getClass(), "sshUrl", null);
        setField(term291228, term291228.getClass(), "cloneUrl", null);
        setField(term291228, term291228.getClass(), "svnUrl", null);
        setField(term291228, term291228.getClass(), "homepage", null);
        setField(term291228, term291228.getClass(), "size", null);
        setField(term291228, term291228.getClass(), "stargazersCount", null);
        setField(term291228, term291228.getClass(), "watchersCount", null);
        setField(term291228, term291228.getClass(), "language", null);
        setField(term291228, term291228.getClass(), "hasIssues", null);
        setField(term291228, term291228.getClass(), "hasProjects", null);
        setField(term291228, term291228.getClass(), "hasDownloads", null);
        setField(term291228, term291228.getClass(), "hasWiki", null);
        setField(term291228, term291228.getClass(), "hasPages", null);
        setField(term291228, term291228.getClass(), "forksCount", null);
        setField(term291228, term291228.getClass(), "archived", null);
        setField(term291228, term291228.getClass(), "disabled", null);
        setField(term291228, term291228.getClass(), "openIssuesCount", null);
        setField(term291228, term291228.getClass(), "license", null);
        setField(term291228, term291228.getClass(), "allowForking", null);
        setField(term291228, term291228.getClass(), "isTemplate", null);
        setField(term291228, term291228.getClass(), "topics", null);
        setField(term291228, term291228.getClass(), "visibility", null);
        setField(term291228, term291228.getClass(), "forks", null);
        setField(term291228, term291228.getClass(), "openIssues", null);
        setField(term291228, term291228.getClass(), "watchers", null);
        setField(term291228, term291228.getClass(), "defaultBranch", null);
        setField(term291228, term291228.getClass(), "networkCount", null);
        setField(term291228, term291228.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTreesUrl", argTypes, term291228, args);
    }

};


