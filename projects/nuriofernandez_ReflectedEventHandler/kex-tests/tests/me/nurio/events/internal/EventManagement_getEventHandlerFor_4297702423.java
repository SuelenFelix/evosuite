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

public class EventManagement_getEventHandlerFor_4297702423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8820;

    public EventManagement_getEventHandlerFor_4297702423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8823 = new HashMap();
        ArrayList term8829 = new ArrayList();
        ((ArrayList) term8829).add((Object)null);
        HashMap term8834 = new HashMap();
        term8820 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8821 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8822 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8828 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8822, term8822.getClass(), "eventManager", term8821);
        setField(term8822, term8822.getClass(), "eventMap", term8823);
        setField(term8821, term8821.getClass(), "eventManagement", term8822);
        setField(term8828, term8828.getClass(), "this$0", term8821);
        setField(term8828, term8828.getClass(), "annotationHandlers", term8829);
        setField(term8821, term8821.getClass(), "handlersManager", term8828);
        setBooleanField(term8821, term8821.getClass(), "debugLoggingEnabled", false);
        setField(term8820, term8820.getClass(), "eventManager", term8821);
        setField(term8820, term8820.getClass(), "eventMap", term8834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEventHandlerFor", argTypes, term8820, args);
    }

};


