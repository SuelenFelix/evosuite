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

public class GithubOwnerResponse_setReposUrl_35396913228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12250;

    public GithubOwnerResponse_setReposUrl_35396913228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12263 = new Integer(-1371869594);
        Boolean term12445 = new Boolean(false);
        term12250 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term12250, term12250.getClass(), "login", "tOszriqETr");
        setField(term12250, term12250.getClass(), "id", term12263);
        setField(term12250, term12250.getClass(), "nodeId", "ncSPTkhKjO");
        setField(term12250, term12250.getClass(), "avatarUrl", "jcWKHRWhyj");
        setField(term12250, term12250.getClass(), "gravatarId", "nrQjODRMLD");
        setField(term12250, term12250.getClass(), "url", "PNoWXrsFic");
        setField(term12250, term12250.getClass(), "htmlUrl", "QZBHZqZope");
        setField(term12250, term12250.getClass(), "followersUrl", "VBUahCvyxC");
        setField(term12250, term12250.getClass(), "followingUrl", "MlzTkzKMCX");
        setField(term12250, term12250.getClass(), "gistsUrl", "UqKUbMyPMJ");
        setField(term12250, term12250.getClass(), "starredUrl", "QpYltHAdyY");
        setField(term12250, term12250.getClass(), "subscriptionsUrl", "lbmSGBwIiV");
        setField(term12250, term12250.getClass(), "organizationsUrl", "DAxyHoTLzZ");
        setField(term12250, term12250.getClass(), "reposUrl", "fhZgTouhCC");
        setField(term12250, term12250.getClass(), "eventsUrl", "wrikqJwXvL");
        setField(term12250, term12250.getClass(), "receivedEventsUrl", "UiWhvbypdr");
        setField(term12250, term12250.getClass(), "type", "CgleElJNje");
        setField(term12250, term12250.getClass(), "siteAdmin", term12445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZrchvNGMtd";
        callMethod(klass, "setReposUrl", argTypes, term12250, args);
    }

};


