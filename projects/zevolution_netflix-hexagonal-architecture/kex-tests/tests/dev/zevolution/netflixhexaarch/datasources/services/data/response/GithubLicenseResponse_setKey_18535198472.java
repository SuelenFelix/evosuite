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

public class GithubLicenseResponse_setKey_18535198472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15700;

    public GithubLicenseResponse_setKey_18535198472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15700 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubLicenseResponse"));
        setField(term15700, term15700.getClass(), "key", "DNOtiLPAIY");
        setField(term15700, term15700.getClass(), "name", "FnEkAHBfyV");
        setField(term15700, term15700.getClass(), "spdxId", "VfmNFpEuax");
        setField(term15700, term15700.getClass(), "url", "ANHjlWPmZG");
        setField(term15700, term15700.getClass(), "nodeId", "SibzENsyyy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubLicenseResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrqGHotaef";
        callMethod(klass, "setKey", argTypes, term15700, args);
    }

};


