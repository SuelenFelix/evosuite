package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CpuState_getProcessorStatusString_8893532045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82754;

    public CpuState_getProcessorStatusString_8893532045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82754 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term82762 = (int[]) newIntArray(2);
        int[] term82765 = (int[]) newIntArray(2);
        setIntField(term82754, term82754.getClass(), "a", 1636460194);
        setIntField(term82754, term82754.getClass(), "x", -1926178417);
        setIntField(term82754, term82754.getClass(), "y", -1011180309);
        setIntField(term82754, term82754.getClass(), "sp", -342719145);
        setIntField(term82754, term82754.getClass(), "pc", 2101766592);
        setIntField(term82754, term82754.getClass(), "ir", 802196878);
        setIntField(term82754, term82754.getClass(), "nextIr", -174401540);
        setField(term82754, term82754.getClass(), "args", term82762);
        setField(term82754, term82754.getClass(), "nextArgs", term82765);
        setIntField(term82754, term82754.getClass(), "instSize", -1881073314);
        setBooleanField(term82754, term82754.getClass(), "opTrap", true);
        setBooleanField(term82754, term82754.getClass(), "irqAsserted", true);
        setBooleanField(term82754, term82754.getClass(), "nmiAsserted", false);
        setIntField(term82754, term82754.getClass(), "lastPc", -1902513009);
        setBooleanField(term82754, term82754.getClass(), "carryFlag", true);
        setBooleanField(term82754, term82754.getClass(), "negativeFlag", false);
        setBooleanField(term82754, term82754.getClass(), "zeroFlag", false);
        setBooleanField(term82754, term82754.getClass(), "irqDisableFlag", false);
        setBooleanField(term82754, term82754.getClass(), "decimalModeFlag", true);
        setBooleanField(term82754, term82754.getClass(), "breakFlag", false);
        setBooleanField(term82754, term82754.getClass(), "overflowFlag", false);
        setLongField(term82754, term82754.getClass(), "stepCounter", -6237686742902369498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcessorStatusString", argTypes, term82754, args);
    }

};


