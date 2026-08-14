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

public class MemoryWindow_MemoryTableModel_getColumnClass_11644122016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61582;
     Object term61640;

    public MemoryWindow_MemoryTableModel_getColumnClass_11644122016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61643 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term61642 = ((Class) term61643).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term61642).setAccessible(true);
        Object enum16 = ((Field) term61642).get((Object) null);
        HashMap term61597 = new HashMap();
        HashMap term61631 = new HashMap();
        term61582 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term61583 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61586 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term61591 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61594 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term61602 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term61603 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term61611 = (int[]) newIntArray(2);
        int[] term61614 = (int[]) newIntArray(2);
        Object[] term61636 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term61638 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term61639 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term61583, term61583.getClass(), "startAddress", -1527326823);
        setIntField(term61583, term61583.getClass(), "endAddress", 469871899);
        setLongField(term61586, term61586.getClass(), "clockPeriodInNs", 1000L);
        setField(term61586, term61586.getClass(), "behavior", enum16);
        setIntField(term61591, term61591.getClass(), "startAddress", -1348703436);
        setIntField(term61591, term61591.getClass(), "endAddress", -2027012650);
        setLongField(term61594, term61594.getClass(), "clockPeriodInNs", 1000L);
        setField(term61594, term61594.getClass(), "behavior", enum16);
        setField(term61594, term61594.getClass(), "bus", null);
        setField(term61594, term61594.getClass(), "state", null);
        setLongField(term61594, term61594.getClass(), "opBeginTime", 2135754395358000892L);
        setField(term61591, term61591.getClass(), "cpu", term61594);
        setField(term61591, term61591.getClass(), "deviceMap", term61597);
        setField(term61591, term61591.getClass(), "deviceAddressArray", term61602);
        setField(term61586, term61586.getClass(), "bus", term61591);
        setIntField(term61603, term61603.getClass(), "a", 0);
        setIntField(term61603, term61603.getClass(), "x", 0);
        setIntField(term61603, term61603.getClass(), "y", 0);
        setIntField(term61603, term61603.getClass(), "sp", 0);
        setIntField(term61603, term61603.getClass(), "pc", 0);
        setIntField(term61603, term61603.getClass(), "ir", 0);
        setIntField(term61603, term61603.getClass(), "nextIr", 0);
        setField(term61603, term61603.getClass(), "args", term61611);
        setField(term61603, term61603.getClass(), "nextArgs", term61614);
        setIntField(term61603, term61603.getClass(), "instSize", 0);
        setBooleanField(term61603, term61603.getClass(), "opTrap", false);
        setBooleanField(term61603, term61603.getClass(), "irqAsserted", false);
        setBooleanField(term61603, term61603.getClass(), "nmiAsserted", false);
        setIntField(term61603, term61603.getClass(), "lastPc", 0);
        setBooleanField(term61603, term61603.getClass(), "carryFlag", false);
        setBooleanField(term61603, term61603.getClass(), "negativeFlag", false);
        setBooleanField(term61603, term61603.getClass(), "zeroFlag", false);
        setBooleanField(term61603, term61603.getClass(), "irqDisableFlag", false);
        setBooleanField(term61603, term61603.getClass(), "decimalModeFlag", false);
        setBooleanField(term61603, term61603.getClass(), "breakFlag", false);
        setBooleanField(term61603, term61603.getClass(), "overflowFlag", false);
        setLongField(term61603, term61603.getClass(), "stepCounter", 0L);
        setField(term61586, term61586.getClass(), "state", term61603);
        setLongField(term61586, term61586.getClass(), "opBeginTime", -8085190702504231560L);
        setField(term61583, term61583.getClass(), "cpu", term61586);
        setField(term61583, term61583.getClass(), "deviceMap", term61631);
        setField(term61583, term61583.getClass(), "deviceAddressArray", term61636);
        setField(term61582, term61582.getClass(), "bus", term61583);
        setIntField(term61582, term61582.getClass(), "pageNumber", 1425342686);
        setField(term61638, term61638.getClass(), "listenerList", term61639);
        setField(term61582, term61582.getClass(), "listenerList", term61638);
        term61640 = new Integer(-1042470635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term61640;
        callMethod(klass, "getColumnClass", argTypes, term61582, args);
    }

};


