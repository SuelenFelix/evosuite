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

public class GithubOwnerResponse_setFollowingUrl_175685488418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8570;

    public GithubOwnerResponse_setFollowingUrl_175685488418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8583 = new Integer(-1786399638);
        Boolean term8765 = new Boolean(true);
        term8570 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term8570, term8570.getClass(), "login", "mGRiYhnMcR");
        setField(term8570, term8570.getClass(), "id", term8583);
        setField(term8570, term8570.getClass(), "nodeId", "NFlvfJCVPO");
        setField(term8570, term8570.getClass(), "avatarUrl", "KarbTXFmUU");
        setField(term8570, term8570.getClass(), "gravatarId", "jiUSjqwSIQ");
        setField(term8570, term8570.getClass(), "url", "MgLCedQfoj");
        setField(term8570, term8570.getClass(), "htmlUrl", "zgKiINdgNu");
        setField(term8570, term8570.getClass(), "followersUrl", "zLMTXDQHYH");
        setField(term8570, term8570.getClass(), "followingUrl", "PqywFWJlpE");
        setField(term8570, term8570.getClass(), "gistsUrl", "OzXRsFGTIp");
        setField(term8570, term8570.getClass(), "starredUrl", "TjWpyghUWN");
        setField(term8570, term8570.getClass(), "subscriptionsUrl", "dkZFDZxcde");
        setField(term8570, term8570.getClass(), "organizationsUrl", "WXcZEtUKlI");
        setField(term8570, term8570.getClass(), "reposUrl", "IkpjUOuWQU");
        setField(term8570, term8570.getClass(), "eventsUrl", "boSSpezHeU");
        setField(term8570, term8570.getClass(), "receivedEventsUrl", "OUeBWNTQDh");
        setField(term8570, term8570.getClass(), "type", "gltJarNuUk");
        setField(term8570, term8570.getClass(), "siteAdmin", term8765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZwZIDwYcSW";
        callMethod(klass, "setFollowingUrl", argTypes, term8570, args);
    }

};


