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

public class GithubRepoResponse_setUpdatedAt_355317540254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291277;

    public GithubRepoResponse_setUpdatedAt_355317540254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291277 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291277, term291277.getClass(), "id", null);
        setField(term291277, term291277.getClass(), "nodeId", null);
        setField(term291277, term291277.getClass(), "name", null);
        setField(term291277, term291277.getClass(), "fullName", null);
        setField(term291277, term291277.getClass(), "_private", null);
        setField(term291277, term291277.getClass(), "owner", null);
        setField(term291277, term291277.getClass(), "htmlUrl", null);
        setField(term291277, term291277.getClass(), "description", null);
        setField(term291277, term291277.getClass(), "fork", null);
        setField(term291277, term291277.getClass(), "url", null);
        setField(term291277, term291277.getClass(), "forksUrl", null);
        setField(term291277, term291277.getClass(), "keysUrl", null);
        setField(term291277, term291277.getClass(), "collaboratorsUrl", null);
        setField(term291277, term291277.getClass(), "teamsUrl", null);
        setField(term291277, term291277.getClass(), "hooksUrl", null);
        setField(term291277, term291277.getClass(), "issueEventsUrl", null);
        setField(term291277, term291277.getClass(), "eventsUrl", null);
        setField(term291277, term291277.getClass(), "assigneesUrl", null);
        setField(term291277, term291277.getClass(), "branchesUrl", null);
        setField(term291277, term291277.getClass(), "tagsUrl", null);
        setField(term291277, term291277.getClass(), "blobsUrl", null);
        setField(term291277, term291277.getClass(), "gitTagsUrl", null);
        setField(term291277, term291277.getClass(), "gitRefsUrl", null);
        setField(term291277, term291277.getClass(), "treesUrl", null);
        setField(term291277, term291277.getClass(), "statusesUrl", null);
        setField(term291277, term291277.getClass(), "languagesUrl", null);
        setField(term291277, term291277.getClass(), "stargazersUrl", null);
        setField(term291277, term291277.getClass(), "contributorsUrl", null);
        setField(term291277, term291277.getClass(), "subscribersUrl", null);
        setField(term291277, term291277.getClass(), "subscriptionUrl", null);
        setField(term291277, term291277.getClass(), "commitsUrl", null);
        setField(term291277, term291277.getClass(), "gitCommitsUrl", null);
        setField(term291277, term291277.getClass(), "commentsUrl", null);
        setField(term291277, term291277.getClass(), "issueCommentUrl", null);
        setField(term291277, term291277.getClass(), "contentsUrl", null);
        setField(term291277, term291277.getClass(), "compareUrl", null);
        setField(term291277, term291277.getClass(), "mergesUrl", null);
        setField(term291277, term291277.getClass(), "archiveUrl", null);
        setField(term291277, term291277.getClass(), "downloadsUrl", null);
        setField(term291277, term291277.getClass(), "issuesUrl", null);
        setField(term291277, term291277.getClass(), "pullsUrl", null);
        setField(term291277, term291277.getClass(), "milestonesUrl", null);
        setField(term291277, term291277.getClass(), "notificationsUrl", null);
        setField(term291277, term291277.getClass(), "labelsUrl", null);
        setField(term291277, term291277.getClass(), "releasesUrl", null);
        setField(term291277, term291277.getClass(), "deploymentsUrl", null);
        setField(term291277, term291277.getClass(), "createdAt", null);
        setField(term291277, term291277.getClass(), "updatedAt", null);
        setField(term291277, term291277.getClass(), "pushedAt", null);
        setField(term291277, term291277.getClass(), "gitUrl", null);
        setField(term291277, term291277.getClass(), "sshUrl", null);
        setField(term291277, term291277.getClass(), "cloneUrl", null);
        setField(term291277, term291277.getClass(), "svnUrl", null);
        setField(term291277, term291277.getClass(), "homepage", null);
        setField(term291277, term291277.getClass(), "size", null);
        setField(term291277, term291277.getClass(), "stargazersCount", null);
        setField(term291277, term291277.getClass(), "watchersCount", null);
        setField(term291277, term291277.getClass(), "language", null);
        setField(term291277, term291277.getClass(), "hasIssues", null);
        setField(term291277, term291277.getClass(), "hasProjects", null);
        setField(term291277, term291277.getClass(), "hasDownloads", null);
        setField(term291277, term291277.getClass(), "hasWiki", null);
        setField(term291277, term291277.getClass(), "hasPages", null);
        setField(term291277, term291277.getClass(), "forksCount", null);
        setField(term291277, term291277.getClass(), "archived", null);
        setField(term291277, term291277.getClass(), "disabled", null);
        setField(term291277, term291277.getClass(), "openIssuesCount", null);
        setField(term291277, term291277.getClass(), "license", null);
        setField(term291277, term291277.getClass(), "allowForking", null);
        setField(term291277, term291277.getClass(), "isTemplate", null);
        setField(term291277, term291277.getClass(), "topics", null);
        setField(term291277, term291277.getClass(), "visibility", null);
        setField(term291277, term291277.getClass(), "forks", null);
        setField(term291277, term291277.getClass(), "openIssues", null);
        setField(term291277, term291277.getClass(), "watchers", null);
        setField(term291277, term291277.getClass(), "defaultBranch", null);
        setField(term291277, term291277.getClass(), "networkCount", null);
        setField(term291277, term291277.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdatedAt", argTypes, term291277, args);
    }

};


