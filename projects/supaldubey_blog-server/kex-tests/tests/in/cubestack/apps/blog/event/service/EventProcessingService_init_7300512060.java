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
import java.lang.Object;

public class EventProcessingService_init_7300512060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public EventProcessingService_init_7300512060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        setField(term1, term1.getClass(), "postService", null);
        term2 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        Object term3 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheInvalidationService"));
        setField(term2, term2.getClass(), "cacheInvalidationService", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term2;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


