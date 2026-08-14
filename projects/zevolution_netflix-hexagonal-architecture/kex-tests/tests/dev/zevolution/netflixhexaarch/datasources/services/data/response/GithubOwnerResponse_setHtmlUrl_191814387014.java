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

public class GithubOwnerResponse_setHtmlUrl_191814387014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7098;

    public GithubOwnerResponse_setHtmlUrl_191814387014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7111 = new Integer(579005622);
        Boolean term7293 = new Boolean(true);
        term7098 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term7098, term7098.getClass(), "login", "zNFLXMifnS");
        setField(term7098, term7098.getClass(), "id", term7111);
        setField(term7098, term7098.getClass(), "nodeId", "HHQcYMSBVc");
        setField(term7098, term7098.getClass(), "avatarUrl", "wdoqITnaAP");
        setField(term7098, term7098.getClass(), "gravatarId", "rIPMBcrNqB");
        setField(term7098, term7098.getClass(), "url", "UDaboHZHhz");
        setField(term7098, term7098.getClass(), "htmlUrl", "nRvKihUSPj");
        setField(term7098, term7098.getClass(), "followersUrl", "BbNeQJpYPr");
        setField(term7098, term7098.getClass(), "followingUrl", "riMtzCoxNj");
        setField(term7098, term7098.getClass(), "gistsUrl", "YAXkVjQZcV");
        setField(term7098, term7098.getClass(), "starredUrl", "pumvwBWvpy");
        setField(term7098, term7098.getClass(), "subscriptionsUrl", "HwLHeGLyhe");
        setField(term7098, term7098.getClass(), "organizationsUrl", "RDnkgWkcbz");
        setField(term7098, term7098.getClass(), "reposUrl", "IBpaxltauX");
        setField(term7098, term7098.getClass(), "eventsUrl", "hePqROaplw");
        setField(term7098, term7098.getClass(), "receivedEventsUrl", "PJcSNDruWd");
        setField(term7098, term7098.getClass(), "type", "VVNNlAePXF");
        setField(term7098, term7098.getClass(), "siteAdmin", term7293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jnwVnmKAFv";
        callMethod(klass, "setHtmlUrl", argTypes, term7098, args);
    }

};


