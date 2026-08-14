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

public class GithubRepoResponse_setIssueCommentUrl_1473992291225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291248;

    public GithubRepoResponse_setIssueCommentUrl_1473992291225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291248 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291248, term291248.getClass(), "id", null);
        setField(term291248, term291248.getClass(), "nodeId", null);
        setField(term291248, term291248.getClass(), "name", null);
        setField(term291248, term291248.getClass(), "fullName", null);
        setField(term291248, term291248.getClass(), "_private", null);
        setField(term291248, term291248.getClass(), "owner", null);
        setField(term291248, term291248.getClass(), "htmlUrl", null);
        setField(term291248, term291248.getClass(), "description", null);
        setField(term291248, term291248.getClass(), "fork", null);
        setField(term291248, term291248.getClass(), "url", null);
        setField(term291248, term291248.getClass(), "forksUrl", null);
        setField(term291248, term291248.getClass(), "keysUrl", null);
        setField(term291248, term291248.getClass(), "collaboratorsUrl", null);
        setField(term291248, term291248.getClass(), "teamsUrl", null);
        setField(term291248, term291248.getClass(), "hooksUrl", null);
        setField(term291248, term291248.getClass(), "issueEventsUrl", null);
        setField(term291248, term291248.getClass(), "eventsUrl", null);
        setField(term291248, term291248.getClass(), "assigneesUrl", null);
        setField(term291248, term291248.getClass(), "branchesUrl", null);
        setField(term291248, term291248.getClass(), "tagsUrl", null);
        setField(term291248, term291248.getClass(), "blobsUrl", null);
        setField(term291248, term291248.getClass(), "gitTagsUrl", null);
        setField(term291248, term291248.getClass(), "gitRefsUrl", null);
        setField(term291248, term291248.getClass(), "treesUrl", null);
        setField(term291248, term291248.getClass(), "statusesUrl", null);
        setField(term291248, term291248.getClass(), "languagesUrl", null);
        setField(term291248, term291248.getClass(), "stargazersUrl", null);
        setField(term291248, term291248.getClass(), "contributorsUrl", null);
        setField(term291248, term291248.getClass(), "subscribersUrl", null);
        setField(term291248, term291248.getClass(), "subscriptionUrl", null);
        setField(term291248, term291248.getClass(), "commitsUrl", null);
        setField(term291248, term291248.getClass(), "gitCommitsUrl", null);
        setField(term291248, term291248.getClass(), "commentsUrl", null);
        setField(term291248, term291248.getClass(), "issueCommentUrl", null);
        setField(term291248, term291248.getClass(), "contentsUrl", null);
        setField(term291248, term291248.getClass(), "compareUrl", null);
        setField(term291248, term291248.getClass(), "mergesUrl", null);
        setField(term291248, term291248.getClass(), "archiveUrl", null);
        setField(term291248, term291248.getClass(), "downloadsUrl", null);
        setField(term291248, term291248.getClass(), "issuesUrl", null);
        setField(term291248, term291248.getClass(), "pullsUrl", null);
        setField(term291248, term291248.getClass(), "milestonesUrl", null);
        setField(term291248, term291248.getClass(), "notificationsUrl", null);
        setField(term291248, term291248.getClass(), "labelsUrl", null);
        setField(term291248, term291248.getClass(), "releasesUrl", null);
        setField(term291248, term291248.getClass(), "deploymentsUrl", null);
        setField(term291248, term291248.getClass(), "createdAt", null);
        setField(term291248, term291248.getClass(), "updatedAt", null);
        setField(term291248, term291248.getClass(), "pushedAt", null);
        setField(term291248, term291248.getClass(), "gitUrl", null);
        setField(term291248, term291248.getClass(), "sshUrl", null);
        setField(term291248, term291248.getClass(), "cloneUrl", null);
        setField(term291248, term291248.getClass(), "svnUrl", null);
        setField(term291248, term291248.getClass(), "homepage", null);
        setField(term291248, term291248.getClass(), "size", null);
        setField(term291248, term291248.getClass(), "stargazersCount", null);
        setField(term291248, term291248.getClass(), "watchersCount", null);
        setField(term291248, term291248.getClass(), "language", null);
        setField(term291248, term291248.getClass(), "hasIssues", null);
        setField(term291248, term291248.getClass(), "hasProjects", null);
        setField(term291248, term291248.getClass(), "hasDownloads", null);
        setField(term291248, term291248.getClass(), "hasWiki", null);
        setField(term291248, term291248.getClass(), "hasPages", null);
        setField(term291248, term291248.getClass(), "forksCount", null);
        setField(term291248, term291248.getClass(), "archived", null);
        setField(term291248, term291248.getClass(), "disabled", null);
        setField(term291248, term291248.getClass(), "openIssuesCount", null);
        setField(term291248, term291248.getClass(), "license", null);
        setField(term291248, term291248.getClass(), "allowForking", null);
        setField(term291248, term291248.getClass(), "isTemplate", null);
        setField(term291248, term291248.getClass(), "topics", null);
        setField(term291248, term291248.getClass(), "visibility", null);
        setField(term291248, term291248.getClass(), "forks", null);
        setField(term291248, term291248.getClass(), "openIssues", null);
        setField(term291248, term291248.getClass(), "watchers", null);
        setField(term291248, term291248.getClass(), "defaultBranch", null);
        setField(term291248, term291248.getClass(), "networkCount", null);
        setField(term291248, term291248.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIssueCommentUrl", argTypes, term291248, args);
    }

};


