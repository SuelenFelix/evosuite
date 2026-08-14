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

public class GithubOwnerResponse_setGravatarId_179567794910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5626;

    public GithubOwnerResponse_setGravatarId_179567794910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5639 = new Integer(1876565163);
        Boolean term5821 = new Boolean(true);
        term5626 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term5626, term5626.getClass(), "login", "SIODFGaQhr");
        setField(term5626, term5626.getClass(), "id", term5639);
        setField(term5626, term5626.getClass(), "nodeId", "qYzsiuXOgS");
        setField(term5626, term5626.getClass(), "avatarUrl", "bxrCBbrrct");
        setField(term5626, term5626.getClass(), "gravatarId", "CKWpJaaaxX");
        setField(term5626, term5626.getClass(), "url", "UBRmXJmfrt");
        setField(term5626, term5626.getClass(), "htmlUrl", "WZzvmIHhzZ");
        setField(term5626, term5626.getClass(), "followersUrl", "doQLHkjpNm");
        setField(term5626, term5626.getClass(), "followingUrl", "lCyLIcSuom");
        setField(term5626, term5626.getClass(), "gistsUrl", "CGOpQSZZwI");
        setField(term5626, term5626.getClass(), "starredUrl", "ypEdrstygY");
        setField(term5626, term5626.getClass(), "subscriptionsUrl", "sNQFlATEeQ");
        setField(term5626, term5626.getClass(), "organizationsUrl", "ZKMLioamsY");
        setField(term5626, term5626.getClass(), "reposUrl", "WVbxuoDBcn");
        setField(term5626, term5626.getClass(), "eventsUrl", "pvDEABOxLt");
        setField(term5626, term5626.getClass(), "receivedEventsUrl", "beAMpkroCQ");
        setField(term5626, term5626.getClass(), "type", "uSUvKAyuvd");
        setField(term5626, term5626.getClass(), "siteAdmin", term5821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onQLVONGuf";
        callMethod(klass, "setGravatarId", argTypes, term5626, args);
    }

};


