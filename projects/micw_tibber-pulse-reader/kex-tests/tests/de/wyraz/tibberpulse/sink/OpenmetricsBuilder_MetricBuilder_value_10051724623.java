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

public class OpenmetricsBuilder_MetricBuilder_value_10051724623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;

    public OpenmetricsBuilder_MetricBuilder_value_10051724623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term534 = new Long(-8257434502486459194L);
        term513 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder"));
        Object term514 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term515 = (byte[]) newByteArray(16);
        setField(term514, term514.getClass(), "value", term515);
        setByteField(term514, term514.getClass(), "coder", (byte) 89);
        setIntField(term514, term514.getClass(), "count", 1484323161);
        setField(term513, term513.getClass(), "sb", term514);
        setField(term513, term513.getClass(), "timestamp", term534);
        setBooleanField(term513, term513.getClass(), "hasTags", false);
        setField(term513, term513.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term513, args);
    }

};


