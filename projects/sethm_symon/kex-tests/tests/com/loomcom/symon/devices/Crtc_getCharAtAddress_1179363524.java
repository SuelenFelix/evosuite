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

public class Crtc_getCharAtAddress_1179363524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1796;
     Object term1951;

    public Crtc_getCharAtAddress_1179363524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1964 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term1963 = ((Class) term1964).getDeclaredField((String) "CMOS_65816");
        ((Field) term1963).setAccessible(true);
        Object enum4 = ((Field) term1963).get((Object) null);
        HashMap term1862 = new HashMap();
        HashMap term1869 = new HashMap();
        Set<Object> term2230 =  ((Map) term1869).keySet();
        HashSet term1868 = new HashSet((Collection<? extends Object>) term2230);
        HashMap term1902 = new HashMap();
        HashMap term1936 = new HashMap();
        HashMap term1943 = new HashMap();
        Set<Object> term2245 =  ((Map) term1943).keySet();
        HashSet term1942 = new HashSet((Collection<? extends Object>) term2245);
        term1796 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term1811 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term1813 = (int[]) newIntArray(0);
        Object term1815 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term1830 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1833 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term1837 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1840 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term1867 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term1876 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term1891 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1894 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term1896 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1899 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term1907 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term1908 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term1916 = (int[]) newIntArray(2);
        int[] term1919 = (int[]) newIntArray(2);
        Object[] term1941 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term1796, term1796.getClass(), "horizontalDisplayed", 568954359);
        setIntField(term1796, term1796.getClass(), "verticalDisplayed", 53410913);
        setIntField(term1796, term1796.getClass(), "scanLinesPerRow", -375014958);
        setIntField(term1796, term1796.getClass(), "cursorStartLine", 1107176718);
        setBooleanField(term1796, term1796.getClass(), "cursorEnabled", true);
        setIntField(term1796, term1796.getClass(), "cursorBlinkRate", 480137250);
        setIntField(term1796, term1796.getClass(), "cursorStopLine", -341152642);
        setIntField(term1796, term1796.getClass(), "startAddress", -2015854073);
        setIntField(term1796, term1796.getClass(), "cursorPosition", 538259104);
        setIntField(term1796, term1796.getClass(), "pageSize", 96566506);
        setIntField(term1796, term1796.getClass(), "currentRegister", -343325701);
        setBooleanField(term1796, term1796.getClass(), "rowColumnAddressing", false);
        setBooleanField(term1796, term1796.getClass(), "displayEnableSkew", false);
        setBooleanField(term1796, term1796.getClass(), "cursorSkew", true);
        setBooleanField(term1811, term1811.getClass(), "readOnly", true);
        setField(term1811, term1811.getClass(), "mem", term1813);
        setIntField(term1811, term1811.getClass(), "size", -1963464809);
        setIntField(term1815, term1815.getClass(), "startAddress", 71190297);
        setIntField(term1815, term1815.getClass(), "endAddress", 1202361360);
        setField(term1811, term1811.getClass(), "memoryRange", term1815);
        setField(term1811, term1811.getClass(), "name", "MjGYSRKTNF");
        setIntField(term1830, term1830.getClass(), "startAddress", -2015048153);
        setIntField(term1830, term1830.getClass(), "endAddress", -2063457669);
        setLongField(term1833, term1833.getClass(), "clockPeriodInNs", 1000L);
        setField(term1833, term1833.getClass(), "behavior", enum4);
        setIntField(term1837, term1837.getClass(), "startAddress", -1222006000);
        setIntField(term1837, term1837.getClass(), "endAddress", 2095798786);
        setField(term1837, term1837.getClass(), "cpu", null);
        setField(term1837, term1837.getClass(), "deviceMap", null);
        setField(term1837, term1837.getClass(), "deviceAddressArray", null);
        setField(term1833, term1833.getClass(), "bus", term1837);
        setIntField(term1840, term1840.getClass(), "a", 0);
        setIntField(term1840, term1840.getClass(), "x", 0);
        setIntField(term1840, term1840.getClass(), "y", 0);
        setIntField(term1840, term1840.getClass(), "sp", 0);
        setIntField(term1840, term1840.getClass(), "pc", 0);
        setIntField(term1840, term1840.getClass(), "ir", 0);
        setIntField(term1840, term1840.getClass(), "nextIr", 0);
        setField(term1840, term1840.getClass(), "args", null);
        setField(term1840, term1840.getClass(), "nextArgs", null);
        setIntField(term1840, term1840.getClass(), "instSize", 0);
        setBooleanField(term1840, term1840.getClass(), "opTrap", false);
        setBooleanField(term1840, term1840.getClass(), "irqAsserted", false);
        setBooleanField(term1840, term1840.getClass(), "nmiAsserted", false);
        setIntField(term1840, term1840.getClass(), "lastPc", 0);
        setBooleanField(term1840, term1840.getClass(), "carryFlag", false);
        setBooleanField(term1840, term1840.getClass(), "negativeFlag", false);
        setBooleanField(term1840, term1840.getClass(), "zeroFlag", false);
        setBooleanField(term1840, term1840.getClass(), "irqDisableFlag", false);
        setBooleanField(term1840, term1840.getClass(), "decimalModeFlag", false);
        setBooleanField(term1840, term1840.getClass(), "breakFlag", false);
        setBooleanField(term1840, term1840.getClass(), "overflowFlag", false);
        setLongField(term1840, term1840.getClass(), "stepCounter", 0L);
        setField(term1833, term1833.getClass(), "state", term1840);
        setLongField(term1833, term1833.getClass(), "opBeginTime", 2486810210675247493L);
        setField(term1830, term1830.getClass(), "cpu", term1833);
        setField(term1830, term1830.getClass(), "deviceMap", term1862);
        setField(term1830, term1830.getClass(), "deviceAddressArray", term1867);
        setField(term1811, term1811.getClass(), "bus", term1830);
        setField(term1811, term1811.getClass(), "deviceChangeListeners", term1868);
        setField(term1796, term1796.getClass(), "memory", term1811);
        setIntField(term1796, term1796.getClass(), "size", 9726679);
        setIntField(term1876, term1876.getClass(), "startAddress", -25637976);
        setIntField(term1876, term1876.getClass(), "endAddress", 1555897383);
        setField(term1796, term1796.getClass(), "memoryRange", term1876);
        setField(term1796, term1796.getClass(), "name", "hRNSzYYIrc");
        setIntField(term1891, term1891.getClass(), "startAddress", 202001407);
        setIntField(term1891, term1891.getClass(), "endAddress", 158873461);
        setLongField(term1894, term1894.getClass(), "clockPeriodInNs", 1000L);
        setField(term1894, term1894.getClass(), "behavior", enum4);
        setIntField(term1896, term1896.getClass(), "startAddress", -430151637);
        setIntField(term1896, term1896.getClass(), "endAddress", -1697741339);
        setLongField(term1899, term1899.getClass(), "clockPeriodInNs", 1000L);
        setField(term1899, term1899.getClass(), "behavior", enum4);
        setField(term1899, term1899.getClass(), "bus", null);
        setField(term1899, term1899.getClass(), "state", null);
        setLongField(term1899, term1899.getClass(), "opBeginTime", -7672528020740371001L);
        setField(term1896, term1896.getClass(), "cpu", term1899);
        setField(term1896, term1896.getClass(), "deviceMap", term1902);
        setField(term1896, term1896.getClass(), "deviceAddressArray", term1907);
        setField(term1894, term1894.getClass(), "bus", term1896);
        setIntField(term1908, term1908.getClass(), "a", 0);
        setIntField(term1908, term1908.getClass(), "x", 0);
        setIntField(term1908, term1908.getClass(), "y", 0);
        setIntField(term1908, term1908.getClass(), "sp", 0);
        setIntField(term1908, term1908.getClass(), "pc", 0);
        setIntField(term1908, term1908.getClass(), "ir", 0);
        setIntField(term1908, term1908.getClass(), "nextIr", 0);
        setField(term1908, term1908.getClass(), "args", term1916);
        setField(term1908, term1908.getClass(), "nextArgs", term1919);
        setIntField(term1908, term1908.getClass(), "instSize", 0);
        setBooleanField(term1908, term1908.getClass(), "opTrap", false);
        setBooleanField(term1908, term1908.getClass(), "irqAsserted", false);
        setBooleanField(term1908, term1908.getClass(), "nmiAsserted", false);
        setIntField(term1908, term1908.getClass(), "lastPc", 0);
        setBooleanField(term1908, term1908.getClass(), "carryFlag", false);
        setBooleanField(term1908, term1908.getClass(), "negativeFlag", false);
        setBooleanField(term1908, term1908.getClass(), "zeroFlag", false);
        setBooleanField(term1908, term1908.getClass(), "irqDisableFlag", false);
        setBooleanField(term1908, term1908.getClass(), "decimalModeFlag", false);
        setBooleanField(term1908, term1908.getClass(), "breakFlag", false);
        setBooleanField(term1908, term1908.getClass(), "overflowFlag", false);
        setLongField(term1908, term1908.getClass(), "stepCounter", 0L);
        setField(term1894, term1894.getClass(), "state", term1908);
        setLongField(term1894, term1894.getClass(), "opBeginTime", -4502405999831680926L);
        setField(term1891, term1891.getClass(), "cpu", term1894);
        setField(term1891, term1891.getClass(), "deviceMap", term1936);
        setField(term1891, term1891.getClass(), "deviceAddressArray", term1941);
        setField(term1796, term1796.getClass(), "bus", term1891);
        setField(term1796, term1796.getClass(), "deviceChangeListeners", term1942);
        term1951 = new Integer(1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1951;
        callMethod(klass, "getCharAtAddress", argTypes, term1796, args);
    }

};


