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

public class SMLMessage_getTransactionId_4295496041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SMLMessage_getTransactionId_4295496041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8 = new Integer(568599855);
        Integer term10 = new Integer(1162663216);
        Integer term12 = new Integer(1484323161);
        Integer term14 = new Integer(391863371);
        Boolean term16 = new Boolean(false);
        term1 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term2 = (byte[]) newByteArray(5);
        setByteElement(term2, 0, (byte) 47);
        setByteElement(term2, 1, (byte) 48);
        setByteElement(term2, 2, (byte) 89);
        setByteElement(term2, 3, (byte) 75);
        setByteElement(term2, 4, (byte) 18);
        setField(term1, term1.getClass(), "transactionId", term2);
        setField(term1, term1.getClass(), "groupNo", term8);
        setField(term1, term1.getClass(), "abortOnError", term10);
        setField(term1, term1.getClass(), "messageBody", null);
        setField(term1, term1.getClass(), "crc16Actual", term12);
        setField(term1, term1.getClass(), "crc16Expected", term14);
        setField(term1, term1.getClass(), "crc16Ok", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionId", argTypes, term1, args);
    }

};


