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

public class EventProcessingService_init_254193181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public EventProcessingService_init_254193181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService"));
        Object term5 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        Object term6 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        Object term7 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheInvalidationService"));
        setField(term5, term5.getClass(), "postService", null);
        setField(term4, term4.getClass(), "analyticsGeneratorService", term5);
        setField(term6, term6.getClass(), "cacheInvalidationService", term7);
        setField(term4, term4.getClass(), "cacheManagementService", term6);
        setField(term4, term4.getClass(), "executorService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term4, args);
    }

};


