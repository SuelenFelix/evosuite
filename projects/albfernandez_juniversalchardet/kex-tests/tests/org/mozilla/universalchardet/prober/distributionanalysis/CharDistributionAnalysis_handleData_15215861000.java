package org.mozilla.universalchardet.prober.distributionanalysis;

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
import static org.mozilla.universalchardet.prober.distributionanalysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CharDistributionAnalysis_handleData_15215861000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10777;
     Object term10782;
     Object term10784;

    public CharDistributionAnalysis_handleData_15215861000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10777 = (byte[]) newByteArray(4);
        setByteElement(term10777, 0, (byte) -58);
        setByteElement(term10777, 1, (byte) -29);
        setByteElement(term10777, 2, (byte) -54);
        setByteElement(term10777, 3, (byte) -10);
        term10782 = new Integer(391863371);
        term10784 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.CharDistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term10777;
        args[1] = term10782;
        args[2] = term10784;
        callMethod(klass, "handleData", argTypes, null, args);
    }

};


