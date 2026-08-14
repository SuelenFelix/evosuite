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

public class GithubLicenseResponse_getSpdxId_125708750916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16813;

    public GithubLicenseResponse_getSpdxId_125708750916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16813 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubLicenseResponse"));
        setField(term16813, term16813.getClass(), "key", null);
        setField(term16813, term16813.getClass(), "name", null);
        setField(term16813, term16813.getClass(), "spdxId", null);
        setField(term16813, term16813.getClass(), "url", null);
        setField(term16813, term16813.getClass(), "nodeId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubLicenseResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpdxId", argTypes, term16813, args);
    }

};


