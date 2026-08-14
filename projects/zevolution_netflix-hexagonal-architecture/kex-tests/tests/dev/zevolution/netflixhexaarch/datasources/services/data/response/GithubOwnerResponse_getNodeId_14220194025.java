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

public class GithubOwnerResponse_getNodeId_14220194025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3797;

    public GithubOwnerResponse_getNodeId_14220194025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3810 = new Integer(679763016);
        Boolean term3992 = new Boolean(true);
        term3797 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term3797, term3797.getClass(), "login", "XYtryyobou");
        setField(term3797, term3797.getClass(), "id", term3810);
        setField(term3797, term3797.getClass(), "nodeId", "OYbzXylRWW");
        setField(term3797, term3797.getClass(), "avatarUrl", "DSNsTGYXDF");
        setField(term3797, term3797.getClass(), "gravatarId", "sQvGcVjdEx");
        setField(term3797, term3797.getClass(), "url", "rLHAoqXgPh");
        setField(term3797, term3797.getClass(), "htmlUrl", "zUlRdimJtU");
        setField(term3797, term3797.getClass(), "followersUrl", "vwbEQQNQrx");
        setField(term3797, term3797.getClass(), "followingUrl", "xtftXXMbem");
        setField(term3797, term3797.getClass(), "gistsUrl", "cudZvLMQon");
        setField(term3797, term3797.getClass(), "starredUrl", "lihXWlGDxk");
        setField(term3797, term3797.getClass(), "subscriptionsUrl", "JmcmxoGhIK");
        setField(term3797, term3797.getClass(), "organizationsUrl", "jXzmYyrnnT");
        setField(term3797, term3797.getClass(), "reposUrl", "igCAtimmYB");
        setField(term3797, term3797.getClass(), "eventsUrl", "DyiXbeYIaN");
        setField(term3797, term3797.getClass(), "receivedEventsUrl", "VGizxZnyHX");
        setField(term3797, term3797.getClass(), "type", "kVEZMHmRtR");
        setField(term3797, term3797.getClass(), "siteAdmin", term3992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeId", argTypes, term3797, args);
    }

};


