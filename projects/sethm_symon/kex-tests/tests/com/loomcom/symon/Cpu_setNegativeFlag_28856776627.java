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
import java.lang.Boolean;

public class Cpu_setNegativeFlag_28856776627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183635;
     Object term183729;

    public Cpu_setNegativeFlag_28856776627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term183732 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term183731 = ((Class) term183732).getDeclaredField((String) "NMOS_6502");
        ((Field) term183731).setAccessible(true);
        Object enum207 = ((Field) term183731).get((Object) null);
        HashMap term183661 = new HashMap();
        HashMap term183695 = new HashMap();
        term183635 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term183650 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term183653 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term183655 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term183658 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term183666 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term183667 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term183675 = (int[]) newIntArray(2);
        int[] term183678 = (int[]) newIntArray(2);
        Object[] term183700 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term183701 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term183709 = (int[]) newIntArray(2);
        int[] term183712 = (int[]) newIntArray(2);
        setLongField(term183635, term183635.getClass(), "clockPeriodInNs", 1000L);
        setField(term183635, term183635.getClass(), "behavior", enum207);
        setIntField(term183650, term183650.getClass(), "startAddress", -352388461);
        setIntField(term183650, term183650.getClass(), "endAddress", -476722971);
        setLongField(term183653, term183653.getClass(), "clockPeriodInNs", 1000L);
        setField(term183653, term183653.getClass(), "behavior", enum207);
        setIntField(term183655, term183655.getClass(), "startAddress", -1727779935);
        setIntField(term183655, term183655.getClass(), "endAddress", 621731188);
        setLongField(term183658, term183658.getClass(), "clockPeriodInNs", 1000L);
        setField(term183658, term183658.getClass(), "behavior", enum207);
        setField(term183658, term183658.getClass(), "bus", null);
        setField(term183658, term183658.getClass(), "state", null);
        setLongField(term183658, term183658.getClass(), "opBeginTime", 3410627884495049043L);
        setField(term183655, term183655.getClass(), "cpu", term183658);
        setField(term183655, term183655.getClass(), "deviceMap", term183661);
        setField(term183655, term183655.getClass(), "deviceAddressArray", term183666);
        setField(term183653, term183653.getClass(), "bus", term183655);
        setIntField(term183667, term183667.getClass(), "a", 0);
        setIntField(term183667, term183667.getClass(), "x", 0);
        setIntField(term183667, term183667.getClass(), "y", 0);
        setIntField(term183667, term183667.getClass(), "sp", 0);
        setIntField(term183667, term183667.getClass(), "pc", 0);
        setIntField(term183667, term183667.getClass(), "ir", 0);
        setIntField(term183667, term183667.getClass(), "nextIr", 0);
        setField(term183667, term183667.getClass(), "args", term183675);
        setField(term183667, term183667.getClass(), "nextArgs", term183678);
        setIntField(term183667, term183667.getClass(), "instSize", 0);
        setBooleanField(term183667, term183667.getClass(), "opTrap", false);
        setBooleanField(term183667, term183667.getClass(), "irqAsserted", false);
        setBooleanField(term183667, term183667.getClass(), "nmiAsserted", false);
        setIntField(term183667, term183667.getClass(), "lastPc", 0);
        setBooleanField(term183667, term183667.getClass(), "carryFlag", false);
        setBooleanField(term183667, term183667.getClass(), "negativeFlag", false);
        setBooleanField(term183667, term183667.getClass(), "zeroFlag", false);
        setBooleanField(term183667, term183667.getClass(), "irqDisableFlag", false);
        setBooleanField(term183667, term183667.getClass(), "decimalModeFlag", false);
        setBooleanField(term183667, term183667.getClass(), "breakFlag", false);
        setBooleanField(term183667, term183667.getClass(), "overflowFlag", false);
        setLongField(term183667, term183667.getClass(), "stepCounter", 0L);
        setField(term183653, term183653.getClass(), "state", term183667);
        setLongField(term183653, term183653.getClass(), "opBeginTime", -1884609063652624817L);
        setField(term183650, term183650.getClass(), "cpu", term183653);
        setField(term183650, term183650.getClass(), "deviceMap", term183695);
        setField(term183650, term183650.getClass(), "deviceAddressArray", term183700);
        setField(term183635, term183635.getClass(), "bus", term183650);
        setIntField(term183701, term183701.getClass(), "a", 0);
        setIntField(term183701, term183701.getClass(), "x", 0);
        setIntField(term183701, term183701.getClass(), "y", 0);
        setIntField(term183701, term183701.getClass(), "sp", 0);
        setIntField(term183701, term183701.getClass(), "pc", 0);
        setIntField(term183701, term183701.getClass(), "ir", 0);
        setIntField(term183701, term183701.getClass(), "nextIr", 0);
        setField(term183701, term183701.getClass(), "args", term183709);
        setField(term183701, term183701.getClass(), "nextArgs", term183712);
        setIntField(term183701, term183701.getClass(), "instSize", 0);
        setBooleanField(term183701, term183701.getClass(), "opTrap", false);
        setBooleanField(term183701, term183701.getClass(), "irqAsserted", false);
        setBooleanField(term183701, term183701.getClass(), "nmiAsserted", false);
        setIntField(term183701, term183701.getClass(), "lastPc", 0);
        setBooleanField(term183701, term183701.getClass(), "carryFlag", false);
        setBooleanField(term183701, term183701.getClass(), "negativeFlag", false);
        setBooleanField(term183701, term183701.getClass(), "zeroFlag", false);
        setBooleanField(term183701, term183701.getClass(), "irqDisableFlag", false);
        setBooleanField(term183701, term183701.getClass(), "decimalModeFlag", false);
        setBooleanField(term183701, term183701.getClass(), "breakFlag", false);
        setBooleanField(term183701, term183701.getClass(), "overflowFlag", false);
        setLongField(term183701, term183701.getClass(), "stepCounter", 0L);
        setField(term183635, term183635.getClass(), "state", term183701);
        setLongField(term183635, term183635.getClass(), "opBeginTime", 4110677574531044171L);
        term183729 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term183729;
        callMethod(klass, "setNegativeFlag", argTypes, term183635, args);
    }

};


