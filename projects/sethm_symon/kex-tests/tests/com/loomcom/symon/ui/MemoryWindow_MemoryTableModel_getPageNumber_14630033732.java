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

public class MemoryWindow_MemoryTableModel_getPageNumber_14630033732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60249;

    public MemoryWindow_MemoryTableModel_getPageNumber_14630033732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60308 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term60307 = ((Class) term60308).getDeclaredField((String) "CMOS_65816");
        ((Field) term60307).setAccessible(true);
        Object enum12 = ((Field) term60307).get((Object) null);
        HashMap term60264 = new HashMap();
        HashMap term60298 = new HashMap();
        term60249 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term60250 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60253 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term60258 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term60261 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term60269 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term60270 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term60278 = (int[]) newIntArray(2);
        int[] term60281 = (int[]) newIntArray(2);
        Object[] term60303 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term60305 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term60306 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term60250, term60250.getClass(), "startAddress", -1374527319);
        setIntField(term60250, term60250.getClass(), "endAddress", -1735276919);
        setLongField(term60253, term60253.getClass(), "clockPeriodInNs", 1000L);
        setField(term60253, term60253.getClass(), "behavior", enum12);
        setIntField(term60258, term60258.getClass(), "startAddress", -712023865);
        setIntField(term60258, term60258.getClass(), "endAddress", 613256157);
        setLongField(term60261, term60261.getClass(), "clockPeriodInNs", 1000L);
        setField(term60261, term60261.getClass(), "behavior", enum12);
        setField(term60261, term60261.getClass(), "bus", null);
        setField(term60261, term60261.getClass(), "state", null);
        setLongField(term60261, term60261.getClass(), "opBeginTime", 5510783420697225605L);
        setField(term60258, term60258.getClass(), "cpu", term60261);
        setField(term60258, term60258.getClass(), "deviceMap", term60264);
        setField(term60258, term60258.getClass(), "deviceAddressArray", term60269);
        setField(term60253, term60253.getClass(), "bus", term60258);
        setIntField(term60270, term60270.getClass(), "a", 0);
        setIntField(term60270, term60270.getClass(), "x", 0);
        setIntField(term60270, term60270.getClass(), "y", 0);
        setIntField(term60270, term60270.getClass(), "sp", 0);
        setIntField(term60270, term60270.getClass(), "pc", 0);
        setIntField(term60270, term60270.getClass(), "ir", 0);
        setIntField(term60270, term60270.getClass(), "nextIr", 0);
        setField(term60270, term60270.getClass(), "args", term60278);
        setField(term60270, term60270.getClass(), "nextArgs", term60281);
        setIntField(term60270, term60270.getClass(), "instSize", 0);
        setBooleanField(term60270, term60270.getClass(), "opTrap", false);
        setBooleanField(term60270, term60270.getClass(), "irqAsserted", false);
        setBooleanField(term60270, term60270.getClass(), "nmiAsserted", false);
        setIntField(term60270, term60270.getClass(), "lastPc", 0);
        setBooleanField(term60270, term60270.getClass(), "carryFlag", false);
        setBooleanField(term60270, term60270.getClass(), "negativeFlag", false);
        setBooleanField(term60270, term60270.getClass(), "zeroFlag", false);
        setBooleanField(term60270, term60270.getClass(), "irqDisableFlag", false);
        setBooleanField(term60270, term60270.getClass(), "decimalModeFlag", false);
        setBooleanField(term60270, term60270.getClass(), "breakFlag", false);
        setBooleanField(term60270, term60270.getClass(), "overflowFlag", false);
        setLongField(term60270, term60270.getClass(), "stepCounter", 0L);
        setField(term60253, term60253.getClass(), "state", term60270);
        setLongField(term60253, term60253.getClass(), "opBeginTime", 6005241913654469005L);
        setField(term60250, term60250.getClass(), "cpu", term60253);
        setField(term60250, term60250.getClass(), "deviceMap", term60298);
        setField(term60250, term60250.getClass(), "deviceAddressArray", term60303);
        setField(term60249, term60249.getClass(), "bus", term60250);
        setIntField(term60249, term60249.getClass(), "pageNumber", 890505372);
        setField(term60305, term60305.getClass(), "listenerList", term60306);
        setField(term60249, term60249.getClass(), "listenerList", term60305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageNumber", argTypes, term60249, args);
    }

};


