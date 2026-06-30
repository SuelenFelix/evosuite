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

public class AbstractSMLObject_indentAppend_2538233632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9453;
     Object term9473;
     Object term9487;

    public AbstractSMLObject_indentAppend_2538233632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9453 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9454 = (byte[]) newByteArray(16);
        setField(term9453, term9453.getClass(), "value", term9454);
        setByteField(term9453, term9453.getClass(), "coder", (byte) -40);
        setIntField(term9453, term9453.getClass(), "count", 335112684);
        term9473 = new Integer(1551099402);
        term9487 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.AbstractSMLObject");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term9453;
        args[1] = term9473;
        args[2] = "MuLcgQHgqz";
        args[3] = term9487;
        callMethod(klass, "indentAppend", argTypes, null, args);
    }

};


