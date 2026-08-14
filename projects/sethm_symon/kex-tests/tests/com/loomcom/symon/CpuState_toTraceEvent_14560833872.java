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

public class CpuState_toTraceEvent_14560833872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82661;

    public CpuState_toTraceEvent_14560833872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82661 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term82669 = (int[]) newIntArray(2);
        int[] term82672 = (int[]) newIntArray(2);
        setIntField(term82661, term82661.getClass(), "a", 13757525);
        setIntField(term82661, term82661.getClass(), "x", 77853966);
        setIntField(term82661, term82661.getClass(), "y", 1451393741);
        setIntField(term82661, term82661.getClass(), "sp", -1115815564);
        setIntField(term82661, term82661.getClass(), "pc", 425132480);
        setIntField(term82661, term82661.getClass(), "ir", 1968674006);
        setIntField(term82661, term82661.getClass(), "nextIr", -634536248);
        setField(term82661, term82661.getClass(), "args", term82669);
        setField(term82661, term82661.getClass(), "nextArgs", term82672);
        setIntField(term82661, term82661.getClass(), "instSize", 1090329667);
        setBooleanField(term82661, term82661.getClass(), "opTrap", false);
        setBooleanField(term82661, term82661.getClass(), "irqAsserted", false);
        setBooleanField(term82661, term82661.getClass(), "nmiAsserted", false);
        setIntField(term82661, term82661.getClass(), "lastPc", -1082123686);
        setBooleanField(term82661, term82661.getClass(), "carryFlag", true);
        setBooleanField(term82661, term82661.getClass(), "negativeFlag", true);
        setBooleanField(term82661, term82661.getClass(), "zeroFlag", false);
        setBooleanField(term82661, term82661.getClass(), "irqDisableFlag", true);
        setBooleanField(term82661, term82661.getClass(), "decimalModeFlag", false);
        setBooleanField(term82661, term82661.getClass(), "breakFlag", false);
        setBooleanField(term82661, term82661.getClass(), "overflowFlag", false);
        setLongField(term82661, term82661.getClass(), "stepCounter", -6423955170741487890L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toTraceEvent", argTypes, term82661, args);
    }

};


