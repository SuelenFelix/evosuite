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

public class MemoryWindow_MemoryTableModel_getRowCount_1699199843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60578;

    public MemoryWindow_MemoryTableModel_getRowCount_1699199843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60637 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term60636 = ((Class) term60637).getDeclaredField((String) "CMOS_6502");
        ((Field) term60636).setAccessible(true);
        Object enum13 = ((Field) term60636).get((Object) null);
        HashMap term60593 = new HashMap();
        HashMap term60627 = new HashMap();
        term60578 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term60579 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60582 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term60587 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60590 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term60598 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term60599 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term60607 = (int[]) newIntArray(2);
        int[] term60610 = (int[]) newIntArray(2);
        Object[] term60632 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term60634 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term60635 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term60579, term60579.getClass(), "startAddress", 2044137055);
        setIntField(term60579, term60579.getClass(), "endAddress", -1452324619);
        setLongField(term60582, term60582.getClass(), "clockPeriodInNs", 1000L);
        setField(term60582, term60582.getClass(), "behavior", enum13);
        setIntField(term60587, term60587.getClass(), "startAddress", -1121709274);
        setIntField(term60587, term60587.getClass(), "endAddress", -532304223);
        setLongField(term60590, term60590.getClass(), "clockPeriodInNs", 1000L);
        setField(term60590, term60590.getClass(), "behavior", enum13);
        setField(term60590, term60590.getClass(), "bus", null);
        setField(term60590, term60590.getClass(), "state", null);
        setLongField(term60590, term60590.getClass(), "opBeginTime", -8652538484981166496L);
        setField(term60587, term60587.getClass(), "cpu", term60590);
        setField(term60587, term60587.getClass(), "deviceMap", term60593);
        setField(term60587, term60587.getClass(), "deviceAddressArray", term60598);
        setField(term60582, term60582.getClass(), "bus", term60587);
        setIntField(term60599, term60599.getClass(), "a", 0);
        setIntField(term60599, term60599.getClass(), "x", 0);
        setIntField(term60599, term60599.getClass(), "y", 0);
        setIntField(term60599, term60599.getClass(), "sp", 0);
        setIntField(term60599, term60599.getClass(), "pc", 0);
        setIntField(term60599, term60599.getClass(), "ir", 0);
        setIntField(term60599, term60599.getClass(), "nextIr", 0);
        setField(term60599, term60599.getClass(), "args", term60607);
        setField(term60599, term60599.getClass(), "nextArgs", term60610);
        setIntField(term60599, term60599.getClass(), "instSize", 0);
        setBooleanField(term60599, term60599.getClass(), "opTrap", false);
        setBooleanField(term60599, term60599.getClass(), "irqAsserted", false);
        setBooleanField(term60599, term60599.getClass(), "nmiAsserted", false);
        setIntField(term60599, term60599.getClass(), "lastPc", 0);
        setBooleanField(term60599, term60599.getClass(), "carryFlag", false);
        setBooleanField(term60599, term60599.getClass(), "negativeFlag", false);
        setBooleanField(term60599, term60599.getClass(), "zeroFlag", false);
        setBooleanField(term60599, term60599.getClass(), "irqDisableFlag", false);
        setBooleanField(term60599, term60599.getClass(), "decimalModeFlag", false);
        setBooleanField(term60599, term60599.getClass(), "breakFlag", false);
        setBooleanField(term60599, term60599.getClass(), "overflowFlag", false);
        setLongField(term60599, term60599.getClass(), "stepCounter", 0L);
        setField(term60582, term60582.getClass(), "state", term60599);
        setLongField(term60582, term60582.getClass(), "opBeginTime", 2701184207686293431L);
        setField(term60579, term60579.getClass(), "cpu", term60582);
        setField(term60579, term60579.getClass(), "deviceMap", term60627);
        setField(term60579, term60579.getClass(), "deviceAddressArray", term60632);
        setField(term60578, term60578.getClass(), "bus", term60579);
        setIntField(term60578, term60578.getClass(), "pageNumber", 1902784843);
        setField(term60634, term60634.getClass(), "listenerList", term60635);
        setField(term60578, term60578.getClass(), "listenerList", term60634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowCount", argTypes, term60578, args);
    }

};


