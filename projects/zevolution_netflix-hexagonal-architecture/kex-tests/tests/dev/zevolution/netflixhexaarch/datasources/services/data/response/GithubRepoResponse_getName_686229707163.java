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

public class GithubRepoResponse_getName_686229707163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291186;

    public GithubRepoResponse_getName_686229707163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291186 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291186, term291186.getClass(), "id", null);
        setField(term291186, term291186.getClass(), "nodeId", null);
        setField(term291186, term291186.getClass(), "name", null);
        setField(term291186, term291186.getClass(), "fullName", null);
        setField(term291186, term291186.getClass(), "_private", null);
        setField(term291186, term291186.getClass(), "owner", null);
        setField(term291186, term291186.getClass(), "htmlUrl", null);
        setField(term291186, term291186.getClass(), "description", null);
        setField(term291186, term291186.getClass(), "fork", null);
        setField(term291186, term291186.getClass(), "url", null);
        setField(term291186, term291186.getClass(), "forksUrl", null);
        setField(term291186, term291186.getClass(), "keysUrl", null);
        setField(term291186, term291186.getClass(), "collaboratorsUrl", null);
        setField(term291186, term291186.getClass(), "teamsUrl", null);
        setField(term291186, term291186.getClass(), "hooksUrl", null);
        setField(term291186, term291186.getClass(), "issueEventsUrl", null);
        setField(term291186, term291186.getClass(), "eventsUrl", null);
        setField(term291186, term291186.getClass(), "assigneesUrl", null);
        setField(term291186, term291186.getClass(), "branchesUrl", null);
        setField(term291186, term291186.getClass(), "tagsUrl", null);
        setField(term291186, term291186.getClass(), "blobsUrl", null);
        setField(term291186, term291186.getClass(), "gitTagsUrl", null);
        setField(term291186, term291186.getClass(), "gitRefsUrl", null);
        setField(term291186, term291186.getClass(), "treesUrl", null);
        setField(term291186, term291186.getClass(), "statusesUrl", null);
        setField(term291186, term291186.getClass(), "languagesUrl", null);
        setField(term291186, term291186.getClass(), "stargazersUrl", null);
        setField(term291186, term291186.getClass(), "contributorsUrl", null);
        setField(term291186, term291186.getClass(), "subscribersUrl", null);
        setField(term291186, term291186.getClass(), "subscriptionUrl", null);
        setField(term291186, term291186.getClass(), "commitsUrl", null);
        setField(term291186, term291186.getClass(), "gitCommitsUrl", null);
        setField(term291186, term291186.getClass(), "commentsUrl", null);
        setField(term291186, term291186.getClass(), "issueCommentUrl", null);
        setField(term291186, term291186.getClass(), "contentsUrl", null);
        setField(term291186, term291186.getClass(), "compareUrl", null);
        setField(term291186, term291186.getClass(), "mergesUrl", null);
        setField(term291186, term291186.getClass(), "archiveUrl", null);
        setField(term291186, term291186.getClass(), "downloadsUrl", null);
        setField(term291186, term291186.getClass(), "issuesUrl", null);
        setField(term291186, term291186.getClass(), "pullsUrl", null);
        setField(term291186, term291186.getClass(), "milestonesUrl", null);
        setField(term291186, term291186.getClass(), "notificationsUrl", null);
        setField(term291186, term291186.getClass(), "labelsUrl", null);
        setField(term291186, term291186.getClass(), "releasesUrl", null);
        setField(term291186, term291186.getClass(), "deploymentsUrl", null);
        setField(term291186, term291186.getClass(), "createdAt", null);
        setField(term291186, term291186.getClass(), "updatedAt", null);
        setField(term291186, term291186.getClass(), "pushedAt", null);
        setField(term291186, term291186.getClass(), "gitUrl", null);
        setField(term291186, term291186.getClass(), "sshUrl", null);
        setField(term291186, term291186.getClass(), "cloneUrl", null);
        setField(term291186, term291186.getClass(), "svnUrl", null);
        setField(term291186, term291186.getClass(), "homepage", null);
        setField(term291186, term291186.getClass(), "size", null);
        setField(term291186, term291186.getClass(), "stargazersCount", null);
        setField(term291186, term291186.getClass(), "watchersCount", null);
        setField(term291186, term291186.getClass(), "language", null);
        setField(term291186, term291186.getClass(), "hasIssues", null);
        setField(term291186, term291186.getClass(), "hasProjects", null);
        setField(term291186, term291186.getClass(), "hasDownloads", null);
        setField(term291186, term291186.getClass(), "hasWiki", null);
        setField(term291186, term291186.getClass(), "hasPages", null);
        setField(term291186, term291186.getClass(), "forksCount", null);
        setField(term291186, term291186.getClass(), "archived", null);
        setField(term291186, term291186.getClass(), "disabled", null);
        setField(term291186, term291186.getClass(), "openIssuesCount", null);
        setField(term291186, term291186.getClass(), "license", null);
        setField(term291186, term291186.getClass(), "allowForking", null);
        setField(term291186, term291186.getClass(), "isTemplate", null);
        setField(term291186, term291186.getClass(), "topics", null);
        setField(term291186, term291186.getClass(), "visibility", null);
        setField(term291186, term291186.getClass(), "forks", null);
        setField(term291186, term291186.getClass(), "openIssues", null);
        setField(term291186, term291186.getClass(), "watchers", null);
        setField(term291186, term291186.getClass(), "defaultBranch", null);
        setField(term291186, term291186.getClass(), "networkCount", null);
        setField(term291186, term291186.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term291186, args);
    }

};


