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

public class Cpu_getXRegister_165821900656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194259;

    public Cpu_getXRegister_165821900656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194354 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term194353 = ((Class) term194354).getDeclaredField((String) "NMOS_6502");
        ((Field) term194353).setAccessible(true);
        Object enum236 = ((Field) term194353).get((Object) null);
        HashMap term194285 = new HashMap();
        HashMap term194319 = new HashMap();
        term194259 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term194274 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term194277 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term194279 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term194282 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term194290 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term194291 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term194299 = (int[]) newIntArray(2);
        int[] term194302 = (int[]) newIntArray(2);
        Object[] term194324 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term194325 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term194333 = (int[]) newIntArray(2);
        int[] term194336 = (int[]) newIntArray(2);
        setLongField(term194259, term194259.getClass(), "clockPeriodInNs", 1000L);
        setField(term194259, term194259.getClass(), "behavior", enum236);
        setIntField(term194274, term194274.getClass(), "startAddress", -51203093);
        setIntField(term194274, term194274.getClass(), "endAddress", 950494826);
        setLongField(term194277, term194277.getClass(), "clockPeriodInNs", 1000L);
        setField(term194277, term194277.getClass(), "behavior", enum236);
        setIntField(term194279, term194279.getClass(), "startAddress", 364244181);
        setIntField(term194279, term194279.getClass(), "endAddress", -181128819);
        setLongField(term194282, term194282.getClass(), "clockPeriodInNs", 1000L);
        setField(term194282, term194282.getClass(), "behavior", enum236);
        setField(term194282, term194282.getClass(), "bus", null);
        setField(term194282, term194282.getClass(), "state", null);
        setLongField(term194282, term194282.getClass(), "opBeginTime", 1145539328952774873L);
        setField(term194279, term194279.getClass(), "cpu", term194282);
        setField(term194279, term194279.getClass(), "deviceMap", term194285);
        setField(term194279, term194279.getClass(), "deviceAddressArray", term194290);
        setField(term194277, term194277.getClass(), "bus", term194279);
        setIntField(term194291, term194291.getClass(), "a", 0);
        setIntField(term194291, term194291.getClass(), "x", 0);
        setIntField(term194291, term194291.getClass(), "y", 0);
        setIntField(term194291, term194291.getClass(), "sp", 0);
        setIntField(term194291, term194291.getClass(), "pc", 0);
        setIntField(term194291, term194291.getClass(), "ir", 0);
        setIntField(term194291, term194291.getClass(), "nextIr", 0);
        setField(term194291, term194291.getClass(), "args", term194299);
        setField(term194291, term194291.getClass(), "nextArgs", term194302);
        setIntField(term194291, term194291.getClass(), "instSize", 0);
        setBooleanField(term194291, term194291.getClass(), "opTrap", false);
        setBooleanField(term194291, term194291.getClass(), "irqAsserted", false);
        setBooleanField(term194291, term194291.getClass(), "nmiAsserted", false);
        setIntField(term194291, term194291.getClass(), "lastPc", 0);
        setBooleanField(term194291, term194291.getClass(), "carryFlag", false);
        setBooleanField(term194291, term194291.getClass(), "negativeFlag", false);
        setBooleanField(term194291, term194291.getClass(), "zeroFlag", false);
        setBooleanField(term194291, term194291.getClass(), "irqDisableFlag", false);
        setBooleanField(term194291, term194291.getClass(), "decimalModeFlag", false);
        setBooleanField(term194291, term194291.getClass(), "breakFlag", false);
        setBooleanField(term194291, term194291.getClass(), "overflowFlag", false);
        setLongField(term194291, term194291.getClass(), "stepCounter", 0L);
        setField(term194277, term194277.getClass(), "state", term194291);
        setLongField(term194277, term194277.getClass(), "opBeginTime", -4593197356529163455L);
        setField(term194274, term194274.getClass(), "cpu", term194277);
        setField(term194274, term194274.getClass(), "deviceMap", term194319);
        setField(term194274, term194274.getClass(), "deviceAddressArray", term194324);
        setField(term194259, term194259.getClass(), "bus", term194274);
        setIntField(term194325, term194325.getClass(), "a", 0);
        setIntField(term194325, term194325.getClass(), "x", 0);
        setIntField(term194325, term194325.getClass(), "y", 0);
        setIntField(term194325, term194325.getClass(), "sp", 0);
        setIntField(term194325, term194325.getClass(), "pc", 0);
        setIntField(term194325, term194325.getClass(), "ir", 0);
        setIntField(term194325, term194325.getClass(), "nextIr", 0);
        setField(term194325, term194325.getClass(), "args", term194333);
        setField(term194325, term194325.getClass(), "nextArgs", term194336);
        setIntField(term194325, term194325.getClass(), "instSize", 0);
        setBooleanField(term194325, term194325.getClass(), "opTrap", false);
        setBooleanField(term194325, term194325.getClass(), "irqAsserted", false);
        setBooleanField(term194325, term194325.getClass(), "nmiAsserted", false);
        setIntField(term194325, term194325.getClass(), "lastPc", 0);
        setBooleanField(term194325, term194325.getClass(), "carryFlag", false);
        setBooleanField(term194325, term194325.getClass(), "negativeFlag", false);
        setBooleanField(term194325, term194325.getClass(), "zeroFlag", false);
        setBooleanField(term194325, term194325.getClass(), "irqDisableFlag", false);
        setBooleanField(term194325, term194325.getClass(), "decimalModeFlag", false);
        setBooleanField(term194325, term194325.getClass(), "breakFlag", false);
        setBooleanField(term194325, term194325.getClass(), "overflowFlag", false);
        setLongField(term194325, term194325.getClass(), "stepCounter", 0L);
        setField(term194259, term194259.getClass(), "state", term194325);
        setLongField(term194259, term194259.getClass(), "opBeginTime", -8449554760304422682L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getXRegister", argTypes, term194259, args);
    }

};


