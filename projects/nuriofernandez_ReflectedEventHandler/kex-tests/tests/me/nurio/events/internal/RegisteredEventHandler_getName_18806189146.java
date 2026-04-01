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

public class RegisteredEventHandler_getName_18806189146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4833;

    public RegisteredEventHandler_getName_18806189146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5042 = Class.forName((String) "java.nio.file.StandardCopyOption");
        Class<? extends Object> term5215 = Class.forName((String) "java.lang.String");
        Object[] term5216 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term5216, 0, term5215);
        Method term4834 = ((Class) term5042).getDeclaredMethod((String) "valueOf", (Class[]) term5216);
        ((Method) term4834).setAccessible(false);
        Class<? extends Object> term5266 = Class.forName((String) "me.nurio.events.handler.EventPriority");
        Field term5265 = ((Class) term5266).getDeclaredField((String) "LOWEST");
        ((Field) term5265).setAccessible(true);
        Object enum3 = ((Field) term5265).get((Object) null);
        term4833 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term4833, term4833.getClass(), "method", term4834);
        setField(term4833, term4833.getClass(), "handler", null);
        setField(term4833, term4833.getClass(), "event", null);
        setField(term4833, term4833.getClass(), "listener", null);
        setField(term4833, term4833.getClass(), "priority", enum3);
        setBooleanField(term4833, term4833.getClass(), "ignoreCancelled", true);
        setField(term4833, term4833.getClass(), "name", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4833, args);
    }

};


