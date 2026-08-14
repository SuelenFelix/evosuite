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

public class GithubRepoResponse_setVisibility_881177424302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291325;

    public GithubRepoResponse_setVisibility_881177424302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291325 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291325, term291325.getClass(), "id", null);
        setField(term291325, term291325.getClass(), "nodeId", null);
        setField(term291325, term291325.getClass(), "name", null);
        setField(term291325, term291325.getClass(), "fullName", null);
        setField(term291325, term291325.getClass(), "_private", null);
        setField(term291325, term291325.getClass(), "owner", null);
        setField(term291325, term291325.getClass(), "htmlUrl", null);
        setField(term291325, term291325.getClass(), "description", null);
        setField(term291325, term291325.getClass(), "fork", null);
        setField(term291325, term291325.getClass(), "url", null);
        setField(term291325, term291325.getClass(), "forksUrl", null);
        setField(term291325, term291325.getClass(), "keysUrl", null);
        setField(term291325, term291325.getClass(), "collaboratorsUrl", null);
        setField(term291325, term291325.getClass(), "teamsUrl", null);
        setField(term291325, term291325.getClass(), "hooksUrl", null);
        setField(term291325, term291325.getClass(), "issueEventsUrl", null);
        setField(term291325, term291325.getClass(), "eventsUrl", null);
        setField(term291325, term291325.getClass(), "assigneesUrl", null);
        setField(term291325, term291325.getClass(), "branchesUrl", null);
        setField(term291325, term291325.getClass(), "tagsUrl", null);
        setField(term291325, term291325.getClass(), "blobsUrl", null);
        setField(term291325, term291325.getClass(), "gitTagsUrl", null);
        setField(term291325, term291325.getClass(), "gitRefsUrl", null);
        setField(term291325, term291325.getClass(), "treesUrl", null);
        setField(term291325, term291325.getClass(), "statusesUrl", null);
        setField(term291325, term291325.getClass(), "languagesUrl", null);
        setField(term291325, term291325.getClass(), "stargazersUrl", null);
        setField(term291325, term291325.getClass(), "contributorsUrl", null);
        setField(term291325, term291325.getClass(), "subscribersUrl", null);
        setField(term291325, term291325.getClass(), "subscriptionUrl", null);
        setField(term291325, term291325.getClass(), "commitsUrl", null);
        setField(term291325, term291325.getClass(), "gitCommitsUrl", null);
        setField(term291325, term291325.getClass(), "commentsUrl", null);
        setField(term291325, term291325.getClass(), "issueCommentUrl", null);
        setField(term291325, term291325.getClass(), "contentsUrl", null);
        setField(term291325, term291325.getClass(), "compareUrl", null);
        setField(term291325, term291325.getClass(), "mergesUrl", null);
        setField(term291325, term291325.getClass(), "archiveUrl", null);
        setField(term291325, term291325.getClass(), "downloadsUrl", null);
        setField(term291325, term291325.getClass(), "issuesUrl", null);
        setField(term291325, term291325.getClass(), "pullsUrl", null);
        setField(term291325, term291325.getClass(), "milestonesUrl", null);
        setField(term291325, term291325.getClass(), "notificationsUrl", null);
        setField(term291325, term291325.getClass(), "labelsUrl", null);
        setField(term291325, term291325.getClass(), "releasesUrl", null);
        setField(term291325, term291325.getClass(), "deploymentsUrl", null);
        setField(term291325, term291325.getClass(), "createdAt", null);
        setField(term291325, term291325.getClass(), "updatedAt", null);
        setField(term291325, term291325.getClass(), "pushedAt", null);
        setField(term291325, term291325.getClass(), "gitUrl", null);
        setField(term291325, term291325.getClass(), "sshUrl", null);
        setField(term291325, term291325.getClass(), "cloneUrl", null);
        setField(term291325, term291325.getClass(), "svnUrl", null);
        setField(term291325, term291325.getClass(), "homepage", null);
        setField(term291325, term291325.getClass(), "size", null);
        setField(term291325, term291325.getClass(), "stargazersCount", null);
        setField(term291325, term291325.getClass(), "watchersCount", null);
        setField(term291325, term291325.getClass(), "language", null);
        setField(term291325, term291325.getClass(), "hasIssues", null);
        setField(term291325, term291325.getClass(), "hasProjects", null);
        setField(term291325, term291325.getClass(), "hasDownloads", null);
        setField(term291325, term291325.getClass(), "hasWiki", null);
        setField(term291325, term291325.getClass(), "hasPages", null);
        setField(term291325, term291325.getClass(), "forksCount", null);
        setField(term291325, term291325.getClass(), "archived", null);
        setField(term291325, term291325.getClass(), "disabled", null);
        setField(term291325, term291325.getClass(), "openIssuesCount", null);
        setField(term291325, term291325.getClass(), "license", null);
        setField(term291325, term291325.getClass(), "allowForking", null);
        setField(term291325, term291325.getClass(), "isTemplate", null);
        setField(term291325, term291325.getClass(), "topics", null);
        setField(term291325, term291325.getClass(), "visibility", null);
        setField(term291325, term291325.getClass(), "forks", null);
        setField(term291325, term291325.getClass(), "openIssues", null);
        setField(term291325, term291325.getClass(), "watchers", null);
        setField(term291325, term291325.getClass(), "defaultBranch", null);
        setField(term291325, term291325.getClass(), "networkCount", null);
        setField(term291325, term291325.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVisibility", argTypes, term291325, args);
    }

};


