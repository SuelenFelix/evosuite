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

public class GithubOwnerResponse_getFollowersUrl_67665456715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7477;

    public GithubOwnerResponse_getFollowersUrl_67665456715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7490 = new Integer(-14890619);
        Boolean term7672 = new Boolean(false);
        term7477 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term7477, term7477.getClass(), "login", "TXyHhqeCjR");
        setField(term7477, term7477.getClass(), "id", term7490);
        setField(term7477, term7477.getClass(), "nodeId", "lZIgPZPgTu");
        setField(term7477, term7477.getClass(), "avatarUrl", "iuCxnHGMoW");
        setField(term7477, term7477.getClass(), "gravatarId", "GPSEWEDSTo");
        setField(term7477, term7477.getClass(), "url", "RCOqfVsRHt");
        setField(term7477, term7477.getClass(), "htmlUrl", "TSyCeEZPaT");
        setField(term7477, term7477.getClass(), "followersUrl", "JeZFtaqkzW");
        setField(term7477, term7477.getClass(), "followingUrl", "vOVuNSCCLe");
        setField(term7477, term7477.getClass(), "gistsUrl", "fzeqPnzpnt");
        setField(term7477, term7477.getClass(), "starredUrl", "RxbhrFBjkO");
        setField(term7477, term7477.getClass(), "subscriptionsUrl", "aanyiAOJCl");
        setField(term7477, term7477.getClass(), "organizationsUrl", "VDokbsCuqq");
        setField(term7477, term7477.getClass(), "reposUrl", "xClUIcPECX");
        setField(term7477, term7477.getClass(), "eventsUrl", "avhRaGZaBF");
        setField(term7477, term7477.getClass(), "receivedEventsUrl", "JkgoRtImdE");
        setField(term7477, term7477.getClass(), "type", "qFGKIJjlmV");
        setField(term7477, term7477.getClass(), "siteAdmin", term7672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowersUrl", argTypes, term7477, args);
    }

};


