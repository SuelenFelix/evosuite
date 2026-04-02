package in.cubestack.apps.blog.event.service;

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
import static in.cubestack.apps.blog.event.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CacheManagementService_manageCache_17991621093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1117;

    public CacheManagementService_manageCache_17991621093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1117 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        setField(term1117, term1117.getClass(), "cacheInvalidationService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "manageCache", argTypes, term1117, args);
    }

};


