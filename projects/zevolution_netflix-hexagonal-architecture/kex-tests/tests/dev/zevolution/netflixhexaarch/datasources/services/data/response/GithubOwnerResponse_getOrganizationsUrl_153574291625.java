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

public class GithubOwnerResponse_getOrganizationsUrl_153574291625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11157;

    public GithubOwnerResponse_getOrganizationsUrl_153574291625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11170 = new Integer(1328271830);
        Boolean term11352 = new Boolean(true);
        term11157 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term11157, term11157.getClass(), "login", "vLTbaoAxBm");
        setField(term11157, term11157.getClass(), "id", term11170);
        setField(term11157, term11157.getClass(), "nodeId", "BXTjEyEZxD");
        setField(term11157, term11157.getClass(), "avatarUrl", "oKhVzOKUFW");
        setField(term11157, term11157.getClass(), "gravatarId", "mNHyqmOAFy");
        setField(term11157, term11157.getClass(), "url", "UxgSdhxPCH");
        setField(term11157, term11157.getClass(), "htmlUrl", "DAujxZPHJC");
        setField(term11157, term11157.getClass(), "followersUrl", "IlBhdrCvHq");
        setField(term11157, term11157.getClass(), "followingUrl", "OirVUQhauU");
        setField(term11157, term11157.getClass(), "gistsUrl", "GLbyDfbNZI");
        setField(term11157, term11157.getClass(), "starredUrl", "oNLcCYDAsO");
        setField(term11157, term11157.getClass(), "subscriptionsUrl", "CNqMxLvtcJ");
        setField(term11157, term11157.getClass(), "organizationsUrl", "ktbqerIaKW");
        setField(term11157, term11157.getClass(), "reposUrl", "VoghngXfsK");
        setField(term11157, term11157.getClass(), "eventsUrl", "GbahCBMvct");
        setField(term11157, term11157.getClass(), "receivedEventsUrl", "iiHBhsNFgk");
        setField(term11157, term11157.getClass(), "type", "HknsTajwxJ");
        setField(term11157, term11157.getClass(), "siteAdmin", term11352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizationsUrl", argTypes, term11157, args);
    }

};


