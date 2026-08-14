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

public class Cpu_setIrqDisableFlag_159504655940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188399;

    public Cpu_setIrqDisableFlag_159504655940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188494 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term188493 = ((Class) term188494).getDeclaredField((String) "NMOS_6502");
        ((Field) term188493).setAccessible(true);
        Object enum220 = ((Field) term188493).get((Object) null);
        HashMap term188425 = new HashMap();
        HashMap term188459 = new HashMap();
        term188399 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188414 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188417 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188419 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188422 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term188430 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term188431 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188439 = (int[]) newIntArray(2);
        int[] term188442 = (int[]) newIntArray(2);
        Object[] term188464 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term188465 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188473 = (int[]) newIntArray(2);
        int[] term188476 = (int[]) newIntArray(2);
        setLongField(term188399, term188399.getClass(), "clockPeriodInNs", 1000L);
        setField(term188399, term188399.getClass(), "behavior", enum220);
        setIntField(term188414, term188414.getClass(), "startAddress", 949696394);
        setIntField(term188414, term188414.getClass(), "endAddress", 366195895);
        setLongField(term188417, term188417.getClass(), "clockPeriodInNs", 1000L);
        setField(term188417, term188417.getClass(), "behavior", enum220);
        setIntField(term188419, term188419.getClass(), "startAddress", 513276394);
        setIntField(term188419, term188419.getClass(), "endAddress", -867492502);
        setLongField(term188422, term188422.getClass(), "clockPeriodInNs", 1000L);
        setField(term188422, term188422.getClass(), "behavior", enum220);
        setField(term188422, term188422.getClass(), "bus", null);
        setField(term188422, term188422.getClass(), "state", null);
        setLongField(term188422, term188422.getClass(), "opBeginTime", 489460221587679133L);
        setField(term188419, term188419.getClass(), "cpu", term188422);
        setField(term188419, term188419.getClass(), "deviceMap", term188425);
        setField(term188419, term188419.getClass(), "deviceAddressArray", term188430);
        setField(term188417, term188417.getClass(), "bus", term188419);
        setIntField(term188431, term188431.getClass(), "a", 0);
        setIntField(term188431, term188431.getClass(), "x", 0);
        setIntField(term188431, term188431.getClass(), "y", 0);
        setIntField(term188431, term188431.getClass(), "sp", 0);
        setIntField(term188431, term188431.getClass(), "pc", 0);
        setIntField(term188431, term188431.getClass(), "ir", 0);
        setIntField(term188431, term188431.getClass(), "nextIr", 0);
        setField(term188431, term188431.getClass(), "args", term188439);
        setField(term188431, term188431.getClass(), "nextArgs", term188442);
        setIntField(term188431, term188431.getClass(), "instSize", 0);
        setBooleanField(term188431, term188431.getClass(), "opTrap", false);
        setBooleanField(term188431, term188431.getClass(), "irqAsserted", false);
        setBooleanField(term188431, term188431.getClass(), "nmiAsserted", false);
        setIntField(term188431, term188431.getClass(), "lastPc", 0);
        setBooleanField(term188431, term188431.getClass(), "carryFlag", false);
        setBooleanField(term188431, term188431.getClass(), "negativeFlag", false);
        setBooleanField(term188431, term188431.getClass(), "zeroFlag", false);
        setBooleanField(term188431, term188431.getClass(), "irqDisableFlag", false);
        setBooleanField(term188431, term188431.getClass(), "decimalModeFlag", false);
        setBooleanField(term188431, term188431.getClass(), "breakFlag", false);
        setBooleanField(term188431, term188431.getClass(), "overflowFlag", false);
        setLongField(term188431, term188431.getClass(), "stepCounter", 0L);
        setField(term188417, term188417.getClass(), "state", term188431);
        setLongField(term188417, term188417.getClass(), "opBeginTime", 2142335215837283347L);
        setField(term188414, term188414.getClass(), "cpu", term188417);
        setField(term188414, term188414.getClass(), "deviceMap", term188459);
        setField(term188414, term188414.getClass(), "deviceAddressArray", term188464);
        setField(term188399, term188399.getClass(), "bus", term188414);
        setIntField(term188465, term188465.getClass(), "a", 0);
        setIntField(term188465, term188465.getClass(), "x", 0);
        setIntField(term188465, term188465.getClass(), "y", 0);
        setIntField(term188465, term188465.getClass(), "sp", 0);
        setIntField(term188465, term188465.getClass(), "pc", 0);
        setIntField(term188465, term188465.getClass(), "ir", 0);
        setIntField(term188465, term188465.getClass(), "nextIr", 0);
        setField(term188465, term188465.getClass(), "args", term188473);
        setField(term188465, term188465.getClass(), "nextArgs", term188476);
        setIntField(term188465, term188465.getClass(), "instSize", 0);
        setBooleanField(term188465, term188465.getClass(), "opTrap", false);
        setBooleanField(term188465, term188465.getClass(), "irqAsserted", false);
        setBooleanField(term188465, term188465.getClass(), "nmiAsserted", false);
        setIntField(term188465, term188465.getClass(), "lastPc", 0);
        setBooleanField(term188465, term188465.getClass(), "carryFlag", false);
        setBooleanField(term188465, term188465.getClass(), "negativeFlag", false);
        setBooleanField(term188465, term188465.getClass(), "zeroFlag", false);
        setBooleanField(term188465, term188465.getClass(), "irqDisableFlag", false);
        setBooleanField(term188465, term188465.getClass(), "decimalModeFlag", false);
        setBooleanField(term188465, term188465.getClass(), "breakFlag", false);
        setBooleanField(term188465, term188465.getClass(), "overflowFlag", false);
        setLongField(term188465, term188465.getClass(), "stepCounter", 0L);
        setField(term188399, term188399.getClass(), "state", term188465);
        setLongField(term188399, term188399.getClass(), "opBeginTime", -3861643867197678062L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setIrqDisableFlag", argTypes, term188399, args);
    }

};


