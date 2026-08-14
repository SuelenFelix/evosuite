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

public class GithubRepoResponse_getUrl_2010426883177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291200;

    public GithubRepoResponse_getUrl_2010426883177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291200 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291200, term291200.getClass(), "id", null);
        setField(term291200, term291200.getClass(), "nodeId", null);
        setField(term291200, term291200.getClass(), "name", null);
        setField(term291200, term291200.getClass(), "fullName", null);
        setField(term291200, term291200.getClass(), "_private", null);
        setField(term291200, term291200.getClass(), "owner", null);
        setField(term291200, term291200.getClass(), "htmlUrl", null);
        setField(term291200, term291200.getClass(), "description", null);
        setField(term291200, term291200.getClass(), "fork", null);
        setField(term291200, term291200.getClass(), "url", null);
        setField(term291200, term291200.getClass(), "forksUrl", null);
        setField(term291200, term291200.getClass(), "keysUrl", null);
        setField(term291200, term291200.getClass(), "collaboratorsUrl", null);
        setField(term291200, term291200.getClass(), "teamsUrl", null);
        setField(term291200, term291200.getClass(), "hooksUrl", null);
        setField(term291200, term291200.getClass(), "issueEventsUrl", null);
        setField(term291200, term291200.getClass(), "eventsUrl", null);
        setField(term291200, term291200.getClass(), "assigneesUrl", null);
        setField(term291200, term291200.getClass(), "branchesUrl", null);
        setField(term291200, term291200.getClass(), "tagsUrl", null);
        setField(term291200, term291200.getClass(), "blobsUrl", null);
        setField(term291200, term291200.getClass(), "gitTagsUrl", null);
        setField(term291200, term291200.getClass(), "gitRefsUrl", null);
        setField(term291200, term291200.getClass(), "treesUrl", null);
        setField(term291200, term291200.getClass(), "statusesUrl", null);
        setField(term291200, term291200.getClass(), "languagesUrl", null);
        setField(term291200, term291200.getClass(), "stargazersUrl", null);
        setField(term291200, term291200.getClass(), "contributorsUrl", null);
        setField(term291200, term291200.getClass(), "subscribersUrl", null);
        setField(term291200, term291200.getClass(), "subscriptionUrl", null);
        setField(term291200, term291200.getClass(), "commitsUrl", null);
        setField(term291200, term291200.getClass(), "gitCommitsUrl", null);
        setField(term291200, term291200.getClass(), "commentsUrl", null);
        setField(term291200, term291200.getClass(), "issueCommentUrl", null);
        setField(term291200, term291200.getClass(), "contentsUrl", null);
        setField(term291200, term291200.getClass(), "compareUrl", null);
        setField(term291200, term291200.getClass(), "mergesUrl", null);
        setField(term291200, term291200.getClass(), "archiveUrl", null);
        setField(term291200, term291200.getClass(), "downloadsUrl", null);
        setField(term291200, term291200.getClass(), "issuesUrl", null);
        setField(term291200, term291200.getClass(), "pullsUrl", null);
        setField(term291200, term291200.getClass(), "milestonesUrl", null);
        setField(term291200, term291200.getClass(), "notificationsUrl", null);
        setField(term291200, term291200.getClass(), "labelsUrl", null);
        setField(term291200, term291200.getClass(), "releasesUrl", null);
        setField(term291200, term291200.getClass(), "deploymentsUrl", null);
        setField(term291200, term291200.getClass(), "createdAt", null);
        setField(term291200, term291200.getClass(), "updatedAt", null);
        setField(term291200, term291200.getClass(), "pushedAt", null);
        setField(term291200, term291200.getClass(), "gitUrl", null);
        setField(term291200, term291200.getClass(), "sshUrl", null);
        setField(term291200, term291200.getClass(), "cloneUrl", null);
        setField(term291200, term291200.getClass(), "svnUrl", null);
        setField(term291200, term291200.getClass(), "homepage", null);
        setField(term291200, term291200.getClass(), "size", null);
        setField(term291200, term291200.getClass(), "stargazersCount", null);
        setField(term291200, term291200.getClass(), "watchersCount", null);
        setField(term291200, term291200.getClass(), "language", null);
        setField(term291200, term291200.getClass(), "hasIssues", null);
        setField(term291200, term291200.getClass(), "hasProjects", null);
        setField(term291200, term291200.getClass(), "hasDownloads", null);
        setField(term291200, term291200.getClass(), "hasWiki", null);
        setField(term291200, term291200.getClass(), "hasPages", null);
        setField(term291200, term291200.getClass(), "forksCount", null);
        setField(term291200, term291200.getClass(), "archived", null);
        setField(term291200, term291200.getClass(), "disabled", null);
        setField(term291200, term291200.getClass(), "openIssuesCount", null);
        setField(term291200, term291200.getClass(), "license", null);
        setField(term291200, term291200.getClass(), "allowForking", null);
        setField(term291200, term291200.getClass(), "isTemplate", null);
        setField(term291200, term291200.getClass(), "topics", null);
        setField(term291200, term291200.getClass(), "visibility", null);
        setField(term291200, term291200.getClass(), "forks", null);
        setField(term291200, term291200.getClass(), "openIssues", null);
        setField(term291200, term291200.getClass(), "watchers", null);
        setField(term291200, term291200.getClass(), "defaultBranch", null);
        setField(term291200, term291200.getClass(), "networkCount", null);
        setField(term291200, term291200.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term291200, args);
    }

};


