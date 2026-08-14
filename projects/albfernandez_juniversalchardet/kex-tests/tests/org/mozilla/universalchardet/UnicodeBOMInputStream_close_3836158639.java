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

public class UnicodeBOMInputStream_close_3836158639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386091;

    public UnicodeBOMInputStream_close_3836158639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386091 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386092 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386093 = (byte[]) newByteArray(7);
        Object term386102 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386103 = (byte[]) newByteArray(2);
        setByteElement(term386093, 0, (byte) -83);
        setByteElement(term386093, 1, (byte) -63);
        setByteElement(term386093, 2, (byte) 108);
        setByteElement(term386093, 3, (byte) -105);
        setByteElement(term386093, 4, (byte) 33);
        setByteElement(term386093, 5, (byte) 109);
        setByteElement(term386093, 6, (byte) -54);
        setField(term386092, term386092.getClass(), "buf", term386093);
        setIntField(term386092, term386092.getClass(), "pos", -523949691);
        setField(term386092, term386092.getClass(), "in", null);
        setField(term386091, term386091.getClass(), "in", term386092);
        setByteElement(term386103, 0, (byte) -85);
        setByteElement(term386103, 1, (byte) 81);
        setField(term386102, term386102.getClass(), "bytes", term386103);
        setField(term386102, term386102.getClass(), "description", "Ghbwtircqb");
        setField(term386091, term386091.getClass(), "bom", term386102);
        setBooleanField(term386091, term386091.getClass(), "skipped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term386091, args);
    }

};


