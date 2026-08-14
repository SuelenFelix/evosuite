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

public class GithubOwnerResponse_getEventsUrl_142423316129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12629;

    public GithubOwnerResponse_getEventsUrl_142423316129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12642 = new Integer(-2095575670);
        Boolean term12824 = new Boolean(true);
        term12629 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term12629, term12629.getClass(), "login", "WaEcyVlcIx");
        setField(term12629, term12629.getClass(), "id", term12642);
        setField(term12629, term12629.getClass(), "nodeId", "ONcbPCQnHd");
        setField(term12629, term12629.getClass(), "avatarUrl", "AobDaplFLl");
        setField(term12629, term12629.getClass(), "gravatarId", "pDkMNnAGgv");
        setField(term12629, term12629.getClass(), "url", "PaCpFXGzdX");
        setField(term12629, term12629.getClass(), "htmlUrl", "FftYCNbnks");
        setField(term12629, term12629.getClass(), "followersUrl", "lJoltmsadS");
        setField(term12629, term12629.getClass(), "followingUrl", "mvfDtZNEHr");
        setField(term12629, term12629.getClass(), "gistsUrl", "bvSgmFUDOU");
        setField(term12629, term12629.getClass(), "starredUrl", "XMHwbfiHRl");
        setField(term12629, term12629.getClass(), "subscriptionsUrl", "bucTnYicnp");
        setField(term12629, term12629.getClass(), "organizationsUrl", "EkgprvqZlM");
        setField(term12629, term12629.getClass(), "reposUrl", "fbnKvthhOz");
        setField(term12629, term12629.getClass(), "eventsUrl", "PGfCDJTBek");
        setField(term12629, term12629.getClass(), "receivedEventsUrl", "ZwjARhAtHC");
        setField(term12629, term12629.getClass(), "type", "XXvscsYBWv");
        setField(term12629, term12629.getClass(), "siteAdmin", term12824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventsUrl", argTypes, term12629, args);
    }

};


