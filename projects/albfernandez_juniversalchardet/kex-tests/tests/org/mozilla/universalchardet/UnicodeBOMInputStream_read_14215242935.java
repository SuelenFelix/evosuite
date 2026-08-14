package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnicodeBOMInputStream_read_14215242935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385875;
     Object term385908;

    public UnicodeBOMInputStream_read_14215242935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385875 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term385876 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term385877 = (byte[]) newByteArray(6);
        Object term385885 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term385886 = (byte[]) newByteArray(8);
        setByteElement(term385877, 0, (byte) -54);
        setByteElement(term385877, 1, (byte) -25);
        setByteElement(term385877, 2, (byte) -35);
        setByteElement(term385877, 3, (byte) 3);
        setByteElement(term385877, 4, (byte) -10);
        setByteElement(term385877, 5, (byte) -106);
        setField(term385876, term385876.getClass(), "buf", term385877);
        setIntField(term385876, term385876.getClass(), "pos", 1598895173);
        setField(term385876, term385876.getClass(), "in", null);
        setField(term385875, term385875.getClass(), "in", term385876);
        setByteElement(term385886, 0, (byte) -124);
        setByteElement(term385886, 1, (byte) -71);
        setByteElement(term385886, 2, (byte) 113);
        setByteElement(term385886, 3, (byte) -77);
        setByteElement(term385886, 4, (byte) -12);
        setByteElement(term385886, 5, (byte) 58);
        setByteElement(term385886, 6, (byte) 12);
        setByteElement(term385886, 7, (byte) 79);
        setField(term385885, term385885.getClass(), "bytes", term385886);
        setField(term385885, term385885.getClass(), "description", "dWRymuLBtr");
        setField(term385875, term385875.getClass(), "bom", term385885);
        setBooleanField(term385875, term385875.getClass(), "skipped", true);
        term385908 = (byte[]) newByteArray(9);
        setByteElement(term385908, 0, (byte) -4);
        setByteElement(term385908, 1, (byte) -27);
        setByteElement(term385908, 2, (byte) 120);
        setByteElement(term385908, 3, (byte) -25);
        setByteElement(term385908, 4, (byte) 114);
        setByteElement(term385908, 5, (byte) 105);
        setByteElement(term385908, 6, (byte) -95);
        setByteElement(term385908, 7, (byte) -6);
        setByteElement(term385908, 8, (byte) 51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term385908;
        callMethod(klass, "read", argTypes, term385875, args);
    }

};


