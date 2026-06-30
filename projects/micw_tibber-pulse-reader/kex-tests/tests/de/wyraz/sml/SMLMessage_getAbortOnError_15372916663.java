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

public class SMLMessage_getAbortOnError_15372916663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;

    public SMLMessage_getAbortOnError_15372916663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48 = new Integer(1227103734);
        Integer term50 = new Integer(-1339778481);
        Integer term52 = new Integer(1725571209);
        Integer term54 = new Integer(-522618178);
        Boolean term56 = new Boolean(false);
        term43 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term44 = (byte[]) newByteArray(3);
        setByteElement(term44, 0, (byte) 79);
        setByteElement(term44, 1, (byte) -119);
        setByteElement(term44, 2, (byte) -66);
        setField(term43, term43.getClass(), "transactionId", term44);
        setField(term43, term43.getClass(), "groupNo", term48);
        setField(term43, term43.getClass(), "abortOnError", term50);
        setField(term43, term43.getClass(), "messageBody", null);
        setField(term43, term43.getClass(), "crc16Actual", term52);
        setField(term43, term43.getClass(), "crc16Expected", term54);
        setField(term43, term43.getClass(), "crc16Ok", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbortOnError", argTypes, term43, args);
    }

};


