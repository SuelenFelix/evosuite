package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class AbstractSMLObject_appendToString_5587760571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9413;
     Object term9433;
     Object term9435;

    public AbstractSMLObject_appendToString_5587760571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9413 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9414 = (byte[]) newByteArray(16);
        setField(term9413, term9413.getClass(), "value", term9414);
        setByteField(term9413, term9413.getClass(), "coder", (byte) 90);
        setIntField(term9413, term9413.getClass(), "count", 1540719661);
        term9433 = new Integer(1265463001);
        term9435 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.AbstractSMLObject");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term9413;
        args[1] = term9433;
        args[2] = term9435;
        callMethod(klass, "appendToString", argTypes, null, args);
    }

};


