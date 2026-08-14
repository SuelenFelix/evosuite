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

public class GithubOwnerResponse_setFollowersUrl_53956439216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7834;

    public GithubOwnerResponse_setFollowersUrl_53956439216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7847 = new Integer(1632125673);
        Boolean term8029 = new Boolean(false);
        term7834 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term7834, term7834.getClass(), "login", "IHqvyhMtuM");
        setField(term7834, term7834.getClass(), "id", term7847);
        setField(term7834, term7834.getClass(), "nodeId", "dAldIGYAXV");
        setField(term7834, term7834.getClass(), "avatarUrl", "mLwibAPEsa");
        setField(term7834, term7834.getClass(), "gravatarId", "zsWKWiTFuo");
        setField(term7834, term7834.getClass(), "url", "UPUbwyHQKN");
        setField(term7834, term7834.getClass(), "htmlUrl", "lgQkrXANyI");
        setField(term7834, term7834.getClass(), "followersUrl", "MeTmRZXErV");
        setField(term7834, term7834.getClass(), "followingUrl", "jNxbVmoZgq");
        setField(term7834, term7834.getClass(), "gistsUrl", "PvmBHIXaMY");
        setField(term7834, term7834.getClass(), "starredUrl", "hulYxtowxw");
        setField(term7834, term7834.getClass(), "subscriptionsUrl", "GNEmuHPNcU");
        setField(term7834, term7834.getClass(), "organizationsUrl", "IoSfuKDFRe");
        setField(term7834, term7834.getClass(), "reposUrl", "AWYyZiNfsm");
        setField(term7834, term7834.getClass(), "eventsUrl", "ITRRYiuDwH");
        setField(term7834, term7834.getClass(), "receivedEventsUrl", "llRfwANcVF");
        setField(term7834, term7834.getClass(), "type", "sUEeHQTWkA");
        setField(term7834, term7834.getClass(), "siteAdmin", term8029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BDIRCxAWLA";
        callMethod(klass, "setFollowersUrl", argTypes, term7834, args);
    }

};


