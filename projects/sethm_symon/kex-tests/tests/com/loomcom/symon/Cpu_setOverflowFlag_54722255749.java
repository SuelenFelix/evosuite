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

public class Cpu_setOverflowFlag_54722255749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191693;
     Object term191787;

    public Cpu_setOverflowFlag_54722255749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191790 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term191789 = ((Class) term191790).getDeclaredField((String) "NMOS_6502");
        ((Field) term191789).setAccessible(true);
        Object enum229 = ((Field) term191789).get((Object) null);
        HashMap term191719 = new HashMap();
        HashMap term191753 = new HashMap();
        term191693 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term191708 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term191711 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term191713 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term191716 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term191724 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term191725 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191733 = (int[]) newIntArray(2);
        int[] term191736 = (int[]) newIntArray(2);
        Object[] term191758 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term191759 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191767 = (int[]) newIntArray(2);
        int[] term191770 = (int[]) newIntArray(2);
        setLongField(term191693, term191693.getClass(), "clockPeriodInNs", 1000L);
        setField(term191693, term191693.getClass(), "behavior", enum229);
        setIntField(term191708, term191708.getClass(), "startAddress", -598781625);
        setIntField(term191708, term191708.getClass(), "endAddress", -1717992579);
        setLongField(term191711, term191711.getClass(), "clockPeriodInNs", 1000L);
        setField(term191711, term191711.getClass(), "behavior", enum229);
        setIntField(term191713, term191713.getClass(), "startAddress", 271835355);
        setIntField(term191713, term191713.getClass(), "endAddress", -715995272);
        setLongField(term191716, term191716.getClass(), "clockPeriodInNs", 1000L);
        setField(term191716, term191716.getClass(), "behavior", enum229);
        setField(term191716, term191716.getClass(), "bus", null);
        setField(term191716, term191716.getClass(), "state", null);
        setLongField(term191716, term191716.getClass(), "opBeginTime", 6637550433135455885L);
        setField(term191713, term191713.getClass(), "cpu", term191716);
        setField(term191713, term191713.getClass(), "deviceMap", term191719);
        setField(term191713, term191713.getClass(), "deviceAddressArray", term191724);
        setField(term191711, term191711.getClass(), "bus", term191713);
        setIntField(term191725, term191725.getClass(), "a", 0);
        setIntField(term191725, term191725.getClass(), "x", 0);
        setIntField(term191725, term191725.getClass(), "y", 0);
        setIntField(term191725, term191725.getClass(), "sp", 0);
        setIntField(term191725, term191725.getClass(), "pc", 0);
        setIntField(term191725, term191725.getClass(), "ir", 0);
        setIntField(term191725, term191725.getClass(), "nextIr", 0);
        setField(term191725, term191725.getClass(), "args", term191733);
        setField(term191725, term191725.getClass(), "nextArgs", term191736);
        setIntField(term191725, term191725.getClass(), "instSize", 0);
        setBooleanField(term191725, term191725.getClass(), "opTrap", false);
        setBooleanField(term191725, term191725.getClass(), "irqAsserted", false);
        setBooleanField(term191725, term191725.getClass(), "nmiAsserted", false);
        setIntField(term191725, term191725.getClass(), "lastPc", 0);
        setBooleanField(term191725, term191725.getClass(), "carryFlag", false);
        setBooleanField(term191725, term191725.getClass(), "negativeFlag", false);
        setBooleanField(term191725, term191725.getClass(), "zeroFlag", false);
        setBooleanField(term191725, term191725.getClass(), "irqDisableFlag", false);
        setBooleanField(term191725, term191725.getClass(), "decimalModeFlag", false);
        setBooleanField(term191725, term191725.getClass(), "breakFlag", false);
        setBooleanField(term191725, term191725.getClass(), "overflowFlag", false);
        setLongField(term191725, term191725.getClass(), "stepCounter", 0L);
        setField(term191711, term191711.getClass(), "state", term191725);
        setLongField(term191711, term191711.getClass(), "opBeginTime", -5562622835440119601L);
        setField(term191708, term191708.getClass(), "cpu", term191711);
        setField(term191708, term191708.getClass(), "deviceMap", term191753);
        setField(term191708, term191708.getClass(), "deviceAddressArray", term191758);
        setField(term191693, term191693.getClass(), "bus", term191708);
        setIntField(term191759, term191759.getClass(), "a", 0);
        setIntField(term191759, term191759.getClass(), "x", 0);
        setIntField(term191759, term191759.getClass(), "y", 0);
        setIntField(term191759, term191759.getClass(), "sp", 0);
        setIntField(term191759, term191759.getClass(), "pc", 0);
        setIntField(term191759, term191759.getClass(), "ir", 0);
        setIntField(term191759, term191759.getClass(), "nextIr", 0);
        setField(term191759, term191759.getClass(), "args", term191767);
        setField(term191759, term191759.getClass(), "nextArgs", term191770);
        setIntField(term191759, term191759.getClass(), "instSize", 0);
        setBooleanField(term191759, term191759.getClass(), "opTrap", false);
        setBooleanField(term191759, term191759.getClass(), "irqAsserted", false);
        setBooleanField(term191759, term191759.getClass(), "nmiAsserted", false);
        setIntField(term191759, term191759.getClass(), "lastPc", 0);
        setBooleanField(term191759, term191759.getClass(), "carryFlag", false);
        setBooleanField(term191759, term191759.getClass(), "negativeFlag", false);
        setBooleanField(term191759, term191759.getClass(), "zeroFlag", false);
        setBooleanField(term191759, term191759.getClass(), "irqDisableFlag", false);
        setBooleanField(term191759, term191759.getClass(), "decimalModeFlag", false);
        setBooleanField(term191759, term191759.getClass(), "breakFlag", false);
        setBooleanField(term191759, term191759.getClass(), "overflowFlag", false);
        setLongField(term191759, term191759.getClass(), "stepCounter", 0L);
        setField(term191693, term191693.getClass(), "state", term191759);
        setLongField(term191693, term191693.getClass(), "opBeginTime", 493485007607912369L);
        term191787 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term191787;
        callMethod(klass, "setOverflowFlag", argTypes, term191693, args);
    }

};


