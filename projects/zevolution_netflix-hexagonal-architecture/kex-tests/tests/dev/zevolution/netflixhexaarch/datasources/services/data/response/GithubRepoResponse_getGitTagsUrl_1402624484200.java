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

public class GithubRepoResponse_getGitTagsUrl_1402624484200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291223;

    public GithubRepoResponse_getGitTagsUrl_1402624484200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291223 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291223, term291223.getClass(), "id", null);
        setField(term291223, term291223.getClass(), "nodeId", null);
        setField(term291223, term291223.getClass(), "name", null);
        setField(term291223, term291223.getClass(), "fullName", null);
        setField(term291223, term291223.getClass(), "_private", null);
        setField(term291223, term291223.getClass(), "owner", null);
        setField(term291223, term291223.getClass(), "htmlUrl", null);
        setField(term291223, term291223.getClass(), "description", null);
        setField(term291223, term291223.getClass(), "fork", null);
        setField(term291223, term291223.getClass(), "url", null);
        setField(term291223, term291223.getClass(), "forksUrl", null);
        setField(term291223, term291223.getClass(), "keysUrl", null);
        setField(term291223, term291223.getClass(), "collaboratorsUrl", null);
        setField(term291223, term291223.getClass(), "teamsUrl", null);
        setField(term291223, term291223.getClass(), "hooksUrl", null);
        setField(term291223, term291223.getClass(), "issueEventsUrl", null);
        setField(term291223, term291223.getClass(), "eventsUrl", null);
        setField(term291223, term291223.getClass(), "assigneesUrl", null);
        setField(term291223, term291223.getClass(), "branchesUrl", null);
        setField(term291223, term291223.getClass(), "tagsUrl", null);
        setField(term291223, term291223.getClass(), "blobsUrl", null);
        setField(term291223, term291223.getClass(), "gitTagsUrl", null);
        setField(term291223, term291223.getClass(), "gitRefsUrl", null);
        setField(term291223, term291223.getClass(), "treesUrl", null);
        setField(term291223, term291223.getClass(), "statusesUrl", null);
        setField(term291223, term291223.getClass(), "languagesUrl", null);
        setField(term291223, term291223.getClass(), "stargazersUrl", null);
        setField(term291223, term291223.getClass(), "contributorsUrl", null);
        setField(term291223, term291223.getClass(), "subscribersUrl", null);
        setField(term291223, term291223.getClass(), "subscriptionUrl", null);
        setField(term291223, term291223.getClass(), "commitsUrl", null);
        setField(term291223, term291223.getClass(), "gitCommitsUrl", null);
        setField(term291223, term291223.getClass(), "commentsUrl", null);
        setField(term291223, term291223.getClass(), "issueCommentUrl", null);
        setField(term291223, term291223.getClass(), "contentsUrl", null);
        setField(term291223, term291223.getClass(), "compareUrl", null);
        setField(term291223, term291223.getClass(), "mergesUrl", null);
        setField(term291223, term291223.getClass(), "archiveUrl", null);
        setField(term291223, term291223.getClass(), "downloadsUrl", null);
        setField(term291223, term291223.getClass(), "issuesUrl", null);
        setField(term291223, term291223.getClass(), "pullsUrl", null);
        setField(term291223, term291223.getClass(), "milestonesUrl", null);
        setField(term291223, term291223.getClass(), "notificationsUrl", null);
        setField(term291223, term291223.getClass(), "labelsUrl", null);
        setField(term291223, term291223.getClass(), "releasesUrl", null);
        setField(term291223, term291223.getClass(), "deploymentsUrl", null);
        setField(term291223, term291223.getClass(), "createdAt", null);
        setField(term291223, term291223.getClass(), "updatedAt", null);
        setField(term291223, term291223.getClass(), "pushedAt", null);
        setField(term291223, term291223.getClass(), "gitUrl", null);
        setField(term291223, term291223.getClass(), "sshUrl", null);
        setField(term291223, term291223.getClass(), "cloneUrl", null);
        setField(term291223, term291223.getClass(), "svnUrl", null);
        setField(term291223, term291223.getClass(), "homepage", null);
        setField(term291223, term291223.getClass(), "size", null);
        setField(term291223, term291223.getClass(), "stargazersCount", null);
        setField(term291223, term291223.getClass(), "watchersCount", null);
        setField(term291223, term291223.getClass(), "language", null);
        setField(term291223, term291223.getClass(), "hasIssues", null);
        setField(term291223, term291223.getClass(), "hasProjects", null);
        setField(term291223, term291223.getClass(), "hasDownloads", null);
        setField(term291223, term291223.getClass(), "hasWiki", null);
        setField(term291223, term291223.getClass(), "hasPages", null);
        setField(term291223, term291223.getClass(), "forksCount", null);
        setField(term291223, term291223.getClass(), "archived", null);
        setField(term291223, term291223.getClass(), "disabled", null);
        setField(term291223, term291223.getClass(), "openIssuesCount", null);
        setField(term291223, term291223.getClass(), "license", null);
        setField(term291223, term291223.getClass(), "allowForking", null);
        setField(term291223, term291223.getClass(), "isTemplate", null);
        setField(term291223, term291223.getClass(), "topics", null);
        setField(term291223, term291223.getClass(), "visibility", null);
        setField(term291223, term291223.getClass(), "forks", null);
        setField(term291223, term291223.getClass(), "openIssues", null);
        setField(term291223, term291223.getClass(), "watchers", null);
        setField(term291223, term291223.getClass(), "defaultBranch", null);
        setField(term291223, term291223.getClass(), "networkCount", null);
        setField(term291223, term291223.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitTagsUrl", argTypes, term291223, args);
    }

};


