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

public class GithubOwnerResponse_getStarredUrl_124661778921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9685;

    public GithubOwnerResponse_getStarredUrl_124661778921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9698 = new Integer(292681826);
        Boolean term9880 = new Boolean(true);
        term9685 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term9685, term9685.getClass(), "login", "lKrEAkypza");
        setField(term9685, term9685.getClass(), "id", term9698);
        setField(term9685, term9685.getClass(), "nodeId", "KtuuNAqGCQ");
        setField(term9685, term9685.getClass(), "avatarUrl", "OGQsfjmReM");
        setField(term9685, term9685.getClass(), "gravatarId", "YsUtbngnRO");
        setField(term9685, term9685.getClass(), "url", "JisaWUxcNb");
        setField(term9685, term9685.getClass(), "htmlUrl", "NxgmYPzWCI");
        setField(term9685, term9685.getClass(), "followersUrl", "SqjyKmayBx");
        setField(term9685, term9685.getClass(), "followingUrl", "XjDhvToxJy");
        setField(term9685, term9685.getClass(), "gistsUrl", "nxSTJflLQy");
        setField(term9685, term9685.getClass(), "starredUrl", "FlHzxEfFzI");
        setField(term9685, term9685.getClass(), "subscriptionsUrl", "aSATgQUpoe");
        setField(term9685, term9685.getClass(), "organizationsUrl", "VkPSXewZfB");
        setField(term9685, term9685.getClass(), "reposUrl", "ubodzJoMGW");
        setField(term9685, term9685.getClass(), "eventsUrl", "weddIktxOA");
        setField(term9685, term9685.getClass(), "receivedEventsUrl", "uSlMeISsDD");
        setField(term9685, term9685.getClass(), "type", "WdCiTDUKqn");
        setField(term9685, term9685.getClass(), "siteAdmin", term9880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarredUrl", argTypes, term9685, args);
    }

};


