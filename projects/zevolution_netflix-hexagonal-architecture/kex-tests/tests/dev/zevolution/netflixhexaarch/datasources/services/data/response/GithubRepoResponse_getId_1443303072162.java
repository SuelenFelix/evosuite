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

public class GithubRepoResponse_getId_1443303072162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296000;

    public GithubRepoResponse_getId_1443303072162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296000 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term296000, term296000.getClass(), "id", null);
        setField(term296000, term296000.getClass(), "nodeId", null);
        setField(term296000, term296000.getClass(), "name", null);
        setField(term296000, term296000.getClass(), "fullName", null);
        setField(term296000, term296000.getClass(), "_private", null);
        setField(term296000, term296000.getClass(), "owner", null);
        setField(term296000, term296000.getClass(), "htmlUrl", null);
        setField(term296000, term296000.getClass(), "description", null);
        setField(term296000, term296000.getClass(), "fork", null);
        setField(term296000, term296000.getClass(), "url", null);
        setField(term296000, term296000.getClass(), "forksUrl", null);
        setField(term296000, term296000.getClass(), "keysUrl", null);
        setField(term296000, term296000.getClass(), "collaboratorsUrl", null);
        setField(term296000, term296000.getClass(), "teamsUrl", null);
        setField(term296000, term296000.getClass(), "hooksUrl", null);
        setField(term296000, term296000.getClass(), "issueEventsUrl", null);
        setField(term296000, term296000.getClass(), "eventsUrl", null);
        setField(term296000, term296000.getClass(), "assigneesUrl", null);
        setField(term296000, term296000.getClass(), "branchesUrl", null);
        setField(term296000, term296000.getClass(), "tagsUrl", null);
        setField(term296000, term296000.getClass(), "blobsUrl", null);
        setField(term296000, term296000.getClass(), "gitTagsUrl", null);
        setField(term296000, term296000.getClass(), "gitRefsUrl", null);
        setField(term296000, term296000.getClass(), "treesUrl", null);
        setField(term296000, term296000.getClass(), "statusesUrl", null);
        setField(term296000, term296000.getClass(), "languagesUrl", null);
        setField(term296000, term296000.getClass(), "stargazersUrl", null);
        setField(term296000, term296000.getClass(), "contributorsUrl", null);
        setField(term296000, term296000.getClass(), "subscribersUrl", null);
        setField(term296000, term296000.getClass(), "subscriptionUrl", null);
        setField(term296000, term296000.getClass(), "commitsUrl", null);
        setField(term296000, term296000.getClass(), "gitCommitsUrl", null);
        setField(term296000, term296000.getClass(), "commentsUrl", null);
        setField(term296000, term296000.getClass(), "issueCommentUrl", null);
        setField(term296000, term296000.getClass(), "contentsUrl", null);
        setField(term296000, term296000.getClass(), "compareUrl", null);
        setField(term296000, term296000.getClass(), "mergesUrl", null);
        setField(term296000, term296000.getClass(), "archiveUrl", null);
        setField(term296000, term296000.getClass(), "downloadsUrl", null);
        setField(term296000, term296000.getClass(), "issuesUrl", null);
        setField(term296000, term296000.getClass(), "pullsUrl", null);
        setField(term296000, term296000.getClass(), "milestonesUrl", null);
        setField(term296000, term296000.getClass(), "notificationsUrl", null);
        setField(term296000, term296000.getClass(), "labelsUrl", null);
        setField(term296000, term296000.getClass(), "releasesUrl", null);
        setField(term296000, term296000.getClass(), "deploymentsUrl", null);
        setField(term296000, term296000.getClass(), "createdAt", null);
        setField(term296000, term296000.getClass(), "updatedAt", null);
        setField(term296000, term296000.getClass(), "pushedAt", null);
        setField(term296000, term296000.getClass(), "gitUrl", null);
        setField(term296000, term296000.getClass(), "sshUrl", null);
        setField(term296000, term296000.getClass(), "cloneUrl", null);
        setField(term296000, term296000.getClass(), "svnUrl", null);
        setField(term296000, term296000.getClass(), "homepage", null);
        setField(term296000, term296000.getClass(), "size", null);
        setField(term296000, term296000.getClass(), "stargazersCount", null);
        setField(term296000, term296000.getClass(), "watchersCount", null);
        setField(term296000, term296000.getClass(), "language", null);
        setField(term296000, term296000.getClass(), "hasIssues", null);
        setField(term296000, term296000.getClass(), "hasProjects", null);
        setField(term296000, term296000.getClass(), "hasDownloads", null);
        setField(term296000, term296000.getClass(), "hasWiki", null);
        setField(term296000, term296000.getClass(), "hasPages", null);
        setField(term296000, term296000.getClass(), "forksCount", null);
        setField(term296000, term296000.getClass(), "archived", null);
        setField(term296000, term296000.getClass(), "disabled", null);
        setField(term296000, term296000.getClass(), "openIssuesCount", null);
        setField(term296000, term296000.getClass(), "license", null);
        setField(term296000, term296000.getClass(), "allowForking", null);
        setField(term296000, term296000.getClass(), "isTemplate", null);
        setField(term296000, term296000.getClass(), "topics", null);
        setField(term296000, term296000.getClass(), "visibility", null);
        setField(term296000, term296000.getClass(), "forks", null);
        setField(term296000, term296000.getClass(), "openIssues", null);
        setField(term296000, term296000.getClass(), "watchers", null);
        setField(term296000, term296000.getClass(), "defaultBranch", null);
        setField(term296000, term296000.getClass(), "networkCount", null);
        setField(term296000, term296000.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term296000, args);
    }

};


