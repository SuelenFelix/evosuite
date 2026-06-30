package in.cubestack.apps.blog.event.domain;

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
import static in.cubestack.apps.blog.event.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Event_setCounterType_47827677312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2255;

    public Event_setCounterType_47827677312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2255 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        setField(term2255, term2255.getClass(), "contentId", null);
        setField(term2255, term2255.getClass(), "eventType", null);
        setField(term2255, term2255.getClass(), "id", null);
        setField(term2255, term2255.getClass(), "createdAt", null);
        setField(term2255, term2255.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.EventType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCounterType", argTypes, term2255, args);
    }

};


