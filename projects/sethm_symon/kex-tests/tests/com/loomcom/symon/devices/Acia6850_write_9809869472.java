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

public class Acia6850_write_9809869472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10223;
     Object term10328;
     Object term10330;

    public Acia6850_write_9809869472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10343 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term10342 = ((Class) term10343).getDeclaredField((String) "NMOS_6502");
        ((Field) term10342).setAccessible(true);
        Object enum22 = ((Field) term10342).get((Object) null);
        HashMap term10279 = new HashMap();
        HashMap term10313 = new HashMap();
        HashMap term10320 = new HashMap();
        Set<Object> term10610 =  ((Map) term10320).keySet();
        HashSet term10319 = new HashSet((Collection<? extends Object>) term10610);
        term10223 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        Object term10250 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term10265 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term10268 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term10273 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term10276 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term10284 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term10285 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term10293 = (int[]) newIntArray(2);
        int[] term10296 = (int[]) newIntArray(2);
        Object[] term10318 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setField(term10223, term10223.getClass(), "name", "hxCBltsObl");
        setIntField(term10223, term10223.getClass(), "baseAddress", -1858909368);
        setBooleanField(term10223, term10223.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term10223, term10223.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term10223, term10223.getClass(), "overrun", true);
        setBooleanField(term10223, term10223.getClass(), "interrupt", true);
        setLongField(term10223, term10223.getClass(), "lastTxWrite", -6432617521836576658L);
        setLongField(term10223, term10223.getClass(), "lastRxRead", -2255965562447970862L);
        setIntField(term10223, term10223.getClass(), "baudRate", -280113263);
        setLongField(term10223, term10223.getClass(), "baudRateDelay", 148047808219672941L);
        setIntField(term10223, term10223.getClass(), "rxChar", 529625347);
        setIntField(term10223, term10223.getClass(), "txChar", 1409095253);
        setBooleanField(term10223, term10223.getClass(), "rxFull", true);
        setBooleanField(term10223, term10223.getClass(), "txEmpty", false);
        setIntField(term10223, term10223.getClass(), "size", 315179039);
        setIntField(term10250, term10250.getClass(), "startAddress", -1835923897);
        setIntField(term10250, term10250.getClass(), "endAddress", -341287775);
        setField(term10223, term10223.getClass(), "memoryRange", term10250);
        setIntField(term10265, term10265.getClass(), "startAddress", -1651110911);
        setIntField(term10265, term10265.getClass(), "endAddress", -1934033808);
        setLongField(term10268, term10268.getClass(), "clockPeriodInNs", 1000L);
        setField(term10268, term10268.getClass(), "behavior", enum22);
        setIntField(term10273, term10273.getClass(), "startAddress", 950322609);
        setIntField(term10273, term10273.getClass(), "endAddress", -2023791789);
        setLongField(term10276, term10276.getClass(), "clockPeriodInNs", 1000L);
        setField(term10276, term10276.getClass(), "behavior", enum22);
        setField(term10276, term10276.getClass(), "bus", null);
        setField(term10276, term10276.getClass(), "state", null);
        setLongField(term10276, term10276.getClass(), "opBeginTime", 6843866297465638866L);
        setField(term10273, term10273.getClass(), "cpu", term10276);
        setField(term10273, term10273.getClass(), "deviceMap", term10279);
        setField(term10273, term10273.getClass(), "deviceAddressArray", term10284);
        setField(term10268, term10268.getClass(), "bus", term10273);
        setIntField(term10285, term10285.getClass(), "a", 0);
        setIntField(term10285, term10285.getClass(), "x", 0);
        setIntField(term10285, term10285.getClass(), "y", 0);
        setIntField(term10285, term10285.getClass(), "sp", 0);
        setIntField(term10285, term10285.getClass(), "pc", 0);
        setIntField(term10285, term10285.getClass(), "ir", 0);
        setIntField(term10285, term10285.getClass(), "nextIr", 0);
        setField(term10285, term10285.getClass(), "args", term10293);
        setField(term10285, term10285.getClass(), "nextArgs", term10296);
        setIntField(term10285, term10285.getClass(), "instSize", 0);
        setBooleanField(term10285, term10285.getClass(), "opTrap", false);
        setBooleanField(term10285, term10285.getClass(), "irqAsserted", false);
        setBooleanField(term10285, term10285.getClass(), "nmiAsserted", false);
        setIntField(term10285, term10285.getClass(), "lastPc", 0);
        setBooleanField(term10285, term10285.getClass(), "carryFlag", false);
        setBooleanField(term10285, term10285.getClass(), "negativeFlag", false);
        setBooleanField(term10285, term10285.getClass(), "zeroFlag", false);
        setBooleanField(term10285, term10285.getClass(), "irqDisableFlag", false);
        setBooleanField(term10285, term10285.getClass(), "decimalModeFlag", false);
        setBooleanField(term10285, term10285.getClass(), "breakFlag", false);
        setBooleanField(term10285, term10285.getClass(), "overflowFlag", false);
        setLongField(term10285, term10285.getClass(), "stepCounter", 0L);
        setField(term10268, term10268.getClass(), "state", term10285);
        setLongField(term10268, term10268.getClass(), "opBeginTime", -4023935540989049732L);
        setField(term10265, term10265.getClass(), "cpu", term10268);
        setField(term10265, term10265.getClass(), "deviceMap", term10313);
        setField(term10265, term10265.getClass(), "deviceAddressArray", term10318);
        setField(term10223, term10223.getClass(), "bus", term10265);
        setField(term10223, term10223.getClass(), "deviceChangeListeners", term10319);
        term10328 = new Integer(-1150062870);
        term10330 = new Integer(-886200503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10328;
        args[1] = term10330;
        callMethod(klass, "write", argTypes, term10223, args);
    }

};


