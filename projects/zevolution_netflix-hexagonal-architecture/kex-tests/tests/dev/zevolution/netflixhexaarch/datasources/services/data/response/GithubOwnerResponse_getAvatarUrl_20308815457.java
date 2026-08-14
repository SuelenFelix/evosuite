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

public class GithubOwnerResponse_getAvatarUrl_20308815457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4533;

    public GithubOwnerResponse_getAvatarUrl_20308815457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4546 = new Integer(767834723);
        Boolean term4728 = new Boolean(true);
        term4533 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term4533, term4533.getClass(), "login", "iikZEapDlu");
        setField(term4533, term4533.getClass(), "id", term4546);
        setField(term4533, term4533.getClass(), "nodeId", "nhoHrZfnIN");
        setField(term4533, term4533.getClass(), "avatarUrl", "ZkMALXpEAZ");
        setField(term4533, term4533.getClass(), "gravatarId", "tXfQjSqDzN");
        setField(term4533, term4533.getClass(), "url", "BjugTaMcxJ");
        setField(term4533, term4533.getClass(), "htmlUrl", "vGiuZVPJNH");
        setField(term4533, term4533.getClass(), "followersUrl", "tlzpzIjMib");
        setField(term4533, term4533.getClass(), "followingUrl", "AZdLeSugwv");
        setField(term4533, term4533.getClass(), "gistsUrl", "RMsXuyzKJV");
        setField(term4533, term4533.getClass(), "starredUrl", "FwPbDZcHmB");
        setField(term4533, term4533.getClass(), "subscriptionsUrl", "hOncybyCAH");
        setField(term4533, term4533.getClass(), "organizationsUrl", "QduALnDSVo");
        setField(term4533, term4533.getClass(), "reposUrl", "izPpKDErnQ");
        setField(term4533, term4533.getClass(), "eventsUrl", "NnpwZBUTvx");
        setField(term4533, term4533.getClass(), "receivedEventsUrl", "tlQSNgTkQX");
        setField(term4533, term4533.getClass(), "type", "PCipZnmBOF");
        setField(term4533, term4533.getClass(), "siteAdmin", term4728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term4533, args);
    }

};


