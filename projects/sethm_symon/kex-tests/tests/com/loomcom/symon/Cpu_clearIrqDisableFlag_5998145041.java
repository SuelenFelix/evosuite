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

public class Cpu_clearIrqDisableFlag_5998145041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188765;

    public Cpu_clearIrqDisableFlag_5998145041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188860 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term188859 = ((Class) term188860).getDeclaredField((String) "NMOS_6502");
        ((Field) term188859).setAccessible(true);
        Object enum221 = ((Field) term188859).get((Object) null);
        HashMap term188791 = new HashMap();
        HashMap term188825 = new HashMap();
        term188765 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188780 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188783 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term188785 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term188788 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term188796 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term188797 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188805 = (int[]) newIntArray(2);
        int[] term188808 = (int[]) newIntArray(2);
        Object[] term188830 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term188831 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term188839 = (int[]) newIntArray(2);
        int[] term188842 = (int[]) newIntArray(2);
        setLongField(term188765, term188765.getClass(), "clockPeriodInNs", 1000L);
        setField(term188765, term188765.getClass(), "behavior", enum221);
        setIntField(term188780, term188780.getClass(), "startAddress", 1435658339);
        setIntField(term188780, term188780.getClass(), "endAddress", 1802290366);
        setLongField(term188783, term188783.getClass(), "clockPeriodInNs", 1000L);
        setField(term188783, term188783.getClass(), "behavior", enum221);
        setIntField(term188785, term188785.getClass(), "startAddress", -1308723047);
        setIntField(term188785, term188785.getClass(), "endAddress", -1225238765);
        setLongField(term188788, term188788.getClass(), "clockPeriodInNs", 1000L);
        setField(term188788, term188788.getClass(), "behavior", enum221);
        setField(term188788, term188788.getClass(), "bus", null);
        setField(term188788, term188788.getClass(), "state", null);
        setLongField(term188788, term188788.getClass(), "opBeginTime", -3694649475237271412L);
        setField(term188785, term188785.getClass(), "cpu", term188788);
        setField(term188785, term188785.getClass(), "deviceMap", term188791);
        setField(term188785, term188785.getClass(), "deviceAddressArray", term188796);
        setField(term188783, term188783.getClass(), "bus", term188785);
        setIntField(term188797, term188797.getClass(), "a", 0);
        setIntField(term188797, term188797.getClass(), "x", 0);
        setIntField(term188797, term188797.getClass(), "y", 0);
        setIntField(term188797, term188797.getClass(), "sp", 0);
        setIntField(term188797, term188797.getClass(), "pc", 0);
        setIntField(term188797, term188797.getClass(), "ir", 0);
        setIntField(term188797, term188797.getClass(), "nextIr", 0);
        setField(term188797, term188797.getClass(), "args", term188805);
        setField(term188797, term188797.getClass(), "nextArgs", term188808);
        setIntField(term188797, term188797.getClass(), "instSize", 0);
        setBooleanField(term188797, term188797.getClass(), "opTrap", false);
        setBooleanField(term188797, term188797.getClass(), "irqAsserted", false);
        setBooleanField(term188797, term188797.getClass(), "nmiAsserted", false);
        setIntField(term188797, term188797.getClass(), "lastPc", 0);
        setBooleanField(term188797, term188797.getClass(), "carryFlag", false);
        setBooleanField(term188797, term188797.getClass(), "negativeFlag", false);
        setBooleanField(term188797, term188797.getClass(), "zeroFlag", false);
        setBooleanField(term188797, term188797.getClass(), "irqDisableFlag", false);
        setBooleanField(term188797, term188797.getClass(), "decimalModeFlag", false);
        setBooleanField(term188797, term188797.getClass(), "breakFlag", false);
        setBooleanField(term188797, term188797.getClass(), "overflowFlag", false);
        setLongField(term188797, term188797.getClass(), "stepCounter", 0L);
        setField(term188783, term188783.getClass(), "state", term188797);
        setLongField(term188783, term188783.getClass(), "opBeginTime", 5323722289713523213L);
        setField(term188780, term188780.getClass(), "cpu", term188783);
        setField(term188780, term188780.getClass(), "deviceMap", term188825);
        setField(term188780, term188780.getClass(), "deviceAddressArray", term188830);
        setField(term188765, term188765.getClass(), "bus", term188780);
        setIntField(term188831, term188831.getClass(), "a", 0);
        setIntField(term188831, term188831.getClass(), "x", 0);
        setIntField(term188831, term188831.getClass(), "y", 0);
        setIntField(term188831, term188831.getClass(), "sp", 0);
        setIntField(term188831, term188831.getClass(), "pc", 0);
        setIntField(term188831, term188831.getClass(), "ir", 0);
        setIntField(term188831, term188831.getClass(), "nextIr", 0);
        setField(term188831, term188831.getClass(), "args", term188839);
        setField(term188831, term188831.getClass(), "nextArgs", term188842);
        setIntField(term188831, term188831.getClass(), "instSize", 0);
        setBooleanField(term188831, term188831.getClass(), "opTrap", false);
        setBooleanField(term188831, term188831.getClass(), "irqAsserted", false);
        setBooleanField(term188831, term188831.getClass(), "nmiAsserted", false);
        setIntField(term188831, term188831.getClass(), "lastPc", 0);
        setBooleanField(term188831, term188831.getClass(), "carryFlag", false);
        setBooleanField(term188831, term188831.getClass(), "negativeFlag", false);
        setBooleanField(term188831, term188831.getClass(), "zeroFlag", false);
        setBooleanField(term188831, term188831.getClass(), "irqDisableFlag", false);
        setBooleanField(term188831, term188831.getClass(), "decimalModeFlag", false);
        setBooleanField(term188831, term188831.getClass(), "breakFlag", false);
        setBooleanField(term188831, term188831.getClass(), "overflowFlag", false);
        setLongField(term188831, term188831.getClass(), "stepCounter", 0L);
        setField(term188765, term188765.getClass(), "state", term188831);
        setLongField(term188765, term188765.getClass(), "opBeginTime", 4496648256608157890L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearIrqDisableFlag", argTypes, term188765, args);
    }

};


