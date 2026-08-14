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

public class GithubOwnerResponse_getType_94140261733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14101;

    public GithubOwnerResponse_getType_94140261733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14114 = new Integer(-93135961);
        Boolean term14296 = new Boolean(true);
        term14101 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term14101, term14101.getClass(), "login", "DPwIqlszZo");
        setField(term14101, term14101.getClass(), "id", term14114);
        setField(term14101, term14101.getClass(), "nodeId", "mNgDshwZNc");
        setField(term14101, term14101.getClass(), "avatarUrl", "pDqgDbJoFw");
        setField(term14101, term14101.getClass(), "gravatarId", "iVOvTzOxwt");
        setField(term14101, term14101.getClass(), "url", "BjZQdecXvB");
        setField(term14101, term14101.getClass(), "htmlUrl", "iUkOOQhEkw");
        setField(term14101, term14101.getClass(), "followersUrl", "wmVoFoUVmU");
        setField(term14101, term14101.getClass(), "followingUrl", "lLiSiPCciB");
        setField(term14101, term14101.getClass(), "gistsUrl", "PsMKIIEwdR");
        setField(term14101, term14101.getClass(), "starredUrl", "RbQmXqfXAT");
        setField(term14101, term14101.getClass(), "subscriptionsUrl", "fcCAsvfBbe");
        setField(term14101, term14101.getClass(), "organizationsUrl", "mUNcKUxghj");
        setField(term14101, term14101.getClass(), "reposUrl", "lnvLKbtveE");
        setField(term14101, term14101.getClass(), "eventsUrl", "FfrrEhTHzQ");
        setField(term14101, term14101.getClass(), "receivedEventsUrl", "LXnDNrMsqT");
        setField(term14101, term14101.getClass(), "type", "ZLQamJFBmu");
        setField(term14101, term14101.getClass(), "siteAdmin", term14296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term14101, args);
    }

};


