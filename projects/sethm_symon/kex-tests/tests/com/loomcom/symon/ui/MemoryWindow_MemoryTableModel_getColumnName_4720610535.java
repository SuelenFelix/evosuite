package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class MemoryWindow_MemoryTableModel_getColumnName_4720610535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61254;
     Object term61312;

    public MemoryWindow_MemoryTableModel_getColumnName_4720610535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61315 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term61314 = ((Class) term61315).getDeclaredField((String) "NMOS_6502");
        ((Field) term61314).setAccessible(true);
        Object enum15 = ((Field) term61314).get((Object) null);
        HashMap term61269 = new HashMap();
        HashMap term61303 = new HashMap();
        term61254 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term61255 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61258 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term61263 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61266 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term61274 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term61275 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term61283 = (int[]) newIntArray(2);
        int[] term61286 = (int[]) newIntArray(2);
        Object[] term61308 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term61310 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term61311 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term61255, term61255.getClass(), "startAddress", -1377876610);
        setIntField(term61255, term61255.getClass(), "endAddress", -1456184732);
        setLongField(term61258, term61258.getClass(), "clockPeriodInNs", 1000L);
        setField(term61258, term61258.getClass(), "behavior", enum15);
        setIntField(term61263, term61263.getClass(), "startAddress", 1689228897);
        setIntField(term61263, term61263.getClass(), "endAddress", 892205855);
        setLongField(term61266, term61266.getClass(), "clockPeriodInNs", 1000L);
        setField(term61266, term61266.getClass(), "behavior", enum15);
        setField(term61266, term61266.getClass(), "bus", null);
        setField(term61266, term61266.getClass(), "state", null);
        setLongField(term61266, term61266.getClass(), "opBeginTime", -2177368829816872572L);
        setField(term61263, term61263.getClass(), "cpu", term61266);
        setField(term61263, term61263.getClass(), "deviceMap", term61269);
        setField(term61263, term61263.getClass(), "deviceAddressArray", term61274);
        setField(term61258, term61258.getClass(), "bus", term61263);
        setIntField(term61275, term61275.getClass(), "a", 0);
        setIntField(term61275, term61275.getClass(), "x", 0);
        setIntField(term61275, term61275.getClass(), "y", 0);
        setIntField(term61275, term61275.getClass(), "sp", 0);
        setIntField(term61275, term61275.getClass(), "pc", 0);
        setIntField(term61275, term61275.getClass(), "ir", 0);
        setIntField(term61275, term61275.getClass(), "nextIr", 0);
        setField(term61275, term61275.getClass(), "args", term61283);
        setField(term61275, term61275.getClass(), "nextArgs", term61286);
        setIntField(term61275, term61275.getClass(), "instSize", 0);
        setBooleanField(term61275, term61275.getClass(), "opTrap", false);
        setBooleanField(term61275, term61275.getClass(), "irqAsserted", false);
        setBooleanField(term61275, term61275.getClass(), "nmiAsserted", false);
        setIntField(term61275, term61275.getClass(), "lastPc", 0);
        setBooleanField(term61275, term61275.getClass(), "carryFlag", false);
        setBooleanField(term61275, term61275.getClass(), "negativeFlag", false);
        setBooleanField(term61275, term61275.getClass(), "zeroFlag", false);
        setBooleanField(term61275, term61275.getClass(), "irqDisableFlag", false);
        setBooleanField(term61275, term61275.getClass(), "decimalModeFlag", false);
        setBooleanField(term61275, term61275.getClass(), "breakFlag", false);
        setBooleanField(term61275, term61275.getClass(), "overflowFlag", false);
        setLongField(term61275, term61275.getClass(), "stepCounter", 0L);
        setField(term61258, term61258.getClass(), "state", term61275);
        setLongField(term61258, term61258.getClass(), "opBeginTime", -8463029266761149071L);
        setField(term61255, term61255.getClass(), "cpu", term61258);
        setField(term61255, term61255.getClass(), "deviceMap", term61303);
        setField(term61255, term61255.getClass(), "deviceAddressArray", term61308);
        setField(term61254, term61254.getClass(), "bus", term61255);
        setIntField(term61254, term61254.getClass(), "pageNumber", -1641507499);
        setField(term61310, term61310.getClass(), "listenerList", term61311);
        setField(term61254, term61254.getClass(), "listenerList", term61310);
        term61312 = new Integer(-33436796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term61312;
        callMethod(klass, "getColumnName", argTypes, term61254, args);
    }

};


