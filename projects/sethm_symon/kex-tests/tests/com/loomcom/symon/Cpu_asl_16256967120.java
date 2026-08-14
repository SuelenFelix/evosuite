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

public class Cpu_asl_16256967120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181063;
     Object term181157;

    public Cpu_asl_16256967120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181160 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term181159 = ((Class) term181160).getDeclaredField((String) "NMOS_6502");
        ((Field) term181159).setAccessible(true);
        Object enum200 = ((Field) term181159).get((Object) null);
        HashMap term181089 = new HashMap();
        HashMap term181123 = new HashMap();
        term181063 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181078 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181081 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181083 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181086 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term181094 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term181095 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181103 = (int[]) newIntArray(2);
        int[] term181106 = (int[]) newIntArray(2);
        Object[] term181128 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term181129 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181137 = (int[]) newIntArray(2);
        int[] term181140 = (int[]) newIntArray(2);
        setLongField(term181063, term181063.getClass(), "clockPeriodInNs", 1000L);
        setField(term181063, term181063.getClass(), "behavior", enum200);
        setIntField(term181078, term181078.getClass(), "startAddress", -2039940861);
        setIntField(term181078, term181078.getClass(), "endAddress", 1657238527);
        setLongField(term181081, term181081.getClass(), "clockPeriodInNs", 1000L);
        setField(term181081, term181081.getClass(), "behavior", enum200);
        setIntField(term181083, term181083.getClass(), "startAddress", -1118052096);
        setIntField(term181083, term181083.getClass(), "endAddress", 789771906);
        setLongField(term181086, term181086.getClass(), "clockPeriodInNs", 1000L);
        setField(term181086, term181086.getClass(), "behavior", enum200);
        setField(term181086, term181086.getClass(), "bus", null);
        setField(term181086, term181086.getClass(), "state", null);
        setLongField(term181086, term181086.getClass(), "opBeginTime", 5860114696949347386L);
        setField(term181083, term181083.getClass(), "cpu", term181086);
        setField(term181083, term181083.getClass(), "deviceMap", term181089);
        setField(term181083, term181083.getClass(), "deviceAddressArray", term181094);
        setField(term181081, term181081.getClass(), "bus", term181083);
        setIntField(term181095, term181095.getClass(), "a", 0);
        setIntField(term181095, term181095.getClass(), "x", 0);
        setIntField(term181095, term181095.getClass(), "y", 0);
        setIntField(term181095, term181095.getClass(), "sp", 0);
        setIntField(term181095, term181095.getClass(), "pc", 0);
        setIntField(term181095, term181095.getClass(), "ir", 0);
        setIntField(term181095, term181095.getClass(), "nextIr", 0);
        setField(term181095, term181095.getClass(), "args", term181103);
        setField(term181095, term181095.getClass(), "nextArgs", term181106);
        setIntField(term181095, term181095.getClass(), "instSize", 0);
        setBooleanField(term181095, term181095.getClass(), "opTrap", false);
        setBooleanField(term181095, term181095.getClass(), "irqAsserted", false);
        setBooleanField(term181095, term181095.getClass(), "nmiAsserted", false);
        setIntField(term181095, term181095.getClass(), "lastPc", 0);
        setBooleanField(term181095, term181095.getClass(), "carryFlag", false);
        setBooleanField(term181095, term181095.getClass(), "negativeFlag", false);
        setBooleanField(term181095, term181095.getClass(), "zeroFlag", false);
        setBooleanField(term181095, term181095.getClass(), "irqDisableFlag", false);
        setBooleanField(term181095, term181095.getClass(), "decimalModeFlag", false);
        setBooleanField(term181095, term181095.getClass(), "breakFlag", false);
        setBooleanField(term181095, term181095.getClass(), "overflowFlag", false);
        setLongField(term181095, term181095.getClass(), "stepCounter", 0L);
        setField(term181081, term181081.getClass(), "state", term181095);
        setLongField(term181081, term181081.getClass(), "opBeginTime", 3415381732664403599L);
        setField(term181078, term181078.getClass(), "cpu", term181081);
        setField(term181078, term181078.getClass(), "deviceMap", term181123);
        setField(term181078, term181078.getClass(), "deviceAddressArray", term181128);
        setField(term181063, term181063.getClass(), "bus", term181078);
        setIntField(term181129, term181129.getClass(), "a", 0);
        setIntField(term181129, term181129.getClass(), "x", 0);
        setIntField(term181129, term181129.getClass(), "y", 0);
        setIntField(term181129, term181129.getClass(), "sp", 0);
        setIntField(term181129, term181129.getClass(), "pc", 0);
        setIntField(term181129, term181129.getClass(), "ir", 0);
        setIntField(term181129, term181129.getClass(), "nextIr", 0);
        setField(term181129, term181129.getClass(), "args", term181137);
        setField(term181129, term181129.getClass(), "nextArgs", term181140);
        setIntField(term181129, term181129.getClass(), "instSize", 0);
        setBooleanField(term181129, term181129.getClass(), "opTrap", false);
        setBooleanField(term181129, term181129.getClass(), "irqAsserted", false);
        setBooleanField(term181129, term181129.getClass(), "nmiAsserted", false);
        setIntField(term181129, term181129.getClass(), "lastPc", 0);
        setBooleanField(term181129, term181129.getClass(), "carryFlag", false);
        setBooleanField(term181129, term181129.getClass(), "negativeFlag", false);
        setBooleanField(term181129, term181129.getClass(), "zeroFlag", false);
        setBooleanField(term181129, term181129.getClass(), "irqDisableFlag", false);
        setBooleanField(term181129, term181129.getClass(), "decimalModeFlag", false);
        setBooleanField(term181129, term181129.getClass(), "breakFlag", false);
        setBooleanField(term181129, term181129.getClass(), "overflowFlag", false);
        setLongField(term181129, term181129.getClass(), "stepCounter", 0L);
        setField(term181063, term181063.getClass(), "state", term181129);
        setLongField(term181063, term181063.getClass(), "opBeginTime", 3853271903861685327L);
        term181157 = new Integer(1786579332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181157;
        callMethod(klass, "asl", argTypes, term181063, args);
    }

};


