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

public class MemoryWindow_MemoryTableModel_isCellEditable_12985795097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61934;
     Object term61992;
     Object term61994;

    public MemoryWindow_MemoryTableModel_isCellEditable_12985795097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61997 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term61996 = ((Class) term61997).getDeclaredField((String) "CMOS_6502");
        ((Field) term61996).setAccessible(true);
        Object enum17 = ((Field) term61996).get((Object) null);
        HashMap term61949 = new HashMap();
        HashMap term61983 = new HashMap();
        term61934 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term61935 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61938 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term61943 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term61946 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term61954 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term61955 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term61963 = (int[]) newIntArray(2);
        int[] term61966 = (int[]) newIntArray(2);
        Object[] term61988 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term61990 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term61991 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term61935, term61935.getClass(), "startAddress", -524352937);
        setIntField(term61935, term61935.getClass(), "endAddress", 1472218987);
        setLongField(term61938, term61938.getClass(), "clockPeriodInNs", 1000L);
        setField(term61938, term61938.getClass(), "behavior", enum17);
        setIntField(term61943, term61943.getClass(), "startAddress", 805176809);
        setIntField(term61943, term61943.getClass(), "endAddress", -82632953);
        setLongField(term61946, term61946.getClass(), "clockPeriodInNs", 1000L);
        setField(term61946, term61946.getClass(), "behavior", enum17);
        setField(term61946, term61946.getClass(), "bus", null);
        setField(term61946, term61946.getClass(), "state", null);
        setLongField(term61946, term61946.getClass(), "opBeginTime", -5216789073301458893L);
        setField(term61943, term61943.getClass(), "cpu", term61946);
        setField(term61943, term61943.getClass(), "deviceMap", term61949);
        setField(term61943, term61943.getClass(), "deviceAddressArray", term61954);
        setField(term61938, term61938.getClass(), "bus", term61943);
        setIntField(term61955, term61955.getClass(), "a", 0);
        setIntField(term61955, term61955.getClass(), "x", 0);
        setIntField(term61955, term61955.getClass(), "y", 0);
        setIntField(term61955, term61955.getClass(), "sp", 0);
        setIntField(term61955, term61955.getClass(), "pc", 0);
        setIntField(term61955, term61955.getClass(), "ir", 0);
        setIntField(term61955, term61955.getClass(), "nextIr", 0);
        setField(term61955, term61955.getClass(), "args", term61963);
        setField(term61955, term61955.getClass(), "nextArgs", term61966);
        setIntField(term61955, term61955.getClass(), "instSize", 0);
        setBooleanField(term61955, term61955.getClass(), "opTrap", false);
        setBooleanField(term61955, term61955.getClass(), "irqAsserted", false);
        setBooleanField(term61955, term61955.getClass(), "nmiAsserted", false);
        setIntField(term61955, term61955.getClass(), "lastPc", 0);
        setBooleanField(term61955, term61955.getClass(), "carryFlag", false);
        setBooleanField(term61955, term61955.getClass(), "negativeFlag", false);
        setBooleanField(term61955, term61955.getClass(), "zeroFlag", false);
        setBooleanField(term61955, term61955.getClass(), "irqDisableFlag", false);
        setBooleanField(term61955, term61955.getClass(), "decimalModeFlag", false);
        setBooleanField(term61955, term61955.getClass(), "breakFlag", false);
        setBooleanField(term61955, term61955.getClass(), "overflowFlag", false);
        setLongField(term61955, term61955.getClass(), "stepCounter", 0L);
        setField(term61938, term61938.getClass(), "state", term61955);
        setLongField(term61938, term61938.getClass(), "opBeginTime", -1832940336320585644L);
        setField(term61935, term61935.getClass(), "cpu", term61938);
        setField(term61935, term61935.getClass(), "deviceMap", term61983);
        setField(term61935, term61935.getClass(), "deviceAddressArray", term61988);
        setField(term61934, term61934.getClass(), "bus", term61935);
        setIntField(term61934, term61934.getClass(), "pageNumber", 692873905);
        setField(term61990, term61990.getClass(), "listenerList", term61991);
        setField(term61934, term61934.getClass(), "listenerList", term61990);
        term61992 = new Integer(1734759369);
        term61994 = new Integer(1841493736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term61992;
        args[1] = term61994;
        callMethod(klass, "isCellEditable", argTypes, term61934, args);
    }

};


