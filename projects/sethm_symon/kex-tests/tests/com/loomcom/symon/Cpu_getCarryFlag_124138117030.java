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

public class Cpu_getCarryFlag_124138117030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184735;

    public Cpu_getCarryFlag_124138117030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184830 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term184829 = ((Class) term184830).getDeclaredField((String) "NMOS_6502");
        ((Field) term184829).setAccessible(true);
        Object enum210 = ((Field) term184829).get((Object) null);
        HashMap term184761 = new HashMap();
        HashMap term184795 = new HashMap();
        term184735 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184750 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184753 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184755 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184758 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term184766 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term184767 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184775 = (int[]) newIntArray(2);
        int[] term184778 = (int[]) newIntArray(2);
        Object[] term184800 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term184801 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184809 = (int[]) newIntArray(2);
        int[] term184812 = (int[]) newIntArray(2);
        setLongField(term184735, term184735.getClass(), "clockPeriodInNs", 1000L);
        setField(term184735, term184735.getClass(), "behavior", enum210);
        setIntField(term184750, term184750.getClass(), "startAddress", -1128084769);
        setIntField(term184750, term184750.getClass(), "endAddress", 608763750);
        setLongField(term184753, term184753.getClass(), "clockPeriodInNs", 1000L);
        setField(term184753, term184753.getClass(), "behavior", enum210);
        setIntField(term184755, term184755.getClass(), "startAddress", 1116153965);
        setIntField(term184755, term184755.getClass(), "endAddress", 406334046);
        setLongField(term184758, term184758.getClass(), "clockPeriodInNs", 1000L);
        setField(term184758, term184758.getClass(), "behavior", enum210);
        setField(term184758, term184758.getClass(), "bus", null);
        setField(term184758, term184758.getClass(), "state", null);
        setLongField(term184758, term184758.getClass(), "opBeginTime", -2813353909483819403L);
        setField(term184755, term184755.getClass(), "cpu", term184758);
        setField(term184755, term184755.getClass(), "deviceMap", term184761);
        setField(term184755, term184755.getClass(), "deviceAddressArray", term184766);
        setField(term184753, term184753.getClass(), "bus", term184755);
        setIntField(term184767, term184767.getClass(), "a", 0);
        setIntField(term184767, term184767.getClass(), "x", 0);
        setIntField(term184767, term184767.getClass(), "y", 0);
        setIntField(term184767, term184767.getClass(), "sp", 0);
        setIntField(term184767, term184767.getClass(), "pc", 0);
        setIntField(term184767, term184767.getClass(), "ir", 0);
        setIntField(term184767, term184767.getClass(), "nextIr", 0);
        setField(term184767, term184767.getClass(), "args", term184775);
        setField(term184767, term184767.getClass(), "nextArgs", term184778);
        setIntField(term184767, term184767.getClass(), "instSize", 0);
        setBooleanField(term184767, term184767.getClass(), "opTrap", false);
        setBooleanField(term184767, term184767.getClass(), "irqAsserted", false);
        setBooleanField(term184767, term184767.getClass(), "nmiAsserted", false);
        setIntField(term184767, term184767.getClass(), "lastPc", 0);
        setBooleanField(term184767, term184767.getClass(), "carryFlag", false);
        setBooleanField(term184767, term184767.getClass(), "negativeFlag", false);
        setBooleanField(term184767, term184767.getClass(), "zeroFlag", false);
        setBooleanField(term184767, term184767.getClass(), "irqDisableFlag", false);
        setBooleanField(term184767, term184767.getClass(), "decimalModeFlag", false);
        setBooleanField(term184767, term184767.getClass(), "breakFlag", false);
        setBooleanField(term184767, term184767.getClass(), "overflowFlag", false);
        setLongField(term184767, term184767.getClass(), "stepCounter", 0L);
        setField(term184753, term184753.getClass(), "state", term184767);
        setLongField(term184753, term184753.getClass(), "opBeginTime", -1960938531726773973L);
        setField(term184750, term184750.getClass(), "cpu", term184753);
        setField(term184750, term184750.getClass(), "deviceMap", term184795);
        setField(term184750, term184750.getClass(), "deviceAddressArray", term184800);
        setField(term184735, term184735.getClass(), "bus", term184750);
        setIntField(term184801, term184801.getClass(), "a", 0);
        setIntField(term184801, term184801.getClass(), "x", 0);
        setIntField(term184801, term184801.getClass(), "y", 0);
        setIntField(term184801, term184801.getClass(), "sp", 0);
        setIntField(term184801, term184801.getClass(), "pc", 0);
        setIntField(term184801, term184801.getClass(), "ir", 0);
        setIntField(term184801, term184801.getClass(), "nextIr", 0);
        setField(term184801, term184801.getClass(), "args", term184809);
        setField(term184801, term184801.getClass(), "nextArgs", term184812);
        setIntField(term184801, term184801.getClass(), "instSize", 0);
        setBooleanField(term184801, term184801.getClass(), "opTrap", false);
        setBooleanField(term184801, term184801.getClass(), "irqAsserted", false);
        setBooleanField(term184801, term184801.getClass(), "nmiAsserted", false);
        setIntField(term184801, term184801.getClass(), "lastPc", 0);
        setBooleanField(term184801, term184801.getClass(), "carryFlag", false);
        setBooleanField(term184801, term184801.getClass(), "negativeFlag", false);
        setBooleanField(term184801, term184801.getClass(), "zeroFlag", false);
        setBooleanField(term184801, term184801.getClass(), "irqDisableFlag", false);
        setBooleanField(term184801, term184801.getClass(), "decimalModeFlag", false);
        setBooleanField(term184801, term184801.getClass(), "breakFlag", false);
        setBooleanField(term184801, term184801.getClass(), "overflowFlag", false);
        setLongField(term184801, term184801.getClass(), "stepCounter", 0L);
        setField(term184735, term184735.getClass(), "state", term184801);
        setLongField(term184735, term184735.getClass(), "opBeginTime", -4845114630136242760L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCarryFlag", argTypes, term184735, args);
    }

};


