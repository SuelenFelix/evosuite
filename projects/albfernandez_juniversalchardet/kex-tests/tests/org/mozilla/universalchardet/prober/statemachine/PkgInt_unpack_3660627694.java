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

public class PkgInt_unpack_3660627694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term94;

    public PkgInt_unpack_3660627694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term89 = (int[]) newIntArray(4);
        setIntField(term84, term84.getClass(), "indexShift", -1087774327);
        setIntField(term84, term84.getClass(), "shiftMask", -1530420153);
        setIntField(term84, term84.getClass(), "bitShift", -469968304);
        setIntField(term84, term84.getClass(), "unitMask", -1145578966);
        setIntElement(term89, 0, 679763016);
        setIntElement(term89, 1, 1962444399);
        setIntElement(term89, 2, 767834723);
        setIntElement(term89, 3, -602026508);
        setField(term84, term84.getClass(), "data", term89);
        term94 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94;
        callMethod(klass, "unpack", argTypes, term84, args);
    }

};


