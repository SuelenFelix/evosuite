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

public class EncodingDetectorInputStream_read_9361481055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387815;

    public EncodingDetectorInputStream_read_9361481055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term387850 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term387849 = ((Class) term387850).getDeclaredField((String) "PURE_ASCII");
        ((Field) term387849).setAccessible(true);
        Object enum83 = ((Field) term387849).get((Object) null);
        term387815 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term387816 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term387848 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term387815, term387815.getClass(), "in", null);
        setField(term387816, term387816.getClass(), "inputState", enum83);
        setBooleanField(term387816, term387816.getClass(), "done", false);
        setBooleanField(term387816, term387816.getClass(), "start", true);
        setBooleanField(term387816, term387816.getClass(), "gotData", false);
        setBooleanField(term387816, term387816.getClass(), "onlyPrintableASCII", true);
        setByteField(term387816, term387816.getClass(), "lastChar", (byte) 115);
        setField(term387816, term387816.getClass(), "detectedCharset", "hxCBltsObl");
        setField(term387816, term387816.getClass(), "probers", term387848);
        setField(term387816, term387816.getClass(), "escCharsetProber", null);
        setField(term387816, term387816.getClass(), "listener", null);
        setField(term387815, term387815.getClass(), "detector", term387816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term387815, args);
    }

};


