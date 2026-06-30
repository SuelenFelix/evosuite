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

public class SMLMessage_getCrc16Ok_11939035087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public SMLMessage_getCrc16Ok_11939035087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term123 = new Integer(-1007160944);
        Integer term125 = new Integer(1135664017);
        Integer term127 = new Integer(590364439);
        Integer term129 = new Integer(865208305);
        Boolean term131 = new Boolean(true);
        term119 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term120 = (byte[]) newByteArray(2);
        setByteElement(term120, 0, (byte) -16);
        setByteElement(term120, 1, (byte) -112);
        setField(term119, term119.getClass(), "transactionId", term120);
        setField(term119, term119.getClass(), "groupNo", term123);
        setField(term119, term119.getClass(), "abortOnError", term125);
        setField(term119, term119.getClass(), "messageBody", null);
        setField(term119, term119.getClass(), "crc16Actual", term127);
        setField(term119, term119.getClass(), "crc16Expected", term129);
        setField(term119, term119.getClass(), "crc16Ok", term131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrc16Ok", argTypes, term119, args);
    }

};


