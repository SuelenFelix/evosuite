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

public class Cpu_setCarryFlag_128547528633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185835;

    public Cpu_setCarryFlag_128547528633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185930 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term185929 = ((Class) term185930).getDeclaredField((String) "NMOS_6502");
        ((Field) term185929).setAccessible(true);
        Object enum213 = ((Field) term185929).get((Object) null);
        HashMap term185861 = new HashMap();
        HashMap term185895 = new HashMap();
        term185835 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185850 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185853 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185855 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185858 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term185866 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term185867 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185875 = (int[]) newIntArray(2);
        int[] term185878 = (int[]) newIntArray(2);
        Object[] term185900 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term185901 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185909 = (int[]) newIntArray(2);
        int[] term185912 = (int[]) newIntArray(2);
        setLongField(term185835, term185835.getClass(), "clockPeriodInNs", 1000L);
        setField(term185835, term185835.getClass(), "behavior", enum213);
        setIntField(term185850, term185850.getClass(), "startAddress", -567427801);
        setIntField(term185850, term185850.getClass(), "endAddress", -2126712285);
        setLongField(term185853, term185853.getClass(), "clockPeriodInNs", 1000L);
        setField(term185853, term185853.getClass(), "behavior", enum213);
        setIntField(term185855, term185855.getClass(), "startAddress", 194145706);
        setIntField(term185855, term185855.getClass(), "endAddress", -1882347774);
        setLongField(term185858, term185858.getClass(), "clockPeriodInNs", 1000L);
        setField(term185858, term185858.getClass(), "behavior", enum213);
        setField(term185858, term185858.getClass(), "bus", null);
        setField(term185858, term185858.getClass(), "state", null);
        setLongField(term185858, term185858.getClass(), "opBeginTime", 5587445443876887300L);
        setField(term185855, term185855.getClass(), "cpu", term185858);
        setField(term185855, term185855.getClass(), "deviceMap", term185861);
        setField(term185855, term185855.getClass(), "deviceAddressArray", term185866);
        setField(term185853, term185853.getClass(), "bus", term185855);
        setIntField(term185867, term185867.getClass(), "a", 0);
        setIntField(term185867, term185867.getClass(), "x", 0);
        setIntField(term185867, term185867.getClass(), "y", 0);
        setIntField(term185867, term185867.getClass(), "sp", 0);
        setIntField(term185867, term185867.getClass(), "pc", 0);
        setIntField(term185867, term185867.getClass(), "ir", 0);
        setIntField(term185867, term185867.getClass(), "nextIr", 0);
        setField(term185867, term185867.getClass(), "args", term185875);
        setField(term185867, term185867.getClass(), "nextArgs", term185878);
        setIntField(term185867, term185867.getClass(), "instSize", 0);
        setBooleanField(term185867, term185867.getClass(), "opTrap", false);
        setBooleanField(term185867, term185867.getClass(), "irqAsserted", false);
        setBooleanField(term185867, term185867.getClass(), "nmiAsserted", false);
        setIntField(term185867, term185867.getClass(), "lastPc", 0);
        setBooleanField(term185867, term185867.getClass(), "carryFlag", false);
        setBooleanField(term185867, term185867.getClass(), "negativeFlag", false);
        setBooleanField(term185867, term185867.getClass(), "zeroFlag", false);
        setBooleanField(term185867, term185867.getClass(), "irqDisableFlag", false);
        setBooleanField(term185867, term185867.getClass(), "decimalModeFlag", false);
        setBooleanField(term185867, term185867.getClass(), "breakFlag", false);
        setBooleanField(term185867, term185867.getClass(), "overflowFlag", false);
        setLongField(term185867, term185867.getClass(), "stepCounter", 0L);
        setField(term185853, term185853.getClass(), "state", term185867);
        setLongField(term185853, term185853.getClass(), "opBeginTime", -8147385208615265440L);
        setField(term185850, term185850.getClass(), "cpu", term185853);
        setField(term185850, term185850.getClass(), "deviceMap", term185895);
        setField(term185850, term185850.getClass(), "deviceAddressArray", term185900);
        setField(term185835, term185835.getClass(), "bus", term185850);
        setIntField(term185901, term185901.getClass(), "a", 0);
        setIntField(term185901, term185901.getClass(), "x", 0);
        setIntField(term185901, term185901.getClass(), "y", 0);
        setIntField(term185901, term185901.getClass(), "sp", 0);
        setIntField(term185901, term185901.getClass(), "pc", 0);
        setIntField(term185901, term185901.getClass(), "ir", 0);
        setIntField(term185901, term185901.getClass(), "nextIr", 0);
        setField(term185901, term185901.getClass(), "args", term185909);
        setField(term185901, term185901.getClass(), "nextArgs", term185912);
        setIntField(term185901, term185901.getClass(), "instSize", 0);
        setBooleanField(term185901, term185901.getClass(), "opTrap", false);
        setBooleanField(term185901, term185901.getClass(), "irqAsserted", false);
        setBooleanField(term185901, term185901.getClass(), "nmiAsserted", false);
        setIntField(term185901, term185901.getClass(), "lastPc", 0);
        setBooleanField(term185901, term185901.getClass(), "carryFlag", false);
        setBooleanField(term185901, term185901.getClass(), "negativeFlag", false);
        setBooleanField(term185901, term185901.getClass(), "zeroFlag", false);
        setBooleanField(term185901, term185901.getClass(), "irqDisableFlag", false);
        setBooleanField(term185901, term185901.getClass(), "decimalModeFlag", false);
        setBooleanField(term185901, term185901.getClass(), "breakFlag", false);
        setBooleanField(term185901, term185901.getClass(), "overflowFlag", false);
        setLongField(term185901, term185901.getClass(), "stepCounter", 0L);
        setField(term185835, term185835.getClass(), "state", term185901);
        setLongField(term185835, term185835.getClass(), "opBeginTime", 2169332993170315110L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setCarryFlag", argTypes, term185835, args);
    }

};


