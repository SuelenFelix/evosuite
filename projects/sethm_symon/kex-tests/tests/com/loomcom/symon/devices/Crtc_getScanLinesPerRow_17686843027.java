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

public class Crtc_getScanLinesPerRow_17686843027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3149;

    public Crtc_getScanLinesPerRow_17686843027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3319 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term3318 = ((Class) term3319).getDeclaredField((String) "NMOS_6502");
        ((Field) term3318).setAccessible(true);
        Object enum7 = ((Field) term3318).get((Object) null);
        HashMap term3217 = new HashMap();
        HashMap term3224 = new HashMap();
        Set<Object> term3582 =  ((Map) term3224).keySet();
        HashSet term3223 = new HashSet((Collection<? extends Object>) term3582);
        HashMap term3257 = new HashMap();
        HashMap term3291 = new HashMap();
        HashMap term3298 = new HashMap();
        Set<Object> term3597 =  ((Map) term3298).keySet();
        HashSet term3297 = new HashSet((Collection<? extends Object>) term3597);
        term3149 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term3164 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term3166 = (int[]) newIntArray(2);
        Object term3170 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term3185 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3188 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term3192 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3195 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term3222 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term3231 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term3246 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3249 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term3251 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3254 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term3262 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term3263 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term3271 = (int[]) newIntArray(2);
        int[] term3274 = (int[]) newIntArray(2);
        Object[] term3296 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        setIntField(term3149, term3149.getClass(), "horizontalDisplayed", 1270666529);
        setIntField(term3149, term3149.getClass(), "verticalDisplayed", -1146679443);
        setIntField(term3149, term3149.getClass(), "scanLinesPerRow", -860131894);
        setIntField(term3149, term3149.getClass(), "cursorStartLine", -1022990421);
        setBooleanField(term3149, term3149.getClass(), "cursorEnabled", true);
        setIntField(term3149, term3149.getClass(), "cursorBlinkRate", 1045547089);
        setIntField(term3149, term3149.getClass(), "cursorStopLine", -1122880881);
        setIntField(term3149, term3149.getClass(), "startAddress", -542712742);
        setIntField(term3149, term3149.getClass(), "cursorPosition", -1254072822);
        setIntField(term3149, term3149.getClass(), "pageSize", -1111249833);
        setIntField(term3149, term3149.getClass(), "currentRegister", -1692331299);
        setBooleanField(term3149, term3149.getClass(), "rowColumnAddressing", true);
        setBooleanField(term3149, term3149.getClass(), "displayEnableSkew", false);
        setBooleanField(term3149, term3149.getClass(), "cursorSkew", true);
        setBooleanField(term3164, term3164.getClass(), "readOnly", true);
        setIntElement(term3166, 0, 479531250);
        setIntElement(term3166, 1, 1320570890);
        setField(term3164, term3164.getClass(), "mem", term3166);
        setIntField(term3164, term3164.getClass(), "size", 534834644);
        setIntField(term3170, term3170.getClass(), "startAddress", 1959097203);
        setIntField(term3170, term3170.getClass(), "endAddress", -209654048);
        setField(term3164, term3164.getClass(), "memoryRange", term3170);
        setField(term3164, term3164.getClass(), "name", "LQFpaHEwXR");
        setIntField(term3185, term3185.getClass(), "startAddress", 477625804);
        setIntField(term3185, term3185.getClass(), "endAddress", 252575029);
        setLongField(term3188, term3188.getClass(), "clockPeriodInNs", 1000L);
        setField(term3188, term3188.getClass(), "behavior", enum7);
        setIntField(term3192, term3192.getClass(), "startAddress", 57189932);
        setIntField(term3192, term3192.getClass(), "endAddress", 1460722225);
        setField(term3192, term3192.getClass(), "cpu", null);
        setField(term3192, term3192.getClass(), "deviceMap", null);
        setField(term3192, term3192.getClass(), "deviceAddressArray", null);
        setField(term3188, term3188.getClass(), "bus", term3192);
        setIntField(term3195, term3195.getClass(), "a", 0);
        setIntField(term3195, term3195.getClass(), "x", 0);
        setIntField(term3195, term3195.getClass(), "y", 0);
        setIntField(term3195, term3195.getClass(), "sp", 0);
        setIntField(term3195, term3195.getClass(), "pc", 0);
        setIntField(term3195, term3195.getClass(), "ir", 0);
        setIntField(term3195, term3195.getClass(), "nextIr", 0);
        setField(term3195, term3195.getClass(), "args", null);
        setField(term3195, term3195.getClass(), "nextArgs", null);
        setIntField(term3195, term3195.getClass(), "instSize", 0);
        setBooleanField(term3195, term3195.getClass(), "opTrap", false);
        setBooleanField(term3195, term3195.getClass(), "irqAsserted", false);
        setBooleanField(term3195, term3195.getClass(), "nmiAsserted", false);
        setIntField(term3195, term3195.getClass(), "lastPc", 0);
        setBooleanField(term3195, term3195.getClass(), "carryFlag", false);
        setBooleanField(term3195, term3195.getClass(), "negativeFlag", false);
        setBooleanField(term3195, term3195.getClass(), "zeroFlag", false);
        setBooleanField(term3195, term3195.getClass(), "irqDisableFlag", false);
        setBooleanField(term3195, term3195.getClass(), "decimalModeFlag", false);
        setBooleanField(term3195, term3195.getClass(), "breakFlag", false);
        setBooleanField(term3195, term3195.getClass(), "overflowFlag", false);
        setLongField(term3195, term3195.getClass(), "stepCounter", 0L);
        setField(term3188, term3188.getClass(), "state", term3195);
        setLongField(term3188, term3188.getClass(), "opBeginTime", -6292278961887936280L);
        setField(term3185, term3185.getClass(), "cpu", term3188);
        setField(term3185, term3185.getClass(), "deviceMap", term3217);
        setField(term3185, term3185.getClass(), "deviceAddressArray", term3222);
        setField(term3164, term3164.getClass(), "bus", term3185);
        setField(term3164, term3164.getClass(), "deviceChangeListeners", term3223);
        setField(term3149, term3149.getClass(), "memory", term3164);
        setIntField(term3149, term3149.getClass(), "size", 1008080511);
        setIntField(term3231, term3231.getClass(), "startAddress", 1935707624);
        setIntField(term3231, term3231.getClass(), "endAddress", 1507074215);
        setField(term3149, term3149.getClass(), "memoryRange", term3231);
        setField(term3149, term3149.getClass(), "name", "oVcInYnLWB");
        setIntField(term3246, term3246.getClass(), "startAddress", -282881827);
        setIntField(term3246, term3246.getClass(), "endAddress", -1183353915);
        setLongField(term3249, term3249.getClass(), "clockPeriodInNs", 1000L);
        setField(term3249, term3249.getClass(), "behavior", enum7);
        setIntField(term3251, term3251.getClass(), "startAddress", -420030135);
        setIntField(term3251, term3251.getClass(), "endAddress", 267763294);
        setLongField(term3254, term3254.getClass(), "clockPeriodInNs", 1000L);
        setField(term3254, term3254.getClass(), "behavior", enum7);
        setField(term3254, term3254.getClass(), "bus", null);
        setField(term3254, term3254.getClass(), "state", null);
        setLongField(term3254, term3254.getClass(), "opBeginTime", 4784595517102746672L);
        setField(term3251, term3251.getClass(), "cpu", term3254);
        setField(term3251, term3251.getClass(), "deviceMap", term3257);
        setField(term3251, term3251.getClass(), "deviceAddressArray", term3262);
        setField(term3249, term3249.getClass(), "bus", term3251);
        setIntField(term3263, term3263.getClass(), "a", 0);
        setIntField(term3263, term3263.getClass(), "x", 0);
        setIntField(term3263, term3263.getClass(), "y", 0);
        setIntField(term3263, term3263.getClass(), "sp", 0);
        setIntField(term3263, term3263.getClass(), "pc", 0);
        setIntField(term3263, term3263.getClass(), "ir", 0);
        setIntField(term3263, term3263.getClass(), "nextIr", 0);
        setField(term3263, term3263.getClass(), "args", term3271);
        setField(term3263, term3263.getClass(), "nextArgs", term3274);
        setIntField(term3263, term3263.getClass(), "instSize", 0);
        setBooleanField(term3263, term3263.getClass(), "opTrap", false);
        setBooleanField(term3263, term3263.getClass(), "irqAsserted", false);
        setBooleanField(term3263, term3263.getClass(), "nmiAsserted", false);
        setIntField(term3263, term3263.getClass(), "lastPc", 0);
        setBooleanField(term3263, term3263.getClass(), "carryFlag", false);
        setBooleanField(term3263, term3263.getClass(), "negativeFlag", false);
        setBooleanField(term3263, term3263.getClass(), "zeroFlag", false);
        setBooleanField(term3263, term3263.getClass(), "irqDisableFlag", false);
        setBooleanField(term3263, term3263.getClass(), "decimalModeFlag", false);
        setBooleanField(term3263, term3263.getClass(), "breakFlag", false);
        setBooleanField(term3263, term3263.getClass(), "overflowFlag", false);
        setLongField(term3263, term3263.getClass(), "stepCounter", 0L);
        setField(term3249, term3249.getClass(), "state", term3263);
        setLongField(term3249, term3249.getClass(), "opBeginTime", -7612550318181586304L);
        setField(term3246, term3246.getClass(), "cpu", term3249);
        setField(term3246, term3246.getClass(), "deviceMap", term3291);
        setField(term3246, term3246.getClass(), "deviceAddressArray", term3296);
        setField(term3149, term3149.getClass(), "bus", term3246);
        setField(term3149, term3149.getClass(), "deviceChangeListeners", term3297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScanLinesPerRow", argTypes, term3149, args);
    }

};


