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

public class Crtc_getHorizontalDisplayed_3339307365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;

    public Crtc_getHorizontalDisplayed_3339307365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2411 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term2410 = ((Class) term2411).getDeclaredField((String) "CMOS_6502");
        ((Field) term2410).setAccessible(true);
        Object enum5 = ((Field) term2410).get((Object) null);
        HashMap term2313 = new HashMap();
        HashMap term2320 = new HashMap();
        Set<Object> term2674 =  ((Map) term2320).keySet();
        HashSet term2319 = new HashSet((Collection<? extends Object>) term2674);
        HashMap term2353 = new HashMap();
        HashMap term2387 = new HashMap();
        HashMap term2394 = new HashMap();
        Set<Object> term2689 =  ((Map) term2394).keySet();
        HashSet term2393 = new HashSet((Collection<? extends Object>) term2689);
        term2246 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term2261 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term2263 = (int[]) newIntArray(1);
        Object term2266 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term2281 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2284 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term2288 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2291 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term2318 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term2327 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term2342 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2345 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term2347 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2350 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term2358 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term2359 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term2367 = (int[]) newIntArray(2);
        int[] term2370 = (int[]) newIntArray(2);
        Object[] term2392 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term2246, term2246.getClass(), "horizontalDisplayed", -227365013);
        setIntField(term2246, term2246.getClass(), "verticalDisplayed", 11724947);
        setIntField(term2246, term2246.getClass(), "scanLinesPerRow", 1953277050);
        setIntField(term2246, term2246.getClass(), "cursorStartLine", 1283079251);
        setBooleanField(term2246, term2246.getClass(), "cursorEnabled", true);
        setIntField(term2246, term2246.getClass(), "cursorBlinkRate", -523949691);
        setIntField(term2246, term2246.getClass(), "cursorStopLine", 1398204340);
        setIntField(term2246, term2246.getClass(), "startAddress", 229204365);
        setIntField(term2246, term2246.getClass(), "cursorPosition", -461771056);
        setIntField(term2246, term2246.getClass(), "pageSize", -243422082);
        setIntField(term2246, term2246.getClass(), "currentRegister", 1384592638);
        setBooleanField(term2246, term2246.getClass(), "rowColumnAddressing", true);
        setBooleanField(term2246, term2246.getClass(), "displayEnableSkew", true);
        setBooleanField(term2246, term2246.getClass(), "cursorSkew", false);
        setBooleanField(term2261, term2261.getClass(), "readOnly", false);
        setIntElement(term2263, 0, -1002370457);
        setField(term2261, term2261.getClass(), "mem", term2263);
        setIntField(term2261, term2261.getClass(), "size", 1296895584);
        setIntField(term2266, term2266.getClass(), "startAddress", 628918458);
        setIntField(term2266, term2266.getClass(), "endAddress", -1274456137);
        setField(term2261, term2261.getClass(), "memoryRange", term2266);
        setField(term2261, term2261.getClass(), "name", "RMFIsYGgne");
        setIntField(term2281, term2281.getClass(), "startAddress", 1041916673);
        setIntField(term2281, term2281.getClass(), "endAddress", -601863069);
        setLongField(term2284, term2284.getClass(), "clockPeriodInNs", 1000L);
        setField(term2284, term2284.getClass(), "behavior", enum5);
        setIntField(term2288, term2288.getClass(), "startAddress", 663292551);
        setIntField(term2288, term2288.getClass(), "endAddress", -1885090354);
        setField(term2288, term2288.getClass(), "cpu", null);
        setField(term2288, term2288.getClass(), "deviceMap", null);
        setField(term2288, term2288.getClass(), "deviceAddressArray", null);
        setField(term2284, term2284.getClass(), "bus", term2288);
        setIntField(term2291, term2291.getClass(), "a", 0);
        setIntField(term2291, term2291.getClass(), "x", 0);
        setIntField(term2291, term2291.getClass(), "y", 0);
        setIntField(term2291, term2291.getClass(), "sp", 0);
        setIntField(term2291, term2291.getClass(), "pc", 0);
        setIntField(term2291, term2291.getClass(), "ir", 0);
        setIntField(term2291, term2291.getClass(), "nextIr", 0);
        setField(term2291, term2291.getClass(), "args", null);
        setField(term2291, term2291.getClass(), "nextArgs", null);
        setIntField(term2291, term2291.getClass(), "instSize", 0);
        setBooleanField(term2291, term2291.getClass(), "opTrap", false);
        setBooleanField(term2291, term2291.getClass(), "irqAsserted", false);
        setBooleanField(term2291, term2291.getClass(), "nmiAsserted", false);
        setIntField(term2291, term2291.getClass(), "lastPc", 0);
        setBooleanField(term2291, term2291.getClass(), "carryFlag", false);
        setBooleanField(term2291, term2291.getClass(), "negativeFlag", false);
        setBooleanField(term2291, term2291.getClass(), "zeroFlag", false);
        setBooleanField(term2291, term2291.getClass(), "irqDisableFlag", false);
        setBooleanField(term2291, term2291.getClass(), "decimalModeFlag", false);
        setBooleanField(term2291, term2291.getClass(), "breakFlag", false);
        setBooleanField(term2291, term2291.getClass(), "overflowFlag", false);
        setLongField(term2291, term2291.getClass(), "stepCounter", 0L);
        setField(term2284, term2284.getClass(), "state", term2291);
        setLongField(term2284, term2284.getClass(), "opBeginTime", 6855071767938501807L);
        setField(term2281, term2281.getClass(), "cpu", term2284);
        setField(term2281, term2281.getClass(), "deviceMap", term2313);
        setField(term2281, term2281.getClass(), "deviceAddressArray", term2318);
        setField(term2261, term2261.getClass(), "bus", term2281);
        setField(term2261, term2261.getClass(), "deviceChangeListeners", term2319);
        setField(term2246, term2246.getClass(), "memory", term2261);
        setIntField(term2246, term2246.getClass(), "size", 197109649);
        setIntField(term2327, term2327.getClass(), "startAddress", -1239406390);
        setIntField(term2327, term2327.getClass(), "endAddress", 1557431527);
        setField(term2246, term2246.getClass(), "memoryRange", term2327);
        setField(term2246, term2246.getClass(), "name", "NRdvgJlhkX");
        setIntField(term2342, term2342.getClass(), "startAddress", -1504890659);
        setIntField(term2342, term2342.getClass(), "endAddress", 1358829571);
        setLongField(term2345, term2345.getClass(), "clockPeriodInNs", 1000L);
        setField(term2345, term2345.getClass(), "behavior", enum5);
        setIntField(term2347, term2347.getClass(), "startAddress", 991356662);
        setIntField(term2347, term2347.getClass(), "endAddress", -506958186);
        setLongField(term2350, term2350.getClass(), "clockPeriodInNs", 1000L);
        setField(term2350, term2350.getClass(), "behavior", enum5);
        setField(term2350, term2350.getClass(), "bus", null);
        setField(term2350, term2350.getClass(), "state", null);
        setLongField(term2350, term2350.getClass(), "opBeginTime", 5262507301787091109L);
        setField(term2347, term2347.getClass(), "cpu", term2350);
        setField(term2347, term2347.getClass(), "deviceMap", term2353);
        setField(term2347, term2347.getClass(), "deviceAddressArray", term2358);
        setField(term2345, term2345.getClass(), "bus", term2347);
        setIntField(term2359, term2359.getClass(), "a", 0);
        setIntField(term2359, term2359.getClass(), "x", 0);
        setIntField(term2359, term2359.getClass(), "y", 0);
        setIntField(term2359, term2359.getClass(), "sp", 0);
        setIntField(term2359, term2359.getClass(), "pc", 0);
        setIntField(term2359, term2359.getClass(), "ir", 0);
        setIntField(term2359, term2359.getClass(), "nextIr", 0);
        setField(term2359, term2359.getClass(), "args", term2367);
        setField(term2359, term2359.getClass(), "nextArgs", term2370);
        setIntField(term2359, term2359.getClass(), "instSize", 0);
        setBooleanField(term2359, term2359.getClass(), "opTrap", false);
        setBooleanField(term2359, term2359.getClass(), "irqAsserted", false);
        setBooleanField(term2359, term2359.getClass(), "nmiAsserted", false);
        setIntField(term2359, term2359.getClass(), "lastPc", 0);
        setBooleanField(term2359, term2359.getClass(), "carryFlag", false);
        setBooleanField(term2359, term2359.getClass(), "negativeFlag", false);
        setBooleanField(term2359, term2359.getClass(), "zeroFlag", false);
        setBooleanField(term2359, term2359.getClass(), "irqDisableFlag", false);
        setBooleanField(term2359, term2359.getClass(), "decimalModeFlag", false);
        setBooleanField(term2359, term2359.getClass(), "breakFlag", false);
        setBooleanField(term2359, term2359.getClass(), "overflowFlag", false);
        setLongField(term2359, term2359.getClass(), "stepCounter", 0L);
        setField(term2345, term2345.getClass(), "state", term2359);
        setLongField(term2345, term2345.getClass(), "opBeginTime", -6823727938421990489L);
        setField(term2342, term2342.getClass(), "cpu", term2345);
        setField(term2342, term2342.getClass(), "deviceMap", term2387);
        setField(term2342, term2342.getClass(), "deviceAddressArray", term2392);
        setField(term2246, term2246.getClass(), "bus", term2342);
        setField(term2246, term2246.getClass(), "deviceChangeListeners", term2393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHorizontalDisplayed", argTypes, term2246, args);
    }

};


