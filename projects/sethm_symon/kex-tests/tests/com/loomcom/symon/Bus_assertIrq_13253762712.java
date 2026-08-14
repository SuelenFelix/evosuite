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

public class Bus_assertIrq_13253762712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39472;

    public Bus_assertIrq_13253762712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39561 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term39560 = ((Class) term39561).getDeclaredField((String) "NMOS_6502");
        ((Field) term39560).setAccessible(true);
        Object enum32 = ((Field) term39560).get((Object) null);
        HashMap term39520 = new HashMap();
        HashMap term39554 = new HashMap();
        term39472 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39475 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39490 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39493 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39495 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39498 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term39525 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term39526 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term39534 = (int[]) newIntArray(2);
        int[] term39537 = (int[]) newIntArray(2);
        Object[] term39559 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term39472, term39472.getClass(), "startAddress", -1606698075);
        setIntField(term39472, term39472.getClass(), "endAddress", 90996421);
        setLongField(term39475, term39475.getClass(), "clockPeriodInNs", 1000L);
        setField(term39475, term39475.getClass(), "behavior", enum32);
        setIntField(term39490, term39490.getClass(), "startAddress", -1805802783);
        setIntField(term39490, term39490.getClass(), "endAddress", -529831900);
        setLongField(term39493, term39493.getClass(), "clockPeriodInNs", 1000L);
        setField(term39493, term39493.getClass(), "behavior", enum32);
        setIntField(term39495, term39495.getClass(), "startAddress", 1574493440);
        setIntField(term39495, term39495.getClass(), "endAddress", 1854694585);
        setField(term39495, term39495.getClass(), "cpu", null);
        setField(term39495, term39495.getClass(), "deviceMap", null);
        setField(term39495, term39495.getClass(), "deviceAddressArray", null);
        setField(term39493, term39493.getClass(), "bus", term39495);
        setIntField(term39498, term39498.getClass(), "a", 0);
        setIntField(term39498, term39498.getClass(), "x", 0);
        setIntField(term39498, term39498.getClass(), "y", 0);
        setIntField(term39498, term39498.getClass(), "sp", 0);
        setIntField(term39498, term39498.getClass(), "pc", 0);
        setIntField(term39498, term39498.getClass(), "ir", 0);
        setIntField(term39498, term39498.getClass(), "nextIr", 0);
        setField(term39498, term39498.getClass(), "args", null);
        setField(term39498, term39498.getClass(), "nextArgs", null);
        setIntField(term39498, term39498.getClass(), "instSize", 0);
        setBooleanField(term39498, term39498.getClass(), "opTrap", false);
        setBooleanField(term39498, term39498.getClass(), "irqAsserted", false);
        setBooleanField(term39498, term39498.getClass(), "nmiAsserted", false);
        setIntField(term39498, term39498.getClass(), "lastPc", 0);
        setBooleanField(term39498, term39498.getClass(), "carryFlag", false);
        setBooleanField(term39498, term39498.getClass(), "negativeFlag", false);
        setBooleanField(term39498, term39498.getClass(), "zeroFlag", false);
        setBooleanField(term39498, term39498.getClass(), "irqDisableFlag", false);
        setBooleanField(term39498, term39498.getClass(), "decimalModeFlag", false);
        setBooleanField(term39498, term39498.getClass(), "breakFlag", false);
        setBooleanField(term39498, term39498.getClass(), "overflowFlag", false);
        setLongField(term39498, term39498.getClass(), "stepCounter", 0L);
        setField(term39493, term39493.getClass(), "state", term39498);
        setLongField(term39493, term39493.getClass(), "opBeginTime", 3230472384687362867L);
        setField(term39490, term39490.getClass(), "cpu", term39493);
        setField(term39490, term39490.getClass(), "deviceMap", term39520);
        setField(term39490, term39490.getClass(), "deviceAddressArray", term39525);
        setField(term39475, term39475.getClass(), "bus", term39490);
        setIntField(term39526, term39526.getClass(), "a", 0);
        setIntField(term39526, term39526.getClass(), "x", 0);
        setIntField(term39526, term39526.getClass(), "y", 0);
        setIntField(term39526, term39526.getClass(), "sp", 0);
        setIntField(term39526, term39526.getClass(), "pc", 0);
        setIntField(term39526, term39526.getClass(), "ir", 0);
        setIntField(term39526, term39526.getClass(), "nextIr", 0);
        setField(term39526, term39526.getClass(), "args", term39534);
        setField(term39526, term39526.getClass(), "nextArgs", term39537);
        setIntField(term39526, term39526.getClass(), "instSize", 0);
        setBooleanField(term39526, term39526.getClass(), "opTrap", false);
        setBooleanField(term39526, term39526.getClass(), "irqAsserted", false);
        setBooleanField(term39526, term39526.getClass(), "nmiAsserted", false);
        setIntField(term39526, term39526.getClass(), "lastPc", 0);
        setBooleanField(term39526, term39526.getClass(), "carryFlag", false);
        setBooleanField(term39526, term39526.getClass(), "negativeFlag", false);
        setBooleanField(term39526, term39526.getClass(), "zeroFlag", false);
        setBooleanField(term39526, term39526.getClass(), "irqDisableFlag", false);
        setBooleanField(term39526, term39526.getClass(), "decimalModeFlag", false);
        setBooleanField(term39526, term39526.getClass(), "breakFlag", false);
        setBooleanField(term39526, term39526.getClass(), "overflowFlag", false);
        setLongField(term39526, term39526.getClass(), "stepCounter", 0L);
        setField(term39475, term39475.getClass(), "state", term39526);
        setLongField(term39475, term39475.getClass(), "opBeginTime", -1145146470850585022L);
        setField(term39472, term39472.getClass(), "cpu", term39475);
        setField(term39472, term39472.getClass(), "deviceMap", term39554);
        setField(term39472, term39472.getClass(), "deviceAddressArray", term39559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assertIrq", argTypes, term39472, args);
    }

};


