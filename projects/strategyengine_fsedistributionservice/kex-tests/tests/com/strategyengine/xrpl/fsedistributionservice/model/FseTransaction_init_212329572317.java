package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class FseTransaction_init_212329572317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603325;
     Object term603327;
     Object term603404;

    public FseTransaction_init_212329572317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603325 = newInstance(Class.forName("java.util.Date"));
        setLongField(term603325, term603325.getClass(), "fastTime", 1665877994545L);
        setField(term603325, term603325.getClass(), "cdate", null);
        term603327 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603328 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603330 = (int[]) newIntArray(6);
        setIntField(term603328, term603328.getClass(), "signum", 1);
        setIntElement(term603330, 0, 15785);
        setIntElement(term603330, 1, -1364521687);
        setIntElement(term603330, 2, -1049632157);
        setIntElement(term603330, 3, 1068180156);
        setIntElement(term603330, 4, 208883539);
        setIntElement(term603330, 5, 1774363417);
        setField(term603328, term603328.getClass(), "mag", term603330);
        setIntField(term603328, term603328.getClass(), "bitCountPlusOne", 0);
        setIntField(term603328, term603328.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603328, term603328.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603328, term603328.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603327, term603327.getClass(), "intVal", term603328);
        setIntField(term603327, term603327.getClass(), "scale", 53);
        setIntField(term603327, term603327.getClass(), "precision", 0);
        setField(term603327, term603327.getClass(), "stringCache", null);
        setLongField(term603327, term603327.getClass(), "intCompact", -9223372036854775808L);
        term603404 = new Long(8346326079558512850L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.math.BigDecimal");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.Long");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term603325;
        args[1] = term603327;
        args[2] = "TZWChNggbR";
        args[3] = "BdVKUioRZB";
        args[4] = "KmcVYqMyAn";
        args[5] = "nnmhGenvZB";
        args[6] = "WAqAYqgwuP";
        args[7] = term603404;
        args[8] = "kwMgnfULWA";
        args[9] = "JNvqAwFwOT";
        args[10] = "UiwUKKcPGt";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


