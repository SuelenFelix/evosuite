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

public class GithubOwnerResponse_getSubscriptionsUrl_199634141423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10421;

    public GithubOwnerResponse_getSubscriptionsUrl_199634141423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10434 = new Integer(-184153539);
        Boolean term10616 = new Boolean(true);
        term10421 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term10421, term10421.getClass(), "login", "bxyfeicqrK");
        setField(term10421, term10421.getClass(), "id", term10434);
        setField(term10421, term10421.getClass(), "nodeId", "vBnWPlsZMk");
        setField(term10421, term10421.getClass(), "avatarUrl", "fIZsWucfXz");
        setField(term10421, term10421.getClass(), "gravatarId", "IApvtmfhnq");
        setField(term10421, term10421.getClass(), "url", "VSaNnhMpRc");
        setField(term10421, term10421.getClass(), "htmlUrl", "QNjNTLlUaV");
        setField(term10421, term10421.getClass(), "followersUrl", "hIYsRyOZxk");
        setField(term10421, term10421.getClass(), "followingUrl", "RjNoEywJbC");
        setField(term10421, term10421.getClass(), "gistsUrl", "RTTvrwwhou");
        setField(term10421, term10421.getClass(), "starredUrl", "lRORwXipuk");
        setField(term10421, term10421.getClass(), "subscriptionsUrl", "fVdTcjgHdw");
        setField(term10421, term10421.getClass(), "organizationsUrl", "wwAwLLcLPp");
        setField(term10421, term10421.getClass(), "reposUrl", "nHpMKOmlpQ");
        setField(term10421, term10421.getClass(), "eventsUrl", "fKhrQsJToZ");
        setField(term10421, term10421.getClass(), "receivedEventsUrl", "wsysQLGFnl");
        setField(term10421, term10421.getClass(), "type", "ckQLZGFjMX");
        setField(term10421, term10421.getClass(), "siteAdmin", term10616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubscriptionsUrl", argTypes, term10421, args);
    }

};


