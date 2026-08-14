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

public class GithubOwnerResponse_getSiteAdmin_124269258435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14837;

    public GithubOwnerResponse_getSiteAdmin_124269258435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14850 = new Integer(933028652);
        Boolean term15032 = new Boolean(false);
        term14837 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term14837, term14837.getClass(), "login", "qxhOsmyyjm");
        setField(term14837, term14837.getClass(), "id", term14850);
        setField(term14837, term14837.getClass(), "nodeId", "DuKcNfVVYR");
        setField(term14837, term14837.getClass(), "avatarUrl", "fRujHWvXjJ");
        setField(term14837, term14837.getClass(), "gravatarId", "EAIAAStlTz");
        setField(term14837, term14837.getClass(), "url", "yIWXcOQTgy");
        setField(term14837, term14837.getClass(), "htmlUrl", "xAWekqanqc");
        setField(term14837, term14837.getClass(), "followersUrl", "GSOWFHMlbF");
        setField(term14837, term14837.getClass(), "followingUrl", "vpZIqpFbKM");
        setField(term14837, term14837.getClass(), "gistsUrl", "dAbwpJCDif");
        setField(term14837, term14837.getClass(), "starredUrl", "ATSXJPySio");
        setField(term14837, term14837.getClass(), "subscriptionsUrl", "XZkOUcbfFg");
        setField(term14837, term14837.getClass(), "organizationsUrl", "TGiJfagfky");
        setField(term14837, term14837.getClass(), "reposUrl", "BJklinBmhN");
        setField(term14837, term14837.getClass(), "eventsUrl", "IOddzvEWcl");
        setField(term14837, term14837.getClass(), "receivedEventsUrl", "bIrtpkYJWT");
        setField(term14837, term14837.getClass(), "type", "VuLLXpvPpZ");
        setField(term14837, term14837.getClass(), "siteAdmin", term15032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSiteAdmin", argTypes, term14837, args);
    }

};


