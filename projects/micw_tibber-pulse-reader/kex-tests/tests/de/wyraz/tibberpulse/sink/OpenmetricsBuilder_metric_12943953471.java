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

public class OpenmetricsBuilder_metric_12943953471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3264;

    public OpenmetricsBuilder_metric_12943953471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3264 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder"));
        Object term3265 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3266 = (byte[]) newByteArray(16);
        setField(term3265, term3265.getClass(), "value", term3266);
        setByteField(term3265, term3265.getClass(), "coder", (byte) 0);
        setIntField(term3265, term3265.getClass(), "count", 0);
        setField(term3264, term3264.getClass(), "sb", term3265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "metric", argTypes, term3264, args);
    }

};


