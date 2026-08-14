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

public class GithubRepoResponse_setFullName_1203271208165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291188;

    public GithubRepoResponse_setFullName_1203271208165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291188 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291188, term291188.getClass(), "id", null);
        setField(term291188, term291188.getClass(), "nodeId", null);
        setField(term291188, term291188.getClass(), "name", null);
        setField(term291188, term291188.getClass(), "fullName", null);
        setField(term291188, term291188.getClass(), "_private", null);
        setField(term291188, term291188.getClass(), "owner", null);
        setField(term291188, term291188.getClass(), "htmlUrl", null);
        setField(term291188, term291188.getClass(), "description", null);
        setField(term291188, term291188.getClass(), "fork", null);
        setField(term291188, term291188.getClass(), "url", null);
        setField(term291188, term291188.getClass(), "forksUrl", null);
        setField(term291188, term291188.getClass(), "keysUrl", null);
        setField(term291188, term291188.getClass(), "collaboratorsUrl", null);
        setField(term291188, term291188.getClass(), "teamsUrl", null);
        setField(term291188, term291188.getClass(), "hooksUrl", null);
        setField(term291188, term291188.getClass(), "issueEventsUrl", null);
        setField(term291188, term291188.getClass(), "eventsUrl", null);
        setField(term291188, term291188.getClass(), "assigneesUrl", null);
        setField(term291188, term291188.getClass(), "branchesUrl", null);
        setField(term291188, term291188.getClass(), "tagsUrl", null);
        setField(term291188, term291188.getClass(), "blobsUrl", null);
        setField(term291188, term291188.getClass(), "gitTagsUrl", null);
        setField(term291188, term291188.getClass(), "gitRefsUrl", null);
        setField(term291188, term291188.getClass(), "treesUrl", null);
        setField(term291188, term291188.getClass(), "statusesUrl", null);
        setField(term291188, term291188.getClass(), "languagesUrl", null);
        setField(term291188, term291188.getClass(), "stargazersUrl", null);
        setField(term291188, term291188.getClass(), "contributorsUrl", null);
        setField(term291188, term291188.getClass(), "subscribersUrl", null);
        setField(term291188, term291188.getClass(), "subscriptionUrl", null);
        setField(term291188, term291188.getClass(), "commitsUrl", null);
        setField(term291188, term291188.getClass(), "gitCommitsUrl", null);
        setField(term291188, term291188.getClass(), "commentsUrl", null);
        setField(term291188, term291188.getClass(), "issueCommentUrl", null);
        setField(term291188, term291188.getClass(), "contentsUrl", null);
        setField(term291188, term291188.getClass(), "compareUrl", null);
        setField(term291188, term291188.getClass(), "mergesUrl", null);
        setField(term291188, term291188.getClass(), "archiveUrl", null);
        setField(term291188, term291188.getClass(), "downloadsUrl", null);
        setField(term291188, term291188.getClass(), "issuesUrl", null);
        setField(term291188, term291188.getClass(), "pullsUrl", null);
        setField(term291188, term291188.getClass(), "milestonesUrl", null);
        setField(term291188, term291188.getClass(), "notificationsUrl", null);
        setField(term291188, term291188.getClass(), "labelsUrl", null);
        setField(term291188, term291188.getClass(), "releasesUrl", null);
        setField(term291188, term291188.getClass(), "deploymentsUrl", null);
        setField(term291188, term291188.getClass(), "createdAt", null);
        setField(term291188, term291188.getClass(), "updatedAt", null);
        setField(term291188, term291188.getClass(), "pushedAt", null);
        setField(term291188, term291188.getClass(), "gitUrl", null);
        setField(term291188, term291188.getClass(), "sshUrl", null);
        setField(term291188, term291188.getClass(), "cloneUrl", null);
        setField(term291188, term291188.getClass(), "svnUrl", null);
        setField(term291188, term291188.getClass(), "homepage", null);
        setField(term291188, term291188.getClass(), "size", null);
        setField(term291188, term291188.getClass(), "stargazersCount", null);
        setField(term291188, term291188.getClass(), "watchersCount", null);
        setField(term291188, term291188.getClass(), "language", null);
        setField(term291188, term291188.getClass(), "hasIssues", null);
        setField(term291188, term291188.getClass(), "hasProjects", null);
        setField(term291188, term291188.getClass(), "hasDownloads", null);
        setField(term291188, term291188.getClass(), "hasWiki", null);
        setField(term291188, term291188.getClass(), "hasPages", null);
        setField(term291188, term291188.getClass(), "forksCount", null);
        setField(term291188, term291188.getClass(), "archived", null);
        setField(term291188, term291188.getClass(), "disabled", null);
        setField(term291188, term291188.getClass(), "openIssuesCount", null);
        setField(term291188, term291188.getClass(), "license", null);
        setField(term291188, term291188.getClass(), "allowForking", null);
        setField(term291188, term291188.getClass(), "isTemplate", null);
        setField(term291188, term291188.getClass(), "topics", null);
        setField(term291188, term291188.getClass(), "visibility", null);
        setField(term291188, term291188.getClass(), "forks", null);
        setField(term291188, term291188.getClass(), "openIssues", null);
        setField(term291188, term291188.getClass(), "watchers", null);
        setField(term291188, term291188.getClass(), "defaultBranch", null);
        setField(term291188, term291188.getClass(), "networkCount", null);
        setField(term291188, term291188.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFullName", argTypes, term291188, args);
    }

};


