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

public class SMLMessage_getGroupNo_182501649310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;

    public SMLMessage_getGroupNo_182501649310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        setField(term136, term136.getClass(), "transactionId", null);
        setField(term136, term136.getClass(), "groupNo", null);
        setField(term136, term136.getClass(), "abortOnError", null);
        setField(term136, term136.getClass(), "messageBody", null);
        setField(term136, term136.getClass(), "crc16Actual", null);
        setField(term136, term136.getClass(), "crc16Expected", null);
        setField(term136, term136.getClass(), "crc16Ok", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupNo", argTypes, term136, args);
    }

};


