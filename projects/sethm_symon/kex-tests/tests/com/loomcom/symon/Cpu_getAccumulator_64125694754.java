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

public class Cpu_getAccumulator_64125694754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193525;

    public Cpu_getAccumulator_64125694754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193620 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term193619 = ((Class) term193620).getDeclaredField((String) "NMOS_6502");
        ((Field) term193619).setAccessible(true);
        Object enum234 = ((Field) term193619).get((Object) null);
        HashMap term193551 = new HashMap();
        HashMap term193585 = new HashMap();
        term193525 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193540 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193543 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193545 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193548 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term193556 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term193557 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193565 = (int[]) newIntArray(2);
        int[] term193568 = (int[]) newIntArray(2);
        Object[] term193590 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term193591 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193599 = (int[]) newIntArray(2);
        int[] term193602 = (int[]) newIntArray(2);
        setLongField(term193525, term193525.getClass(), "clockPeriodInNs", 1000L);
        setField(term193525, term193525.getClass(), "behavior", enum234);
        setIntField(term193540, term193540.getClass(), "startAddress", -1797724758);
        setIntField(term193540, term193540.getClass(), "endAddress", 2137942105);
        setLongField(term193543, term193543.getClass(), "clockPeriodInNs", 1000L);
        setField(term193543, term193543.getClass(), "behavior", enum234);
        setIntField(term193545, term193545.getClass(), "startAddress", 925222207);
        setIntField(term193545, term193545.getClass(), "endAddress", 63865718);
        setLongField(term193548, term193548.getClass(), "clockPeriodInNs", 1000L);
        setField(term193548, term193548.getClass(), "behavior", enum234);
        setField(term193548, term193548.getClass(), "bus", null);
        setField(term193548, term193548.getClass(), "state", null);
        setLongField(term193548, term193548.getClass(), "opBeginTime", 4961271045442602009L);
        setField(term193545, term193545.getClass(), "cpu", term193548);
        setField(term193545, term193545.getClass(), "deviceMap", term193551);
        setField(term193545, term193545.getClass(), "deviceAddressArray", term193556);
        setField(term193543, term193543.getClass(), "bus", term193545);
        setIntField(term193557, term193557.getClass(), "a", 0);
        setIntField(term193557, term193557.getClass(), "x", 0);
        setIntField(term193557, term193557.getClass(), "y", 0);
        setIntField(term193557, term193557.getClass(), "sp", 0);
        setIntField(term193557, term193557.getClass(), "pc", 0);
        setIntField(term193557, term193557.getClass(), "ir", 0);
        setIntField(term193557, term193557.getClass(), "nextIr", 0);
        setField(term193557, term193557.getClass(), "args", term193565);
        setField(term193557, term193557.getClass(), "nextArgs", term193568);
        setIntField(term193557, term193557.getClass(), "instSize", 0);
        setBooleanField(term193557, term193557.getClass(), "opTrap", false);
        setBooleanField(term193557, term193557.getClass(), "irqAsserted", false);
        setBooleanField(term193557, term193557.getClass(), "nmiAsserted", false);
        setIntField(term193557, term193557.getClass(), "lastPc", 0);
        setBooleanField(term193557, term193557.getClass(), "carryFlag", false);
        setBooleanField(term193557, term193557.getClass(), "negativeFlag", false);
        setBooleanField(term193557, term193557.getClass(), "zeroFlag", false);
        setBooleanField(term193557, term193557.getClass(), "irqDisableFlag", false);
        setBooleanField(term193557, term193557.getClass(), "decimalModeFlag", false);
        setBooleanField(term193557, term193557.getClass(), "breakFlag", false);
        setBooleanField(term193557, term193557.getClass(), "overflowFlag", false);
        setLongField(term193557, term193557.getClass(), "stepCounter", 0L);
        setField(term193543, term193543.getClass(), "state", term193557);
        setLongField(term193543, term193543.getClass(), "opBeginTime", 8143748492411850558L);
        setField(term193540, term193540.getClass(), "cpu", term193543);
        setField(term193540, term193540.getClass(), "deviceMap", term193585);
        setField(term193540, term193540.getClass(), "deviceAddressArray", term193590);
        setField(term193525, term193525.getClass(), "bus", term193540);
        setIntField(term193591, term193591.getClass(), "a", 0);
        setIntField(term193591, term193591.getClass(), "x", 0);
        setIntField(term193591, term193591.getClass(), "y", 0);
        setIntField(term193591, term193591.getClass(), "sp", 0);
        setIntField(term193591, term193591.getClass(), "pc", 0);
        setIntField(term193591, term193591.getClass(), "ir", 0);
        setIntField(term193591, term193591.getClass(), "nextIr", 0);
        setField(term193591, term193591.getClass(), "args", term193599);
        setField(term193591, term193591.getClass(), "nextArgs", term193602);
        setIntField(term193591, term193591.getClass(), "instSize", 0);
        setBooleanField(term193591, term193591.getClass(), "opTrap", false);
        setBooleanField(term193591, term193591.getClass(), "irqAsserted", false);
        setBooleanField(term193591, term193591.getClass(), "nmiAsserted", false);
        setIntField(term193591, term193591.getClass(), "lastPc", 0);
        setBooleanField(term193591, term193591.getClass(), "carryFlag", false);
        setBooleanField(term193591, term193591.getClass(), "negativeFlag", false);
        setBooleanField(term193591, term193591.getClass(), "zeroFlag", false);
        setBooleanField(term193591, term193591.getClass(), "irqDisableFlag", false);
        setBooleanField(term193591, term193591.getClass(), "decimalModeFlag", false);
        setBooleanField(term193591, term193591.getClass(), "breakFlag", false);
        setBooleanField(term193591, term193591.getClass(), "overflowFlag", false);
        setLongField(term193591, term193591.getClass(), "stepCounter", 0L);
        setField(term193525, term193525.getClass(), "state", term193591);
        setLongField(term193525, term193525.getClass(), "opBeginTime", 3834297266838969495L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccumulator", argTypes, term193525, args);
    }

};


