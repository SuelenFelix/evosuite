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

public class Cpu_setStackPointer_161543013463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196827;
     Object term196921;

    public Cpu_setStackPointer_161543013463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196924 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term196923 = ((Class) term196924).getDeclaredField((String) "NMOS_6502");
        ((Field) term196923).setAccessible(true);
        Object enum243 = ((Field) term196923).get((Object) null);
        HashMap term196853 = new HashMap();
        HashMap term196887 = new HashMap();
        term196827 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196842 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196845 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term196847 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term196850 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term196858 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term196859 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196867 = (int[]) newIntArray(2);
        int[] term196870 = (int[]) newIntArray(2);
        Object[] term196892 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term196893 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term196901 = (int[]) newIntArray(2);
        int[] term196904 = (int[]) newIntArray(2);
        setLongField(term196827, term196827.getClass(), "clockPeriodInNs", 1000L);
        setField(term196827, term196827.getClass(), "behavior", enum243);
        setIntField(term196842, term196842.getClass(), "startAddress", 250123647);
        setIntField(term196842, term196842.getClass(), "endAddress", -1818613479);
        setLongField(term196845, term196845.getClass(), "clockPeriodInNs", 1000L);
        setField(term196845, term196845.getClass(), "behavior", enum243);
        setIntField(term196847, term196847.getClass(), "startAddress", -93031622);
        setIntField(term196847, term196847.getClass(), "endAddress", 1909891216);
        setLongField(term196850, term196850.getClass(), "clockPeriodInNs", 1000L);
        setField(term196850, term196850.getClass(), "behavior", enum243);
        setField(term196850, term196850.getClass(), "bus", null);
        setField(term196850, term196850.getClass(), "state", null);
        setLongField(term196850, term196850.getClass(), "opBeginTime", 8298987863520566549L);
        setField(term196847, term196847.getClass(), "cpu", term196850);
        setField(term196847, term196847.getClass(), "deviceMap", term196853);
        setField(term196847, term196847.getClass(), "deviceAddressArray", term196858);
        setField(term196845, term196845.getClass(), "bus", term196847);
        setIntField(term196859, term196859.getClass(), "a", 0);
        setIntField(term196859, term196859.getClass(), "x", 0);
        setIntField(term196859, term196859.getClass(), "y", 0);
        setIntField(term196859, term196859.getClass(), "sp", 0);
        setIntField(term196859, term196859.getClass(), "pc", 0);
        setIntField(term196859, term196859.getClass(), "ir", 0);
        setIntField(term196859, term196859.getClass(), "nextIr", 0);
        setField(term196859, term196859.getClass(), "args", term196867);
        setField(term196859, term196859.getClass(), "nextArgs", term196870);
        setIntField(term196859, term196859.getClass(), "instSize", 0);
        setBooleanField(term196859, term196859.getClass(), "opTrap", false);
        setBooleanField(term196859, term196859.getClass(), "irqAsserted", false);
        setBooleanField(term196859, term196859.getClass(), "nmiAsserted", false);
        setIntField(term196859, term196859.getClass(), "lastPc", 0);
        setBooleanField(term196859, term196859.getClass(), "carryFlag", false);
        setBooleanField(term196859, term196859.getClass(), "negativeFlag", false);
        setBooleanField(term196859, term196859.getClass(), "zeroFlag", false);
        setBooleanField(term196859, term196859.getClass(), "irqDisableFlag", false);
        setBooleanField(term196859, term196859.getClass(), "decimalModeFlag", false);
        setBooleanField(term196859, term196859.getClass(), "breakFlag", false);
        setBooleanField(term196859, term196859.getClass(), "overflowFlag", false);
        setLongField(term196859, term196859.getClass(), "stepCounter", 0L);
        setField(term196845, term196845.getClass(), "state", term196859);
        setLongField(term196845, term196845.getClass(), "opBeginTime", 4361302085818491893L);
        setField(term196842, term196842.getClass(), "cpu", term196845);
        setField(term196842, term196842.getClass(), "deviceMap", term196887);
        setField(term196842, term196842.getClass(), "deviceAddressArray", term196892);
        setField(term196827, term196827.getClass(), "bus", term196842);
        setIntField(term196893, term196893.getClass(), "a", 0);
        setIntField(term196893, term196893.getClass(), "x", 0);
        setIntField(term196893, term196893.getClass(), "y", 0);
        setIntField(term196893, term196893.getClass(), "sp", 0);
        setIntField(term196893, term196893.getClass(), "pc", 0);
        setIntField(term196893, term196893.getClass(), "ir", 0);
        setIntField(term196893, term196893.getClass(), "nextIr", 0);
        setField(term196893, term196893.getClass(), "args", term196901);
        setField(term196893, term196893.getClass(), "nextArgs", term196904);
        setIntField(term196893, term196893.getClass(), "instSize", 0);
        setBooleanField(term196893, term196893.getClass(), "opTrap", false);
        setBooleanField(term196893, term196893.getClass(), "irqAsserted", false);
        setBooleanField(term196893, term196893.getClass(), "nmiAsserted", false);
        setIntField(term196893, term196893.getClass(), "lastPc", 0);
        setBooleanField(term196893, term196893.getClass(), "carryFlag", false);
        setBooleanField(term196893, term196893.getClass(), "negativeFlag", false);
        setBooleanField(term196893, term196893.getClass(), "zeroFlag", false);
        setBooleanField(term196893, term196893.getClass(), "irqDisableFlag", false);
        setBooleanField(term196893, term196893.getClass(), "decimalModeFlag", false);
        setBooleanField(term196893, term196893.getClass(), "breakFlag", false);
        setBooleanField(term196893, term196893.getClass(), "overflowFlag", false);
        setLongField(term196893, term196893.getClass(), "stepCounter", 0L);
        setField(term196827, term196827.getClass(), "state", term196893);
        setLongField(term196827, term196827.getClass(), "opBeginTime", -2025074482272457806L);
        term196921 = new Integer(609444561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196921;
        callMethod(klass, "setStackPointer", argTypes, term196827, args);
    }

};


