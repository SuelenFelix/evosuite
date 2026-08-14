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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Cpu_stackPush_197309825177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201955;
     Object term202049;

    public Cpu_stackPush_197309825177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202052 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term202051 = ((Class) term202052).getDeclaredField((String) "NMOS_6502");
        ((Field) term202051).setAccessible(true);
        Object enum257 = ((Field) term202051).get((Object) null);
        HashMap term201981 = new HashMap();
        HashMap term202015 = new HashMap();
        term201955 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201970 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201973 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201975 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201978 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term201986 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term201987 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term201995 = (int[]) newIntArray(2);
        int[] term201998 = (int[]) newIntArray(2);
        Object[] term202020 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term202021 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term202029 = (int[]) newIntArray(2);
        int[] term202032 = (int[]) newIntArray(2);
        setLongField(term201955, term201955.getClass(), "clockPeriodInNs", 1000L);
        setField(term201955, term201955.getClass(), "behavior", enum257);
        setIntField(term201970, term201970.getClass(), "startAddress", 1213549602);
        setIntField(term201970, term201970.getClass(), "endAddress", -1638897284);
        setLongField(term201973, term201973.getClass(), "clockPeriodInNs", 1000L);
        setField(term201973, term201973.getClass(), "behavior", enum257);
        setIntField(term201975, term201975.getClass(), "startAddress", -1998048906);
        setIntField(term201975, term201975.getClass(), "endAddress", -1915332852);
        setLongField(term201978, term201978.getClass(), "clockPeriodInNs", 1000L);
        setField(term201978, term201978.getClass(), "behavior", enum257);
        setField(term201978, term201978.getClass(), "bus", null);
        setField(term201978, term201978.getClass(), "state", null);
        setLongField(term201978, term201978.getClass(), "opBeginTime", -5824480506846704461L);
        setField(term201975, term201975.getClass(), "cpu", term201978);
        setField(term201975, term201975.getClass(), "deviceMap", term201981);
        setField(term201975, term201975.getClass(), "deviceAddressArray", term201986);
        setField(term201973, term201973.getClass(), "bus", term201975);
        setIntField(term201987, term201987.getClass(), "a", 0);
        setIntField(term201987, term201987.getClass(), "x", 0);
        setIntField(term201987, term201987.getClass(), "y", 0);
        setIntField(term201987, term201987.getClass(), "sp", 0);
        setIntField(term201987, term201987.getClass(), "pc", 0);
        setIntField(term201987, term201987.getClass(), "ir", 0);
        setIntField(term201987, term201987.getClass(), "nextIr", 0);
        setField(term201987, term201987.getClass(), "args", term201995);
        setField(term201987, term201987.getClass(), "nextArgs", term201998);
        setIntField(term201987, term201987.getClass(), "instSize", 0);
        setBooleanField(term201987, term201987.getClass(), "opTrap", false);
        setBooleanField(term201987, term201987.getClass(), "irqAsserted", false);
        setBooleanField(term201987, term201987.getClass(), "nmiAsserted", false);
        setIntField(term201987, term201987.getClass(), "lastPc", 0);
        setBooleanField(term201987, term201987.getClass(), "carryFlag", false);
        setBooleanField(term201987, term201987.getClass(), "negativeFlag", false);
        setBooleanField(term201987, term201987.getClass(), "zeroFlag", false);
        setBooleanField(term201987, term201987.getClass(), "irqDisableFlag", false);
        setBooleanField(term201987, term201987.getClass(), "decimalModeFlag", false);
        setBooleanField(term201987, term201987.getClass(), "breakFlag", false);
        setBooleanField(term201987, term201987.getClass(), "overflowFlag", false);
        setLongField(term201987, term201987.getClass(), "stepCounter", 0L);
        setField(term201973, term201973.getClass(), "state", term201987);
        setLongField(term201973, term201973.getClass(), "opBeginTime", 3429445910087803709L);
        setField(term201970, term201970.getClass(), "cpu", term201973);
        setField(term201970, term201970.getClass(), "deviceMap", term202015);
        setField(term201970, term201970.getClass(), "deviceAddressArray", term202020);
        setField(term201955, term201955.getClass(), "bus", term201970);
        setIntField(term202021, term202021.getClass(), "a", 0);
        setIntField(term202021, term202021.getClass(), "x", 0);
        setIntField(term202021, term202021.getClass(), "y", 0);
        setIntField(term202021, term202021.getClass(), "sp", 0);
        setIntField(term202021, term202021.getClass(), "pc", 0);
        setIntField(term202021, term202021.getClass(), "ir", 0);
        setIntField(term202021, term202021.getClass(), "nextIr", 0);
        setField(term202021, term202021.getClass(), "args", term202029);
        setField(term202021, term202021.getClass(), "nextArgs", term202032);
        setIntField(term202021, term202021.getClass(), "instSize", 0);
        setBooleanField(term202021, term202021.getClass(), "opTrap", false);
        setBooleanField(term202021, term202021.getClass(), "irqAsserted", false);
        setBooleanField(term202021, term202021.getClass(), "nmiAsserted", false);
        setIntField(term202021, term202021.getClass(), "lastPc", 0);
        setBooleanField(term202021, term202021.getClass(), "carryFlag", false);
        setBooleanField(term202021, term202021.getClass(), "negativeFlag", false);
        setBooleanField(term202021, term202021.getClass(), "zeroFlag", false);
        setBooleanField(term202021, term202021.getClass(), "irqDisableFlag", false);
        setBooleanField(term202021, term202021.getClass(), "decimalModeFlag", false);
        setBooleanField(term202021, term202021.getClass(), "breakFlag", false);
        setBooleanField(term202021, term202021.getClass(), "overflowFlag", false);
        setLongField(term202021, term202021.getClass(), "stepCounter", 0L);
        setField(term201955, term201955.getClass(), "state", term202021);
        setLongField(term201955, term201955.getClass(), "opBeginTime", 6844542874326058740L);
        term202049 = new Integer(-319938895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term202049;
        callMethod(klass, "stackPush", argTypes, term201955, args);
    }

};


