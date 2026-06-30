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

public class SMLMessage_getCrc16Expected_196957263814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public SMLMessage_getCrc16Expected_196957263814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        setField(term140, term140.getClass(), "transactionId", null);
        setField(term140, term140.getClass(), "groupNo", null);
        setField(term140, term140.getClass(), "abortOnError", null);
        setField(term140, term140.getClass(), "messageBody", null);
        setField(term140, term140.getClass(), "crc16Actual", null);
        setField(term140, term140.getClass(), "crc16Expected", null);
        setField(term140, term140.getClass(), "crc16Ok", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrc16Expected", argTypes, term140, args);
    }

};


