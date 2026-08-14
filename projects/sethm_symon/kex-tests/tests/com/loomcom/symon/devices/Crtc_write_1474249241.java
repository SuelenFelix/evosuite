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

public class Crtc_write_1474249241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;
     Object term590;
     Object term592;

    public Crtc_write_1474249241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term605 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term604 = ((Class) term605).getDeclaredField((String) "CMOS_65816");
        ((Field) term604).setAccessible(true);
        Object enum1 = ((Field) term604).get((Object) null);
        HashMap term501 = new HashMap();
        HashMap term508 = new HashMap();
        Set<Object> term871 =  ((Map) term508).keySet();
        HashSet term507 = new HashSet((Collection<? extends Object>) term871);
        HashMap term541 = new HashMap();
        HashMap term575 = new HashMap();
        HashMap term582 = new HashMap();
        Set<Object> term886 =  ((Map) term582).keySet();
        HashSet term581 = new HashSet((Collection<? extends Object>) term886);
        term435 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term450 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term452 = (int[]) newIntArray(0);
        Object term454 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term469 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term472 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term476 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term479 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term506 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term515 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term530 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term533 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term535 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term538 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term546 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term547 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term555 = (int[]) newIntArray(2);
        int[] term558 = (int[]) newIntArray(2);
        Object[] term580 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term435, term435.getClass(), "horizontalDisplayed", 1048535127);
        setIntField(term435, term435.getClass(), "verticalDisplayed", -655067527);
        setIntField(term435, term435.getClass(), "scanLinesPerRow", -6029667);
        setIntField(term435, term435.getClass(), "cursorStartLine", -2068769794);
        setBooleanField(term435, term435.getClass(), "cursorEnabled", false);
        setIntField(term435, term435.getClass(), "cursorBlinkRate", -117576464);
        setIntField(term435, term435.getClass(), "cursorStopLine", -1007160944);
        setIntField(term435, term435.getClass(), "startAddress", 1135664017);
        setIntField(term435, term435.getClass(), "cursorPosition", 590364439);
        setIntField(term435, term435.getClass(), "pageSize", 865208305);
        setIntField(term435, term435.getClass(), "currentRegister", -1275173084);
        setBooleanField(term435, term435.getClass(), "rowColumnAddressing", false);
        setBooleanField(term435, term435.getClass(), "displayEnableSkew", false);
        setBooleanField(term435, term435.getClass(), "cursorSkew", true);
        setBooleanField(term450, term450.getClass(), "readOnly", true);
        setField(term450, term450.getClass(), "mem", term452);
        setIntField(term450, term450.getClass(), "size", -203030934);
        setIntField(term454, term454.getClass(), "startAddress", -1179120542);
        setIntField(term454, term454.getClass(), "endAddress", -73683645);
        setField(term450, term450.getClass(), "memoryRange", term454);
        setField(term450, term450.getClass(), "name", "sjlJAEtRrb");
        setIntField(term469, term469.getClass(), "startAddress", -226514366);
        setIntField(term469, term469.getClass(), "endAddress", 1193880199);
        setLongField(term472, term472.getClass(), "clockPeriodInNs", 1000L);
        setField(term472, term472.getClass(), "behavior", enum1);
        setIntField(term476, term476.getClass(), "startAddress", -1087774327);
        setIntField(term476, term476.getClass(), "endAddress", -1530420153);
        setField(term476, term476.getClass(), "cpu", null);
        setField(term476, term476.getClass(), "deviceMap", null);
        setField(term476, term476.getClass(), "deviceAddressArray", null);
        setField(term472, term472.getClass(), "bus", term476);
        setIntField(term479, term479.getClass(), "a", 0);
        setIntField(term479, term479.getClass(), "x", 0);
        setIntField(term479, term479.getClass(), "y", 0);
        setIntField(term479, term479.getClass(), "sp", 0);
        setIntField(term479, term479.getClass(), "pc", 0);
        setIntField(term479, term479.getClass(), "ir", 0);
        setIntField(term479, term479.getClass(), "nextIr", 0);
        setField(term479, term479.getClass(), "args", null);
        setField(term479, term479.getClass(), "nextArgs", null);
        setIntField(term479, term479.getClass(), "instSize", 0);
        setBooleanField(term479, term479.getClass(), "opTrap", false);
        setBooleanField(term479, term479.getClass(), "irqAsserted", false);
        setBooleanField(term479, term479.getClass(), "nmiAsserted", false);
        setIntField(term479, term479.getClass(), "lastPc", 0);
        setBooleanField(term479, term479.getClass(), "carryFlag", false);
        setBooleanField(term479, term479.getClass(), "negativeFlag", false);
        setBooleanField(term479, term479.getClass(), "zeroFlag", false);
        setBooleanField(term479, term479.getClass(), "irqDisableFlag", false);
        setBooleanField(term479, term479.getClass(), "decimalModeFlag", false);
        setBooleanField(term479, term479.getClass(), "breakFlag", false);
        setBooleanField(term479, term479.getClass(), "overflowFlag", false);
        setLongField(term479, term479.getClass(), "stepCounter", 0L);
        setField(term472, term472.getClass(), "state", term479);
        setLongField(term472, term472.getClass(), "opBeginTime", 4872422362414183754L);
        setField(term469, term469.getClass(), "cpu", term472);
        setField(term469, term469.getClass(), "deviceMap", term501);
        setField(term469, term469.getClass(), "deviceAddressArray", term506);
        setField(term450, term450.getClass(), "bus", term469);
        setField(term450, term450.getClass(), "deviceChangeListeners", term507);
        setField(term435, term435.getClass(), "memory", term450);
        setIntField(term435, term435.getClass(), "size", 679763016);
        setIntField(term515, term515.getClass(), "startAddress", 1962444399);
        setIntField(term515, term515.getClass(), "endAddress", 767834723);
        setField(term435, term435.getClass(), "memoryRange", term515);
        setField(term435, term435.getClass(), "name", "MuLcgQHgqz");
        setIntField(term530, term530.getClass(), "startAddress", -602026508);
        setIntField(term530, term530.getClass(), "endAddress", -157887805);
        setLongField(term533, term533.getClass(), "clockPeriodInNs", 1000L);
        setField(term533, term533.getClass(), "behavior", enum1);
        setIntField(term535, term535.getClass(), "startAddress", 1876565163);
        setIntField(term535, term535.getClass(), "endAddress", -817164822);
        setLongField(term538, term538.getClass(), "clockPeriodInNs", 1000L);
        setField(term538, term538.getClass(), "behavior", enum1);
        setField(term538, term538.getClass(), "bus", null);
        setField(term538, term538.getClass(), "state", null);
        setLongField(term538, term538.getClass(), "opBeginTime", -7237588299778557629L);
        setField(term535, term535.getClass(), "cpu", term538);
        setField(term535, term535.getClass(), "deviceMap", term541);
        setField(term535, term535.getClass(), "deviceAddressArray", term546);
        setField(term533, term533.getClass(), "bus", term535);
        setIntField(term547, term547.getClass(), "a", 0);
        setIntField(term547, term547.getClass(), "x", 0);
        setIntField(term547, term547.getClass(), "y", 0);
        setIntField(term547, term547.getClass(), "sp", 0);
        setIntField(term547, term547.getClass(), "pc", 0);
        setIntField(term547, term547.getClass(), "ir", 0);
        setIntField(term547, term547.getClass(), "nextIr", 0);
        setField(term547, term547.getClass(), "args", term555);
        setField(term547, term547.getClass(), "nextArgs", term558);
        setIntField(term547, term547.getClass(), "instSize", 0);
        setBooleanField(term547, term547.getClass(), "opTrap", false);
        setBooleanField(term547, term547.getClass(), "irqAsserted", false);
        setBooleanField(term547, term547.getClass(), "nmiAsserted", false);
        setIntField(term547, term547.getClass(), "lastPc", 0);
        setBooleanField(term547, term547.getClass(), "carryFlag", false);
        setBooleanField(term547, term547.getClass(), "negativeFlag", false);
        setBooleanField(term547, term547.getClass(), "zeroFlag", false);
        setBooleanField(term547, term547.getClass(), "irqDisableFlag", false);
        setBooleanField(term547, term547.getClass(), "decimalModeFlag", false);
        setBooleanField(term547, term547.getClass(), "breakFlag", false);
        setBooleanField(term547, term547.getClass(), "overflowFlag", false);
        setLongField(term547, term547.getClass(), "stepCounter", 0L);
        setField(term533, term533.getClass(), "state", term547);
        setLongField(term533, term533.getClass(), "opBeginTime", 6967924379644551255L);
        setField(term530, term530.getClass(), "cpu", term533);
        setField(term530, term530.getClass(), "deviceMap", term575);
        setField(term530, term530.getClass(), "deviceAddressArray", term580);
        setField(term435, term435.getClass(), "bus", term530);
        setField(term435, term435.getClass(), "deviceChangeListeners", term581);
        term590 = new Integer(1632125673);
        term592 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term590;
        args[1] = term592;
        callMethod(klass, "write", argTypes, term435, args);
    }

};


