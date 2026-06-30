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

public class CRC16_getCrc16_14295813961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;
     Object term716;
     Object term718;

    public CRC16_getCrc16_14295813961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708 = (byte[]) newByteArray(7);
        setByteElement(term708, 0, (byte) 94);
        setByteElement(term708, 1, (byte) 114);
        setByteElement(term708, 2, (byte) 110);
        setByteElement(term708, 3, (byte) 70);
        setByteElement(term708, 4, (byte) -46);
        setByteElement(term708, 5, (byte) -78);
        setByteElement(term708, 6, (byte) 109);
        term716 = new Integer(568599855);
        term718 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.CRC16");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term708;
        args[1] = term716;
        args[2] = term718;
        callMethod(klass, "getCrc16", argTypes, null, args);
    }

};


