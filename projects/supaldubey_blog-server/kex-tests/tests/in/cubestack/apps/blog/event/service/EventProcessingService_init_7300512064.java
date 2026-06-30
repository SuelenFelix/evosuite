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

public class EventProcessingService_init_7300512064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public EventProcessingService_init_7300512064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


