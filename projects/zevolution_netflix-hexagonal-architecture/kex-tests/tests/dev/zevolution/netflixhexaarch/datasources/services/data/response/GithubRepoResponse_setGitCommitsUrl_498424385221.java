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

public class GithubRepoResponse_setGitCommitsUrl_498424385221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291244;

    public GithubRepoResponse_setGitCommitsUrl_498424385221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291244 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291244, term291244.getClass(), "id", null);
        setField(term291244, term291244.getClass(), "nodeId", null);
        setField(term291244, term291244.getClass(), "name", null);
        setField(term291244, term291244.getClass(), "fullName", null);
        setField(term291244, term291244.getClass(), "_private", null);
        setField(term291244, term291244.getClass(), "owner", null);
        setField(term291244, term291244.getClass(), "htmlUrl", null);
        setField(term291244, term291244.getClass(), "description", null);
        setField(term291244, term291244.getClass(), "fork", null);
        setField(term291244, term291244.getClass(), "url", null);
        setField(term291244, term291244.getClass(), "forksUrl", null);
        setField(term291244, term291244.getClass(), "keysUrl", null);
        setField(term291244, term291244.getClass(), "collaboratorsUrl", null);
        setField(term291244, term291244.getClass(), "teamsUrl", null);
        setField(term291244, term291244.getClass(), "hooksUrl", null);
        setField(term291244, term291244.getClass(), "issueEventsUrl", null);
        setField(term291244, term291244.getClass(), "eventsUrl", null);
        setField(term291244, term291244.getClass(), "assigneesUrl", null);
        setField(term291244, term291244.getClass(), "branchesUrl", null);
        setField(term291244, term291244.getClass(), "tagsUrl", null);
        setField(term291244, term291244.getClass(), "blobsUrl", null);
        setField(term291244, term291244.getClass(), "gitTagsUrl", null);
        setField(term291244, term291244.getClass(), "gitRefsUrl", null);
        setField(term291244, term291244.getClass(), "treesUrl", null);
        setField(term291244, term291244.getClass(), "statusesUrl", null);
        setField(term291244, term291244.getClass(), "languagesUrl", null);
        setField(term291244, term291244.getClass(), "stargazersUrl", null);
        setField(term291244, term291244.getClass(), "contributorsUrl", null);
        setField(term291244, term291244.getClass(), "subscribersUrl", null);
        setField(term291244, term291244.getClass(), "subscriptionUrl", null);
        setField(term291244, term291244.getClass(), "commitsUrl", null);
        setField(term291244, term291244.getClass(), "gitCommitsUrl", null);
        setField(term291244, term291244.getClass(), "commentsUrl", null);
        setField(term291244, term291244.getClass(), "issueCommentUrl", null);
        setField(term291244, term291244.getClass(), "contentsUrl", null);
        setField(term291244, term291244.getClass(), "compareUrl", null);
        setField(term291244, term291244.getClass(), "mergesUrl", null);
        setField(term291244, term291244.getClass(), "archiveUrl", null);
        setField(term291244, term291244.getClass(), "downloadsUrl", null);
        setField(term291244, term291244.getClass(), "issuesUrl", null);
        setField(term291244, term291244.getClass(), "pullsUrl", null);
        setField(term291244, term291244.getClass(), "milestonesUrl", null);
        setField(term291244, term291244.getClass(), "notificationsUrl", null);
        setField(term291244, term291244.getClass(), "labelsUrl", null);
        setField(term291244, term291244.getClass(), "releasesUrl", null);
        setField(term291244, term291244.getClass(), "deploymentsUrl", null);
        setField(term291244, term291244.getClass(), "createdAt", null);
        setField(term291244, term291244.getClass(), "updatedAt", null);
        setField(term291244, term291244.getClass(), "pushedAt", null);
        setField(term291244, term291244.getClass(), "gitUrl", null);
        setField(term291244, term291244.getClass(), "sshUrl", null);
        setField(term291244, term291244.getClass(), "cloneUrl", null);
        setField(term291244, term291244.getClass(), "svnUrl", null);
        setField(term291244, term291244.getClass(), "homepage", null);
        setField(term291244, term291244.getClass(), "size", null);
        setField(term291244, term291244.getClass(), "stargazersCount", null);
        setField(term291244, term291244.getClass(), "watchersCount", null);
        setField(term291244, term291244.getClass(), "language", null);
        setField(term291244, term291244.getClass(), "hasIssues", null);
        setField(term291244, term291244.getClass(), "hasProjects", null);
        setField(term291244, term291244.getClass(), "hasDownloads", null);
        setField(term291244, term291244.getClass(), "hasWiki", null);
        setField(term291244, term291244.getClass(), "hasPages", null);
        setField(term291244, term291244.getClass(), "forksCount", null);
        setField(term291244, term291244.getClass(), "archived", null);
        setField(term291244, term291244.getClass(), "disabled", null);
        setField(term291244, term291244.getClass(), "openIssuesCount", null);
        setField(term291244, term291244.getClass(), "license", null);
        setField(term291244, term291244.getClass(), "allowForking", null);
        setField(term291244, term291244.getClass(), "isTemplate", null);
        setField(term291244, term291244.getClass(), "topics", null);
        setField(term291244, term291244.getClass(), "visibility", null);
        setField(term291244, term291244.getClass(), "forks", null);
        setField(term291244, term291244.getClass(), "openIssues", null);
        setField(term291244, term291244.getClass(), "watchers", null);
        setField(term291244, term291244.getClass(), "defaultBranch", null);
        setField(term291244, term291244.getClass(), "networkCount", null);
        setField(term291244, term291244.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGitCommitsUrl", argTypes, term291244, args);
    }

};


