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
import java.lang.Integer;
import java.lang.Boolean;

public class GithubOwnerResponse_getFollowingUrl_54063592517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8213;

    public GithubOwnerResponse_getFollowingUrl_54063592517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8226 = new Integer(454281060);
        Boolean term8408 = new Boolean(true);
        term8213 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term8213, term8213.getClass(), "login", "eOJfbiZLnb");
        setField(term8213, term8213.getClass(), "id", term8226);
        setField(term8213, term8213.getClass(), "nodeId", "nKZKnxWYCK");
        setField(term8213, term8213.getClass(), "avatarUrl", "JOqQxuzRuZ");
        setField(term8213, term8213.getClass(), "gravatarId", "RSaoipUlsg");
        setField(term8213, term8213.getClass(), "url", "cSHGbqKqlN");
        setField(term8213, term8213.getClass(), "htmlUrl", "pFAfANnxup");
        setField(term8213, term8213.getClass(), "followersUrl", "FbSIUZyBXZ");
        setField(term8213, term8213.getClass(), "followingUrl", "mhQDwIyrRi");
        setField(term8213, term8213.getClass(), "gistsUrl", "HpZXWDPhlg");
        setField(term8213, term8213.getClass(), "starredUrl", "lBOokzEPfe");
        setField(term8213, term8213.getClass(), "subscriptionsUrl", "dtGZCsKXbW");
        setField(term8213, term8213.getClass(), "organizationsUrl", "bdyhHbDAmJ");
        setField(term8213, term8213.getClass(), "reposUrl", "BBXiTNHqGE");
        setField(term8213, term8213.getClass(), "eventsUrl", "IEYhJmgCVd");
        setField(term8213, term8213.getClass(), "receivedEventsUrl", "KSJeYkkvpk");
        setField(term8213, term8213.getClass(), "type", "qUtkFGMNUV");
        setField(term8213, term8213.getClass(), "siteAdmin", term8408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowingUrl", argTypes, term8213, args);
    }

};


