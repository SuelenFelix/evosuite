package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class MemoryWindow_MemoryTableModel_init_5135053890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59562;

    public MemoryWindow_MemoryTableModel_init_5135053890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59651 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term59650 = ((Class) term59651).getDeclaredField((String) "NMOS_6502");
        ((Field) term59650).setAccessible(true);
        Object enum10 = ((Field) term59650).get((Object) null);
        HashMap term59610 = new HashMap();
        HashMap term59644 = new HashMap();
        term59562 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term59565 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term59580 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term59583 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term59585 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term59588 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term59615 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term59616 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term59624 = (int[]) newIntArray(2);
        int[] term59627 = (int[]) newIntArray(2);
        Object[] term59649 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        setIntField(term59562, term59562.getClass(), "startAddress", 1124282188);
        setIntField(term59562, term59562.getClass(), "endAddress", -489441521);
        setLongField(term59565, term59565.getClass(), "clockPeriodInNs", 1000L);
        setField(term59565, term59565.getClass(), "behavior", enum10);
        setIntField(term59580, term59580.getClass(), "startAddress", 225873732);
        setIntField(term59580, term59580.getClass(), "endAddress", 529879356);
        setLongField(term59583, term59583.getClass(), "clockPeriodInNs", 1000L);
        setField(term59583, term59583.getClass(), "behavior", enum10);
        setIntField(term59585, term59585.getClass(), "startAddress", 18072182);
        setIntField(term59585, term59585.getClass(), "endAddress", 1544768934);
        setField(term59585, term59585.getClass(), "cpu", null);
        setField(term59585, term59585.getClass(), "deviceMap", null);
        setField(term59585, term59585.getClass(), "deviceAddressArray", null);
        setField(term59583, term59583.getClass(), "bus", term59585);
        setIntField(term59588, term59588.getClass(), "a", 0);
        setIntField(term59588, term59588.getClass(), "x", 0);
        setIntField(term59588, term59588.getClass(), "y", 0);
        setIntField(term59588, term59588.getClass(), "sp", 0);
        setIntField(term59588, term59588.getClass(), "pc", 0);
        setIntField(term59588, term59588.getClass(), "ir", 0);
        setIntField(term59588, term59588.getClass(), "nextIr", 0);
        setField(term59588, term59588.getClass(), "args", null);
        setField(term59588, term59588.getClass(), "nextArgs", null);
        setIntField(term59588, term59588.getClass(), "instSize", 0);
        setBooleanField(term59588, term59588.getClass(), "opTrap", false);
        setBooleanField(term59588, term59588.getClass(), "irqAsserted", false);
        setBooleanField(term59588, term59588.getClass(), "nmiAsserted", false);
        setIntField(term59588, term59588.getClass(), "lastPc", 0);
        setBooleanField(term59588, term59588.getClass(), "carryFlag", false);
        setBooleanField(term59588, term59588.getClass(), "negativeFlag", false);
        setBooleanField(term59588, term59588.getClass(), "zeroFlag", false);
        setBooleanField(term59588, term59588.getClass(), "irqDisableFlag", false);
        setBooleanField(term59588, term59588.getClass(), "decimalModeFlag", false);
        setBooleanField(term59588, term59588.getClass(), "breakFlag", false);
        setBooleanField(term59588, term59588.getClass(), "overflowFlag", false);
        setLongField(term59588, term59588.getClass(), "stepCounter", 0L);
        setField(term59583, term59583.getClass(), "state", term59588);
        setLongField(term59583, term59583.getClass(), "opBeginTime", 41775768178052008L);
        setField(term59580, term59580.getClass(), "cpu", term59583);
        setField(term59580, term59580.getClass(), "deviceMap", term59610);
        setField(term59580, term59580.getClass(), "deviceAddressArray", term59615);
        setField(term59565, term59565.getClass(), "bus", term59580);
        setIntField(term59616, term59616.getClass(), "a", 0);
        setIntField(term59616, term59616.getClass(), "x", 0);
        setIntField(term59616, term59616.getClass(), "y", 0);
        setIntField(term59616, term59616.getClass(), "sp", 0);
        setIntField(term59616, term59616.getClass(), "pc", 0);
        setIntField(term59616, term59616.getClass(), "ir", 0);
        setIntField(term59616, term59616.getClass(), "nextIr", 0);
        setField(term59616, term59616.getClass(), "args", term59624);
        setField(term59616, term59616.getClass(), "nextArgs", term59627);
        setIntField(term59616, term59616.getClass(), "instSize", 0);
        setBooleanField(term59616, term59616.getClass(), "opTrap", false);
        setBooleanField(term59616, term59616.getClass(), "irqAsserted", false);
        setBooleanField(term59616, term59616.getClass(), "nmiAsserted", false);
        setIntField(term59616, term59616.getClass(), "lastPc", 0);
        setBooleanField(term59616, term59616.getClass(), "carryFlag", false);
        setBooleanField(term59616, term59616.getClass(), "negativeFlag", false);
        setBooleanField(term59616, term59616.getClass(), "zeroFlag", false);
        setBooleanField(term59616, term59616.getClass(), "irqDisableFlag", false);
        setBooleanField(term59616, term59616.getClass(), "decimalModeFlag", false);
        setBooleanField(term59616, term59616.getClass(), "breakFlag", false);
        setBooleanField(term59616, term59616.getClass(), "overflowFlag", false);
        setLongField(term59616, term59616.getClass(), "stepCounter", 0L);
        setField(term59565, term59565.getClass(), "state", term59616);
        setLongField(term59565, term59565.getClass(), "opBeginTime", 6682528376118987775L);
        setField(term59562, term59562.getClass(), "cpu", term59565);
        setField(term59562, term59562.getClass(), "deviceMap", term59644);
        setField(term59562, term59562.getClass(), "deviceAddressArray", term59649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.Bus");
        Object[] args = new Object[1];
        args[0] = term59562;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


