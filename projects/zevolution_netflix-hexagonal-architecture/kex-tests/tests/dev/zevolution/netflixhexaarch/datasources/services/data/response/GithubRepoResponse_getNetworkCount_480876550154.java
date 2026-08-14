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

public class GithubRepoResponse_getNetworkCount_480876550154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286236;

    public GithubRepoResponse_getNetworkCount_480876550154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286236 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term286236, term286236.getClass(), "id", null);
        setField(term286236, term286236.getClass(), "nodeId", null);
        setField(term286236, term286236.getClass(), "name", null);
        setField(term286236, term286236.getClass(), "fullName", null);
        setField(term286236, term286236.getClass(), "_private", null);
        setField(term286236, term286236.getClass(), "owner", null);
        setField(term286236, term286236.getClass(), "htmlUrl", null);
        setField(term286236, term286236.getClass(), "description", null);
        setField(term286236, term286236.getClass(), "fork", null);
        setField(term286236, term286236.getClass(), "url", null);
        setField(term286236, term286236.getClass(), "forksUrl", null);
        setField(term286236, term286236.getClass(), "keysUrl", null);
        setField(term286236, term286236.getClass(), "collaboratorsUrl", null);
        setField(term286236, term286236.getClass(), "teamsUrl", null);
        setField(term286236, term286236.getClass(), "hooksUrl", null);
        setField(term286236, term286236.getClass(), "issueEventsUrl", null);
        setField(term286236, term286236.getClass(), "eventsUrl", null);
        setField(term286236, term286236.getClass(), "assigneesUrl", null);
        setField(term286236, term286236.getClass(), "branchesUrl", null);
        setField(term286236, term286236.getClass(), "tagsUrl", null);
        setField(term286236, term286236.getClass(), "blobsUrl", null);
        setField(term286236, term286236.getClass(), "gitTagsUrl", null);
        setField(term286236, term286236.getClass(), "gitRefsUrl", null);
        setField(term286236, term286236.getClass(), "treesUrl", null);
        setField(term286236, term286236.getClass(), "statusesUrl", null);
        setField(term286236, term286236.getClass(), "languagesUrl", null);
        setField(term286236, term286236.getClass(), "stargazersUrl", null);
        setField(term286236, term286236.getClass(), "contributorsUrl", null);
        setField(term286236, term286236.getClass(), "subscribersUrl", null);
        setField(term286236, term286236.getClass(), "subscriptionUrl", null);
        setField(term286236, term286236.getClass(), "commitsUrl", null);
        setField(term286236, term286236.getClass(), "gitCommitsUrl", null);
        setField(term286236, term286236.getClass(), "commentsUrl", null);
        setField(term286236, term286236.getClass(), "issueCommentUrl", null);
        setField(term286236, term286236.getClass(), "contentsUrl", null);
        setField(term286236, term286236.getClass(), "compareUrl", null);
        setField(term286236, term286236.getClass(), "mergesUrl", null);
        setField(term286236, term286236.getClass(), "archiveUrl", null);
        setField(term286236, term286236.getClass(), "downloadsUrl", null);
        setField(term286236, term286236.getClass(), "issuesUrl", null);
        setField(term286236, term286236.getClass(), "pullsUrl", null);
        setField(term286236, term286236.getClass(), "milestonesUrl", null);
        setField(term286236, term286236.getClass(), "notificationsUrl", null);
        setField(term286236, term286236.getClass(), "labelsUrl", null);
        setField(term286236, term286236.getClass(), "releasesUrl", null);
        setField(term286236, term286236.getClass(), "deploymentsUrl", null);
        setField(term286236, term286236.getClass(), "createdAt", null);
        setField(term286236, term286236.getClass(), "updatedAt", null);
        setField(term286236, term286236.getClass(), "pushedAt", null);
        setField(term286236, term286236.getClass(), "gitUrl", null);
        setField(term286236, term286236.getClass(), "sshUrl", null);
        setField(term286236, term286236.getClass(), "cloneUrl", null);
        setField(term286236, term286236.getClass(), "svnUrl", null);
        setField(term286236, term286236.getClass(), "homepage", null);
        setField(term286236, term286236.getClass(), "size", null);
        setField(term286236, term286236.getClass(), "stargazersCount", null);
        setField(term286236, term286236.getClass(), "watchersCount", null);
        setField(term286236, term286236.getClass(), "language", null);
        setField(term286236, term286236.getClass(), "hasIssues", null);
        setField(term286236, term286236.getClass(), "hasProjects", null);
        setField(term286236, term286236.getClass(), "hasDownloads", null);
        setField(term286236, term286236.getClass(), "hasWiki", null);
        setField(term286236, term286236.getClass(), "hasPages", null);
        setField(term286236, term286236.getClass(), "forksCount", null);
        setField(term286236, term286236.getClass(), "archived", null);
        setField(term286236, term286236.getClass(), "disabled", null);
        setField(term286236, term286236.getClass(), "openIssuesCount", null);
        setField(term286236, term286236.getClass(), "license", null);
        setField(term286236, term286236.getClass(), "allowForking", null);
        setField(term286236, term286236.getClass(), "isTemplate", null);
        setField(term286236, term286236.getClass(), "topics", null);
        setField(term286236, term286236.getClass(), "visibility", null);
        setField(term286236, term286236.getClass(), "forks", null);
        setField(term286236, term286236.getClass(), "openIssues", null);
        setField(term286236, term286236.getClass(), "watchers", null);
        setField(term286236, term286236.getClass(), "defaultBranch", null);
        setField(term286236, term286236.getClass(), "networkCount", null);
        setField(term286236, term286236.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetworkCount", argTypes, term286236, args);
    }

};


