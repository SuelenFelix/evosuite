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

public class GithubOwnerResponse_getFollowersUrl_67665456752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15567;

    public GithubOwnerResponse_getFollowersUrl_67665456752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15567 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15567, term15567.getClass(), "login", null);
        setField(term15567, term15567.getClass(), "id", null);
        setField(term15567, term15567.getClass(), "nodeId", null);
        setField(term15567, term15567.getClass(), "avatarUrl", null);
        setField(term15567, term15567.getClass(), "gravatarId", null);
        setField(term15567, term15567.getClass(), "url", null);
        setField(term15567, term15567.getClass(), "htmlUrl", null);
        setField(term15567, term15567.getClass(), "followersUrl", null);
        setField(term15567, term15567.getClass(), "followingUrl", null);
        setField(term15567, term15567.getClass(), "gistsUrl", null);
        setField(term15567, term15567.getClass(), "starredUrl", null);
        setField(term15567, term15567.getClass(), "subscriptionsUrl", null);
        setField(term15567, term15567.getClass(), "organizationsUrl", null);
        setField(term15567, term15567.getClass(), "reposUrl", null);
        setField(term15567, term15567.getClass(), "eventsUrl", null);
        setField(term15567, term15567.getClass(), "receivedEventsUrl", null);
        setField(term15567, term15567.getClass(), "type", null);
        setField(term15567, term15567.getClass(), "siteAdmin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowersUrl", argTypes, term15567, args);
    }

};


