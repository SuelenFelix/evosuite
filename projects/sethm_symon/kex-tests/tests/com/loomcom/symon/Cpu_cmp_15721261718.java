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
import java.lang.Integer;

public class Cpu_cmp_15721261718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180325;
     Object term180419;
     Object term180421;

    public Cpu_cmp_15721261718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180424 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term180423 = ((Class) term180424).getDeclaredField((String) "NMOS_6502");
        ((Field) term180423).setAccessible(true);
        Object enum198 = ((Field) term180423).get((Object) null);
        HashMap term180351 = new HashMap();
        HashMap term180385 = new HashMap();
        term180325 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term180340 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term180343 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term180345 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term180348 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term180356 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term180357 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term180365 = (int[]) newIntArray(2);
        int[] term180368 = (int[]) newIntArray(2);
        Object[] term180390 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term180391 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term180399 = (int[]) newIntArray(2);
        int[] term180402 = (int[]) newIntArray(2);
        setLongField(term180325, term180325.getClass(), "clockPeriodInNs", 1000L);
        setField(term180325, term180325.getClass(), "behavior", enum198);
        setIntField(term180340, term180340.getClass(), "startAddress", 746489478);
        setIntField(term180340, term180340.getClass(), "endAddress", 620249855);
        setLongField(term180343, term180343.getClass(), "clockPeriodInNs", 1000L);
        setField(term180343, term180343.getClass(), "behavior", enum198);
        setIntField(term180345, term180345.getClass(), "startAddress", -1978063697);
        setIntField(term180345, term180345.getClass(), "endAddress", -1375837847);
        setLongField(term180348, term180348.getClass(), "clockPeriodInNs", 1000L);
        setField(term180348, term180348.getClass(), "behavior", enum198);
        setField(term180348, term180348.getClass(), "bus", null);
        setField(term180348, term180348.getClass(), "state", null);
        setLongField(term180348, term180348.getClass(), "opBeginTime", 3512582740653676967L);
        setField(term180345, term180345.getClass(), "cpu", term180348);
        setField(term180345, term180345.getClass(), "deviceMap", term180351);
        setField(term180345, term180345.getClass(), "deviceAddressArray", term180356);
        setField(term180343, term180343.getClass(), "bus", term180345);
        setIntField(term180357, term180357.getClass(), "a", 0);
        setIntField(term180357, term180357.getClass(), "x", 0);
        setIntField(term180357, term180357.getClass(), "y", 0);
        setIntField(term180357, term180357.getClass(), "sp", 0);
        setIntField(term180357, term180357.getClass(), "pc", 0);
        setIntField(term180357, term180357.getClass(), "ir", 0);
        setIntField(term180357, term180357.getClass(), "nextIr", 0);
        setField(term180357, term180357.getClass(), "args", term180365);
        setField(term180357, term180357.getClass(), "nextArgs", term180368);
        setIntField(term180357, term180357.getClass(), "instSize", 0);
        setBooleanField(term180357, term180357.getClass(), "opTrap", false);
        setBooleanField(term180357, term180357.getClass(), "irqAsserted", false);
        setBooleanField(term180357, term180357.getClass(), "nmiAsserted", false);
        setIntField(term180357, term180357.getClass(), "lastPc", 0);
        setBooleanField(term180357, term180357.getClass(), "carryFlag", false);
        setBooleanField(term180357, term180357.getClass(), "negativeFlag", false);
        setBooleanField(term180357, term180357.getClass(), "zeroFlag", false);
        setBooleanField(term180357, term180357.getClass(), "irqDisableFlag", false);
        setBooleanField(term180357, term180357.getClass(), "decimalModeFlag", false);
        setBooleanField(term180357, term180357.getClass(), "breakFlag", false);
        setBooleanField(term180357, term180357.getClass(), "overflowFlag", false);
        setLongField(term180357, term180357.getClass(), "stepCounter", 0L);
        setField(term180343, term180343.getClass(), "state", term180357);
        setLongField(term180343, term180343.getClass(), "opBeginTime", -6893173979797141349L);
        setField(term180340, term180340.getClass(), "cpu", term180343);
        setField(term180340, term180340.getClass(), "deviceMap", term180385);
        setField(term180340, term180340.getClass(), "deviceAddressArray", term180390);
        setField(term180325, term180325.getClass(), "bus", term180340);
        setIntField(term180391, term180391.getClass(), "a", 0);
        setIntField(term180391, term180391.getClass(), "x", 0);
        setIntField(term180391, term180391.getClass(), "y", 0);
        setIntField(term180391, term180391.getClass(), "sp", 0);
        setIntField(term180391, term180391.getClass(), "pc", 0);
        setIntField(term180391, term180391.getClass(), "ir", 0);
        setIntField(term180391, term180391.getClass(), "nextIr", 0);
        setField(term180391, term180391.getClass(), "args", term180399);
        setField(term180391, term180391.getClass(), "nextArgs", term180402);
        setIntField(term180391, term180391.getClass(), "instSize", 0);
        setBooleanField(term180391, term180391.getClass(), "opTrap", false);
        setBooleanField(term180391, term180391.getClass(), "irqAsserted", false);
        setBooleanField(term180391, term180391.getClass(), "nmiAsserted", false);
        setIntField(term180391, term180391.getClass(), "lastPc", 0);
        setBooleanField(term180391, term180391.getClass(), "carryFlag", false);
        setBooleanField(term180391, term180391.getClass(), "negativeFlag", false);
        setBooleanField(term180391, term180391.getClass(), "zeroFlag", false);
        setBooleanField(term180391, term180391.getClass(), "irqDisableFlag", false);
        setBooleanField(term180391, term180391.getClass(), "decimalModeFlag", false);
        setBooleanField(term180391, term180391.getClass(), "breakFlag", false);
        setBooleanField(term180391, term180391.getClass(), "overflowFlag", false);
        setLongField(term180391, term180391.getClass(), "stepCounter", 0L);
        setField(term180325, term180325.getClass(), "state", term180391);
        setLongField(term180325, term180325.getClass(), "opBeginTime", 8849217995403029606L);
        term180419 = new Integer(1161032682);
        term180421 = new Integer(345139347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180419;
        args[1] = term180421;
        callMethod(klass, "cmp", argTypes, term180325, args);
    }

};


