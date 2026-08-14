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

public class GithubRepoResponse_getFullName_1205910214164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291187;

    public GithubRepoResponse_getFullName_1205910214164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291187 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291187, term291187.getClass(), "id", null);
        setField(term291187, term291187.getClass(), "nodeId", null);
        setField(term291187, term291187.getClass(), "name", null);
        setField(term291187, term291187.getClass(), "fullName", null);
        setField(term291187, term291187.getClass(), "_private", null);
        setField(term291187, term291187.getClass(), "owner", null);
        setField(term291187, term291187.getClass(), "htmlUrl", null);
        setField(term291187, term291187.getClass(), "description", null);
        setField(term291187, term291187.getClass(), "fork", null);
        setField(term291187, term291187.getClass(), "url", null);
        setField(term291187, term291187.getClass(), "forksUrl", null);
        setField(term291187, term291187.getClass(), "keysUrl", null);
        setField(term291187, term291187.getClass(), "collaboratorsUrl", null);
        setField(term291187, term291187.getClass(), "teamsUrl", null);
        setField(term291187, term291187.getClass(), "hooksUrl", null);
        setField(term291187, term291187.getClass(), "issueEventsUrl", null);
        setField(term291187, term291187.getClass(), "eventsUrl", null);
        setField(term291187, term291187.getClass(), "assigneesUrl", null);
        setField(term291187, term291187.getClass(), "branchesUrl", null);
        setField(term291187, term291187.getClass(), "tagsUrl", null);
        setField(term291187, term291187.getClass(), "blobsUrl", null);
        setField(term291187, term291187.getClass(), "gitTagsUrl", null);
        setField(term291187, term291187.getClass(), "gitRefsUrl", null);
        setField(term291187, term291187.getClass(), "treesUrl", null);
        setField(term291187, term291187.getClass(), "statusesUrl", null);
        setField(term291187, term291187.getClass(), "languagesUrl", null);
        setField(term291187, term291187.getClass(), "stargazersUrl", null);
        setField(term291187, term291187.getClass(), "contributorsUrl", null);
        setField(term291187, term291187.getClass(), "subscribersUrl", null);
        setField(term291187, term291187.getClass(), "subscriptionUrl", null);
        setField(term291187, term291187.getClass(), "commitsUrl", null);
        setField(term291187, term291187.getClass(), "gitCommitsUrl", null);
        setField(term291187, term291187.getClass(), "commentsUrl", null);
        setField(term291187, term291187.getClass(), "issueCommentUrl", null);
        setField(term291187, term291187.getClass(), "contentsUrl", null);
        setField(term291187, term291187.getClass(), "compareUrl", null);
        setField(term291187, term291187.getClass(), "mergesUrl", null);
        setField(term291187, term291187.getClass(), "archiveUrl", null);
        setField(term291187, term291187.getClass(), "downloadsUrl", null);
        setField(term291187, term291187.getClass(), "issuesUrl", null);
        setField(term291187, term291187.getClass(), "pullsUrl", null);
        setField(term291187, term291187.getClass(), "milestonesUrl", null);
        setField(term291187, term291187.getClass(), "notificationsUrl", null);
        setField(term291187, term291187.getClass(), "labelsUrl", null);
        setField(term291187, term291187.getClass(), "releasesUrl", null);
        setField(term291187, term291187.getClass(), "deploymentsUrl", null);
        setField(term291187, term291187.getClass(), "createdAt", null);
        setField(term291187, term291187.getClass(), "updatedAt", null);
        setField(term291187, term291187.getClass(), "pushedAt", null);
        setField(term291187, term291187.getClass(), "gitUrl", null);
        setField(term291187, term291187.getClass(), "sshUrl", null);
        setField(term291187, term291187.getClass(), "cloneUrl", null);
        setField(term291187, term291187.getClass(), "svnUrl", null);
        setField(term291187, term291187.getClass(), "homepage", null);
        setField(term291187, term291187.getClass(), "size", null);
        setField(term291187, term291187.getClass(), "stargazersCount", null);
        setField(term291187, term291187.getClass(), "watchersCount", null);
        setField(term291187, term291187.getClass(), "language", null);
        setField(term291187, term291187.getClass(), "hasIssues", null);
        setField(term291187, term291187.getClass(), "hasProjects", null);
        setField(term291187, term291187.getClass(), "hasDownloads", null);
        setField(term291187, term291187.getClass(), "hasWiki", null);
        setField(term291187, term291187.getClass(), "hasPages", null);
        setField(term291187, term291187.getClass(), "forksCount", null);
        setField(term291187, term291187.getClass(), "archived", null);
        setField(term291187, term291187.getClass(), "disabled", null);
        setField(term291187, term291187.getClass(), "openIssuesCount", null);
        setField(term291187, term291187.getClass(), "license", null);
        setField(term291187, term291187.getClass(), "allowForking", null);
        setField(term291187, term291187.getClass(), "isTemplate", null);
        setField(term291187, term291187.getClass(), "topics", null);
        setField(term291187, term291187.getClass(), "visibility", null);
        setField(term291187, term291187.getClass(), "forks", null);
        setField(term291187, term291187.getClass(), "openIssues", null);
        setField(term291187, term291187.getClass(), "watchers", null);
        setField(term291187, term291187.getClass(), "defaultBranch", null);
        setField(term291187, term291187.getClass(), "networkCount", null);
        setField(term291187, term291187.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullName", argTypes, term291187, args);
    }

};


