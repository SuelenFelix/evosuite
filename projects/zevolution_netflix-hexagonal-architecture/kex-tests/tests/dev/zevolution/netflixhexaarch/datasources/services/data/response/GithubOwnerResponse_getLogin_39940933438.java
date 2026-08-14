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

public class GithubOwnerResponse_getLogin_39940933438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15553;

    public GithubOwnerResponse_getLogin_39940933438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15553 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15553, term15553.getClass(), "login", null);
        setField(term15553, term15553.getClass(), "id", null);
        setField(term15553, term15553.getClass(), "nodeId", null);
        setField(term15553, term15553.getClass(), "avatarUrl", null);
        setField(term15553, term15553.getClass(), "gravatarId", null);
        setField(term15553, term15553.getClass(), "url", null);
        setField(term15553, term15553.getClass(), "htmlUrl", null);
        setField(term15553, term15553.getClass(), "followersUrl", null);
        setField(term15553, term15553.getClass(), "followingUrl", null);
        setField(term15553, term15553.getClass(), "gistsUrl", null);
        setField(term15553, term15553.getClass(), "starredUrl", null);
        setField(term15553, term15553.getClass(), "subscriptionsUrl", null);
        setField(term15553, term15553.getClass(), "organizationsUrl", null);
        setField(term15553, term15553.getClass(), "reposUrl", null);
        setField(term15553, term15553.getClass(), "eventsUrl", null);
        setField(term15553, term15553.getClass(), "receivedEventsUrl", null);
        setField(term15553, term15553.getClass(), "type", null);
        setField(term15553, term15553.getClass(), "siteAdmin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term15553, args);
    }

};


