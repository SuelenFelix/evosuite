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

public class GithubRepoResponse_setLanguage_428540938273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291296;

    public GithubRepoResponse_setLanguage_428540938273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291296 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291296, term291296.getClass(), "id", null);
        setField(term291296, term291296.getClass(), "nodeId", null);
        setField(term291296, term291296.getClass(), "name", null);
        setField(term291296, term291296.getClass(), "fullName", null);
        setField(term291296, term291296.getClass(), "_private", null);
        setField(term291296, term291296.getClass(), "owner", null);
        setField(term291296, term291296.getClass(), "htmlUrl", null);
        setField(term291296, term291296.getClass(), "description", null);
        setField(term291296, term291296.getClass(), "fork", null);
        setField(term291296, term291296.getClass(), "url", null);
        setField(term291296, term291296.getClass(), "forksUrl", null);
        setField(term291296, term291296.getClass(), "keysUrl", null);
        setField(term291296, term291296.getClass(), "collaboratorsUrl", null);
        setField(term291296, term291296.getClass(), "teamsUrl", null);
        setField(term291296, term291296.getClass(), "hooksUrl", null);
        setField(term291296, term291296.getClass(), "issueEventsUrl", null);
        setField(term291296, term291296.getClass(), "eventsUrl", null);
        setField(term291296, term291296.getClass(), "assigneesUrl", null);
        setField(term291296, term291296.getClass(), "branchesUrl", null);
        setField(term291296, term291296.getClass(), "tagsUrl", null);
        setField(term291296, term291296.getClass(), "blobsUrl", null);
        setField(term291296, term291296.getClass(), "gitTagsUrl", null);
        setField(term291296, term291296.getClass(), "gitRefsUrl", null);
        setField(term291296, term291296.getClass(), "treesUrl", null);
        setField(term291296, term291296.getClass(), "statusesUrl", null);
        setField(term291296, term291296.getClass(), "languagesUrl", null);
        setField(term291296, term291296.getClass(), "stargazersUrl", null);
        setField(term291296, term291296.getClass(), "contributorsUrl", null);
        setField(term291296, term291296.getClass(), "subscribersUrl", null);
        setField(term291296, term291296.getClass(), "subscriptionUrl", null);
        setField(term291296, term291296.getClass(), "commitsUrl", null);
        setField(term291296, term291296.getClass(), "gitCommitsUrl", null);
        setField(term291296, term291296.getClass(), "commentsUrl", null);
        setField(term291296, term291296.getClass(), "issueCommentUrl", null);
        setField(term291296, term291296.getClass(), "contentsUrl", null);
        setField(term291296, term291296.getClass(), "compareUrl", null);
        setField(term291296, term291296.getClass(), "mergesUrl", null);
        setField(term291296, term291296.getClass(), "archiveUrl", null);
        setField(term291296, term291296.getClass(), "downloadsUrl", null);
        setField(term291296, term291296.getClass(), "issuesUrl", null);
        setField(term291296, term291296.getClass(), "pullsUrl", null);
        setField(term291296, term291296.getClass(), "milestonesUrl", null);
        setField(term291296, term291296.getClass(), "notificationsUrl", null);
        setField(term291296, term291296.getClass(), "labelsUrl", null);
        setField(term291296, term291296.getClass(), "releasesUrl", null);
        setField(term291296, term291296.getClass(), "deploymentsUrl", null);
        setField(term291296, term291296.getClass(), "createdAt", null);
        setField(term291296, term291296.getClass(), "updatedAt", null);
        setField(term291296, term291296.getClass(), "pushedAt", null);
        setField(term291296, term291296.getClass(), "gitUrl", null);
        setField(term291296, term291296.getClass(), "sshUrl", null);
        setField(term291296, term291296.getClass(), "cloneUrl", null);
        setField(term291296, term291296.getClass(), "svnUrl", null);
        setField(term291296, term291296.getClass(), "homepage", null);
        setField(term291296, term291296.getClass(), "size", null);
        setField(term291296, term291296.getClass(), "stargazersCount", null);
        setField(term291296, term291296.getClass(), "watchersCount", null);
        setField(term291296, term291296.getClass(), "language", null);
        setField(term291296, term291296.getClass(), "hasIssues", null);
        setField(term291296, term291296.getClass(), "hasProjects", null);
        setField(term291296, term291296.getClass(), "hasDownloads", null);
        setField(term291296, term291296.getClass(), "hasWiki", null);
        setField(term291296, term291296.getClass(), "hasPages", null);
        setField(term291296, term291296.getClass(), "forksCount", null);
        setField(term291296, term291296.getClass(), "archived", null);
        setField(term291296, term291296.getClass(), "disabled", null);
        setField(term291296, term291296.getClass(), "openIssuesCount", null);
        setField(term291296, term291296.getClass(), "license", null);
        setField(term291296, term291296.getClass(), "allowForking", null);
        setField(term291296, term291296.getClass(), "isTemplate", null);
        setField(term291296, term291296.getClass(), "topics", null);
        setField(term291296, term291296.getClass(), "visibility", null);
        setField(term291296, term291296.getClass(), "forks", null);
        setField(term291296, term291296.getClass(), "openIssues", null);
        setField(term291296, term291296.getClass(), "watchers", null);
        setField(term291296, term291296.getClass(), "defaultBranch", null);
        setField(term291296, term291296.getClass(), "networkCount", null);
        setField(term291296, term291296.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLanguage", argTypes, term291296, args);
    }

};


