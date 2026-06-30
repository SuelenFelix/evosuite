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

public class SMLPublicOpenResponse_setClientId_19527404164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term290;

    public SMLPublicOpenResponse_setClientId_19527404164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term288 = new Integer(-1179120542);
        term268 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term269 = (byte[]) newByteArray(2);
        byte[] term272 = (byte[]) newByteArray(1);
        byte[] term274 = (byte[]) newByteArray(9);
        byte[] term284 = (byte[]) newByteArray(3);
        setByteElement(term269, 0, (byte) 14);
        setByteElement(term269, 1, (byte) -101);
        setField(term268, term268.getClass(), "codepage", term269);
        setByteElement(term272, 0, (byte) 35);
        setField(term268, term268.getClass(), "clientId", term272);
        setByteElement(term274, 0, (byte) 66);
        setByteElement(term274, 1, (byte) 123);
        setByteElement(term274, 2, (byte) -5);
        setByteElement(term274, 3, (byte) 84);
        setByteElement(term274, 4, (byte) -97);
        setByteElement(term274, 5, (byte) -24);
        setByteElement(term274, 6, (byte) 88);
        setByteElement(term274, 7, (byte) 96);
        setByteElement(term274, 8, (byte) 70);
        setField(term268, term268.getClass(), "reqFileId", term274);
        setByteElement(term284, 0, (byte) 48);
        setByteElement(term284, 1, (byte) -46);
        setByteElement(term284, 2, (byte) -128);
        setField(term268, term268.getClass(), "serverId", term284);
        setField(term268, term268.getClass(), "refTime", null);
        setField(term268, term268.getClass(), "smlVersion", term288);
        term290 = (byte[]) newByteArray(5);
        setByteElement(term290, 0, (byte) 66);
        setByteElement(term290, 1, (byte) -112);
        setByteElement(term290, 2, (byte) 81);
        setByteElement(term290, 3, (byte) 65);
        setByteElement(term290, 4, (byte) -44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term290;
        callMethod(klass, "setClientId", argTypes, term268, args);
    }

};


