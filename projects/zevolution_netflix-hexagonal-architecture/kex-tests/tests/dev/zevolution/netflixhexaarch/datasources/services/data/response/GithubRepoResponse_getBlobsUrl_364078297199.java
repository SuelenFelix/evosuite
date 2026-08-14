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

public class GithubRepoResponse_getBlobsUrl_364078297199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291222;

    public GithubRepoResponse_getBlobsUrl_364078297199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291222 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291222, term291222.getClass(), "id", null);
        setField(term291222, term291222.getClass(), "nodeId", null);
        setField(term291222, term291222.getClass(), "name", null);
        setField(term291222, term291222.getClass(), "fullName", null);
        setField(term291222, term291222.getClass(), "_private", null);
        setField(term291222, term291222.getClass(), "owner", null);
        setField(term291222, term291222.getClass(), "htmlUrl", null);
        setField(term291222, term291222.getClass(), "description", null);
        setField(term291222, term291222.getClass(), "fork", null);
        setField(term291222, term291222.getClass(), "url", null);
        setField(term291222, term291222.getClass(), "forksUrl", null);
        setField(term291222, term291222.getClass(), "keysUrl", null);
        setField(term291222, term291222.getClass(), "collaboratorsUrl", null);
        setField(term291222, term291222.getClass(), "teamsUrl", null);
        setField(term291222, term291222.getClass(), "hooksUrl", null);
        setField(term291222, term291222.getClass(), "issueEventsUrl", null);
        setField(term291222, term291222.getClass(), "eventsUrl", null);
        setField(term291222, term291222.getClass(), "assigneesUrl", null);
        setField(term291222, term291222.getClass(), "branchesUrl", null);
        setField(term291222, term291222.getClass(), "tagsUrl", null);
        setField(term291222, term291222.getClass(), "blobsUrl", null);
        setField(term291222, term291222.getClass(), "gitTagsUrl", null);
        setField(term291222, term291222.getClass(), "gitRefsUrl", null);
        setField(term291222, term291222.getClass(), "treesUrl", null);
        setField(term291222, term291222.getClass(), "statusesUrl", null);
        setField(term291222, term291222.getClass(), "languagesUrl", null);
        setField(term291222, term291222.getClass(), "stargazersUrl", null);
        setField(term291222, term291222.getClass(), "contributorsUrl", null);
        setField(term291222, term291222.getClass(), "subscribersUrl", null);
        setField(term291222, term291222.getClass(), "subscriptionUrl", null);
        setField(term291222, term291222.getClass(), "commitsUrl", null);
        setField(term291222, term291222.getClass(), "gitCommitsUrl", null);
        setField(term291222, term291222.getClass(), "commentsUrl", null);
        setField(term291222, term291222.getClass(), "issueCommentUrl", null);
        setField(term291222, term291222.getClass(), "contentsUrl", null);
        setField(term291222, term291222.getClass(), "compareUrl", null);
        setField(term291222, term291222.getClass(), "mergesUrl", null);
        setField(term291222, term291222.getClass(), "archiveUrl", null);
        setField(term291222, term291222.getClass(), "downloadsUrl", null);
        setField(term291222, term291222.getClass(), "issuesUrl", null);
        setField(term291222, term291222.getClass(), "pullsUrl", null);
        setField(term291222, term291222.getClass(), "milestonesUrl", null);
        setField(term291222, term291222.getClass(), "notificationsUrl", null);
        setField(term291222, term291222.getClass(), "labelsUrl", null);
        setField(term291222, term291222.getClass(), "releasesUrl", null);
        setField(term291222, term291222.getClass(), "deploymentsUrl", null);
        setField(term291222, term291222.getClass(), "createdAt", null);
        setField(term291222, term291222.getClass(), "updatedAt", null);
        setField(term291222, term291222.getClass(), "pushedAt", null);
        setField(term291222, term291222.getClass(), "gitUrl", null);
        setField(term291222, term291222.getClass(), "sshUrl", null);
        setField(term291222, term291222.getClass(), "cloneUrl", null);
        setField(term291222, term291222.getClass(), "svnUrl", null);
        setField(term291222, term291222.getClass(), "homepage", null);
        setField(term291222, term291222.getClass(), "size", null);
        setField(term291222, term291222.getClass(), "stargazersCount", null);
        setField(term291222, term291222.getClass(), "watchersCount", null);
        setField(term291222, term291222.getClass(), "language", null);
        setField(term291222, term291222.getClass(), "hasIssues", null);
        setField(term291222, term291222.getClass(), "hasProjects", null);
        setField(term291222, term291222.getClass(), "hasDownloads", null);
        setField(term291222, term291222.getClass(), "hasWiki", null);
        setField(term291222, term291222.getClass(), "hasPages", null);
        setField(term291222, term291222.getClass(), "forksCount", null);
        setField(term291222, term291222.getClass(), "archived", null);
        setField(term291222, term291222.getClass(), "disabled", null);
        setField(term291222, term291222.getClass(), "openIssuesCount", null);
        setField(term291222, term291222.getClass(), "license", null);
        setField(term291222, term291222.getClass(), "allowForking", null);
        setField(term291222, term291222.getClass(), "isTemplate", null);
        setField(term291222, term291222.getClass(), "topics", null);
        setField(term291222, term291222.getClass(), "visibility", null);
        setField(term291222, term291222.getClass(), "forks", null);
        setField(term291222, term291222.getClass(), "openIssues", null);
        setField(term291222, term291222.getClass(), "watchers", null);
        setField(term291222, term291222.getClass(), "defaultBranch", null);
        setField(term291222, term291222.getClass(), "networkCount", null);
        setField(term291222, term291222.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlobsUrl", argTypes, term291222, args);
    }

};


