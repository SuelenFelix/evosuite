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

public class Cpu_step_11444256017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176269;
     Object term176363;

    public Cpu_step_11444256017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term176366 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term176365 = ((Class) term176366).getDeclaredField((String) "NMOS_6502");
        ((Field) term176365).setAccessible(true);
        Object enum187 = ((Field) term176365).get((Object) null);
        HashMap term176295 = new HashMap();
        HashMap term176329 = new HashMap();
        term176269 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term176284 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term176287 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term176289 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term176292 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term176300 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term176301 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term176309 = (int[]) newIntArray(2);
        int[] term176312 = (int[]) newIntArray(2);
        Object[] term176334 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term176335 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term176343 = (int[]) newIntArray(2);
        int[] term176346 = (int[]) newIntArray(2);
        setLongField(term176269, term176269.getClass(), "clockPeriodInNs", 1000L);
        setField(term176269, term176269.getClass(), "behavior", enum187);
        setIntField(term176284, term176284.getClass(), "startAddress", 78868015);
        setIntField(term176284, term176284.getClass(), "endAddress", 1775132358);
        setLongField(term176287, term176287.getClass(), "clockPeriodInNs", 1000L);
        setField(term176287, term176287.getClass(), "behavior", enum187);
        setIntField(term176289, term176289.getClass(), "startAddress", 1425161368);
        setIntField(term176289, term176289.getClass(), "endAddress", -340532486);
        setLongField(term176292, term176292.getClass(), "clockPeriodInNs", 1000L);
        setField(term176292, term176292.getClass(), "behavior", enum187);
        setField(term176292, term176292.getClass(), "bus", null);
        setField(term176292, term176292.getClass(), "state", null);
        setLongField(term176292, term176292.getClass(), "opBeginTime", -7055293192926325895L);
        setField(term176289, term176289.getClass(), "cpu", term176292);
        setField(term176289, term176289.getClass(), "deviceMap", term176295);
        setField(term176289, term176289.getClass(), "deviceAddressArray", term176300);
        setField(term176287, term176287.getClass(), "bus", term176289);
        setIntField(term176301, term176301.getClass(), "a", 0);
        setIntField(term176301, term176301.getClass(), "x", 0);
        setIntField(term176301, term176301.getClass(), "y", 0);
        setIntField(term176301, term176301.getClass(), "sp", 0);
        setIntField(term176301, term176301.getClass(), "pc", 0);
        setIntField(term176301, term176301.getClass(), "ir", 0);
        setIntField(term176301, term176301.getClass(), "nextIr", 0);
        setField(term176301, term176301.getClass(), "args", term176309);
        setField(term176301, term176301.getClass(), "nextArgs", term176312);
        setIntField(term176301, term176301.getClass(), "instSize", 0);
        setBooleanField(term176301, term176301.getClass(), "opTrap", false);
        setBooleanField(term176301, term176301.getClass(), "irqAsserted", false);
        setBooleanField(term176301, term176301.getClass(), "nmiAsserted", false);
        setIntField(term176301, term176301.getClass(), "lastPc", 0);
        setBooleanField(term176301, term176301.getClass(), "carryFlag", false);
        setBooleanField(term176301, term176301.getClass(), "negativeFlag", false);
        setBooleanField(term176301, term176301.getClass(), "zeroFlag", false);
        setBooleanField(term176301, term176301.getClass(), "irqDisableFlag", false);
        setBooleanField(term176301, term176301.getClass(), "decimalModeFlag", false);
        setBooleanField(term176301, term176301.getClass(), "breakFlag", false);
        setBooleanField(term176301, term176301.getClass(), "overflowFlag", false);
        setLongField(term176301, term176301.getClass(), "stepCounter", 0L);
        setField(term176287, term176287.getClass(), "state", term176301);
        setLongField(term176287, term176287.getClass(), "opBeginTime", 9121171957554652661L);
        setField(term176284, term176284.getClass(), "cpu", term176287);
        setField(term176284, term176284.getClass(), "deviceMap", term176329);
        setField(term176284, term176284.getClass(), "deviceAddressArray", term176334);
        setField(term176269, term176269.getClass(), "bus", term176284);
        setIntField(term176335, term176335.getClass(), "a", 0);
        setIntField(term176335, term176335.getClass(), "x", 0);
        setIntField(term176335, term176335.getClass(), "y", 0);
        setIntField(term176335, term176335.getClass(), "sp", 0);
        setIntField(term176335, term176335.getClass(), "pc", 0);
        setIntField(term176335, term176335.getClass(), "ir", 0);
        setIntField(term176335, term176335.getClass(), "nextIr", 0);
        setField(term176335, term176335.getClass(), "args", term176343);
        setField(term176335, term176335.getClass(), "nextArgs", term176346);
        setIntField(term176335, term176335.getClass(), "instSize", 0);
        setBooleanField(term176335, term176335.getClass(), "opTrap", false);
        setBooleanField(term176335, term176335.getClass(), "irqAsserted", false);
        setBooleanField(term176335, term176335.getClass(), "nmiAsserted", false);
        setIntField(term176335, term176335.getClass(), "lastPc", 0);
        setBooleanField(term176335, term176335.getClass(), "carryFlag", false);
        setBooleanField(term176335, term176335.getClass(), "negativeFlag", false);
        setBooleanField(term176335, term176335.getClass(), "zeroFlag", false);
        setBooleanField(term176335, term176335.getClass(), "irqDisableFlag", false);
        setBooleanField(term176335, term176335.getClass(), "decimalModeFlag", false);
        setBooleanField(term176335, term176335.getClass(), "breakFlag", false);
        setBooleanField(term176335, term176335.getClass(), "overflowFlag", false);
        setLongField(term176335, term176335.getClass(), "stepCounter", 0L);
        setField(term176269, term176269.getClass(), "state", term176335);
        setLongField(term176269, term176269.getClass(), "opBeginTime", -2752058965354731489L);
        term176363 = new Integer(-1402177219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176363;
        callMethod(klass, "step", argTypes, term176269, args);
    }

};


