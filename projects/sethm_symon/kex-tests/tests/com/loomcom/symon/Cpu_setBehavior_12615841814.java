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

public class Cpu_setBehavior_12615841814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174890;
     Object enum184;

    public Cpu_setBehavior_12615841814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term174999 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term174998 = ((Class) term174999).getDeclaredField((String) "NMOS_6502");
        ((Field) term174998).setAccessible(true);
        Object enum183 = ((Field) term174998).get((Object) null);
        HashMap term174916 = new HashMap();
        HashMap term174950 = new HashMap();
        term174890 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term174905 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term174908 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term174910 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term174913 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term174921 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term174922 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term174930 = (int[]) newIntArray(2);
        int[] term174933 = (int[]) newIntArray(2);
        Object[] term174955 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term174956 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term174964 = (int[]) newIntArray(2);
        int[] term174967 = (int[]) newIntArray(2);
        setLongField(term174890, term174890.getClass(), "clockPeriodInNs", 1000L);
        setField(term174890, term174890.getClass(), "behavior", enum183);
        setIntField(term174905, term174905.getClass(), "startAddress", -465191172);
        setIntField(term174905, term174905.getClass(), "endAddress", -1717726169);
        setLongField(term174908, term174908.getClass(), "clockPeriodInNs", 1000L);
        setField(term174908, term174908.getClass(), "behavior", enum183);
        setIntField(term174910, term174910.getClass(), "startAddress", 1191663397);
        setIntField(term174910, term174910.getClass(), "endAddress", -1104234890);
        setLongField(term174913, term174913.getClass(), "clockPeriodInNs", 1000L);
        setField(term174913, term174913.getClass(), "behavior", enum183);
        setField(term174913, term174913.getClass(), "bus", null);
        setField(term174913, term174913.getClass(), "state", null);
        setLongField(term174913, term174913.getClass(), "opBeginTime", -7981877752051488010L);
        setField(term174910, term174910.getClass(), "cpu", term174913);
        setField(term174910, term174910.getClass(), "deviceMap", term174916);
        setField(term174910, term174910.getClass(), "deviceAddressArray", term174921);
        setField(term174908, term174908.getClass(), "bus", term174910);
        setIntField(term174922, term174922.getClass(), "a", 0);
        setIntField(term174922, term174922.getClass(), "x", 0);
        setIntField(term174922, term174922.getClass(), "y", 0);
        setIntField(term174922, term174922.getClass(), "sp", 0);
        setIntField(term174922, term174922.getClass(), "pc", 0);
        setIntField(term174922, term174922.getClass(), "ir", 0);
        setIntField(term174922, term174922.getClass(), "nextIr", 0);
        setField(term174922, term174922.getClass(), "args", term174930);
        setField(term174922, term174922.getClass(), "nextArgs", term174933);
        setIntField(term174922, term174922.getClass(), "instSize", 0);
        setBooleanField(term174922, term174922.getClass(), "opTrap", false);
        setBooleanField(term174922, term174922.getClass(), "irqAsserted", false);
        setBooleanField(term174922, term174922.getClass(), "nmiAsserted", false);
        setIntField(term174922, term174922.getClass(), "lastPc", 0);
        setBooleanField(term174922, term174922.getClass(), "carryFlag", false);
        setBooleanField(term174922, term174922.getClass(), "negativeFlag", false);
        setBooleanField(term174922, term174922.getClass(), "zeroFlag", false);
        setBooleanField(term174922, term174922.getClass(), "irqDisableFlag", false);
        setBooleanField(term174922, term174922.getClass(), "decimalModeFlag", false);
        setBooleanField(term174922, term174922.getClass(), "breakFlag", false);
        setBooleanField(term174922, term174922.getClass(), "overflowFlag", false);
        setLongField(term174922, term174922.getClass(), "stepCounter", 0L);
        setField(term174908, term174908.getClass(), "state", term174922);
        setLongField(term174908, term174908.getClass(), "opBeginTime", 4486175312218543930L);
        setField(term174905, term174905.getClass(), "cpu", term174908);
        setField(term174905, term174905.getClass(), "deviceMap", term174950);
        setField(term174905, term174905.getClass(), "deviceAddressArray", term174955);
        setField(term174890, term174890.getClass(), "bus", term174905);
        setIntField(term174956, term174956.getClass(), "a", 0);
        setIntField(term174956, term174956.getClass(), "x", 0);
        setIntField(term174956, term174956.getClass(), "y", 0);
        setIntField(term174956, term174956.getClass(), "sp", 0);
        setIntField(term174956, term174956.getClass(), "pc", 0);
        setIntField(term174956, term174956.getClass(), "ir", 0);
        setIntField(term174956, term174956.getClass(), "nextIr", 0);
        setField(term174956, term174956.getClass(), "args", term174964);
        setField(term174956, term174956.getClass(), "nextArgs", term174967);
        setIntField(term174956, term174956.getClass(), "instSize", 0);
        setBooleanField(term174956, term174956.getClass(), "opTrap", false);
        setBooleanField(term174956, term174956.getClass(), "irqAsserted", false);
        setBooleanField(term174956, term174956.getClass(), "nmiAsserted", false);
        setIntField(term174956, term174956.getClass(), "lastPc", 0);
        setBooleanField(term174956, term174956.getClass(), "carryFlag", false);
        setBooleanField(term174956, term174956.getClass(), "negativeFlag", false);
        setBooleanField(term174956, term174956.getClass(), "zeroFlag", false);
        setBooleanField(term174956, term174956.getClass(), "irqDisableFlag", false);
        setBooleanField(term174956, term174956.getClass(), "decimalModeFlag", false);
        setBooleanField(term174956, term174956.getClass(), "breakFlag", false);
        setBooleanField(term174956, term174956.getClass(), "overflowFlag", false);
        setLongField(term174956, term174956.getClass(), "stepCounter", 0L);
        setField(term174890, term174890.getClass(), "state", term174956);
        setLongField(term174890, term174890.getClass(), "opBeginTime", -5866516262253090421L);
        Class<? extends Object> term175271 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term175270 = ((Class) term175271).getDeclaredField((String) "CMOS_65816");
        ((Field) term175270).setAccessible(true);
        enum184 = ((Field) term175270).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.InstructionTable$CpuBehavior");
        Object[] args = new Object[1];
        args[0] = enum184;
        callMethod(klass, "setBehavior", argTypes, term174890, args);
    }

};


