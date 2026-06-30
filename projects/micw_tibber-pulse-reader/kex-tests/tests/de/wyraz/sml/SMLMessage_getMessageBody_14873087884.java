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

public class SMLMessage_getMessageBody_14873087884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public SMLMessage_getMessageBody_14873087884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term67 = new Integer(1134449235);
        Integer term69 = new Integer(-883034806);
        Integer term71 = new Integer(1585847225);
        Integer term73 = new Integer(597278769);
        Boolean term75 = new Boolean(false);
        term61 = newInstance(Class.forName("de.wyraz.sml.SMLMessage"));
        byte[] term62 = (byte[]) newByteArray(4);
        setByteElement(term62, 0, (byte) 83);
        setByteElement(term62, 1, (byte) 74);
        setByteElement(term62, 2, (byte) -71);
        setByteElement(term62, 3, (byte) 49);
        setField(term61, term61.getClass(), "transactionId", term62);
        setField(term61, term61.getClass(), "groupNo", term67);
        setField(term61, term61.getClass(), "abortOnError", term69);
        setField(term61, term61.getClass(), "messageBody", null);
        setField(term61, term61.getClass(), "crc16Actual", term71);
        setField(term61, term61.getClass(), "crc16Expected", term73);
        setField(term61, term61.getClass(), "crc16Ok", term75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageBody", argTypes, term61, args);
    }

};


