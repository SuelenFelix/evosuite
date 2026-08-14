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

public class GithubOwnerResponse_getReceivedEventsUrl_22059556231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13365;

    public GithubOwnerResponse_getReceivedEventsUrl_22059556231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13378 = new Integer(1324040357);
        Boolean term13560 = new Boolean(true);
        term13365 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term13365, term13365.getClass(), "login", "FvUCZgTXhq");
        setField(term13365, term13365.getClass(), "id", term13378);
        setField(term13365, term13365.getClass(), "nodeId", "wWWidPCHzx");
        setField(term13365, term13365.getClass(), "avatarUrl", "OwPIiBRuKK");
        setField(term13365, term13365.getClass(), "gravatarId", "sgfGySMODT");
        setField(term13365, term13365.getClass(), "url", "ndAITnOsny");
        setField(term13365, term13365.getClass(), "htmlUrl", "CVZnTiJucs");
        setField(term13365, term13365.getClass(), "followersUrl", "ecHEQufXoq");
        setField(term13365, term13365.getClass(), "followingUrl", "btBLMvHzJg");
        setField(term13365, term13365.getClass(), "gistsUrl", "JdOMfNWgLP");
        setField(term13365, term13365.getClass(), "starredUrl", "uWqXrwAsDU");
        setField(term13365, term13365.getClass(), "subscriptionsUrl", "hgFbWAUtsu");
        setField(term13365, term13365.getClass(), "organizationsUrl", "HqoTWlkbwF");
        setField(term13365, term13365.getClass(), "reposUrl", "CwNELDTAPP");
        setField(term13365, term13365.getClass(), "eventsUrl", "GSzQdbHLHw");
        setField(term13365, term13365.getClass(), "receivedEventsUrl", "IkfarsYNJO");
        setField(term13365, term13365.getClass(), "type", "aZKOWhHMEh");
        setField(term13365, term13365.getClass(), "siteAdmin", term13560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReceivedEventsUrl", argTypes, term13365, args);
    }

};


