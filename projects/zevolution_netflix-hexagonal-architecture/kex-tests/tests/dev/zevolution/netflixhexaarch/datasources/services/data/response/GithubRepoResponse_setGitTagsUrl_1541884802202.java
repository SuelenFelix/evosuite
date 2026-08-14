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

public class GithubRepoResponse_setGitTagsUrl_1541884802202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291225;

    public GithubRepoResponse_setGitTagsUrl_1541884802202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291225 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291225, term291225.getClass(), "id", null);
        setField(term291225, term291225.getClass(), "nodeId", null);
        setField(term291225, term291225.getClass(), "name", null);
        setField(term291225, term291225.getClass(), "fullName", null);
        setField(term291225, term291225.getClass(), "_private", null);
        setField(term291225, term291225.getClass(), "owner", null);
        setField(term291225, term291225.getClass(), "htmlUrl", null);
        setField(term291225, term291225.getClass(), "description", null);
        setField(term291225, term291225.getClass(), "fork", null);
        setField(term291225, term291225.getClass(), "url", null);
        setField(term291225, term291225.getClass(), "forksUrl", null);
        setField(term291225, term291225.getClass(), "keysUrl", null);
        setField(term291225, term291225.getClass(), "collaboratorsUrl", null);
        setField(term291225, term291225.getClass(), "teamsUrl", null);
        setField(term291225, term291225.getClass(), "hooksUrl", null);
        setField(term291225, term291225.getClass(), "issueEventsUrl", null);
        setField(term291225, term291225.getClass(), "eventsUrl", null);
        setField(term291225, term291225.getClass(), "assigneesUrl", null);
        setField(term291225, term291225.getClass(), "branchesUrl", null);
        setField(term291225, term291225.getClass(), "tagsUrl", null);
        setField(term291225, term291225.getClass(), "blobsUrl", null);
        setField(term291225, term291225.getClass(), "gitTagsUrl", null);
        setField(term291225, term291225.getClass(), "gitRefsUrl", null);
        setField(term291225, term291225.getClass(), "treesUrl", null);
        setField(term291225, term291225.getClass(), "statusesUrl", null);
        setField(term291225, term291225.getClass(), "languagesUrl", null);
        setField(term291225, term291225.getClass(), "stargazersUrl", null);
        setField(term291225, term291225.getClass(), "contributorsUrl", null);
        setField(term291225, term291225.getClass(), "subscribersUrl", null);
        setField(term291225, term291225.getClass(), "subscriptionUrl", null);
        setField(term291225, term291225.getClass(), "commitsUrl", null);
        setField(term291225, term291225.getClass(), "gitCommitsUrl", null);
        setField(term291225, term291225.getClass(), "commentsUrl", null);
        setField(term291225, term291225.getClass(), "issueCommentUrl", null);
        setField(term291225, term291225.getClass(), "contentsUrl", null);
        setField(term291225, term291225.getClass(), "compareUrl", null);
        setField(term291225, term291225.getClass(), "mergesUrl", null);
        setField(term291225, term291225.getClass(), "archiveUrl", null);
        setField(term291225, term291225.getClass(), "downloadsUrl", null);
        setField(term291225, term291225.getClass(), "issuesUrl", null);
        setField(term291225, term291225.getClass(), "pullsUrl", null);
        setField(term291225, term291225.getClass(), "milestonesUrl", null);
        setField(term291225, term291225.getClass(), "notificationsUrl", null);
        setField(term291225, term291225.getClass(), "labelsUrl", null);
        setField(term291225, term291225.getClass(), "releasesUrl", null);
        setField(term291225, term291225.getClass(), "deploymentsUrl", null);
        setField(term291225, term291225.getClass(), "createdAt", null);
        setField(term291225, term291225.getClass(), "updatedAt", null);
        setField(term291225, term291225.getClass(), "pushedAt", null);
        setField(term291225, term291225.getClass(), "gitUrl", null);
        setField(term291225, term291225.getClass(), "sshUrl", null);
        setField(term291225, term291225.getClass(), "cloneUrl", null);
        setField(term291225, term291225.getClass(), "svnUrl", null);
        setField(term291225, term291225.getClass(), "homepage", null);
        setField(term291225, term291225.getClass(), "size", null);
        setField(term291225, term291225.getClass(), "stargazersCount", null);
        setField(term291225, term291225.getClass(), "watchersCount", null);
        setField(term291225, term291225.getClass(), "language", null);
        setField(term291225, term291225.getClass(), "hasIssues", null);
        setField(term291225, term291225.getClass(), "hasProjects", null);
        setField(term291225, term291225.getClass(), "hasDownloads", null);
        setField(term291225, term291225.getClass(), "hasWiki", null);
        setField(term291225, term291225.getClass(), "hasPages", null);
        setField(term291225, term291225.getClass(), "forksCount", null);
        setField(term291225, term291225.getClass(), "archived", null);
        setField(term291225, term291225.getClass(), "disabled", null);
        setField(term291225, term291225.getClass(), "openIssuesCount", null);
        setField(term291225, term291225.getClass(), "license", null);
        setField(term291225, term291225.getClass(), "allowForking", null);
        setField(term291225, term291225.getClass(), "isTemplate", null);
        setField(term291225, term291225.getClass(), "topics", null);
        setField(term291225, term291225.getClass(), "visibility", null);
        setField(term291225, term291225.getClass(), "forks", null);
        setField(term291225, term291225.getClass(), "openIssues", null);
        setField(term291225, term291225.getClass(), "watchers", null);
        setField(term291225, term291225.getClass(), "defaultBranch", null);
        setField(term291225, term291225.getClass(), "networkCount", null);
        setField(term291225, term291225.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGitTagsUrl", argTypes, term291225, args);
    }

};


