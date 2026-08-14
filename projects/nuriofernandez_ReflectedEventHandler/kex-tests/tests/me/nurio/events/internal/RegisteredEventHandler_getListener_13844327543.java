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
import java.lang.String;
import java.lang.Object;

public class RegisteredEventHandler_getListener_13844327543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2851;

    public RegisteredEventHandler_getListener_13844327543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3090 = Class.forName((String) "java.util.concurrent.CompletionService");
        Class<? extends Object> term3298 = Class.forName((String) "java.util.concurrent.Callable");
        Object[] term3299 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term3299, 0, term3298);
        Method term2852 = ((Class) term3090).getDeclaredMethod((String) "submit", (Class[]) term3299);
        ((Method) term2852).setAccessible(true);
        Class<? extends Object> term3388 = Class.forName((String) "me.nurio.events.handler.EventPriority");
        Field term3387 = ((Class) term3388).getDeclaredField((String) "HIGH");
        ((Field) term3387).setAccessible(true);
        Object enum1 = ((Field) term3387).get((Object) null);
        term2851 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term2851, term2851.getClass(), "method", term2852);
        setField(term2851, term2851.getClass(), "handler", null);
        setField(term2851, term2851.getClass(), "event", null);
        setField(term2851, term2851.getClass(), "listener", null);
        setField(term2851, term2851.getClass(), "priority", enum1);
        setBooleanField(term2851, term2851.getClass(), "ignoreCancelled", true);
        setField(term2851, term2851.getClass(), "name", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListener", argTypes, term2851, args);
    }

};


