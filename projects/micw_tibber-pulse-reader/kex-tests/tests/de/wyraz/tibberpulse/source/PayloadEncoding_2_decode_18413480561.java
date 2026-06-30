package de.wyraz.tibberpulse.source;

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
import static de.wyraz.tibberpulse.source.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PayloadEncoding_2_decode_18413480561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public PayloadEncoding_2_decode_18413480561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = (byte[]) newByteArray(5);
        setByteElement(term47, 0, (byte) 47);
        setByteElement(term47, 1, (byte) 48);
        setByteElement(term47, 2, (byte) 89);
        setByteElement(term47, 3, (byte) 75);
        setByteElement(term47, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.source.PayloadEncoding$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term47;
        callMethod(klass, "decode", argTypes, null, args);
    }

};


