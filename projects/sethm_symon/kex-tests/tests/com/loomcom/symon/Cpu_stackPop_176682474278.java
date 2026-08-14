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

public class Cpu_stackPop_176682474278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202323;

    public Cpu_stackPop_176682474278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202418 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term202417 = ((Class) term202418).getDeclaredField((String) "NMOS_6502");
        ((Field) term202417).setAccessible(true);
        Object enum258 = ((Field) term202417).get((Object) null);
        HashMap term202349 = new HashMap();
        HashMap term202383 = new HashMap();
        term202323 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term202338 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term202341 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term202343 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term202346 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term202354 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term202355 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term202363 = (int[]) newIntArray(2);
        int[] term202366 = (int[]) newIntArray(2);
        Object[] term202388 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term202389 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term202397 = (int[]) newIntArray(2);
        int[] term202400 = (int[]) newIntArray(2);
        setLongField(term202323, term202323.getClass(), "clockPeriodInNs", 1000L);
        setField(term202323, term202323.getClass(), "behavior", enum258);
        setIntField(term202338, term202338.getClass(), "startAddress", -529078248);
        setIntField(term202338, term202338.getClass(), "endAddress", 2125754107);
        setLongField(term202341, term202341.getClass(), "clockPeriodInNs", 1000L);
        setField(term202341, term202341.getClass(), "behavior", enum258);
        setIntField(term202343, term202343.getClass(), "startAddress", 1094413748);
        setIntField(term202343, term202343.getClass(), "endAddress", 1697340530);
        setLongField(term202346, term202346.getClass(), "clockPeriodInNs", 1000L);
        setField(term202346, term202346.getClass(), "behavior", enum258);
        setField(term202346, term202346.getClass(), "bus", null);
        setField(term202346, term202346.getClass(), "state", null);
        setLongField(term202346, term202346.getClass(), "opBeginTime", 6993652740699384445L);
        setField(term202343, term202343.getClass(), "cpu", term202346);
        setField(term202343, term202343.getClass(), "deviceMap", term202349);
        setField(term202343, term202343.getClass(), "deviceAddressArray", term202354);
        setField(term202341, term202341.getClass(), "bus", term202343);
        setIntField(term202355, term202355.getClass(), "a", 0);
        setIntField(term202355, term202355.getClass(), "x", 0);
        setIntField(term202355, term202355.getClass(), "y", 0);
        setIntField(term202355, term202355.getClass(), "sp", 0);
        setIntField(term202355, term202355.getClass(), "pc", 0);
        setIntField(term202355, term202355.getClass(), "ir", 0);
        setIntField(term202355, term202355.getClass(), "nextIr", 0);
        setField(term202355, term202355.getClass(), "args", term202363);
        setField(term202355, term202355.getClass(), "nextArgs", term202366);
        setIntField(term202355, term202355.getClass(), "instSize", 0);
        setBooleanField(term202355, term202355.getClass(), "opTrap", false);
        setBooleanField(term202355, term202355.getClass(), "irqAsserted", false);
        setBooleanField(term202355, term202355.getClass(), "nmiAsserted", false);
        setIntField(term202355, term202355.getClass(), "lastPc", 0);
        setBooleanField(term202355, term202355.getClass(), "carryFlag", false);
        setBooleanField(term202355, term202355.getClass(), "negativeFlag", false);
        setBooleanField(term202355, term202355.getClass(), "zeroFlag", false);
        setBooleanField(term202355, term202355.getClass(), "irqDisableFlag", false);
        setBooleanField(term202355, term202355.getClass(), "decimalModeFlag", false);
        setBooleanField(term202355, term202355.getClass(), "breakFlag", false);
        setBooleanField(term202355, term202355.getClass(), "overflowFlag", false);
        setLongField(term202355, term202355.getClass(), "stepCounter", 0L);
        setField(term202341, term202341.getClass(), "state", term202355);
        setLongField(term202341, term202341.getClass(), "opBeginTime", -1750953812188769604L);
        setField(term202338, term202338.getClass(), "cpu", term202341);
        setField(term202338, term202338.getClass(), "deviceMap", term202383);
        setField(term202338, term202338.getClass(), "deviceAddressArray", term202388);
        setField(term202323, term202323.getClass(), "bus", term202338);
        setIntField(term202389, term202389.getClass(), "a", 0);
        setIntField(term202389, term202389.getClass(), "x", 0);
        setIntField(term202389, term202389.getClass(), "y", 0);
        setIntField(term202389, term202389.getClass(), "sp", 0);
        setIntField(term202389, term202389.getClass(), "pc", 0);
        setIntField(term202389, term202389.getClass(), "ir", 0);
        setIntField(term202389, term202389.getClass(), "nextIr", 0);
        setField(term202389, term202389.getClass(), "args", term202397);
        setField(term202389, term202389.getClass(), "nextArgs", term202400);
        setIntField(term202389, term202389.getClass(), "instSize", 0);
        setBooleanField(term202389, term202389.getClass(), "opTrap", false);
        setBooleanField(term202389, term202389.getClass(), "irqAsserted", false);
        setBooleanField(term202389, term202389.getClass(), "nmiAsserted", false);
        setIntField(term202389, term202389.getClass(), "lastPc", 0);
        setBooleanField(term202389, term202389.getClass(), "carryFlag", false);
        setBooleanField(term202389, term202389.getClass(), "negativeFlag", false);
        setBooleanField(term202389, term202389.getClass(), "zeroFlag", false);
        setBooleanField(term202389, term202389.getClass(), "irqDisableFlag", false);
        setBooleanField(term202389, term202389.getClass(), "decimalModeFlag", false);
        setBooleanField(term202389, term202389.getClass(), "breakFlag", false);
        setBooleanField(term202389, term202389.getClass(), "overflowFlag", false);
        setLongField(term202389, term202389.getClass(), "stepCounter", 0L);
        setField(term202323, term202323.getClass(), "state", term202389);
        setLongField(term202323, term202323.getClass(), "opBeginTime", -2708952612032666340L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stackPop", argTypes, term202323, args);
    }

};


