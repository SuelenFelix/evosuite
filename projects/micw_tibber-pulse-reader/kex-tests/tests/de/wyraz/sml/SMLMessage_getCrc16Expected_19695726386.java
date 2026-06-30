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

public class SMLMessage_getCrc16Expected_19695726386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public SMLMessage_getCrc16Expected_19695726386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term103 = new Integer(-655067527);
        Integer term105 = new Integer(-6029667);
        Integer term107 = new Integer(-2068769794);
        Integer term109 = new Integer(-117576464);
        Boolean term111 = new Boolean(true);
        term95 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term96 = (byte[]) newByteArray(6);
        setByteElement(term96, 0, (byte) 67);
        setByteElement(term96, 1, (byte) 78);
        setByteElement(term96, 2, (byte) 87);
        setByteElement(term96, 3, (byte) 121);
        setByteElement(term96, 4, (byte) -99);
        setByteElement(term96, 5, (byte) -2);
        setField(term95, term95.getClass(), "transactionId", term96);
        setField(term95, term95.getClass(), "groupNo", term103);
        setField(term95, term95.getClass(), "abortOnError", term105);
        setField(term95, term95.getClass(), "messageBody", null);
        setField(term95, term95.getClass(), "crc16Actual", term107);
        setField(term95, term95.getClass(), "crc16Expected", term109);
        setField(term95, term95.getClass(), "crc16Ok", term111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrc16Expected", argTypes, term95, args);
    }

};


