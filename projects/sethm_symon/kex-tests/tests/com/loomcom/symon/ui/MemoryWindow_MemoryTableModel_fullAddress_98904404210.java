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

public class MemoryWindow_MemoryTableModel_fullAddress_98904404210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62949;
     Object term63007;
     Object term63009;

    public MemoryWindow_MemoryTableModel_fullAddress_98904404210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63012 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term63011 = ((Class) term63012).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term63011).setAccessible(true);
        Object enum20 = ((Field) term63011).get((Object) null);
        HashMap term62964 = new HashMap();
        HashMap term62998 = new HashMap();
        term62949 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term62950 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62953 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term62958 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term62961 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term62969 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term62970 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term62978 = (int[]) newIntArray(2);
        int[] term62981 = (int[]) newIntArray(2);
        Object[] term63003 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term63005 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term63006 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term62950, term62950.getClass(), "startAddress", -460657407);
        setIntField(term62950, term62950.getClass(), "endAddress", 941003590);
        setLongField(term62953, term62953.getClass(), "clockPeriodInNs", 1000L);
        setField(term62953, term62953.getClass(), "behavior", enum20);
        setIntField(term62958, term62958.getClass(), "startAddress", -1825624890);
        setIntField(term62958, term62958.getClass(), "endAddress", 413214164);
        setLongField(term62961, term62961.getClass(), "clockPeriodInNs", 1000L);
        setField(term62961, term62961.getClass(), "behavior", enum20);
        setField(term62961, term62961.getClass(), "bus", null);
        setField(term62961, term62961.getClass(), "state", null);
        setLongField(term62961, term62961.getClass(), "opBeginTime", -6950146046121430355L);
        setField(term62958, term62958.getClass(), "cpu", term62961);
        setField(term62958, term62958.getClass(), "deviceMap", term62964);
        setField(term62958, term62958.getClass(), "deviceAddressArray", term62969);
        setField(term62953, term62953.getClass(), "bus", term62958);
        setIntField(term62970, term62970.getClass(), "a", 0);
        setIntField(term62970, term62970.getClass(), "x", 0);
        setIntField(term62970, term62970.getClass(), "y", 0);
        setIntField(term62970, term62970.getClass(), "sp", 0);
        setIntField(term62970, term62970.getClass(), "pc", 0);
        setIntField(term62970, term62970.getClass(), "ir", 0);
        setIntField(term62970, term62970.getClass(), "nextIr", 0);
        setField(term62970, term62970.getClass(), "args", term62978);
        setField(term62970, term62970.getClass(), "nextArgs", term62981);
        setIntField(term62970, term62970.getClass(), "instSize", 0);
        setBooleanField(term62970, term62970.getClass(), "opTrap", false);
        setBooleanField(term62970, term62970.getClass(), "irqAsserted", false);
        setBooleanField(term62970, term62970.getClass(), "nmiAsserted", false);
        setIntField(term62970, term62970.getClass(), "lastPc", 0);
        setBooleanField(term62970, term62970.getClass(), "carryFlag", false);
        setBooleanField(term62970, term62970.getClass(), "negativeFlag", false);
        setBooleanField(term62970, term62970.getClass(), "zeroFlag", false);
        setBooleanField(term62970, term62970.getClass(), "irqDisableFlag", false);
        setBooleanField(term62970, term62970.getClass(), "decimalModeFlag", false);
        setBooleanField(term62970, term62970.getClass(), "breakFlag", false);
        setBooleanField(term62970, term62970.getClass(), "overflowFlag", false);
        setLongField(term62970, term62970.getClass(), "stepCounter", 0L);
        setField(term62953, term62953.getClass(), "state", term62970);
        setLongField(term62953, term62953.getClass(), "opBeginTime", 1667122142089513324L);
        setField(term62950, term62950.getClass(), "cpu", term62953);
        setField(term62950, term62950.getClass(), "deviceMap", term62998);
        setField(term62950, term62950.getClass(), "deviceAddressArray", term63003);
        setField(term62949, term62949.getClass(), "bus", term62950);
        setIntField(term62949, term62949.getClass(), "pageNumber", -963198667);
        setField(term63005, term63005.getClass(), "listenerList", term63006);
        setField(term62949, term62949.getClass(), "listenerList", term63005);
        term63007 = new Integer(-1007935918);
        term63009 = new Integer(1485731037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term63007;
        args[1] = term63009;
        callMethod(klass, "fullAddress", argTypes, term62949, args);
    }

};


