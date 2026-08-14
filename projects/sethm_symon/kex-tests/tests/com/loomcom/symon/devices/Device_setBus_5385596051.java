package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Device_setBus_5385596051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9411;

    public Device_setBus_5385596051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9500 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term9499 = ((Class) term9500).getDeclaredField((String) "NMOS_6502");
        ((Field) term9499).setAccessible(true);
        Object enum20 = ((Field) term9499).get((Object) null);
        HashMap term9459 = new HashMap();
        HashMap term9493 = new HashMap();
        term9411 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term9414 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term9429 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term9432 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term9434 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term9437 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term9464 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term9465 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term9473 = (int[]) newIntArray(2);
        int[] term9476 = (int[]) newIntArray(2);
        Object[] term9498 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        setIntField(term9411, term9411.getClass(), "startAddress", -1212399479);
        setIntField(term9411, term9411.getClass(), "endAddress", 2107679041);
        setLongField(term9414, term9414.getClass(), "clockPeriodInNs", 1000L);
        setField(term9414, term9414.getClass(), "behavior", enum20);
        setIntField(term9429, term9429.getClass(), "startAddress", 2040965507);
        setIntField(term9429, term9429.getClass(), "endAddress", -1281083262);
        setLongField(term9432, term9432.getClass(), "clockPeriodInNs", 1000L);
        setField(term9432, term9432.getClass(), "behavior", enum20);
        setIntField(term9434, term9434.getClass(), "startAddress", 1059930704);
        setIntField(term9434, term9434.getClass(), "endAddress", -1967153290);
        setField(term9434, term9434.getClass(), "cpu", null);
        setField(term9434, term9434.getClass(), "deviceMap", null);
        setField(term9434, term9434.getClass(), "deviceAddressArray", null);
        setField(term9432, term9432.getClass(), "bus", term9434);
        setIntField(term9437, term9437.getClass(), "a", 0);
        setIntField(term9437, term9437.getClass(), "x", 0);
        setIntField(term9437, term9437.getClass(), "y", 0);
        setIntField(term9437, term9437.getClass(), "sp", 0);
        setIntField(term9437, term9437.getClass(), "pc", 0);
        setIntField(term9437, term9437.getClass(), "ir", 0);
        setIntField(term9437, term9437.getClass(), "nextIr", 0);
        setField(term9437, term9437.getClass(), "args", null);
        setField(term9437, term9437.getClass(), "nextArgs", null);
        setIntField(term9437, term9437.getClass(), "instSize", 0);
        setBooleanField(term9437, term9437.getClass(), "opTrap", false);
        setBooleanField(term9437, term9437.getClass(), "irqAsserted", false);
        setBooleanField(term9437, term9437.getClass(), "nmiAsserted", false);
        setIntField(term9437, term9437.getClass(), "lastPc", 0);
        setBooleanField(term9437, term9437.getClass(), "carryFlag", false);
        setBooleanField(term9437, term9437.getClass(), "negativeFlag", false);
        setBooleanField(term9437, term9437.getClass(), "zeroFlag", false);
        setBooleanField(term9437, term9437.getClass(), "irqDisableFlag", false);
        setBooleanField(term9437, term9437.getClass(), "decimalModeFlag", false);
        setBooleanField(term9437, term9437.getClass(), "breakFlag", false);
        setBooleanField(term9437, term9437.getClass(), "overflowFlag", false);
        setLongField(term9437, term9437.getClass(), "stepCounter", 0L);
        setField(term9432, term9432.getClass(), "state", term9437);
        setLongField(term9432, term9432.getClass(), "opBeginTime", 2297097306706899827L);
        setField(term9429, term9429.getClass(), "cpu", term9432);
        setField(term9429, term9429.getClass(), "deviceMap", term9459);
        setField(term9429, term9429.getClass(), "deviceAddressArray", term9464);
        setField(term9414, term9414.getClass(), "bus", term9429);
        setIntField(term9465, term9465.getClass(), "a", 0);
        setIntField(term9465, term9465.getClass(), "x", 0);
        setIntField(term9465, term9465.getClass(), "y", 0);
        setIntField(term9465, term9465.getClass(), "sp", 0);
        setIntField(term9465, term9465.getClass(), "pc", 0);
        setIntField(term9465, term9465.getClass(), "ir", 0);
        setIntField(term9465, term9465.getClass(), "nextIr", 0);
        setField(term9465, term9465.getClass(), "args", term9473);
        setField(term9465, term9465.getClass(), "nextArgs", term9476);
        setIntField(term9465, term9465.getClass(), "instSize", 0);
        setBooleanField(term9465, term9465.getClass(), "opTrap", false);
        setBooleanField(term9465, term9465.getClass(), "irqAsserted", false);
        setBooleanField(term9465, term9465.getClass(), "nmiAsserted", false);
        setIntField(term9465, term9465.getClass(), "lastPc", 0);
        setBooleanField(term9465, term9465.getClass(), "carryFlag", false);
        setBooleanField(term9465, term9465.getClass(), "negativeFlag", false);
        setBooleanField(term9465, term9465.getClass(), "zeroFlag", false);
        setBooleanField(term9465, term9465.getClass(), "irqDisableFlag", false);
        setBooleanField(term9465, term9465.getClass(), "decimalModeFlag", false);
        setBooleanField(term9465, term9465.getClass(), "breakFlag", false);
        setBooleanField(term9465, term9465.getClass(), "overflowFlag", false);
        setLongField(term9465, term9465.getClass(), "stepCounter", 0L);
        setField(term9414, term9414.getClass(), "state", term9465);
        setLongField(term9414, term9414.getClass(), "opBeginTime", -900457279156388404L);
        setField(term9411, term9411.getClass(), "cpu", term9414);
        setField(term9411, term9411.getClass(), "deviceMap", term9493);
        setField(term9411, term9411.getClass(), "deviceAddressArray", term9498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.Bus");
        Object[] args = new Object[1];
        args[0] = term9411;
        callMethod(klass, "setBus", argTypes, null, args);
    }

};


