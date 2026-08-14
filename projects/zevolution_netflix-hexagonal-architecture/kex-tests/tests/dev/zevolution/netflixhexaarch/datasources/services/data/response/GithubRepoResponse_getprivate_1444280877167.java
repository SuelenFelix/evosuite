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

public class GithubRepoResponse_getprivate_1444280877167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291190;

    public GithubRepoResponse_getprivate_1444280877167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291190 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291190, term291190.getClass(), "id", null);
        setField(term291190, term291190.getClass(), "nodeId", null);
        setField(term291190, term291190.getClass(), "name", null);
        setField(term291190, term291190.getClass(), "fullName", null);
        setField(term291190, term291190.getClass(), "_private", null);
        setField(term291190, term291190.getClass(), "owner", null);
        setField(term291190, term291190.getClass(), "htmlUrl", null);
        setField(term291190, term291190.getClass(), "description", null);
        setField(term291190, term291190.getClass(), "fork", null);
        setField(term291190, term291190.getClass(), "url", null);
        setField(term291190, term291190.getClass(), "forksUrl", null);
        setField(term291190, term291190.getClass(), "keysUrl", null);
        setField(term291190, term291190.getClass(), "collaboratorsUrl", null);
        setField(term291190, term291190.getClass(), "teamsUrl", null);
        setField(term291190, term291190.getClass(), "hooksUrl", null);
        setField(term291190, term291190.getClass(), "issueEventsUrl", null);
        setField(term291190, term291190.getClass(), "eventsUrl", null);
        setField(term291190, term291190.getClass(), "assigneesUrl", null);
        setField(term291190, term291190.getClass(), "branchesUrl", null);
        setField(term291190, term291190.getClass(), "tagsUrl", null);
        setField(term291190, term291190.getClass(), "blobsUrl", null);
        setField(term291190, term291190.getClass(), "gitTagsUrl", null);
        setField(term291190, term291190.getClass(), "gitRefsUrl", null);
        setField(term291190, term291190.getClass(), "treesUrl", null);
        setField(term291190, term291190.getClass(), "statusesUrl", null);
        setField(term291190, term291190.getClass(), "languagesUrl", null);
        setField(term291190, term291190.getClass(), "stargazersUrl", null);
        setField(term291190, term291190.getClass(), "contributorsUrl", null);
        setField(term291190, term291190.getClass(), "subscribersUrl", null);
        setField(term291190, term291190.getClass(), "subscriptionUrl", null);
        setField(term291190, term291190.getClass(), "commitsUrl", null);
        setField(term291190, term291190.getClass(), "gitCommitsUrl", null);
        setField(term291190, term291190.getClass(), "commentsUrl", null);
        setField(term291190, term291190.getClass(), "issueCommentUrl", null);
        setField(term291190, term291190.getClass(), "contentsUrl", null);
        setField(term291190, term291190.getClass(), "compareUrl", null);
        setField(term291190, term291190.getClass(), "mergesUrl", null);
        setField(term291190, term291190.getClass(), "archiveUrl", null);
        setField(term291190, term291190.getClass(), "downloadsUrl", null);
        setField(term291190, term291190.getClass(), "issuesUrl", null);
        setField(term291190, term291190.getClass(), "pullsUrl", null);
        setField(term291190, term291190.getClass(), "milestonesUrl", null);
        setField(term291190, term291190.getClass(), "notificationsUrl", null);
        setField(term291190, term291190.getClass(), "labelsUrl", null);
        setField(term291190, term291190.getClass(), "releasesUrl", null);
        setField(term291190, term291190.getClass(), "deploymentsUrl", null);
        setField(term291190, term291190.getClass(), "createdAt", null);
        setField(term291190, term291190.getClass(), "updatedAt", null);
        setField(term291190, term291190.getClass(), "pushedAt", null);
        setField(term291190, term291190.getClass(), "gitUrl", null);
        setField(term291190, term291190.getClass(), "sshUrl", null);
        setField(term291190, term291190.getClass(), "cloneUrl", null);
        setField(term291190, term291190.getClass(), "svnUrl", null);
        setField(term291190, term291190.getClass(), "homepage", null);
        setField(term291190, term291190.getClass(), "size", null);
        setField(term291190, term291190.getClass(), "stargazersCount", null);
        setField(term291190, term291190.getClass(), "watchersCount", null);
        setField(term291190, term291190.getClass(), "language", null);
        setField(term291190, term291190.getClass(), "hasIssues", null);
        setField(term291190, term291190.getClass(), "hasProjects", null);
        setField(term291190, term291190.getClass(), "hasDownloads", null);
        setField(term291190, term291190.getClass(), "hasWiki", null);
        setField(term291190, term291190.getClass(), "hasPages", null);
        setField(term291190, term291190.getClass(), "forksCount", null);
        setField(term291190, term291190.getClass(), "archived", null);
        setField(term291190, term291190.getClass(), "disabled", null);
        setField(term291190, term291190.getClass(), "openIssuesCount", null);
        setField(term291190, term291190.getClass(), "license", null);
        setField(term291190, term291190.getClass(), "allowForking", null);
        setField(term291190, term291190.getClass(), "isTemplate", null);
        setField(term291190, term291190.getClass(), "topics", null);
        setField(term291190, term291190.getClass(), "visibility", null);
        setField(term291190, term291190.getClass(), "forks", null);
        setField(term291190, term291190.getClass(), "openIssues", null);
        setField(term291190, term291190.getClass(), "watchers", null);
        setField(term291190, term291190.getClass(), "defaultBranch", null);
        setField(term291190, term291190.getClass(), "networkCount", null);
        setField(term291190, term291190.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get_private", argTypes, term291190, args);
    }

};


