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

public class GithubRepoResponse_setOpenIssuesCount_1704989120292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291315;

    public GithubRepoResponse_setOpenIssuesCount_1704989120292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291315 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291315, term291315.getClass(), "id", null);
        setField(term291315, term291315.getClass(), "nodeId", null);
        setField(term291315, term291315.getClass(), "name", null);
        setField(term291315, term291315.getClass(), "fullName", null);
        setField(term291315, term291315.getClass(), "_private", null);
        setField(term291315, term291315.getClass(), "owner", null);
        setField(term291315, term291315.getClass(), "htmlUrl", null);
        setField(term291315, term291315.getClass(), "description", null);
        setField(term291315, term291315.getClass(), "fork", null);
        setField(term291315, term291315.getClass(), "url", null);
        setField(term291315, term291315.getClass(), "forksUrl", null);
        setField(term291315, term291315.getClass(), "keysUrl", null);
        setField(term291315, term291315.getClass(), "collaboratorsUrl", null);
        setField(term291315, term291315.getClass(), "teamsUrl", null);
        setField(term291315, term291315.getClass(), "hooksUrl", null);
        setField(term291315, term291315.getClass(), "issueEventsUrl", null);
        setField(term291315, term291315.getClass(), "eventsUrl", null);
        setField(term291315, term291315.getClass(), "assigneesUrl", null);
        setField(term291315, term291315.getClass(), "branchesUrl", null);
        setField(term291315, term291315.getClass(), "tagsUrl", null);
        setField(term291315, term291315.getClass(), "blobsUrl", null);
        setField(term291315, term291315.getClass(), "gitTagsUrl", null);
        setField(term291315, term291315.getClass(), "gitRefsUrl", null);
        setField(term291315, term291315.getClass(), "treesUrl", null);
        setField(term291315, term291315.getClass(), "statusesUrl", null);
        setField(term291315, term291315.getClass(), "languagesUrl", null);
        setField(term291315, term291315.getClass(), "stargazersUrl", null);
        setField(term291315, term291315.getClass(), "contributorsUrl", null);
        setField(term291315, term291315.getClass(), "subscribersUrl", null);
        setField(term291315, term291315.getClass(), "subscriptionUrl", null);
        setField(term291315, term291315.getClass(), "commitsUrl", null);
        setField(term291315, term291315.getClass(), "gitCommitsUrl", null);
        setField(term291315, term291315.getClass(), "commentsUrl", null);
        setField(term291315, term291315.getClass(), "issueCommentUrl", null);
        setField(term291315, term291315.getClass(), "contentsUrl", null);
        setField(term291315, term291315.getClass(), "compareUrl", null);
        setField(term291315, term291315.getClass(), "mergesUrl", null);
        setField(term291315, term291315.getClass(), "archiveUrl", null);
        setField(term291315, term291315.getClass(), "downloadsUrl", null);
        setField(term291315, term291315.getClass(), "issuesUrl", null);
        setField(term291315, term291315.getClass(), "pullsUrl", null);
        setField(term291315, term291315.getClass(), "milestonesUrl", null);
        setField(term291315, term291315.getClass(), "notificationsUrl", null);
        setField(term291315, term291315.getClass(), "labelsUrl", null);
        setField(term291315, term291315.getClass(), "releasesUrl", null);
        setField(term291315, term291315.getClass(), "deploymentsUrl", null);
        setField(term291315, term291315.getClass(), "createdAt", null);
        setField(term291315, term291315.getClass(), "updatedAt", null);
        setField(term291315, term291315.getClass(), "pushedAt", null);
        setField(term291315, term291315.getClass(), "gitUrl", null);
        setField(term291315, term291315.getClass(), "sshUrl", null);
        setField(term291315, term291315.getClass(), "cloneUrl", null);
        setField(term291315, term291315.getClass(), "svnUrl", null);
        setField(term291315, term291315.getClass(), "homepage", null);
        setField(term291315, term291315.getClass(), "size", null);
        setField(term291315, term291315.getClass(), "stargazersCount", null);
        setField(term291315, term291315.getClass(), "watchersCount", null);
        setField(term291315, term291315.getClass(), "language", null);
        setField(term291315, term291315.getClass(), "hasIssues", null);
        setField(term291315, term291315.getClass(), "hasProjects", null);
        setField(term291315, term291315.getClass(), "hasDownloads", null);
        setField(term291315, term291315.getClass(), "hasWiki", null);
        setField(term291315, term291315.getClass(), "hasPages", null);
        setField(term291315, term291315.getClass(), "forksCount", null);
        setField(term291315, term291315.getClass(), "archived", null);
        setField(term291315, term291315.getClass(), "disabled", null);
        setField(term291315, term291315.getClass(), "openIssuesCount", null);
        setField(term291315, term291315.getClass(), "license", null);
        setField(term291315, term291315.getClass(), "allowForking", null);
        setField(term291315, term291315.getClass(), "isTemplate", null);
        setField(term291315, term291315.getClass(), "topics", null);
        setField(term291315, term291315.getClass(), "visibility", null);
        setField(term291315, term291315.getClass(), "forks", null);
        setField(term291315, term291315.getClass(), "openIssues", null);
        setField(term291315, term291315.getClass(), "watchers", null);
        setField(term291315, term291315.getClass(), "defaultBranch", null);
        setField(term291315, term291315.getClass(), "networkCount", null);
        setField(term291315, term291315.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOpenIssuesCount", argTypes, term291315, args);
    }

};


