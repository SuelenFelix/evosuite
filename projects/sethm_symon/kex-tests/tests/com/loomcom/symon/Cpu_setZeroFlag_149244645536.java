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
import java.lang.Boolean;

public class Cpu_setZeroFlag_149244645536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186933;
     Object term187027;

    public Cpu_setZeroFlag_149244645536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187030 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term187029 = ((Class) term187030).getDeclaredField((String) "NMOS_6502");
        ((Field) term187029).setAccessible(true);
        Object enum216 = ((Field) term187029).get((Object) null);
        HashMap term186959 = new HashMap();
        HashMap term186993 = new HashMap();
        term186933 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186948 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186951 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186953 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186956 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term186964 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term186965 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term186973 = (int[]) newIntArray(2);
        int[] term186976 = (int[]) newIntArray(2);
        Object[] term186998 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term186999 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term187007 = (int[]) newIntArray(2);
        int[] term187010 = (int[]) newIntArray(2);
        setLongField(term186933, term186933.getClass(), "clockPeriodInNs", 1000L);
        setField(term186933, term186933.getClass(), "behavior", enum216);
        setIntField(term186948, term186948.getClass(), "startAddress", 162320449);
        setIntField(term186948, term186948.getClass(), "endAddress", -299093975);
        setLongField(term186951, term186951.getClass(), "clockPeriodInNs", 1000L);
        setField(term186951, term186951.getClass(), "behavior", enum216);
        setIntField(term186953, term186953.getClass(), "startAddress", 1297491984);
        setIntField(term186953, term186953.getClass(), "endAddress", 2020056067);
        setLongField(term186956, term186956.getClass(), "clockPeriodInNs", 1000L);
        setField(term186956, term186956.getClass(), "behavior", enum216);
        setField(term186956, term186956.getClass(), "bus", null);
        setField(term186956, term186956.getClass(), "state", null);
        setLongField(term186956, term186956.getClass(), "opBeginTime", -7497758874949135776L);
        setField(term186953, term186953.getClass(), "cpu", term186956);
        setField(term186953, term186953.getClass(), "deviceMap", term186959);
        setField(term186953, term186953.getClass(), "deviceAddressArray", term186964);
        setField(term186951, term186951.getClass(), "bus", term186953);
        setIntField(term186965, term186965.getClass(), "a", 0);
        setIntField(term186965, term186965.getClass(), "x", 0);
        setIntField(term186965, term186965.getClass(), "y", 0);
        setIntField(term186965, term186965.getClass(), "sp", 0);
        setIntField(term186965, term186965.getClass(), "pc", 0);
        setIntField(term186965, term186965.getClass(), "ir", 0);
        setIntField(term186965, term186965.getClass(), "nextIr", 0);
        setField(term186965, term186965.getClass(), "args", term186973);
        setField(term186965, term186965.getClass(), "nextArgs", term186976);
        setIntField(term186965, term186965.getClass(), "instSize", 0);
        setBooleanField(term186965, term186965.getClass(), "opTrap", false);
        setBooleanField(term186965, term186965.getClass(), "irqAsserted", false);
        setBooleanField(term186965, term186965.getClass(), "nmiAsserted", false);
        setIntField(term186965, term186965.getClass(), "lastPc", 0);
        setBooleanField(term186965, term186965.getClass(), "carryFlag", false);
        setBooleanField(term186965, term186965.getClass(), "negativeFlag", false);
        setBooleanField(term186965, term186965.getClass(), "zeroFlag", false);
        setBooleanField(term186965, term186965.getClass(), "irqDisableFlag", false);
        setBooleanField(term186965, term186965.getClass(), "decimalModeFlag", false);
        setBooleanField(term186965, term186965.getClass(), "breakFlag", false);
        setBooleanField(term186965, term186965.getClass(), "overflowFlag", false);
        setLongField(term186965, term186965.getClass(), "stepCounter", 0L);
        setField(term186951, term186951.getClass(), "state", term186965);
        setLongField(term186951, term186951.getClass(), "opBeginTime", 504174293291540734L);
        setField(term186948, term186948.getClass(), "cpu", term186951);
        setField(term186948, term186948.getClass(), "deviceMap", term186993);
        setField(term186948, term186948.getClass(), "deviceAddressArray", term186998);
        setField(term186933, term186933.getClass(), "bus", term186948);
        setIntField(term186999, term186999.getClass(), "a", 0);
        setIntField(term186999, term186999.getClass(), "x", 0);
        setIntField(term186999, term186999.getClass(), "y", 0);
        setIntField(term186999, term186999.getClass(), "sp", 0);
        setIntField(term186999, term186999.getClass(), "pc", 0);
        setIntField(term186999, term186999.getClass(), "ir", 0);
        setIntField(term186999, term186999.getClass(), "nextIr", 0);
        setField(term186999, term186999.getClass(), "args", term187007);
        setField(term186999, term186999.getClass(), "nextArgs", term187010);
        setIntField(term186999, term186999.getClass(), "instSize", 0);
        setBooleanField(term186999, term186999.getClass(), "opTrap", false);
        setBooleanField(term186999, term186999.getClass(), "irqAsserted", false);
        setBooleanField(term186999, term186999.getClass(), "nmiAsserted", false);
        setIntField(term186999, term186999.getClass(), "lastPc", 0);
        setBooleanField(term186999, term186999.getClass(), "carryFlag", false);
        setBooleanField(term186999, term186999.getClass(), "negativeFlag", false);
        setBooleanField(term186999, term186999.getClass(), "zeroFlag", false);
        setBooleanField(term186999, term186999.getClass(), "irqDisableFlag", false);
        setBooleanField(term186999, term186999.getClass(), "decimalModeFlag", false);
        setBooleanField(term186999, term186999.getClass(), "breakFlag", false);
        setBooleanField(term186999, term186999.getClass(), "overflowFlag", false);
        setLongField(term186999, term186999.getClass(), "stepCounter", 0L);
        setField(term186933, term186933.getClass(), "state", term186999);
        setLongField(term186933, term186933.getClass(), "opBeginTime", -6669406542315322596L);
        term187027 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term187027;
        callMethod(klass, "setZeroFlag", argTypes, term186933, args);
    }

};


