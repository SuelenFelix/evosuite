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

public class Via6522_write_11233742051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11906;
     Object term11998;
     Object term12000;

    public Via6522_write_11233742051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12013 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term12012 = ((Class) term12013).getDeclaredField((String) "CMOS_65816");
        ((Field) term12012).setAccessible(true);
        Object enum26 = ((Field) term12012).get((Object) null);
        HashMap term11949 = new HashMap();
        HashMap term11983 = new HashMap();
        HashMap term11990 = new HashMap();
        Set<Object> term12283 =  ((Map) term11990).keySet();
        HashSet term11989 = new HashSet((Collection<? extends Object>) term12283);
        term11906 = newInstance(Class.forName("com.loomcom.symon.devices.Via6522"));
        Object term11920 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term11935 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11938 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term11943 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11946 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term11954 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term11955 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term11963 = (int[]) newIntArray(2);
        int[] term11966 = (int[]) newIntArray(2);
        Object[] term11988 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        setField(term11906, term11906.getClass(), "name", "UiUYnPrcCi");
        setIntField(term11906, term11906.getClass(), "size", 1415142780);
        setIntField(term11920, term11920.getClass(), "startAddress", -574105759);
        setIntField(term11920, term11920.getClass(), "endAddress", -1165271567);
        setField(term11906, term11906.getClass(), "memoryRange", term11920);
        setIntField(term11935, term11935.getClass(), "startAddress", 376834234);
        setIntField(term11935, term11935.getClass(), "endAddress", -1911972560);
        setLongField(term11938, term11938.getClass(), "clockPeriodInNs", 1000L);
        setField(term11938, term11938.getClass(), "behavior", enum26);
        setIntField(term11943, term11943.getClass(), "startAddress", -642716895);
        setIntField(term11943, term11943.getClass(), "endAddress", 1743398246);
        setLongField(term11946, term11946.getClass(), "clockPeriodInNs", 1000L);
        setField(term11946, term11946.getClass(), "behavior", enum26);
        setField(term11946, term11946.getClass(), "bus", null);
        setField(term11946, term11946.getClass(), "state", null);
        setLongField(term11946, term11946.getClass(), "opBeginTime", -7884871963229073324L);
        setField(term11943, term11943.getClass(), "cpu", term11946);
        setField(term11943, term11943.getClass(), "deviceMap", term11949);
        setField(term11943, term11943.getClass(), "deviceAddressArray", term11954);
        setField(term11938, term11938.getClass(), "bus", term11943);
        setIntField(term11955, term11955.getClass(), "a", 0);
        setIntField(term11955, term11955.getClass(), "x", 0);
        setIntField(term11955, term11955.getClass(), "y", 0);
        setIntField(term11955, term11955.getClass(), "sp", 0);
        setIntField(term11955, term11955.getClass(), "pc", 0);
        setIntField(term11955, term11955.getClass(), "ir", 0);
        setIntField(term11955, term11955.getClass(), "nextIr", 0);
        setField(term11955, term11955.getClass(), "args", term11963);
        setField(term11955, term11955.getClass(), "nextArgs", term11966);
        setIntField(term11955, term11955.getClass(), "instSize", 0);
        setBooleanField(term11955, term11955.getClass(), "opTrap", false);
        setBooleanField(term11955, term11955.getClass(), "irqAsserted", false);
        setBooleanField(term11955, term11955.getClass(), "nmiAsserted", false);
        setIntField(term11955, term11955.getClass(), "lastPc", 0);
        setBooleanField(term11955, term11955.getClass(), "carryFlag", false);
        setBooleanField(term11955, term11955.getClass(), "negativeFlag", false);
        setBooleanField(term11955, term11955.getClass(), "zeroFlag", false);
        setBooleanField(term11955, term11955.getClass(), "irqDisableFlag", false);
        setBooleanField(term11955, term11955.getClass(), "decimalModeFlag", false);
        setBooleanField(term11955, term11955.getClass(), "breakFlag", false);
        setBooleanField(term11955, term11955.getClass(), "overflowFlag", false);
        setLongField(term11955, term11955.getClass(), "stepCounter", 0L);
        setField(term11938, term11938.getClass(), "state", term11955);
        setLongField(term11938, term11938.getClass(), "opBeginTime", -8649738738252714180L);
        setField(term11935, term11935.getClass(), "cpu", term11938);
        setField(term11935, term11935.getClass(), "deviceMap", term11983);
        setField(term11935, term11935.getClass(), "deviceAddressArray", term11988);
        setField(term11906, term11906.getClass(), "bus", term11935);
        setField(term11906, term11906.getClass(), "deviceChangeListeners", term11989);
        term11998 = new Integer(-1485916498);
        term12000 = new Integer(722787672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Via6522");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term11998;
        args[1] = term12000;
        callMethod(klass, "write", argTypes, term11906, args);
    }

};


