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

public class Cpu_peekAhead_20504136099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177003;

    public Cpu_peekAhead_20504136099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177098 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term177097 = ((Class) term177098).getDeclaredField((String) "NMOS_6502");
        ((Field) term177097).setAccessible(true);
        Object enum189 = ((Field) term177097).get((Object) null);
        HashMap term177029 = new HashMap();
        HashMap term177063 = new HashMap();
        term177003 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177018 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177021 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177023 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177026 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term177034 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term177035 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177043 = (int[]) newIntArray(2);
        int[] term177046 = (int[]) newIntArray(2);
        Object[] term177068 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term177069 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177077 = (int[]) newIntArray(2);
        int[] term177080 = (int[]) newIntArray(2);
        setLongField(term177003, term177003.getClass(), "clockPeriodInNs", 1000L);
        setField(term177003, term177003.getClass(), "behavior", enum189);
        setIntField(term177018, term177018.getClass(), "startAddress", -764263155);
        setIntField(term177018, term177018.getClass(), "endAddress", 1713503695);
        setLongField(term177021, term177021.getClass(), "clockPeriodInNs", 1000L);
        setField(term177021, term177021.getClass(), "behavior", enum189);
        setIntField(term177023, term177023.getClass(), "startAddress", 316488155);
        setIntField(term177023, term177023.getClass(), "endAddress", 164922289);
        setLongField(term177026, term177026.getClass(), "clockPeriodInNs", 1000L);
        setField(term177026, term177026.getClass(), "behavior", enum189);
        setField(term177026, term177026.getClass(), "bus", null);
        setField(term177026, term177026.getClass(), "state", null);
        setLongField(term177026, term177026.getClass(), "opBeginTime", -2456427474561523240L);
        setField(term177023, term177023.getClass(), "cpu", term177026);
        setField(term177023, term177023.getClass(), "deviceMap", term177029);
        setField(term177023, term177023.getClass(), "deviceAddressArray", term177034);
        setField(term177021, term177021.getClass(), "bus", term177023);
        setIntField(term177035, term177035.getClass(), "a", 0);
        setIntField(term177035, term177035.getClass(), "x", 0);
        setIntField(term177035, term177035.getClass(), "y", 0);
        setIntField(term177035, term177035.getClass(), "sp", 0);
        setIntField(term177035, term177035.getClass(), "pc", 0);
        setIntField(term177035, term177035.getClass(), "ir", 0);
        setIntField(term177035, term177035.getClass(), "nextIr", 0);
        setField(term177035, term177035.getClass(), "args", term177043);
        setField(term177035, term177035.getClass(), "nextArgs", term177046);
        setIntField(term177035, term177035.getClass(), "instSize", 0);
        setBooleanField(term177035, term177035.getClass(), "opTrap", false);
        setBooleanField(term177035, term177035.getClass(), "irqAsserted", false);
        setBooleanField(term177035, term177035.getClass(), "nmiAsserted", false);
        setIntField(term177035, term177035.getClass(), "lastPc", 0);
        setBooleanField(term177035, term177035.getClass(), "carryFlag", false);
        setBooleanField(term177035, term177035.getClass(), "negativeFlag", false);
        setBooleanField(term177035, term177035.getClass(), "zeroFlag", false);
        setBooleanField(term177035, term177035.getClass(), "irqDisableFlag", false);
        setBooleanField(term177035, term177035.getClass(), "decimalModeFlag", false);
        setBooleanField(term177035, term177035.getClass(), "breakFlag", false);
        setBooleanField(term177035, term177035.getClass(), "overflowFlag", false);
        setLongField(term177035, term177035.getClass(), "stepCounter", 0L);
        setField(term177021, term177021.getClass(), "state", term177035);
        setLongField(term177021, term177021.getClass(), "opBeginTime", -7010338441819086776L);
        setField(term177018, term177018.getClass(), "cpu", term177021);
        setField(term177018, term177018.getClass(), "deviceMap", term177063);
        setField(term177018, term177018.getClass(), "deviceAddressArray", term177068);
        setField(term177003, term177003.getClass(), "bus", term177018);
        setIntField(term177069, term177069.getClass(), "a", 0);
        setIntField(term177069, term177069.getClass(), "x", 0);
        setIntField(term177069, term177069.getClass(), "y", 0);
        setIntField(term177069, term177069.getClass(), "sp", 0);
        setIntField(term177069, term177069.getClass(), "pc", 0);
        setIntField(term177069, term177069.getClass(), "ir", 0);
        setIntField(term177069, term177069.getClass(), "nextIr", 0);
        setField(term177069, term177069.getClass(), "args", term177077);
        setField(term177069, term177069.getClass(), "nextArgs", term177080);
        setIntField(term177069, term177069.getClass(), "instSize", 0);
        setBooleanField(term177069, term177069.getClass(), "opTrap", false);
        setBooleanField(term177069, term177069.getClass(), "irqAsserted", false);
        setBooleanField(term177069, term177069.getClass(), "nmiAsserted", false);
        setIntField(term177069, term177069.getClass(), "lastPc", 0);
        setBooleanField(term177069, term177069.getClass(), "carryFlag", false);
        setBooleanField(term177069, term177069.getClass(), "negativeFlag", false);
        setBooleanField(term177069, term177069.getClass(), "zeroFlag", false);
        setBooleanField(term177069, term177069.getClass(), "irqDisableFlag", false);
        setBooleanField(term177069, term177069.getClass(), "decimalModeFlag", false);
        setBooleanField(term177069, term177069.getClass(), "breakFlag", false);
        setBooleanField(term177069, term177069.getClass(), "overflowFlag", false);
        setLongField(term177069, term177069.getClass(), "stepCounter", 0L);
        setField(term177003, term177003.getClass(), "state", term177069);
        setLongField(term177003, term177003.getClass(), "opBeginTime", 1881020230556705937L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peekAhead", argTypes, term177003, args);
    }

};


