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

public class Cpu_setYRegister_92831201959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195359;
     Object term195453;

    public Cpu_setYRegister_92831201959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195456 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term195455 = ((Class) term195456).getDeclaredField((String) "NMOS_6502");
        ((Field) term195455).setAccessible(true);
        Object enum239 = ((Field) term195455).get((Object) null);
        HashMap term195385 = new HashMap();
        HashMap term195419 = new HashMap();
        term195359 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195374 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195377 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195379 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195382 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term195390 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term195391 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195399 = (int[]) newIntArray(2);
        int[] term195402 = (int[]) newIntArray(2);
        Object[] term195424 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term195425 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195433 = (int[]) newIntArray(2);
        int[] term195436 = (int[]) newIntArray(2);
        setLongField(term195359, term195359.getClass(), "clockPeriodInNs", 1000L);
        setField(term195359, term195359.getClass(), "behavior", enum239);
        setIntField(term195374, term195374.getClass(), "startAddress", -200717429);
        setIntField(term195374, term195374.getClass(), "endAddress", 1017751788);
        setLongField(term195377, term195377.getClass(), "clockPeriodInNs", 1000L);
        setField(term195377, term195377.getClass(), "behavior", enum239);
        setIntField(term195379, term195379.getClass(), "startAddress", 452190809);
        setIntField(term195379, term195379.getClass(), "endAddress", -868819495);
        setLongField(term195382, term195382.getClass(), "clockPeriodInNs", 1000L);
        setField(term195382, term195382.getClass(), "behavior", enum239);
        setField(term195382, term195382.getClass(), "bus", null);
        setField(term195382, term195382.getClass(), "state", null);
        setLongField(term195382, term195382.getClass(), "opBeginTime", -5515080039914707735L);
        setField(term195379, term195379.getClass(), "cpu", term195382);
        setField(term195379, term195379.getClass(), "deviceMap", term195385);
        setField(term195379, term195379.getClass(), "deviceAddressArray", term195390);
        setField(term195377, term195377.getClass(), "bus", term195379);
        setIntField(term195391, term195391.getClass(), "a", 0);
        setIntField(term195391, term195391.getClass(), "x", 0);
        setIntField(term195391, term195391.getClass(), "y", 0);
        setIntField(term195391, term195391.getClass(), "sp", 0);
        setIntField(term195391, term195391.getClass(), "pc", 0);
        setIntField(term195391, term195391.getClass(), "ir", 0);
        setIntField(term195391, term195391.getClass(), "nextIr", 0);
        setField(term195391, term195391.getClass(), "args", term195399);
        setField(term195391, term195391.getClass(), "nextArgs", term195402);
        setIntField(term195391, term195391.getClass(), "instSize", 0);
        setBooleanField(term195391, term195391.getClass(), "opTrap", false);
        setBooleanField(term195391, term195391.getClass(), "irqAsserted", false);
        setBooleanField(term195391, term195391.getClass(), "nmiAsserted", false);
        setIntField(term195391, term195391.getClass(), "lastPc", 0);
        setBooleanField(term195391, term195391.getClass(), "carryFlag", false);
        setBooleanField(term195391, term195391.getClass(), "negativeFlag", false);
        setBooleanField(term195391, term195391.getClass(), "zeroFlag", false);
        setBooleanField(term195391, term195391.getClass(), "irqDisableFlag", false);
        setBooleanField(term195391, term195391.getClass(), "decimalModeFlag", false);
        setBooleanField(term195391, term195391.getClass(), "breakFlag", false);
        setBooleanField(term195391, term195391.getClass(), "overflowFlag", false);
        setLongField(term195391, term195391.getClass(), "stepCounter", 0L);
        setField(term195377, term195377.getClass(), "state", term195391);
        setLongField(term195377, term195377.getClass(), "opBeginTime", -6249289368466698064L);
        setField(term195374, term195374.getClass(), "cpu", term195377);
        setField(term195374, term195374.getClass(), "deviceMap", term195419);
        setField(term195374, term195374.getClass(), "deviceAddressArray", term195424);
        setField(term195359, term195359.getClass(), "bus", term195374);
        setIntField(term195425, term195425.getClass(), "a", 0);
        setIntField(term195425, term195425.getClass(), "x", 0);
        setIntField(term195425, term195425.getClass(), "y", 0);
        setIntField(term195425, term195425.getClass(), "sp", 0);
        setIntField(term195425, term195425.getClass(), "pc", 0);
        setIntField(term195425, term195425.getClass(), "ir", 0);
        setIntField(term195425, term195425.getClass(), "nextIr", 0);
        setField(term195425, term195425.getClass(), "args", term195433);
        setField(term195425, term195425.getClass(), "nextArgs", term195436);
        setIntField(term195425, term195425.getClass(), "instSize", 0);
        setBooleanField(term195425, term195425.getClass(), "opTrap", false);
        setBooleanField(term195425, term195425.getClass(), "irqAsserted", false);
        setBooleanField(term195425, term195425.getClass(), "nmiAsserted", false);
        setIntField(term195425, term195425.getClass(), "lastPc", 0);
        setBooleanField(term195425, term195425.getClass(), "carryFlag", false);
        setBooleanField(term195425, term195425.getClass(), "negativeFlag", false);
        setBooleanField(term195425, term195425.getClass(), "zeroFlag", false);
        setBooleanField(term195425, term195425.getClass(), "irqDisableFlag", false);
        setBooleanField(term195425, term195425.getClass(), "decimalModeFlag", false);
        setBooleanField(term195425, term195425.getClass(), "breakFlag", false);
        setBooleanField(term195425, term195425.getClass(), "overflowFlag", false);
        setLongField(term195425, term195425.getClass(), "stepCounter", 0L);
        setField(term195359, term195359.getClass(), "state", term195425);
        setLongField(term195359, term195359.getClass(), "opBeginTime", 4087729695916598698L);
        term195453 = new Integer(1522532191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term195453;
        callMethod(klass, "setYRegister", argTypes, term195359, args);
    }

};


