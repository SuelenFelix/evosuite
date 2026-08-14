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
import java.lang.Integer;
import java.lang.Boolean;

public class Memory_read_10742337886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24765;
     Object term24849;
     Object term24851;

    public Memory_read_10742337886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24866 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term24865 = ((Class) term24866).getDeclaredField((String) "NMOS_6502");
        ((Field) term24865).setAccessible(true);
        Object enum68 = ((Field) term24865).get((Object) null);
        HashMap term24800 = new HashMap();
        HashMap term24834 = new HashMap();
        HashMap term24841 = new HashMap();
        Set<Object> term25133 =  ((Map) term24841).keySet();
        HashSet term24840 = new HashSet((Collection<? extends Object>) term25133);
        term24765 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term24767 = (int[]) newIntArray(2);
        Object term24771 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term24786 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term24789 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term24794 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term24797 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term24805 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term24806 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term24814 = (int[]) newIntArray(2);
        int[] term24817 = (int[]) newIntArray(2);
        Object[] term24839 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setBooleanField(term24765, term24765.getClass(), "readOnly", false);
        setIntElement(term24767, 0, 1059048043);
        setIntElement(term24767, 1, 537273345);
        setField(term24765, term24765.getClass(), "mem", term24767);
        setIntField(term24765, term24765.getClass(), "size", -1577393360);
        setIntField(term24771, term24771.getClass(), "startAddress", 1112256038);
        setIntField(term24771, term24771.getClass(), "endAddress", -441333794);
        setField(term24765, term24765.getClass(), "memoryRange", term24771);
        setField(term24765, term24765.getClass(), "name", "swZVeJAxjt");
        setIntField(term24786, term24786.getClass(), "startAddress", 1504698817);
        setIntField(term24786, term24786.getClass(), "endAddress", -2018333791);
        setLongField(term24789, term24789.getClass(), "clockPeriodInNs", 1000L);
        setField(term24789, term24789.getClass(), "behavior", enum68);
        setIntField(term24794, term24794.getClass(), "startAddress", -742476678);
        setIntField(term24794, term24794.getClass(), "endAddress", -824369460);
        setLongField(term24797, term24797.getClass(), "clockPeriodInNs", 1000L);
        setField(term24797, term24797.getClass(), "behavior", enum68);
        setField(term24797, term24797.getClass(), "bus", null);
        setField(term24797, term24797.getClass(), "state", null);
        setLongField(term24797, term24797.getClass(), "opBeginTime", -9204303423581447271L);
        setField(term24794, term24794.getClass(), "cpu", term24797);
        setField(term24794, term24794.getClass(), "deviceMap", term24800);
        setField(term24794, term24794.getClass(), "deviceAddressArray", term24805);
        setField(term24789, term24789.getClass(), "bus", term24794);
        setIntField(term24806, term24806.getClass(), "a", 0);
        setIntField(term24806, term24806.getClass(), "x", 0);
        setIntField(term24806, term24806.getClass(), "y", 0);
        setIntField(term24806, term24806.getClass(), "sp", 0);
        setIntField(term24806, term24806.getClass(), "pc", 0);
        setIntField(term24806, term24806.getClass(), "ir", 0);
        setIntField(term24806, term24806.getClass(), "nextIr", 0);
        setField(term24806, term24806.getClass(), "args", term24814);
        setField(term24806, term24806.getClass(), "nextArgs", term24817);
        setIntField(term24806, term24806.getClass(), "instSize", 0);
        setBooleanField(term24806, term24806.getClass(), "opTrap", false);
        setBooleanField(term24806, term24806.getClass(), "irqAsserted", false);
        setBooleanField(term24806, term24806.getClass(), "nmiAsserted", false);
        setIntField(term24806, term24806.getClass(), "lastPc", 0);
        setBooleanField(term24806, term24806.getClass(), "carryFlag", false);
        setBooleanField(term24806, term24806.getClass(), "negativeFlag", false);
        setBooleanField(term24806, term24806.getClass(), "zeroFlag", false);
        setBooleanField(term24806, term24806.getClass(), "irqDisableFlag", false);
        setBooleanField(term24806, term24806.getClass(), "decimalModeFlag", false);
        setBooleanField(term24806, term24806.getClass(), "breakFlag", false);
        setBooleanField(term24806, term24806.getClass(), "overflowFlag", false);
        setLongField(term24806, term24806.getClass(), "stepCounter", 0L);
        setField(term24789, term24789.getClass(), "state", term24806);
        setLongField(term24789, term24789.getClass(), "opBeginTime", 6248239231585852341L);
        setField(term24786, term24786.getClass(), "cpu", term24789);
        setField(term24786, term24786.getClass(), "deviceMap", term24834);
        setField(term24786, term24786.getClass(), "deviceAddressArray", term24839);
        setField(term24765, term24765.getClass(), "bus", term24786);
        setField(term24765, term24765.getClass(), "deviceChangeListeners", term24840);
        term24849 = new Integer(1837886253);
        term24851 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term24849;
        args[1] = term24851;
        callMethod(klass, "read", argTypes, term24765, args);
    }

};


