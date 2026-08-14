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

public class Bus_addDevice_17924646686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37239;

    public Bus_addDevice_17924646686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37328 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term37327 = ((Class) term37328).getDeclaredField((String) "NMOS_6502");
        ((Field) term37327).setAccessible(true);
        Object enum26 = ((Field) term37327).get((Object) null);
        HashMap term37287 = new HashMap();
        HashMap term37321 = new HashMap();
        term37239 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37242 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term37257 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37260 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term37262 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37265 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term37292 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term37293 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term37301 = (int[]) newIntArray(2);
        int[] term37304 = (int[]) newIntArray(2);
        Object[] term37326 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        setIntField(term37239, term37239.getClass(), "startAddress", 584949609);
        setIntField(term37239, term37239.getClass(), "endAddress", 879795058);
        setLongField(term37242, term37242.getClass(), "clockPeriodInNs", 1000L);
        setField(term37242, term37242.getClass(), "behavior", enum26);
        setIntField(term37257, term37257.getClass(), "startAddress", -1016087889);
        setIntField(term37257, term37257.getClass(), "endAddress", 1968287557);
        setLongField(term37260, term37260.getClass(), "clockPeriodInNs", 1000L);
        setField(term37260, term37260.getClass(), "behavior", enum26);
        setIntField(term37262, term37262.getClass(), "startAddress", 1101385603);
        setIntField(term37262, term37262.getClass(), "endAddress", 1980267589);
        setField(term37262, term37262.getClass(), "cpu", null);
        setField(term37262, term37262.getClass(), "deviceMap", null);
        setField(term37262, term37262.getClass(), "deviceAddressArray", null);
        setField(term37260, term37260.getClass(), "bus", term37262);
        setIntField(term37265, term37265.getClass(), "a", 0);
        setIntField(term37265, term37265.getClass(), "x", 0);
        setIntField(term37265, term37265.getClass(), "y", 0);
        setIntField(term37265, term37265.getClass(), "sp", 0);
        setIntField(term37265, term37265.getClass(), "pc", 0);
        setIntField(term37265, term37265.getClass(), "ir", 0);
        setIntField(term37265, term37265.getClass(), "nextIr", 0);
        setField(term37265, term37265.getClass(), "args", null);
        setField(term37265, term37265.getClass(), "nextArgs", null);
        setIntField(term37265, term37265.getClass(), "instSize", 0);
        setBooleanField(term37265, term37265.getClass(), "opTrap", false);
        setBooleanField(term37265, term37265.getClass(), "irqAsserted", false);
        setBooleanField(term37265, term37265.getClass(), "nmiAsserted", false);
        setIntField(term37265, term37265.getClass(), "lastPc", 0);
        setBooleanField(term37265, term37265.getClass(), "carryFlag", false);
        setBooleanField(term37265, term37265.getClass(), "negativeFlag", false);
        setBooleanField(term37265, term37265.getClass(), "zeroFlag", false);
        setBooleanField(term37265, term37265.getClass(), "irqDisableFlag", false);
        setBooleanField(term37265, term37265.getClass(), "decimalModeFlag", false);
        setBooleanField(term37265, term37265.getClass(), "breakFlag", false);
        setBooleanField(term37265, term37265.getClass(), "overflowFlag", false);
        setLongField(term37265, term37265.getClass(), "stepCounter", 0L);
        setField(term37260, term37260.getClass(), "state", term37265);
        setLongField(term37260, term37260.getClass(), "opBeginTime", -1677189124507026637L);
        setField(term37257, term37257.getClass(), "cpu", term37260);
        setField(term37257, term37257.getClass(), "deviceMap", term37287);
        setField(term37257, term37257.getClass(), "deviceAddressArray", term37292);
        setField(term37242, term37242.getClass(), "bus", term37257);
        setIntField(term37293, term37293.getClass(), "a", 0);
        setIntField(term37293, term37293.getClass(), "x", 0);
        setIntField(term37293, term37293.getClass(), "y", 0);
        setIntField(term37293, term37293.getClass(), "sp", 0);
        setIntField(term37293, term37293.getClass(), "pc", 0);
        setIntField(term37293, term37293.getClass(), "ir", 0);
        setIntField(term37293, term37293.getClass(), "nextIr", 0);
        setField(term37293, term37293.getClass(), "args", term37301);
        setField(term37293, term37293.getClass(), "nextArgs", term37304);
        setIntField(term37293, term37293.getClass(), "instSize", 0);
        setBooleanField(term37293, term37293.getClass(), "opTrap", false);
        setBooleanField(term37293, term37293.getClass(), "irqAsserted", false);
        setBooleanField(term37293, term37293.getClass(), "nmiAsserted", false);
        setIntField(term37293, term37293.getClass(), "lastPc", 0);
        setBooleanField(term37293, term37293.getClass(), "carryFlag", false);
        setBooleanField(term37293, term37293.getClass(), "negativeFlag", false);
        setBooleanField(term37293, term37293.getClass(), "zeroFlag", false);
        setBooleanField(term37293, term37293.getClass(), "irqDisableFlag", false);
        setBooleanField(term37293, term37293.getClass(), "decimalModeFlag", false);
        setBooleanField(term37293, term37293.getClass(), "breakFlag", false);
        setBooleanField(term37293, term37293.getClass(), "overflowFlag", false);
        setLongField(term37293, term37293.getClass(), "stepCounter", 0L);
        setField(term37242, term37242.getClass(), "state", term37293);
        setLongField(term37242, term37242.getClass(), "opBeginTime", 4795660804170399986L);
        setField(term37239, term37239.getClass(), "cpu", term37242);
        setField(term37239, term37239.getClass(), "deviceMap", term37321);
        setField(term37239, term37239.getClass(), "deviceAddressArray", term37326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Device");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addDevice", argTypes, term37239, args);
    }

};


