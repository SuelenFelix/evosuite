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

public class Cpu_getBus_5776163853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174524;

    public Cpu_getBus_5776163853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term174619 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term174618 = ((Class) term174619).getDeclaredField((String) "NMOS_6502");
        ((Field) term174618).setAccessible(true);
        Object enum182 = ((Field) term174618).get((Object) null);
        HashMap term174550 = new HashMap();
        HashMap term174584 = new HashMap();
        term174524 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term174539 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term174542 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term174544 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term174547 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term174555 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term174556 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term174564 = (int[]) newIntArray(2);
        int[] term174567 = (int[]) newIntArray(2);
        Object[] term174589 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term174590 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term174598 = (int[]) newIntArray(2);
        int[] term174601 = (int[]) newIntArray(2);
        setLongField(term174524, term174524.getClass(), "clockPeriodInNs", 1000L);
        setField(term174524, term174524.getClass(), "behavior", enum182);
        setIntField(term174539, term174539.getClass(), "startAddress", -1834113546);
        setIntField(term174539, term174539.getClass(), "endAddress", -1096758602);
        setLongField(term174542, term174542.getClass(), "clockPeriodInNs", 1000L);
        setField(term174542, term174542.getClass(), "behavior", enum182);
        setIntField(term174544, term174544.getClass(), "startAddress", -1673344361);
        setIntField(term174544, term174544.getClass(), "endAddress", 165656819);
        setLongField(term174547, term174547.getClass(), "clockPeriodInNs", 1000L);
        setField(term174547, term174547.getClass(), "behavior", enum182);
        setField(term174547, term174547.getClass(), "bus", null);
        setField(term174547, term174547.getClass(), "state", null);
        setLongField(term174547, term174547.getClass(), "opBeginTime", -5269076898456067678L);
        setField(term174544, term174544.getClass(), "cpu", term174547);
        setField(term174544, term174544.getClass(), "deviceMap", term174550);
        setField(term174544, term174544.getClass(), "deviceAddressArray", term174555);
        setField(term174542, term174542.getClass(), "bus", term174544);
        setIntField(term174556, term174556.getClass(), "a", 0);
        setIntField(term174556, term174556.getClass(), "x", 0);
        setIntField(term174556, term174556.getClass(), "y", 0);
        setIntField(term174556, term174556.getClass(), "sp", 0);
        setIntField(term174556, term174556.getClass(), "pc", 0);
        setIntField(term174556, term174556.getClass(), "ir", 0);
        setIntField(term174556, term174556.getClass(), "nextIr", 0);
        setField(term174556, term174556.getClass(), "args", term174564);
        setField(term174556, term174556.getClass(), "nextArgs", term174567);
        setIntField(term174556, term174556.getClass(), "instSize", 0);
        setBooleanField(term174556, term174556.getClass(), "opTrap", false);
        setBooleanField(term174556, term174556.getClass(), "irqAsserted", false);
        setBooleanField(term174556, term174556.getClass(), "nmiAsserted", false);
        setIntField(term174556, term174556.getClass(), "lastPc", 0);
        setBooleanField(term174556, term174556.getClass(), "carryFlag", false);
        setBooleanField(term174556, term174556.getClass(), "negativeFlag", false);
        setBooleanField(term174556, term174556.getClass(), "zeroFlag", false);
        setBooleanField(term174556, term174556.getClass(), "irqDisableFlag", false);
        setBooleanField(term174556, term174556.getClass(), "decimalModeFlag", false);
        setBooleanField(term174556, term174556.getClass(), "breakFlag", false);
        setBooleanField(term174556, term174556.getClass(), "overflowFlag", false);
        setLongField(term174556, term174556.getClass(), "stepCounter", 0L);
        setField(term174542, term174542.getClass(), "state", term174556);
        setLongField(term174542, term174542.getClass(), "opBeginTime", 2124275424075254005L);
        setField(term174539, term174539.getClass(), "cpu", term174542);
        setField(term174539, term174539.getClass(), "deviceMap", term174584);
        setField(term174539, term174539.getClass(), "deviceAddressArray", term174589);
        setField(term174524, term174524.getClass(), "bus", term174539);
        setIntField(term174590, term174590.getClass(), "a", 0);
        setIntField(term174590, term174590.getClass(), "x", 0);
        setIntField(term174590, term174590.getClass(), "y", 0);
        setIntField(term174590, term174590.getClass(), "sp", 0);
        setIntField(term174590, term174590.getClass(), "pc", 0);
        setIntField(term174590, term174590.getClass(), "ir", 0);
        setIntField(term174590, term174590.getClass(), "nextIr", 0);
        setField(term174590, term174590.getClass(), "args", term174598);
        setField(term174590, term174590.getClass(), "nextArgs", term174601);
        setIntField(term174590, term174590.getClass(), "instSize", 0);
        setBooleanField(term174590, term174590.getClass(), "opTrap", false);
        setBooleanField(term174590, term174590.getClass(), "irqAsserted", false);
        setBooleanField(term174590, term174590.getClass(), "nmiAsserted", false);
        setIntField(term174590, term174590.getClass(), "lastPc", 0);
        setBooleanField(term174590, term174590.getClass(), "carryFlag", false);
        setBooleanField(term174590, term174590.getClass(), "negativeFlag", false);
        setBooleanField(term174590, term174590.getClass(), "zeroFlag", false);
        setBooleanField(term174590, term174590.getClass(), "irqDisableFlag", false);
        setBooleanField(term174590, term174590.getClass(), "decimalModeFlag", false);
        setBooleanField(term174590, term174590.getClass(), "breakFlag", false);
        setBooleanField(term174590, term174590.getClass(), "overflowFlag", false);
        setLongField(term174590, term174590.getClass(), "stepCounter", 0L);
        setField(term174524, term174524.getClass(), "state", term174590);
        setLongField(term174524, term174524.getClass(), "opBeginTime", -6616339196088014666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBus", argTypes, term174524, args);
    }

};


