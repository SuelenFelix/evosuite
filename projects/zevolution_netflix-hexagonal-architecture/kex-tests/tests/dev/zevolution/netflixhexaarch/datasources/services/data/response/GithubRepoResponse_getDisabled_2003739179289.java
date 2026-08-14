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

public class GithubRepoResponse_getDisabled_2003739179289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291312;

    public GithubRepoResponse_getDisabled_2003739179289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291312 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291312, term291312.getClass(), "id", null);
        setField(term291312, term291312.getClass(), "nodeId", null);
        setField(term291312, term291312.getClass(), "name", null);
        setField(term291312, term291312.getClass(), "fullName", null);
        setField(term291312, term291312.getClass(), "_private", null);
        setField(term291312, term291312.getClass(), "owner", null);
        setField(term291312, term291312.getClass(), "htmlUrl", null);
        setField(term291312, term291312.getClass(), "description", null);
        setField(term291312, term291312.getClass(), "fork", null);
        setField(term291312, term291312.getClass(), "url", null);
        setField(term291312, term291312.getClass(), "forksUrl", null);
        setField(term291312, term291312.getClass(), "keysUrl", null);
        setField(term291312, term291312.getClass(), "collaboratorsUrl", null);
        setField(term291312, term291312.getClass(), "teamsUrl", null);
        setField(term291312, term291312.getClass(), "hooksUrl", null);
        setField(term291312, term291312.getClass(), "issueEventsUrl", null);
        setField(term291312, term291312.getClass(), "eventsUrl", null);
        setField(term291312, term291312.getClass(), "assigneesUrl", null);
        setField(term291312, term291312.getClass(), "branchesUrl", null);
        setField(term291312, term291312.getClass(), "tagsUrl", null);
        setField(term291312, term291312.getClass(), "blobsUrl", null);
        setField(term291312, term291312.getClass(), "gitTagsUrl", null);
        setField(term291312, term291312.getClass(), "gitRefsUrl", null);
        setField(term291312, term291312.getClass(), "treesUrl", null);
        setField(term291312, term291312.getClass(), "statusesUrl", null);
        setField(term291312, term291312.getClass(), "languagesUrl", null);
        setField(term291312, term291312.getClass(), "stargazersUrl", null);
        setField(term291312, term291312.getClass(), "contributorsUrl", null);
        setField(term291312, term291312.getClass(), "subscribersUrl", null);
        setField(term291312, term291312.getClass(), "subscriptionUrl", null);
        setField(term291312, term291312.getClass(), "commitsUrl", null);
        setField(term291312, term291312.getClass(), "gitCommitsUrl", null);
        setField(term291312, term291312.getClass(), "commentsUrl", null);
        setField(term291312, term291312.getClass(), "issueCommentUrl", null);
        setField(term291312, term291312.getClass(), "contentsUrl", null);
        setField(term291312, term291312.getClass(), "compareUrl", null);
        setField(term291312, term291312.getClass(), "mergesUrl", null);
        setField(term291312, term291312.getClass(), "archiveUrl", null);
        setField(term291312, term291312.getClass(), "downloadsUrl", null);
        setField(term291312, term291312.getClass(), "issuesUrl", null);
        setField(term291312, term291312.getClass(), "pullsUrl", null);
        setField(term291312, term291312.getClass(), "milestonesUrl", null);
        setField(term291312, term291312.getClass(), "notificationsUrl", null);
        setField(term291312, term291312.getClass(), "labelsUrl", null);
        setField(term291312, term291312.getClass(), "releasesUrl", null);
        setField(term291312, term291312.getClass(), "deploymentsUrl", null);
        setField(term291312, term291312.getClass(), "createdAt", null);
        setField(term291312, term291312.getClass(), "updatedAt", null);
        setField(term291312, term291312.getClass(), "pushedAt", null);
        setField(term291312, term291312.getClass(), "gitUrl", null);
        setField(term291312, term291312.getClass(), "sshUrl", null);
        setField(term291312, term291312.getClass(), "cloneUrl", null);
        setField(term291312, term291312.getClass(), "svnUrl", null);
        setField(term291312, term291312.getClass(), "homepage", null);
        setField(term291312, term291312.getClass(), "size", null);
        setField(term291312, term291312.getClass(), "stargazersCount", null);
        setField(term291312, term291312.getClass(), "watchersCount", null);
        setField(term291312, term291312.getClass(), "language", null);
        setField(term291312, term291312.getClass(), "hasIssues", null);
        setField(term291312, term291312.getClass(), "hasProjects", null);
        setField(term291312, term291312.getClass(), "hasDownloads", null);
        setField(term291312, term291312.getClass(), "hasWiki", null);
        setField(term291312, term291312.getClass(), "hasPages", null);
        setField(term291312, term291312.getClass(), "forksCount", null);
        setField(term291312, term291312.getClass(), "archived", null);
        setField(term291312, term291312.getClass(), "disabled", null);
        setField(term291312, term291312.getClass(), "openIssuesCount", null);
        setField(term291312, term291312.getClass(), "license", null);
        setField(term291312, term291312.getClass(), "allowForking", null);
        setField(term291312, term291312.getClass(), "isTemplate", null);
        setField(term291312, term291312.getClass(), "topics", null);
        setField(term291312, term291312.getClass(), "visibility", null);
        setField(term291312, term291312.getClass(), "forks", null);
        setField(term291312, term291312.getClass(), "openIssues", null);
        setField(term291312, term291312.getClass(), "watchers", null);
        setField(term291312, term291312.getClass(), "defaultBranch", null);
        setField(term291312, term291312.getClass(), "networkCount", null);
        setField(term291312, term291312.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisabled", argTypes, term291312, args);
    }

};


