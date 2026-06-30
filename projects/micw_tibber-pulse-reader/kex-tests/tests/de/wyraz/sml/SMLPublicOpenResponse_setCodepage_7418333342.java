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

public class SMLPublicOpenResponse_setCodepage_7418333342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;
     Object term211;

    public SMLPublicOpenResponse_setCodepage_7418333342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term209 = new Integer(-244121226);
        term189 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term190 = (byte[]) newByteArray(5);
        byte[] term196 = (byte[]) newByteArray(5);
        byte[] term202 = (byte[]) newByteArray(2);
        byte[] term205 = (byte[]) newByteArray(3);
        setByteElement(term190, 0, (byte) -22);
        setByteElement(term190, 1, (byte) 93);
        setByteElement(term190, 2, (byte) 69);
        setByteElement(term190, 3, (byte) -74);
        setByteElement(term190, 4, (byte) -123);
        setField(term189, term189.getClass(), "codepage", term190);
        setByteElement(term196, 0, (byte) -23);
        setByteElement(term196, 1, (byte) 100);
        setByteElement(term196, 2, (byte) 106);
        setByteElement(term196, 3, (byte) -57);
        setByteElement(term196, 4, (byte) -103);
        setField(term189, term189.getClass(), "clientId", term196);
        setByteElement(term202, 0, (byte) 98);
        setByteElement(term202, 1, (byte) 79);
        setField(term189, term189.getClass(), "reqFileId", term202);
        setByteElement(term205, 0, (byte) 61);
        setByteElement(term205, 1, (byte) -92);
        setByteElement(term205, 2, (byte) -42);
        setField(term189, term189.getClass(), "serverId", term205);
        setField(term189, term189.getClass(), "refTime", null);
        setField(term189, term189.getClass(), "smlVersion", term209);
        term211 = (byte[]) newByteArray(1);
        setByteElement(term211, 0, (byte) 116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term211;
        callMethod(klass, "setCodepage", argTypes, term189, args);
    }

};


