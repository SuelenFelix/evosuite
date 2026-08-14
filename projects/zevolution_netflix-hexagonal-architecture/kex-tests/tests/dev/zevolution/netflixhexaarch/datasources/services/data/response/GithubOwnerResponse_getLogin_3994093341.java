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

public class GithubOwnerResponse_getLogin_3994093341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2345;

    public GithubOwnerResponse_getLogin_3994093341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2358 = new Integer(1193880199);
        Boolean term2540 = new Boolean(false);
        term2345 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term2345, term2345.getClass(), "login", "AWRooQKkdW");
        setField(term2345, term2345.getClass(), "id", term2358);
        setField(term2345, term2345.getClass(), "nodeId", "vjxIhXHxGR");
        setField(term2345, term2345.getClass(), "avatarUrl", "QXzGXbEXMu");
        setField(term2345, term2345.getClass(), "gravatarId", "qxSDVejjiY");
        setField(term2345, term2345.getClass(), "url", "xBsXSDjXYK");
        setField(term2345, term2345.getClass(), "htmlUrl", "sEnIVFtZuQ");
        setField(term2345, term2345.getClass(), "followersUrl", "ZVecLZMLHF");
        setField(term2345, term2345.getClass(), "followingUrl", "fztQhjqwdP");
        setField(term2345, term2345.getClass(), "gistsUrl", "eVpkWxjuki");
        setField(term2345, term2345.getClass(), "starredUrl", "SJiQaLvSKv");
        setField(term2345, term2345.getClass(), "subscriptionsUrl", "OEXDRUKcFl");
        setField(term2345, term2345.getClass(), "organizationsUrl", "RYdKCNNMBR");
        setField(term2345, term2345.getClass(), "reposUrl", "yGtHPyvYiQ");
        setField(term2345, term2345.getClass(), "eventsUrl", "MvRIxilFMJ");
        setField(term2345, term2345.getClass(), "receivedEventsUrl", "iNwOJRBEjp");
        setField(term2345, term2345.getClass(), "type", "XylxrMBraH");
        setField(term2345, term2345.getClass(), "siteAdmin", term2540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term2345, args);
    }

};


