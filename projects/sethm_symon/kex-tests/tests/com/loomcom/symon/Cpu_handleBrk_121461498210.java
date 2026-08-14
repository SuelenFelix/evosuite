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

public class Cpu_handleBrk_121461498210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177369;
     Object term177463;

    public Cpu_handleBrk_121461498210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177466 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term177465 = ((Class) term177466).getDeclaredField((String) "NMOS_6502");
        ((Field) term177465).setAccessible(true);
        Object enum190 = ((Field) term177465).get((Object) null);
        HashMap term177395 = new HashMap();
        HashMap term177429 = new HashMap();
        term177369 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177384 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177387 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177389 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177392 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term177400 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term177401 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177409 = (int[]) newIntArray(2);
        int[] term177412 = (int[]) newIntArray(2);
        Object[] term177434 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term177435 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177443 = (int[]) newIntArray(2);
        int[] term177446 = (int[]) newIntArray(2);
        setLongField(term177369, term177369.getClass(), "clockPeriodInNs", 1000L);
        setField(term177369, term177369.getClass(), "behavior", enum190);
        setIntField(term177384, term177384.getClass(), "startAddress", 729869031);
        setIntField(term177384, term177384.getClass(), "endAddress", 79654623);
        setLongField(term177387, term177387.getClass(), "clockPeriodInNs", 1000L);
        setField(term177387, term177387.getClass(), "behavior", enum190);
        setIntField(term177389, term177389.getClass(), "startAddress", 539233848);
        setIntField(term177389, term177389.getClass(), "endAddress", -1368797597);
        setLongField(term177392, term177392.getClass(), "clockPeriodInNs", 1000L);
        setField(term177392, term177392.getClass(), "behavior", enum190);
        setField(term177392, term177392.getClass(), "bus", null);
        setField(term177392, term177392.getClass(), "state", null);
        setLongField(term177392, term177392.getClass(), "opBeginTime", -5317408542996378156L);
        setField(term177389, term177389.getClass(), "cpu", term177392);
        setField(term177389, term177389.getClass(), "deviceMap", term177395);
        setField(term177389, term177389.getClass(), "deviceAddressArray", term177400);
        setField(term177387, term177387.getClass(), "bus", term177389);
        setIntField(term177401, term177401.getClass(), "a", 0);
        setIntField(term177401, term177401.getClass(), "x", 0);
        setIntField(term177401, term177401.getClass(), "y", 0);
        setIntField(term177401, term177401.getClass(), "sp", 0);
        setIntField(term177401, term177401.getClass(), "pc", 0);
        setIntField(term177401, term177401.getClass(), "ir", 0);
        setIntField(term177401, term177401.getClass(), "nextIr", 0);
        setField(term177401, term177401.getClass(), "args", term177409);
        setField(term177401, term177401.getClass(), "nextArgs", term177412);
        setIntField(term177401, term177401.getClass(), "instSize", 0);
        setBooleanField(term177401, term177401.getClass(), "opTrap", false);
        setBooleanField(term177401, term177401.getClass(), "irqAsserted", false);
        setBooleanField(term177401, term177401.getClass(), "nmiAsserted", false);
        setIntField(term177401, term177401.getClass(), "lastPc", 0);
        setBooleanField(term177401, term177401.getClass(), "carryFlag", false);
        setBooleanField(term177401, term177401.getClass(), "negativeFlag", false);
        setBooleanField(term177401, term177401.getClass(), "zeroFlag", false);
        setBooleanField(term177401, term177401.getClass(), "irqDisableFlag", false);
        setBooleanField(term177401, term177401.getClass(), "decimalModeFlag", false);
        setBooleanField(term177401, term177401.getClass(), "breakFlag", false);
        setBooleanField(term177401, term177401.getClass(), "overflowFlag", false);
        setLongField(term177401, term177401.getClass(), "stepCounter", 0L);
        setField(term177387, term177387.getClass(), "state", term177401);
        setLongField(term177387, term177387.getClass(), "opBeginTime", 3345606904545902400L);
        setField(term177384, term177384.getClass(), "cpu", term177387);
        setField(term177384, term177384.getClass(), "deviceMap", term177429);
        setField(term177384, term177384.getClass(), "deviceAddressArray", term177434);
        setField(term177369, term177369.getClass(), "bus", term177384);
        setIntField(term177435, term177435.getClass(), "a", 0);
        setIntField(term177435, term177435.getClass(), "x", 0);
        setIntField(term177435, term177435.getClass(), "y", 0);
        setIntField(term177435, term177435.getClass(), "sp", 0);
        setIntField(term177435, term177435.getClass(), "pc", 0);
        setIntField(term177435, term177435.getClass(), "ir", 0);
        setIntField(term177435, term177435.getClass(), "nextIr", 0);
        setField(term177435, term177435.getClass(), "args", term177443);
        setField(term177435, term177435.getClass(), "nextArgs", term177446);
        setIntField(term177435, term177435.getClass(), "instSize", 0);
        setBooleanField(term177435, term177435.getClass(), "opTrap", false);
        setBooleanField(term177435, term177435.getClass(), "irqAsserted", false);
        setBooleanField(term177435, term177435.getClass(), "nmiAsserted", false);
        setIntField(term177435, term177435.getClass(), "lastPc", 0);
        setBooleanField(term177435, term177435.getClass(), "carryFlag", false);
        setBooleanField(term177435, term177435.getClass(), "negativeFlag", false);
        setBooleanField(term177435, term177435.getClass(), "zeroFlag", false);
        setBooleanField(term177435, term177435.getClass(), "irqDisableFlag", false);
        setBooleanField(term177435, term177435.getClass(), "decimalModeFlag", false);
        setBooleanField(term177435, term177435.getClass(), "breakFlag", false);
        setBooleanField(term177435, term177435.getClass(), "overflowFlag", false);
        setLongField(term177435, term177435.getClass(), "stepCounter", 0L);
        setField(term177369, term177369.getClass(), "state", term177435);
        setLongField(term177369, term177369.getClass(), "opBeginTime", -6289397283685653555L);
        term177463 = new Integer(-1215654854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177463;
        callMethod(klass, "handleBrk", argTypes, term177369, args);
    }

};


