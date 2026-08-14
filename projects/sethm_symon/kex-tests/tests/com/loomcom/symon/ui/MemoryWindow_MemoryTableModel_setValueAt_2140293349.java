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

public class MemoryWindow_MemoryTableModel_setValueAt_2140293349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62594;
     Object term62652;
     Object term62653;
     Object term62655;

    public MemoryWindow_MemoryTableModel_setValueAt_2140293349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62658 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term62657 = ((Class) term62658).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term62657).setAccessible(true);
        Object enum19 = ((Field) term62657).get((Object) null);
        HashMap term62609 = new HashMap();
        HashMap term62643 = new HashMap();
        term62594 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term62595 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62598 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term62603 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62606 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term62614 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term62615 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term62623 = (int[]) newIntArray(2);
        int[] term62626 = (int[]) newIntArray(2);
        Object[] term62648 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term62650 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term62651 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term62595, term62595.getClass(), "startAddress", -2137419728);
        setIntField(term62595, term62595.getClass(), "endAddress", 1558810715);
        setLongField(term62598, term62598.getClass(), "clockPeriodInNs", 1000L);
        setField(term62598, term62598.getClass(), "behavior", enum19);
        setIntField(term62603, term62603.getClass(), "startAddress", -382652403);
        setIntField(term62603, term62603.getClass(), "endAddress", -2126539433);
        setLongField(term62606, term62606.getClass(), "clockPeriodInNs", 1000L);
        setField(term62606, term62606.getClass(), "behavior", enum19);
        setField(term62606, term62606.getClass(), "bus", null);
        setField(term62606, term62606.getClass(), "state", null);
        setLongField(term62606, term62606.getClass(), "opBeginTime", -3936701866695933852L);
        setField(term62603, term62603.getClass(), "cpu", term62606);
        setField(term62603, term62603.getClass(), "deviceMap", term62609);
        setField(term62603, term62603.getClass(), "deviceAddressArray", term62614);
        setField(term62598, term62598.getClass(), "bus", term62603);
        setIntField(term62615, term62615.getClass(), "a", 0);
        setIntField(term62615, term62615.getClass(), "x", 0);
        setIntField(term62615, term62615.getClass(), "y", 0);
        setIntField(term62615, term62615.getClass(), "sp", 0);
        setIntField(term62615, term62615.getClass(), "pc", 0);
        setIntField(term62615, term62615.getClass(), "ir", 0);
        setIntField(term62615, term62615.getClass(), "nextIr", 0);
        setField(term62615, term62615.getClass(), "args", term62623);
        setField(term62615, term62615.getClass(), "nextArgs", term62626);
        setIntField(term62615, term62615.getClass(), "instSize", 0);
        setBooleanField(term62615, term62615.getClass(), "opTrap", false);
        setBooleanField(term62615, term62615.getClass(), "irqAsserted", false);
        setBooleanField(term62615, term62615.getClass(), "nmiAsserted", false);
        setIntField(term62615, term62615.getClass(), "lastPc", 0);
        setBooleanField(term62615, term62615.getClass(), "carryFlag", false);
        setBooleanField(term62615, term62615.getClass(), "negativeFlag", false);
        setBooleanField(term62615, term62615.getClass(), "zeroFlag", false);
        setBooleanField(term62615, term62615.getClass(), "irqDisableFlag", false);
        setBooleanField(term62615, term62615.getClass(), "decimalModeFlag", false);
        setBooleanField(term62615, term62615.getClass(), "breakFlag", false);
        setBooleanField(term62615, term62615.getClass(), "overflowFlag", false);
        setLongField(term62615, term62615.getClass(), "stepCounter", 0L);
        setField(term62598, term62598.getClass(), "state", term62615);
        setLongField(term62598, term62598.getClass(), "opBeginTime", 1215116475929634177L);
        setField(term62595, term62595.getClass(), "cpu", term62598);
        setField(term62595, term62595.getClass(), "deviceMap", term62643);
        setField(term62595, term62595.getClass(), "deviceAddressArray", term62648);
        setField(term62594, term62594.getClass(), "bus", term62595);
        setIntField(term62594, term62594.getClass(), "pageNumber", -1541297110);
        setField(term62650, term62650.getClass(), "listenerList", term62651);
        setField(term62594, term62594.getClass(), "listenerList", term62650);
        term62652 = newInstance(Class.forName("java.lang.Object"));
        term62653 = new Integer(-1581464804);
        term62655 = new Integer(-1954937310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term62652;
        args[1] = term62653;
        args[2] = term62655;
        callMethod(klass, "setValueAt", argTypes, term62594, args);
    }

};


