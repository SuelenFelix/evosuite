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

public class GithubRepoResponse_setFork_577426159176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291199;

    public GithubRepoResponse_setFork_577426159176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291199 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291199, term291199.getClass(), "id", null);
        setField(term291199, term291199.getClass(), "nodeId", null);
        setField(term291199, term291199.getClass(), "name", null);
        setField(term291199, term291199.getClass(), "fullName", null);
        setField(term291199, term291199.getClass(), "_private", null);
        setField(term291199, term291199.getClass(), "owner", null);
        setField(term291199, term291199.getClass(), "htmlUrl", null);
        setField(term291199, term291199.getClass(), "description", null);
        setField(term291199, term291199.getClass(), "fork", null);
        setField(term291199, term291199.getClass(), "url", null);
        setField(term291199, term291199.getClass(), "forksUrl", null);
        setField(term291199, term291199.getClass(), "keysUrl", null);
        setField(term291199, term291199.getClass(), "collaboratorsUrl", null);
        setField(term291199, term291199.getClass(), "teamsUrl", null);
        setField(term291199, term291199.getClass(), "hooksUrl", null);
        setField(term291199, term291199.getClass(), "issueEventsUrl", null);
        setField(term291199, term291199.getClass(), "eventsUrl", null);
        setField(term291199, term291199.getClass(), "assigneesUrl", null);
        setField(term291199, term291199.getClass(), "branchesUrl", null);
        setField(term291199, term291199.getClass(), "tagsUrl", null);
        setField(term291199, term291199.getClass(), "blobsUrl", null);
        setField(term291199, term291199.getClass(), "gitTagsUrl", null);
        setField(term291199, term291199.getClass(), "gitRefsUrl", null);
        setField(term291199, term291199.getClass(), "treesUrl", null);
        setField(term291199, term291199.getClass(), "statusesUrl", null);
        setField(term291199, term291199.getClass(), "languagesUrl", null);
        setField(term291199, term291199.getClass(), "stargazersUrl", null);
        setField(term291199, term291199.getClass(), "contributorsUrl", null);
        setField(term291199, term291199.getClass(), "subscribersUrl", null);
        setField(term291199, term291199.getClass(), "subscriptionUrl", null);
        setField(term291199, term291199.getClass(), "commitsUrl", null);
        setField(term291199, term291199.getClass(), "gitCommitsUrl", null);
        setField(term291199, term291199.getClass(), "commentsUrl", null);
        setField(term291199, term291199.getClass(), "issueCommentUrl", null);
        setField(term291199, term291199.getClass(), "contentsUrl", null);
        setField(term291199, term291199.getClass(), "compareUrl", null);
        setField(term291199, term291199.getClass(), "mergesUrl", null);
        setField(term291199, term291199.getClass(), "archiveUrl", null);
        setField(term291199, term291199.getClass(), "downloadsUrl", null);
        setField(term291199, term291199.getClass(), "issuesUrl", null);
        setField(term291199, term291199.getClass(), "pullsUrl", null);
        setField(term291199, term291199.getClass(), "milestonesUrl", null);
        setField(term291199, term291199.getClass(), "notificationsUrl", null);
        setField(term291199, term291199.getClass(), "labelsUrl", null);
        setField(term291199, term291199.getClass(), "releasesUrl", null);
        setField(term291199, term291199.getClass(), "deploymentsUrl", null);
        setField(term291199, term291199.getClass(), "createdAt", null);
        setField(term291199, term291199.getClass(), "updatedAt", null);
        setField(term291199, term291199.getClass(), "pushedAt", null);
        setField(term291199, term291199.getClass(), "gitUrl", null);
        setField(term291199, term291199.getClass(), "sshUrl", null);
        setField(term291199, term291199.getClass(), "cloneUrl", null);
        setField(term291199, term291199.getClass(), "svnUrl", null);
        setField(term291199, term291199.getClass(), "homepage", null);
        setField(term291199, term291199.getClass(), "size", null);
        setField(term291199, term291199.getClass(), "stargazersCount", null);
        setField(term291199, term291199.getClass(), "watchersCount", null);
        setField(term291199, term291199.getClass(), "language", null);
        setField(term291199, term291199.getClass(), "hasIssues", null);
        setField(term291199, term291199.getClass(), "hasProjects", null);
        setField(term291199, term291199.getClass(), "hasDownloads", null);
        setField(term291199, term291199.getClass(), "hasWiki", null);
        setField(term291199, term291199.getClass(), "hasPages", null);
        setField(term291199, term291199.getClass(), "forksCount", null);
        setField(term291199, term291199.getClass(), "archived", null);
        setField(term291199, term291199.getClass(), "disabled", null);
        setField(term291199, term291199.getClass(), "openIssuesCount", null);
        setField(term291199, term291199.getClass(), "license", null);
        setField(term291199, term291199.getClass(), "allowForking", null);
        setField(term291199, term291199.getClass(), "isTemplate", null);
        setField(term291199, term291199.getClass(), "topics", null);
        setField(term291199, term291199.getClass(), "visibility", null);
        setField(term291199, term291199.getClass(), "forks", null);
        setField(term291199, term291199.getClass(), "openIssues", null);
        setField(term291199, term291199.getClass(), "watchers", null);
        setField(term291199, term291199.getClass(), "defaultBranch", null);
        setField(term291199, term291199.getClass(), "networkCount", null);
        setField(term291199, term291199.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFork", argTypes, term291199, args);
    }

};


