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

public class Cpu_clearNegativeFlag_46386768129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184369;

    public Cpu_clearNegativeFlag_46386768129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184464 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term184463 = ((Class) term184464).getDeclaredField((String) "NMOS_6502");
        ((Field) term184463).setAccessible(true);
        Object enum209 = ((Field) term184463).get((Object) null);
        HashMap term184395 = new HashMap();
        HashMap term184429 = new HashMap();
        term184369 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184384 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184387 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184389 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184392 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term184400 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term184401 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184409 = (int[]) newIntArray(2);
        int[] term184412 = (int[]) newIntArray(2);
        Object[] term184434 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term184435 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184443 = (int[]) newIntArray(2);
        int[] term184446 = (int[]) newIntArray(2);
        setLongField(term184369, term184369.getClass(), "clockPeriodInNs", 1000L);
        setField(term184369, term184369.getClass(), "behavior", enum209);
        setIntField(term184384, term184384.getClass(), "startAddress", -404489980);
        setIntField(term184384, term184384.getClass(), "endAddress", -1501688381);
        setLongField(term184387, term184387.getClass(), "clockPeriodInNs", 1000L);
        setField(term184387, term184387.getClass(), "behavior", enum209);
        setIntField(term184389, term184389.getClass(), "startAddress", -132991775);
        setIntField(term184389, term184389.getClass(), "endAddress", -1962135802);
        setLongField(term184392, term184392.getClass(), "clockPeriodInNs", 1000L);
        setField(term184392, term184392.getClass(), "behavior", enum209);
        setField(term184392, term184392.getClass(), "bus", null);
        setField(term184392, term184392.getClass(), "state", null);
        setLongField(term184392, term184392.getClass(), "opBeginTime", -218745825074249415L);
        setField(term184389, term184389.getClass(), "cpu", term184392);
        setField(term184389, term184389.getClass(), "deviceMap", term184395);
        setField(term184389, term184389.getClass(), "deviceAddressArray", term184400);
        setField(term184387, term184387.getClass(), "bus", term184389);
        setIntField(term184401, term184401.getClass(), "a", 0);
        setIntField(term184401, term184401.getClass(), "x", 0);
        setIntField(term184401, term184401.getClass(), "y", 0);
        setIntField(term184401, term184401.getClass(), "sp", 0);
        setIntField(term184401, term184401.getClass(), "pc", 0);
        setIntField(term184401, term184401.getClass(), "ir", 0);
        setIntField(term184401, term184401.getClass(), "nextIr", 0);
        setField(term184401, term184401.getClass(), "args", term184409);
        setField(term184401, term184401.getClass(), "nextArgs", term184412);
        setIntField(term184401, term184401.getClass(), "instSize", 0);
        setBooleanField(term184401, term184401.getClass(), "opTrap", false);
        setBooleanField(term184401, term184401.getClass(), "irqAsserted", false);
        setBooleanField(term184401, term184401.getClass(), "nmiAsserted", false);
        setIntField(term184401, term184401.getClass(), "lastPc", 0);
        setBooleanField(term184401, term184401.getClass(), "carryFlag", false);
        setBooleanField(term184401, term184401.getClass(), "negativeFlag", false);
        setBooleanField(term184401, term184401.getClass(), "zeroFlag", false);
        setBooleanField(term184401, term184401.getClass(), "irqDisableFlag", false);
        setBooleanField(term184401, term184401.getClass(), "decimalModeFlag", false);
        setBooleanField(term184401, term184401.getClass(), "breakFlag", false);
        setBooleanField(term184401, term184401.getClass(), "overflowFlag", false);
        setLongField(term184401, term184401.getClass(), "stepCounter", 0L);
        setField(term184387, term184387.getClass(), "state", term184401);
        setLongField(term184387, term184387.getClass(), "opBeginTime", -4912367223635767530L);
        setField(term184384, term184384.getClass(), "cpu", term184387);
        setField(term184384, term184384.getClass(), "deviceMap", term184429);
        setField(term184384, term184384.getClass(), "deviceAddressArray", term184434);
        setField(term184369, term184369.getClass(), "bus", term184384);
        setIntField(term184435, term184435.getClass(), "a", 0);
        setIntField(term184435, term184435.getClass(), "x", 0);
        setIntField(term184435, term184435.getClass(), "y", 0);
        setIntField(term184435, term184435.getClass(), "sp", 0);
        setIntField(term184435, term184435.getClass(), "pc", 0);
        setIntField(term184435, term184435.getClass(), "ir", 0);
        setIntField(term184435, term184435.getClass(), "nextIr", 0);
        setField(term184435, term184435.getClass(), "args", term184443);
        setField(term184435, term184435.getClass(), "nextArgs", term184446);
        setIntField(term184435, term184435.getClass(), "instSize", 0);
        setBooleanField(term184435, term184435.getClass(), "opTrap", false);
        setBooleanField(term184435, term184435.getClass(), "irqAsserted", false);
        setBooleanField(term184435, term184435.getClass(), "nmiAsserted", false);
        setIntField(term184435, term184435.getClass(), "lastPc", 0);
        setBooleanField(term184435, term184435.getClass(), "carryFlag", false);
        setBooleanField(term184435, term184435.getClass(), "negativeFlag", false);
        setBooleanField(term184435, term184435.getClass(), "zeroFlag", false);
        setBooleanField(term184435, term184435.getClass(), "irqDisableFlag", false);
        setBooleanField(term184435, term184435.getClass(), "decimalModeFlag", false);
        setBooleanField(term184435, term184435.getClass(), "breakFlag", false);
        setBooleanField(term184435, term184435.getClass(), "overflowFlag", false);
        setLongField(term184435, term184435.getClass(), "stepCounter", 0L);
        setField(term184369, term184369.getClass(), "state", term184435);
        setLongField(term184369, term184369.getClass(), "opBeginTime", 5307759455220911721L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearNegativeFlag", argTypes, term184369, args);
    }

};


