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

public class GithubRepoResponse_getForks_1878131530303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291326;

    public GithubRepoResponse_getForks_1878131530303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291326 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291326, term291326.getClass(), "id", null);
        setField(term291326, term291326.getClass(), "nodeId", null);
        setField(term291326, term291326.getClass(), "name", null);
        setField(term291326, term291326.getClass(), "fullName", null);
        setField(term291326, term291326.getClass(), "_private", null);
        setField(term291326, term291326.getClass(), "owner", null);
        setField(term291326, term291326.getClass(), "htmlUrl", null);
        setField(term291326, term291326.getClass(), "description", null);
        setField(term291326, term291326.getClass(), "fork", null);
        setField(term291326, term291326.getClass(), "url", null);
        setField(term291326, term291326.getClass(), "forksUrl", null);
        setField(term291326, term291326.getClass(), "keysUrl", null);
        setField(term291326, term291326.getClass(), "collaboratorsUrl", null);
        setField(term291326, term291326.getClass(), "teamsUrl", null);
        setField(term291326, term291326.getClass(), "hooksUrl", null);
        setField(term291326, term291326.getClass(), "issueEventsUrl", null);
        setField(term291326, term291326.getClass(), "eventsUrl", null);
        setField(term291326, term291326.getClass(), "assigneesUrl", null);
        setField(term291326, term291326.getClass(), "branchesUrl", null);
        setField(term291326, term291326.getClass(), "tagsUrl", null);
        setField(term291326, term291326.getClass(), "blobsUrl", null);
        setField(term291326, term291326.getClass(), "gitTagsUrl", null);
        setField(term291326, term291326.getClass(), "gitRefsUrl", null);
        setField(term291326, term291326.getClass(), "treesUrl", null);
        setField(term291326, term291326.getClass(), "statusesUrl", null);
        setField(term291326, term291326.getClass(), "languagesUrl", null);
        setField(term291326, term291326.getClass(), "stargazersUrl", null);
        setField(term291326, term291326.getClass(), "contributorsUrl", null);
        setField(term291326, term291326.getClass(), "subscribersUrl", null);
        setField(term291326, term291326.getClass(), "subscriptionUrl", null);
        setField(term291326, term291326.getClass(), "commitsUrl", null);
        setField(term291326, term291326.getClass(), "gitCommitsUrl", null);
        setField(term291326, term291326.getClass(), "commentsUrl", null);
        setField(term291326, term291326.getClass(), "issueCommentUrl", null);
        setField(term291326, term291326.getClass(), "contentsUrl", null);
        setField(term291326, term291326.getClass(), "compareUrl", null);
        setField(term291326, term291326.getClass(), "mergesUrl", null);
        setField(term291326, term291326.getClass(), "archiveUrl", null);
        setField(term291326, term291326.getClass(), "downloadsUrl", null);
        setField(term291326, term291326.getClass(), "issuesUrl", null);
        setField(term291326, term291326.getClass(), "pullsUrl", null);
        setField(term291326, term291326.getClass(), "milestonesUrl", null);
        setField(term291326, term291326.getClass(), "notificationsUrl", null);
        setField(term291326, term291326.getClass(), "labelsUrl", null);
        setField(term291326, term291326.getClass(), "releasesUrl", null);
        setField(term291326, term291326.getClass(), "deploymentsUrl", null);
        setField(term291326, term291326.getClass(), "createdAt", null);
        setField(term291326, term291326.getClass(), "updatedAt", null);
        setField(term291326, term291326.getClass(), "pushedAt", null);
        setField(term291326, term291326.getClass(), "gitUrl", null);
        setField(term291326, term291326.getClass(), "sshUrl", null);
        setField(term291326, term291326.getClass(), "cloneUrl", null);
        setField(term291326, term291326.getClass(), "svnUrl", null);
        setField(term291326, term291326.getClass(), "homepage", null);
        setField(term291326, term291326.getClass(), "size", null);
        setField(term291326, term291326.getClass(), "stargazersCount", null);
        setField(term291326, term291326.getClass(), "watchersCount", null);
        setField(term291326, term291326.getClass(), "language", null);
        setField(term291326, term291326.getClass(), "hasIssues", null);
        setField(term291326, term291326.getClass(), "hasProjects", null);
        setField(term291326, term291326.getClass(), "hasDownloads", null);
        setField(term291326, term291326.getClass(), "hasWiki", null);
        setField(term291326, term291326.getClass(), "hasPages", null);
        setField(term291326, term291326.getClass(), "forksCount", null);
        setField(term291326, term291326.getClass(), "archived", null);
        setField(term291326, term291326.getClass(), "disabled", null);
        setField(term291326, term291326.getClass(), "openIssuesCount", null);
        setField(term291326, term291326.getClass(), "license", null);
        setField(term291326, term291326.getClass(), "allowForking", null);
        setField(term291326, term291326.getClass(), "isTemplate", null);
        setField(term291326, term291326.getClass(), "topics", null);
        setField(term291326, term291326.getClass(), "visibility", null);
        setField(term291326, term291326.getClass(), "forks", null);
        setField(term291326, term291326.getClass(), "openIssues", null);
        setField(term291326, term291326.getClass(), "watchers", null);
        setField(term291326, term291326.getClass(), "defaultBranch", null);
        setField(term291326, term291326.getClass(), "networkCount", null);
        setField(term291326, term291326.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForks", argTypes, term291326, args);
    }

};


