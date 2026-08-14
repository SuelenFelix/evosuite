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

public class GithubRepoResponse_setOpenIssuesCount_1704989120291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291314;

    public GithubRepoResponse_setOpenIssuesCount_1704989120291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291314 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse"));
        setField(term291314, term291314.getClass(), "id", null);
        setField(term291314, term291314.getClass(), "nodeId", null);
        setField(term291314, term291314.getClass(), "name", null);
        setField(term291314, term291314.getClass(), "fullName", null);
        setField(term291314, term291314.getClass(), "_private", null);
        setField(term291314, term291314.getClass(), "owner", null);
        setField(term291314, term291314.getClass(), "htmlUrl", null);
        setField(term291314, term291314.getClass(), "description", null);
        setField(term291314, term291314.getClass(), "fork", null);
        setField(term291314, term291314.getClass(), "url", null);
        setField(term291314, term291314.getClass(), "forksUrl", null);
        setField(term291314, term291314.getClass(), "keysUrl", null);
        setField(term291314, term291314.getClass(), "collaboratorsUrl", null);
        setField(term291314, term291314.getClass(), "teamsUrl", null);
        setField(term291314, term291314.getClass(), "hooksUrl", null);
        setField(term291314, term291314.getClass(), "issueEventsUrl", null);
        setField(term291314, term291314.getClass(), "eventsUrl", null);
        setField(term291314, term291314.getClass(), "assigneesUrl", null);
        setField(term291314, term291314.getClass(), "branchesUrl", null);
        setField(term291314, term291314.getClass(), "tagsUrl", null);
        setField(term291314, term291314.getClass(), "blobsUrl", null);
        setField(term291314, term291314.getClass(), "gitTagsUrl", null);
        setField(term291314, term291314.getClass(), "gitRefsUrl", null);
        setField(term291314, term291314.getClass(), "treesUrl", null);
        setField(term291314, term291314.getClass(), "statusesUrl", null);
        setField(term291314, term291314.getClass(), "languagesUrl", null);
        setField(term291314, term291314.getClass(), "stargazersUrl", null);
        setField(term291314, term291314.getClass(), "contributorsUrl", null);
        setField(term291314, term291314.getClass(), "subscribersUrl", null);
        setField(term291314, term291314.getClass(), "subscriptionUrl", null);
        setField(term291314, term291314.getClass(), "commitsUrl", null);
        setField(term291314, term291314.getClass(), "gitCommitsUrl", null);
        setField(term291314, term291314.getClass(), "commentsUrl", null);
        setField(term291314, term291314.getClass(), "issueCommentUrl", null);
        setField(term291314, term291314.getClass(), "contentsUrl", null);
        setField(term291314, term291314.getClass(), "compareUrl", null);
        setField(term291314, term291314.getClass(), "mergesUrl", null);
        setField(term291314, term291314.getClass(), "archiveUrl", null);
        setField(term291314, term291314.getClass(), "downloadsUrl", null);
        setField(term291314, term291314.getClass(), "issuesUrl", null);
        setField(term291314, term291314.getClass(), "pullsUrl", null);
        setField(term291314, term291314.getClass(), "milestonesUrl", null);
        setField(term291314, term291314.getClass(), "notificationsUrl", null);
        setField(term291314, term291314.getClass(), "labelsUrl", null);
        setField(term291314, term291314.getClass(), "releasesUrl", null);
        setField(term291314, term291314.getClass(), "deploymentsUrl", null);
        setField(term291314, term291314.getClass(), "createdAt", null);
        setField(term291314, term291314.getClass(), "updatedAt", null);
        setField(term291314, term291314.getClass(), "pushedAt", null);
        setField(term291314, term291314.getClass(), "gitUrl", null);
        setField(term291314, term291314.getClass(), "sshUrl", null);
        setField(term291314, term291314.getClass(), "cloneUrl", null);
        setField(term291314, term291314.getClass(), "svnUrl", null);
        setField(term291314, term291314.getClass(), "homepage", null);
        setField(term291314, term291314.getClass(), "size", null);
        setField(term291314, term291314.getClass(), "stargazersCount", null);
        setField(term291314, term291314.getClass(), "watchersCount", null);
        setField(term291314, term291314.getClass(), "language", null);
        setField(term291314, term291314.getClass(), "hasIssues", null);
        setField(term291314, term291314.getClass(), "hasProjects", null);
        setField(term291314, term291314.getClass(), "hasDownloads", null);
        setField(term291314, term291314.getClass(), "hasWiki", null);
        setField(term291314, term291314.getClass(), "hasPages", null);
        setField(term291314, term291314.getClass(), "forksCount", null);
        setField(term291314, term291314.getClass(), "archived", null);
        setField(term291314, term291314.getClass(), "disabled", null);
        setField(term291314, term291314.getClass(), "openIssuesCount", null);
        setField(term291314, term291314.getClass(), "license", null);
        setField(term291314, term291314.getClass(), "allowForking", null);
        setField(term291314, term291314.getClass(), "isTemplate", null);
        setField(term291314, term291314.getClass(), "topics", null);
        setField(term291314, term291314.getClass(), "visibility", null);
        setField(term291314, term291314.getClass(), "forks", null);
        setField(term291314, term291314.getClass(), "openIssues", null);
        setField(term291314, term291314.getClass(), "watchers", null);
        setField(term291314, term291314.getClass(), "defaultBranch", null);
        setField(term291314, term291314.getClass(), "networkCount", null);
        setField(term291314, term291314.getClass(), "subscribersCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOpenIssuesCount", argTypes, term291314, args);
    }

};


