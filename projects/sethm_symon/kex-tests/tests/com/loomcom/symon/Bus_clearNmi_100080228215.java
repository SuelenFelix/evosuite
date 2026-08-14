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

public class Bus_clearNmi_100080228215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40540;

    public Bus_clearNmi_100080228215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40629 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term40628 = ((Class) term40629).getDeclaredField((String) "NMOS_6502");
        ((Field) term40628).setAccessible(true);
        Object enum35 = ((Field) term40628).get((Object) null);
        HashMap term40588 = new HashMap();
        HashMap term40622 = new HashMap();
        term40540 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40543 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40558 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40561 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40563 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40566 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term40593 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term40594 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term40602 = (int[]) newIntArray(2);
        int[] term40605 = (int[]) newIntArray(2);
        Object[] term40627 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term40540, term40540.getClass(), "startAddress", -1551790945);
        setIntField(term40540, term40540.getClass(), "endAddress", 2039538484);
        setLongField(term40543, term40543.getClass(), "clockPeriodInNs", 1000L);
        setField(term40543, term40543.getClass(), "behavior", enum35);
        setIntField(term40558, term40558.getClass(), "startAddress", 1235736068);
        setIntField(term40558, term40558.getClass(), "endAddress", 329424176);
        setLongField(term40561, term40561.getClass(), "clockPeriodInNs", 1000L);
        setField(term40561, term40561.getClass(), "behavior", enum35);
        setIntField(term40563, term40563.getClass(), "startAddress", -1897199214);
        setIntField(term40563, term40563.getClass(), "endAddress", -1016478729);
        setField(term40563, term40563.getClass(), "cpu", null);
        setField(term40563, term40563.getClass(), "deviceMap", null);
        setField(term40563, term40563.getClass(), "deviceAddressArray", null);
        setField(term40561, term40561.getClass(), "bus", term40563);
        setIntField(term40566, term40566.getClass(), "a", 0);
        setIntField(term40566, term40566.getClass(), "x", 0);
        setIntField(term40566, term40566.getClass(), "y", 0);
        setIntField(term40566, term40566.getClass(), "sp", 0);
        setIntField(term40566, term40566.getClass(), "pc", 0);
        setIntField(term40566, term40566.getClass(), "ir", 0);
        setIntField(term40566, term40566.getClass(), "nextIr", 0);
        setField(term40566, term40566.getClass(), "args", null);
        setField(term40566, term40566.getClass(), "nextArgs", null);
        setIntField(term40566, term40566.getClass(), "instSize", 0);
        setBooleanField(term40566, term40566.getClass(), "opTrap", false);
        setBooleanField(term40566, term40566.getClass(), "irqAsserted", false);
        setBooleanField(term40566, term40566.getClass(), "nmiAsserted", false);
        setIntField(term40566, term40566.getClass(), "lastPc", 0);
        setBooleanField(term40566, term40566.getClass(), "carryFlag", false);
        setBooleanField(term40566, term40566.getClass(), "negativeFlag", false);
        setBooleanField(term40566, term40566.getClass(), "zeroFlag", false);
        setBooleanField(term40566, term40566.getClass(), "irqDisableFlag", false);
        setBooleanField(term40566, term40566.getClass(), "decimalModeFlag", false);
        setBooleanField(term40566, term40566.getClass(), "breakFlag", false);
        setBooleanField(term40566, term40566.getClass(), "overflowFlag", false);
        setLongField(term40566, term40566.getClass(), "stepCounter", 0L);
        setField(term40561, term40561.getClass(), "state", term40566);
        setLongField(term40561, term40561.getClass(), "opBeginTime", -7904053112604879960L);
        setField(term40558, term40558.getClass(), "cpu", term40561);
        setField(term40558, term40558.getClass(), "deviceMap", term40588);
        setField(term40558, term40558.getClass(), "deviceAddressArray", term40593);
        setField(term40543, term40543.getClass(), "bus", term40558);
        setIntField(term40594, term40594.getClass(), "a", 0);
        setIntField(term40594, term40594.getClass(), "x", 0);
        setIntField(term40594, term40594.getClass(), "y", 0);
        setIntField(term40594, term40594.getClass(), "sp", 0);
        setIntField(term40594, term40594.getClass(), "pc", 0);
        setIntField(term40594, term40594.getClass(), "ir", 0);
        setIntField(term40594, term40594.getClass(), "nextIr", 0);
        setField(term40594, term40594.getClass(), "args", term40602);
        setField(term40594, term40594.getClass(), "nextArgs", term40605);
        setIntField(term40594, term40594.getClass(), "instSize", 0);
        setBooleanField(term40594, term40594.getClass(), "opTrap", false);
        setBooleanField(term40594, term40594.getClass(), "irqAsserted", false);
        setBooleanField(term40594, term40594.getClass(), "nmiAsserted", false);
        setIntField(term40594, term40594.getClass(), "lastPc", 0);
        setBooleanField(term40594, term40594.getClass(), "carryFlag", false);
        setBooleanField(term40594, term40594.getClass(), "negativeFlag", false);
        setBooleanField(term40594, term40594.getClass(), "zeroFlag", false);
        setBooleanField(term40594, term40594.getClass(), "irqDisableFlag", false);
        setBooleanField(term40594, term40594.getClass(), "decimalModeFlag", false);
        setBooleanField(term40594, term40594.getClass(), "breakFlag", false);
        setBooleanField(term40594, term40594.getClass(), "overflowFlag", false);
        setLongField(term40594, term40594.getClass(), "stepCounter", 0L);
        setField(term40543, term40543.getClass(), "state", term40594);
        setLongField(term40543, term40543.getClass(), "opBeginTime", -6602460430714339690L);
        setField(term40540, term40540.getClass(), "cpu", term40543);
        setField(term40540, term40540.getClass(), "deviceMap", term40622);
        setField(term40540, term40540.getClass(), "deviceAddressArray", term40627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearNmi", argTypes, term40540, args);
    }

};


