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

public class GithubOwnerResponse_setEventsUrl_82293179230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12986;

    public GithubOwnerResponse_setEventsUrl_82293179230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12999 = new Integer(1225272962);
        Boolean term13181 = new Boolean(true);
        term12986 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term12986, term12986.getClass(), "login", "uePedtiAfL");
        setField(term12986, term12986.getClass(), "id", term12999);
        setField(term12986, term12986.getClass(), "nodeId", "AdSHvysxQB");
        setField(term12986, term12986.getClass(), "avatarUrl", "jlraKkBWFA");
        setField(term12986, term12986.getClass(), "gravatarId", "mRBtFTxVdE");
        setField(term12986, term12986.getClass(), "url", "IVacFDAZcj");
        setField(term12986, term12986.getClass(), "htmlUrl", "EEYmuwyVDP");
        setField(term12986, term12986.getClass(), "followersUrl", "EWFbEDAVrE");
        setField(term12986, term12986.getClass(), "followingUrl", "EMiMtYgfvr");
        setField(term12986, term12986.getClass(), "gistsUrl", "OyYyYYnJuF");
        setField(term12986, term12986.getClass(), "starredUrl", "aYLvcxZohT");
        setField(term12986, term12986.getClass(), "subscriptionsUrl", "mnHyQbMyld");
        setField(term12986, term12986.getClass(), "organizationsUrl", "KHtaDOIcJZ");
        setField(term12986, term12986.getClass(), "reposUrl", "vgdwrCZczl");
        setField(term12986, term12986.getClass(), "eventsUrl", "gKMNrpKBpu");
        setField(term12986, term12986.getClass(), "receivedEventsUrl", "ZbHJVEqcoa");
        setField(term12986, term12986.getClass(), "type", "awDQVEVIKi");
        setField(term12986, term12986.getClass(), "siteAdmin", term13181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "setEventsUrl", argTypes, term12986, args);
    }

};


