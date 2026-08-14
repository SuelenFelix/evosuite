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

public class Cpu_getInstruction_63034677364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197195;

    public Cpu_getInstruction_63034677364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197290 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term197289 = ((Class) term197290).getDeclaredField((String) "NMOS_6502");
        ((Field) term197289).setAccessible(true);
        Object enum244 = ((Field) term197289).get((Object) null);
        HashMap term197221 = new HashMap();
        HashMap term197255 = new HashMap();
        term197195 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197210 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197213 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197215 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197218 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term197226 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term197227 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term197235 = (int[]) newIntArray(2);
        int[] term197238 = (int[]) newIntArray(2);
        Object[] term197260 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term197261 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term197269 = (int[]) newIntArray(2);
        int[] term197272 = (int[]) newIntArray(2);
        setLongField(term197195, term197195.getClass(), "clockPeriodInNs", 1000L);
        setField(term197195, term197195.getClass(), "behavior", enum244);
        setIntField(term197210, term197210.getClass(), "startAddress", 2102660964);
        setIntField(term197210, term197210.getClass(), "endAddress", 131358254);
        setLongField(term197213, term197213.getClass(), "clockPeriodInNs", 1000L);
        setField(term197213, term197213.getClass(), "behavior", enum244);
        setIntField(term197215, term197215.getClass(), "startAddress", -1411314076);
        setIntField(term197215, term197215.getClass(), "endAddress", -1465382016);
        setLongField(term197218, term197218.getClass(), "clockPeriodInNs", 1000L);
        setField(term197218, term197218.getClass(), "behavior", enum244);
        setField(term197218, term197218.getClass(), "bus", null);
        setField(term197218, term197218.getClass(), "state", null);
        setLongField(term197218, term197218.getClass(), "opBeginTime", 1357834364621364655L);
        setField(term197215, term197215.getClass(), "cpu", term197218);
        setField(term197215, term197215.getClass(), "deviceMap", term197221);
        setField(term197215, term197215.getClass(), "deviceAddressArray", term197226);
        setField(term197213, term197213.getClass(), "bus", term197215);
        setIntField(term197227, term197227.getClass(), "a", 0);
        setIntField(term197227, term197227.getClass(), "x", 0);
        setIntField(term197227, term197227.getClass(), "y", 0);
        setIntField(term197227, term197227.getClass(), "sp", 0);
        setIntField(term197227, term197227.getClass(), "pc", 0);
        setIntField(term197227, term197227.getClass(), "ir", 0);
        setIntField(term197227, term197227.getClass(), "nextIr", 0);
        setField(term197227, term197227.getClass(), "args", term197235);
        setField(term197227, term197227.getClass(), "nextArgs", term197238);
        setIntField(term197227, term197227.getClass(), "instSize", 0);
        setBooleanField(term197227, term197227.getClass(), "opTrap", false);
        setBooleanField(term197227, term197227.getClass(), "irqAsserted", false);
        setBooleanField(term197227, term197227.getClass(), "nmiAsserted", false);
        setIntField(term197227, term197227.getClass(), "lastPc", 0);
        setBooleanField(term197227, term197227.getClass(), "carryFlag", false);
        setBooleanField(term197227, term197227.getClass(), "negativeFlag", false);
        setBooleanField(term197227, term197227.getClass(), "zeroFlag", false);
        setBooleanField(term197227, term197227.getClass(), "irqDisableFlag", false);
        setBooleanField(term197227, term197227.getClass(), "decimalModeFlag", false);
        setBooleanField(term197227, term197227.getClass(), "breakFlag", false);
        setBooleanField(term197227, term197227.getClass(), "overflowFlag", false);
        setLongField(term197227, term197227.getClass(), "stepCounter", 0L);
        setField(term197213, term197213.getClass(), "state", term197227);
        setLongField(term197213, term197213.getClass(), "opBeginTime", 5242528388479853404L);
        setField(term197210, term197210.getClass(), "cpu", term197213);
        setField(term197210, term197210.getClass(), "deviceMap", term197255);
        setField(term197210, term197210.getClass(), "deviceAddressArray", term197260);
        setField(term197195, term197195.getClass(), "bus", term197210);
        setIntField(term197261, term197261.getClass(), "a", 0);
        setIntField(term197261, term197261.getClass(), "x", 0);
        setIntField(term197261, term197261.getClass(), "y", 0);
        setIntField(term197261, term197261.getClass(), "sp", 0);
        setIntField(term197261, term197261.getClass(), "pc", 0);
        setIntField(term197261, term197261.getClass(), "ir", 0);
        setIntField(term197261, term197261.getClass(), "nextIr", 0);
        setField(term197261, term197261.getClass(), "args", term197269);
        setField(term197261, term197261.getClass(), "nextArgs", term197272);
        setIntField(term197261, term197261.getClass(), "instSize", 0);
        setBooleanField(term197261, term197261.getClass(), "opTrap", false);
        setBooleanField(term197261, term197261.getClass(), "irqAsserted", false);
        setBooleanField(term197261, term197261.getClass(), "nmiAsserted", false);
        setIntField(term197261, term197261.getClass(), "lastPc", 0);
        setBooleanField(term197261, term197261.getClass(), "carryFlag", false);
        setBooleanField(term197261, term197261.getClass(), "negativeFlag", false);
        setBooleanField(term197261, term197261.getClass(), "zeroFlag", false);
        setBooleanField(term197261, term197261.getClass(), "irqDisableFlag", false);
        setBooleanField(term197261, term197261.getClass(), "decimalModeFlag", false);
        setBooleanField(term197261, term197261.getClass(), "breakFlag", false);
        setBooleanField(term197261, term197261.getClass(), "overflowFlag", false);
        setLongField(term197261, term197261.getClass(), "stepCounter", 0L);
        setField(term197195, term197195.getClass(), "state", term197261);
        setLongField(term197195, term197195.getClass(), "opBeginTime", -9094760859641883612L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstruction", argTypes, term197195, args);
    }

};


