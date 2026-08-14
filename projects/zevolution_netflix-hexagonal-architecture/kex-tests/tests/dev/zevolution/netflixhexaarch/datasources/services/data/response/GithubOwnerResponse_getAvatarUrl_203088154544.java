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

public class GithubOwnerResponse_getAvatarUrl_203088154544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15559;

    public GithubOwnerResponse_getAvatarUrl_203088154544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15559 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15559, term15559.getClass(), "login", null);
        setField(term15559, term15559.getClass(), "id", null);
        setField(term15559, term15559.getClass(), "nodeId", null);
        setField(term15559, term15559.getClass(), "avatarUrl", null);
        setField(term15559, term15559.getClass(), "gravatarId", null);
        setField(term15559, term15559.getClass(), "url", null);
        setField(term15559, term15559.getClass(), "htmlUrl", null);
        setField(term15559, term15559.getClass(), "followersUrl", null);
        setField(term15559, term15559.getClass(), "followingUrl", null);
        setField(term15559, term15559.getClass(), "gistsUrl", null);
        setField(term15559, term15559.getClass(), "starredUrl", null);
        setField(term15559, term15559.getClass(), "subscriptionsUrl", null);
        setField(term15559, term15559.getClass(), "organizationsUrl", null);
        setField(term15559, term15559.getClass(), "reposUrl", null);
        setField(term15559, term15559.getClass(), "eventsUrl", null);
        setField(term15559, term15559.getClass(), "receivedEventsUrl", null);
        setField(term15559, term15559.getClass(), "type", null);
        setField(term15559, term15559.getClass(), "siteAdmin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term15559, args);
    }

};


