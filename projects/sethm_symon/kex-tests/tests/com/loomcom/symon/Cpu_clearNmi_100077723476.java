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

public class Cpu_clearNmi_100077723476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201589;

    public Cpu_clearNmi_100077723476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201684 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term201683 = ((Class) term201684).getDeclaredField((String) "NMOS_6502");
        ((Field) term201683).setAccessible(true);
        Object enum256 = ((Field) term201683).get((Object) null);
        HashMap term201615 = new HashMap();
        HashMap term201649 = new HashMap();
        term201589 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201604 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201607 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201609 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201612 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term201620 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term201621 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term201629 = (int[]) newIntArray(2);
        int[] term201632 = (int[]) newIntArray(2);
        Object[] term201654 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term201655 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term201663 = (int[]) newIntArray(2);
        int[] term201666 = (int[]) newIntArray(2);
        setLongField(term201589, term201589.getClass(), "clockPeriodInNs", 1000L);
        setField(term201589, term201589.getClass(), "behavior", enum256);
        setIntField(term201604, term201604.getClass(), "startAddress", -828371576);
        setIntField(term201604, term201604.getClass(), "endAddress", 1475471511);
        setLongField(term201607, term201607.getClass(), "clockPeriodInNs", 1000L);
        setField(term201607, term201607.getClass(), "behavior", enum256);
        setIntField(term201609, term201609.getClass(), "startAddress", 1061251899);
        setIntField(term201609, term201609.getClass(), "endAddress", -1000926687);
        setLongField(term201612, term201612.getClass(), "clockPeriodInNs", 1000L);
        setField(term201612, term201612.getClass(), "behavior", enum256);
        setField(term201612, term201612.getClass(), "bus", null);
        setField(term201612, term201612.getClass(), "state", null);
        setLongField(term201612, term201612.getClass(), "opBeginTime", -3628485034781450950L);
        setField(term201609, term201609.getClass(), "cpu", term201612);
        setField(term201609, term201609.getClass(), "deviceMap", term201615);
        setField(term201609, term201609.getClass(), "deviceAddressArray", term201620);
        setField(term201607, term201607.getClass(), "bus", term201609);
        setIntField(term201621, term201621.getClass(), "a", 0);
        setIntField(term201621, term201621.getClass(), "x", 0);
        setIntField(term201621, term201621.getClass(), "y", 0);
        setIntField(term201621, term201621.getClass(), "sp", 0);
        setIntField(term201621, term201621.getClass(), "pc", 0);
        setIntField(term201621, term201621.getClass(), "ir", 0);
        setIntField(term201621, term201621.getClass(), "nextIr", 0);
        setField(term201621, term201621.getClass(), "args", term201629);
        setField(term201621, term201621.getClass(), "nextArgs", term201632);
        setIntField(term201621, term201621.getClass(), "instSize", 0);
        setBooleanField(term201621, term201621.getClass(), "opTrap", false);
        setBooleanField(term201621, term201621.getClass(), "irqAsserted", false);
        setBooleanField(term201621, term201621.getClass(), "nmiAsserted", false);
        setIntField(term201621, term201621.getClass(), "lastPc", 0);
        setBooleanField(term201621, term201621.getClass(), "carryFlag", false);
        setBooleanField(term201621, term201621.getClass(), "negativeFlag", false);
        setBooleanField(term201621, term201621.getClass(), "zeroFlag", false);
        setBooleanField(term201621, term201621.getClass(), "irqDisableFlag", false);
        setBooleanField(term201621, term201621.getClass(), "decimalModeFlag", false);
        setBooleanField(term201621, term201621.getClass(), "breakFlag", false);
        setBooleanField(term201621, term201621.getClass(), "overflowFlag", false);
        setLongField(term201621, term201621.getClass(), "stepCounter", 0L);
        setField(term201607, term201607.getClass(), "state", term201621);
        setLongField(term201607, term201607.getClass(), "opBeginTime", 2505442540861032970L);
        setField(term201604, term201604.getClass(), "cpu", term201607);
        setField(term201604, term201604.getClass(), "deviceMap", term201649);
        setField(term201604, term201604.getClass(), "deviceAddressArray", term201654);
        setField(term201589, term201589.getClass(), "bus", term201604);
        setIntField(term201655, term201655.getClass(), "a", 0);
        setIntField(term201655, term201655.getClass(), "x", 0);
        setIntField(term201655, term201655.getClass(), "y", 0);
        setIntField(term201655, term201655.getClass(), "sp", 0);
        setIntField(term201655, term201655.getClass(), "pc", 0);
        setIntField(term201655, term201655.getClass(), "ir", 0);
        setIntField(term201655, term201655.getClass(), "nextIr", 0);
        setField(term201655, term201655.getClass(), "args", term201663);
        setField(term201655, term201655.getClass(), "nextArgs", term201666);
        setIntField(term201655, term201655.getClass(), "instSize", 0);
        setBooleanField(term201655, term201655.getClass(), "opTrap", false);
        setBooleanField(term201655, term201655.getClass(), "irqAsserted", false);
        setBooleanField(term201655, term201655.getClass(), "nmiAsserted", false);
        setIntField(term201655, term201655.getClass(), "lastPc", 0);
        setBooleanField(term201655, term201655.getClass(), "carryFlag", false);
        setBooleanField(term201655, term201655.getClass(), "negativeFlag", false);
        setBooleanField(term201655, term201655.getClass(), "zeroFlag", false);
        setBooleanField(term201655, term201655.getClass(), "irqDisableFlag", false);
        setBooleanField(term201655, term201655.getClass(), "decimalModeFlag", false);
        setBooleanField(term201655, term201655.getClass(), "breakFlag", false);
        setBooleanField(term201655, term201655.getClass(), "overflowFlag", false);
        setLongField(term201655, term201655.getClass(), "stepCounter", 0L);
        setField(term201589, term201589.getClass(), "state", term201655);
        setLongField(term201589, term201589.getClass(), "opBeginTime", -4215965963361389968L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearNmi", argTypes, term201589, args);
    }

};


