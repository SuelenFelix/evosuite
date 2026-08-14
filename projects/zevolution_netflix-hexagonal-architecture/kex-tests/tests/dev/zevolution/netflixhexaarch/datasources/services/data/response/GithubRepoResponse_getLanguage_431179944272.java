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

public class GithubRepoResponse_getLanguage_431179944272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291295;

    public GithubRepoResponse_getLanguage_431179944272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291295 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291295, term291295.getClass(), "id", null);
        setField(term291295, term291295.getClass(), "nodeId", null);
        setField(term291295, term291295.getClass(), "name", null);
        setField(term291295, term291295.getClass(), "fullName", null);
        setField(term291295, term291295.getClass(), "_private", null);
        setField(term291295, term291295.getClass(), "owner", null);
        setField(term291295, term291295.getClass(), "htmlUrl", null);
        setField(term291295, term291295.getClass(), "description", null);
        setField(term291295, term291295.getClass(), "fork", null);
        setField(term291295, term291295.getClass(), "url", null);
        setField(term291295, term291295.getClass(), "forksUrl", null);
        setField(term291295, term291295.getClass(), "keysUrl", null);
        setField(term291295, term291295.getClass(), "collaboratorsUrl", null);
        setField(term291295, term291295.getClass(), "teamsUrl", null);
        setField(term291295, term291295.getClass(), "hooksUrl", null);
        setField(term291295, term291295.getClass(), "issueEventsUrl", null);
        setField(term291295, term291295.getClass(), "eventsUrl", null);
        setField(term291295, term291295.getClass(), "assigneesUrl", null);
        setField(term291295, term291295.getClass(), "branchesUrl", null);
        setField(term291295, term291295.getClass(), "tagsUrl", null);
        setField(term291295, term291295.getClass(), "blobsUrl", null);
        setField(term291295, term291295.getClass(), "gitTagsUrl", null);
        setField(term291295, term291295.getClass(), "gitRefsUrl", null);
        setField(term291295, term291295.getClass(), "treesUrl", null);
        setField(term291295, term291295.getClass(), "statusesUrl", null);
        setField(term291295, term291295.getClass(), "languagesUrl", null);
        setField(term291295, term291295.getClass(), "stargazersUrl", null);
        setField(term291295, term291295.getClass(), "contributorsUrl", null);
        setField(term291295, term291295.getClass(), "subscribersUrl", null);
        setField(term291295, term291295.getClass(), "subscriptionUrl", null);
        setField(term291295, term291295.getClass(), "commitsUrl", null);
        setField(term291295, term291295.getClass(), "gitCommitsUrl", null);
        setField(term291295, term291295.getClass(), "commentsUrl", null);
        setField(term291295, term291295.getClass(), "issueCommentUrl", null);
        setField(term291295, term291295.getClass(), "contentsUrl", null);
        setField(term291295, term291295.getClass(), "compareUrl", null);
        setField(term291295, term291295.getClass(), "mergesUrl", null);
        setField(term291295, term291295.getClass(), "archiveUrl", null);
        setField(term291295, term291295.getClass(), "downloadsUrl", null);
        setField(term291295, term291295.getClass(), "issuesUrl", null);
        setField(term291295, term291295.getClass(), "pullsUrl", null);
        setField(term291295, term291295.getClass(), "milestonesUrl", null);
        setField(term291295, term291295.getClass(), "notificationsUrl", null);
        setField(term291295, term291295.getClass(), "labelsUrl", null);
        setField(term291295, term291295.getClass(), "releasesUrl", null);
        setField(term291295, term291295.getClass(), "deploymentsUrl", null);
        setField(term291295, term291295.getClass(), "createdAt", null);
        setField(term291295, term291295.getClass(), "updatedAt", null);
        setField(term291295, term291295.getClass(), "pushedAt", null);
        setField(term291295, term291295.getClass(), "gitUrl", null);
        setField(term291295, term291295.getClass(), "sshUrl", null);
        setField(term291295, term291295.getClass(), "cloneUrl", null);
        setField(term291295, term291295.getClass(), "svnUrl", null);
        setField(term291295, term291295.getClass(), "homepage", null);
        setField(term291295, term291295.getClass(), "size", null);
        setField(term291295, term291295.getClass(), "stargazersCount", null);
        setField(term291295, term291295.getClass(), "watchersCount", null);
        setField(term291295, term291295.getClass(), "language", null);
        setField(term291295, term291295.getClass(), "hasIssues", null);
        setField(term291295, term291295.getClass(), "hasProjects", null);
        setField(term291295, term291295.getClass(), "hasDownloads", null);
        setField(term291295, term291295.getClass(), "hasWiki", null);
        setField(term291295, term291295.getClass(), "hasPages", null);
        setField(term291295, term291295.getClass(), "forksCount", null);
        setField(term291295, term291295.getClass(), "archived", null);
        setField(term291295, term291295.getClass(), "disabled", null);
        setField(term291295, term291295.getClass(), "openIssuesCount", null);
        setField(term291295, term291295.getClass(), "license", null);
        setField(term291295, term291295.getClass(), "allowForking", null);
        setField(term291295, term291295.getClass(), "isTemplate", null);
        setField(term291295, term291295.getClass(), "topics", null);
        setField(term291295, term291295.getClass(), "visibility", null);
        setField(term291295, term291295.getClass(), "forks", null);
        setField(term291295, term291295.getClass(), "openIssues", null);
        setField(term291295, term291295.getClass(), "watchers", null);
        setField(term291295, term291295.getClass(), "defaultBranch", null);
        setField(term291295, term291295.getClass(), "networkCount", null);
        setField(term291295, term291295.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term291295, args);
    }

};


