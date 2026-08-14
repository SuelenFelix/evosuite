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

public class Cpu_lsr_15240517421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181431;
     Object term181525;

    public Cpu_lsr_15240517421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181528 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term181527 = ((Class) term181528).getDeclaredField((String) "NMOS_6502");
        ((Field) term181527).setAccessible(true);
        Object enum201 = ((Field) term181527).get((Object) null);
        HashMap term181457 = new HashMap();
        HashMap term181491 = new HashMap();
        term181431 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181446 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181449 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181451 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181454 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term181462 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term181463 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181471 = (int[]) newIntArray(2);
        int[] term181474 = (int[]) newIntArray(2);
        Object[] term181496 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term181497 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181505 = (int[]) newIntArray(2);
        int[] term181508 = (int[]) newIntArray(2);
        setLongField(term181431, term181431.getClass(), "clockPeriodInNs", 1000L);
        setField(term181431, term181431.getClass(), "behavior", enum201);
        setIntField(term181446, term181446.getClass(), "startAddress", 1501260437);
        setIntField(term181446, term181446.getClass(), "endAddress", -76595520);
        setLongField(term181449, term181449.getClass(), "clockPeriodInNs", 1000L);
        setField(term181449, term181449.getClass(), "behavior", enum201);
        setIntField(term181451, term181451.getClass(), "startAddress", 1443232393);
        setIntField(term181451, term181451.getClass(), "endAddress", -1910414427);
        setLongField(term181454, term181454.getClass(), "clockPeriodInNs", 1000L);
        setField(term181454, term181454.getClass(), "behavior", enum201);
        setField(term181454, term181454.getClass(), "bus", null);
        setField(term181454, term181454.getClass(), "state", null);
        setLongField(term181454, term181454.getClass(), "opBeginTime", 1038272501243892514L);
        setField(term181451, term181451.getClass(), "cpu", term181454);
        setField(term181451, term181451.getClass(), "deviceMap", term181457);
        setField(term181451, term181451.getClass(), "deviceAddressArray", term181462);
        setField(term181449, term181449.getClass(), "bus", term181451);
        setIntField(term181463, term181463.getClass(), "a", 0);
        setIntField(term181463, term181463.getClass(), "x", 0);
        setIntField(term181463, term181463.getClass(), "y", 0);
        setIntField(term181463, term181463.getClass(), "sp", 0);
        setIntField(term181463, term181463.getClass(), "pc", 0);
        setIntField(term181463, term181463.getClass(), "ir", 0);
        setIntField(term181463, term181463.getClass(), "nextIr", 0);
        setField(term181463, term181463.getClass(), "args", term181471);
        setField(term181463, term181463.getClass(), "nextArgs", term181474);
        setIntField(term181463, term181463.getClass(), "instSize", 0);
        setBooleanField(term181463, term181463.getClass(), "opTrap", false);
        setBooleanField(term181463, term181463.getClass(), "irqAsserted", false);
        setBooleanField(term181463, term181463.getClass(), "nmiAsserted", false);
        setIntField(term181463, term181463.getClass(), "lastPc", 0);
        setBooleanField(term181463, term181463.getClass(), "carryFlag", false);
        setBooleanField(term181463, term181463.getClass(), "negativeFlag", false);
        setBooleanField(term181463, term181463.getClass(), "zeroFlag", false);
        setBooleanField(term181463, term181463.getClass(), "irqDisableFlag", false);
        setBooleanField(term181463, term181463.getClass(), "decimalModeFlag", false);
        setBooleanField(term181463, term181463.getClass(), "breakFlag", false);
        setBooleanField(term181463, term181463.getClass(), "overflowFlag", false);
        setLongField(term181463, term181463.getClass(), "stepCounter", 0L);
        setField(term181449, term181449.getClass(), "state", term181463);
        setLongField(term181449, term181449.getClass(), "opBeginTime", -5787975575293098129L);
        setField(term181446, term181446.getClass(), "cpu", term181449);
        setField(term181446, term181446.getClass(), "deviceMap", term181491);
        setField(term181446, term181446.getClass(), "deviceAddressArray", term181496);
        setField(term181431, term181431.getClass(), "bus", term181446);
        setIntField(term181497, term181497.getClass(), "a", 0);
        setIntField(term181497, term181497.getClass(), "x", 0);
        setIntField(term181497, term181497.getClass(), "y", 0);
        setIntField(term181497, term181497.getClass(), "sp", 0);
        setIntField(term181497, term181497.getClass(), "pc", 0);
        setIntField(term181497, term181497.getClass(), "ir", 0);
        setIntField(term181497, term181497.getClass(), "nextIr", 0);
        setField(term181497, term181497.getClass(), "args", term181505);
        setField(term181497, term181497.getClass(), "nextArgs", term181508);
        setIntField(term181497, term181497.getClass(), "instSize", 0);
        setBooleanField(term181497, term181497.getClass(), "opTrap", false);
        setBooleanField(term181497, term181497.getClass(), "irqAsserted", false);
        setBooleanField(term181497, term181497.getClass(), "nmiAsserted", false);
        setIntField(term181497, term181497.getClass(), "lastPc", 0);
        setBooleanField(term181497, term181497.getClass(), "carryFlag", false);
        setBooleanField(term181497, term181497.getClass(), "negativeFlag", false);
        setBooleanField(term181497, term181497.getClass(), "zeroFlag", false);
        setBooleanField(term181497, term181497.getClass(), "irqDisableFlag", false);
        setBooleanField(term181497, term181497.getClass(), "decimalModeFlag", false);
        setBooleanField(term181497, term181497.getClass(), "breakFlag", false);
        setBooleanField(term181497, term181497.getClass(), "overflowFlag", false);
        setLongField(term181497, term181497.getClass(), "stepCounter", 0L);
        setField(term181431, term181431.getClass(), "state", term181497);
        setLongField(term181431, term181431.getClass(), "opBeginTime", -2214621750590649821L);
        term181525 = new Integer(919376771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181525;
        callMethod(klass, "lsr", argTypes, term181431, args);
    }

};


