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

public class CpuState_toTraceEvent_14560833878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82785;

    public CpuState_toTraceEvent_14560833878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82785 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        setIntField(term82785, term82785.getClass(), "a", 0);
        setIntField(term82785, term82785.getClass(), "x", 0);
        setIntField(term82785, term82785.getClass(), "y", 0);
        setIntField(term82785, term82785.getClass(), "sp", 0);
        setIntField(term82785, term82785.getClass(), "pc", 0);
        setIntField(term82785, term82785.getClass(), "ir", 0);
        setIntField(term82785, term82785.getClass(), "nextIr", 0);
        setField(term82785, term82785.getClass(), "args", null);
        setField(term82785, term82785.getClass(), "nextArgs", null);
        setIntField(term82785, term82785.getClass(), "instSize", 0);
        setBooleanField(term82785, term82785.getClass(), "opTrap", false);
        setBooleanField(term82785, term82785.getClass(), "irqAsserted", false);
        setBooleanField(term82785, term82785.getClass(), "nmiAsserted", false);
        setIntField(term82785, term82785.getClass(), "lastPc", 0);
        setBooleanField(term82785, term82785.getClass(), "carryFlag", false);
        setBooleanField(term82785, term82785.getClass(), "negativeFlag", false);
        setBooleanField(term82785, term82785.getClass(), "zeroFlag", false);
        setBooleanField(term82785, term82785.getClass(), "irqDisableFlag", false);
        setBooleanField(term82785, term82785.getClass(), "decimalModeFlag", false);
        setBooleanField(term82785, term82785.getClass(), "breakFlag", false);
        setBooleanField(term82785, term82785.getClass(), "overflowFlag", false);
        setLongField(term82785, term82785.getClass(), "stepCounter", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toTraceEvent", argTypes, term82785, args);
    }

};


