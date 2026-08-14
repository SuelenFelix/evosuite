package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EscCharsetProber_handleData_103593573211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312574;
     Object term312577;
     Object term312579;

    public EscCharsetProber_handleData_103593573211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312574 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        setField(term312574, term312574.getClass(), "codingSM", null);
        setIntField(term312574, term312574.getClass(), "activeSM", 0);
        setField(term312574, term312574.getClass(), "state", null);
        setField(term312574, term312574.getClass(), "detectedCharset", null);
        setBooleanField(term312574, term312574.getClass(), "active", false);
        term312577 = new Integer(0);
        term312579 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term312577;
        args[2] = term312579;
        callMethod(klass, "handleData", argTypes, term312574, args);
    }

};


