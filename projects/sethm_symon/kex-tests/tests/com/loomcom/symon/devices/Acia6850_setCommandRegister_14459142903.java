package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Acia6850_setCommandRegister_14459142903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10611;
     Object term10716;

    public Acia6850_setCommandRegister_14459142903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10729 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term10728 = ((Class) term10729).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term10728).setAccessible(true);
        Object enum23 = ((Field) term10728).get((Object) null);
        HashMap term10667 = new HashMap();
        HashMap term10701 = new HashMap();
        HashMap term10708 = new HashMap();
        Set<Object> term11020 =  ((Map) term10708).keySet();
        HashSet term10707 = new HashSet((Collection<? extends Object>) term11020);
        term10611 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        Object term10638 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term10653 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term10656 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term10661 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term10664 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term10672 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term10673 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term10681 = (int[]) newIntArray(2);
        int[] term10684 = (int[]) newIntArray(2);
        Object[] term10706 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setField(term10611, term10611.getClass(), "name", "GzFkzHGYFt");
        setIntField(term10611, term10611.getClass(), "baseAddress", 1092038167);
        setBooleanField(term10611, term10611.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term10611, term10611.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term10611, term10611.getClass(), "overrun", false);
        setBooleanField(term10611, term10611.getClass(), "interrupt", false);
        setLongField(term10611, term10611.getClass(), "lastTxWrite", 855932984568615096L);
        setLongField(term10611, term10611.getClass(), "lastRxRead", -1616722610139554082L);
        setIntField(term10611, term10611.getClass(), "baudRate", 1879729823);
        setLongField(term10611, term10611.getClass(), "baudRateDelay", 7495904023107549024L);
        setIntField(term10611, term10611.getClass(), "rxChar", 1443855558);
        setIntField(term10611, term10611.getClass(), "txChar", -1933419449);
        setBooleanField(term10611, term10611.getClass(), "rxFull", true);
        setBooleanField(term10611, term10611.getClass(), "txEmpty", true);
        setIntField(term10611, term10611.getClass(), "size", -1804322375);
        setIntField(term10638, term10638.getClass(), "startAddress", 1595814906);
        setIntField(term10638, term10638.getClass(), "endAddress", -834193529);
        setField(term10611, term10611.getClass(), "memoryRange", term10638);
        setIntField(term10653, term10653.getClass(), "startAddress", 335780735);
        setIntField(term10653, term10653.getClass(), "endAddress", -1541981599);
        setLongField(term10656, term10656.getClass(), "clockPeriodInNs", 1000L);
        setField(term10656, term10656.getClass(), "behavior", enum23);
        setIntField(term10661, term10661.getClass(), "startAddress", 1605456363);
        setIntField(term10661, term10661.getClass(), "endAddress", 2059896693);
        setLongField(term10664, term10664.getClass(), "clockPeriodInNs", 1000L);
        setField(term10664, term10664.getClass(), "behavior", enum23);
        setField(term10664, term10664.getClass(), "bus", null);
        setField(term10664, term10664.getClass(), "state", null);
        setLongField(term10664, term10664.getClass(), "opBeginTime", 4513004407927379358L);
        setField(term10661, term10661.getClass(), "cpu", term10664);
        setField(term10661, term10661.getClass(), "deviceMap", term10667);
        setField(term10661, term10661.getClass(), "deviceAddressArray", term10672);
        setField(term10656, term10656.getClass(), "bus", term10661);
        setIntField(term10673, term10673.getClass(), "a", 0);
        setIntField(term10673, term10673.getClass(), "x", 0);
        setIntField(term10673, term10673.getClass(), "y", 0);
        setIntField(term10673, term10673.getClass(), "sp", 0);
        setIntField(term10673, term10673.getClass(), "pc", 0);
        setIntField(term10673, term10673.getClass(), "ir", 0);
        setIntField(term10673, term10673.getClass(), "nextIr", 0);
        setField(term10673, term10673.getClass(), "args", term10681);
        setField(term10673, term10673.getClass(), "nextArgs", term10684);
        setIntField(term10673, term10673.getClass(), "instSize", 0);
        setBooleanField(term10673, term10673.getClass(), "opTrap", false);
        setBooleanField(term10673, term10673.getClass(), "irqAsserted", false);
        setBooleanField(term10673, term10673.getClass(), "nmiAsserted", false);
        setIntField(term10673, term10673.getClass(), "lastPc", 0);
        setBooleanField(term10673, term10673.getClass(), "carryFlag", false);
        setBooleanField(term10673, term10673.getClass(), "negativeFlag", false);
        setBooleanField(term10673, term10673.getClass(), "zeroFlag", false);
        setBooleanField(term10673, term10673.getClass(), "irqDisableFlag", false);
        setBooleanField(term10673, term10673.getClass(), "decimalModeFlag", false);
        setBooleanField(term10673, term10673.getClass(), "breakFlag", false);
        setBooleanField(term10673, term10673.getClass(), "overflowFlag", false);
        setLongField(term10673, term10673.getClass(), "stepCounter", 0L);
        setField(term10656, term10656.getClass(), "state", term10673);
        setLongField(term10656, term10656.getClass(), "opBeginTime", -7115418542247301000L);
        setField(term10653, term10653.getClass(), "cpu", term10656);
        setField(term10653, term10653.getClass(), "deviceMap", term10701);
        setField(term10653, term10653.getClass(), "deviceAddressArray", term10706);
        setField(term10611, term10611.getClass(), "bus", term10653);
        setField(term10611, term10611.getClass(), "deviceChangeListeners", term10707);
        term10716 = new Integer(-2093862988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10716;
        callMethod(klass, "setCommandRegister", argTypes, term10611, args);
    }

};


