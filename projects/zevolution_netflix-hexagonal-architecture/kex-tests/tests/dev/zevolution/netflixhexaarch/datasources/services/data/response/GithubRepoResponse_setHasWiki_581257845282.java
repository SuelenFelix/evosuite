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

public class GithubRepoResponse_setHasWiki_581257845282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291305;

    public GithubRepoResponse_setHasWiki_581257845282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291305 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291305, term291305.getClass(), "id", null);
        setField(term291305, term291305.getClass(), "nodeId", null);
        setField(term291305, term291305.getClass(), "name", null);
        setField(term291305, term291305.getClass(), "fullName", null);
        setField(term291305, term291305.getClass(), "_private", null);
        setField(term291305, term291305.getClass(), "owner", null);
        setField(term291305, term291305.getClass(), "htmlUrl", null);
        setField(term291305, term291305.getClass(), "description", null);
        setField(term291305, term291305.getClass(), "fork", null);
        setField(term291305, term291305.getClass(), "url", null);
        setField(term291305, term291305.getClass(), "forksUrl", null);
        setField(term291305, term291305.getClass(), "keysUrl", null);
        setField(term291305, term291305.getClass(), "collaboratorsUrl", null);
        setField(term291305, term291305.getClass(), "teamsUrl", null);
        setField(term291305, term291305.getClass(), "hooksUrl", null);
        setField(term291305, term291305.getClass(), "issueEventsUrl", null);
        setField(term291305, term291305.getClass(), "eventsUrl", null);
        setField(term291305, term291305.getClass(), "assigneesUrl", null);
        setField(term291305, term291305.getClass(), "branchesUrl", null);
        setField(term291305, term291305.getClass(), "tagsUrl", null);
        setField(term291305, term291305.getClass(), "blobsUrl", null);
        setField(term291305, term291305.getClass(), "gitTagsUrl", null);
        setField(term291305, term291305.getClass(), "gitRefsUrl", null);
        setField(term291305, term291305.getClass(), "treesUrl", null);
        setField(term291305, term291305.getClass(), "statusesUrl", null);
        setField(term291305, term291305.getClass(), "languagesUrl", null);
        setField(term291305, term291305.getClass(), "stargazersUrl", null);
        setField(term291305, term291305.getClass(), "contributorsUrl", null);
        setField(term291305, term291305.getClass(), "subscribersUrl", null);
        setField(term291305, term291305.getClass(), "subscriptionUrl", null);
        setField(term291305, term291305.getClass(), "commitsUrl", null);
        setField(term291305, term291305.getClass(), "gitCommitsUrl", null);
        setField(term291305, term291305.getClass(), "commentsUrl", null);
        setField(term291305, term291305.getClass(), "issueCommentUrl", null);
        setField(term291305, term291305.getClass(), "contentsUrl", null);
        setField(term291305, term291305.getClass(), "compareUrl", null);
        setField(term291305, term291305.getClass(), "mergesUrl", null);
        setField(term291305, term291305.getClass(), "archiveUrl", null);
        setField(term291305, term291305.getClass(), "downloadsUrl", null);
        setField(term291305, term291305.getClass(), "issuesUrl", null);
        setField(term291305, term291305.getClass(), "pullsUrl", null);
        setField(term291305, term291305.getClass(), "milestonesUrl", null);
        setField(term291305, term291305.getClass(), "notificationsUrl", null);
        setField(term291305, term291305.getClass(), "labelsUrl", null);
        setField(term291305, term291305.getClass(), "releasesUrl", null);
        setField(term291305, term291305.getClass(), "deploymentsUrl", null);
        setField(term291305, term291305.getClass(), "createdAt", null);
        setField(term291305, term291305.getClass(), "updatedAt", null);
        setField(term291305, term291305.getClass(), "pushedAt", null);
        setField(term291305, term291305.getClass(), "gitUrl", null);
        setField(term291305, term291305.getClass(), "sshUrl", null);
        setField(term291305, term291305.getClass(), "cloneUrl", null);
        setField(term291305, term291305.getClass(), "svnUrl", null);
        setField(term291305, term291305.getClass(), "homepage", null);
        setField(term291305, term291305.getClass(), "size", null);
        setField(term291305, term291305.getClass(), "stargazersCount", null);
        setField(term291305, term291305.getClass(), "watchersCount", null);
        setField(term291305, term291305.getClass(), "language", null);
        setField(term291305, term291305.getClass(), "hasIssues", null);
        setField(term291305, term291305.getClass(), "hasProjects", null);
        setField(term291305, term291305.getClass(), "hasDownloads", null);
        setField(term291305, term291305.getClass(), "hasWiki", null);
        setField(term291305, term291305.getClass(), "hasPages", null);
        setField(term291305, term291305.getClass(), "forksCount", null);
        setField(term291305, term291305.getClass(), "archived", null);
        setField(term291305, term291305.getClass(), "disabled", null);
        setField(term291305, term291305.getClass(), "openIssuesCount", null);
        setField(term291305, term291305.getClass(), "license", null);
        setField(term291305, term291305.getClass(), "allowForking", null);
        setField(term291305, term291305.getClass(), "isTemplate", null);
        setField(term291305, term291305.getClass(), "topics", null);
        setField(term291305, term291305.getClass(), "visibility", null);
        setField(term291305, term291305.getClass(), "forks", null);
        setField(term291305, term291305.getClass(), "openIssues", null);
        setField(term291305, term291305.getClass(), "watchers", null);
        setField(term291305, term291305.getClass(), "defaultBranch", null);
        setField(term291305, term291305.getClass(), "networkCount", null);
        setField(term291305, term291305.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasWiki", argTypes, term291305, args);
    }

};


