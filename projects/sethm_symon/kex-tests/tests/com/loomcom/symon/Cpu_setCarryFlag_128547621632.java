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

public class Cpu_setCarryFlag_128547621632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185467;
     Object term185561;

    public Cpu_setCarryFlag_128547621632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185564 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term185563 = ((Class) term185564).getDeclaredField((String) "NMOS_6502");
        ((Field) term185563).setAccessible(true);
        Object enum212 = ((Field) term185563).get((Object) null);
        HashMap term185493 = new HashMap();
        HashMap term185527 = new HashMap();
        term185467 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185482 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185485 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185487 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185490 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term185498 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term185499 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185507 = (int[]) newIntArray(2);
        int[] term185510 = (int[]) newIntArray(2);
        Object[] term185532 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term185533 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185541 = (int[]) newIntArray(2);
        int[] term185544 = (int[]) newIntArray(2);
        setLongField(term185467, term185467.getClass(), "clockPeriodInNs", 1000L);
        setField(term185467, term185467.getClass(), "behavior", enum212);
        setIntField(term185482, term185482.getClass(), "startAddress", -1325218609);
        setIntField(term185482, term185482.getClass(), "endAddress", -1282023865);
        setLongField(term185485, term185485.getClass(), "clockPeriodInNs", 1000L);
        setField(term185485, term185485.getClass(), "behavior", enum212);
        setIntField(term185487, term185487.getClass(), "startAddress", 64836181);
        setIntField(term185487, term185487.getClass(), "endAddress", -919341486);
        setLongField(term185490, term185490.getClass(), "clockPeriodInNs", 1000L);
        setField(term185490, term185490.getClass(), "behavior", enum212);
        setField(term185490, term185490.getClass(), "bus", null);
        setField(term185490, term185490.getClass(), "state", null);
        setLongField(term185490, term185490.getClass(), "opBeginTime", -8370506620911901379L);
        setField(term185487, term185487.getClass(), "cpu", term185490);
        setField(term185487, term185487.getClass(), "deviceMap", term185493);
        setField(term185487, term185487.getClass(), "deviceAddressArray", term185498);
        setField(term185485, term185485.getClass(), "bus", term185487);
        setIntField(term185499, term185499.getClass(), "a", 0);
        setIntField(term185499, term185499.getClass(), "x", 0);
        setIntField(term185499, term185499.getClass(), "y", 0);
        setIntField(term185499, term185499.getClass(), "sp", 0);
        setIntField(term185499, term185499.getClass(), "pc", 0);
        setIntField(term185499, term185499.getClass(), "ir", 0);
        setIntField(term185499, term185499.getClass(), "nextIr", 0);
        setField(term185499, term185499.getClass(), "args", term185507);
        setField(term185499, term185499.getClass(), "nextArgs", term185510);
        setIntField(term185499, term185499.getClass(), "instSize", 0);
        setBooleanField(term185499, term185499.getClass(), "opTrap", false);
        setBooleanField(term185499, term185499.getClass(), "irqAsserted", false);
        setBooleanField(term185499, term185499.getClass(), "nmiAsserted", false);
        setIntField(term185499, term185499.getClass(), "lastPc", 0);
        setBooleanField(term185499, term185499.getClass(), "carryFlag", false);
        setBooleanField(term185499, term185499.getClass(), "negativeFlag", false);
        setBooleanField(term185499, term185499.getClass(), "zeroFlag", false);
        setBooleanField(term185499, term185499.getClass(), "irqDisableFlag", false);
        setBooleanField(term185499, term185499.getClass(), "decimalModeFlag", false);
        setBooleanField(term185499, term185499.getClass(), "breakFlag", false);
        setBooleanField(term185499, term185499.getClass(), "overflowFlag", false);
        setLongField(term185499, term185499.getClass(), "stepCounter", 0L);
        setField(term185485, term185485.getClass(), "state", term185499);
        setLongField(term185485, term185485.getClass(), "opBeginTime", -7185067999629587082L);
        setField(term185482, term185482.getClass(), "cpu", term185485);
        setField(term185482, term185482.getClass(), "deviceMap", term185527);
        setField(term185482, term185482.getClass(), "deviceAddressArray", term185532);
        setField(term185467, term185467.getClass(), "bus", term185482);
        setIntField(term185533, term185533.getClass(), "a", 0);
        setIntField(term185533, term185533.getClass(), "x", 0);
        setIntField(term185533, term185533.getClass(), "y", 0);
        setIntField(term185533, term185533.getClass(), "sp", 0);
        setIntField(term185533, term185533.getClass(), "pc", 0);
        setIntField(term185533, term185533.getClass(), "ir", 0);
        setIntField(term185533, term185533.getClass(), "nextIr", 0);
        setField(term185533, term185533.getClass(), "args", term185541);
        setField(term185533, term185533.getClass(), "nextArgs", term185544);
        setIntField(term185533, term185533.getClass(), "instSize", 0);
        setBooleanField(term185533, term185533.getClass(), "opTrap", false);
        setBooleanField(term185533, term185533.getClass(), "irqAsserted", false);
        setBooleanField(term185533, term185533.getClass(), "nmiAsserted", false);
        setIntField(term185533, term185533.getClass(), "lastPc", 0);
        setBooleanField(term185533, term185533.getClass(), "carryFlag", false);
        setBooleanField(term185533, term185533.getClass(), "negativeFlag", false);
        setBooleanField(term185533, term185533.getClass(), "zeroFlag", false);
        setBooleanField(term185533, term185533.getClass(), "irqDisableFlag", false);
        setBooleanField(term185533, term185533.getClass(), "decimalModeFlag", false);
        setBooleanField(term185533, term185533.getClass(), "breakFlag", false);
        setBooleanField(term185533, term185533.getClass(), "overflowFlag", false);
        setLongField(term185533, term185533.getClass(), "stepCounter", 0L);
        setField(term185467, term185467.getClass(), "state", term185533);
        setLongField(term185467, term185467.getClass(), "opBeginTime", 8819168165968601827L);
        term185561 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term185561;
        callMethod(klass, "setCarryFlag", argTypes, term185467, args);
    }

};


