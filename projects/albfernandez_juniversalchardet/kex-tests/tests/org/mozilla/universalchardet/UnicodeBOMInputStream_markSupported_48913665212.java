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

public class UnicodeBOMInputStream_markSupported_48913665212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386256;

    public UnicodeBOMInputStream_markSupported_48913665212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386256 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386257 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386258 = (byte[]) newByteArray(9);
        Object term386269 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386270 = (byte[]) newByteArray(7);
        setByteElement(term386258, 0, (byte) 109);
        setByteElement(term386258, 1, (byte) 17);
        setByteElement(term386258, 2, (byte) -126);
        setByteElement(term386258, 3, (byte) 35);
        setByteElement(term386258, 4, (byte) -46);
        setByteElement(term386258, 5, (byte) -14);
        setByteElement(term386258, 6, (byte) 124);
        setByteElement(term386258, 7, (byte) -124);
        setByteElement(term386258, 8, (byte) -72);
        setField(term386257, term386257.getClass(), "buf", term386258);
        setIntField(term386257, term386257.getClass(), "pos", -243422082);
        setField(term386257, term386257.getClass(), "in", null);
        setField(term386256, term386256.getClass(), "in", term386257);
        setByteElement(term386270, 0, (byte) 90);
        setByteElement(term386270, 1, (byte) -34);
        setByteElement(term386270, 2, (byte) -2);
        setByteElement(term386270, 3, (byte) 96);
        setByteElement(term386270, 4, (byte) 55);
        setByteElement(term386270, 5, (byte) -103);
        setByteElement(term386270, 6, (byte) -103);
        setField(term386269, term386269.getClass(), "bytes", term386270);
        setField(term386269, term386269.getClass(), "description", "nyiiPDVjAc");
        setField(term386256, term386256.getClass(), "bom", term386269);
        setBooleanField(term386256, term386256.getClass(), "skipped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markSupported", argTypes, term386256, args);
    }

};


