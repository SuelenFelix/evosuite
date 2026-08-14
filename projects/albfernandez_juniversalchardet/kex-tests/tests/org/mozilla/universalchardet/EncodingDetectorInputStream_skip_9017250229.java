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
import java.lang.Long;

public class EncodingDetectorInputStream_skip_9017250229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389309;
     Object term389343;

    public EncodingDetectorInputStream_skip_9017250229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term389346 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term389345 = ((Class) term389346).getDeclaredField((String) "PURE_ASCII");
        ((Field) term389345).setAccessible(true);
        Object enum87 = ((Field) term389345).get((Object) null);
        term389309 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term389310 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term389342 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term389309, term389309.getClass(), "in", null);
        setField(term389310, term389310.getClass(), "inputState", enum87);
        setBooleanField(term389310, term389310.getClass(), "done", false);
        setBooleanField(term389310, term389310.getClass(), "start", true);
        setBooleanField(term389310, term389310.getClass(), "gotData", true);
        setBooleanField(term389310, term389310.getClass(), "onlyPrintableASCII", true);
        setByteField(term389310, term389310.getClass(), "lastChar", (byte) -60);
        setField(term389310, term389310.getClass(), "detectedCharset", "LvtrsXUliU");
        setField(term389310, term389310.getClass(), "probers", term389342);
        setField(term389310, term389310.getClass(), "escCharsetProber", null);
        setField(term389310, term389310.getClass(), "listener", null);
        setField(term389309, term389309.getClass(), "detector", term389310);
        term389343 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term389343;
        callMethod(klass, "skip", argTypes, term389309, args);
    }

};


