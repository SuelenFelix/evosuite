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

public class GithubRepoResponse_getSubscriptionUrl_1663143962217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291240;

    public GithubRepoResponse_getSubscriptionUrl_1663143962217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291240 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291240, term291240.getClass(), "id", null);
        setField(term291240, term291240.getClass(), "nodeId", null);
        setField(term291240, term291240.getClass(), "name", null);
        setField(term291240, term291240.getClass(), "fullName", null);
        setField(term291240, term291240.getClass(), "_private", null);
        setField(term291240, term291240.getClass(), "owner", null);
        setField(term291240, term291240.getClass(), "htmlUrl", null);
        setField(term291240, term291240.getClass(), "description", null);
        setField(term291240, term291240.getClass(), "fork", null);
        setField(term291240, term291240.getClass(), "url", null);
        setField(term291240, term291240.getClass(), "forksUrl", null);
        setField(term291240, term291240.getClass(), "keysUrl", null);
        setField(term291240, term291240.getClass(), "collaboratorsUrl", null);
        setField(term291240, term291240.getClass(), "teamsUrl", null);
        setField(term291240, term291240.getClass(), "hooksUrl", null);
        setField(term291240, term291240.getClass(), "issueEventsUrl", null);
        setField(term291240, term291240.getClass(), "eventsUrl", null);
        setField(term291240, term291240.getClass(), "assigneesUrl", null);
        setField(term291240, term291240.getClass(), "branchesUrl", null);
        setField(term291240, term291240.getClass(), "tagsUrl", null);
        setField(term291240, term291240.getClass(), "blobsUrl", null);
        setField(term291240, term291240.getClass(), "gitTagsUrl", null);
        setField(term291240, term291240.getClass(), "gitRefsUrl", null);
        setField(term291240, term291240.getClass(), "treesUrl", null);
        setField(term291240, term291240.getClass(), "statusesUrl", null);
        setField(term291240, term291240.getClass(), "languagesUrl", null);
        setField(term291240, term291240.getClass(), "stargazersUrl", null);
        setField(term291240, term291240.getClass(), "contributorsUrl", null);
        setField(term291240, term291240.getClass(), "subscribersUrl", null);
        setField(term291240, term291240.getClass(), "subscriptionUrl", null);
        setField(term291240, term291240.getClass(), "commitsUrl", null);
        setField(term291240, term291240.getClass(), "gitCommitsUrl", null);
        setField(term291240, term291240.getClass(), "commentsUrl", null);
        setField(term291240, term291240.getClass(), "issueCommentUrl", null);
        setField(term291240, term291240.getClass(), "contentsUrl", null);
        setField(term291240, term291240.getClass(), "compareUrl", null);
        setField(term291240, term291240.getClass(), "mergesUrl", null);
        setField(term291240, term291240.getClass(), "archiveUrl", null);
        setField(term291240, term291240.getClass(), "downloadsUrl", null);
        setField(term291240, term291240.getClass(), "issuesUrl", null);
        setField(term291240, term291240.getClass(), "pullsUrl", null);
        setField(term291240, term291240.getClass(), "milestonesUrl", null);
        setField(term291240, term291240.getClass(), "notificationsUrl", null);
        setField(term291240, term291240.getClass(), "labelsUrl", null);
        setField(term291240, term291240.getClass(), "releasesUrl", null);
        setField(term291240, term291240.getClass(), "deploymentsUrl", null);
        setField(term291240, term291240.getClass(), "createdAt", null);
        setField(term291240, term291240.getClass(), "updatedAt", null);
        setField(term291240, term291240.getClass(), "pushedAt", null);
        setField(term291240, term291240.getClass(), "gitUrl", null);
        setField(term291240, term291240.getClass(), "sshUrl", null);
        setField(term291240, term291240.getClass(), "cloneUrl", null);
        setField(term291240, term291240.getClass(), "svnUrl", null);
        setField(term291240, term291240.getClass(), "homepage", null);
        setField(term291240, term291240.getClass(), "size", null);
        setField(term291240, term291240.getClass(), "stargazersCount", null);
        setField(term291240, term291240.getClass(), "watchersCount", null);
        setField(term291240, term291240.getClass(), "language", null);
        setField(term291240, term291240.getClass(), "hasIssues", null);
        setField(term291240, term291240.getClass(), "hasProjects", null);
        setField(term291240, term291240.getClass(), "hasDownloads", null);
        setField(term291240, term291240.getClass(), "hasWiki", null);
        setField(term291240, term291240.getClass(), "hasPages", null);
        setField(term291240, term291240.getClass(), "forksCount", null);
        setField(term291240, term291240.getClass(), "archived", null);
        setField(term291240, term291240.getClass(), "disabled", null);
        setField(term291240, term291240.getClass(), "openIssuesCount", null);
        setField(term291240, term291240.getClass(), "license", null);
        setField(term291240, term291240.getClass(), "allowForking", null);
        setField(term291240, term291240.getClass(), "isTemplate", null);
        setField(term291240, term291240.getClass(), "topics", null);
        setField(term291240, term291240.getClass(), "visibility", null);
        setField(term291240, term291240.getClass(), "forks", null);
        setField(term291240, term291240.getClass(), "openIssues", null);
        setField(term291240, term291240.getClass(), "watchers", null);
        setField(term291240, term291240.getClass(), "defaultBranch", null);
        setField(term291240, term291240.getClass(), "networkCount", null);
        setField(term291240, term291240.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubscriptionUrl", argTypes, term291240, args);
    }

};


