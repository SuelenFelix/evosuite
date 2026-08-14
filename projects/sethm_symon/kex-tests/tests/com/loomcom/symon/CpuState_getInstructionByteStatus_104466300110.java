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

public class CpuState_getInstructionByteStatus_104466300110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82827;

    public CpuState_getInstructionByteStatus_104466300110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82827 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        setIntField(term82827, term82827.getClass(), "a", 0);
        setIntField(term82827, term82827.getClass(), "x", 0);
        setIntField(term82827, term82827.getClass(), "y", 0);
        setIntField(term82827, term82827.getClass(), "sp", 0);
        setIntField(term82827, term82827.getClass(), "pc", 0);
        setIntField(term82827, term82827.getClass(), "ir", 0);
        setIntField(term82827, term82827.getClass(), "nextIr", 0);
        setField(term82827, term82827.getClass(), "args", null);
        setField(term82827, term82827.getClass(), "nextArgs", null);
        setIntField(term82827, term82827.getClass(), "instSize", 0);
        setBooleanField(term82827, term82827.getClass(), "opTrap", false);
        setBooleanField(term82827, term82827.getClass(), "irqAsserted", false);
        setBooleanField(term82827, term82827.getClass(), "nmiAsserted", false);
        setIntField(term82827, term82827.getClass(), "lastPc", 0);
        setBooleanField(term82827, term82827.getClass(), "carryFlag", false);
        setBooleanField(term82827, term82827.getClass(), "negativeFlag", false);
        setBooleanField(term82827, term82827.getClass(), "zeroFlag", false);
        setBooleanField(term82827, term82827.getClass(), "irqDisableFlag", false);
        setBooleanField(term82827, term82827.getClass(), "decimalModeFlag", false);
        setBooleanField(term82827, term82827.getClass(), "breakFlag", false);
        setBooleanField(term82827, term82827.getClass(), "overflowFlag", false);
        setLongField(term82827, term82827.getClass(), "stepCounter", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstructionByteStatus", argTypes, term82827, args);
    }

};


