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

public class PkgInt_unpack_3660627695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393704;
     Object term393715;

    public PkgInt_unpack_3660627695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393704 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt"));
        int[] term393709 = (int[]) newIntArray(5);
        setIntField(term393704, term393704.getClass(), "indexShift", -1410220680);
        setIntField(term393704, term393704.getClass(), "shiftMask", 389427431);
        setIntField(term393704, term393704.getClass(), "bitShift", -1945706126);
        setIntField(term393704, term393704.getClass(), "unitMask", 1152356969);
        setIntElement(term393709, 0, -1667990367);
        setIntElement(term393709, 1, -1214628358);
        setIntElement(term393709, 2, 1102721075);
        setIntElement(term393709, 3, -426764678);
        setIntElement(term393709, 4, -1222614956);
        setField(term393704, term393704.getClass(), "data", term393709);
        term393715 = new Integer(-1870495012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term393715;
        callMethod(klass, "unpack", argTypes, term393704, args);
    }

};


