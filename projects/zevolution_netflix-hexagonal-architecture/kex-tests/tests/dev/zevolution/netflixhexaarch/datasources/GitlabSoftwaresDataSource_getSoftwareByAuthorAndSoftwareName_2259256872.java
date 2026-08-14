package dev.zevolution.netflixhexaarch.datasources;

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
import static dev.zevolution.netflixhexaarch.datasources.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GitlabSoftwaresDataSource_getSoftwareByAuthorAndSoftwareName_2259256872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public GitlabSoftwaresDataSource_getSoftwareByAuthorAndSoftwareName_2259256872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.GitlabSoftwaresDataSource"));
        setField(term58, term58.getClass(), "gitlabUsersClient", null);
        setField(term58, term58.getClass(), "gitlabUserCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.GitlabSoftwaresDataSource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getSoftwareByAuthorAndSoftwareName", argTypes, term58, args);
    }

};


