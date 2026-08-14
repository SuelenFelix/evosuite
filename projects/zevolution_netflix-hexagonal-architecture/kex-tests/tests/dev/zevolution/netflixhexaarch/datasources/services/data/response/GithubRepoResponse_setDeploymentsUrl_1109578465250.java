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

public class GithubRepoResponse_setDeploymentsUrl_1109578465250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291273;

    public GithubRepoResponse_setDeploymentsUrl_1109578465250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291273 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291273, term291273.getClass(), "id", null);
        setField(term291273, term291273.getClass(), "nodeId", null);
        setField(term291273, term291273.getClass(), "name", null);
        setField(term291273, term291273.getClass(), "fullName", null);
        setField(term291273, term291273.getClass(), "_private", null);
        setField(term291273, term291273.getClass(), "owner", null);
        setField(term291273, term291273.getClass(), "htmlUrl", null);
        setField(term291273, term291273.getClass(), "description", null);
        setField(term291273, term291273.getClass(), "fork", null);
        setField(term291273, term291273.getClass(), "url", null);
        setField(term291273, term291273.getClass(), "forksUrl", null);
        setField(term291273, term291273.getClass(), "keysUrl", null);
        setField(term291273, term291273.getClass(), "collaboratorsUrl", null);
        setField(term291273, term291273.getClass(), "teamsUrl", null);
        setField(term291273, term291273.getClass(), "hooksUrl", null);
        setField(term291273, term291273.getClass(), "issueEventsUrl", null);
        setField(term291273, term291273.getClass(), "eventsUrl", null);
        setField(term291273, term291273.getClass(), "assigneesUrl", null);
        setField(term291273, term291273.getClass(), "branchesUrl", null);
        setField(term291273, term291273.getClass(), "tagsUrl", null);
        setField(term291273, term291273.getClass(), "blobsUrl", null);
        setField(term291273, term291273.getClass(), "gitTagsUrl", null);
        setField(term291273, term291273.getClass(), "gitRefsUrl", null);
        setField(term291273, term291273.getClass(), "treesUrl", null);
        setField(term291273, term291273.getClass(), "statusesUrl", null);
        setField(term291273, term291273.getClass(), "languagesUrl", null);
        setField(term291273, term291273.getClass(), "stargazersUrl", null);
        setField(term291273, term291273.getClass(), "contributorsUrl", null);
        setField(term291273, term291273.getClass(), "subscribersUrl", null);
        setField(term291273, term291273.getClass(), "subscriptionUrl", null);
        setField(term291273, term291273.getClass(), "commitsUrl", null);
        setField(term291273, term291273.getClass(), "gitCommitsUrl", null);
        setField(term291273, term291273.getClass(), "commentsUrl", null);
        setField(term291273, term291273.getClass(), "issueCommentUrl", null);
        setField(term291273, term291273.getClass(), "contentsUrl", null);
        setField(term291273, term291273.getClass(), "compareUrl", null);
        setField(term291273, term291273.getClass(), "mergesUrl", null);
        setField(term291273, term291273.getClass(), "archiveUrl", null);
        setField(term291273, term291273.getClass(), "downloadsUrl", null);
        setField(term291273, term291273.getClass(), "issuesUrl", null);
        setField(term291273, term291273.getClass(), "pullsUrl", null);
        setField(term291273, term291273.getClass(), "milestonesUrl", null);
        setField(term291273, term291273.getClass(), "notificationsUrl", null);
        setField(term291273, term291273.getClass(), "labelsUrl", null);
        setField(term291273, term291273.getClass(), "releasesUrl", null);
        setField(term291273, term291273.getClass(), "deploymentsUrl", null);
        setField(term291273, term291273.getClass(), "createdAt", null);
        setField(term291273, term291273.getClass(), "updatedAt", null);
        setField(term291273, term291273.getClass(), "pushedAt", null);
        setField(term291273, term291273.getClass(), "gitUrl", null);
        setField(term291273, term291273.getClass(), "sshUrl", null);
        setField(term291273, term291273.getClass(), "cloneUrl", null);
        setField(term291273, term291273.getClass(), "svnUrl", null);
        setField(term291273, term291273.getClass(), "homepage", null);
        setField(term291273, term291273.getClass(), "size", null);
        setField(term291273, term291273.getClass(), "stargazersCount", null);
        setField(term291273, term291273.getClass(), "watchersCount", null);
        setField(term291273, term291273.getClass(), "language", null);
        setField(term291273, term291273.getClass(), "hasIssues", null);
        setField(term291273, term291273.getClass(), "hasProjects", null);
        setField(term291273, term291273.getClass(), "hasDownloads", null);
        setField(term291273, term291273.getClass(), "hasWiki", null);
        setField(term291273, term291273.getClass(), "hasPages", null);
        setField(term291273, term291273.getClass(), "forksCount", null);
        setField(term291273, term291273.getClass(), "archived", null);
        setField(term291273, term291273.getClass(), "disabled", null);
        setField(term291273, term291273.getClass(), "openIssuesCount", null);
        setField(term291273, term291273.getClass(), "license", null);
        setField(term291273, term291273.getClass(), "allowForking", null);
        setField(term291273, term291273.getClass(), "isTemplate", null);
        setField(term291273, term291273.getClass(), "topics", null);
        setField(term291273, term291273.getClass(), "visibility", null);
        setField(term291273, term291273.getClass(), "forks", null);
        setField(term291273, term291273.getClass(), "openIssues", null);
        setField(term291273, term291273.getClass(), "watchers", null);
        setField(term291273, term291273.getClass(), "defaultBranch", null);
        setField(term291273, term291273.getClass(), "networkCount", null);
        setField(term291273, term291273.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDeploymentsUrl", argTypes, term291273, args);
    }

};


