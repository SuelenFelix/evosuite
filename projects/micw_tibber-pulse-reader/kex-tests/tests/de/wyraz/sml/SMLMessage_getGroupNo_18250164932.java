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
import java.lang.Boolean;

public class SMLMessage_getGroupNo_18250164932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public SMLMessage_getGroupNo_18250164932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29 = new Integer(-1922583790);
        Integer term31 = new Integer(-616727354);
        Integer term33 = new Integer(-1955890973);
        Integer term35 = new Integer(-2038273078);
        Boolean term37 = new Boolean(false);
        term23 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term24 = (byte[]) newByteArray(4);
        setByteElement(term24, 0, (byte) -58);
        setByteElement(term24, 1, (byte) -29);
        setByteElement(term24, 2, (byte) -54);
        setByteElement(term24, 3, (byte) -10);
        setField(term23, term23.getClass(), "transactionId", term24);
        setField(term23, term23.getClass(), "groupNo", term29);
        setField(term23, term23.getClass(), "abortOnError", term31);
        setField(term23, term23.getClass(), "messageBody", null);
        setField(term23, term23.getClass(), "crc16Actual", term33);
        setField(term23, term23.getClass(), "crc16Expected", term35);
        setField(term23, term23.getClass(), "crc16Ok", term37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupNo", argTypes, term23, args);
    }

};


