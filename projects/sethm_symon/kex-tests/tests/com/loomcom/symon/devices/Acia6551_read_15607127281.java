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

public class Acia6551_read_15607127281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21137;
     Object term21244;
     Object term21246;

    public Acia6551_read_15607127281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21259 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term21258 = ((Class) term21259).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term21258).setAccessible(true);
        Object enum58 = ((Field) term21258).get((Object) null);
        HashMap term21195 = new HashMap();
        HashMap term21229 = new HashMap();
        HashMap term21236 = new HashMap();
        Set<Object> term21550 =  ((Map) term21236).keySet();
        HashSet term21235 = new HashSet((Collection<? extends Object>) term21550);
        term21137 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term21166 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term21181 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21184 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term21189 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21192 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term21200 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term21201 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term21209 = (int[]) newIntArray(2);
        int[] term21212 = (int[]) newIntArray(2);
        Object[] term21234 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        setIntField(term21137, term21137.getClass(), "commandRegister", 941003590);
        setIntField(term21137, term21137.getClass(), "controlRegister", -1825624890);
        setField(term21137, term21137.getClass(), "name", "MAcUBcBckh");
        setIntField(term21137, term21137.getClass(), "baseAddress", 413214164);
        setBooleanField(term21137, term21137.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term21137, term21137.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term21137, term21137.getClass(), "overrun", true);
        setBooleanField(term21137, term21137.getClass(), "interrupt", false);
        setLongField(term21137, term21137.getClass(), "lastTxWrite", -1885698929232124806L);
        setLongField(term21137, term21137.getClass(), "lastRxRead", 5731563613239387113L);
        setIntField(term21137, term21137.getClass(), "baudRate", 355911655);
        setLongField(term21137, term21137.getClass(), "baudRateDelay", 3381333711768010594L);
        setIntField(term21137, term21137.getClass(), "rxChar", 1811833766);
        setIntField(term21137, term21137.getClass(), "txChar", 735987104);
        setBooleanField(term21137, term21137.getClass(), "rxFull", false);
        setBooleanField(term21137, term21137.getClass(), "txEmpty", true);
        setIntField(term21137, term21137.getClass(), "size", -1784072578);
        setIntField(term21166, term21166.getClass(), "startAddress", 2011764585);
        setIntField(term21166, term21166.getClass(), "endAddress", -860680764);
        setField(term21137, term21137.getClass(), "memoryRange", term21166);
        setIntField(term21181, term21181.getClass(), "startAddress", -963198667);
        setIntField(term21181, term21181.getClass(), "endAddress", -1007935918);
        setLongField(term21184, term21184.getClass(), "clockPeriodInNs", 1000L);
        setField(term21184, term21184.getClass(), "behavior", enum58);
        setIntField(term21189, term21189.getClass(), "startAddress", 1485731037);
        setIntField(term21189, term21189.getClass(), "endAddress", 1304396087);
        setLongField(term21192, term21192.getClass(), "clockPeriodInNs", 1000L);
        setField(term21192, term21192.getClass(), "behavior", enum58);
        setField(term21192, term21192.getClass(), "bus", null);
        setField(term21192, term21192.getClass(), "state", null);
        setLongField(term21192, term21192.getClass(), "opBeginTime", -3954795081650780841L);
        setField(term21189, term21189.getClass(), "cpu", term21192);
        setField(term21189, term21189.getClass(), "deviceMap", term21195);
        setField(term21189, term21189.getClass(), "deviceAddressArray", term21200);
        setField(term21184, term21184.getClass(), "bus", term21189);
        setIntField(term21201, term21201.getClass(), "a", 0);
        setIntField(term21201, term21201.getClass(), "x", 0);
        setIntField(term21201, term21201.getClass(), "y", 0);
        setIntField(term21201, term21201.getClass(), "sp", 0);
        setIntField(term21201, term21201.getClass(), "pc", 0);
        setIntField(term21201, term21201.getClass(), "ir", 0);
        setIntField(term21201, term21201.getClass(), "nextIr", 0);
        setField(term21201, term21201.getClass(), "args", term21209);
        setField(term21201, term21201.getClass(), "nextArgs", term21212);
        setIntField(term21201, term21201.getClass(), "instSize", 0);
        setBooleanField(term21201, term21201.getClass(), "opTrap", false);
        setBooleanField(term21201, term21201.getClass(), "irqAsserted", false);
        setBooleanField(term21201, term21201.getClass(), "nmiAsserted", false);
        setIntField(term21201, term21201.getClass(), "lastPc", 0);
        setBooleanField(term21201, term21201.getClass(), "carryFlag", false);
        setBooleanField(term21201, term21201.getClass(), "negativeFlag", false);
        setBooleanField(term21201, term21201.getClass(), "zeroFlag", false);
        setBooleanField(term21201, term21201.getClass(), "irqDisableFlag", false);
        setBooleanField(term21201, term21201.getClass(), "decimalModeFlag", false);
        setBooleanField(term21201, term21201.getClass(), "breakFlag", false);
        setBooleanField(term21201, term21201.getClass(), "overflowFlag", false);
        setLongField(term21201, term21201.getClass(), "stepCounter", 0L);
        setField(term21184, term21184.getClass(), "state", term21201);
        setLongField(term21184, term21184.getClass(), "opBeginTime", 3288791194263207397L);
        setField(term21181, term21181.getClass(), "cpu", term21184);
        setField(term21181, term21181.getClass(), "deviceMap", term21229);
        setField(term21181, term21181.getClass(), "deviceAddressArray", term21234);
        setField(term21137, term21137.getClass(), "bus", term21181);
        setField(term21137, term21137.getClass(), "deviceChangeListeners", term21235);
        term21244 = new Integer(1186917020);
        term21246 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term21244;
        args[1] = term21246;
        callMethod(klass, "read", argTypes, term21137, args);
    }

};


