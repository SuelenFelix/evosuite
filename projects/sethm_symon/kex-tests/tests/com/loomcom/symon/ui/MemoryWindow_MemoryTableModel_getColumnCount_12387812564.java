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

public class MemoryWindow_MemoryTableModel_getColumnCount_12387812564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60904;

    public MemoryWindow_MemoryTableModel_getColumnCount_12387812564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60963 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term60962 = ((Class) term60963).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term60962).setAccessible(true);
        Object enum14 = ((Field) term60962).get((Object) null);
        HashMap term60919 = new HashMap();
        HashMap term60953 = new HashMap();
        term60904 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term60905 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60908 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term60913 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60916 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term60924 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term60925 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term60933 = (int[]) newIntArray(2);
        int[] term60936 = (int[]) newIntArray(2);
        Object[] term60958 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term60960 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term60961 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term60905, term60905.getClass(), "startAddress", 2021136615);
        setIntField(term60905, term60905.getClass(), "endAddress", 1778570695);
        setLongField(term60908, term60908.getClass(), "clockPeriodInNs", 1000L);
        setField(term60908, term60908.getClass(), "behavior", enum14);
        setIntField(term60913, term60913.getClass(), "startAddress", -1142164411);
        setIntField(term60913, term60913.getClass(), "endAddress", -1619435313);
        setLongField(term60916, term60916.getClass(), "clockPeriodInNs", 1000L);
        setField(term60916, term60916.getClass(), "behavior", enum14);
        setField(term60916, term60916.getClass(), "bus", null);
        setField(term60916, term60916.getClass(), "state", null);
        setLongField(term60916, term60916.getClass(), "opBeginTime", -8876856890348836498L);
        setField(term60913, term60913.getClass(), "cpu", term60916);
        setField(term60913, term60913.getClass(), "deviceMap", term60919);
        setField(term60913, term60913.getClass(), "deviceAddressArray", term60924);
        setField(term60908, term60908.getClass(), "bus", term60913);
        setIntField(term60925, term60925.getClass(), "a", 0);
        setIntField(term60925, term60925.getClass(), "x", 0);
        setIntField(term60925, term60925.getClass(), "y", 0);
        setIntField(term60925, term60925.getClass(), "sp", 0);
        setIntField(term60925, term60925.getClass(), "pc", 0);
        setIntField(term60925, term60925.getClass(), "ir", 0);
        setIntField(term60925, term60925.getClass(), "nextIr", 0);
        setField(term60925, term60925.getClass(), "args", term60933);
        setField(term60925, term60925.getClass(), "nextArgs", term60936);
        setIntField(term60925, term60925.getClass(), "instSize", 0);
        setBooleanField(term60925, term60925.getClass(), "opTrap", false);
        setBooleanField(term60925, term60925.getClass(), "irqAsserted", false);
        setBooleanField(term60925, term60925.getClass(), "nmiAsserted", false);
        setIntField(term60925, term60925.getClass(), "lastPc", 0);
        setBooleanField(term60925, term60925.getClass(), "carryFlag", false);
        setBooleanField(term60925, term60925.getClass(), "negativeFlag", false);
        setBooleanField(term60925, term60925.getClass(), "zeroFlag", false);
        setBooleanField(term60925, term60925.getClass(), "irqDisableFlag", false);
        setBooleanField(term60925, term60925.getClass(), "decimalModeFlag", false);
        setBooleanField(term60925, term60925.getClass(), "breakFlag", false);
        setBooleanField(term60925, term60925.getClass(), "overflowFlag", false);
        setLongField(term60925, term60925.getClass(), "stepCounter", 0L);
        setField(term60908, term60908.getClass(), "state", term60925);
        setLongField(term60908, term60908.getClass(), "opBeginTime", 846579494941632714L);
        setField(term60905, term60905.getClass(), "cpu", term60908);
        setField(term60905, term60905.getClass(), "deviceMap", term60953);
        setField(term60905, term60905.getClass(), "deviceAddressArray", term60958);
        setField(term60904, term60904.getClass(), "bus", term60905);
        setIntField(term60904, term60904.getClass(), "pageNumber", -1062304878);
        setField(term60960, term60960.getClass(), "listenerList", term60961);
        setField(term60904, term60904.getClass(), "listenerList", term60960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumnCount", argTypes, term60904, args);
    }

};


