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
import java.lang.Long;

public class OpenmetricsBuilder_MetricBuilder_tag_10251315272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;

    public OpenmetricsBuilder_MetricBuilder_tag_10251315272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term450 = new Long(6375119433582206027L);
        term429 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder"));
        Object term430 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term431 = (byte[]) newByteArray(16);
        setField(term430, term430.getClass(), "value", term431);
        setByteField(term430, term430.getClass(), "coder", (byte) 48);
        setIntField(term430, term430.getClass(), "count", 1162663216);
        setField(term429, term429.getClass(), "sb", term430);
        setField(term429, term429.getClass(), "timestamp", term450);
        setBooleanField(term429, term429.getClass(), "hasTags", false);
        setField(term429, term429.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "pCTimMblYc";
        args[1] = "hNxWaHcfhY";
        callMethod(klass, "tag", argTypes, term429, args);
    }

};


