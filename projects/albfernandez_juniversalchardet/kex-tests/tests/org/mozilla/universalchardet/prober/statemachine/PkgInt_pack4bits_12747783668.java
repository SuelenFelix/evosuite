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

public class PkgInt_pack4bits_12747783668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term135;
     Object term137;
     Object term139;
     Object term141;
     Object term143;
     Object term145;
     Object term147;
     Object term149;

    public PkgInt_pack4bits_12747783668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        setIntField(term130, term130.getClass(), "indexShift", 0);
        setIntField(term130, term130.getClass(), "shiftMask", 0);
        setIntField(term130, term130.getClass(), "bitShift", 0);
        setIntField(term130, term130.getClass(), "unitMask", 0);
        setField(term130, term130.getClass(), "data", null);
        term135 = new Integer(0);
        term137 = new Integer(0);
        term139 = new Integer(0);
        term141 = new Integer(0);
        term143 = new Integer(0);
        term145 = new Integer(0);
        term147 = new Integer(0);
        term149 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term135;
        args[1] = term137;
        args[2] = term139;
        args[3] = term141;
        args[4] = term143;
        args[5] = term145;
        args[6] = term147;
        args[7] = term149;
        callMethod(klass, "pack4bits", argTypes, term130, args);
    }

};


