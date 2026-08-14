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

public class GithubOwnerResponse_getSiteAdmin_124269258472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15587;

    public GithubOwnerResponse_getSiteAdmin_124269258472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15587 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15587, term15587.getClass(), "login", null);
        setField(term15587, term15587.getClass(), "id", null);
        setField(term15587, term15587.getClass(), "nodeId", null);
        setField(term15587, term15587.getClass(), "avatarUrl", null);
        setField(term15587, term15587.getClass(), "gravatarId", null);
        setField(term15587, term15587.getClass(), "url", null);
        setField(term15587, term15587.getClass(), "htmlUrl", null);
        setField(term15587, term15587.getClass(), "followersUrl", null);
        setField(term15587, term15587.getClass(), "followingUrl", null);
        setField(term15587, term15587.getClass(), "gistsUrl", null);
        setField(term15587, term15587.getClass(), "starredUrl", null);
        setField(term15587, term15587.getClass(), "subscriptionsUrl", null);
        setField(term15587, term15587.getClass(), "organizationsUrl", null);
        setField(term15587, term15587.getClass(), "reposUrl", null);
        setField(term15587, term15587.getClass(), "eventsUrl", null);
        setField(term15587, term15587.getClass(), "receivedEventsUrl", null);
        setField(term15587, term15587.getClass(), "type", null);
        setField(term15587, term15587.getClass(), "siteAdmin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSiteAdmin", argTypes, term15587, args);
    }

};


