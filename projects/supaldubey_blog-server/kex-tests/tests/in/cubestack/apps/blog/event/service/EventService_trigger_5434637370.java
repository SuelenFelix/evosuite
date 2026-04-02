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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class EventService_trigger_5434637370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031;
     Object enum6;

    public EventService_trigger_5434637370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2031 = new Long(-4325723315152823407L);
        Class<? extends Object> term2049 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term2048 = ((Class) term2049).getDeclaredField((String) "TAG_CREATED");
        ((Field) term2048).setAccessible(true);
        enum6 = ((Field) term2048).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.event.domain.EventType");
        Object[] args = new Object[2];
        args[0] = term2031;
        args[1] = enum6;
        callMethod(klass, "trigger", argTypes, null, args);
    }

};


