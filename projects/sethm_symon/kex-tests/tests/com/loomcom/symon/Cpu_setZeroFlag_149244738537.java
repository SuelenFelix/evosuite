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

public class Cpu_setZeroFlag_149244738537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187301;

    public Cpu_setZeroFlag_149244738537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187396 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term187395 = ((Class) term187396).getDeclaredField((String) "NMOS_6502");
        ((Field) term187395).setAccessible(true);
        Object enum217 = ((Field) term187395).get((Object) null);
        HashMap term187327 = new HashMap();
        HashMap term187361 = new HashMap();
        term187301 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term187316 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term187319 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term187321 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term187324 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term187332 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term187333 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term187341 = (int[]) newIntArray(2);
        int[] term187344 = (int[]) newIntArray(2);
        Object[] term187366 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term187367 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term187375 = (int[]) newIntArray(2);
        int[] term187378 = (int[]) newIntArray(2);
        setLongField(term187301, term187301.getClass(), "clockPeriodInNs", 1000L);
        setField(term187301, term187301.getClass(), "behavior", enum217);
        setIntField(term187316, term187316.getClass(), "startAddress", 133624666);
        setIntField(term187316, term187316.getClass(), "endAddress", -1292573941);
        setLongField(term187319, term187319.getClass(), "clockPeriodInNs", 1000L);
        setField(term187319, term187319.getClass(), "behavior", enum217);
        setIntField(term187321, term187321.getClass(), "startAddress", 1960867757);
        setIntField(term187321, term187321.getClass(), "endAddress", -353830408);
        setLongField(term187324, term187324.getClass(), "clockPeriodInNs", 1000L);
        setField(term187324, term187324.getClass(), "behavior", enum217);
        setField(term187324, term187324.getClass(), "bus", null);
        setField(term187324, term187324.getClass(), "state", null);
        setLongField(term187324, term187324.getClass(), "opBeginTime", 1122196220816602891L);
        setField(term187321, term187321.getClass(), "cpu", term187324);
        setField(term187321, term187321.getClass(), "deviceMap", term187327);
        setField(term187321, term187321.getClass(), "deviceAddressArray", term187332);
        setField(term187319, term187319.getClass(), "bus", term187321);
        setIntField(term187333, term187333.getClass(), "a", 0);
        setIntField(term187333, term187333.getClass(), "x", 0);
        setIntField(term187333, term187333.getClass(), "y", 0);
        setIntField(term187333, term187333.getClass(), "sp", 0);
        setIntField(term187333, term187333.getClass(), "pc", 0);
        setIntField(term187333, term187333.getClass(), "ir", 0);
        setIntField(term187333, term187333.getClass(), "nextIr", 0);
        setField(term187333, term187333.getClass(), "args", term187341);
        setField(term187333, term187333.getClass(), "nextArgs", term187344);
        setIntField(term187333, term187333.getClass(), "instSize", 0);
        setBooleanField(term187333, term187333.getClass(), "opTrap", false);
        setBooleanField(term187333, term187333.getClass(), "irqAsserted", false);
        setBooleanField(term187333, term187333.getClass(), "nmiAsserted", false);
        setIntField(term187333, term187333.getClass(), "lastPc", 0);
        setBooleanField(term187333, term187333.getClass(), "carryFlag", false);
        setBooleanField(term187333, term187333.getClass(), "negativeFlag", false);
        setBooleanField(term187333, term187333.getClass(), "zeroFlag", false);
        setBooleanField(term187333, term187333.getClass(), "irqDisableFlag", false);
        setBooleanField(term187333, term187333.getClass(), "decimalModeFlag", false);
        setBooleanField(term187333, term187333.getClass(), "breakFlag", false);
        setBooleanField(term187333, term187333.getClass(), "overflowFlag", false);
        setLongField(term187333, term187333.getClass(), "stepCounter", 0L);
        setField(term187319, term187319.getClass(), "state", term187333);
        setLongField(term187319, term187319.getClass(), "opBeginTime", 1006339275456792418L);
        setField(term187316, term187316.getClass(), "cpu", term187319);
        setField(term187316, term187316.getClass(), "deviceMap", term187361);
        setField(term187316, term187316.getClass(), "deviceAddressArray", term187366);
        setField(term187301, term187301.getClass(), "bus", term187316);
        setIntField(term187367, term187367.getClass(), "a", 0);
        setIntField(term187367, term187367.getClass(), "x", 0);
        setIntField(term187367, term187367.getClass(), "y", 0);
        setIntField(term187367, term187367.getClass(), "sp", 0);
        setIntField(term187367, term187367.getClass(), "pc", 0);
        setIntField(term187367, term187367.getClass(), "ir", 0);
        setIntField(term187367, term187367.getClass(), "nextIr", 0);
        setField(term187367, term187367.getClass(), "args", term187375);
        setField(term187367, term187367.getClass(), "nextArgs", term187378);
        setIntField(term187367, term187367.getClass(), "instSize", 0);
        setBooleanField(term187367, term187367.getClass(), "opTrap", false);
        setBooleanField(term187367, term187367.getClass(), "irqAsserted", false);
        setBooleanField(term187367, term187367.getClass(), "nmiAsserted", false);
        setIntField(term187367, term187367.getClass(), "lastPc", 0);
        setBooleanField(term187367, term187367.getClass(), "carryFlag", false);
        setBooleanField(term187367, term187367.getClass(), "negativeFlag", false);
        setBooleanField(term187367, term187367.getClass(), "zeroFlag", false);
        setBooleanField(term187367, term187367.getClass(), "irqDisableFlag", false);
        setBooleanField(term187367, term187367.getClass(), "decimalModeFlag", false);
        setBooleanField(term187367, term187367.getClass(), "breakFlag", false);
        setBooleanField(term187367, term187367.getClass(), "overflowFlag", false);
        setLongField(term187367, term187367.getClass(), "stepCounter", 0L);
        setField(term187301, term187301.getClass(), "state", term187367);
        setLongField(term187301, term187301.getClass(), "opBeginTime", 7170045607484390400L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setZeroFlag", argTypes, term187301, args);
    }

};


