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

public class Cpu_getDecimalModeFlag_62742938342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189131;

    public Cpu_getDecimalModeFlag_62742938342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189226 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term189225 = ((Class) term189226).getDeclaredField((String) "NMOS_6502");
        ((Field) term189225).setAccessible(true);
        Object enum222 = ((Field) term189225).get((Object) null);
        HashMap term189157 = new HashMap();
        HashMap term189191 = new HashMap();
        term189131 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189146 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189149 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189151 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189154 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term189162 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term189163 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189171 = (int[]) newIntArray(2);
        int[] term189174 = (int[]) newIntArray(2);
        Object[] term189196 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term189197 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189205 = (int[]) newIntArray(2);
        int[] term189208 = (int[]) newIntArray(2);
        setLongField(term189131, term189131.getClass(), "clockPeriodInNs", 1000L);
        setField(term189131, term189131.getClass(), "behavior", enum222);
        setIntField(term189146, term189146.getClass(), "startAddress", -983886756);
        setIntField(term189146, term189146.getClass(), "endAddress", 662682481);
        setLongField(term189149, term189149.getClass(), "clockPeriodInNs", 1000L);
        setField(term189149, term189149.getClass(), "behavior", enum222);
        setIntField(term189151, term189151.getClass(), "startAddress", 51649517);
        setIntField(term189151, term189151.getClass(), "endAddress", -416813909);
        setLongField(term189154, term189154.getClass(), "clockPeriodInNs", 1000L);
        setField(term189154, term189154.getClass(), "behavior", enum222);
        setField(term189154, term189154.getClass(), "bus", null);
        setField(term189154, term189154.getClass(), "state", null);
        setLongField(term189154, term189154.getClass(), "opBeginTime", -2967233328786457154L);
        setField(term189151, term189151.getClass(), "cpu", term189154);
        setField(term189151, term189151.getClass(), "deviceMap", term189157);
        setField(term189151, term189151.getClass(), "deviceAddressArray", term189162);
        setField(term189149, term189149.getClass(), "bus", term189151);
        setIntField(term189163, term189163.getClass(), "a", 0);
        setIntField(term189163, term189163.getClass(), "x", 0);
        setIntField(term189163, term189163.getClass(), "y", 0);
        setIntField(term189163, term189163.getClass(), "sp", 0);
        setIntField(term189163, term189163.getClass(), "pc", 0);
        setIntField(term189163, term189163.getClass(), "ir", 0);
        setIntField(term189163, term189163.getClass(), "nextIr", 0);
        setField(term189163, term189163.getClass(), "args", term189171);
        setField(term189163, term189163.getClass(), "nextArgs", term189174);
        setIntField(term189163, term189163.getClass(), "instSize", 0);
        setBooleanField(term189163, term189163.getClass(), "opTrap", false);
        setBooleanField(term189163, term189163.getClass(), "irqAsserted", false);
        setBooleanField(term189163, term189163.getClass(), "nmiAsserted", false);
        setIntField(term189163, term189163.getClass(), "lastPc", 0);
        setBooleanField(term189163, term189163.getClass(), "carryFlag", false);
        setBooleanField(term189163, term189163.getClass(), "negativeFlag", false);
        setBooleanField(term189163, term189163.getClass(), "zeroFlag", false);
        setBooleanField(term189163, term189163.getClass(), "irqDisableFlag", false);
        setBooleanField(term189163, term189163.getClass(), "decimalModeFlag", false);
        setBooleanField(term189163, term189163.getClass(), "breakFlag", false);
        setBooleanField(term189163, term189163.getClass(), "overflowFlag", false);
        setLongField(term189163, term189163.getClass(), "stepCounter", 0L);
        setField(term189149, term189149.getClass(), "state", term189163);
        setLongField(term189149, term189149.getClass(), "opBeginTime", 3081163056749096636L);
        setField(term189146, term189146.getClass(), "cpu", term189149);
        setField(term189146, term189146.getClass(), "deviceMap", term189191);
        setField(term189146, term189146.getClass(), "deviceAddressArray", term189196);
        setField(term189131, term189131.getClass(), "bus", term189146);
        setIntField(term189197, term189197.getClass(), "a", 0);
        setIntField(term189197, term189197.getClass(), "x", 0);
        setIntField(term189197, term189197.getClass(), "y", 0);
        setIntField(term189197, term189197.getClass(), "sp", 0);
        setIntField(term189197, term189197.getClass(), "pc", 0);
        setIntField(term189197, term189197.getClass(), "ir", 0);
        setIntField(term189197, term189197.getClass(), "nextIr", 0);
        setField(term189197, term189197.getClass(), "args", term189205);
        setField(term189197, term189197.getClass(), "nextArgs", term189208);
        setIntField(term189197, term189197.getClass(), "instSize", 0);
        setBooleanField(term189197, term189197.getClass(), "opTrap", false);
        setBooleanField(term189197, term189197.getClass(), "irqAsserted", false);
        setBooleanField(term189197, term189197.getClass(), "nmiAsserted", false);
        setIntField(term189197, term189197.getClass(), "lastPc", 0);
        setBooleanField(term189197, term189197.getClass(), "carryFlag", false);
        setBooleanField(term189197, term189197.getClass(), "negativeFlag", false);
        setBooleanField(term189197, term189197.getClass(), "zeroFlag", false);
        setBooleanField(term189197, term189197.getClass(), "irqDisableFlag", false);
        setBooleanField(term189197, term189197.getClass(), "decimalModeFlag", false);
        setBooleanField(term189197, term189197.getClass(), "breakFlag", false);
        setBooleanField(term189197, term189197.getClass(), "overflowFlag", false);
        setLongField(term189197, term189197.getClass(), "stepCounter", 0L);
        setField(term189131, term189131.getClass(), "state", term189197);
        setLongField(term189131, term189131.getClass(), "opBeginTime", 8461184996981583369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecimalModeFlag", argTypes, term189131, args);
    }

};


