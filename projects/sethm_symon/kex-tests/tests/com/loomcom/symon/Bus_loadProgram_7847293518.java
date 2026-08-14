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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Bus_loadProgram_7847293518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41608;
     Object term41696;

    public Bus_loadProgram_7847293518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41705 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term41704 = ((Class) term41705).getDeclaredField((String) "NMOS_6502");
        ((Field) term41704).setAccessible(true);
        Object enum38 = ((Field) term41704).get((Object) null);
        HashMap term41656 = new HashMap();
        HashMap term41690 = new HashMap();
        term41608 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41611 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term41626 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41629 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term41631 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term41634 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term41661 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term41662 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term41670 = (int[]) newIntArray(2);
        int[] term41673 = (int[]) newIntArray(2);
        Object[] term41695 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term41608, term41608.getClass(), "startAddress", -1042022818);
        setIntField(term41608, term41608.getClass(), "endAddress", 317372051);
        setLongField(term41611, term41611.getClass(), "clockPeriodInNs", 1000L);
        setField(term41611, term41611.getClass(), "behavior", enum38);
        setIntField(term41626, term41626.getClass(), "startAddress", 892170444);
        setIntField(term41626, term41626.getClass(), "endAddress", -82417507);
        setLongField(term41629, term41629.getClass(), "clockPeriodInNs", 1000L);
        setField(term41629, term41629.getClass(), "behavior", enum38);
        setIntField(term41631, term41631.getClass(), "startAddress", -511400358);
        setIntField(term41631, term41631.getClass(), "endAddress", -742178468);
        setField(term41631, term41631.getClass(), "cpu", null);
        setField(term41631, term41631.getClass(), "deviceMap", null);
        setField(term41631, term41631.getClass(), "deviceAddressArray", null);
        setField(term41629, term41629.getClass(), "bus", term41631);
        setIntField(term41634, term41634.getClass(), "a", 0);
        setIntField(term41634, term41634.getClass(), "x", 0);
        setIntField(term41634, term41634.getClass(), "y", 0);
        setIntField(term41634, term41634.getClass(), "sp", 0);
        setIntField(term41634, term41634.getClass(), "pc", 0);
        setIntField(term41634, term41634.getClass(), "ir", 0);
        setIntField(term41634, term41634.getClass(), "nextIr", 0);
        setField(term41634, term41634.getClass(), "args", null);
        setField(term41634, term41634.getClass(), "nextArgs", null);
        setIntField(term41634, term41634.getClass(), "instSize", 0);
        setBooleanField(term41634, term41634.getClass(), "opTrap", false);
        setBooleanField(term41634, term41634.getClass(), "irqAsserted", false);
        setBooleanField(term41634, term41634.getClass(), "nmiAsserted", false);
        setIntField(term41634, term41634.getClass(), "lastPc", 0);
        setBooleanField(term41634, term41634.getClass(), "carryFlag", false);
        setBooleanField(term41634, term41634.getClass(), "negativeFlag", false);
        setBooleanField(term41634, term41634.getClass(), "zeroFlag", false);
        setBooleanField(term41634, term41634.getClass(), "irqDisableFlag", false);
        setBooleanField(term41634, term41634.getClass(), "decimalModeFlag", false);
        setBooleanField(term41634, term41634.getClass(), "breakFlag", false);
        setBooleanField(term41634, term41634.getClass(), "overflowFlag", false);
        setLongField(term41634, term41634.getClass(), "stepCounter", 0L);
        setField(term41629, term41629.getClass(), "state", term41634);
        setLongField(term41629, term41629.getClass(), "opBeginTime", -7456852906235966771L);
        setField(term41626, term41626.getClass(), "cpu", term41629);
        setField(term41626, term41626.getClass(), "deviceMap", term41656);
        setField(term41626, term41626.getClass(), "deviceAddressArray", term41661);
        setField(term41611, term41611.getClass(), "bus", term41626);
        setIntField(term41662, term41662.getClass(), "a", 0);
        setIntField(term41662, term41662.getClass(), "x", 0);
        setIntField(term41662, term41662.getClass(), "y", 0);
        setIntField(term41662, term41662.getClass(), "sp", 0);
        setIntField(term41662, term41662.getClass(), "pc", 0);
        setIntField(term41662, term41662.getClass(), "ir", 0);
        setIntField(term41662, term41662.getClass(), "nextIr", 0);
        setField(term41662, term41662.getClass(), "args", term41670);
        setField(term41662, term41662.getClass(), "nextArgs", term41673);
        setIntField(term41662, term41662.getClass(), "instSize", 0);
        setBooleanField(term41662, term41662.getClass(), "opTrap", false);
        setBooleanField(term41662, term41662.getClass(), "irqAsserted", false);
        setBooleanField(term41662, term41662.getClass(), "nmiAsserted", false);
        setIntField(term41662, term41662.getClass(), "lastPc", 0);
        setBooleanField(term41662, term41662.getClass(), "carryFlag", false);
        setBooleanField(term41662, term41662.getClass(), "negativeFlag", false);
        setBooleanField(term41662, term41662.getClass(), "zeroFlag", false);
        setBooleanField(term41662, term41662.getClass(), "irqDisableFlag", false);
        setBooleanField(term41662, term41662.getClass(), "decimalModeFlag", false);
        setBooleanField(term41662, term41662.getClass(), "breakFlag", false);
        setBooleanField(term41662, term41662.getClass(), "overflowFlag", false);
        setLongField(term41662, term41662.getClass(), "stepCounter", 0L);
        setField(term41611, term41611.getClass(), "state", term41662);
        setLongField(term41611, term41611.getClass(), "opBeginTime", -67485388932970712L);
        setField(term41608, term41608.getClass(), "cpu", term41611);
        setField(term41608, term41608.getClass(), "deviceMap", term41690);
        setField(term41608, term41608.getClass(), "deviceAddressArray", term41695);
        term41696 = (int[]) newIntArray(7);
        setIntElement(term41696, 0, -288126597);
        setIntElement(term41696, 1, -218831961);
        setIntElement(term41696, 2, 826765055);
        setIntElement(term41696, 3, 1358117317);
        setIntElement(term41696, 4, 229989439);
        setIntElement(term41696, 5, -1620126913);
        setIntElement(term41696, 6, -1095121979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41696;
        callMethod(klass, "loadProgram", argTypes, term41608, args);
    }

};


