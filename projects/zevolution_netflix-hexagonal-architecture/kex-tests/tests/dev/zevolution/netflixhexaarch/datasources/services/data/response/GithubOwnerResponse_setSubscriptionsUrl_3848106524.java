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

public class GithubOwnerResponse_setSubscriptionsUrl_3848106524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10778;

    public GithubOwnerResponse_setSubscriptionsUrl_3848106524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10791 = new Integer(493620644);
        Boolean term10973 = new Boolean(true);
        term10778 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term10778, term10778.getClass(), "login", "qphdrqUtNx");
        setField(term10778, term10778.getClass(), "id", term10791);
        setField(term10778, term10778.getClass(), "nodeId", "bwlLFAfNWx");
        setField(term10778, term10778.getClass(), "avatarUrl", "JWodNQzjjV");
        setField(term10778, term10778.getClass(), "gravatarId", "CAgxWjhxNf");
        setField(term10778, term10778.getClass(), "url", "goAoCMhKBu");
        setField(term10778, term10778.getClass(), "htmlUrl", "BWxJSgKHRT");
        setField(term10778, term10778.getClass(), "followersUrl", "AGXoIndFnm");
        setField(term10778, term10778.getClass(), "followingUrl", "mwmFMNEzkK");
        setField(term10778, term10778.getClass(), "gistsUrl", "kVAmKknVln");
        setField(term10778, term10778.getClass(), "starredUrl", "MRFLbEGYKG");
        setField(term10778, term10778.getClass(), "subscriptionsUrl", "BYrGukTyof");
        setField(term10778, term10778.getClass(), "organizationsUrl", "jiCGTTzKGB");
        setField(term10778, term10778.getClass(), "reposUrl", "MqICFYzDJj");
        setField(term10778, term10778.getClass(), "eventsUrl", "YgQvdcBQKw");
        setField(term10778, term10778.getClass(), "receivedEventsUrl", "FiYYLuailz");
        setField(term10778, term10778.getClass(), "type", "XebAeSnCKZ");
        setField(term10778, term10778.getClass(), "siteAdmin", term10973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GeddnXjHGy";
        callMethod(klass, "setSubscriptionsUrl", argTypes, term10778, args);
    }

};


