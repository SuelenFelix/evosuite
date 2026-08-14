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

public class GithubOwnerResponse_setType_143208583234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14458;

    public GithubOwnerResponse_setType_143208583234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14471 = new Integer(-112921587);
        Boolean term14653 = new Boolean(true);
        term14458 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term14458, term14458.getClass(), "login", "ZWcOCwKNvd");
        setField(term14458, term14458.getClass(), "id", term14471);
        setField(term14458, term14458.getClass(), "nodeId", "GTmoNrziyc");
        setField(term14458, term14458.getClass(), "avatarUrl", "LvztehSlhM");
        setField(term14458, term14458.getClass(), "gravatarId", "njvnWFTMxN");
        setField(term14458, term14458.getClass(), "url", "fLRqcTSfzF");
        setField(term14458, term14458.getClass(), "htmlUrl", "EBYHwsuWAU");
        setField(term14458, term14458.getClass(), "followersUrl", "PtIjKpiSix");
        setField(term14458, term14458.getClass(), "followingUrl", "NZdTuwSCIM");
        setField(term14458, term14458.getClass(), "gistsUrl", "dDHcmzPAmP");
        setField(term14458, term14458.getClass(), "starredUrl", "HEaTkWYBgv");
        setField(term14458, term14458.getClass(), "subscriptionsUrl", "MpJsPKLTIU");
        setField(term14458, term14458.getClass(), "organizationsUrl", "IiNCZfdouL");
        setField(term14458, term14458.getClass(), "reposUrl", "AhOHzCsHKW");
        setField(term14458, term14458.getClass(), "eventsUrl", "UqgLPaaAHi");
        setField(term14458, term14458.getClass(), "receivedEventsUrl", "xypryEkUPF");
        setField(term14458, term14458.getClass(), "type", "zyZTzHNjQr");
        setField(term14458, term14458.getClass(), "siteAdmin", term14653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YSrFKQQwXE";
        callMethod(klass, "setType", argTypes, term14458, args);
    }

};


