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

public class PkgInt_pack4bits_12747783664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393688;
     Object term393690;
     Object term393692;
     Object term393694;
     Object term393696;
     Object term393698;
     Object term393700;
     Object term393702;

    public PkgInt_pack4bits_12747783664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393688 = new Integer(-1896376975);
        term393690 = new Integer(729658803);
        term393692 = new Integer(114754804);
        term393694 = new Integer(1687361082);
        term393696 = new Integer(584893196);
        term393698 = new Integer(497269071);
        term393700 = new Integer(-1899301124);
        term393702 = new Integer(-1882480155);
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
        args[0] = term393688;
        args[1] = term393690;
        args[2] = term393692;
        args[3] = term393694;
        args[4] = term393696;
        args[5] = term393698;
        args[6] = term393700;
        args[7] = term393702;
        callMethod(klass, "pack4bits", argTypes, null, args);
    }

};


