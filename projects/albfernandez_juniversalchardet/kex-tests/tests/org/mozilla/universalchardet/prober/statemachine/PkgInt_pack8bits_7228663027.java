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

public class PkgInt_pack8bits_7228663027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;
     Object term122;
     Object term124;
     Object term126;
     Object term128;

    public PkgInt_pack8bits_7228663027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        setIntField(term117, term117.getClass(), "indexShift", 0);
        setIntField(term117, term117.getClass(), "shiftMask", 0);
        setIntField(term117, term117.getClass(), "bitShift", 0);
        setIntField(term117, term117.getClass(), "unitMask", 0);
        setField(term117, term117.getClass(), "data", null);
        term122 = new Integer(0);
        term124 = new Integer(0);
        term126 = new Integer(0);
        term128 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term122;
        args[1] = term124;
        args[2] = term126;
        args[3] = term128;
        callMethod(klass, "pack8bits", argTypes, term117, args);
    }

};


