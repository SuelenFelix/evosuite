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

public class UnicodeBOMInputStream_reset_61415655811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386201;

    public UnicodeBOMInputStream_reset_61415655811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386201 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386202 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386203 = (byte[]) newByteArray(6);
        Object term386211 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386212 = (byte[]) newByteArray(7);
        setByteElement(term386203, 0, (byte) -81);
        setByteElement(term386203, 1, (byte) 127);
        setByteElement(term386203, 2, (byte) -24);
        setByteElement(term386203, 3, (byte) -89);
        setByteElement(term386203, 4, (byte) -35);
        setByteElement(term386203, 5, (byte) -59);
        setField(term386202, term386202.getClass(), "buf", term386203);
        setIntField(term386202, term386202.getClass(), "pos", -461771056);
        setField(term386202, term386202.getClass(), "in", null);
        setField(term386201, term386201.getClass(), "in", term386202);
        setByteElement(term386212, 0, (byte) 73);
        setByteElement(term386212, 1, (byte) 94);
        setByteElement(term386212, 2, (byte) 114);
        setByteElement(term386212, 3, (byte) 110);
        setByteElement(term386212, 4, (byte) 70);
        setByteElement(term386212, 5, (byte) -46);
        setByteElement(term386212, 6, (byte) -78);
        setField(term386211, term386211.getClass(), "bytes", term386212);
        setField(term386211, term386211.getClass(), "description", "IDCWpPLRkE");
        setField(term386201, term386201.getClass(), "bom", term386211);
        setBooleanField(term386201, term386201.getClass(), "skipped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term386201, args);
    }

};


