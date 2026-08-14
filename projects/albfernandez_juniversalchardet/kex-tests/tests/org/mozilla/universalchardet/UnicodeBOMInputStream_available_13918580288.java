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

public class UnicodeBOMInputStream_available_13918580288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386058;

    public UnicodeBOMInputStream_available_13918580288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386058 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386059 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386060 = (byte[]) newByteArray(0);
        Object term386062 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386063 = (byte[]) newByteArray(2);
        setField(term386059, term386059.getClass(), "buf", term386060);
        setIntField(term386059, term386059.getClass(), "pos", 1283079251);
        setField(term386059, term386059.getClass(), "in", null);
        setField(term386058, term386058.getClass(), "in", term386059);
        setByteElement(term386063, 0, (byte) 77);
        setByteElement(term386063, 1, (byte) -1);
        setField(term386062, term386062.getClass(), "bytes", term386063);
        setField(term386062, term386062.getClass(), "description", "kuTXqwMtDB");
        setField(term386058, term386058.getClass(), "bom", term386062);
        setBooleanField(term386058, term386058.getClass(), "skipped", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "available", argTypes, term386058, args);
    }

};


