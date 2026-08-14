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

public class GithubOwnerResponse_setId_15676119804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3438;
     Object term3635;

    public GithubOwnerResponse_setId_15676119804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3451 = new Integer(-469968304);
        Boolean term3633 = new Boolean(false);
        term3438 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term3438, term3438.getClass(), "login", "ZfdXfCCFDf");
        setField(term3438, term3438.getClass(), "id", term3451);
        setField(term3438, term3438.getClass(), "nodeId", "MwwjNtdOFT");
        setField(term3438, term3438.getClass(), "avatarUrl", "VYkqXKVlAJ");
        setField(term3438, term3438.getClass(), "gravatarId", "XkIoWJRNwN");
        setField(term3438, term3438.getClass(), "url", "aNWLJdrZMq");
        setField(term3438, term3438.getClass(), "htmlUrl", "HHmNoYxIGj");
        setField(term3438, term3438.getClass(), "followersUrl", "PtirvZmsGt");
        setField(term3438, term3438.getClass(), "followingUrl", "HWkpTmtlrc");
        setField(term3438, term3438.getClass(), "gistsUrl", "hMmaoREuCK");
        setField(term3438, term3438.getClass(), "starredUrl", "VeDtgDzGAN");
        setField(term3438, term3438.getClass(), "subscriptionsUrl", "aWYOWZFyaX");
        setField(term3438, term3438.getClass(), "organizationsUrl", "BRIVNtfUWU");
        setField(term3438, term3438.getClass(), "reposUrl", "DbiCVtPPCT");
        setField(term3438, term3438.getClass(), "eventsUrl", "WzFopsaDuG");
        setField(term3438, term3438.getClass(), "receivedEventsUrl", "PapWxkhEWe");
        setField(term3438, term3438.getClass(), "type", "smnHEqRFRx");
        setField(term3438, term3438.getClass(), "siteAdmin", term3633);
        term3635 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3635;
        callMethod(klass, "setId", argTypes, term3438, args);
    }

};


