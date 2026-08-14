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

public class Cpu_getBehavior_1840520315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175537;

    public Cpu_getBehavior_1840520315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175632 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term175631 = ((Class) term175632).getDeclaredField((String) "NMOS_6502");
        ((Field) term175631).setAccessible(true);
        Object enum185 = ((Field) term175631).get((Object) null);
        HashMap term175563 = new HashMap();
        HashMap term175597 = new HashMap();
        term175537 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term175552 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term175555 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term175557 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term175560 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term175568 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term175569 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term175577 = (int[]) newIntArray(2);
        int[] term175580 = (int[]) newIntArray(2);
        Object[] term175602 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term175603 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term175611 = (int[]) newIntArray(2);
        int[] term175614 = (int[]) newIntArray(2);
        setLongField(term175537, term175537.getClass(), "clockPeriodInNs", 1000L);
        setField(term175537, term175537.getClass(), "behavior", enum185);
        setIntField(term175552, term175552.getClass(), "startAddress", 280855495);
        setIntField(term175552, term175552.getClass(), "endAddress", -1336475116);
        setLongField(term175555, term175555.getClass(), "clockPeriodInNs", 1000L);
        setField(term175555, term175555.getClass(), "behavior", enum185);
        setIntField(term175557, term175557.getClass(), "startAddress", -229094004);
        setIntField(term175557, term175557.getClass(), "endAddress", 1055966732);
        setLongField(term175560, term175560.getClass(), "clockPeriodInNs", 1000L);
        setField(term175560, term175560.getClass(), "behavior", enum185);
        setField(term175560, term175560.getClass(), "bus", null);
        setField(term175560, term175560.getClass(), "state", null);
        setLongField(term175560, term175560.getClass(), "opBeginTime", -2938034344303060228L);
        setField(term175557, term175557.getClass(), "cpu", term175560);
        setField(term175557, term175557.getClass(), "deviceMap", term175563);
        setField(term175557, term175557.getClass(), "deviceAddressArray", term175568);
        setField(term175555, term175555.getClass(), "bus", term175557);
        setIntField(term175569, term175569.getClass(), "a", 0);
        setIntField(term175569, term175569.getClass(), "x", 0);
        setIntField(term175569, term175569.getClass(), "y", 0);
        setIntField(term175569, term175569.getClass(), "sp", 0);
        setIntField(term175569, term175569.getClass(), "pc", 0);
        setIntField(term175569, term175569.getClass(), "ir", 0);
        setIntField(term175569, term175569.getClass(), "nextIr", 0);
        setField(term175569, term175569.getClass(), "args", term175577);
        setField(term175569, term175569.getClass(), "nextArgs", term175580);
        setIntField(term175569, term175569.getClass(), "instSize", 0);
        setBooleanField(term175569, term175569.getClass(), "opTrap", false);
        setBooleanField(term175569, term175569.getClass(), "irqAsserted", false);
        setBooleanField(term175569, term175569.getClass(), "nmiAsserted", false);
        setIntField(term175569, term175569.getClass(), "lastPc", 0);
        setBooleanField(term175569, term175569.getClass(), "carryFlag", false);
        setBooleanField(term175569, term175569.getClass(), "negativeFlag", false);
        setBooleanField(term175569, term175569.getClass(), "zeroFlag", false);
        setBooleanField(term175569, term175569.getClass(), "irqDisableFlag", false);
        setBooleanField(term175569, term175569.getClass(), "decimalModeFlag", false);
        setBooleanField(term175569, term175569.getClass(), "breakFlag", false);
        setBooleanField(term175569, term175569.getClass(), "overflowFlag", false);
        setLongField(term175569, term175569.getClass(), "stepCounter", 0L);
        setField(term175555, term175555.getClass(), "state", term175569);
        setLongField(term175555, term175555.getClass(), "opBeginTime", -758819117507836512L);
        setField(term175552, term175552.getClass(), "cpu", term175555);
        setField(term175552, term175552.getClass(), "deviceMap", term175597);
        setField(term175552, term175552.getClass(), "deviceAddressArray", term175602);
        setField(term175537, term175537.getClass(), "bus", term175552);
        setIntField(term175603, term175603.getClass(), "a", 0);
        setIntField(term175603, term175603.getClass(), "x", 0);
        setIntField(term175603, term175603.getClass(), "y", 0);
        setIntField(term175603, term175603.getClass(), "sp", 0);
        setIntField(term175603, term175603.getClass(), "pc", 0);
        setIntField(term175603, term175603.getClass(), "ir", 0);
        setIntField(term175603, term175603.getClass(), "nextIr", 0);
        setField(term175603, term175603.getClass(), "args", term175611);
        setField(term175603, term175603.getClass(), "nextArgs", term175614);
        setIntField(term175603, term175603.getClass(), "instSize", 0);
        setBooleanField(term175603, term175603.getClass(), "opTrap", false);
        setBooleanField(term175603, term175603.getClass(), "irqAsserted", false);
        setBooleanField(term175603, term175603.getClass(), "nmiAsserted", false);
        setIntField(term175603, term175603.getClass(), "lastPc", 0);
        setBooleanField(term175603, term175603.getClass(), "carryFlag", false);
        setBooleanField(term175603, term175603.getClass(), "negativeFlag", false);
        setBooleanField(term175603, term175603.getClass(), "zeroFlag", false);
        setBooleanField(term175603, term175603.getClass(), "irqDisableFlag", false);
        setBooleanField(term175603, term175603.getClass(), "decimalModeFlag", false);
        setBooleanField(term175603, term175603.getClass(), "breakFlag", false);
        setBooleanField(term175603, term175603.getClass(), "overflowFlag", false);
        setLongField(term175603, term175603.getClass(), "stepCounter", 0L);
        setField(term175537, term175537.getClass(), "state", term175603);
        setLongField(term175537, term175537.getClass(), "opBeginTime", -1855660992126411308L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBehavior", argTypes, term175537, args);
    }

};


