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

public class Acia6850_reset_4749981315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11431;

    public Acia6850_reset_4749981315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11547 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term11546 = ((Class) term11547).getDeclaredField((String) "CMOS_6502");
        ((Field) term11546).setAccessible(true);
        Object enum25 = ((Field) term11546).get((Object) null);
        HashMap term11487 = new HashMap();
        HashMap term11521 = new HashMap();
        HashMap term11528 = new HashMap();
        Set<Object> term11814 =  ((Map) term11528).keySet();
        HashSet term11527 = new HashSet((Collection<? extends Object>) term11814);
        term11431 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        Object term11458 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term11473 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11476 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term11481 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term11484 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term11492 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term11493 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term11501 = (int[]) newIntArray(2);
        int[] term11504 = (int[]) newIntArray(2);
        Object[] term11526 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        setField(term11431, term11431.getClass(), "name", "jDtqGUpnZN");
        setIntField(term11431, term11431.getClass(), "baseAddress", 1868344256);
        setBooleanField(term11431, term11431.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term11431, term11431.getClass(), "transmitIrqEnabled", true);
        setBooleanField(term11431, term11431.getClass(), "overrun", false);
        setBooleanField(term11431, term11431.getClass(), "interrupt", false);
        setLongField(term11431, term11431.getClass(), "lastTxWrite", -4598158870068953328L);
        setLongField(term11431, term11431.getClass(), "lastRxRead", 138235087558060686L);
        setIntField(term11431, term11431.getClass(), "baudRate", 1857693976);
        setLongField(term11431, term11431.getClass(), "baudRateDelay", 5381386339318883012L);
        setIntField(term11431, term11431.getClass(), "rxChar", 1631305277);
        setIntField(term11431, term11431.getClass(), "txChar", 162113491);
        setBooleanField(term11431, term11431.getClass(), "rxFull", true);
        setBooleanField(term11431, term11431.getClass(), "txEmpty", true);
        setIntField(term11431, term11431.getClass(), "size", -932147928);
        setIntField(term11458, term11458.getClass(), "startAddress", 487369012);
        setIntField(term11458, term11458.getClass(), "endAddress", -179238712);
        setField(term11431, term11431.getClass(), "memoryRange", term11458);
        setIntField(term11473, term11473.getClass(), "startAddress", -2018735535);
        setIntField(term11473, term11473.getClass(), "endAddress", -658524954);
        setLongField(term11476, term11476.getClass(), "clockPeriodInNs", 1000L);
        setField(term11476, term11476.getClass(), "behavior", enum25);
        setIntField(term11481, term11481.getClass(), "startAddress", -2009613557);
        setIntField(term11481, term11481.getClass(), "endAddress", 654195547);
        setLongField(term11484, term11484.getClass(), "clockPeriodInNs", 1000L);
        setField(term11484, term11484.getClass(), "behavior", enum25);
        setField(term11484, term11484.getClass(), "bus", null);
        setField(term11484, term11484.getClass(), "state", null);
        setLongField(term11484, term11484.getClass(), "opBeginTime", -4360569253593381888L);
        setField(term11481, term11481.getClass(), "cpu", term11484);
        setField(term11481, term11481.getClass(), "deviceMap", term11487);
        setField(term11481, term11481.getClass(), "deviceAddressArray", term11492);
        setField(term11476, term11476.getClass(), "bus", term11481);
        setIntField(term11493, term11493.getClass(), "a", 0);
        setIntField(term11493, term11493.getClass(), "x", 0);
        setIntField(term11493, term11493.getClass(), "y", 0);
        setIntField(term11493, term11493.getClass(), "sp", 0);
        setIntField(term11493, term11493.getClass(), "pc", 0);
        setIntField(term11493, term11493.getClass(), "ir", 0);
        setIntField(term11493, term11493.getClass(), "nextIr", 0);
        setField(term11493, term11493.getClass(), "args", term11501);
        setField(term11493, term11493.getClass(), "nextArgs", term11504);
        setIntField(term11493, term11493.getClass(), "instSize", 0);
        setBooleanField(term11493, term11493.getClass(), "opTrap", false);
        setBooleanField(term11493, term11493.getClass(), "irqAsserted", false);
        setBooleanField(term11493, term11493.getClass(), "nmiAsserted", false);
        setIntField(term11493, term11493.getClass(), "lastPc", 0);
        setBooleanField(term11493, term11493.getClass(), "carryFlag", false);
        setBooleanField(term11493, term11493.getClass(), "negativeFlag", false);
        setBooleanField(term11493, term11493.getClass(), "zeroFlag", false);
        setBooleanField(term11493, term11493.getClass(), "irqDisableFlag", false);
        setBooleanField(term11493, term11493.getClass(), "decimalModeFlag", false);
        setBooleanField(term11493, term11493.getClass(), "breakFlag", false);
        setBooleanField(term11493, term11493.getClass(), "overflowFlag", false);
        setLongField(term11493, term11493.getClass(), "stepCounter", 0L);
        setField(term11476, term11476.getClass(), "state", term11493);
        setLongField(term11476, term11476.getClass(), "opBeginTime", 1457594663983990440L);
        setField(term11473, term11473.getClass(), "cpu", term11476);
        setField(term11473, term11473.getClass(), "deviceMap", term11521);
        setField(term11473, term11473.getClass(), "deviceAddressArray", term11526);
        setField(term11431, term11431.getClass(), "bus", term11473);
        setField(term11431, term11431.getClass(), "deviceChangeListeners", term11527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term11431, args);
    }

};


