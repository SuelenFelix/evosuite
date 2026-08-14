package org.mozilla.universalchardet.prober.statemachine;

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
import static org.mozilla.universalchardet.prober.statemachine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PkgInt_pack16bits_2283050892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393671;
     Object term393676;
     Object term393678;

    public PkgInt_pack16bits_2283050892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393671 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        setIntField(term393671, term393671.getClass(), "indexShift", 0);
        setIntField(term393671, term393671.getClass(), "shiftMask", 0);
        setIntField(term393671, term393671.getClass(), "bitShift", 0);
        setIntField(term393671, term393671.getClass(), "unitMask", 0);
        setField(term393671, term393671.getClass(), "data", null);
        term393676 = new Integer(0);
        term393678 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term393676;
        args[1] = term393678;
        callMethod(klass, "pack16bits", argTypes, term393671, args);
    }

};


