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

public class GithubRepoResponse_setId_241376940163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296001;

    public GithubRepoResponse_setId_241376940163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296001 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term296001, term296001.getClass(), "id", null);
        setField(term296001, term296001.getClass(), "nodeId", null);
        setField(term296001, term296001.getClass(), "name", null);
        setField(term296001, term296001.getClass(), "fullName", null);
        setField(term296001, term296001.getClass(), "_private", null);
        setField(term296001, term296001.getClass(), "owner", null);
        setField(term296001, term296001.getClass(), "htmlUrl", null);
        setField(term296001, term296001.getClass(), "description", null);
        setField(term296001, term296001.getClass(), "fork", null);
        setField(term296001, term296001.getClass(), "url", null);
        setField(term296001, term296001.getClass(), "forksUrl", null);
        setField(term296001, term296001.getClass(), "keysUrl", null);
        setField(term296001, term296001.getClass(), "collaboratorsUrl", null);
        setField(term296001, term296001.getClass(), "teamsUrl", null);
        setField(term296001, term296001.getClass(), "hooksUrl", null);
        setField(term296001, term296001.getClass(), "issueEventsUrl", null);
        setField(term296001, term296001.getClass(), "eventsUrl", null);
        setField(term296001, term296001.getClass(), "assigneesUrl", null);
        setField(term296001, term296001.getClass(), "branchesUrl", null);
        setField(term296001, term296001.getClass(), "tagsUrl", null);
        setField(term296001, term296001.getClass(), "blobsUrl", null);
        setField(term296001, term296001.getClass(), "gitTagsUrl", null);
        setField(term296001, term296001.getClass(), "gitRefsUrl", null);
        setField(term296001, term296001.getClass(), "treesUrl", null);
        setField(term296001, term296001.getClass(), "statusesUrl", null);
        setField(term296001, term296001.getClass(), "languagesUrl", null);
        setField(term296001, term296001.getClass(), "stargazersUrl", null);
        setField(term296001, term296001.getClass(), "contributorsUrl", null);
        setField(term296001, term296001.getClass(), "subscribersUrl", null);
        setField(term296001, term296001.getClass(), "subscriptionUrl", null);
        setField(term296001, term296001.getClass(), "commitsUrl", null);
        setField(term296001, term296001.getClass(), "gitCommitsUrl", null);
        setField(term296001, term296001.getClass(), "commentsUrl", null);
        setField(term296001, term296001.getClass(), "issueCommentUrl", null);
        setField(term296001, term296001.getClass(), "contentsUrl", null);
        setField(term296001, term296001.getClass(), "compareUrl", null);
        setField(term296001, term296001.getClass(), "mergesUrl", null);
        setField(term296001, term296001.getClass(), "archiveUrl", null);
        setField(term296001, term296001.getClass(), "downloadsUrl", null);
        setField(term296001, term296001.getClass(), "issuesUrl", null);
        setField(term296001, term296001.getClass(), "pullsUrl", null);
        setField(term296001, term296001.getClass(), "milestonesUrl", null);
        setField(term296001, term296001.getClass(), "notificationsUrl", null);
        setField(term296001, term296001.getClass(), "labelsUrl", null);
        setField(term296001, term296001.getClass(), "releasesUrl", null);
        setField(term296001, term296001.getClass(), "deploymentsUrl", null);
        setField(term296001, term296001.getClass(), "createdAt", null);
        setField(term296001, term296001.getClass(), "updatedAt", null);
        setField(term296001, term296001.getClass(), "pushedAt", null);
        setField(term296001, term296001.getClass(), "gitUrl", null);
        setField(term296001, term296001.getClass(), "sshUrl", null);
        setField(term296001, term296001.getClass(), "cloneUrl", null);
        setField(term296001, term296001.getClass(), "svnUrl", null);
        setField(term296001, term296001.getClass(), "homepage", null);
        setField(term296001, term296001.getClass(), "size", null);
        setField(term296001, term296001.getClass(), "stargazersCount", null);
        setField(term296001, term296001.getClass(), "watchersCount", null);
        setField(term296001, term296001.getClass(), "language", null);
        setField(term296001, term296001.getClass(), "hasIssues", null);
        setField(term296001, term296001.getClass(), "hasProjects", null);
        setField(term296001, term296001.getClass(), "hasDownloads", null);
        setField(term296001, term296001.getClass(), "hasWiki", null);
        setField(term296001, term296001.getClass(), "hasPages", null);
        setField(term296001, term296001.getClass(), "forksCount", null);
        setField(term296001, term296001.getClass(), "archived", null);
        setField(term296001, term296001.getClass(), "disabled", null);
        setField(term296001, term296001.getClass(), "openIssuesCount", null);
        setField(term296001, term296001.getClass(), "license", null);
        setField(term296001, term296001.getClass(), "allowForking", null);
        setField(term296001, term296001.getClass(), "isTemplate", null);
        setField(term296001, term296001.getClass(), "topics", null);
        setField(term296001, term296001.getClass(), "visibility", null);
        setField(term296001, term296001.getClass(), "forks", null);
        setField(term296001, term296001.getClass(), "openIssues", null);
        setField(term296001, term296001.getClass(), "watchers", null);
        setField(term296001, term296001.getClass(), "defaultBranch", null);
        setField(term296001, term296001.getClass(), "networkCount", null);
        setField(term296001, term296001.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term296001, args);
    }

};


