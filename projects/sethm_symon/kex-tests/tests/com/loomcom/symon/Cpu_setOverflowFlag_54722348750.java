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

public class Cpu_setOverflowFlag_54722348750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192061;

    public Cpu_setOverflowFlag_54722348750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192156 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term192155 = ((Class) term192156).getDeclaredField((String) "NMOS_6502");
        ((Field) term192155).setAccessible(true);
        Object enum230 = ((Field) term192155).get((Object) null);
        HashMap term192087 = new HashMap();
        HashMap term192121 = new HashMap();
        term192061 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192076 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192079 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192081 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192084 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term192092 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term192093 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192101 = (int[]) newIntArray(2);
        int[] term192104 = (int[]) newIntArray(2);
        Object[] term192126 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term192127 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192135 = (int[]) newIntArray(2);
        int[] term192138 = (int[]) newIntArray(2);
        setLongField(term192061, term192061.getClass(), "clockPeriodInNs", 1000L);
        setField(term192061, term192061.getClass(), "behavior", enum230);
        setIntField(term192076, term192076.getClass(), "startAddress", 1475225110);
        setIntField(term192076, term192076.getClass(), "endAddress", -746882829);
        setLongField(term192079, term192079.getClass(), "clockPeriodInNs", 1000L);
        setField(term192079, term192079.getClass(), "behavior", enum230);
        setIntField(term192081, term192081.getClass(), "startAddress", 1303334365);
        setIntField(term192081, term192081.getClass(), "endAddress", 931490251);
        setLongField(term192084, term192084.getClass(), "clockPeriodInNs", 1000L);
        setField(term192084, term192084.getClass(), "behavior", enum230);
        setField(term192084, term192084.getClass(), "bus", null);
        setField(term192084, term192084.getClass(), "state", null);
        setLongField(term192084, term192084.getClass(), "opBeginTime", 7507072654888524944L);
        setField(term192081, term192081.getClass(), "cpu", term192084);
        setField(term192081, term192081.getClass(), "deviceMap", term192087);
        setField(term192081, term192081.getClass(), "deviceAddressArray", term192092);
        setField(term192079, term192079.getClass(), "bus", term192081);
        setIntField(term192093, term192093.getClass(), "a", 0);
        setIntField(term192093, term192093.getClass(), "x", 0);
        setIntField(term192093, term192093.getClass(), "y", 0);
        setIntField(term192093, term192093.getClass(), "sp", 0);
        setIntField(term192093, term192093.getClass(), "pc", 0);
        setIntField(term192093, term192093.getClass(), "ir", 0);
        setIntField(term192093, term192093.getClass(), "nextIr", 0);
        setField(term192093, term192093.getClass(), "args", term192101);
        setField(term192093, term192093.getClass(), "nextArgs", term192104);
        setIntField(term192093, term192093.getClass(), "instSize", 0);
        setBooleanField(term192093, term192093.getClass(), "opTrap", false);
        setBooleanField(term192093, term192093.getClass(), "irqAsserted", false);
        setBooleanField(term192093, term192093.getClass(), "nmiAsserted", false);
        setIntField(term192093, term192093.getClass(), "lastPc", 0);
        setBooleanField(term192093, term192093.getClass(), "carryFlag", false);
        setBooleanField(term192093, term192093.getClass(), "negativeFlag", false);
        setBooleanField(term192093, term192093.getClass(), "zeroFlag", false);
        setBooleanField(term192093, term192093.getClass(), "irqDisableFlag", false);
        setBooleanField(term192093, term192093.getClass(), "decimalModeFlag", false);
        setBooleanField(term192093, term192093.getClass(), "breakFlag", false);
        setBooleanField(term192093, term192093.getClass(), "overflowFlag", false);
        setLongField(term192093, term192093.getClass(), "stepCounter", 0L);
        setField(term192079, term192079.getClass(), "state", term192093);
        setLongField(term192079, term192079.getClass(), "opBeginTime", 8778744391146217826L);
        setField(term192076, term192076.getClass(), "cpu", term192079);
        setField(term192076, term192076.getClass(), "deviceMap", term192121);
        setField(term192076, term192076.getClass(), "deviceAddressArray", term192126);
        setField(term192061, term192061.getClass(), "bus", term192076);
        setIntField(term192127, term192127.getClass(), "a", 0);
        setIntField(term192127, term192127.getClass(), "x", 0);
        setIntField(term192127, term192127.getClass(), "y", 0);
        setIntField(term192127, term192127.getClass(), "sp", 0);
        setIntField(term192127, term192127.getClass(), "pc", 0);
        setIntField(term192127, term192127.getClass(), "ir", 0);
        setIntField(term192127, term192127.getClass(), "nextIr", 0);
        setField(term192127, term192127.getClass(), "args", term192135);
        setField(term192127, term192127.getClass(), "nextArgs", term192138);
        setIntField(term192127, term192127.getClass(), "instSize", 0);
        setBooleanField(term192127, term192127.getClass(), "opTrap", false);
        setBooleanField(term192127, term192127.getClass(), "irqAsserted", false);
        setBooleanField(term192127, term192127.getClass(), "nmiAsserted", false);
        setIntField(term192127, term192127.getClass(), "lastPc", 0);
        setBooleanField(term192127, term192127.getClass(), "carryFlag", false);
        setBooleanField(term192127, term192127.getClass(), "negativeFlag", false);
        setBooleanField(term192127, term192127.getClass(), "zeroFlag", false);
        setBooleanField(term192127, term192127.getClass(), "irqDisableFlag", false);
        setBooleanField(term192127, term192127.getClass(), "decimalModeFlag", false);
        setBooleanField(term192127, term192127.getClass(), "breakFlag", false);
        setBooleanField(term192127, term192127.getClass(), "overflowFlag", false);
        setLongField(term192127, term192127.getClass(), "stepCounter", 0L);
        setField(term192061, term192061.getClass(), "state", term192127);
        setLongField(term192061, term192061.getClass(), "opBeginTime", 7377514870475587049L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOverflowFlag", argTypes, term192061, args);
    }

};


