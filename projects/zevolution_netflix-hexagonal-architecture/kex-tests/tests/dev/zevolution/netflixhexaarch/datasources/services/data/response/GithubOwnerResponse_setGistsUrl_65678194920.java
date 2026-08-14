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

public class GithubOwnerResponse_setGistsUrl_65678194920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9306;

    public GithubOwnerResponse_setGistsUrl_65678194920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9319 = new Integer(-1048298087);
        Boolean term9501 = new Boolean(false);
        term9306 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term9306, term9306.getClass(), "login", "cdHYQDgUZR");
        setField(term9306, term9306.getClass(), "id", term9319);
        setField(term9306, term9306.getClass(), "nodeId", "KAORSSPSeV");
        setField(term9306, term9306.getClass(), "avatarUrl", "UimMMORkzd");
        setField(term9306, term9306.getClass(), "gravatarId", "huVIXUWLtI");
        setField(term9306, term9306.getClass(), "url", "vhKzFyKPOT");
        setField(term9306, term9306.getClass(), "htmlUrl", "nQhIgWXdRc");
        setField(term9306, term9306.getClass(), "followersUrl", "EusenEbIoF");
        setField(term9306, term9306.getClass(), "followingUrl", "SScVQYSvWH");
        setField(term9306, term9306.getClass(), "gistsUrl", "MnovcqFhCl");
        setField(term9306, term9306.getClass(), "starredUrl", "qYtAeLzOhW");
        setField(term9306, term9306.getClass(), "subscriptionsUrl", "tJzmOfcUnY");
        setField(term9306, term9306.getClass(), "organizationsUrl", "TKlccZUpjz");
        setField(term9306, term9306.getClass(), "reposUrl", "GGzwMoHZXC");
        setField(term9306, term9306.getClass(), "eventsUrl", "IpmgwHTgnG");
        setField(term9306, term9306.getClass(), "receivedEventsUrl", "tIpkeYIezR");
        setField(term9306, term9306.getClass(), "type", "YkZtEtthvz");
        setField(term9306, term9306.getClass(), "siteAdmin", term9501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dwlZSxlXOo";
        callMethod(klass, "setGistsUrl", argTypes, term9306, args);
    }

};


