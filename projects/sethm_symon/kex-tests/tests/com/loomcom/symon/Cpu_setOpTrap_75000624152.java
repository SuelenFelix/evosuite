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

public class Cpu_setOpTrap_75000624152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192793;

    public Cpu_setOpTrap_75000624152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192888 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term192887 = ((Class) term192888).getDeclaredField((String) "NMOS_6502");
        ((Field) term192887).setAccessible(true);
        Object enum232 = ((Field) term192887).get((Object) null);
        HashMap term192819 = new HashMap();
        HashMap term192853 = new HashMap();
        term192793 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192808 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192811 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192813 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192816 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term192824 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term192825 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192833 = (int[]) newIntArray(2);
        int[] term192836 = (int[]) newIntArray(2);
        Object[] term192858 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term192859 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192867 = (int[]) newIntArray(2);
        int[] term192870 = (int[]) newIntArray(2);
        setLongField(term192793, term192793.getClass(), "clockPeriodInNs", 1000L);
        setField(term192793, term192793.getClass(), "behavior", enum232);
        setIntField(term192808, term192808.getClass(), "startAddress", -10808205);
        setIntField(term192808, term192808.getClass(), "endAddress", -774591519);
        setLongField(term192811, term192811.getClass(), "clockPeriodInNs", 1000L);
        setField(term192811, term192811.getClass(), "behavior", enum232);
        setIntField(term192813, term192813.getClass(), "startAddress", 1785308866);
        setIntField(term192813, term192813.getClass(), "endAddress", 1881022849);
        setLongField(term192816, term192816.getClass(), "clockPeriodInNs", 1000L);
        setField(term192816, term192816.getClass(), "behavior", enum232);
        setField(term192816, term192816.getClass(), "bus", null);
        setField(term192816, term192816.getClass(), "state", null);
        setLongField(term192816, term192816.getClass(), "opBeginTime", 8259341710509598103L);
        setField(term192813, term192813.getClass(), "cpu", term192816);
        setField(term192813, term192813.getClass(), "deviceMap", term192819);
        setField(term192813, term192813.getClass(), "deviceAddressArray", term192824);
        setField(term192811, term192811.getClass(), "bus", term192813);
        setIntField(term192825, term192825.getClass(), "a", 0);
        setIntField(term192825, term192825.getClass(), "x", 0);
        setIntField(term192825, term192825.getClass(), "y", 0);
        setIntField(term192825, term192825.getClass(), "sp", 0);
        setIntField(term192825, term192825.getClass(), "pc", 0);
        setIntField(term192825, term192825.getClass(), "ir", 0);
        setIntField(term192825, term192825.getClass(), "nextIr", 0);
        setField(term192825, term192825.getClass(), "args", term192833);
        setField(term192825, term192825.getClass(), "nextArgs", term192836);
        setIntField(term192825, term192825.getClass(), "instSize", 0);
        setBooleanField(term192825, term192825.getClass(), "opTrap", false);
        setBooleanField(term192825, term192825.getClass(), "irqAsserted", false);
        setBooleanField(term192825, term192825.getClass(), "nmiAsserted", false);
        setIntField(term192825, term192825.getClass(), "lastPc", 0);
        setBooleanField(term192825, term192825.getClass(), "carryFlag", false);
        setBooleanField(term192825, term192825.getClass(), "negativeFlag", false);
        setBooleanField(term192825, term192825.getClass(), "zeroFlag", false);
        setBooleanField(term192825, term192825.getClass(), "irqDisableFlag", false);
        setBooleanField(term192825, term192825.getClass(), "decimalModeFlag", false);
        setBooleanField(term192825, term192825.getClass(), "breakFlag", false);
        setBooleanField(term192825, term192825.getClass(), "overflowFlag", false);
        setLongField(term192825, term192825.getClass(), "stepCounter", 0L);
        setField(term192811, term192811.getClass(), "state", term192825);
        setLongField(term192811, term192811.getClass(), "opBeginTime", -3542890656778018623L);
        setField(term192808, term192808.getClass(), "cpu", term192811);
        setField(term192808, term192808.getClass(), "deviceMap", term192853);
        setField(term192808, term192808.getClass(), "deviceAddressArray", term192858);
        setField(term192793, term192793.getClass(), "bus", term192808);
        setIntField(term192859, term192859.getClass(), "a", 0);
        setIntField(term192859, term192859.getClass(), "x", 0);
        setIntField(term192859, term192859.getClass(), "y", 0);
        setIntField(term192859, term192859.getClass(), "sp", 0);
        setIntField(term192859, term192859.getClass(), "pc", 0);
        setIntField(term192859, term192859.getClass(), "ir", 0);
        setIntField(term192859, term192859.getClass(), "nextIr", 0);
        setField(term192859, term192859.getClass(), "args", term192867);
        setField(term192859, term192859.getClass(), "nextArgs", term192870);
        setIntField(term192859, term192859.getClass(), "instSize", 0);
        setBooleanField(term192859, term192859.getClass(), "opTrap", false);
        setBooleanField(term192859, term192859.getClass(), "irqAsserted", false);
        setBooleanField(term192859, term192859.getClass(), "nmiAsserted", false);
        setIntField(term192859, term192859.getClass(), "lastPc", 0);
        setBooleanField(term192859, term192859.getClass(), "carryFlag", false);
        setBooleanField(term192859, term192859.getClass(), "negativeFlag", false);
        setBooleanField(term192859, term192859.getClass(), "zeroFlag", false);
        setBooleanField(term192859, term192859.getClass(), "irqDisableFlag", false);
        setBooleanField(term192859, term192859.getClass(), "decimalModeFlag", false);
        setBooleanField(term192859, term192859.getClass(), "breakFlag", false);
        setBooleanField(term192859, term192859.getClass(), "overflowFlag", false);
        setLongField(term192859, term192859.getClass(), "stepCounter", 0L);
        setField(term192793, term192793.getClass(), "state", term192859);
        setLongField(term192793, term192793.getClass(), "opBeginTime", -2892042709653134442L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOpTrap", argTypes, term192793, args);
    }

};


