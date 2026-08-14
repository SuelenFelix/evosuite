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

public class Via6522_read_14182361282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12284;
     Object term12376;
     Object term12378;

    public Via6522_read_14182361282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12391 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term12390 = ((Class) term12391).getDeclaredField((String) "CMOS_6502");
        ((Field) term12390).setAccessible(true);
        Object enum27 = ((Field) term12390).get((Object) null);
        HashMap term12327 = new HashMap();
        HashMap term12361 = new HashMap();
        HashMap term12368 = new HashMap();
        Set<Object> term12658 =  ((Map) term12368).keySet();
        HashSet term12367 = new HashSet((Collection<? extends Object>) term12658);
        term12284 = newInstance(Class.forName("com.loomcom.symon.devices.Via6522"));
        Object term12298 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term12313 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term12316 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term12321 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term12324 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term12332 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term12333 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term12341 = (int[]) newIntArray(2);
        int[] term12344 = (int[]) newIntArray(2);
        Object[] term12366 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        setField(term12284, term12284.getClass(), "name", "JDswTTCZHV");
        setIntField(term12284, term12284.getClass(), "size", 2077491675);
        setIntField(term12298, term12298.getClass(), "startAddress", -1728316609);
        setIntField(term12298, term12298.getClass(), "endAddress", 47118909);
        setField(term12284, term12284.getClass(), "memoryRange", term12298);
        setIntField(term12313, term12313.getClass(), "startAddress", -2093707412);
        setIntField(term12313, term12313.getClass(), "endAddress", -680627153);
        setLongField(term12316, term12316.getClass(), "clockPeriodInNs", 1000L);
        setField(term12316, term12316.getClass(), "behavior", enum27);
        setIntField(term12321, term12321.getClass(), "startAddress", 722519669);
        setIntField(term12321, term12321.getClass(), "endAddress", -40335961);
        setLongField(term12324, term12324.getClass(), "clockPeriodInNs", 1000L);
        setField(term12324, term12324.getClass(), "behavior", enum27);
        setField(term12324, term12324.getClass(), "bus", null);
        setField(term12324, term12324.getClass(), "state", null);
        setLongField(term12324, term12324.getClass(), "opBeginTime", 4100236067313034103L);
        setField(term12321, term12321.getClass(), "cpu", term12324);
        setField(term12321, term12321.getClass(), "deviceMap", term12327);
        setField(term12321, term12321.getClass(), "deviceAddressArray", term12332);
        setField(term12316, term12316.getClass(), "bus", term12321);
        setIntField(term12333, term12333.getClass(), "a", 0);
        setIntField(term12333, term12333.getClass(), "x", 0);
        setIntField(term12333, term12333.getClass(), "y", 0);
        setIntField(term12333, term12333.getClass(), "sp", 0);
        setIntField(term12333, term12333.getClass(), "pc", 0);
        setIntField(term12333, term12333.getClass(), "ir", 0);
        setIntField(term12333, term12333.getClass(), "nextIr", 0);
        setField(term12333, term12333.getClass(), "args", term12341);
        setField(term12333, term12333.getClass(), "nextArgs", term12344);
        setIntField(term12333, term12333.getClass(), "instSize", 0);
        setBooleanField(term12333, term12333.getClass(), "opTrap", false);
        setBooleanField(term12333, term12333.getClass(), "irqAsserted", false);
        setBooleanField(term12333, term12333.getClass(), "nmiAsserted", false);
        setIntField(term12333, term12333.getClass(), "lastPc", 0);
        setBooleanField(term12333, term12333.getClass(), "carryFlag", false);
        setBooleanField(term12333, term12333.getClass(), "negativeFlag", false);
        setBooleanField(term12333, term12333.getClass(), "zeroFlag", false);
        setBooleanField(term12333, term12333.getClass(), "irqDisableFlag", false);
        setBooleanField(term12333, term12333.getClass(), "decimalModeFlag", false);
        setBooleanField(term12333, term12333.getClass(), "breakFlag", false);
        setBooleanField(term12333, term12333.getClass(), "overflowFlag", false);
        setLongField(term12333, term12333.getClass(), "stepCounter", 0L);
        setField(term12316, term12316.getClass(), "state", term12333);
        setLongField(term12316, term12316.getClass(), "opBeginTime", 1195529027276497124L);
        setField(term12313, term12313.getClass(), "cpu", term12316);
        setField(term12313, term12313.getClass(), "deviceMap", term12361);
        setField(term12313, term12313.getClass(), "deviceAddressArray", term12366);
        setField(term12284, term12284.getClass(), "bus", term12313);
        setField(term12284, term12284.getClass(), "deviceChangeListeners", term12367);
        term12376 = new Integer(-752378450);
        term12378 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Via6522");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12376;
        args[1] = term12378;
        callMethod(klass, "read", argTypes, term12284, args);
    }

};


