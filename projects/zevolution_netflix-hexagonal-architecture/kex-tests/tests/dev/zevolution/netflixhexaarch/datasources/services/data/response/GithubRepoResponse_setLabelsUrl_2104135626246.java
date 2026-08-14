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

public class GithubRepoResponse_setLabelsUrl_2104135626246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291269;

    public GithubRepoResponse_setLabelsUrl_2104135626246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291269 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291269, term291269.getClass(), "id", null);
        setField(term291269, term291269.getClass(), "nodeId", null);
        setField(term291269, term291269.getClass(), "name", null);
        setField(term291269, term291269.getClass(), "fullName", null);
        setField(term291269, term291269.getClass(), "_private", null);
        setField(term291269, term291269.getClass(), "owner", null);
        setField(term291269, term291269.getClass(), "htmlUrl", null);
        setField(term291269, term291269.getClass(), "description", null);
        setField(term291269, term291269.getClass(), "fork", null);
        setField(term291269, term291269.getClass(), "url", null);
        setField(term291269, term291269.getClass(), "forksUrl", null);
        setField(term291269, term291269.getClass(), "keysUrl", null);
        setField(term291269, term291269.getClass(), "collaboratorsUrl", null);
        setField(term291269, term291269.getClass(), "teamsUrl", null);
        setField(term291269, term291269.getClass(), "hooksUrl", null);
        setField(term291269, term291269.getClass(), "issueEventsUrl", null);
        setField(term291269, term291269.getClass(), "eventsUrl", null);
        setField(term291269, term291269.getClass(), "assigneesUrl", null);
        setField(term291269, term291269.getClass(), "branchesUrl", null);
        setField(term291269, term291269.getClass(), "tagsUrl", null);
        setField(term291269, term291269.getClass(), "blobsUrl", null);
        setField(term291269, term291269.getClass(), "gitTagsUrl", null);
        setField(term291269, term291269.getClass(), "gitRefsUrl", null);
        setField(term291269, term291269.getClass(), "treesUrl", null);
        setField(term291269, term291269.getClass(), "statusesUrl", null);
        setField(term291269, term291269.getClass(), "languagesUrl", null);
        setField(term291269, term291269.getClass(), "stargazersUrl", null);
        setField(term291269, term291269.getClass(), "contributorsUrl", null);
        setField(term291269, term291269.getClass(), "subscribersUrl", null);
        setField(term291269, term291269.getClass(), "subscriptionUrl", null);
        setField(term291269, term291269.getClass(), "commitsUrl", null);
        setField(term291269, term291269.getClass(), "gitCommitsUrl", null);
        setField(term291269, term291269.getClass(), "commentsUrl", null);
        setField(term291269, term291269.getClass(), "issueCommentUrl", null);
        setField(term291269, term291269.getClass(), "contentsUrl", null);
        setField(term291269, term291269.getClass(), "compareUrl", null);
        setField(term291269, term291269.getClass(), "mergesUrl", null);
        setField(term291269, term291269.getClass(), "archiveUrl", null);
        setField(term291269, term291269.getClass(), "downloadsUrl", null);
        setField(term291269, term291269.getClass(), "issuesUrl", null);
        setField(term291269, term291269.getClass(), "pullsUrl", null);
        setField(term291269, term291269.getClass(), "milestonesUrl", null);
        setField(term291269, term291269.getClass(), "notificationsUrl", null);
        setField(term291269, term291269.getClass(), "labelsUrl", null);
        setField(term291269, term291269.getClass(), "releasesUrl", null);
        setField(term291269, term291269.getClass(), "deploymentsUrl", null);
        setField(term291269, term291269.getClass(), "createdAt", null);
        setField(term291269, term291269.getClass(), "updatedAt", null);
        setField(term291269, term291269.getClass(), "pushedAt", null);
        setField(term291269, term291269.getClass(), "gitUrl", null);
        setField(term291269, term291269.getClass(), "sshUrl", null);
        setField(term291269, term291269.getClass(), "cloneUrl", null);
        setField(term291269, term291269.getClass(), "svnUrl", null);
        setField(term291269, term291269.getClass(), "homepage", null);
        setField(term291269, term291269.getClass(), "size", null);
        setField(term291269, term291269.getClass(), "stargazersCount", null);
        setField(term291269, term291269.getClass(), "watchersCount", null);
        setField(term291269, term291269.getClass(), "language", null);
        setField(term291269, term291269.getClass(), "hasIssues", null);
        setField(term291269, term291269.getClass(), "hasProjects", null);
        setField(term291269, term291269.getClass(), "hasDownloads", null);
        setField(term291269, term291269.getClass(), "hasWiki", null);
        setField(term291269, term291269.getClass(), "hasPages", null);
        setField(term291269, term291269.getClass(), "forksCount", null);
        setField(term291269, term291269.getClass(), "archived", null);
        setField(term291269, term291269.getClass(), "disabled", null);
        setField(term291269, term291269.getClass(), "openIssuesCount", null);
        setField(term291269, term291269.getClass(), "license", null);
        setField(term291269, term291269.getClass(), "allowForking", null);
        setField(term291269, term291269.getClass(), "isTemplate", null);
        setField(term291269, term291269.getClass(), "topics", null);
        setField(term291269, term291269.getClass(), "visibility", null);
        setField(term291269, term291269.getClass(), "forks", null);
        setField(term291269, term291269.getClass(), "openIssues", null);
        setField(term291269, term291269.getClass(), "watchers", null);
        setField(term291269, term291269.getClass(), "defaultBranch", null);
        setField(term291269, term291269.getClass(), "networkCount", null);
        setField(term291269, term291269.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLabelsUrl", argTypes, term291269, args);
    }

};


