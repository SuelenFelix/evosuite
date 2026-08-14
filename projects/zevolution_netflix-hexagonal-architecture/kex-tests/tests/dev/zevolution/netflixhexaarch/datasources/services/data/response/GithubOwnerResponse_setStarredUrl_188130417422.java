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

public class GithubOwnerResponse_setStarredUrl_188130417422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10042;

    public GithubOwnerResponse_setStarredUrl_188130417422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10055 = new Integer(458147407);
        Boolean term10237 = new Boolean(true);
        term10042 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term10042, term10042.getClass(), "login", "PSizQDoxxe");
        setField(term10042, term10042.getClass(), "id", term10055);
        setField(term10042, term10042.getClass(), "nodeId", "mKaHyMybrK");
        setField(term10042, term10042.getClass(), "avatarUrl", "AyrEXuGrEj");
        setField(term10042, term10042.getClass(), "gravatarId", "yevIIoVYHq");
        setField(term10042, term10042.getClass(), "url", "UuYWMTqWTV");
        setField(term10042, term10042.getClass(), "htmlUrl", "DSFGlcaXUb");
        setField(term10042, term10042.getClass(), "followersUrl", "sHMXNUzNeM");
        setField(term10042, term10042.getClass(), "followingUrl", "gPzGDOEPPw");
        setField(term10042, term10042.getClass(), "gistsUrl", "rwKoAngzCu");
        setField(term10042, term10042.getClass(), "starredUrl", "VUkRVwROTl");
        setField(term10042, term10042.getClass(), "subscriptionsUrl", "UDlkdccCRn");
        setField(term10042, term10042.getClass(), "organizationsUrl", "McpzErOcYb");
        setField(term10042, term10042.getClass(), "reposUrl", "jqrVEUvYEz");
        setField(term10042, term10042.getClass(), "eventsUrl", "QITgiBrmfj");
        setField(term10042, term10042.getClass(), "receivedEventsUrl", "pXxkiXgQnq");
        setField(term10042, term10042.getClass(), "type", "tKmrUDURku");
        setField(term10042, term10042.getClass(), "siteAdmin", term10237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JeZbrwZmsP";
        callMethod(klass, "setStarredUrl", argTypes, term10042, args);
    }

};


