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
import java.lang.Boolean;

public class Acia6850_statusReg_15293571004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11021;
     Object term11126;

    public Acia6850_statusReg_15293571004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11139 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term11138 = ((Class) term11139).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term11138).setAccessible(true);
        Object enum24 = ((Field) term11138).get((Object) null);
        HashMap term11077 = new HashMap();
        HashMap term11111 = new HashMap();
        HashMap term11118 = new HashMap();
        Set<Object> term11430 =  ((Map) term11118).keySet();
        HashSet term11117 = new HashSet((Collection<? extends Object>) term11430);
        term11021 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        Object term11048 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term11063 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11066 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term11071 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11074 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term11082 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term11083 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term11091 = (int[]) newIntArray(2);
        int[] term11094 = (int[]) newIntArray(2);
        Object[] term11116 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setField(term11021, term11021.getClass(), "name", "LvtrsXUliU");
        setIntField(term11021, term11021.getClass(), "baseAddress", -13725716);
        setBooleanField(term11021, term11021.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11021, term11021.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term11021, term11021.getClass(), "overrun", false);
        setBooleanField(term11021, term11021.getClass(), "interrupt", false);
        setLongField(term11021, term11021.getClass(), "lastTxWrite", 8034714140377562739L);
        setLongField(term11021, term11021.getClass(), "lastRxRead", -2924531382671518368L);
        setIntField(term11021, term11021.getClass(), "baudRate", -1695750603);
        setLongField(term11021, term11021.getClass(), "baudRateDelay", -3948863953565024517L);
        setIntField(term11021, term11021.getClass(), "rxChar", 63677360);
        setIntField(term11021, term11021.getClass(), "txChar", 1478914037);
        setBooleanField(term11021, term11021.getClass(), "rxFull", false);
        setBooleanField(term11021, term11021.getClass(), "txEmpty", false);
        setIntField(term11021, term11021.getClass(), "size", 1630231519);
        setIntField(term11048, term11048.getClass(), "startAddress", 1460702778);
        setIntField(term11048, term11048.getClass(), "endAddress", -1398142433);
        setField(term11021, term11021.getClass(), "memoryRange", term11048);
        setIntField(term11063, term11063.getClass(), "startAddress", -1112119058);
        setIntField(term11063, term11063.getClass(), "endAddress", 2073858334);
        setLongField(term11066, term11066.getClass(), "clockPeriodInNs", 1000L);
        setField(term11066, term11066.getClass(), "behavior", enum24);
        setIntField(term11071, term11071.getClass(), "startAddress", -1693535639);
        setIntField(term11071, term11071.getClass(), "endAddress", 1344744036);
        setLongField(term11074, term11074.getClass(), "clockPeriodInNs", 1000L);
        setField(term11074, term11074.getClass(), "behavior", enum24);
        setField(term11074, term11074.getClass(), "bus", null);
        setField(term11074, term11074.getClass(), "state", null);
        setLongField(term11074, term11074.getClass(), "opBeginTime", -6301101997917060727L);
        setField(term11071, term11071.getClass(), "cpu", term11074);
        setField(term11071, term11071.getClass(), "deviceMap", term11077);
        setField(term11071, term11071.getClass(), "deviceAddressArray", term11082);
        setField(term11066, term11066.getClass(), "bus", term11071);
        setIntField(term11083, term11083.getClass(), "a", 0);
        setIntField(term11083, term11083.getClass(), "x", 0);
        setIntField(term11083, term11083.getClass(), "y", 0);
        setIntField(term11083, term11083.getClass(), "sp", 0);
        setIntField(term11083, term11083.getClass(), "pc", 0);
        setIntField(term11083, term11083.getClass(), "ir", 0);
        setIntField(term11083, term11083.getClass(), "nextIr", 0);
        setField(term11083, term11083.getClass(), "args", term11091);
        setField(term11083, term11083.getClass(), "nextArgs", term11094);
        setIntField(term11083, term11083.getClass(), "instSize", 0);
        setBooleanField(term11083, term11083.getClass(), "opTrap", false);
        setBooleanField(term11083, term11083.getClass(), "irqAsserted", false);
        setBooleanField(term11083, term11083.getClass(), "nmiAsserted", false);
        setIntField(term11083, term11083.getClass(), "lastPc", 0);
        setBooleanField(term11083, term11083.getClass(), "carryFlag", false);
        setBooleanField(term11083, term11083.getClass(), "negativeFlag", false);
        setBooleanField(term11083, term11083.getClass(), "zeroFlag", false);
        setBooleanField(term11083, term11083.getClass(), "irqDisableFlag", false);
        setBooleanField(term11083, term11083.getClass(), "decimalModeFlag", false);
        setBooleanField(term11083, term11083.getClass(), "breakFlag", false);
        setBooleanField(term11083, term11083.getClass(), "overflowFlag", false);
        setLongField(term11083, term11083.getClass(), "stepCounter", 0L);
        setField(term11066, term11066.getClass(), "state", term11083);
        setLongField(term11066, term11066.getClass(), "opBeginTime", 8166095254618543564L);
        setField(term11063, term11063.getClass(), "cpu", term11066);
        setField(term11063, term11063.getClass(), "deviceMap", term11111);
        setField(term11063, term11063.getClass(), "deviceAddressArray", term11116);
        setField(term11021, term11021.getClass(), "bus", term11063);
        setField(term11021, term11021.getClass(), "deviceChangeListeners", term11117);
        term11126 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11126;
        callMethod(klass, "statusReg", argTypes, term11021, args);
    }

};


