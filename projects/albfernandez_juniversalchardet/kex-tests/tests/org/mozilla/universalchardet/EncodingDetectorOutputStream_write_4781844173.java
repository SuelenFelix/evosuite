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

public class EncodingDetectorOutputStream_write_4781844173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772;
     Object term806;
     Object term812;
     Object term814;

    public EncodingDetectorOutputStream_write_4781844173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term817 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term816 = ((Class) term817).getDeclaredField((String) "PURE_ASCII");
        ((Field) term816).setAccessible(true);
        Object enum2 = ((Field) term816).get((Object) null);
        term772 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term773 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term805 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term772, term772.getClass(), "out", null);
        setField(term773, term773.getClass(), "inputState", enum2);
        setBooleanField(term773, term773.getClass(), "done", true);
        setBooleanField(term773, term773.getClass(), "start", true);
        setBooleanField(term773, term773.getClass(), "gotData", true);
        setBooleanField(term773, term773.getClass(), "onlyPrintableASCII", true);
        setByteField(term773, term773.getClass(), "lastChar", (byte) 89);
        setField(term773, term773.getClass(), "detectedCharset", "MuLcgQHgqz");
        setField(term773, term773.getClass(), "probers", term805);
        setField(term773, term773.getClass(), "escCharsetProber", null);
        setField(term773, term773.getClass(), "listener", null);
        setField(term772, term772.getClass(), "detector", term773);
        term806 = (byte[]) newByteArray(5);
        setByteElement(term806, 0, (byte) 75);
        setByteElement(term806, 1, (byte) 18);
        setByteElement(term806, 2, (byte) -58);
        setByteElement(term806, 3, (byte) -29);
        setByteElement(term806, 4, (byte) -54);
        term812 = new Integer(568599855);
        term814 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term806;
        args[1] = term812;
        args[2] = term814;
        callMethod(klass, "write", argTypes, term772, args);
    }

};


