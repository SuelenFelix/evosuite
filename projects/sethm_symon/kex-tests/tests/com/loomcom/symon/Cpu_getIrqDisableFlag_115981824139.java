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

public class Cpu_getIrqDisableFlag_115981824139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188033;

    public Cpu_getIrqDisableFlag_115981824139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188128 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term188127 = ((Class) term188128).getDeclaredField((String) "NMOS_6502");
        ((Field) term188127).setAccessible(true);
        Object enum219 = ((Field) term188127).get((Object) null);
        HashMap term188059 = new HashMap();
        HashMap term188093 = new HashMap();
        term188033 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188048 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188051 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188053 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188056 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term188064 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term188065 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188073 = (int[]) newIntArray(2);
        int[] term188076 = (int[]) newIntArray(2);
        Object[] term188098 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term188099 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188107 = (int[]) newIntArray(2);
        int[] term188110 = (int[]) newIntArray(2);
        setLongField(term188033, term188033.getClass(), "clockPeriodInNs", 1000L);
        setField(term188033, term188033.getClass(), "behavior", enum219);
        setIntField(term188048, term188048.getClass(), "startAddress", 2029166588);
        setIntField(term188048, term188048.getClass(), "endAddress", -834807352);
        setLongField(term188051, term188051.getClass(), "clockPeriodInNs", 1000L);
        setField(term188051, term188051.getClass(), "behavior", enum219);
        setIntField(term188053, term188053.getClass(), "startAddress", -1760219909);
        setIntField(term188053, term188053.getClass(), "endAddress", -1053825347);
        setLongField(term188056, term188056.getClass(), "clockPeriodInNs", 1000L);
        setField(term188056, term188056.getClass(), "behavior", enum219);
        setField(term188056, term188056.getClass(), "bus", null);
        setField(term188056, term188056.getClass(), "state", null);
        setLongField(term188056, term188056.getClass(), "opBeginTime", 3627398214180261490L);
        setField(term188053, term188053.getClass(), "cpu", term188056);
        setField(term188053, term188053.getClass(), "deviceMap", term188059);
        setField(term188053, term188053.getClass(), "deviceAddressArray", term188064);
        setField(term188051, term188051.getClass(), "bus", term188053);
        setIntField(term188065, term188065.getClass(), "a", 0);
        setIntField(term188065, term188065.getClass(), "x", 0);
        setIntField(term188065, term188065.getClass(), "y", 0);
        setIntField(term188065, term188065.getClass(), "sp", 0);
        setIntField(term188065, term188065.getClass(), "pc", 0);
        setIntField(term188065, term188065.getClass(), "ir", 0);
        setIntField(term188065, term188065.getClass(), "nextIr", 0);
        setField(term188065, term188065.getClass(), "args", term188073);
        setField(term188065, term188065.getClass(), "nextArgs", term188076);
        setIntField(term188065, term188065.getClass(), "instSize", 0);
        setBooleanField(term188065, term188065.getClass(), "opTrap", false);
        setBooleanField(term188065, term188065.getClass(), "irqAsserted", false);
        setBooleanField(term188065, term188065.getClass(), "nmiAsserted", false);
        setIntField(term188065, term188065.getClass(), "lastPc", 0);
        setBooleanField(term188065, term188065.getClass(), "carryFlag", false);
        setBooleanField(term188065, term188065.getClass(), "negativeFlag", false);
        setBooleanField(term188065, term188065.getClass(), "zeroFlag", false);
        setBooleanField(term188065, term188065.getClass(), "irqDisableFlag", false);
        setBooleanField(term188065, term188065.getClass(), "decimalModeFlag", false);
        setBooleanField(term188065, term188065.getClass(), "breakFlag", false);
        setBooleanField(term188065, term188065.getClass(), "overflowFlag", false);
        setLongField(term188065, term188065.getClass(), "stepCounter", 0L);
        setField(term188051, term188051.getClass(), "state", term188065);
        setLongField(term188051, term188051.getClass(), "opBeginTime", -8287703806860141511L);
        setField(term188048, term188048.getClass(), "cpu", term188051);
        setField(term188048, term188048.getClass(), "deviceMap", term188093);
        setField(term188048, term188048.getClass(), "deviceAddressArray", term188098);
        setField(term188033, term188033.getClass(), "bus", term188048);
        setIntField(term188099, term188099.getClass(), "a", 0);
        setIntField(term188099, term188099.getClass(), "x", 0);
        setIntField(term188099, term188099.getClass(), "y", 0);
        setIntField(term188099, term188099.getClass(), "sp", 0);
        setIntField(term188099, term188099.getClass(), "pc", 0);
        setIntField(term188099, term188099.getClass(), "ir", 0);
        setIntField(term188099, term188099.getClass(), "nextIr", 0);
        setField(term188099, term188099.getClass(), "args", term188107);
        setField(term188099, term188099.getClass(), "nextArgs", term188110);
        setIntField(term188099, term188099.getClass(), "instSize", 0);
        setBooleanField(term188099, term188099.getClass(), "opTrap", false);
        setBooleanField(term188099, term188099.getClass(), "irqAsserted", false);
        setBooleanField(term188099, term188099.getClass(), "nmiAsserted", false);
        setIntField(term188099, term188099.getClass(), "lastPc", 0);
        setBooleanField(term188099, term188099.getClass(), "carryFlag", false);
        setBooleanField(term188099, term188099.getClass(), "negativeFlag", false);
        setBooleanField(term188099, term188099.getClass(), "zeroFlag", false);
        setBooleanField(term188099, term188099.getClass(), "irqDisableFlag", false);
        setBooleanField(term188099, term188099.getClass(), "decimalModeFlag", false);
        setBooleanField(term188099, term188099.getClass(), "breakFlag", false);
        setBooleanField(term188099, term188099.getClass(), "overflowFlag", false);
        setLongField(term188099, term188099.getClass(), "stepCounter", 0L);
        setField(term188033, term188033.getClass(), "state", term188099);
        setLongField(term188033, term188033.getClass(), "opBeginTime", 4190829300851698907L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIrqDisableFlag", argTypes, term188033, args);
    }

};


