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

public class Bus_endAddress_2076183663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36169;

    public Bus_endAddress_2076183663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36258 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term36257 = ((Class) term36258).getDeclaredField((String) "NMOS_6502");
        ((Field) term36257).setAccessible(true);
        Object enum23 = ((Field) term36257).get((Object) null);
        HashMap term36217 = new HashMap();
        HashMap term36251 = new HashMap();
        term36169 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36172 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36187 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36190 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36192 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36195 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term36222 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term36223 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term36231 = (int[]) newIntArray(2);
        int[] term36234 = (int[]) newIntArray(2);
        Object[] term36256 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term36169, term36169.getClass(), "startAddress", 1734630901);
        setIntField(term36169, term36169.getClass(), "endAddress", -703815246);
        setLongField(term36172, term36172.getClass(), "clockPeriodInNs", 1000L);
        setField(term36172, term36172.getClass(), "behavior", enum23);
        setIntField(term36187, term36187.getClass(), "startAddress", 157300746);
        setIntField(term36187, term36187.getClass(), "endAddress", -1600748613);
        setLongField(term36190, term36190.getClass(), "clockPeriodInNs", 1000L);
        setField(term36190, term36190.getClass(), "behavior", enum23);
        setIntField(term36192, term36192.getClass(), "startAddress", -1509192782);
        setIntField(term36192, term36192.getClass(), "endAddress", -867925573);
        setField(term36192, term36192.getClass(), "cpu", null);
        setField(term36192, term36192.getClass(), "deviceMap", null);
        setField(term36192, term36192.getClass(), "deviceAddressArray", null);
        setField(term36190, term36190.getClass(), "bus", term36192);
        setIntField(term36195, term36195.getClass(), "a", 0);
        setIntField(term36195, term36195.getClass(), "x", 0);
        setIntField(term36195, term36195.getClass(), "y", 0);
        setIntField(term36195, term36195.getClass(), "sp", 0);
        setIntField(term36195, term36195.getClass(), "pc", 0);
        setIntField(term36195, term36195.getClass(), "ir", 0);
        setIntField(term36195, term36195.getClass(), "nextIr", 0);
        setField(term36195, term36195.getClass(), "args", null);
        setField(term36195, term36195.getClass(), "nextArgs", null);
        setIntField(term36195, term36195.getClass(), "instSize", 0);
        setBooleanField(term36195, term36195.getClass(), "opTrap", false);
        setBooleanField(term36195, term36195.getClass(), "irqAsserted", false);
        setBooleanField(term36195, term36195.getClass(), "nmiAsserted", false);
        setIntField(term36195, term36195.getClass(), "lastPc", 0);
        setBooleanField(term36195, term36195.getClass(), "carryFlag", false);
        setBooleanField(term36195, term36195.getClass(), "negativeFlag", false);
        setBooleanField(term36195, term36195.getClass(), "zeroFlag", false);
        setBooleanField(term36195, term36195.getClass(), "irqDisableFlag", false);
        setBooleanField(term36195, term36195.getClass(), "decimalModeFlag", false);
        setBooleanField(term36195, term36195.getClass(), "breakFlag", false);
        setBooleanField(term36195, term36195.getClass(), "overflowFlag", false);
        setLongField(term36195, term36195.getClass(), "stepCounter", 0L);
        setField(term36190, term36190.getClass(), "state", term36195);
        setLongField(term36190, term36190.getClass(), "opBeginTime", -8471550651709805183L);
        setField(term36187, term36187.getClass(), "cpu", term36190);
        setField(term36187, term36187.getClass(), "deviceMap", term36217);
        setField(term36187, term36187.getClass(), "deviceAddressArray", term36222);
        setField(term36172, term36172.getClass(), "bus", term36187);
        setIntField(term36223, term36223.getClass(), "a", 0);
        setIntField(term36223, term36223.getClass(), "x", 0);
        setIntField(term36223, term36223.getClass(), "y", 0);
        setIntField(term36223, term36223.getClass(), "sp", 0);
        setIntField(term36223, term36223.getClass(), "pc", 0);
        setIntField(term36223, term36223.getClass(), "ir", 0);
        setIntField(term36223, term36223.getClass(), "nextIr", 0);
        setField(term36223, term36223.getClass(), "args", term36231);
        setField(term36223, term36223.getClass(), "nextArgs", term36234);
        setIntField(term36223, term36223.getClass(), "instSize", 0);
        setBooleanField(term36223, term36223.getClass(), "opTrap", false);
        setBooleanField(term36223, term36223.getClass(), "irqAsserted", false);
        setBooleanField(term36223, term36223.getClass(), "nmiAsserted", false);
        setIntField(term36223, term36223.getClass(), "lastPc", 0);
        setBooleanField(term36223, term36223.getClass(), "carryFlag", false);
        setBooleanField(term36223, term36223.getClass(), "negativeFlag", false);
        setBooleanField(term36223, term36223.getClass(), "zeroFlag", false);
        setBooleanField(term36223, term36223.getClass(), "irqDisableFlag", false);
        setBooleanField(term36223, term36223.getClass(), "decimalModeFlag", false);
        setBooleanField(term36223, term36223.getClass(), "breakFlag", false);
        setBooleanField(term36223, term36223.getClass(), "overflowFlag", false);
        setLongField(term36223, term36223.getClass(), "stepCounter", 0L);
        setField(term36172, term36172.getClass(), "state", term36223);
        setLongField(term36172, term36172.getClass(), "opBeginTime", -948292411727204525L);
        setField(term36169, term36169.getClass(), "cpu", term36172);
        setField(term36169, term36169.getClass(), "deviceMap", term36251);
        setField(term36169, term36169.getClass(), "deviceAddressArray", term36256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endAddress", argTypes, term36169, args);
    }

};


