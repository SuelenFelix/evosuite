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

public class Cpu_setAccumulator_182589477555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193891;
     Object term193985;

    public Cpu_setAccumulator_182589477555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193988 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term193987 = ((Class) term193988).getDeclaredField((String) "NMOS_6502");
        ((Field) term193987).setAccessible(true);
        Object enum235 = ((Field) term193987).get((Object) null);
        HashMap term193917 = new HashMap();
        HashMap term193951 = new HashMap();
        term193891 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193906 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193909 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193911 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193914 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term193922 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term193923 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193931 = (int[]) newIntArray(2);
        int[] term193934 = (int[]) newIntArray(2);
        Object[] term193956 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term193957 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193965 = (int[]) newIntArray(2);
        int[] term193968 = (int[]) newIntArray(2);
        setLongField(term193891, term193891.getClass(), "clockPeriodInNs", 1000L);
        setField(term193891, term193891.getClass(), "behavior", enum235);
        setIntField(term193906, term193906.getClass(), "startAddress", 1240153987);
        setIntField(term193906, term193906.getClass(), "endAddress", 126731415);
        setLongField(term193909, term193909.getClass(), "clockPeriodInNs", 1000L);
        setField(term193909, term193909.getClass(), "behavior", enum235);
        setIntField(term193911, term193911.getClass(), "startAddress", -119958532);
        setIntField(term193911, term193911.getClass(), "endAddress", -1797813817);
        setLongField(term193914, term193914.getClass(), "clockPeriodInNs", 1000L);
        setField(term193914, term193914.getClass(), "behavior", enum235);
        setField(term193914, term193914.getClass(), "bus", null);
        setField(term193914, term193914.getClass(), "state", null);
        setLongField(term193914, term193914.getClass(), "opBeginTime", 4057255693458933280L);
        setField(term193911, term193911.getClass(), "cpu", term193914);
        setField(term193911, term193911.getClass(), "deviceMap", term193917);
        setField(term193911, term193911.getClass(), "deviceAddressArray", term193922);
        setField(term193909, term193909.getClass(), "bus", term193911);
        setIntField(term193923, term193923.getClass(), "a", 0);
        setIntField(term193923, term193923.getClass(), "x", 0);
        setIntField(term193923, term193923.getClass(), "y", 0);
        setIntField(term193923, term193923.getClass(), "sp", 0);
        setIntField(term193923, term193923.getClass(), "pc", 0);
        setIntField(term193923, term193923.getClass(), "ir", 0);
        setIntField(term193923, term193923.getClass(), "nextIr", 0);
        setField(term193923, term193923.getClass(), "args", term193931);
        setField(term193923, term193923.getClass(), "nextArgs", term193934);
        setIntField(term193923, term193923.getClass(), "instSize", 0);
        setBooleanField(term193923, term193923.getClass(), "opTrap", false);
        setBooleanField(term193923, term193923.getClass(), "irqAsserted", false);
        setBooleanField(term193923, term193923.getClass(), "nmiAsserted", false);
        setIntField(term193923, term193923.getClass(), "lastPc", 0);
        setBooleanField(term193923, term193923.getClass(), "carryFlag", false);
        setBooleanField(term193923, term193923.getClass(), "negativeFlag", false);
        setBooleanField(term193923, term193923.getClass(), "zeroFlag", false);
        setBooleanField(term193923, term193923.getClass(), "irqDisableFlag", false);
        setBooleanField(term193923, term193923.getClass(), "decimalModeFlag", false);
        setBooleanField(term193923, term193923.getClass(), "breakFlag", false);
        setBooleanField(term193923, term193923.getClass(), "overflowFlag", false);
        setLongField(term193923, term193923.getClass(), "stepCounter", 0L);
        setField(term193909, term193909.getClass(), "state", term193923);
        setLongField(term193909, term193909.getClass(), "opBeginTime", 3365899934091025813L);
        setField(term193906, term193906.getClass(), "cpu", term193909);
        setField(term193906, term193906.getClass(), "deviceMap", term193951);
        setField(term193906, term193906.getClass(), "deviceAddressArray", term193956);
        setField(term193891, term193891.getClass(), "bus", term193906);
        setIntField(term193957, term193957.getClass(), "a", 0);
        setIntField(term193957, term193957.getClass(), "x", 0);
        setIntField(term193957, term193957.getClass(), "y", 0);
        setIntField(term193957, term193957.getClass(), "sp", 0);
        setIntField(term193957, term193957.getClass(), "pc", 0);
        setIntField(term193957, term193957.getClass(), "ir", 0);
        setIntField(term193957, term193957.getClass(), "nextIr", 0);
        setField(term193957, term193957.getClass(), "args", term193965);
        setField(term193957, term193957.getClass(), "nextArgs", term193968);
        setIntField(term193957, term193957.getClass(), "instSize", 0);
        setBooleanField(term193957, term193957.getClass(), "opTrap", false);
        setBooleanField(term193957, term193957.getClass(), "irqAsserted", false);
        setBooleanField(term193957, term193957.getClass(), "nmiAsserted", false);
        setIntField(term193957, term193957.getClass(), "lastPc", 0);
        setBooleanField(term193957, term193957.getClass(), "carryFlag", false);
        setBooleanField(term193957, term193957.getClass(), "negativeFlag", false);
        setBooleanField(term193957, term193957.getClass(), "zeroFlag", false);
        setBooleanField(term193957, term193957.getClass(), "irqDisableFlag", false);
        setBooleanField(term193957, term193957.getClass(), "decimalModeFlag", false);
        setBooleanField(term193957, term193957.getClass(), "breakFlag", false);
        setBooleanField(term193957, term193957.getClass(), "overflowFlag", false);
        setLongField(term193957, term193957.getClass(), "stepCounter", 0L);
        setField(term193891, term193891.getClass(), "state", term193957);
        setLongField(term193891, term193891.getClass(), "opBeginTime", 8532808243879007296L);
        term193985 = new Integer(1392304956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term193985;
        callMethod(klass, "setAccumulator", argTypes, term193891, args);
    }

};


