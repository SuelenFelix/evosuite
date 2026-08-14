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

public class GithubRepoResponse_getName_6862297077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45656;

    public GithubRepoResponse_getName_6862297077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45656 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term45656, term45656.getClass(), "id", null);
        setField(term45656, term45656.getClass(), "nodeId", null);
        setField(term45656, term45656.getClass(), "name", null);
        setField(term45656, term45656.getClass(), "fullName", null);
        setField(term45656, term45656.getClass(), "_private", null);
        setField(term45656, term45656.getClass(), "owner", null);
        setField(term45656, term45656.getClass(), "htmlUrl", null);
        setField(term45656, term45656.getClass(), "description", null);
        setField(term45656, term45656.getClass(), "fork", null);
        setField(term45656, term45656.getClass(), "url", null);
        setField(term45656, term45656.getClass(), "forksUrl", null);
        setField(term45656, term45656.getClass(), "keysUrl", null);
        setField(term45656, term45656.getClass(), "collaboratorsUrl", null);
        setField(term45656, term45656.getClass(), "teamsUrl", null);
        setField(term45656, term45656.getClass(), "hooksUrl", null);
        setField(term45656, term45656.getClass(), "issueEventsUrl", null);
        setField(term45656, term45656.getClass(), "eventsUrl", null);
        setField(term45656, term45656.getClass(), "assigneesUrl", null);
        setField(term45656, term45656.getClass(), "branchesUrl", null);
        setField(term45656, term45656.getClass(), "tagsUrl", null);
        setField(term45656, term45656.getClass(), "blobsUrl", null);
        setField(term45656, term45656.getClass(), "gitTagsUrl", null);
        setField(term45656, term45656.getClass(), "gitRefsUrl", null);
        setField(term45656, term45656.getClass(), "treesUrl", null);
        setField(term45656, term45656.getClass(), "statusesUrl", null);
        setField(term45656, term45656.getClass(), "languagesUrl", null);
        setField(term45656, term45656.getClass(), "stargazersUrl", null);
        setField(term45656, term45656.getClass(), "contributorsUrl", null);
        setField(term45656, term45656.getClass(), "subscribersUrl", null);
        setField(term45656, term45656.getClass(), "subscriptionUrl", null);
        setField(term45656, term45656.getClass(), "commitsUrl", null);
        setField(term45656, term45656.getClass(), "gitCommitsUrl", null);
        setField(term45656, term45656.getClass(), "commentsUrl", null);
        setField(term45656, term45656.getClass(), "issueCommentUrl", null);
        setField(term45656, term45656.getClass(), "contentsUrl", null);
        setField(term45656, term45656.getClass(), "compareUrl", null);
        setField(term45656, term45656.getClass(), "mergesUrl", null);
        setField(term45656, term45656.getClass(), "archiveUrl", null);
        setField(term45656, term45656.getClass(), "downloadsUrl", null);
        setField(term45656, term45656.getClass(), "issuesUrl", null);
        setField(term45656, term45656.getClass(), "pullsUrl", null);
        setField(term45656, term45656.getClass(), "milestonesUrl", null);
        setField(term45656, term45656.getClass(), "notificationsUrl", null);
        setField(term45656, term45656.getClass(), "labelsUrl", null);
        setField(term45656, term45656.getClass(), "releasesUrl", null);
        setField(term45656, term45656.getClass(), "deploymentsUrl", null);
        setField(term45656, term45656.getClass(), "createdAt", null);
        setField(term45656, term45656.getClass(), "updatedAt", null);
        setField(term45656, term45656.getClass(), "pushedAt", null);
        setField(term45656, term45656.getClass(), "gitUrl", null);
        setField(term45656, term45656.getClass(), "sshUrl", null);
        setField(term45656, term45656.getClass(), "cloneUrl", null);
        setField(term45656, term45656.getClass(), "svnUrl", null);
        setField(term45656, term45656.getClass(), "homepage", null);
        setField(term45656, term45656.getClass(), "size", null);
        setField(term45656, term45656.getClass(), "stargazersCount", null);
        setField(term45656, term45656.getClass(), "watchersCount", null);
        setField(term45656, term45656.getClass(), "language", null);
        setField(term45656, term45656.getClass(), "hasIssues", null);
        setField(term45656, term45656.getClass(), "hasProjects", null);
        setField(term45656, term45656.getClass(), "hasDownloads", null);
        setField(term45656, term45656.getClass(), "hasWiki", null);
        setField(term45656, term45656.getClass(), "hasPages", null);
        setField(term45656, term45656.getClass(), "forksCount", null);
        setField(term45656, term45656.getClass(), "archived", null);
        setField(term45656, term45656.getClass(), "disabled", null);
        setField(term45656, term45656.getClass(), "openIssuesCount", null);
        setField(term45656, term45656.getClass(), "license", null);
        setField(term45656, term45656.getClass(), "allowForking", null);
        setField(term45656, term45656.getClass(), "isTemplate", null);
        setField(term45656, term45656.getClass(), "topics", null);
        setField(term45656, term45656.getClass(), "visibility", null);
        setField(term45656, term45656.getClass(), "forks", null);
        setField(term45656, term45656.getClass(), "openIssues", null);
        setField(term45656, term45656.getClass(), "watchers", null);
        setField(term45656, term45656.getClass(), "defaultBranch", null);
        setField(term45656, term45656.getClass(), "networkCount", null);
        setField(term45656, term45656.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term45656, args);
    }

};


