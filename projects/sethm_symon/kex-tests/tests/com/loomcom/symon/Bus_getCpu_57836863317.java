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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Bus_getCpu_57836863317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41252;

    public Bus_getCpu_57836863317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41341 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term41340 = ((Class) term41341).getDeclaredField((String) "NMOS_6502");
        ((Field) term41340).setAccessible(true);
        Object enum37 = ((Field) term41340).get((Object) null);
        HashMap term41300 = new HashMap();
        HashMap term41334 = new HashMap();
        term41252 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41255 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term41270 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41273 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term41275 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41278 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term41305 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term41306 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term41314 = (int[]) newIntArray(2);
        int[] term41317 = (int[]) newIntArray(2);
        Object[] term41339 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term41252, term41252.getClass(), "startAddress", 657342039);
        setIntField(term41252, term41252.getClass(), "endAddress", 1483999606);
        setLongField(term41255, term41255.getClass(), "clockPeriodInNs", 1000L);
        setField(term41255, term41255.getClass(), "behavior", enum37);
        setIntField(term41270, term41270.getClass(), "startAddress", 1871761182);
        setIntField(term41270, term41270.getClass(), "endAddress", 233983728);
        setLongField(term41273, term41273.getClass(), "clockPeriodInNs", 1000L);
        setField(term41273, term41273.getClass(), "behavior", enum37);
        setIntField(term41275, term41275.getClass(), "startAddress", -1650132476);
        setIntField(term41275, term41275.getClass(), "endAddress", 1719680265);
        setField(term41275, term41275.getClass(), "cpu", null);
        setField(term41275, term41275.getClass(), "deviceMap", null);
        setField(term41275, term41275.getClass(), "deviceAddressArray", null);
        setField(term41273, term41273.getClass(), "bus", term41275);
        setIntField(term41278, term41278.getClass(), "a", 0);
        setIntField(term41278, term41278.getClass(), "x", 0);
        setIntField(term41278, term41278.getClass(), "y", 0);
        setIntField(term41278, term41278.getClass(), "sp", 0);
        setIntField(term41278, term41278.getClass(), "pc", 0);
        setIntField(term41278, term41278.getClass(), "ir", 0);
        setIntField(term41278, term41278.getClass(), "nextIr", 0);
        setField(term41278, term41278.getClass(), "args", null);
        setField(term41278, term41278.getClass(), "nextArgs", null);
        setIntField(term41278, term41278.getClass(), "instSize", 0);
        setBooleanField(term41278, term41278.getClass(), "opTrap", false);
        setBooleanField(term41278, term41278.getClass(), "irqAsserted", false);
        setBooleanField(term41278, term41278.getClass(), "nmiAsserted", false);
        setIntField(term41278, term41278.getClass(), "lastPc", 0);
        setBooleanField(term41278, term41278.getClass(), "carryFlag", false);
        setBooleanField(term41278, term41278.getClass(), "negativeFlag", false);
        setBooleanField(term41278, term41278.getClass(), "zeroFlag", false);
        setBooleanField(term41278, term41278.getClass(), "irqDisableFlag", false);
        setBooleanField(term41278, term41278.getClass(), "decimalModeFlag", false);
        setBooleanField(term41278, term41278.getClass(), "breakFlag", false);
        setBooleanField(term41278, term41278.getClass(), "overflowFlag", false);
        setLongField(term41278, term41278.getClass(), "stepCounter", 0L);
        setField(term41273, term41273.getClass(), "state", term41278);
        setLongField(term41273, term41273.getClass(), "opBeginTime", 1253549421411622358L);
        setField(term41270, term41270.getClass(), "cpu", term41273);
        setField(term41270, term41270.getClass(), "deviceMap", term41300);
        setField(term41270, term41270.getClass(), "deviceAddressArray", term41305);
        setField(term41255, term41255.getClass(), "bus", term41270);
        setIntField(term41306, term41306.getClass(), "a", 0);
        setIntField(term41306, term41306.getClass(), "x", 0);
        setIntField(term41306, term41306.getClass(), "y", 0);
        setIntField(term41306, term41306.getClass(), "sp", 0);
        setIntField(term41306, term41306.getClass(), "pc", 0);
        setIntField(term41306, term41306.getClass(), "ir", 0);
        setIntField(term41306, term41306.getClass(), "nextIr", 0);
        setField(term41306, term41306.getClass(), "args", term41314);
        setField(term41306, term41306.getClass(), "nextArgs", term41317);
        setIntField(term41306, term41306.getClass(), "instSize", 0);
        setBooleanField(term41306, term41306.getClass(), "opTrap", false);
        setBooleanField(term41306, term41306.getClass(), "irqAsserted", false);
        setBooleanField(term41306, term41306.getClass(), "nmiAsserted", false);
        setIntField(term41306, term41306.getClass(), "lastPc", 0);
        setBooleanField(term41306, term41306.getClass(), "carryFlag", false);
        setBooleanField(term41306, term41306.getClass(), "negativeFlag", false);
        setBooleanField(term41306, term41306.getClass(), "zeroFlag", false);
        setBooleanField(term41306, term41306.getClass(), "irqDisableFlag", false);
        setBooleanField(term41306, term41306.getClass(), "decimalModeFlag", false);
        setBooleanField(term41306, term41306.getClass(), "breakFlag", false);
        setBooleanField(term41306, term41306.getClass(), "overflowFlag", false);
        setLongField(term41306, term41306.getClass(), "stepCounter", 0L);
        setField(term41255, term41255.getClass(), "state", term41306);
        setLongField(term41255, term41255.getClass(), "opBeginTime", 3666226122807672448L);
        setField(term41252, term41252.getClass(), "cpu", term41255);
        setField(term41252, term41252.getClass(), "deviceMap", term41334);
        setField(term41252, term41252.getClass(), "deviceAddressArray", term41339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpu", argTypes, term41252, args);
    }

};


