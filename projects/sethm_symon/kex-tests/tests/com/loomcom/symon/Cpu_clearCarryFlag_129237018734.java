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

public class Cpu_clearCarryFlag_129237018734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186201;

    public Cpu_clearCarryFlag_129237018734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186296 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term186295 = ((Class) term186296).getDeclaredField((String) "NMOS_6502");
        ((Field) term186295).setAccessible(true);
        Object enum214 = ((Field) term186295).get((Object) null);
        HashMap term186227 = new HashMap();
        HashMap term186261 = new HashMap();
        term186201 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186216 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186219 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186221 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186224 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term186232 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term186233 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term186241 = (int[]) newIntArray(2);
        int[] term186244 = (int[]) newIntArray(2);
        Object[] term186266 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term186267 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term186275 = (int[]) newIntArray(2);
        int[] term186278 = (int[]) newIntArray(2);
        setLongField(term186201, term186201.getClass(), "clockPeriodInNs", 1000L);
        setField(term186201, term186201.getClass(), "behavior", enum214);
        setIntField(term186216, term186216.getClass(), "startAddress", 1202324559);
        setIntField(term186216, term186216.getClass(), "endAddress", -1203173430);
        setLongField(term186219, term186219.getClass(), "clockPeriodInNs", 1000L);
        setField(term186219, term186219.getClass(), "behavior", enum214);
        setIntField(term186221, term186221.getClass(), "startAddress", -643310730);
        setIntField(term186221, term186221.getClass(), "endAddress", 79925667);
        setLongField(term186224, term186224.getClass(), "clockPeriodInNs", 1000L);
        setField(term186224, term186224.getClass(), "behavior", enum214);
        setField(term186224, term186224.getClass(), "bus", null);
        setField(term186224, term186224.getClass(), "state", null);
        setLongField(term186224, term186224.getClass(), "opBeginTime", -8129901089598682226L);
        setField(term186221, term186221.getClass(), "cpu", term186224);
        setField(term186221, term186221.getClass(), "deviceMap", term186227);
        setField(term186221, term186221.getClass(), "deviceAddressArray", term186232);
        setField(term186219, term186219.getClass(), "bus", term186221);
        setIntField(term186233, term186233.getClass(), "a", 0);
        setIntField(term186233, term186233.getClass(), "x", 0);
        setIntField(term186233, term186233.getClass(), "y", 0);
        setIntField(term186233, term186233.getClass(), "sp", 0);
        setIntField(term186233, term186233.getClass(), "pc", 0);
        setIntField(term186233, term186233.getClass(), "ir", 0);
        setIntField(term186233, term186233.getClass(), "nextIr", 0);
        setField(term186233, term186233.getClass(), "args", term186241);
        setField(term186233, term186233.getClass(), "nextArgs", term186244);
        setIntField(term186233, term186233.getClass(), "instSize", 0);
        setBooleanField(term186233, term186233.getClass(), "opTrap", false);
        setBooleanField(term186233, term186233.getClass(), "irqAsserted", false);
        setBooleanField(term186233, term186233.getClass(), "nmiAsserted", false);
        setIntField(term186233, term186233.getClass(), "lastPc", 0);
        setBooleanField(term186233, term186233.getClass(), "carryFlag", false);
        setBooleanField(term186233, term186233.getClass(), "negativeFlag", false);
        setBooleanField(term186233, term186233.getClass(), "zeroFlag", false);
        setBooleanField(term186233, term186233.getClass(), "irqDisableFlag", false);
        setBooleanField(term186233, term186233.getClass(), "decimalModeFlag", false);
        setBooleanField(term186233, term186233.getClass(), "breakFlag", false);
        setBooleanField(term186233, term186233.getClass(), "overflowFlag", false);
        setLongField(term186233, term186233.getClass(), "stepCounter", 0L);
        setField(term186219, term186219.getClass(), "state", term186233);
        setLongField(term186219, term186219.getClass(), "opBeginTime", -2740731095268174775L);
        setField(term186216, term186216.getClass(), "cpu", term186219);
        setField(term186216, term186216.getClass(), "deviceMap", term186261);
        setField(term186216, term186216.getClass(), "deviceAddressArray", term186266);
        setField(term186201, term186201.getClass(), "bus", term186216);
        setIntField(term186267, term186267.getClass(), "a", 0);
        setIntField(term186267, term186267.getClass(), "x", 0);
        setIntField(term186267, term186267.getClass(), "y", 0);
        setIntField(term186267, term186267.getClass(), "sp", 0);
        setIntField(term186267, term186267.getClass(), "pc", 0);
        setIntField(term186267, term186267.getClass(), "ir", 0);
        setIntField(term186267, term186267.getClass(), "nextIr", 0);
        setField(term186267, term186267.getClass(), "args", term186275);
        setField(term186267, term186267.getClass(), "nextArgs", term186278);
        setIntField(term186267, term186267.getClass(), "instSize", 0);
        setBooleanField(term186267, term186267.getClass(), "opTrap", false);
        setBooleanField(term186267, term186267.getClass(), "irqAsserted", false);
        setBooleanField(term186267, term186267.getClass(), "nmiAsserted", false);
        setIntField(term186267, term186267.getClass(), "lastPc", 0);
        setBooleanField(term186267, term186267.getClass(), "carryFlag", false);
        setBooleanField(term186267, term186267.getClass(), "negativeFlag", false);
        setBooleanField(term186267, term186267.getClass(), "zeroFlag", false);
        setBooleanField(term186267, term186267.getClass(), "irqDisableFlag", false);
        setBooleanField(term186267, term186267.getClass(), "decimalModeFlag", false);
        setBooleanField(term186267, term186267.getClass(), "breakFlag", false);
        setBooleanField(term186267, term186267.getClass(), "overflowFlag", false);
        setLongField(term186267, term186267.getClass(), "stepCounter", 0L);
        setField(term186201, term186201.getClass(), "state", term186267);
        setLongField(term186201, term186201.getClass(), "opBeginTime", 1434994695522862422L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCarryFlag", argTypes, term186201, args);
    }

};


