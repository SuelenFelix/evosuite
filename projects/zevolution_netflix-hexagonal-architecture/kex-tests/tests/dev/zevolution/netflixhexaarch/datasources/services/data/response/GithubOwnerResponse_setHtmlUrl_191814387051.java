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

public class GithubOwnerResponse_setHtmlUrl_191814387051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15566;

    public GithubOwnerResponse_setHtmlUrl_191814387051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15566 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15566, term15566.getClass(), "login", null);
        setField(term15566, term15566.getClass(), "id", null);
        setField(term15566, term15566.getClass(), "nodeId", null);
        setField(term15566, term15566.getClass(), "avatarUrl", null);
        setField(term15566, term15566.getClass(), "gravatarId", null);
        setField(term15566, term15566.getClass(), "url", null);
        setField(term15566, term15566.getClass(), "htmlUrl", null);
        setField(term15566, term15566.getClass(), "followersUrl", null);
        setField(term15566, term15566.getClass(), "followingUrl", null);
        setField(term15566, term15566.getClass(), "gistsUrl", null);
        setField(term15566, term15566.getClass(), "starredUrl", null);
        setField(term15566, term15566.getClass(), "subscriptionsUrl", null);
        setField(term15566, term15566.getClass(), "organizationsUrl", null);
        setField(term15566, term15566.getClass(), "reposUrl", null);
        setField(term15566, term15566.getClass(), "eventsUrl", null);
        setField(term15566, term15566.getClass(), "receivedEventsUrl", null);
        setField(term15566, term15566.getClass(), "type", null);
        setField(term15566, term15566.getClass(), "siteAdmin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHtmlUrl", argTypes, term15566, args);
    }

};


