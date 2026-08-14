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

public class Cpu_disassembleOpAtAddress_162201907689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206004;
     Object term206098;

    public Cpu_disassembleOpAtAddress_162201907689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206101 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term206100 = ((Class) term206101).getDeclaredField((String) "NMOS_6502");
        ((Field) term206100).setAccessible(true);
        Object enum268 = ((Field) term206100).get((Object) null);
        HashMap term206030 = new HashMap();
        HashMap term206064 = new HashMap();
        term206004 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term206019 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term206022 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term206024 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term206027 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term206035 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term206036 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term206044 = (int[]) newIntArray(2);
        int[] term206047 = (int[]) newIntArray(2);
        Object[] term206069 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term206070 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term206078 = (int[]) newIntArray(2);
        int[] term206081 = (int[]) newIntArray(2);
        setLongField(term206004, term206004.getClass(), "clockPeriodInNs", 1000L);
        setField(term206004, term206004.getClass(), "behavior", enum268);
        setIntField(term206019, term206019.getClass(), "startAddress", -998538950);
        setIntField(term206019, term206019.getClass(), "endAddress", 1644825964);
        setLongField(term206022, term206022.getClass(), "clockPeriodInNs", 1000L);
        setField(term206022, term206022.getClass(), "behavior", enum268);
        setIntField(term206024, term206024.getClass(), "startAddress", -331554346);
        setIntField(term206024, term206024.getClass(), "endAddress", -774907545);
        setLongField(term206027, term206027.getClass(), "clockPeriodInNs", 1000L);
        setField(term206027, term206027.getClass(), "behavior", enum268);
        setField(term206027, term206027.getClass(), "bus", null);
        setField(term206027, term206027.getClass(), "state", null);
        setLongField(term206027, term206027.getClass(), "opBeginTime", 1318139313166175279L);
        setField(term206024, term206024.getClass(), "cpu", term206027);
        setField(term206024, term206024.getClass(), "deviceMap", term206030);
        setField(term206024, term206024.getClass(), "deviceAddressArray", term206035);
        setField(term206022, term206022.getClass(), "bus", term206024);
        setIntField(term206036, term206036.getClass(), "a", 0);
        setIntField(term206036, term206036.getClass(), "x", 0);
        setIntField(term206036, term206036.getClass(), "y", 0);
        setIntField(term206036, term206036.getClass(), "sp", 0);
        setIntField(term206036, term206036.getClass(), "pc", 0);
        setIntField(term206036, term206036.getClass(), "ir", 0);
        setIntField(term206036, term206036.getClass(), "nextIr", 0);
        setField(term206036, term206036.getClass(), "args", term206044);
        setField(term206036, term206036.getClass(), "nextArgs", term206047);
        setIntField(term206036, term206036.getClass(), "instSize", 0);
        setBooleanField(term206036, term206036.getClass(), "opTrap", false);
        setBooleanField(term206036, term206036.getClass(), "irqAsserted", false);
        setBooleanField(term206036, term206036.getClass(), "nmiAsserted", false);
        setIntField(term206036, term206036.getClass(), "lastPc", 0);
        setBooleanField(term206036, term206036.getClass(), "carryFlag", false);
        setBooleanField(term206036, term206036.getClass(), "negativeFlag", false);
        setBooleanField(term206036, term206036.getClass(), "zeroFlag", false);
        setBooleanField(term206036, term206036.getClass(), "irqDisableFlag", false);
        setBooleanField(term206036, term206036.getClass(), "decimalModeFlag", false);
        setBooleanField(term206036, term206036.getClass(), "breakFlag", false);
        setBooleanField(term206036, term206036.getClass(), "overflowFlag", false);
        setLongField(term206036, term206036.getClass(), "stepCounter", 0L);
        setField(term206022, term206022.getClass(), "state", term206036);
        setLongField(term206022, term206022.getClass(), "opBeginTime", 1712520441197520950L);
        setField(term206019, term206019.getClass(), "cpu", term206022);
        setField(term206019, term206019.getClass(), "deviceMap", term206064);
        setField(term206019, term206019.getClass(), "deviceAddressArray", term206069);
        setField(term206004, term206004.getClass(), "bus", term206019);
        setIntField(term206070, term206070.getClass(), "a", 0);
        setIntField(term206070, term206070.getClass(), "x", 0);
        setIntField(term206070, term206070.getClass(), "y", 0);
        setIntField(term206070, term206070.getClass(), "sp", 0);
        setIntField(term206070, term206070.getClass(), "pc", 0);
        setIntField(term206070, term206070.getClass(), "ir", 0);
        setIntField(term206070, term206070.getClass(), "nextIr", 0);
        setField(term206070, term206070.getClass(), "args", term206078);
        setField(term206070, term206070.getClass(), "nextArgs", term206081);
        setIntField(term206070, term206070.getClass(), "instSize", 0);
        setBooleanField(term206070, term206070.getClass(), "opTrap", false);
        setBooleanField(term206070, term206070.getClass(), "irqAsserted", false);
        setBooleanField(term206070, term206070.getClass(), "nmiAsserted", false);
        setIntField(term206070, term206070.getClass(), "lastPc", 0);
        setBooleanField(term206070, term206070.getClass(), "carryFlag", false);
        setBooleanField(term206070, term206070.getClass(), "negativeFlag", false);
        setBooleanField(term206070, term206070.getClass(), "zeroFlag", false);
        setBooleanField(term206070, term206070.getClass(), "irqDisableFlag", false);
        setBooleanField(term206070, term206070.getClass(), "decimalModeFlag", false);
        setBooleanField(term206070, term206070.getClass(), "breakFlag", false);
        setBooleanField(term206070, term206070.getClass(), "overflowFlag", false);
        setLongField(term206070, term206070.getClass(), "stepCounter", 0L);
        setField(term206004, term206004.getClass(), "state", term206070);
        setLongField(term206004, term206004.getClass(), "opBeginTime", 7043650218274841102L);
        term206098 = new Integer(296655703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206098;
        callMethod(klass, "disassembleOpAtAddress", argTypes, term206004, args);
    }

};


