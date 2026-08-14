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

public class CharDistributionAnalysis_handleOneChar_11144849501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10790;
     Object term10794;
     Object term10796;

    public CharDistributionAnalysis_handleOneChar_11144849501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10790 = (byte[]) newByteArray(3);
        setByteElement(term10790, 0, (byte) 79);
        setByteElement(term10790, 1, (byte) -119);
        setByteElement(term10790, 2, (byte) -66);
        term10794 = new Integer(-616727354);
        term10796 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.CharDistributionAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term10790;
        args[1] = term10794;
        args[2] = term10796;
        callMethod(klass, "handleOneChar", argTypes, null, args);
    }

};


