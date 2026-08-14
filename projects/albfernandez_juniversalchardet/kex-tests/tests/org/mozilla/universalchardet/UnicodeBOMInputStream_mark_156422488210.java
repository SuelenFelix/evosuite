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
import java.lang.Integer;

public class UnicodeBOMInputStream_mark_156422488210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386138;
     Object term386173;

    public UnicodeBOMInputStream_mark_156422488210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386138 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386139 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386140 = (byte[]) newByteArray(9);
        Object term386151 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386152 = (byte[]) newByteArray(7);
        setByteElement(term386140, 0, (byte) -113);
        setByteElement(term386140, 1, (byte) 90);
        setByteElement(term386140, 2, (byte) 10);
        setByteElement(term386140, 3, (byte) 87);
        setByteElement(term386140, 4, (byte) -35);
        setByteElement(term386140, 5, (byte) -14);
        setByteElement(term386140, 6, (byte) 10);
        setByteElement(term386140, 7, (byte) 65);
        setByteElement(term386140, 8, (byte) -44);
        setField(term386139, term386139.getClass(), "buf", term386140);
        setIntField(term386139, term386139.getClass(), "pos", 1398204340);
        setField(term386139, term386139.getClass(), "in", null);
        setField(term386138, term386138.getClass(), "in", term386139);
        setByteElement(term386152, 0, (byte) 115);
        setByteElement(term386152, 1, (byte) -32);
        setByteElement(term386152, 2, (byte) -52);
        setByteElement(term386152, 3, (byte) 53);
        setByteElement(term386152, 4, (byte) 44);
        setByteElement(term386152, 5, (byte) 49);
        setByteElement(term386152, 6, (byte) 114);
        setField(term386151, term386151.getClass(), "bytes", term386152);
        setField(term386151, term386151.getClass(), "description", "xrwlQZdwCp");
        setField(term386138, term386138.getClass(), "bom", term386151);
        setBooleanField(term386138, term386138.getClass(), "skipped", false);
        term386173 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term386173;
        callMethod(klass, "mark", argTypes, term386138, args);
    }

};


