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

public class Bus_isComplete_13743535449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38396;

    public Bus_isComplete_13743535449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38485 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term38484 = ((Class) term38485).getDeclaredField((String) "NMOS_6502");
        ((Field) term38484).setAccessible(true);
        Object enum29 = ((Field) term38484).get((Object) null);
        HashMap term38444 = new HashMap();
        HashMap term38478 = new HashMap();
        term38396 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38399 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term38414 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38417 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term38419 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38422 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term38449 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term38450 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term38458 = (int[]) newIntArray(2);
        int[] term38461 = (int[]) newIntArray(2);
        Object[] term38483 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term38396, term38396.getClass(), "startAddress", -58633039);
        setIntField(term38396, term38396.getClass(), "endAddress", 448061908);
        setLongField(term38399, term38399.getClass(), "clockPeriodInNs", 1000L);
        setField(term38399, term38399.getClass(), "behavior", enum29);
        setIntField(term38414, term38414.getClass(), "startAddress", -1268483887);
        setIntField(term38414, term38414.getClass(), "endAddress", -1929689681);
        setLongField(term38417, term38417.getClass(), "clockPeriodInNs", 1000L);
        setField(term38417, term38417.getClass(), "behavior", enum29);
        setIntField(term38419, term38419.getClass(), "startAddress", -91240911);
        setIntField(term38419, term38419.getClass(), "endAddress", -321227954);
        setField(term38419, term38419.getClass(), "cpu", null);
        setField(term38419, term38419.getClass(), "deviceMap", null);
        setField(term38419, term38419.getClass(), "deviceAddressArray", null);
        setField(term38417, term38417.getClass(), "bus", term38419);
        setIntField(term38422, term38422.getClass(), "a", 0);
        setIntField(term38422, term38422.getClass(), "x", 0);
        setIntField(term38422, term38422.getClass(), "y", 0);
        setIntField(term38422, term38422.getClass(), "sp", 0);
        setIntField(term38422, term38422.getClass(), "pc", 0);
        setIntField(term38422, term38422.getClass(), "ir", 0);
        setIntField(term38422, term38422.getClass(), "nextIr", 0);
        setField(term38422, term38422.getClass(), "args", null);
        setField(term38422, term38422.getClass(), "nextArgs", null);
        setIntField(term38422, term38422.getClass(), "instSize", 0);
        setBooleanField(term38422, term38422.getClass(), "opTrap", false);
        setBooleanField(term38422, term38422.getClass(), "irqAsserted", false);
        setBooleanField(term38422, term38422.getClass(), "nmiAsserted", false);
        setIntField(term38422, term38422.getClass(), "lastPc", 0);
        setBooleanField(term38422, term38422.getClass(), "carryFlag", false);
        setBooleanField(term38422, term38422.getClass(), "negativeFlag", false);
        setBooleanField(term38422, term38422.getClass(), "zeroFlag", false);
        setBooleanField(term38422, term38422.getClass(), "irqDisableFlag", false);
        setBooleanField(term38422, term38422.getClass(), "decimalModeFlag", false);
        setBooleanField(term38422, term38422.getClass(), "breakFlag", false);
        setBooleanField(term38422, term38422.getClass(), "overflowFlag", false);
        setLongField(term38422, term38422.getClass(), "stepCounter", 0L);
        setField(term38417, term38417.getClass(), "state", term38422);
        setLongField(term38417, term38417.getClass(), "opBeginTime", -1885698929232124806L);
        setField(term38414, term38414.getClass(), "cpu", term38417);
        setField(term38414, term38414.getClass(), "deviceMap", term38444);
        setField(term38414, term38414.getClass(), "deviceAddressArray", term38449);
        setField(term38399, term38399.getClass(), "bus", term38414);
        setIntField(term38450, term38450.getClass(), "a", 0);
        setIntField(term38450, term38450.getClass(), "x", 0);
        setIntField(term38450, term38450.getClass(), "y", 0);
        setIntField(term38450, term38450.getClass(), "sp", 0);
        setIntField(term38450, term38450.getClass(), "pc", 0);
        setIntField(term38450, term38450.getClass(), "ir", 0);
        setIntField(term38450, term38450.getClass(), "nextIr", 0);
        setField(term38450, term38450.getClass(), "args", term38458);
        setField(term38450, term38450.getClass(), "nextArgs", term38461);
        setIntField(term38450, term38450.getClass(), "instSize", 0);
        setBooleanField(term38450, term38450.getClass(), "opTrap", false);
        setBooleanField(term38450, term38450.getClass(), "irqAsserted", false);
        setBooleanField(term38450, term38450.getClass(), "nmiAsserted", false);
        setIntField(term38450, term38450.getClass(), "lastPc", 0);
        setBooleanField(term38450, term38450.getClass(), "carryFlag", false);
        setBooleanField(term38450, term38450.getClass(), "negativeFlag", false);
        setBooleanField(term38450, term38450.getClass(), "zeroFlag", false);
        setBooleanField(term38450, term38450.getClass(), "irqDisableFlag", false);
        setBooleanField(term38450, term38450.getClass(), "decimalModeFlag", false);
        setBooleanField(term38450, term38450.getClass(), "breakFlag", false);
        setBooleanField(term38450, term38450.getClass(), "overflowFlag", false);
        setLongField(term38450, term38450.getClass(), "stepCounter", 0L);
        setField(term38399, term38399.getClass(), "state", term38450);
        setLongField(term38399, term38399.getClass(), "opBeginTime", 5731563613239387113L);
        setField(term38396, term38396.getClass(), "cpu", term38399);
        setField(term38396, term38396.getClass(), "deviceMap", term38478);
        setField(term38396, term38396.getClass(), "deviceAddressArray", term38483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term38396, args);
    }

};


