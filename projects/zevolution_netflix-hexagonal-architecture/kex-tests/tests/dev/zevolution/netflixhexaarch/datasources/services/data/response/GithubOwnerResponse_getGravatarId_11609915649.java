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

public class GithubOwnerResponse_getGravatarId_11609915649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5269;

    public GithubOwnerResponse_getGravatarId_11609915649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5282 = new Integer(-157887805);
        Boolean term5464 = new Boolean(false);
        term5269 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term5269, term5269.getClass(), "login", "mfCpTPPQQm");
        setField(term5269, term5269.getClass(), "id", term5282);
        setField(term5269, term5269.getClass(), "nodeId", "OcJCIDNIXA");
        setField(term5269, term5269.getClass(), "avatarUrl", "XfRABIFVEp");
        setField(term5269, term5269.getClass(), "gravatarId", "MHGKyEnwKc");
        setField(term5269, term5269.getClass(), "url", "ShIELyuULw");
        setField(term5269, term5269.getClass(), "htmlUrl", "IpQuOGMgmj");
        setField(term5269, term5269.getClass(), "followersUrl", "pJbnHTYrxn");
        setField(term5269, term5269.getClass(), "followingUrl", "iIRsCSYqXH");
        setField(term5269, term5269.getClass(), "gistsUrl", "nghfqDXyCG");
        setField(term5269, term5269.getClass(), "starredUrl", "WBAOTqErtm");
        setField(term5269, term5269.getClass(), "subscriptionsUrl", "PqtVXXZMqK");
        setField(term5269, term5269.getClass(), "organizationsUrl", "rYbtIDVdnd");
        setField(term5269, term5269.getClass(), "reposUrl", "UKAReurpHG");
        setField(term5269, term5269.getClass(), "eventsUrl", "WVRMUmrljA");
        setField(term5269, term5269.getClass(), "receivedEventsUrl", "NTlKJDDWlk");
        setField(term5269, term5269.getClass(), "type", "vOuMEpOQAg");
        setField(term5269, term5269.getClass(), "siteAdmin", term5464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGravatarId", argTypes, term5269, args);
    }

};


