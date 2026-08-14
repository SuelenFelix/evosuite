package dev.zevolution.netflixhexaarch.datasources.services.mapper;

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
import static dev.zevolution.netflixhexaarch.datasources.services.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SoftwareMapperImpl_githubRepoOwnerLogin_5658107567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6289;

    public SoftwareMapperImpl_githubRepoOwnerLogin_5658107567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6289 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "githubRepoOwnerLogin", argTypes, term6289, args);
    }

};


