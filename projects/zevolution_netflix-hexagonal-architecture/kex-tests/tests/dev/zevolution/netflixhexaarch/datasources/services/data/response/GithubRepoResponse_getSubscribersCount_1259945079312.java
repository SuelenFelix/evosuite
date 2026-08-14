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

public class GithubRepoResponse_getSubscribersCount_1259945079312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291335;

    public GithubRepoResponse_getSubscribersCount_1259945079312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291335 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291335, term291335.getClass(), "id", null);
        setField(term291335, term291335.getClass(), "nodeId", null);
        setField(term291335, term291335.getClass(), "name", null);
        setField(term291335, term291335.getClass(), "fullName", null);
        setField(term291335, term291335.getClass(), "_private", null);
        setField(term291335, term291335.getClass(), "owner", null);
        setField(term291335, term291335.getClass(), "htmlUrl", null);
        setField(term291335, term291335.getClass(), "description", null);
        setField(term291335, term291335.getClass(), "fork", null);
        setField(term291335, term291335.getClass(), "url", null);
        setField(term291335, term291335.getClass(), "forksUrl", null);
        setField(term291335, term291335.getClass(), "keysUrl", null);
        setField(term291335, term291335.getClass(), "collaboratorsUrl", null);
        setField(term291335, term291335.getClass(), "teamsUrl", null);
        setField(term291335, term291335.getClass(), "hooksUrl", null);
        setField(term291335, term291335.getClass(), "issueEventsUrl", null);
        setField(term291335, term291335.getClass(), "eventsUrl", null);
        setField(term291335, term291335.getClass(), "assigneesUrl", null);
        setField(term291335, term291335.getClass(), "branchesUrl", null);
        setField(term291335, term291335.getClass(), "tagsUrl", null);
        setField(term291335, term291335.getClass(), "blobsUrl", null);
        setField(term291335, term291335.getClass(), "gitTagsUrl", null);
        setField(term291335, term291335.getClass(), "gitRefsUrl", null);
        setField(term291335, term291335.getClass(), "treesUrl", null);
        setField(term291335, term291335.getClass(), "statusesUrl", null);
        setField(term291335, term291335.getClass(), "languagesUrl", null);
        setField(term291335, term291335.getClass(), "stargazersUrl", null);
        setField(term291335, term291335.getClass(), "contributorsUrl", null);
        setField(term291335, term291335.getClass(), "subscribersUrl", null);
        setField(term291335, term291335.getClass(), "subscriptionUrl", null);
        setField(term291335, term291335.getClass(), "commitsUrl", null);
        setField(term291335, term291335.getClass(), "gitCommitsUrl", null);
        setField(term291335, term291335.getClass(), "commentsUrl", null);
        setField(term291335, term291335.getClass(), "issueCommentUrl", null);
        setField(term291335, term291335.getClass(), "contentsUrl", null);
        setField(term291335, term291335.getClass(), "compareUrl", null);
        setField(term291335, term291335.getClass(), "mergesUrl", null);
        setField(term291335, term291335.getClass(), "archiveUrl", null);
        setField(term291335, term291335.getClass(), "downloadsUrl", null);
        setField(term291335, term291335.getClass(), "issuesUrl", null);
        setField(term291335, term291335.getClass(), "pullsUrl", null);
        setField(term291335, term291335.getClass(), "milestonesUrl", null);
        setField(term291335, term291335.getClass(), "notificationsUrl", null);
        setField(term291335, term291335.getClass(), "labelsUrl", null);
        setField(term291335, term291335.getClass(), "releasesUrl", null);
        setField(term291335, term291335.getClass(), "deploymentsUrl", null);
        setField(term291335, term291335.getClass(), "createdAt", null);
        setField(term291335, term291335.getClass(), "updatedAt", null);
        setField(term291335, term291335.getClass(), "pushedAt", null);
        setField(term291335, term291335.getClass(), "gitUrl", null);
        setField(term291335, term291335.getClass(), "sshUrl", null);
        setField(term291335, term291335.getClass(), "cloneUrl", null);
        setField(term291335, term291335.getClass(), "svnUrl", null);
        setField(term291335, term291335.getClass(), "homepage", null);
        setField(term291335, term291335.getClass(), "size", null);
        setField(term291335, term291335.getClass(), "stargazersCount", null);
        setField(term291335, term291335.getClass(), "watchersCount", null);
        setField(term291335, term291335.getClass(), "language", null);
        setField(term291335, term291335.getClass(), "hasIssues", null);
        setField(term291335, term291335.getClass(), "hasProjects", null);
        setField(term291335, term291335.getClass(), "hasDownloads", null);
        setField(term291335, term291335.getClass(), "hasWiki", null);
        setField(term291335, term291335.getClass(), "hasPages", null);
        setField(term291335, term291335.getClass(), "forksCount", null);
        setField(term291335, term291335.getClass(), "archived", null);
        setField(term291335, term291335.getClass(), "disabled", null);
        setField(term291335, term291335.getClass(), "openIssuesCount", null);
        setField(term291335, term291335.getClass(), "license", null);
        setField(term291335, term291335.getClass(), "allowForking", null);
        setField(term291335, term291335.getClass(), "isTemplate", null);
        setField(term291335, term291335.getClass(), "topics", null);
        setField(term291335, term291335.getClass(), "visibility", null);
        setField(term291335, term291335.getClass(), "forks", null);
        setField(term291335, term291335.getClass(), "openIssues", null);
        setField(term291335, term291335.getClass(), "watchers", null);
        setField(term291335, term291335.getClass(), "defaultBranch", null);
        setField(term291335, term291335.getClass(), "networkCount", null);
        setField(term291335, term291335.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubscribersCount", argTypes, term291335, args);
    }

};


