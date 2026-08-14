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

public class GithubRepoResponse_setIssueEventsUrl_588979867189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291212;

    public GithubRepoResponse_setIssueEventsUrl_588979867189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291212 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291212, term291212.getClass(), "id", null);
        setField(term291212, term291212.getClass(), "nodeId", null);
        setField(term291212, term291212.getClass(), "name", null);
        setField(term291212, term291212.getClass(), "fullName", null);
        setField(term291212, term291212.getClass(), "_private", null);
        setField(term291212, term291212.getClass(), "owner", null);
        setField(term291212, term291212.getClass(), "htmlUrl", null);
        setField(term291212, term291212.getClass(), "description", null);
        setField(term291212, term291212.getClass(), "fork", null);
        setField(term291212, term291212.getClass(), "url", null);
        setField(term291212, term291212.getClass(), "forksUrl", null);
        setField(term291212, term291212.getClass(), "keysUrl", null);
        setField(term291212, term291212.getClass(), "collaboratorsUrl", null);
        setField(term291212, term291212.getClass(), "teamsUrl", null);
        setField(term291212, term291212.getClass(), "hooksUrl", null);
        setField(term291212, term291212.getClass(), "issueEventsUrl", null);
        setField(term291212, term291212.getClass(), "eventsUrl", null);
        setField(term291212, term291212.getClass(), "assigneesUrl", null);
        setField(term291212, term291212.getClass(), "branchesUrl", null);
        setField(term291212, term291212.getClass(), "tagsUrl", null);
        setField(term291212, term291212.getClass(), "blobsUrl", null);
        setField(term291212, term291212.getClass(), "gitTagsUrl", null);
        setField(term291212, term291212.getClass(), "gitRefsUrl", null);
        setField(term291212, term291212.getClass(), "treesUrl", null);
        setField(term291212, term291212.getClass(), "statusesUrl", null);
        setField(term291212, term291212.getClass(), "languagesUrl", null);
        setField(term291212, term291212.getClass(), "stargazersUrl", null);
        setField(term291212, term291212.getClass(), "contributorsUrl", null);
        setField(term291212, term291212.getClass(), "subscribersUrl", null);
        setField(term291212, term291212.getClass(), "subscriptionUrl", null);
        setField(term291212, term291212.getClass(), "commitsUrl", null);
        setField(term291212, term291212.getClass(), "gitCommitsUrl", null);
        setField(term291212, term291212.getClass(), "commentsUrl", null);
        setField(term291212, term291212.getClass(), "issueCommentUrl", null);
        setField(term291212, term291212.getClass(), "contentsUrl", null);
        setField(term291212, term291212.getClass(), "compareUrl", null);
        setField(term291212, term291212.getClass(), "mergesUrl", null);
        setField(term291212, term291212.getClass(), "archiveUrl", null);
        setField(term291212, term291212.getClass(), "downloadsUrl", null);
        setField(term291212, term291212.getClass(), "issuesUrl", null);
        setField(term291212, term291212.getClass(), "pullsUrl", null);
        setField(term291212, term291212.getClass(), "milestonesUrl", null);
        setField(term291212, term291212.getClass(), "notificationsUrl", null);
        setField(term291212, term291212.getClass(), "labelsUrl", null);
        setField(term291212, term291212.getClass(), "releasesUrl", null);
        setField(term291212, term291212.getClass(), "deploymentsUrl", null);
        setField(term291212, term291212.getClass(), "createdAt", null);
        setField(term291212, term291212.getClass(), "updatedAt", null);
        setField(term291212, term291212.getClass(), "pushedAt", null);
        setField(term291212, term291212.getClass(), "gitUrl", null);
        setField(term291212, term291212.getClass(), "sshUrl", null);
        setField(term291212, term291212.getClass(), "cloneUrl", null);
        setField(term291212, term291212.getClass(), "svnUrl", null);
        setField(term291212, term291212.getClass(), "homepage", null);
        setField(term291212, term291212.getClass(), "size", null);
        setField(term291212, term291212.getClass(), "stargazersCount", null);
        setField(term291212, term291212.getClass(), "watchersCount", null);
        setField(term291212, term291212.getClass(), "language", null);
        setField(term291212, term291212.getClass(), "hasIssues", null);
        setField(term291212, term291212.getClass(), "hasProjects", null);
        setField(term291212, term291212.getClass(), "hasDownloads", null);
        setField(term291212, term291212.getClass(), "hasWiki", null);
        setField(term291212, term291212.getClass(), "hasPages", null);
        setField(term291212, term291212.getClass(), "forksCount", null);
        setField(term291212, term291212.getClass(), "archived", null);
        setField(term291212, term291212.getClass(), "disabled", null);
        setField(term291212, term291212.getClass(), "openIssuesCount", null);
        setField(term291212, term291212.getClass(), "license", null);
        setField(term291212, term291212.getClass(), "allowForking", null);
        setField(term291212, term291212.getClass(), "isTemplate", null);
        setField(term291212, term291212.getClass(), "topics", null);
        setField(term291212, term291212.getClass(), "visibility", null);
        setField(term291212, term291212.getClass(), "forks", null);
        setField(term291212, term291212.getClass(), "openIssues", null);
        setField(term291212, term291212.getClass(), "watchers", null);
        setField(term291212, term291212.getClass(), "defaultBranch", null);
        setField(term291212, term291212.getClass(), "networkCount", null);
        setField(term291212, term291212.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIssueEventsUrl", argTypes, term291212, args);
    }

};


