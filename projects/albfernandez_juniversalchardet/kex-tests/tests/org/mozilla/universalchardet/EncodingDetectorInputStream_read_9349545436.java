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
import java.lang.String;
import java.lang.Integer;

public class EncodingDetectorInputStream_read_9349545436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388181;
     Object term388215;
     Object term388222;
     Object term388224;

    public EncodingDetectorInputStream_read_9349545436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term388227 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term388226 = ((Class) term388227).getDeclaredField((String) "PURE_ASCII");
        ((Field) term388226).setAccessible(true);
        Object enum84 = ((Field) term388226).get((Object) null);
        term388181 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term388182 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term388214 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term388181, term388181.getClass(), "in", null);
        setField(term388182, term388182.getClass(), "inputState", enum84);
        setBooleanField(term388182, term388182.getClass(), "done", false);
        setBooleanField(term388182, term388182.getClass(), "start", true);
        setBooleanField(term388182, term388182.getClass(), "gotData", false);
        setBooleanField(term388182, term388182.getClass(), "onlyPrintableASCII", true);
        setByteField(term388182, term388182.getClass(), "lastChar", (byte) 52);
        setField(term388182, term388182.getClass(), "detectedCharset", "BndsHwAFMv");
        setField(term388182, term388182.getClass(), "probers", term388214);
        setField(term388182, term388182.getClass(), "escCharsetProber", null);
        setField(term388182, term388182.getClass(), "listener", null);
        setField(term388181, term388181.getClass(), "detector", term388182);
        term388215 = (byte[]) newByteArray(6);
        setByteElement(term388215, 0, (byte) 96);
        setByteElement(term388215, 1, (byte) 40);
        setByteElement(term388215, 2, (byte) -5);
        setByteElement(term388215, 3, (byte) 24);
        setByteElement(term388215, 4, (byte) -39);
        setByteElement(term388215, 5, (byte) 30);
        term388222 = new Integer(-1002370457);
        term388224 = new Integer(-2014576105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term388215;
        args[1] = term388222;
        args[2] = term388224;
        callMethod(klass, "read", argTypes, term388181, args);
    }

};


