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

public class Bus_buildDeviceAddressArray_18986610224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36525;

    public Bus_buildDeviceAddressArray_18986610224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36614 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term36613 = ((Class) term36614).getDeclaredField((String) "NMOS_6502");
        ((Field) term36613).setAccessible(true);
        Object enum24 = ((Field) term36613).get((Object) null);
        HashMap term36573 = new HashMap();
        HashMap term36607 = new HashMap();
        term36525 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36528 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36543 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36546 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36548 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36551 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term36578 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term36579 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term36587 = (int[]) newIntArray(2);
        int[] term36590 = (int[]) newIntArray(2);
        Object[] term36612 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term36525, term36525.getClass(), "startAddress", 533171496);
        setIntField(term36525, term36525.getClass(), "endAddress", 1369020869);
        setLongField(term36528, term36528.getClass(), "clockPeriodInNs", 1000L);
        setField(term36528, term36528.getClass(), "behavior", enum24);
        setIntField(term36543, term36543.getClass(), "startAddress", -1428947021);
        setIntField(term36543, term36543.getClass(), "endAddress", -134324004);
        setLongField(term36546, term36546.getClass(), "clockPeriodInNs", 1000L);
        setField(term36546, term36546.getClass(), "behavior", enum24);
        setIntField(term36548, term36548.getClass(), "startAddress", -1813266173);
        setIntField(term36548, term36548.getClass(), "endAddress", -1201819537);
        setField(term36548, term36548.getClass(), "cpu", null);
        setField(term36548, term36548.getClass(), "deviceMap", null);
        setField(term36548, term36548.getClass(), "deviceAddressArray", null);
        setField(term36546, term36546.getClass(), "bus", term36548);
        setIntField(term36551, term36551.getClass(), "a", 0);
        setIntField(term36551, term36551.getClass(), "x", 0);
        setIntField(term36551, term36551.getClass(), "y", 0);
        setIntField(term36551, term36551.getClass(), "sp", 0);
        setIntField(term36551, term36551.getClass(), "pc", 0);
        setIntField(term36551, term36551.getClass(), "ir", 0);
        setIntField(term36551, term36551.getClass(), "nextIr", 0);
        setField(term36551, term36551.getClass(), "args", null);
        setField(term36551, term36551.getClass(), "nextArgs", null);
        setIntField(term36551, term36551.getClass(), "instSize", 0);
        setBooleanField(term36551, term36551.getClass(), "opTrap", false);
        setBooleanField(term36551, term36551.getClass(), "irqAsserted", false);
        setBooleanField(term36551, term36551.getClass(), "nmiAsserted", false);
        setIntField(term36551, term36551.getClass(), "lastPc", 0);
        setBooleanField(term36551, term36551.getClass(), "carryFlag", false);
        setBooleanField(term36551, term36551.getClass(), "negativeFlag", false);
        setBooleanField(term36551, term36551.getClass(), "zeroFlag", false);
        setBooleanField(term36551, term36551.getClass(), "irqDisableFlag", false);
        setBooleanField(term36551, term36551.getClass(), "decimalModeFlag", false);
        setBooleanField(term36551, term36551.getClass(), "breakFlag", false);
        setBooleanField(term36551, term36551.getClass(), "overflowFlag", false);
        setLongField(term36551, term36551.getClass(), "stepCounter", 0L);
        setField(term36546, term36546.getClass(), "state", term36551);
        setLongField(term36546, term36546.getClass(), "opBeginTime", 4502292577098212311L);
        setField(term36543, term36543.getClass(), "cpu", term36546);
        setField(term36543, term36543.getClass(), "deviceMap", term36573);
        setField(term36543, term36543.getClass(), "deviceAddressArray", term36578);
        setField(term36528, term36528.getClass(), "bus", term36543);
        setIntField(term36579, term36579.getClass(), "a", 0);
        setIntField(term36579, term36579.getClass(), "x", 0);
        setIntField(term36579, term36579.getClass(), "y", 0);
        setIntField(term36579, term36579.getClass(), "sp", 0);
        setIntField(term36579, term36579.getClass(), "pc", 0);
        setIntField(term36579, term36579.getClass(), "ir", 0);
        setIntField(term36579, term36579.getClass(), "nextIr", 0);
        setField(term36579, term36579.getClass(), "args", term36587);
        setField(term36579, term36579.getClass(), "nextArgs", term36590);
        setIntField(term36579, term36579.getClass(), "instSize", 0);
        setBooleanField(term36579, term36579.getClass(), "opTrap", false);
        setBooleanField(term36579, term36579.getClass(), "irqAsserted", false);
        setBooleanField(term36579, term36579.getClass(), "nmiAsserted", false);
        setIntField(term36579, term36579.getClass(), "lastPc", 0);
        setBooleanField(term36579, term36579.getClass(), "carryFlag", false);
        setBooleanField(term36579, term36579.getClass(), "negativeFlag", false);
        setBooleanField(term36579, term36579.getClass(), "zeroFlag", false);
        setBooleanField(term36579, term36579.getClass(), "irqDisableFlag", false);
        setBooleanField(term36579, term36579.getClass(), "decimalModeFlag", false);
        setBooleanField(term36579, term36579.getClass(), "breakFlag", false);
        setBooleanField(term36579, term36579.getClass(), "overflowFlag", false);
        setLongField(term36579, term36579.getClass(), "stepCounter", 0L);
        setField(term36528, term36528.getClass(), "state", term36579);
        setLongField(term36528, term36528.getClass(), "opBeginTime", -3730936709704460408L);
        setField(term36525, term36525.getClass(), "cpu", term36528);
        setField(term36525, term36525.getClass(), "deviceMap", term36607);
        setField(term36525, term36525.getClass(), "deviceAddressArray", term36612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDeviceAddressArray", argTypes, term36525, args);
    }

};


