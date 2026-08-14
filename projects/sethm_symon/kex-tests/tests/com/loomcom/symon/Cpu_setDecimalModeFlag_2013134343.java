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

public class Cpu_setDecimalModeFlag_2013134343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189497;

    public Cpu_setDecimalModeFlag_2013134343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189592 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term189591 = ((Class) term189592).getDeclaredField((String) "NMOS_6502");
        ((Field) term189591).setAccessible(true);
        Object enum223 = ((Field) term189591).get((Object) null);
        HashMap term189523 = new HashMap();
        HashMap term189557 = new HashMap();
        term189497 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189512 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189515 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189517 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189520 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term189528 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term189529 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189537 = (int[]) newIntArray(2);
        int[] term189540 = (int[]) newIntArray(2);
        Object[] term189562 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term189563 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189571 = (int[]) newIntArray(2);
        int[] term189574 = (int[]) newIntArray(2);
        setLongField(term189497, term189497.getClass(), "clockPeriodInNs", 1000L);
        setField(term189497, term189497.getClass(), "behavior", enum223);
        setIntField(term189512, term189512.getClass(), "startAddress", 1852804936);
        setIntField(term189512, term189512.getClass(), "endAddress", 53950838);
        setLongField(term189515, term189515.getClass(), "clockPeriodInNs", 1000L);
        setField(term189515, term189515.getClass(), "behavior", enum223);
        setIntField(term189517, term189517.getClass(), "startAddress", -180263871);
        setIntField(term189517, term189517.getClass(), "endAddress", 787708003);
        setLongField(term189520, term189520.getClass(), "clockPeriodInNs", 1000L);
        setField(term189520, term189520.getClass(), "behavior", enum223);
        setField(term189520, term189520.getClass(), "bus", null);
        setField(term189520, term189520.getClass(), "state", null);
        setLongField(term189520, term189520.getClass(), "opBeginTime", 3746407492061591608L);
        setField(term189517, term189517.getClass(), "cpu", term189520);
        setField(term189517, term189517.getClass(), "deviceMap", term189523);
        setField(term189517, term189517.getClass(), "deviceAddressArray", term189528);
        setField(term189515, term189515.getClass(), "bus", term189517);
        setIntField(term189529, term189529.getClass(), "a", 0);
        setIntField(term189529, term189529.getClass(), "x", 0);
        setIntField(term189529, term189529.getClass(), "y", 0);
        setIntField(term189529, term189529.getClass(), "sp", 0);
        setIntField(term189529, term189529.getClass(), "pc", 0);
        setIntField(term189529, term189529.getClass(), "ir", 0);
        setIntField(term189529, term189529.getClass(), "nextIr", 0);
        setField(term189529, term189529.getClass(), "args", term189537);
        setField(term189529, term189529.getClass(), "nextArgs", term189540);
        setIntField(term189529, term189529.getClass(), "instSize", 0);
        setBooleanField(term189529, term189529.getClass(), "opTrap", false);
        setBooleanField(term189529, term189529.getClass(), "irqAsserted", false);
        setBooleanField(term189529, term189529.getClass(), "nmiAsserted", false);
        setIntField(term189529, term189529.getClass(), "lastPc", 0);
        setBooleanField(term189529, term189529.getClass(), "carryFlag", false);
        setBooleanField(term189529, term189529.getClass(), "negativeFlag", false);
        setBooleanField(term189529, term189529.getClass(), "zeroFlag", false);
        setBooleanField(term189529, term189529.getClass(), "irqDisableFlag", false);
        setBooleanField(term189529, term189529.getClass(), "decimalModeFlag", false);
        setBooleanField(term189529, term189529.getClass(), "breakFlag", false);
        setBooleanField(term189529, term189529.getClass(), "overflowFlag", false);
        setLongField(term189529, term189529.getClass(), "stepCounter", 0L);
        setField(term189515, term189515.getClass(), "state", term189529);
        setLongField(term189515, term189515.getClass(), "opBeginTime", -8815714356297321412L);
        setField(term189512, term189512.getClass(), "cpu", term189515);
        setField(term189512, term189512.getClass(), "deviceMap", term189557);
        setField(term189512, term189512.getClass(), "deviceAddressArray", term189562);
        setField(term189497, term189497.getClass(), "bus", term189512);
        setIntField(term189563, term189563.getClass(), "a", 0);
        setIntField(term189563, term189563.getClass(), "x", 0);
        setIntField(term189563, term189563.getClass(), "y", 0);
        setIntField(term189563, term189563.getClass(), "sp", 0);
        setIntField(term189563, term189563.getClass(), "pc", 0);
        setIntField(term189563, term189563.getClass(), "ir", 0);
        setIntField(term189563, term189563.getClass(), "nextIr", 0);
        setField(term189563, term189563.getClass(), "args", term189571);
        setField(term189563, term189563.getClass(), "nextArgs", term189574);
        setIntField(term189563, term189563.getClass(), "instSize", 0);
        setBooleanField(term189563, term189563.getClass(), "opTrap", false);
        setBooleanField(term189563, term189563.getClass(), "irqAsserted", false);
        setBooleanField(term189563, term189563.getClass(), "nmiAsserted", false);
        setIntField(term189563, term189563.getClass(), "lastPc", 0);
        setBooleanField(term189563, term189563.getClass(), "carryFlag", false);
        setBooleanField(term189563, term189563.getClass(), "negativeFlag", false);
        setBooleanField(term189563, term189563.getClass(), "zeroFlag", false);
        setBooleanField(term189563, term189563.getClass(), "irqDisableFlag", false);
        setBooleanField(term189563, term189563.getClass(), "decimalModeFlag", false);
        setBooleanField(term189563, term189563.getClass(), "breakFlag", false);
        setBooleanField(term189563, term189563.getClass(), "overflowFlag", false);
        setLongField(term189563, term189563.getClass(), "stepCounter", 0L);
        setField(term189497, term189497.getClass(), "state", term189563);
        setLongField(term189497, term189497.getClass(), "opBeginTime", -4738455258060622217L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setDecimalModeFlag", argTypes, term189497, args);
    }

};


