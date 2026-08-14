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

public class MemoryWindow_MemoryTableModel_getValueAt_19004938308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62264;
     Object term62322;
     Object term62324;

    public MemoryWindow_MemoryTableModel_getValueAt_19004938308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62327 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term62326 = ((Class) term62327).getDeclaredField((String) "CMOS_6502");
        ((Field) term62326).setAccessible(true);
        Object enum18 = ((Field) term62326).get((Object) null);
        HashMap term62279 = new HashMap();
        HashMap term62313 = new HashMap();
        term62264 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term62265 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62268 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term62273 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62276 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term62284 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term62285 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term62293 = (int[]) newIntArray(2);
        int[] term62296 = (int[]) newIntArray(2);
        Object[] term62318 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term62320 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term62321 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term62265, term62265.getClass(), "startAddress", 320739944);
        setIntField(term62265, term62265.getClass(), "endAddress", 760218111);
        setLongField(term62268, term62268.getClass(), "clockPeriodInNs", 1000L);
        setField(term62268, term62268.getClass(), "behavior", enum18);
        setIntField(term62273, term62273.getClass(), "startAddress", -1986366126);
        setIntField(term62273, term62273.getClass(), "endAddress", -1963228619);
        setLongField(term62276, term62276.getClass(), "clockPeriodInNs", 1000L);
        setField(term62276, term62276.getClass(), "behavior", enum18);
        setField(term62276, term62276.getClass(), "bus", null);
        setField(term62276, term62276.getClass(), "state", null);
        setLongField(term62276, term62276.getClass(), "opBeginTime", 1368340889161782793L);
        setField(term62273, term62273.getClass(), "cpu", term62276);
        setField(term62273, term62273.getClass(), "deviceMap", term62279);
        setField(term62273, term62273.getClass(), "deviceAddressArray", term62284);
        setField(term62268, term62268.getClass(), "bus", term62273);
        setIntField(term62285, term62285.getClass(), "a", 0);
        setIntField(term62285, term62285.getClass(), "x", 0);
        setIntField(term62285, term62285.getClass(), "y", 0);
        setIntField(term62285, term62285.getClass(), "sp", 0);
        setIntField(term62285, term62285.getClass(), "pc", 0);
        setIntField(term62285, term62285.getClass(), "ir", 0);
        setIntField(term62285, term62285.getClass(), "nextIr", 0);
        setField(term62285, term62285.getClass(), "args", term62293);
        setField(term62285, term62285.getClass(), "nextArgs", term62296);
        setIntField(term62285, term62285.getClass(), "instSize", 0);
        setBooleanField(term62285, term62285.getClass(), "opTrap", false);
        setBooleanField(term62285, term62285.getClass(), "irqAsserted", false);
        setBooleanField(term62285, term62285.getClass(), "nmiAsserted", false);
        setIntField(term62285, term62285.getClass(), "lastPc", 0);
        setBooleanField(term62285, term62285.getClass(), "carryFlag", false);
        setBooleanField(term62285, term62285.getClass(), "negativeFlag", false);
        setBooleanField(term62285, term62285.getClass(), "zeroFlag", false);
        setBooleanField(term62285, term62285.getClass(), "irqDisableFlag", false);
        setBooleanField(term62285, term62285.getClass(), "decimalModeFlag", false);
        setBooleanField(term62285, term62285.getClass(), "breakFlag", false);
        setBooleanField(term62285, term62285.getClass(), "overflowFlag", false);
        setLongField(term62285, term62285.getClass(), "stepCounter", 0L);
        setField(term62268, term62268.getClass(), "state", term62285);
        setLongField(term62268, term62268.getClass(), "opBeginTime", -5786861555969446503L);
        setField(term62265, term62265.getClass(), "cpu", term62268);
        setField(term62265, term62265.getClass(), "deviceMap", term62313);
        setField(term62265, term62265.getClass(), "deviceAddressArray", term62318);
        setField(term62264, term62264.getClass(), "bus", term62265);
        setIntField(term62264, term62264.getClass(), "pageNumber", 81427089);
        setField(term62320, term62320.getClass(), "listenerList", term62321);
        setField(term62264, term62264.getClass(), "listenerList", term62320);
        term62322 = new Integer(755951489);
        term62324 = new Integer(1175146356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term62322;
        args[1] = term62324;
        callMethod(klass, "getValueAt", argTypes, term62264, args);
    }

};


