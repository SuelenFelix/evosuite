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

public class GithubRepoResponse_getId_1443303072159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291182;

    public GithubRepoResponse_getId_1443303072159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291182 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291182, term291182.getClass(), "id", null);
        setField(term291182, term291182.getClass(), "nodeId", null);
        setField(term291182, term291182.getClass(), "name", null);
        setField(term291182, term291182.getClass(), "fullName", null);
        setField(term291182, term291182.getClass(), "_private", null);
        setField(term291182, term291182.getClass(), "owner", null);
        setField(term291182, term291182.getClass(), "htmlUrl", null);
        setField(term291182, term291182.getClass(), "description", null);
        setField(term291182, term291182.getClass(), "fork", null);
        setField(term291182, term291182.getClass(), "url", null);
        setField(term291182, term291182.getClass(), "forksUrl", null);
        setField(term291182, term291182.getClass(), "keysUrl", null);
        setField(term291182, term291182.getClass(), "collaboratorsUrl", null);
        setField(term291182, term291182.getClass(), "teamsUrl", null);
        setField(term291182, term291182.getClass(), "hooksUrl", null);
        setField(term291182, term291182.getClass(), "issueEventsUrl", null);
        setField(term291182, term291182.getClass(), "eventsUrl", null);
        setField(term291182, term291182.getClass(), "assigneesUrl", null);
        setField(term291182, term291182.getClass(), "branchesUrl", null);
        setField(term291182, term291182.getClass(), "tagsUrl", null);
        setField(term291182, term291182.getClass(), "blobsUrl", null);
        setField(term291182, term291182.getClass(), "gitTagsUrl", null);
        setField(term291182, term291182.getClass(), "gitRefsUrl", null);
        setField(term291182, term291182.getClass(), "treesUrl", null);
        setField(term291182, term291182.getClass(), "statusesUrl", null);
        setField(term291182, term291182.getClass(), "languagesUrl", null);
        setField(term291182, term291182.getClass(), "stargazersUrl", null);
        setField(term291182, term291182.getClass(), "contributorsUrl", null);
        setField(term291182, term291182.getClass(), "subscribersUrl", null);
        setField(term291182, term291182.getClass(), "subscriptionUrl", null);
        setField(term291182, term291182.getClass(), "commitsUrl", null);
        setField(term291182, term291182.getClass(), "gitCommitsUrl", null);
        setField(term291182, term291182.getClass(), "commentsUrl", null);
        setField(term291182, term291182.getClass(), "issueCommentUrl", null);
        setField(term291182, term291182.getClass(), "contentsUrl", null);
        setField(term291182, term291182.getClass(), "compareUrl", null);
        setField(term291182, term291182.getClass(), "mergesUrl", null);
        setField(term291182, term291182.getClass(), "archiveUrl", null);
        setField(term291182, term291182.getClass(), "downloadsUrl", null);
        setField(term291182, term291182.getClass(), "issuesUrl", null);
        setField(term291182, term291182.getClass(), "pullsUrl", null);
        setField(term291182, term291182.getClass(), "milestonesUrl", null);
        setField(term291182, term291182.getClass(), "notificationsUrl", null);
        setField(term291182, term291182.getClass(), "labelsUrl", null);
        setField(term291182, term291182.getClass(), "releasesUrl", null);
        setField(term291182, term291182.getClass(), "deploymentsUrl", null);
        setField(term291182, term291182.getClass(), "createdAt", null);
        setField(term291182, term291182.getClass(), "updatedAt", null);
        setField(term291182, term291182.getClass(), "pushedAt", null);
        setField(term291182, term291182.getClass(), "gitUrl", null);
        setField(term291182, term291182.getClass(), "sshUrl", null);
        setField(term291182, term291182.getClass(), "cloneUrl", null);
        setField(term291182, term291182.getClass(), "svnUrl", null);
        setField(term291182, term291182.getClass(), "homepage", null);
        setField(term291182, term291182.getClass(), "size", null);
        setField(term291182, term291182.getClass(), "stargazersCount", null);
        setField(term291182, term291182.getClass(), "watchersCount", null);
        setField(term291182, term291182.getClass(), "language", null);
        setField(term291182, term291182.getClass(), "hasIssues", null);
        setField(term291182, term291182.getClass(), "hasProjects", null);
        setField(term291182, term291182.getClass(), "hasDownloads", null);
        setField(term291182, term291182.getClass(), "hasWiki", null);
        setField(term291182, term291182.getClass(), "hasPages", null);
        setField(term291182, term291182.getClass(), "forksCount", null);
        setField(term291182, term291182.getClass(), "archived", null);
        setField(term291182, term291182.getClass(), "disabled", null);
        setField(term291182, term291182.getClass(), "openIssuesCount", null);
        setField(term291182, term291182.getClass(), "license", null);
        setField(term291182, term291182.getClass(), "allowForking", null);
        setField(term291182, term291182.getClass(), "isTemplate", null);
        setField(term291182, term291182.getClass(), "topics", null);
        setField(term291182, term291182.getClass(), "visibility", null);
        setField(term291182, term291182.getClass(), "forks", null);
        setField(term291182, term291182.getClass(), "openIssues", null);
        setField(term291182, term291182.getClass(), "watchers", null);
        setField(term291182, term291182.getClass(), "defaultBranch", null);
        setField(term291182, term291182.getClass(), "networkCount", null);
        setField(term291182, term291182.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term291182, args);
    }

};


