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

public class GithubOwnerResponse_setAvatarUrl_2162834088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4890;

    public GithubOwnerResponse_setAvatarUrl_2162834088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4903 = new Integer(-602026508);
        Boolean term5085 = new Boolean(true);
        term4890 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term4890, term4890.getClass(), "login", "zcorEihhLK");
        setField(term4890, term4890.getClass(), "id", term4903);
        setField(term4890, term4890.getClass(), "nodeId", "GrqozDKFOk");
        setField(term4890, term4890.getClass(), "avatarUrl", "CFyoseFGLF");
        setField(term4890, term4890.getClass(), "gravatarId", "SFqCrhEWLm");
        setField(term4890, term4890.getClass(), "url", "GZdcJyZntS");
        setField(term4890, term4890.getClass(), "htmlUrl", "OIHoJeysUi");
        setField(term4890, term4890.getClass(), "followersUrl", "WXMWFDGcLB");
        setField(term4890, term4890.getClass(), "followingUrl", "wKWbJssZuG");
        setField(term4890, term4890.getClass(), "gistsUrl", "NzBMMhkhpT");
        setField(term4890, term4890.getClass(), "starredUrl", "qCpEbQDHdF");
        setField(term4890, term4890.getClass(), "subscriptionsUrl", "AHbZyFOmlo");
        setField(term4890, term4890.getClass(), "organizationsUrl", "TwfWVQGiIj");
        setField(term4890, term4890.getClass(), "reposUrl", "gUvcueTURF");
        setField(term4890, term4890.getClass(), "eventsUrl", "EwQBhZjCIT");
        setField(term4890, term4890.getClass(), "receivedEventsUrl", "aSkmSwTnEw");
        setField(term4890, term4890.getClass(), "type", "xvkbvaEGYd");
        setField(term4890, term4890.getClass(), "siteAdmin", term5085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HBGNxdNURv";
        callMethod(klass, "setAvatarUrl", argTypes, term4890, args);
    }

};


