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

public class GithubOwnerResponse_setReceivedEventsUrl_81646660732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13722;

    public GithubOwnerResponse_setReceivedEventsUrl_81646660732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13735 = new Integer(-1588772968);
        Boolean term13917 = new Boolean(true);
        term13722 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term13722, term13722.getClass(), "login", "YfkhviKZwl");
        setField(term13722, term13722.getClass(), "id", term13735);
        setField(term13722, term13722.getClass(), "nodeId", "DcOhhAfJTI");
        setField(term13722, term13722.getClass(), "avatarUrl", "gYTIkBFOoS");
        setField(term13722, term13722.getClass(), "gravatarId", "xmzSoVgiED");
        setField(term13722, term13722.getClass(), "url", "pdSvedKgPq");
        setField(term13722, term13722.getClass(), "htmlUrl", "epPTwvcoyb");
        setField(term13722, term13722.getClass(), "followersUrl", "UBPHmOICBs");
        setField(term13722, term13722.getClass(), "followingUrl", "IDJUVPgUJf");
        setField(term13722, term13722.getClass(), "gistsUrl", "JmnWRJUxGr");
        setField(term13722, term13722.getClass(), "starredUrl", "wgRGBNrTGP");
        setField(term13722, term13722.getClass(), "subscriptionsUrl", "FIdNVptZpW");
        setField(term13722, term13722.getClass(), "organizationsUrl", "rQjxAhisjm");
        setField(term13722, term13722.getClass(), "reposUrl", "ZDhASPHjDG");
        setField(term13722, term13722.getClass(), "eventsUrl", "HNVOAXYNEZ");
        setField(term13722, term13722.getClass(), "receivedEventsUrl", "gbbYBYyfvr");
        setField(term13722, term13722.getClass(), "type", "SrWMUlbtWV");
        setField(term13722, term13722.getClass(), "siteAdmin", term13917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VePIumgrrU";
        callMethod(klass, "setReceivedEventsUrl", argTypes, term13722, args);
    }

};


