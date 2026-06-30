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

public class OpenmetricsBuilder_build_2223687043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3360;

    public OpenmetricsBuilder_build_2223687043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3360 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder"));
        Object term3361 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3362 = (byte[]) newByteArray(16);
        setField(term3361, term3361.getClass(), "value", term3362);
        setByteField(term3361, term3361.getClass(), "coder", (byte) 0);
        setIntField(term3361, term3361.getClass(), "count", 0);
        setField(term3360, term3360.getClass(), "sb", term3361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3360, args);
    }

};


