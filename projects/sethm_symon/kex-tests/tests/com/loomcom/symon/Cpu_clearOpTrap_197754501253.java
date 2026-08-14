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

public class Cpu_clearOpTrap_197754501253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193159;

    public Cpu_clearOpTrap_197754501253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193254 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term193253 = ((Class) term193254).getDeclaredField((String) "NMOS_6502");
        ((Field) term193253).setAccessible(true);
        Object enum233 = ((Field) term193253).get((Object) null);
        HashMap term193185 = new HashMap();
        HashMap term193219 = new HashMap();
        term193159 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193174 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193177 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term193179 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term193182 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term193190 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term193191 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193199 = (int[]) newIntArray(2);
        int[] term193202 = (int[]) newIntArray(2);
        Object[] term193224 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term193225 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term193233 = (int[]) newIntArray(2);
        int[] term193236 = (int[]) newIntArray(2);
        setLongField(term193159, term193159.getClass(), "clockPeriodInNs", 1000L);
        setField(term193159, term193159.getClass(), "behavior", enum233);
        setIntField(term193174, term193174.getClass(), "startAddress", -1721345168);
        setIntField(term193174, term193174.getClass(), "endAddress", -776806272);
        setLongField(term193177, term193177.getClass(), "clockPeriodInNs", 1000L);
        setField(term193177, term193177.getClass(), "behavior", enum233);
        setIntField(term193179, term193179.getClass(), "startAddress", -495130634);
        setIntField(term193179, term193179.getClass(), "endAddress", -1517420629);
        setLongField(term193182, term193182.getClass(), "clockPeriodInNs", 1000L);
        setField(term193182, term193182.getClass(), "behavior", enum233);
        setField(term193182, term193182.getClass(), "bus", null);
        setField(term193182, term193182.getClass(), "state", null);
        setLongField(term193182, term193182.getClass(), "opBeginTime", -706258405349500259L);
        setField(term193179, term193179.getClass(), "cpu", term193182);
        setField(term193179, term193179.getClass(), "deviceMap", term193185);
        setField(term193179, term193179.getClass(), "deviceAddressArray", term193190);
        setField(term193177, term193177.getClass(), "bus", term193179);
        setIntField(term193191, term193191.getClass(), "a", 0);
        setIntField(term193191, term193191.getClass(), "x", 0);
        setIntField(term193191, term193191.getClass(), "y", 0);
        setIntField(term193191, term193191.getClass(), "sp", 0);
        setIntField(term193191, term193191.getClass(), "pc", 0);
        setIntField(term193191, term193191.getClass(), "ir", 0);
        setIntField(term193191, term193191.getClass(), "nextIr", 0);
        setField(term193191, term193191.getClass(), "args", term193199);
        setField(term193191, term193191.getClass(), "nextArgs", term193202);
        setIntField(term193191, term193191.getClass(), "instSize", 0);
        setBooleanField(term193191, term193191.getClass(), "opTrap", false);
        setBooleanField(term193191, term193191.getClass(), "irqAsserted", false);
        setBooleanField(term193191, term193191.getClass(), "nmiAsserted", false);
        setIntField(term193191, term193191.getClass(), "lastPc", 0);
        setBooleanField(term193191, term193191.getClass(), "carryFlag", false);
        setBooleanField(term193191, term193191.getClass(), "negativeFlag", false);
        setBooleanField(term193191, term193191.getClass(), "zeroFlag", false);
        setBooleanField(term193191, term193191.getClass(), "irqDisableFlag", false);
        setBooleanField(term193191, term193191.getClass(), "decimalModeFlag", false);
        setBooleanField(term193191, term193191.getClass(), "breakFlag", false);
        setBooleanField(term193191, term193191.getClass(), "overflowFlag", false);
        setLongField(term193191, term193191.getClass(), "stepCounter", 0L);
        setField(term193177, term193177.getClass(), "state", term193191);
        setLongField(term193177, term193177.getClass(), "opBeginTime", -2336486223565755398L);
        setField(term193174, term193174.getClass(), "cpu", term193177);
        setField(term193174, term193174.getClass(), "deviceMap", term193219);
        setField(term193174, term193174.getClass(), "deviceAddressArray", term193224);
        setField(term193159, term193159.getClass(), "bus", term193174);
        setIntField(term193225, term193225.getClass(), "a", 0);
        setIntField(term193225, term193225.getClass(), "x", 0);
        setIntField(term193225, term193225.getClass(), "y", 0);
        setIntField(term193225, term193225.getClass(), "sp", 0);
        setIntField(term193225, term193225.getClass(), "pc", 0);
        setIntField(term193225, term193225.getClass(), "ir", 0);
        setIntField(term193225, term193225.getClass(), "nextIr", 0);
        setField(term193225, term193225.getClass(), "args", term193233);
        setField(term193225, term193225.getClass(), "nextArgs", term193236);
        setIntField(term193225, term193225.getClass(), "instSize", 0);
        setBooleanField(term193225, term193225.getClass(), "opTrap", false);
        setBooleanField(term193225, term193225.getClass(), "irqAsserted", false);
        setBooleanField(term193225, term193225.getClass(), "nmiAsserted", false);
        setIntField(term193225, term193225.getClass(), "lastPc", 0);
        setBooleanField(term193225, term193225.getClass(), "carryFlag", false);
        setBooleanField(term193225, term193225.getClass(), "negativeFlag", false);
        setBooleanField(term193225, term193225.getClass(), "zeroFlag", false);
        setBooleanField(term193225, term193225.getClass(), "irqDisableFlag", false);
        setBooleanField(term193225, term193225.getClass(), "decimalModeFlag", false);
        setBooleanField(term193225, term193225.getClass(), "breakFlag", false);
        setBooleanField(term193225, term193225.getClass(), "overflowFlag", false);
        setLongField(term193225, term193225.getClass(), "stepCounter", 0L);
        setField(term193159, term193159.getClass(), "state", term193225);
        setLongField(term193159, term193159.getClass(), "opBeginTime", -5604785092434648765L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearOpTrap", argTypes, term193159, args);
    }

};


