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

public class MemoryWindow_init_20122809850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33228;

    public MemoryWindow_init_20122809850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33378 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term33377 = ((Class) term33378).getDeclaredField((String) "NMOS_6502");
        ((Field) term33377).setAccessible(true);
        Object enum0 = ((Field) term33377).get((Object) null);
        HashMap term33276 = new HashMap();
        HashMap term33310 = new HashMap();
        term33228 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term33231 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term33246 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term33249 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term33251 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term33254 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term33281 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term33282 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term33290 = (int[]) newIntArray(2);
        int[] term33293 = (int[]) newIntArray(2);
        Object[] term33315 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setIntField(term33228, term33228.getClass(), "startAddress", 301401782);
        setIntField(term33228, term33228.getClass(), "endAddress", 1988605357);
        setLongField(term33231, term33231.getClass(), "clockPeriodInNs", 1000L);
        setField(term33231, term33231.getClass(), "behavior", enum0);
        setIntField(term33246, term33246.getClass(), "startAddress", 808203320);
        setIntField(term33246, term33246.getClass(), "endAddress", -544382127);
        setLongField(term33249, term33249.getClass(), "clockPeriodInNs", 1000L);
        setField(term33249, term33249.getClass(), "behavior", enum0);
        setIntField(term33251, term33251.getClass(), "startAddress", -1830198043);
        setIntField(term33251, term33251.getClass(), "endAddress", -439048495);
        setField(term33251, term33251.getClass(), "cpu", null);
        setField(term33251, term33251.getClass(), "deviceMap", null);
        setField(term33251, term33251.getClass(), "deviceAddressArray", null);
        setField(term33249, term33249.getClass(), "bus", term33251);
        setIntField(term33254, term33254.getClass(), "a", 0);
        setIntField(term33254, term33254.getClass(), "x", 0);
        setIntField(term33254, term33254.getClass(), "y", 0);
        setIntField(term33254, term33254.getClass(), "sp", 0);
        setIntField(term33254, term33254.getClass(), "pc", 0);
        setIntField(term33254, term33254.getClass(), "ir", 0);
        setIntField(term33254, term33254.getClass(), "nextIr", 0);
        setField(term33254, term33254.getClass(), "args", null);
        setField(term33254, term33254.getClass(), "nextArgs", null);
        setIntField(term33254, term33254.getClass(), "instSize", 0);
        setBooleanField(term33254, term33254.getClass(), "opTrap", false);
        setBooleanField(term33254, term33254.getClass(), "irqAsserted", false);
        setBooleanField(term33254, term33254.getClass(), "nmiAsserted", false);
        setIntField(term33254, term33254.getClass(), "lastPc", 0);
        setBooleanField(term33254, term33254.getClass(), "carryFlag", false);
        setBooleanField(term33254, term33254.getClass(), "negativeFlag", false);
        setBooleanField(term33254, term33254.getClass(), "zeroFlag", false);
        setBooleanField(term33254, term33254.getClass(), "irqDisableFlag", false);
        setBooleanField(term33254, term33254.getClass(), "decimalModeFlag", false);
        setBooleanField(term33254, term33254.getClass(), "breakFlag", false);
        setBooleanField(term33254, term33254.getClass(), "overflowFlag", false);
        setLongField(term33254, term33254.getClass(), "stepCounter", 0L);
        setField(term33249, term33249.getClass(), "state", term33254);
        setLongField(term33249, term33249.getClass(), "opBeginTime", -6823727938421990489L);
        setField(term33246, term33246.getClass(), "cpu", term33249);
        setField(term33246, term33246.getClass(), "deviceMap", term33276);
        setField(term33246, term33246.getClass(), "deviceAddressArray", term33281);
        setField(term33231, term33231.getClass(), "bus", term33246);
        setIntField(term33282, term33282.getClass(), "a", 0);
        setIntField(term33282, term33282.getClass(), "x", 0);
        setIntField(term33282, term33282.getClass(), "y", 0);
        setIntField(term33282, term33282.getClass(), "sp", 0);
        setIntField(term33282, term33282.getClass(), "pc", 0);
        setIntField(term33282, term33282.getClass(), "ir", 0);
        setIntField(term33282, term33282.getClass(), "nextIr", 0);
        setField(term33282, term33282.getClass(), "args", term33290);
        setField(term33282, term33282.getClass(), "nextArgs", term33293);
        setIntField(term33282, term33282.getClass(), "instSize", 0);
        setBooleanField(term33282, term33282.getClass(), "opTrap", false);
        setBooleanField(term33282, term33282.getClass(), "irqAsserted", false);
        setBooleanField(term33282, term33282.getClass(), "nmiAsserted", false);
        setIntField(term33282, term33282.getClass(), "lastPc", 0);
        setBooleanField(term33282, term33282.getClass(), "carryFlag", false);
        setBooleanField(term33282, term33282.getClass(), "negativeFlag", false);
        setBooleanField(term33282, term33282.getClass(), "zeroFlag", false);
        setBooleanField(term33282, term33282.getClass(), "irqDisableFlag", false);
        setBooleanField(term33282, term33282.getClass(), "decimalModeFlag", false);
        setBooleanField(term33282, term33282.getClass(), "breakFlag", false);
        setBooleanField(term33282, term33282.getClass(), "overflowFlag", false);
        setLongField(term33282, term33282.getClass(), "stepCounter", 0L);
        setField(term33231, term33231.getClass(), "state", term33282);
        setLongField(term33231, term33231.getClass(), "opBeginTime", -484994522244390100L);
        setField(term33228, term33228.getClass(), "cpu", term33231);
        setField(term33228, term33228.getClass(), "deviceMap", term33310);
        setField(term33228, term33228.getClass(), "deviceAddressArray", term33315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.Bus");
        Object[] args = new Object[1];
        args[0] = term33228;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


