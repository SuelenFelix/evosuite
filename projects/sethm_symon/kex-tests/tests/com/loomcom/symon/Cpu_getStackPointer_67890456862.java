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

public class Cpu_getStackPointer_67890456862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196461;

    public Cpu_getStackPointer_67890456862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196556 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term196555 = ((Class) term196556).getDeclaredField((String) "NMOS_6502");
        ((Field) term196555).setAccessible(true);
        Object enum242 = ((Field) term196555).get((Object) null);
        HashMap term196487 = new HashMap();
        HashMap term196521 = new HashMap();
        term196461 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196476 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196479 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196481 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196484 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term196492 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term196493 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196501 = (int[]) newIntArray(2);
        int[] term196504 = (int[]) newIntArray(2);
        Object[] term196526 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term196527 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196535 = (int[]) newIntArray(2);
        int[] term196538 = (int[]) newIntArray(2);
        setLongField(term196461, term196461.getClass(), "clockPeriodInNs", 1000L);
        setField(term196461, term196461.getClass(), "behavior", enum242);
        setIntField(term196476, term196476.getClass(), "startAddress", 1915101054);
        setIntField(term196476, term196476.getClass(), "endAddress", -956240810);
        setLongField(term196479, term196479.getClass(), "clockPeriodInNs", 1000L);
        setField(term196479, term196479.getClass(), "behavior", enum242);
        setIntField(term196481, term196481.getClass(), "startAddress", 2125391204);
        setIntField(term196481, term196481.getClass(), "endAddress", -1473375595);
        setLongField(term196484, term196484.getClass(), "clockPeriodInNs", 1000L);
        setField(term196484, term196484.getClass(), "behavior", enum242);
        setField(term196484, term196484.getClass(), "bus", null);
        setField(term196484, term196484.getClass(), "state", null);
        setLongField(term196484, term196484.getClass(), "opBeginTime", -7304801244306393588L);
        setField(term196481, term196481.getClass(), "cpu", term196484);
        setField(term196481, term196481.getClass(), "deviceMap", term196487);
        setField(term196481, term196481.getClass(), "deviceAddressArray", term196492);
        setField(term196479, term196479.getClass(), "bus", term196481);
        setIntField(term196493, term196493.getClass(), "a", 0);
        setIntField(term196493, term196493.getClass(), "x", 0);
        setIntField(term196493, term196493.getClass(), "y", 0);
        setIntField(term196493, term196493.getClass(), "sp", 0);
        setIntField(term196493, term196493.getClass(), "pc", 0);
        setIntField(term196493, term196493.getClass(), "ir", 0);
        setIntField(term196493, term196493.getClass(), "nextIr", 0);
        setField(term196493, term196493.getClass(), "args", term196501);
        setField(term196493, term196493.getClass(), "nextArgs", term196504);
        setIntField(term196493, term196493.getClass(), "instSize", 0);
        setBooleanField(term196493, term196493.getClass(), "opTrap", false);
        setBooleanField(term196493, term196493.getClass(), "irqAsserted", false);
        setBooleanField(term196493, term196493.getClass(), "nmiAsserted", false);
        setIntField(term196493, term196493.getClass(), "lastPc", 0);
        setBooleanField(term196493, term196493.getClass(), "carryFlag", false);
        setBooleanField(term196493, term196493.getClass(), "negativeFlag", false);
        setBooleanField(term196493, term196493.getClass(), "zeroFlag", false);
        setBooleanField(term196493, term196493.getClass(), "irqDisableFlag", false);
        setBooleanField(term196493, term196493.getClass(), "decimalModeFlag", false);
        setBooleanField(term196493, term196493.getClass(), "breakFlag", false);
        setBooleanField(term196493, term196493.getClass(), "overflowFlag", false);
        setLongField(term196493, term196493.getClass(), "stepCounter", 0L);
        setField(term196479, term196479.getClass(), "state", term196493);
        setLongField(term196479, term196479.getClass(), "opBeginTime", 1676018795123486151L);
        setField(term196476, term196476.getClass(), "cpu", term196479);
        setField(term196476, term196476.getClass(), "deviceMap", term196521);
        setField(term196476, term196476.getClass(), "deviceAddressArray", term196526);
        setField(term196461, term196461.getClass(), "bus", term196476);
        setIntField(term196527, term196527.getClass(), "a", 0);
        setIntField(term196527, term196527.getClass(), "x", 0);
        setIntField(term196527, term196527.getClass(), "y", 0);
        setIntField(term196527, term196527.getClass(), "sp", 0);
        setIntField(term196527, term196527.getClass(), "pc", 0);
        setIntField(term196527, term196527.getClass(), "ir", 0);
        setIntField(term196527, term196527.getClass(), "nextIr", 0);
        setField(term196527, term196527.getClass(), "args", term196535);
        setField(term196527, term196527.getClass(), "nextArgs", term196538);
        setIntField(term196527, term196527.getClass(), "instSize", 0);
        setBooleanField(term196527, term196527.getClass(), "opTrap", false);
        setBooleanField(term196527, term196527.getClass(), "irqAsserted", false);
        setBooleanField(term196527, term196527.getClass(), "nmiAsserted", false);
        setIntField(term196527, term196527.getClass(), "lastPc", 0);
        setBooleanField(term196527, term196527.getClass(), "carryFlag", false);
        setBooleanField(term196527, term196527.getClass(), "negativeFlag", false);
        setBooleanField(term196527, term196527.getClass(), "zeroFlag", false);
        setBooleanField(term196527, term196527.getClass(), "irqDisableFlag", false);
        setBooleanField(term196527, term196527.getClass(), "decimalModeFlag", false);
        setBooleanField(term196527, term196527.getClass(), "breakFlag", false);
        setBooleanField(term196527, term196527.getClass(), "overflowFlag", false);
        setLongField(term196527, term196527.getClass(), "stepCounter", 0L);
        setField(term196461, term196461.getClass(), "state", term196527);
        setLongField(term196461, term196461.getClass(), "opBeginTime", 8578275227150470673L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStackPointer", argTypes, term196461, args);
    }

};


