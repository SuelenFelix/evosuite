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

public class Cpu_getProgramCounterStatus_165222835070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199393;

    public Cpu_getProgramCounterStatus_165222835070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199488 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term199487 = ((Class) term199488).getDeclaredField((String) "NMOS_6502");
        ((Field) term199487).setAccessible(true);
        Object enum250 = ((Field) term199487).get((Object) null);
        HashMap term199419 = new HashMap();
        HashMap term199453 = new HashMap();
        term199393 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199408 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199411 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199413 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199416 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term199424 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term199425 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199433 = (int[]) newIntArray(2);
        int[] term199436 = (int[]) newIntArray(2);
        Object[] term199458 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term199459 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199467 = (int[]) newIntArray(2);
        int[] term199470 = (int[]) newIntArray(2);
        setLongField(term199393, term199393.getClass(), "clockPeriodInNs", 1000L);
        setField(term199393, term199393.getClass(), "behavior", enum250);
        setIntField(term199408, term199408.getClass(), "startAddress", -1395828554);
        setIntField(term199408, term199408.getClass(), "endAddress", -2081139415);
        setLongField(term199411, term199411.getClass(), "clockPeriodInNs", 1000L);
        setField(term199411, term199411.getClass(), "behavior", enum250);
        setIntField(term199413, term199413.getClass(), "startAddress", 22197373);
        setIntField(term199413, term199413.getClass(), "endAddress", 872043914);
        setLongField(term199416, term199416.getClass(), "clockPeriodInNs", 1000L);
        setField(term199416, term199416.getClass(), "behavior", enum250);
        setField(term199416, term199416.getClass(), "bus", null);
        setField(term199416, term199416.getClass(), "state", null);
        setLongField(term199416, term199416.getClass(), "opBeginTime", 1397546230296552361L);
        setField(term199413, term199413.getClass(), "cpu", term199416);
        setField(term199413, term199413.getClass(), "deviceMap", term199419);
        setField(term199413, term199413.getClass(), "deviceAddressArray", term199424);
        setField(term199411, term199411.getClass(), "bus", term199413);
        setIntField(term199425, term199425.getClass(), "a", 0);
        setIntField(term199425, term199425.getClass(), "x", 0);
        setIntField(term199425, term199425.getClass(), "y", 0);
        setIntField(term199425, term199425.getClass(), "sp", 0);
        setIntField(term199425, term199425.getClass(), "pc", 0);
        setIntField(term199425, term199425.getClass(), "ir", 0);
        setIntField(term199425, term199425.getClass(), "nextIr", 0);
        setField(term199425, term199425.getClass(), "args", term199433);
        setField(term199425, term199425.getClass(), "nextArgs", term199436);
        setIntField(term199425, term199425.getClass(), "instSize", 0);
        setBooleanField(term199425, term199425.getClass(), "opTrap", false);
        setBooleanField(term199425, term199425.getClass(), "irqAsserted", false);
        setBooleanField(term199425, term199425.getClass(), "nmiAsserted", false);
        setIntField(term199425, term199425.getClass(), "lastPc", 0);
        setBooleanField(term199425, term199425.getClass(), "carryFlag", false);
        setBooleanField(term199425, term199425.getClass(), "negativeFlag", false);
        setBooleanField(term199425, term199425.getClass(), "zeroFlag", false);
        setBooleanField(term199425, term199425.getClass(), "irqDisableFlag", false);
        setBooleanField(term199425, term199425.getClass(), "decimalModeFlag", false);
        setBooleanField(term199425, term199425.getClass(), "breakFlag", false);
        setBooleanField(term199425, term199425.getClass(), "overflowFlag", false);
        setLongField(term199425, term199425.getClass(), "stepCounter", 0L);
        setField(term199411, term199411.getClass(), "state", term199425);
        setLongField(term199411, term199411.getClass(), "opBeginTime", 4531694455151993856L);
        setField(term199408, term199408.getClass(), "cpu", term199411);
        setField(term199408, term199408.getClass(), "deviceMap", term199453);
        setField(term199408, term199408.getClass(), "deviceAddressArray", term199458);
        setField(term199393, term199393.getClass(), "bus", term199408);
        setIntField(term199459, term199459.getClass(), "a", 0);
        setIntField(term199459, term199459.getClass(), "x", 0);
        setIntField(term199459, term199459.getClass(), "y", 0);
        setIntField(term199459, term199459.getClass(), "sp", 0);
        setIntField(term199459, term199459.getClass(), "pc", 0);
        setIntField(term199459, term199459.getClass(), "ir", 0);
        setIntField(term199459, term199459.getClass(), "nextIr", 0);
        setField(term199459, term199459.getClass(), "args", term199467);
        setField(term199459, term199459.getClass(), "nextArgs", term199470);
        setIntField(term199459, term199459.getClass(), "instSize", 0);
        setBooleanField(term199459, term199459.getClass(), "opTrap", false);
        setBooleanField(term199459, term199459.getClass(), "irqAsserted", false);
        setBooleanField(term199459, term199459.getClass(), "nmiAsserted", false);
        setIntField(term199459, term199459.getClass(), "lastPc", 0);
        setBooleanField(term199459, term199459.getClass(), "carryFlag", false);
        setBooleanField(term199459, term199459.getClass(), "negativeFlag", false);
        setBooleanField(term199459, term199459.getClass(), "zeroFlag", false);
        setBooleanField(term199459, term199459.getClass(), "irqDisableFlag", false);
        setBooleanField(term199459, term199459.getClass(), "decimalModeFlag", false);
        setBooleanField(term199459, term199459.getClass(), "breakFlag", false);
        setBooleanField(term199459, term199459.getClass(), "overflowFlag", false);
        setLongField(term199459, term199459.getClass(), "stepCounter", 0L);
        setField(term199393, term199393.getClass(), "state", term199459);
        setLongField(term199393, term199393.getClass(), "opBeginTime", 4543928187003669961L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgramCounterStatus", argTypes, term199393, args);
    }

};


