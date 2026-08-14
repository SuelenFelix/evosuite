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

public class Cpu_handleNmi_122554443512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178105;

    public Cpu_handleNmi_122554443512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178200 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term178199 = ((Class) term178200).getDeclaredField((String) "NMOS_6502");
        ((Field) term178199).setAccessible(true);
        Object enum192 = ((Field) term178199).get((Object) null);
        HashMap term178131 = new HashMap();
        HashMap term178165 = new HashMap();
        term178105 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178120 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178123 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178125 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178128 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term178136 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term178137 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178145 = (int[]) newIntArray(2);
        int[] term178148 = (int[]) newIntArray(2);
        Object[] term178170 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term178171 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178179 = (int[]) newIntArray(2);
        int[] term178182 = (int[]) newIntArray(2);
        setLongField(term178105, term178105.getClass(), "clockPeriodInNs", 1000L);
        setField(term178105, term178105.getClass(), "behavior", enum192);
        setIntField(term178120, term178120.getClass(), "startAddress", -1592307241);
        setIntField(term178120, term178120.getClass(), "endAddress", -92983331);
        setLongField(term178123, term178123.getClass(), "clockPeriodInNs", 1000L);
        setField(term178123, term178123.getClass(), "behavior", enum192);
        setIntField(term178125, term178125.getClass(), "startAddress", -1635511750);
        setIntField(term178125, term178125.getClass(), "endAddress", -1920687540);
        setLongField(term178128, term178128.getClass(), "clockPeriodInNs", 1000L);
        setField(term178128, term178128.getClass(), "behavior", enum192);
        setField(term178128, term178128.getClass(), "bus", null);
        setField(term178128, term178128.getClass(), "state", null);
        setLongField(term178128, term178128.getClass(), "opBeginTime", -2746162973618820048L);
        setField(term178125, term178125.getClass(), "cpu", term178128);
        setField(term178125, term178125.getClass(), "deviceMap", term178131);
        setField(term178125, term178125.getClass(), "deviceAddressArray", term178136);
        setField(term178123, term178123.getClass(), "bus", term178125);
        setIntField(term178137, term178137.getClass(), "a", 0);
        setIntField(term178137, term178137.getClass(), "x", 0);
        setIntField(term178137, term178137.getClass(), "y", 0);
        setIntField(term178137, term178137.getClass(), "sp", 0);
        setIntField(term178137, term178137.getClass(), "pc", 0);
        setIntField(term178137, term178137.getClass(), "ir", 0);
        setIntField(term178137, term178137.getClass(), "nextIr", 0);
        setField(term178137, term178137.getClass(), "args", term178145);
        setField(term178137, term178137.getClass(), "nextArgs", term178148);
        setIntField(term178137, term178137.getClass(), "instSize", 0);
        setBooleanField(term178137, term178137.getClass(), "opTrap", false);
        setBooleanField(term178137, term178137.getClass(), "irqAsserted", false);
        setBooleanField(term178137, term178137.getClass(), "nmiAsserted", false);
        setIntField(term178137, term178137.getClass(), "lastPc", 0);
        setBooleanField(term178137, term178137.getClass(), "carryFlag", false);
        setBooleanField(term178137, term178137.getClass(), "negativeFlag", false);
        setBooleanField(term178137, term178137.getClass(), "zeroFlag", false);
        setBooleanField(term178137, term178137.getClass(), "irqDisableFlag", false);
        setBooleanField(term178137, term178137.getClass(), "decimalModeFlag", false);
        setBooleanField(term178137, term178137.getClass(), "breakFlag", false);
        setBooleanField(term178137, term178137.getClass(), "overflowFlag", false);
        setLongField(term178137, term178137.getClass(), "stepCounter", 0L);
        setField(term178123, term178123.getClass(), "state", term178137);
        setLongField(term178123, term178123.getClass(), "opBeginTime", -5466267958566655205L);
        setField(term178120, term178120.getClass(), "cpu", term178123);
        setField(term178120, term178120.getClass(), "deviceMap", term178165);
        setField(term178120, term178120.getClass(), "deviceAddressArray", term178170);
        setField(term178105, term178105.getClass(), "bus", term178120);
        setIntField(term178171, term178171.getClass(), "a", 0);
        setIntField(term178171, term178171.getClass(), "x", 0);
        setIntField(term178171, term178171.getClass(), "y", 0);
        setIntField(term178171, term178171.getClass(), "sp", 0);
        setIntField(term178171, term178171.getClass(), "pc", 0);
        setIntField(term178171, term178171.getClass(), "ir", 0);
        setIntField(term178171, term178171.getClass(), "nextIr", 0);
        setField(term178171, term178171.getClass(), "args", term178179);
        setField(term178171, term178171.getClass(), "nextArgs", term178182);
        setIntField(term178171, term178171.getClass(), "instSize", 0);
        setBooleanField(term178171, term178171.getClass(), "opTrap", false);
        setBooleanField(term178171, term178171.getClass(), "irqAsserted", false);
        setBooleanField(term178171, term178171.getClass(), "nmiAsserted", false);
        setIntField(term178171, term178171.getClass(), "lastPc", 0);
        setBooleanField(term178171, term178171.getClass(), "carryFlag", false);
        setBooleanField(term178171, term178171.getClass(), "negativeFlag", false);
        setBooleanField(term178171, term178171.getClass(), "zeroFlag", false);
        setBooleanField(term178171, term178171.getClass(), "irqDisableFlag", false);
        setBooleanField(term178171, term178171.getClass(), "decimalModeFlag", false);
        setBooleanField(term178171, term178171.getClass(), "breakFlag", false);
        setBooleanField(term178171, term178171.getClass(), "overflowFlag", false);
        setLongField(term178171, term178171.getClass(), "stepCounter", 0L);
        setField(term178105, term178105.getClass(), "state", term178171);
        setLongField(term178105, term178105.getClass(), "opBeginTime", 4066162530086558234L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleNmi", argTypes, term178105, args);
    }

};


