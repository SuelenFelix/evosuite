package me.nurio.events.internal;

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
import static me.nurio.events.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class EventManagement_init_18767409955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8858;

    public EventManagement_init_18767409955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8860 = new HashMap();
        Object term8868 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8868, term8868.getClass(), "annotation", null);
        ArrayList term8866 = new ArrayList();
        ((ArrayList) term8866).add(term8868);
        term8858 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8859 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8865 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8859, term8859.getClass(), "eventManager", term8858);
        setField(term8859, term8859.getClass(), "eventMap", term8860);
        setField(term8858, term8858.getClass(), "eventManagement", term8859);
        setField(term8865, term8865.getClass(), "this$0", term8858);
        setField(term8865, term8865.getClass(), "annotationHandlers", term8866);
        setField(term8858, term8858.getClass(), "handlersManager", term8865);
        setBooleanField(term8858, term8858.getClass(), "debugLoggingEnabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Object[] args = new Object[1];
        args[0] = term8858;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


