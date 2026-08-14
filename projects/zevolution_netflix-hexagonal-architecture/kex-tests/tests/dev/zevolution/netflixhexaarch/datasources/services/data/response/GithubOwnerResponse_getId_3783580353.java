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

public class GithubOwnerResponse_getId_3783580353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3081;

    public GithubOwnerResponse_getId_3783580353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3094 = new Integer(-1530420153);
        Boolean term3276 = new Boolean(false);
        term3081 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term3081, term3081.getClass(), "login", "fWKJoSoCwE");
        setField(term3081, term3081.getClass(), "id", term3094);
        setField(term3081, term3081.getClass(), "nodeId", "wfaXBpWAUH");
        setField(term3081, term3081.getClass(), "avatarUrl", "VMeAzAHwZj");
        setField(term3081, term3081.getClass(), "gravatarId", "PznxWXsZME");
        setField(term3081, term3081.getClass(), "url", "ZzIujlwVsw");
        setField(term3081, term3081.getClass(), "htmlUrl", "LWyEaeIyAo");
        setField(term3081, term3081.getClass(), "followersUrl", "yVMkkQhvmN");
        setField(term3081, term3081.getClass(), "followingUrl", "mvrkADEgpp");
        setField(term3081, term3081.getClass(), "gistsUrl", "pXOkjyeIRb");
        setField(term3081, term3081.getClass(), "starredUrl", "GgZWSjxjyE");
        setField(term3081, term3081.getClass(), "subscriptionsUrl", "EeBVbzjcCI");
        setField(term3081, term3081.getClass(), "organizationsUrl", "UfQtPRyWRC");
        setField(term3081, term3081.getClass(), "reposUrl", "FPvxVzzSvD");
        setField(term3081, term3081.getClass(), "eventsUrl", "WHcwFgsGFC");
        setField(term3081, term3081.getClass(), "receivedEventsUrl", "HzqpegHiRq");
        setField(term3081, term3081.getClass(), "type", "jwsfVjMoJT");
        setField(term3081, term3081.getClass(), "siteAdmin", term3276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3081, args);
    }

};


