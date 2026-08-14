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

public class GithubOwnerResponse_setLogin_12613297632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2702;

    public GithubOwnerResponse_setLogin_12613297632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2715 = new Integer(-1087774327);
        Boolean term2897 = new Boolean(false);
        term2702 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term2702, term2702.getClass(), "login", "pORebkoRdD");
        setField(term2702, term2702.getClass(), "id", term2715);
        setField(term2702, term2702.getClass(), "nodeId", "mXGCWJDOqA");
        setField(term2702, term2702.getClass(), "avatarUrl", "dpNsDgfPso");
        setField(term2702, term2702.getClass(), "gravatarId", "hCWPJQKpdc");
        setField(term2702, term2702.getClass(), "url", "WzMEhMXkKx");
        setField(term2702, term2702.getClass(), "htmlUrl", "XOiDvlDhdc");
        setField(term2702, term2702.getClass(), "followersUrl", "AdxvLJhNLe");
        setField(term2702, term2702.getClass(), "followingUrl", "lHfTrWKMPk");
        setField(term2702, term2702.getClass(), "gistsUrl", "JDaAnsVTGV");
        setField(term2702, term2702.getClass(), "starredUrl", "mLUZFTfjle");
        setField(term2702, term2702.getClass(), "subscriptionsUrl", "xIeFjkHkOe");
        setField(term2702, term2702.getClass(), "organizationsUrl", "SdCKLMIYnX");
        setField(term2702, term2702.getClass(), "reposUrl", "OJJtVNPyKZ");
        setField(term2702, term2702.getClass(), "eventsUrl", "AKNapTAfmD");
        setField(term2702, term2702.getClass(), "receivedEventsUrl", "xJgPlLxpgC");
        setField(term2702, term2702.getClass(), "type", "EYtfuJaxiM");
        setField(term2702, term2702.getClass(), "siteAdmin", term2897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCWtLVKVVe";
        callMethod(klass, "setLogin", argTypes, term2702, args);
    }

};


