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

public class GithubRepoResponse_getprivate_144428087713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52290;

    public GithubRepoResponse_getprivate_144428087713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52290 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term52290, term52290.getClass(), "id", null);
        setField(term52290, term52290.getClass(), "nodeId", null);
        setField(term52290, term52290.getClass(), "name", null);
        setField(term52290, term52290.getClass(), "fullName", null);
        setField(term52290, term52290.getClass(), "_private", null);
        setField(term52290, term52290.getClass(), "owner", null);
        setField(term52290, term52290.getClass(), "htmlUrl", null);
        setField(term52290, term52290.getClass(), "description", null);
        setField(term52290, term52290.getClass(), "fork", null);
        setField(term52290, term52290.getClass(), "url", null);
        setField(term52290, term52290.getClass(), "forksUrl", null);
        setField(term52290, term52290.getClass(), "keysUrl", null);
        setField(term52290, term52290.getClass(), "collaboratorsUrl", null);
        setField(term52290, term52290.getClass(), "teamsUrl", null);
        setField(term52290, term52290.getClass(), "hooksUrl", null);
        setField(term52290, term52290.getClass(), "issueEventsUrl", null);
        setField(term52290, term52290.getClass(), "eventsUrl", null);
        setField(term52290, term52290.getClass(), "assigneesUrl", null);
        setField(term52290, term52290.getClass(), "branchesUrl", null);
        setField(term52290, term52290.getClass(), "tagsUrl", null);
        setField(term52290, term52290.getClass(), "blobsUrl", null);
        setField(term52290, term52290.getClass(), "gitTagsUrl", null);
        setField(term52290, term52290.getClass(), "gitRefsUrl", null);
        setField(term52290, term52290.getClass(), "treesUrl", null);
        setField(term52290, term52290.getClass(), "statusesUrl", null);
        setField(term52290, term52290.getClass(), "languagesUrl", null);
        setField(term52290, term52290.getClass(), "stargazersUrl", null);
        setField(term52290, term52290.getClass(), "contributorsUrl", null);
        setField(term52290, term52290.getClass(), "subscribersUrl", null);
        setField(term52290, term52290.getClass(), "subscriptionUrl", null);
        setField(term52290, term52290.getClass(), "commitsUrl", null);
        setField(term52290, term52290.getClass(), "gitCommitsUrl", null);
        setField(term52290, term52290.getClass(), "commentsUrl", null);
        setField(term52290, term52290.getClass(), "issueCommentUrl", null);
        setField(term52290, term52290.getClass(), "contentsUrl", null);
        setField(term52290, term52290.getClass(), "compareUrl", null);
        setField(term52290, term52290.getClass(), "mergesUrl", null);
        setField(term52290, term52290.getClass(), "archiveUrl", null);
        setField(term52290, term52290.getClass(), "downloadsUrl", null);
        setField(term52290, term52290.getClass(), "issuesUrl", null);
        setField(term52290, term52290.getClass(), "pullsUrl", null);
        setField(term52290, term52290.getClass(), "milestonesUrl", null);
        setField(term52290, term52290.getClass(), "notificationsUrl", null);
        setField(term52290, term52290.getClass(), "labelsUrl", null);
        setField(term52290, term52290.getClass(), "releasesUrl", null);
        setField(term52290, term52290.getClass(), "deploymentsUrl", null);
        setField(term52290, term52290.getClass(), "createdAt", null);
        setField(term52290, term52290.getClass(), "updatedAt", null);
        setField(term52290, term52290.getClass(), "pushedAt", null);
        setField(term52290, term52290.getClass(), "gitUrl", null);
        setField(term52290, term52290.getClass(), "sshUrl", null);
        setField(term52290, term52290.getClass(), "cloneUrl", null);
        setField(term52290, term52290.getClass(), "svnUrl", null);
        setField(term52290, term52290.getClass(), "homepage", null);
        setField(term52290, term52290.getClass(), "size", null);
        setField(term52290, term52290.getClass(), "stargazersCount", null);
        setField(term52290, term52290.getClass(), "watchersCount", null);
        setField(term52290, term52290.getClass(), "language", null);
        setField(term52290, term52290.getClass(), "hasIssues", null);
        setField(term52290, term52290.getClass(), "hasProjects", null);
        setField(term52290, term52290.getClass(), "hasDownloads", null);
        setField(term52290, term52290.getClass(), "hasWiki", null);
        setField(term52290, term52290.getClass(), "hasPages", null);
        setField(term52290, term52290.getClass(), "forksCount", null);
        setField(term52290, term52290.getClass(), "archived", null);
        setField(term52290, term52290.getClass(), "disabled", null);
        setField(term52290, term52290.getClass(), "openIssuesCount", null);
        setField(term52290, term52290.getClass(), "license", null);
        setField(term52290, term52290.getClass(), "allowForking", null);
        setField(term52290, term52290.getClass(), "isTemplate", null);
        setField(term52290, term52290.getClass(), "topics", null);
        setField(term52290, term52290.getClass(), "visibility", null);
        setField(term52290, term52290.getClass(), "forks", null);
        setField(term52290, term52290.getClass(), "openIssues", null);
        setField(term52290, term52290.getClass(), "watchers", null);
        setField(term52290, term52290.getClass(), "defaultBranch", null);
        setField(term52290, term52290.getClass(), "networkCount", null);
        setField(term52290, term52290.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get_private", argTypes, term52290, args);
    }

};


