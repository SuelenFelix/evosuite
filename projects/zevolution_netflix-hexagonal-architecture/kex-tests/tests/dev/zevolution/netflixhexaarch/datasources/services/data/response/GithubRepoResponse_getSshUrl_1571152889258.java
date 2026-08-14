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

public class GithubRepoResponse_getSshUrl_1571152889258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291281;

    public GithubRepoResponse_getSshUrl_1571152889258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291281 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291281, term291281.getClass(), "id", null);
        setField(term291281, term291281.getClass(), "nodeId", null);
        setField(term291281, term291281.getClass(), "name", null);
        setField(term291281, term291281.getClass(), "fullName", null);
        setField(term291281, term291281.getClass(), "_private", null);
        setField(term291281, term291281.getClass(), "owner", null);
        setField(term291281, term291281.getClass(), "htmlUrl", null);
        setField(term291281, term291281.getClass(), "description", null);
        setField(term291281, term291281.getClass(), "fork", null);
        setField(term291281, term291281.getClass(), "url", null);
        setField(term291281, term291281.getClass(), "forksUrl", null);
        setField(term291281, term291281.getClass(), "keysUrl", null);
        setField(term291281, term291281.getClass(), "collaboratorsUrl", null);
        setField(term291281, term291281.getClass(), "teamsUrl", null);
        setField(term291281, term291281.getClass(), "hooksUrl", null);
        setField(term291281, term291281.getClass(), "issueEventsUrl", null);
        setField(term291281, term291281.getClass(), "eventsUrl", null);
        setField(term291281, term291281.getClass(), "assigneesUrl", null);
        setField(term291281, term291281.getClass(), "branchesUrl", null);
        setField(term291281, term291281.getClass(), "tagsUrl", null);
        setField(term291281, term291281.getClass(), "blobsUrl", null);
        setField(term291281, term291281.getClass(), "gitTagsUrl", null);
        setField(term291281, term291281.getClass(), "gitRefsUrl", null);
        setField(term291281, term291281.getClass(), "treesUrl", null);
        setField(term291281, term291281.getClass(), "statusesUrl", null);
        setField(term291281, term291281.getClass(), "languagesUrl", null);
        setField(term291281, term291281.getClass(), "stargazersUrl", null);
        setField(term291281, term291281.getClass(), "contributorsUrl", null);
        setField(term291281, term291281.getClass(), "subscribersUrl", null);
        setField(term291281, term291281.getClass(), "subscriptionUrl", null);
        setField(term291281, term291281.getClass(), "commitsUrl", null);
        setField(term291281, term291281.getClass(), "gitCommitsUrl", null);
        setField(term291281, term291281.getClass(), "commentsUrl", null);
        setField(term291281, term291281.getClass(), "issueCommentUrl", null);
        setField(term291281, term291281.getClass(), "contentsUrl", null);
        setField(term291281, term291281.getClass(), "compareUrl", null);
        setField(term291281, term291281.getClass(), "mergesUrl", null);
        setField(term291281, term291281.getClass(), "archiveUrl", null);
        setField(term291281, term291281.getClass(), "downloadsUrl", null);
        setField(term291281, term291281.getClass(), "issuesUrl", null);
        setField(term291281, term291281.getClass(), "pullsUrl", null);
        setField(term291281, term291281.getClass(), "milestonesUrl", null);
        setField(term291281, term291281.getClass(), "notificationsUrl", null);
        setField(term291281, term291281.getClass(), "labelsUrl", null);
        setField(term291281, term291281.getClass(), "releasesUrl", null);
        setField(term291281, term291281.getClass(), "deploymentsUrl", null);
        setField(term291281, term291281.getClass(), "createdAt", null);
        setField(term291281, term291281.getClass(), "updatedAt", null);
        setField(term291281, term291281.getClass(), "pushedAt", null);
        setField(term291281, term291281.getClass(), "gitUrl", null);
        setField(term291281, term291281.getClass(), "sshUrl", null);
        setField(term291281, term291281.getClass(), "cloneUrl", null);
        setField(term291281, term291281.getClass(), "svnUrl", null);
        setField(term291281, term291281.getClass(), "homepage", null);
        setField(term291281, term291281.getClass(), "size", null);
        setField(term291281, term291281.getClass(), "stargazersCount", null);
        setField(term291281, term291281.getClass(), "watchersCount", null);
        setField(term291281, term291281.getClass(), "language", null);
        setField(term291281, term291281.getClass(), "hasIssues", null);
        setField(term291281, term291281.getClass(), "hasProjects", null);
        setField(term291281, term291281.getClass(), "hasDownloads", null);
        setField(term291281, term291281.getClass(), "hasWiki", null);
        setField(term291281, term291281.getClass(), "hasPages", null);
        setField(term291281, term291281.getClass(), "forksCount", null);
        setField(term291281, term291281.getClass(), "archived", null);
        setField(term291281, term291281.getClass(), "disabled", null);
        setField(term291281, term291281.getClass(), "openIssuesCount", null);
        setField(term291281, term291281.getClass(), "license", null);
        setField(term291281, term291281.getClass(), "allowForking", null);
        setField(term291281, term291281.getClass(), "isTemplate", null);
        setField(term291281, term291281.getClass(), "topics", null);
        setField(term291281, term291281.getClass(), "visibility", null);
        setField(term291281, term291281.getClass(), "forks", null);
        setField(term291281, term291281.getClass(), "openIssues", null);
        setField(term291281, term291281.getClass(), "watchers", null);
        setField(term291281, term291281.getClass(), "defaultBranch", null);
        setField(term291281, term291281.getClass(), "networkCount", null);
        setField(term291281, term291281.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSshUrl", argTypes, term291281, args);
    }

};


