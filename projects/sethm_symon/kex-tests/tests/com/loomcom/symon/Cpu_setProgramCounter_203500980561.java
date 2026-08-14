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

public class Cpu_setProgramCounter_203500980561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196093;
     Object term196187;

    public Cpu_setProgramCounter_203500980561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196190 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term196189 = ((Class) term196190).getDeclaredField((String) "NMOS_6502");
        ((Field) term196189).setAccessible(true);
        Object enum241 = ((Field) term196189).get((Object) null);
        HashMap term196119 = new HashMap();
        HashMap term196153 = new HashMap();
        term196093 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196108 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196111 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196113 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196116 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term196124 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term196125 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196133 = (int[]) newIntArray(2);
        int[] term196136 = (int[]) newIntArray(2);
        Object[] term196158 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term196159 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196167 = (int[]) newIntArray(2);
        int[] term196170 = (int[]) newIntArray(2);
        setLongField(term196093, term196093.getClass(), "clockPeriodInNs", 1000L);
        setField(term196093, term196093.getClass(), "behavior", enum241);
        setIntField(term196108, term196108.getClass(), "startAddress", -1186533450);
        setIntField(term196108, term196108.getClass(), "endAddress", 1385418235);
        setLongField(term196111, term196111.getClass(), "clockPeriodInNs", 1000L);
        setField(term196111, term196111.getClass(), "behavior", enum241);
        setIntField(term196113, term196113.getClass(), "startAddress", 928651112);
        setIntField(term196113, term196113.getClass(), "endAddress", -970446181);
        setLongField(term196116, term196116.getClass(), "clockPeriodInNs", 1000L);
        setField(term196116, term196116.getClass(), "behavior", enum241);
        setField(term196116, term196116.getClass(), "bus", null);
        setField(term196116, term196116.getClass(), "state", null);
        setLongField(term196116, term196116.getClass(), "opBeginTime", 1721306000453653222L);
        setField(term196113, term196113.getClass(), "cpu", term196116);
        setField(term196113, term196113.getClass(), "deviceMap", term196119);
        setField(term196113, term196113.getClass(), "deviceAddressArray", term196124);
        setField(term196111, term196111.getClass(), "bus", term196113);
        setIntField(term196125, term196125.getClass(), "a", 0);
        setIntField(term196125, term196125.getClass(), "x", 0);
        setIntField(term196125, term196125.getClass(), "y", 0);
        setIntField(term196125, term196125.getClass(), "sp", 0);
        setIntField(term196125, term196125.getClass(), "pc", 0);
        setIntField(term196125, term196125.getClass(), "ir", 0);
        setIntField(term196125, term196125.getClass(), "nextIr", 0);
        setField(term196125, term196125.getClass(), "args", term196133);
        setField(term196125, term196125.getClass(), "nextArgs", term196136);
        setIntField(term196125, term196125.getClass(), "instSize", 0);
        setBooleanField(term196125, term196125.getClass(), "opTrap", false);
        setBooleanField(term196125, term196125.getClass(), "irqAsserted", false);
        setBooleanField(term196125, term196125.getClass(), "nmiAsserted", false);
        setIntField(term196125, term196125.getClass(), "lastPc", 0);
        setBooleanField(term196125, term196125.getClass(), "carryFlag", false);
        setBooleanField(term196125, term196125.getClass(), "negativeFlag", false);
        setBooleanField(term196125, term196125.getClass(), "zeroFlag", false);
        setBooleanField(term196125, term196125.getClass(), "irqDisableFlag", false);
        setBooleanField(term196125, term196125.getClass(), "decimalModeFlag", false);
        setBooleanField(term196125, term196125.getClass(), "breakFlag", false);
        setBooleanField(term196125, term196125.getClass(), "overflowFlag", false);
        setLongField(term196125, term196125.getClass(), "stepCounter", 0L);
        setField(term196111, term196111.getClass(), "state", term196125);
        setLongField(term196111, term196111.getClass(), "opBeginTime", -8538252445590221089L);
        setField(term196108, term196108.getClass(), "cpu", term196111);
        setField(term196108, term196108.getClass(), "deviceMap", term196153);
        setField(term196108, term196108.getClass(), "deviceAddressArray", term196158);
        setField(term196093, term196093.getClass(), "bus", term196108);
        setIntField(term196159, term196159.getClass(), "a", 0);
        setIntField(term196159, term196159.getClass(), "x", 0);
        setIntField(term196159, term196159.getClass(), "y", 0);
        setIntField(term196159, term196159.getClass(), "sp", 0);
        setIntField(term196159, term196159.getClass(), "pc", 0);
        setIntField(term196159, term196159.getClass(), "ir", 0);
        setIntField(term196159, term196159.getClass(), "nextIr", 0);
        setField(term196159, term196159.getClass(), "args", term196167);
        setField(term196159, term196159.getClass(), "nextArgs", term196170);
        setIntField(term196159, term196159.getClass(), "instSize", 0);
        setBooleanField(term196159, term196159.getClass(), "opTrap", false);
        setBooleanField(term196159, term196159.getClass(), "irqAsserted", false);
        setBooleanField(term196159, term196159.getClass(), "nmiAsserted", false);
        setIntField(term196159, term196159.getClass(), "lastPc", 0);
        setBooleanField(term196159, term196159.getClass(), "carryFlag", false);
        setBooleanField(term196159, term196159.getClass(), "negativeFlag", false);
        setBooleanField(term196159, term196159.getClass(), "zeroFlag", false);
        setBooleanField(term196159, term196159.getClass(), "irqDisableFlag", false);
        setBooleanField(term196159, term196159.getClass(), "decimalModeFlag", false);
        setBooleanField(term196159, term196159.getClass(), "breakFlag", false);
        setBooleanField(term196159, term196159.getClass(), "overflowFlag", false);
        setLongField(term196159, term196159.getClass(), "stepCounter", 0L);
        setField(term196093, term196093.getClass(), "state", term196159);
        setLongField(term196093, term196093.getClass(), "opBeginTime", -6690821836959514088L);
        term196187 = new Integer(974582816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196187;
        callMethod(klass, "setProgramCounter", argTypes, term196093, args);
    }

};


