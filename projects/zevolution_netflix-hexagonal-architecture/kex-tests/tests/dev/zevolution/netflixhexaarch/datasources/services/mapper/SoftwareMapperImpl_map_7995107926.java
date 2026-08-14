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

public class SoftwareMapperImpl_map_7995107926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6288;

    public SoftwareMapperImpl_map_7995107926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6288 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "map", argTypes, term6288, args);
    }

};


