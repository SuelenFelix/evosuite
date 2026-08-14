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

public class RegisteredEventHandler_isIgnoreCancelled_296841455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4184;

    public RegisteredEventHandler_isIgnoreCancelled_296841455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4428 = Class.forName((String) "java.util.MissingFormatArgumentException");
        Object[] term4621 = (Object[]) newArray("java.lang.Class", 0);
        Method term4185 = ((Class) term4428).getDeclaredMethod((String) "getMessage", (Class[]) term4621);
        ((Method) term4185).setAccessible(true);
        Class<? extends Object> term4623 = Class.forName((String) "me.nurio.events.handler.EventPriority");
        Field term4622 = ((Class) term4623).getDeclaredField((String) "LOW");
        ((Field) term4622).setAccessible(true);
        Object enum2 = ((Field) term4622).get((Object) null);
        term4184 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term4184, term4184.getClass(), "method", term4185);
        setField(term4184, term4184.getClass(), "handler", null);
        setField(term4184, term4184.getClass(), "event", null);
        setField(term4184, term4184.getClass(), "listener", null);
        setField(term4184, term4184.getClass(), "priority", enum2);
        setBooleanField(term4184, term4184.getClass(), "ignoreCancelled", false);
        setField(term4184, term4184.getClass(), "name", "xBsXSDjXYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIgnoreCancelled", argTypes, term4184, args);
    }

};


