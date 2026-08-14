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

public class GithubRepoResponse_getOpenIssuesCount_1644243420290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291313;

    public GithubRepoResponse_getOpenIssuesCount_1644243420290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291313 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291313, term291313.getClass(), "id", null);
        setField(term291313, term291313.getClass(), "nodeId", null);
        setField(term291313, term291313.getClass(), "name", null);
        setField(term291313, term291313.getClass(), "fullName", null);
        setField(term291313, term291313.getClass(), "_private", null);
        setField(term291313, term291313.getClass(), "owner", null);
        setField(term291313, term291313.getClass(), "htmlUrl", null);
        setField(term291313, term291313.getClass(), "description", null);
        setField(term291313, term291313.getClass(), "fork", null);
        setField(term291313, term291313.getClass(), "url", null);
        setField(term291313, term291313.getClass(), "forksUrl", null);
        setField(term291313, term291313.getClass(), "keysUrl", null);
        setField(term291313, term291313.getClass(), "collaboratorsUrl", null);
        setField(term291313, term291313.getClass(), "teamsUrl", null);
        setField(term291313, term291313.getClass(), "hooksUrl", null);
        setField(term291313, term291313.getClass(), "issueEventsUrl", null);
        setField(term291313, term291313.getClass(), "eventsUrl", null);
        setField(term291313, term291313.getClass(), "assigneesUrl", null);
        setField(term291313, term291313.getClass(), "branchesUrl", null);
        setField(term291313, term291313.getClass(), "tagsUrl", null);
        setField(term291313, term291313.getClass(), "blobsUrl", null);
        setField(term291313, term291313.getClass(), "gitTagsUrl", null);
        setField(term291313, term291313.getClass(), "gitRefsUrl", null);
        setField(term291313, term291313.getClass(), "treesUrl", null);
        setField(term291313, term291313.getClass(), "statusesUrl", null);
        setField(term291313, term291313.getClass(), "languagesUrl", null);
        setField(term291313, term291313.getClass(), "stargazersUrl", null);
        setField(term291313, term291313.getClass(), "contributorsUrl", null);
        setField(term291313, term291313.getClass(), "subscribersUrl", null);
        setField(term291313, term291313.getClass(), "subscriptionUrl", null);
        setField(term291313, term291313.getClass(), "commitsUrl", null);
        setField(term291313, term291313.getClass(), "gitCommitsUrl", null);
        setField(term291313, term291313.getClass(), "commentsUrl", null);
        setField(term291313, term291313.getClass(), "issueCommentUrl", null);
        setField(term291313, term291313.getClass(), "contentsUrl", null);
        setField(term291313, term291313.getClass(), "compareUrl", null);
        setField(term291313, term291313.getClass(), "mergesUrl", null);
        setField(term291313, term291313.getClass(), "archiveUrl", null);
        setField(term291313, term291313.getClass(), "downloadsUrl", null);
        setField(term291313, term291313.getClass(), "issuesUrl", null);
        setField(term291313, term291313.getClass(), "pullsUrl", null);
        setField(term291313, term291313.getClass(), "milestonesUrl", null);
        setField(term291313, term291313.getClass(), "notificationsUrl", null);
        setField(term291313, term291313.getClass(), "labelsUrl", null);
        setField(term291313, term291313.getClass(), "releasesUrl", null);
        setField(term291313, term291313.getClass(), "deploymentsUrl", null);
        setField(term291313, term291313.getClass(), "createdAt", null);
        setField(term291313, term291313.getClass(), "updatedAt", null);
        setField(term291313, term291313.getClass(), "pushedAt", null);
        setField(term291313, term291313.getClass(), "gitUrl", null);
        setField(term291313, term291313.getClass(), "sshUrl", null);
        setField(term291313, term291313.getClass(), "cloneUrl", null);
        setField(term291313, term291313.getClass(), "svnUrl", null);
        setField(term291313, term291313.getClass(), "homepage", null);
        setField(term291313, term291313.getClass(), "size", null);
        setField(term291313, term291313.getClass(), "stargazersCount", null);
        setField(term291313, term291313.getClass(), "watchersCount", null);
        setField(term291313, term291313.getClass(), "language", null);
        setField(term291313, term291313.getClass(), "hasIssues", null);
        setField(term291313, term291313.getClass(), "hasProjects", null);
        setField(term291313, term291313.getClass(), "hasDownloads", null);
        setField(term291313, term291313.getClass(), "hasWiki", null);
        setField(term291313, term291313.getClass(), "hasPages", null);
        setField(term291313, term291313.getClass(), "forksCount", null);
        setField(term291313, term291313.getClass(), "archived", null);
        setField(term291313, term291313.getClass(), "disabled", null);
        setField(term291313, term291313.getClass(), "openIssuesCount", null);
        setField(term291313, term291313.getClass(), "license", null);
        setField(term291313, term291313.getClass(), "allowForking", null);
        setField(term291313, term291313.getClass(), "isTemplate", null);
        setField(term291313, term291313.getClass(), "topics", null);
        setField(term291313, term291313.getClass(), "visibility", null);
        setField(term291313, term291313.getClass(), "forks", null);
        setField(term291313, term291313.getClass(), "openIssues", null);
        setField(term291313, term291313.getClass(), "watchers", null);
        setField(term291313, term291313.getClass(), "defaultBranch", null);
        setField(term291313, term291313.getClass(), "networkCount", null);
        setField(term291313, term291313.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpenIssuesCount", argTypes, term291313, args);
    }

};


