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

public class Cpu_getOverflowFlag_38930396948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191327;

    public Cpu_getOverflowFlag_38930396948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191422 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term191421 = ((Class) term191422).getDeclaredField((String) "NMOS_6502");
        ((Field) term191421).setAccessible(true);
        Object enum228 = ((Field) term191421).get((Object) null);
        HashMap term191353 = new HashMap();
        HashMap term191387 = new HashMap();
        term191327 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term191342 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term191345 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term191347 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term191350 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term191358 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term191359 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191367 = (int[]) newIntArray(2);
        int[] term191370 = (int[]) newIntArray(2);
        Object[] term191392 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term191393 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191401 = (int[]) newIntArray(2);
        int[] term191404 = (int[]) newIntArray(2);
        setLongField(term191327, term191327.getClass(), "clockPeriodInNs", 1000L);
        setField(term191327, term191327.getClass(), "behavior", enum228);
        setIntField(term191342, term191342.getClass(), "startAddress", 506165302);
        setIntField(term191342, term191342.getClass(), "endAddress", 932736092);
        setLongField(term191345, term191345.getClass(), "clockPeriodInNs", 1000L);
        setField(term191345, term191345.getClass(), "behavior", enum228);
        setIntField(term191347, term191347.getClass(), "startAddress", 1792344129);
        setIntField(term191347, term191347.getClass(), "endAddress", -1718734463);
        setLongField(term191350, term191350.getClass(), "clockPeriodInNs", 1000L);
        setField(term191350, term191350.getClass(), "behavior", enum228);
        setField(term191350, term191350.getClass(), "bus", null);
        setField(term191350, term191350.getClass(), "state", null);
        setLongField(term191350, term191350.getClass(), "opBeginTime", 1651638210050263261L);
        setField(term191347, term191347.getClass(), "cpu", term191350);
        setField(term191347, term191347.getClass(), "deviceMap", term191353);
        setField(term191347, term191347.getClass(), "deviceAddressArray", term191358);
        setField(term191345, term191345.getClass(), "bus", term191347);
        setIntField(term191359, term191359.getClass(), "a", 0);
        setIntField(term191359, term191359.getClass(), "x", 0);
        setIntField(term191359, term191359.getClass(), "y", 0);
        setIntField(term191359, term191359.getClass(), "sp", 0);
        setIntField(term191359, term191359.getClass(), "pc", 0);
        setIntField(term191359, term191359.getClass(), "ir", 0);
        setIntField(term191359, term191359.getClass(), "nextIr", 0);
        setField(term191359, term191359.getClass(), "args", term191367);
        setField(term191359, term191359.getClass(), "nextArgs", term191370);
        setIntField(term191359, term191359.getClass(), "instSize", 0);
        setBooleanField(term191359, term191359.getClass(), "opTrap", false);
        setBooleanField(term191359, term191359.getClass(), "irqAsserted", false);
        setBooleanField(term191359, term191359.getClass(), "nmiAsserted", false);
        setIntField(term191359, term191359.getClass(), "lastPc", 0);
        setBooleanField(term191359, term191359.getClass(), "carryFlag", false);
        setBooleanField(term191359, term191359.getClass(), "negativeFlag", false);
        setBooleanField(term191359, term191359.getClass(), "zeroFlag", false);
        setBooleanField(term191359, term191359.getClass(), "irqDisableFlag", false);
        setBooleanField(term191359, term191359.getClass(), "decimalModeFlag", false);
        setBooleanField(term191359, term191359.getClass(), "breakFlag", false);
        setBooleanField(term191359, term191359.getClass(), "overflowFlag", false);
        setLongField(term191359, term191359.getClass(), "stepCounter", 0L);
        setField(term191345, term191345.getClass(), "state", term191359);
        setLongField(term191345, term191345.getClass(), "opBeginTime", -9187816361133186528L);
        setField(term191342, term191342.getClass(), "cpu", term191345);
        setField(term191342, term191342.getClass(), "deviceMap", term191387);
        setField(term191342, term191342.getClass(), "deviceAddressArray", term191392);
        setField(term191327, term191327.getClass(), "bus", term191342);
        setIntField(term191393, term191393.getClass(), "a", 0);
        setIntField(term191393, term191393.getClass(), "x", 0);
        setIntField(term191393, term191393.getClass(), "y", 0);
        setIntField(term191393, term191393.getClass(), "sp", 0);
        setIntField(term191393, term191393.getClass(), "pc", 0);
        setIntField(term191393, term191393.getClass(), "ir", 0);
        setIntField(term191393, term191393.getClass(), "nextIr", 0);
        setField(term191393, term191393.getClass(), "args", term191401);
        setField(term191393, term191393.getClass(), "nextArgs", term191404);
        setIntField(term191393, term191393.getClass(), "instSize", 0);
        setBooleanField(term191393, term191393.getClass(), "opTrap", false);
        setBooleanField(term191393, term191393.getClass(), "irqAsserted", false);
        setBooleanField(term191393, term191393.getClass(), "nmiAsserted", false);
        setIntField(term191393, term191393.getClass(), "lastPc", 0);
        setBooleanField(term191393, term191393.getClass(), "carryFlag", false);
        setBooleanField(term191393, term191393.getClass(), "negativeFlag", false);
        setBooleanField(term191393, term191393.getClass(), "zeroFlag", false);
        setBooleanField(term191393, term191393.getClass(), "irqDisableFlag", false);
        setBooleanField(term191393, term191393.getClass(), "decimalModeFlag", false);
        setBooleanField(term191393, term191393.getClass(), "breakFlag", false);
        setBooleanField(term191393, term191393.getClass(), "overflowFlag", false);
        setLongField(term191393, term191393.getClass(), "stepCounter", 0L);
        setField(term191327, term191327.getClass(), "state", term191393);
        setLongField(term191327, term191327.getClass(), "opBeginTime", 7069791900685590489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverflowFlag", argTypes, term191327, args);
    }

};


