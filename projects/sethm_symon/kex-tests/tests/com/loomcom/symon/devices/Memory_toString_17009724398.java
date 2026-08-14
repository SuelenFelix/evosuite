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

public class Memory_toString_17009724398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25520;

    public Memory_toString_17009724398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25614 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term25613 = ((Class) term25614).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term25613).setAccessible(true);
        Object enum70 = ((Field) term25613).get((Object) null);
        HashMap term25555 = new HashMap();
        HashMap term25589 = new HashMap();
        HashMap term25596 = new HashMap();
        Set<Object> term25905 =  ((Map) term25596).keySet();
        HashSet term25595 = new HashSet((Collection<? extends Object>) term25905);
        term25520 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term25522 = (int[]) newIntArray(2);
        Object term25526 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term25541 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term25544 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term25549 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term25552 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term25560 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term25561 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term25569 = (int[]) newIntArray(2);
        int[] term25572 = (int[]) newIntArray(2);
        Object[] term25594 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setBooleanField(term25520, term25520.getClass(), "readOnly", true);
        setIntElement(term25522, 0, 1267740164);
        setIntElement(term25522, 1, 1363887997);
        setField(term25520, term25520.getClass(), "mem", term25522);
        setIntField(term25520, term25520.getClass(), "size", 852281447);
        setIntField(term25526, term25526.getClass(), "startAddress", 1248430530);
        setIntField(term25526, term25526.getClass(), "endAddress", -1911828505);
        setField(term25520, term25520.getClass(), "memoryRange", term25526);
        setField(term25520, term25520.getClass(), "name", "GVizqqzXpy");
        setIntField(term25541, term25541.getClass(), "startAddress", 241725499);
        setIntField(term25541, term25541.getClass(), "endAddress", 823179298);
        setLongField(term25544, term25544.getClass(), "clockPeriodInNs", 1000L);
        setField(term25544, term25544.getClass(), "behavior", enum70);
        setIntField(term25549, term25549.getClass(), "startAddress", 1174484848);
        setIntField(term25549, term25549.getClass(), "endAddress", 939889496);
        setLongField(term25552, term25552.getClass(), "clockPeriodInNs", 1000L);
        setField(term25552, term25552.getClass(), "behavior", enum70);
        setField(term25552, term25552.getClass(), "bus", null);
        setField(term25552, term25552.getClass(), "state", null);
        setLongField(term25552, term25552.getClass(), "opBeginTime", -2986201902216133814L);
        setField(term25549, term25549.getClass(), "cpu", term25552);
        setField(term25549, term25549.getClass(), "deviceMap", term25555);
        setField(term25549, term25549.getClass(), "deviceAddressArray", term25560);
        setField(term25544, term25544.getClass(), "bus", term25549);
        setIntField(term25561, term25561.getClass(), "a", 0);
        setIntField(term25561, term25561.getClass(), "x", 0);
        setIntField(term25561, term25561.getClass(), "y", 0);
        setIntField(term25561, term25561.getClass(), "sp", 0);
        setIntField(term25561, term25561.getClass(), "pc", 0);
        setIntField(term25561, term25561.getClass(), "ir", 0);
        setIntField(term25561, term25561.getClass(), "nextIr", 0);
        setField(term25561, term25561.getClass(), "args", term25569);
        setField(term25561, term25561.getClass(), "nextArgs", term25572);
        setIntField(term25561, term25561.getClass(), "instSize", 0);
        setBooleanField(term25561, term25561.getClass(), "opTrap", false);
        setBooleanField(term25561, term25561.getClass(), "irqAsserted", false);
        setBooleanField(term25561, term25561.getClass(), "nmiAsserted", false);
        setIntField(term25561, term25561.getClass(), "lastPc", 0);
        setBooleanField(term25561, term25561.getClass(), "carryFlag", false);
        setBooleanField(term25561, term25561.getClass(), "negativeFlag", false);
        setBooleanField(term25561, term25561.getClass(), "zeroFlag", false);
        setBooleanField(term25561, term25561.getClass(), "irqDisableFlag", false);
        setBooleanField(term25561, term25561.getClass(), "decimalModeFlag", false);
        setBooleanField(term25561, term25561.getClass(), "breakFlag", false);
        setBooleanField(term25561, term25561.getClass(), "overflowFlag", false);
        setLongField(term25561, term25561.getClass(), "stepCounter", 0L);
        setField(term25544, term25544.getClass(), "state", term25561);
        setLongField(term25544, term25544.getClass(), "opBeginTime", 4255811647459029682L);
        setField(term25541, term25541.getClass(), "cpu", term25544);
        setField(term25541, term25541.getClass(), "deviceMap", term25589);
        setField(term25541, term25541.getClass(), "deviceAddressArray", term25594);
        setField(term25520, term25520.getClass(), "bus", term25541);
        setField(term25520, term25520.getClass(), "deviceChangeListeners", term25595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25520, args);
    }

};


