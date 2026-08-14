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

public class GithubRepoResponse_setName_2998795759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47326;

    public GithubRepoResponse_setName_2998795759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47326 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term47326, term47326.getClass(), "id", null);
        setField(term47326, term47326.getClass(), "nodeId", null);
        setField(term47326, term47326.getClass(), "name", null);
        setField(term47326, term47326.getClass(), "fullName", null);
        setField(term47326, term47326.getClass(), "_private", null);
        setField(term47326, term47326.getClass(), "owner", null);
        setField(term47326, term47326.getClass(), "htmlUrl", null);
        setField(term47326, term47326.getClass(), "description", null);
        setField(term47326, term47326.getClass(), "fork", null);
        setField(term47326, term47326.getClass(), "url", null);
        setField(term47326, term47326.getClass(), "forksUrl", null);
        setField(term47326, term47326.getClass(), "keysUrl", null);
        setField(term47326, term47326.getClass(), "collaboratorsUrl", null);
        setField(term47326, term47326.getClass(), "teamsUrl", null);
        setField(term47326, term47326.getClass(), "hooksUrl", null);
        setField(term47326, term47326.getClass(), "issueEventsUrl", null);
        setField(term47326, term47326.getClass(), "eventsUrl", null);
        setField(term47326, term47326.getClass(), "assigneesUrl", null);
        setField(term47326, term47326.getClass(), "branchesUrl", null);
        setField(term47326, term47326.getClass(), "tagsUrl", null);
        setField(term47326, term47326.getClass(), "blobsUrl", null);
        setField(term47326, term47326.getClass(), "gitTagsUrl", null);
        setField(term47326, term47326.getClass(), "gitRefsUrl", null);
        setField(term47326, term47326.getClass(), "treesUrl", null);
        setField(term47326, term47326.getClass(), "statusesUrl", null);
        setField(term47326, term47326.getClass(), "languagesUrl", null);
        setField(term47326, term47326.getClass(), "stargazersUrl", null);
        setField(term47326, term47326.getClass(), "contributorsUrl", null);
        setField(term47326, term47326.getClass(), "subscribersUrl", null);
        setField(term47326, term47326.getClass(), "subscriptionUrl", null);
        setField(term47326, term47326.getClass(), "commitsUrl", null);
        setField(term47326, term47326.getClass(), "gitCommitsUrl", null);
        setField(term47326, term47326.getClass(), "commentsUrl", null);
        setField(term47326, term47326.getClass(), "issueCommentUrl", null);
        setField(term47326, term47326.getClass(), "contentsUrl", null);
        setField(term47326, term47326.getClass(), "compareUrl", null);
        setField(term47326, term47326.getClass(), "mergesUrl", null);
        setField(term47326, term47326.getClass(), "archiveUrl", null);
        setField(term47326, term47326.getClass(), "downloadsUrl", null);
        setField(term47326, term47326.getClass(), "issuesUrl", null);
        setField(term47326, term47326.getClass(), "pullsUrl", null);
        setField(term47326, term47326.getClass(), "milestonesUrl", null);
        setField(term47326, term47326.getClass(), "notificationsUrl", null);
        setField(term47326, term47326.getClass(), "labelsUrl", null);
        setField(term47326, term47326.getClass(), "releasesUrl", null);
        setField(term47326, term47326.getClass(), "deploymentsUrl", null);
        setField(term47326, term47326.getClass(), "createdAt", null);
        setField(term47326, term47326.getClass(), "updatedAt", null);
        setField(term47326, term47326.getClass(), "pushedAt", null);
        setField(term47326, term47326.getClass(), "gitUrl", null);
        setField(term47326, term47326.getClass(), "sshUrl", null);
        setField(term47326, term47326.getClass(), "cloneUrl", null);
        setField(term47326, term47326.getClass(), "svnUrl", null);
        setField(term47326, term47326.getClass(), "homepage", null);
        setField(term47326, term47326.getClass(), "size", null);
        setField(term47326, term47326.getClass(), "stargazersCount", null);
        setField(term47326, term47326.getClass(), "watchersCount", null);
        setField(term47326, term47326.getClass(), "language", null);
        setField(term47326, term47326.getClass(), "hasIssues", null);
        setField(term47326, term47326.getClass(), "hasProjects", null);
        setField(term47326, term47326.getClass(), "hasDownloads", null);
        setField(term47326, term47326.getClass(), "hasWiki", null);
        setField(term47326, term47326.getClass(), "hasPages", null);
        setField(term47326, term47326.getClass(), "forksCount", null);
        setField(term47326, term47326.getClass(), "archived", null);
        setField(term47326, term47326.getClass(), "disabled", null);
        setField(term47326, term47326.getClass(), "openIssuesCount", null);
        setField(term47326, term47326.getClass(), "license", null);
        setField(term47326, term47326.getClass(), "allowForking", null);
        setField(term47326, term47326.getClass(), "isTemplate", null);
        setField(term47326, term47326.getClass(), "topics", null);
        setField(term47326, term47326.getClass(), "visibility", null);
        setField(term47326, term47326.getClass(), "forks", null);
        setField(term47326, term47326.getClass(), "openIssues", null);
        setField(term47326, term47326.getClass(), "watchers", null);
        setField(term47326, term47326.getClass(), "defaultBranch", null);
        setField(term47326, term47326.getClass(), "networkCount", null);
        setField(term47326, term47326.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term47326, args);
    }

};


