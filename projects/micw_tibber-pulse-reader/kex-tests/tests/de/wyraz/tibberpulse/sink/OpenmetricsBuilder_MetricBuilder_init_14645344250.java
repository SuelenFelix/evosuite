package de.wyraz.tibberpulse.sink;

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
import static de.wyraz.tibberpulse.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenmetricsBuilder_MetricBuilder_init_14645344250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;

    public OpenmetricsBuilder_MetricBuilder_init_14645344250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder"));
        Object term97 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term98 = (byte[]) newByteArray(16);
        setField(term97, term97.getClass(), "value", term98);
        setByteField(term97, term97.getClass(), "coder", (byte) 0);
        setIntField(term97, term97.getClass(), "count", 0);
        setField(term96, term96.getClass(), "sb", term97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term96;
        args[1] = "HyxfbSQYBe";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


