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

public class GithubRepoResponse_setIssueCommentUrl_1473992291226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291249;

    public GithubRepoResponse_setIssueCommentUrl_1473992291226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291249 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291249, term291249.getClass(), "id", null);
        setField(term291249, term291249.getClass(), "nodeId", null);
        setField(term291249, term291249.getClass(), "name", null);
        setField(term291249, term291249.getClass(), "fullName", null);
        setField(term291249, term291249.getClass(), "_private", null);
        setField(term291249, term291249.getClass(), "owner", null);
        setField(term291249, term291249.getClass(), "htmlUrl", null);
        setField(term291249, term291249.getClass(), "description", null);
        setField(term291249, term291249.getClass(), "fork", null);
        setField(term291249, term291249.getClass(), "url", null);
        setField(term291249, term291249.getClass(), "forksUrl", null);
        setField(term291249, term291249.getClass(), "keysUrl", null);
        setField(term291249, term291249.getClass(), "collaboratorsUrl", null);
        setField(term291249, term291249.getClass(), "teamsUrl", null);
        setField(term291249, term291249.getClass(), "hooksUrl", null);
        setField(term291249, term291249.getClass(), "issueEventsUrl", null);
        setField(term291249, term291249.getClass(), "eventsUrl", null);
        setField(term291249, term291249.getClass(), "assigneesUrl", null);
        setField(term291249, term291249.getClass(), "branchesUrl", null);
        setField(term291249, term291249.getClass(), "tagsUrl", null);
        setField(term291249, term291249.getClass(), "blobsUrl", null);
        setField(term291249, term291249.getClass(), "gitTagsUrl", null);
        setField(term291249, term291249.getClass(), "gitRefsUrl", null);
        setField(term291249, term291249.getClass(), "treesUrl", null);
        setField(term291249, term291249.getClass(), "statusesUrl", null);
        setField(term291249, term291249.getClass(), "languagesUrl", null);
        setField(term291249, term291249.getClass(), "stargazersUrl", null);
        setField(term291249, term291249.getClass(), "contributorsUrl", null);
        setField(term291249, term291249.getClass(), "subscribersUrl", null);
        setField(term291249, term291249.getClass(), "subscriptionUrl", null);
        setField(term291249, term291249.getClass(), "commitsUrl", null);
        setField(term291249, term291249.getClass(), "gitCommitsUrl", null);
        setField(term291249, term291249.getClass(), "commentsUrl", null);
        setField(term291249, term291249.getClass(), "issueCommentUrl", null);
        setField(term291249, term291249.getClass(), "contentsUrl", null);
        setField(term291249, term291249.getClass(), "compareUrl", null);
        setField(term291249, term291249.getClass(), "mergesUrl", null);
        setField(term291249, term291249.getClass(), "archiveUrl", null);
        setField(term291249, term291249.getClass(), "downloadsUrl", null);
        setField(term291249, term291249.getClass(), "issuesUrl", null);
        setField(term291249, term291249.getClass(), "pullsUrl", null);
        setField(term291249, term291249.getClass(), "milestonesUrl", null);
        setField(term291249, term291249.getClass(), "notificationsUrl", null);
        setField(term291249, term291249.getClass(), "labelsUrl", null);
        setField(term291249, term291249.getClass(), "releasesUrl", null);
        setField(term291249, term291249.getClass(), "deploymentsUrl", null);
        setField(term291249, term291249.getClass(), "createdAt", null);
        setField(term291249, term291249.getClass(), "updatedAt", null);
        setField(term291249, term291249.getClass(), "pushedAt", null);
        setField(term291249, term291249.getClass(), "gitUrl", null);
        setField(term291249, term291249.getClass(), "sshUrl", null);
        setField(term291249, term291249.getClass(), "cloneUrl", null);
        setField(term291249, term291249.getClass(), "svnUrl", null);
        setField(term291249, term291249.getClass(), "homepage", null);
        setField(term291249, term291249.getClass(), "size", null);
        setField(term291249, term291249.getClass(), "stargazersCount", null);
        setField(term291249, term291249.getClass(), "watchersCount", null);
        setField(term291249, term291249.getClass(), "language", null);
        setField(term291249, term291249.getClass(), "hasIssues", null);
        setField(term291249, term291249.getClass(), "hasProjects", null);
        setField(term291249, term291249.getClass(), "hasDownloads", null);
        setField(term291249, term291249.getClass(), "hasWiki", null);
        setField(term291249, term291249.getClass(), "hasPages", null);
        setField(term291249, term291249.getClass(), "forksCount", null);
        setField(term291249, term291249.getClass(), "archived", null);
        setField(term291249, term291249.getClass(), "disabled", null);
        setField(term291249, term291249.getClass(), "openIssuesCount", null);
        setField(term291249, term291249.getClass(), "license", null);
        setField(term291249, term291249.getClass(), "allowForking", null);
        setField(term291249, term291249.getClass(), "isTemplate", null);
        setField(term291249, term291249.getClass(), "topics", null);
        setField(term291249, term291249.getClass(), "visibility", null);
        setField(term291249, term291249.getClass(), "forks", null);
        setField(term291249, term291249.getClass(), "openIssues", null);
        setField(term291249, term291249.getClass(), "watchers", null);
        setField(term291249, term291249.getClass(), "defaultBranch", null);
        setField(term291249, term291249.getClass(), "networkCount", null);
        setField(term291249, term291249.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIssueCommentUrl", argTypes, term291249, args);
    }

};


