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

public class Cpu_getNextIr_104867208165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197561;

    public Cpu_getNextIr_104867208165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197656 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term197655 = ((Class) term197656).getDeclaredField((String) "NMOS_6502");
        ((Field) term197655).setAccessible(true);
        Object enum245 = ((Field) term197655).get((Object) null);
        HashMap term197587 = new HashMap();
        HashMap term197621 = new HashMap();
        term197561 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197576 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197579 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197581 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197584 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term197592 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term197593 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term197601 = (int[]) newIntArray(2);
        int[] term197604 = (int[]) newIntArray(2);
        Object[] term197626 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term197627 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term197635 = (int[]) newIntArray(2);
        int[] term197638 = (int[]) newIntArray(2);
        setLongField(term197561, term197561.getClass(), "clockPeriodInNs", 1000L);
        setField(term197561, term197561.getClass(), "behavior", enum245);
        setIntField(term197576, term197576.getClass(), "startAddress", 995795018);
        setIntField(term197576, term197576.getClass(), "endAddress", 21168892);
        setLongField(term197579, term197579.getClass(), "clockPeriodInNs", 1000L);
        setField(term197579, term197579.getClass(), "behavior", enum245);
        setIntField(term197581, term197581.getClass(), "startAddress", 1344518129);
        setIntField(term197581, term197581.getClass(), "endAddress", -1534477902);
        setLongField(term197584, term197584.getClass(), "clockPeriodInNs", 1000L);
        setField(term197584, term197584.getClass(), "behavior", enum245);
        setField(term197584, term197584.getClass(), "bus", null);
        setField(term197584, term197584.getClass(), "state", null);
        setLongField(term197584, term197584.getClass(), "opBeginTime", 6187687406539061577L);
        setField(term197581, term197581.getClass(), "cpu", term197584);
        setField(term197581, term197581.getClass(), "deviceMap", term197587);
        setField(term197581, term197581.getClass(), "deviceAddressArray", term197592);
        setField(term197579, term197579.getClass(), "bus", term197581);
        setIntField(term197593, term197593.getClass(), "a", 0);
        setIntField(term197593, term197593.getClass(), "x", 0);
        setIntField(term197593, term197593.getClass(), "y", 0);
        setIntField(term197593, term197593.getClass(), "sp", 0);
        setIntField(term197593, term197593.getClass(), "pc", 0);
        setIntField(term197593, term197593.getClass(), "ir", 0);
        setIntField(term197593, term197593.getClass(), "nextIr", 0);
        setField(term197593, term197593.getClass(), "args", term197601);
        setField(term197593, term197593.getClass(), "nextArgs", term197604);
        setIntField(term197593, term197593.getClass(), "instSize", 0);
        setBooleanField(term197593, term197593.getClass(), "opTrap", false);
        setBooleanField(term197593, term197593.getClass(), "irqAsserted", false);
        setBooleanField(term197593, term197593.getClass(), "nmiAsserted", false);
        setIntField(term197593, term197593.getClass(), "lastPc", 0);
        setBooleanField(term197593, term197593.getClass(), "carryFlag", false);
        setBooleanField(term197593, term197593.getClass(), "negativeFlag", false);
        setBooleanField(term197593, term197593.getClass(), "zeroFlag", false);
        setBooleanField(term197593, term197593.getClass(), "irqDisableFlag", false);
        setBooleanField(term197593, term197593.getClass(), "decimalModeFlag", false);
        setBooleanField(term197593, term197593.getClass(), "breakFlag", false);
        setBooleanField(term197593, term197593.getClass(), "overflowFlag", false);
        setLongField(term197593, term197593.getClass(), "stepCounter", 0L);
        setField(term197579, term197579.getClass(), "state", term197593);
        setLongField(term197579, term197579.getClass(), "opBeginTime", -4281700567835283963L);
        setField(term197576, term197576.getClass(), "cpu", term197579);
        setField(term197576, term197576.getClass(), "deviceMap", term197621);
        setField(term197576, term197576.getClass(), "deviceAddressArray", term197626);
        setField(term197561, term197561.getClass(), "bus", term197576);
        setIntField(term197627, term197627.getClass(), "a", 0);
        setIntField(term197627, term197627.getClass(), "x", 0);
        setIntField(term197627, term197627.getClass(), "y", 0);
        setIntField(term197627, term197627.getClass(), "sp", 0);
        setIntField(term197627, term197627.getClass(), "pc", 0);
        setIntField(term197627, term197627.getClass(), "ir", 0);
        setIntField(term197627, term197627.getClass(), "nextIr", 0);
        setField(term197627, term197627.getClass(), "args", term197635);
        setField(term197627, term197627.getClass(), "nextArgs", term197638);
        setIntField(term197627, term197627.getClass(), "instSize", 0);
        setBooleanField(term197627, term197627.getClass(), "opTrap", false);
        setBooleanField(term197627, term197627.getClass(), "irqAsserted", false);
        setBooleanField(term197627, term197627.getClass(), "nmiAsserted", false);
        setIntField(term197627, term197627.getClass(), "lastPc", 0);
        setBooleanField(term197627, term197627.getClass(), "carryFlag", false);
        setBooleanField(term197627, term197627.getClass(), "negativeFlag", false);
        setBooleanField(term197627, term197627.getClass(), "zeroFlag", false);
        setBooleanField(term197627, term197627.getClass(), "irqDisableFlag", false);
        setBooleanField(term197627, term197627.getClass(), "decimalModeFlag", false);
        setBooleanField(term197627, term197627.getClass(), "breakFlag", false);
        setBooleanField(term197627, term197627.getClass(), "overflowFlag", false);
        setLongField(term197627, term197627.getClass(), "stepCounter", 0L);
        setField(term197561, term197561.getClass(), "state", term197627);
        setLongField(term197561, term197561.getClass(), "opBeginTime", 8779425347424216281L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextIr", argTypes, term197561, args);
    }

};


