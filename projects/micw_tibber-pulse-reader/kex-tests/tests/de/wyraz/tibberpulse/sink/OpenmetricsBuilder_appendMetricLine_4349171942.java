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

public class OpenmetricsBuilder_appendMetricLine_4349171942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3323;

    public OpenmetricsBuilder_appendMetricLine_4349171942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3323 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder"));
        Object term3324 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3325 = (byte[]) newByteArray(16);
        setField(term3324, term3324.getClass(), "value", term3325);
        setByteField(term3324, term3324.getClass(), "coder", (byte) 0);
        setIntField(term3324, term3324.getClass(), "count", 0);
        setField(term3323, term3323.getClass(), "sb", term3324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendMetricLine", argTypes, term3323, args);
    }

};


