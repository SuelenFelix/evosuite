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
import java.lang.String;

public class EventManagement_registerEvent_9218274851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7596;
     Object term7615;

    public EventManagement_registerEvent_9218274851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7599 = new HashMap();
        ArrayList term7605 = new ArrayList();
        ((ArrayList) term7605).add((Object)null);
        HashMap term7610 = new HashMap();
        term7596 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term7597 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term7598 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term7604 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term7598, term7598.getClass(), "eventManager", term7597);
        setField(term7598, term7598.getClass(), "eventMap", term7599);
        setField(term7597, term7597.getClass(), "eventManagement", term7598);
        setField(term7604, term7604.getClass(), "this$0", term7597);
        setField(term7604, term7604.getClass(), "annotationHandlers", term7605);
        setField(term7597, term7597.getClass(), "handlersManager", term7604);
        setBooleanField(term7597, term7597.getClass(), "debugLoggingEnabled", false);
        setField(term7596, term7596.getClass(), "eventManager", term7597);
        setField(term7596, term7596.getClass(), "eventMap", term7610);
        Class<? extends Object> term7855 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper");
        Class<? extends Object> term8044 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term8139 = Class.forName((String) "java.util.stream.SliceOps$3$1");
        Class term8130 = Array.newInstance(term8139, 0).getClass();
        Class term8115 = Array.newInstance(term8130, 0).getClass();
        Class term8053 = Array.newInstance(term8115, 0).getClass();
        Object[] term8054 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term8054, 0, term8044);
        setElement(term8054, 1, term8053);
        Method term7616 = ((Class) term7855).getDeclaredMethod((String) "dumpClass", (Class[]) term8054);
        ((Method) term7616).setAccessible(true);
        Class<? extends Object> term8232 = Class.forName((String) "me.nurio.events.handler.EventPriority");
        Field term8231 = ((Class) term8232).getDeclaredField((String) "NORMAL");
        ((Field) term8231).setAccessible(true);
        Object enum4 = ((Field) term8231).get((Object) null);
        term7615 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term7615, term7615.getClass(), "method", term7616);
        setField(term7615, term7615.getClass(), "handler", null);
        setField(term7615, term7615.getClass(), "event", null);
        setField(term7615, term7615.getClass(), "listener", null);
        setField(term7615, term7615.getClass(), "priority", enum4);
        setBooleanField(term7615, term7615.getClass(), "ignoreCancelled", false);
        setField(term7615, term7615.getClass(), "name", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Object[] args = new Object[1];
        args[0] = term7615;
        callMethod(klass, "registerEvent", argTypes, term7596, args);
    }

};


