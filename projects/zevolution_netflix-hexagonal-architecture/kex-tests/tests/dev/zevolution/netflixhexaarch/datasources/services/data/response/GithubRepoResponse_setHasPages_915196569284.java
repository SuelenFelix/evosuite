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

public class GithubRepoResponse_setHasPages_915196569284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291307;

    public GithubRepoResponse_setHasPages_915196569284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291307 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291307, term291307.getClass(), "id", null);
        setField(term291307, term291307.getClass(), "nodeId", null);
        setField(term291307, term291307.getClass(), "name", null);
        setField(term291307, term291307.getClass(), "fullName", null);
        setField(term291307, term291307.getClass(), "_private", null);
        setField(term291307, term291307.getClass(), "owner", null);
        setField(term291307, term291307.getClass(), "htmlUrl", null);
        setField(term291307, term291307.getClass(), "description", null);
        setField(term291307, term291307.getClass(), "fork", null);
        setField(term291307, term291307.getClass(), "url", null);
        setField(term291307, term291307.getClass(), "forksUrl", null);
        setField(term291307, term291307.getClass(), "keysUrl", null);
        setField(term291307, term291307.getClass(), "collaboratorsUrl", null);
        setField(term291307, term291307.getClass(), "teamsUrl", null);
        setField(term291307, term291307.getClass(), "hooksUrl", null);
        setField(term291307, term291307.getClass(), "issueEventsUrl", null);
        setField(term291307, term291307.getClass(), "eventsUrl", null);
        setField(term291307, term291307.getClass(), "assigneesUrl", null);
        setField(term291307, term291307.getClass(), "branchesUrl", null);
        setField(term291307, term291307.getClass(), "tagsUrl", null);
        setField(term291307, term291307.getClass(), "blobsUrl", null);
        setField(term291307, term291307.getClass(), "gitTagsUrl", null);
        setField(term291307, term291307.getClass(), "gitRefsUrl", null);
        setField(term291307, term291307.getClass(), "treesUrl", null);
        setField(term291307, term291307.getClass(), "statusesUrl", null);
        setField(term291307, term291307.getClass(), "languagesUrl", null);
        setField(term291307, term291307.getClass(), "stargazersUrl", null);
        setField(term291307, term291307.getClass(), "contributorsUrl", null);
        setField(term291307, term291307.getClass(), "subscribersUrl", null);
        setField(term291307, term291307.getClass(), "subscriptionUrl", null);
        setField(term291307, term291307.getClass(), "commitsUrl", null);
        setField(term291307, term291307.getClass(), "gitCommitsUrl", null);
        setField(term291307, term291307.getClass(), "commentsUrl", null);
        setField(term291307, term291307.getClass(), "issueCommentUrl", null);
        setField(term291307, term291307.getClass(), "contentsUrl", null);
        setField(term291307, term291307.getClass(), "compareUrl", null);
        setField(term291307, term291307.getClass(), "mergesUrl", null);
        setField(term291307, term291307.getClass(), "archiveUrl", null);
        setField(term291307, term291307.getClass(), "downloadsUrl", null);
        setField(term291307, term291307.getClass(), "issuesUrl", null);
        setField(term291307, term291307.getClass(), "pullsUrl", null);
        setField(term291307, term291307.getClass(), "milestonesUrl", null);
        setField(term291307, term291307.getClass(), "notificationsUrl", null);
        setField(term291307, term291307.getClass(), "labelsUrl", null);
        setField(term291307, term291307.getClass(), "releasesUrl", null);
        setField(term291307, term291307.getClass(), "deploymentsUrl", null);
        setField(term291307, term291307.getClass(), "createdAt", null);
        setField(term291307, term291307.getClass(), "updatedAt", null);
        setField(term291307, term291307.getClass(), "pushedAt", null);
        setField(term291307, term291307.getClass(), "gitUrl", null);
        setField(term291307, term291307.getClass(), "sshUrl", null);
        setField(term291307, term291307.getClass(), "cloneUrl", null);
        setField(term291307, term291307.getClass(), "svnUrl", null);
        setField(term291307, term291307.getClass(), "homepage", null);
        setField(term291307, term291307.getClass(), "size", null);
        setField(term291307, term291307.getClass(), "stargazersCount", null);
        setField(term291307, term291307.getClass(), "watchersCount", null);
        setField(term291307, term291307.getClass(), "language", null);
        setField(term291307, term291307.getClass(), "hasIssues", null);
        setField(term291307, term291307.getClass(), "hasProjects", null);
        setField(term291307, term291307.getClass(), "hasDownloads", null);
        setField(term291307, term291307.getClass(), "hasWiki", null);
        setField(term291307, term291307.getClass(), "hasPages", null);
        setField(term291307, term291307.getClass(), "forksCount", null);
        setField(term291307, term291307.getClass(), "archived", null);
        setField(term291307, term291307.getClass(), "disabled", null);
        setField(term291307, term291307.getClass(), "openIssuesCount", null);
        setField(term291307, term291307.getClass(), "license", null);
        setField(term291307, term291307.getClass(), "allowForking", null);
        setField(term291307, term291307.getClass(), "isTemplate", null);
        setField(term291307, term291307.getClass(), "topics", null);
        setField(term291307, term291307.getClass(), "visibility", null);
        setField(term291307, term291307.getClass(), "forks", null);
        setField(term291307, term291307.getClass(), "openIssues", null);
        setField(term291307, term291307.getClass(), "watchers", null);
        setField(term291307, term291307.getClass(), "defaultBranch", null);
        setField(term291307, term291307.getClass(), "networkCount", null);
        setField(term291307, term291307.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasPages", argTypes, term291307, args);
    }

};


