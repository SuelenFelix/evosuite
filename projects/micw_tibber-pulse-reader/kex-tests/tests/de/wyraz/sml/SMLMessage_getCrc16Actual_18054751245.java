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

public class SMLMessage_getCrc16Actual_18054751245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;

    public SMLMessage_getCrc16Actual_18054751245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term84 = new Integer(-1685132342);
        Integer term86 = new Integer(-1456670397);
        Integer term88 = new Integer(1622346318);
        Integer term90 = new Integer(1048535127);
        Boolean term92 = new Boolean(true);
        term81 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term82 = (byte[]) newByteArray(1);
        setByteElement(term82, 0, (byte) -54);
        setField(term81, term81.getClass(), "transactionId", term82);
        setField(term81, term81.getClass(), "groupNo", term84);
        setField(term81, term81.getClass(), "abortOnError", term86);
        setField(term81, term81.getClass(), "messageBody", null);
        setField(term81, term81.getClass(), "crc16Actual", term88);
        setField(term81, term81.getClass(), "crc16Expected", term90);
        setField(term81, term81.getClass(), "crc16Ok", term92);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrc16Actual", argTypes, term81, args);
    }

};


