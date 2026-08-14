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

public class GithubOwnerResponse_getHtmlUrl_64521738113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6741;

    public GithubOwnerResponse_getHtmlUrl_64521738113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6754 = new Integer(-1968847291);
        Boolean term6936 = new Boolean(false);
        term6741 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term6741, term6741.getClass(), "login", "PXdVZyoJyC");
        setField(term6741, term6741.getClass(), "id", term6754);
        setField(term6741, term6741.getClass(), "nodeId", "vLerpqavFM");
        setField(term6741, term6741.getClass(), "avatarUrl", "qnvxzwuGKX");
        setField(term6741, term6741.getClass(), "gravatarId", "EdPAvpluZg");
        setField(term6741, term6741.getClass(), "url", "DzHVBMqWtE");
        setField(term6741, term6741.getClass(), "htmlUrl", "THZSpzBRYP");
        setField(term6741, term6741.getClass(), "followersUrl", "ZfBIVGBQOE");
        setField(term6741, term6741.getClass(), "followingUrl", "QSrDQfEsTR");
        setField(term6741, term6741.getClass(), "gistsUrl", "PsqusYmejD");
        setField(term6741, term6741.getClass(), "starredUrl", "NTWMiBEaDF");
        setField(term6741, term6741.getClass(), "subscriptionsUrl", "SPBstwKFVr");
        setField(term6741, term6741.getClass(), "organizationsUrl", "WxYUTuqmIq");
        setField(term6741, term6741.getClass(), "reposUrl", "OeQLvhVERT");
        setField(term6741, term6741.getClass(), "eventsUrl", "IlvgFINwIa");
        setField(term6741, term6741.getClass(), "receivedEventsUrl", "GEJABPlHSI");
        setField(term6741, term6741.getClass(), "type", "aQFUvuaYxd");
        setField(term6741, term6741.getClass(), "siteAdmin", term6936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlUrl", argTypes, term6741, args);
    }

};


