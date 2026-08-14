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

public class GithubRepoResponse_setHasIssues_371135743276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291299;

    public GithubRepoResponse_setHasIssues_371135743276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291299 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291299, term291299.getClass(), "id", null);
        setField(term291299, term291299.getClass(), "nodeId", null);
        setField(term291299, term291299.getClass(), "name", null);
        setField(term291299, term291299.getClass(), "fullName", null);
        setField(term291299, term291299.getClass(), "_private", null);
        setField(term291299, term291299.getClass(), "owner", null);
        setField(term291299, term291299.getClass(), "htmlUrl", null);
        setField(term291299, term291299.getClass(), "description", null);
        setField(term291299, term291299.getClass(), "fork", null);
        setField(term291299, term291299.getClass(), "url", null);
        setField(term291299, term291299.getClass(), "forksUrl", null);
        setField(term291299, term291299.getClass(), "keysUrl", null);
        setField(term291299, term291299.getClass(), "collaboratorsUrl", null);
        setField(term291299, term291299.getClass(), "teamsUrl", null);
        setField(term291299, term291299.getClass(), "hooksUrl", null);
        setField(term291299, term291299.getClass(), "issueEventsUrl", null);
        setField(term291299, term291299.getClass(), "eventsUrl", null);
        setField(term291299, term291299.getClass(), "assigneesUrl", null);
        setField(term291299, term291299.getClass(), "branchesUrl", null);
        setField(term291299, term291299.getClass(), "tagsUrl", null);
        setField(term291299, term291299.getClass(), "blobsUrl", null);
        setField(term291299, term291299.getClass(), "gitTagsUrl", null);
        setField(term291299, term291299.getClass(), "gitRefsUrl", null);
        setField(term291299, term291299.getClass(), "treesUrl", null);
        setField(term291299, term291299.getClass(), "statusesUrl", null);
        setField(term291299, term291299.getClass(), "languagesUrl", null);
        setField(term291299, term291299.getClass(), "stargazersUrl", null);
        setField(term291299, term291299.getClass(), "contributorsUrl", null);
        setField(term291299, term291299.getClass(), "subscribersUrl", null);
        setField(term291299, term291299.getClass(), "subscriptionUrl", null);
        setField(term291299, term291299.getClass(), "commitsUrl", null);
        setField(term291299, term291299.getClass(), "gitCommitsUrl", null);
        setField(term291299, term291299.getClass(), "commentsUrl", null);
        setField(term291299, term291299.getClass(), "issueCommentUrl", null);
        setField(term291299, term291299.getClass(), "contentsUrl", null);
        setField(term291299, term291299.getClass(), "compareUrl", null);
        setField(term291299, term291299.getClass(), "mergesUrl", null);
        setField(term291299, term291299.getClass(), "archiveUrl", null);
        setField(term291299, term291299.getClass(), "downloadsUrl", null);
        setField(term291299, term291299.getClass(), "issuesUrl", null);
        setField(term291299, term291299.getClass(), "pullsUrl", null);
        setField(term291299, term291299.getClass(), "milestonesUrl", null);
        setField(term291299, term291299.getClass(), "notificationsUrl", null);
        setField(term291299, term291299.getClass(), "labelsUrl", null);
        setField(term291299, term291299.getClass(), "releasesUrl", null);
        setField(term291299, term291299.getClass(), "deploymentsUrl", null);
        setField(term291299, term291299.getClass(), "createdAt", null);
        setField(term291299, term291299.getClass(), "updatedAt", null);
        setField(term291299, term291299.getClass(), "pushedAt", null);
        setField(term291299, term291299.getClass(), "gitUrl", null);
        setField(term291299, term291299.getClass(), "sshUrl", null);
        setField(term291299, term291299.getClass(), "cloneUrl", null);
        setField(term291299, term291299.getClass(), "svnUrl", null);
        setField(term291299, term291299.getClass(), "homepage", null);
        setField(term291299, term291299.getClass(), "size", null);
        setField(term291299, term291299.getClass(), "stargazersCount", null);
        setField(term291299, term291299.getClass(), "watchersCount", null);
        setField(term291299, term291299.getClass(), "language", null);
        setField(term291299, term291299.getClass(), "hasIssues", null);
        setField(term291299, term291299.getClass(), "hasProjects", null);
        setField(term291299, term291299.getClass(), "hasDownloads", null);
        setField(term291299, term291299.getClass(), "hasWiki", null);
        setField(term291299, term291299.getClass(), "hasPages", null);
        setField(term291299, term291299.getClass(), "forksCount", null);
        setField(term291299, term291299.getClass(), "archived", null);
        setField(term291299, term291299.getClass(), "disabled", null);
        setField(term291299, term291299.getClass(), "openIssuesCount", null);
        setField(term291299, term291299.getClass(), "license", null);
        setField(term291299, term291299.getClass(), "allowForking", null);
        setField(term291299, term291299.getClass(), "isTemplate", null);
        setField(term291299, term291299.getClass(), "topics", null);
        setField(term291299, term291299.getClass(), "visibility", null);
        setField(term291299, term291299.getClass(), "forks", null);
        setField(term291299, term291299.getClass(), "openIssues", null);
        setField(term291299, term291299.getClass(), "watchers", null);
        setField(term291299, term291299.getClass(), "defaultBranch", null);
        setField(term291299, term291299.getClass(), "networkCount", null);
        setField(term291299, term291299.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasIssues", argTypes, term291299, args);
    }

};


