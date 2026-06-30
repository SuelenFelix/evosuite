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

public class SMLPublicOpenResponse_setReqFileId_21400474676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term388;

    public SMLPublicOpenResponse_setReqFileId_21400474676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term386 = new Integer(-226514366);
        term365 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term366 = (byte[]) newByteArray(2);
        byte[] term369 = (byte[]) newByteArray(6);
        byte[] term376 = (byte[]) newByteArray(6);
        byte[] term383 = (byte[]) newByteArray(2);
        setByteElement(term366, 0, (byte) -28);
        setByteElement(term366, 1, (byte) 115);
        setField(term365, term365.getClass(), "codepage", term366);
        setByteElement(term369, 0, (byte) 96);
        setByteElement(term369, 1, (byte) 51);
        setByteElement(term369, 2, (byte) -53);
        setByteElement(term369, 3, (byte) -8);
        setByteElement(term369, 4, (byte) -9);
        setByteElement(term369, 5, (byte) 97);
        setField(term365, term365.getClass(), "clientId", term369);
        setByteElement(term376, 0, (byte) -46);
        setByteElement(term376, 1, (byte) 14);
        setByteElement(term376, 2, (byte) 34);
        setByteElement(term376, 3, (byte) 126);
        setByteElement(term376, 4, (byte) 7);
        setByteElement(term376, 5, (byte) -96);
        setField(term365, term365.getClass(), "reqFileId", term376);
        setByteElement(term383, 0, (byte) -22);
        setByteElement(term383, 1, (byte) -5);
        setField(term365, term365.getClass(), "serverId", term383);
        setField(term365, term365.getClass(), "refTime", null);
        setField(term365, term365.getClass(), "smlVersion", term386);
        term388 = (byte[]) newByteArray(5);
        setByteElement(term388, 0, (byte) -124);
        setByteElement(term388, 1, (byte) -105);
        setByteElement(term388, 2, (byte) 25);
        setByteElement(term388, 3, (byte) 16);
        setByteElement(term388, 4, (byte) 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term388;
        callMethod(klass, "setReqFileId", argTypes, term365, args);
    }

};


