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

public class Crtc_getPageSize_47979419314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6349;

    public Crtc_getPageSize_47979419314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6519 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term6518 = ((Class) term6519).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term6518).setAccessible(true);
        Object enum14 = ((Field) term6518).get((Object) null);
        HashMap term6417 = new HashMap();
        HashMap term6424 = new HashMap();
        Set<Object> term6806 =  ((Map) term6424).keySet();
        HashSet term6423 = new HashSet((Collection<? extends Object>) term6806);
        HashMap term6457 = new HashMap();
        HashMap term6491 = new HashMap();
        HashMap term6498 = new HashMap();
        Set<Object> term6821 =  ((Map) term6498).keySet();
        HashSet term6497 = new HashSet((Collection<? extends Object>) term6821);
        term6349 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term6364 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term6366 = (int[]) newIntArray(2);
        Object term6370 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term6385 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6388 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term6392 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6395 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term6422 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term6431 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term6446 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6449 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term6451 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6454 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term6462 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term6463 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term6471 = (int[]) newIntArray(2);
        int[] term6474 = (int[]) newIntArray(2);
        Object[] term6496 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term6349, term6349.getClass(), "horizontalDisplayed", 1964967720);
        setIntField(term6349, term6349.getClass(), "verticalDisplayed", 1351900243);
        setIntField(term6349, term6349.getClass(), "scanLinesPerRow", -330897705);
        setIntField(term6349, term6349.getClass(), "cursorStartLine", 1065595802);
        setBooleanField(term6349, term6349.getClass(), "cursorEnabled", true);
        setIntField(term6349, term6349.getClass(), "cursorBlinkRate", 21031843);
        setIntField(term6349, term6349.getClass(), "cursorStopLine", -380787857);
        setIntField(term6349, term6349.getClass(), "startAddress", 319853052);
        setIntField(term6349, term6349.getClass(), "cursorPosition", -1097563716);
        setIntField(term6349, term6349.getClass(), "pageSize", 1572907769);
        setIntField(term6349, term6349.getClass(), "currentRegister", 1608016787);
        setBooleanField(term6349, term6349.getClass(), "rowColumnAddressing", true);
        setBooleanField(term6349, term6349.getClass(), "displayEnableSkew", false);
        setBooleanField(term6349, term6349.getClass(), "cursorSkew", false);
        setBooleanField(term6364, term6364.getClass(), "readOnly", false);
        setIntElement(term6366, 0, -516303035);
        setIntElement(term6366, 1, -2143043890);
        setField(term6364, term6364.getClass(), "mem", term6366);
        setIntField(term6364, term6364.getClass(), "size", 1454781562);
        setIntField(term6370, term6370.getClass(), "startAddress", -27944011);
        setIntField(term6370, term6370.getClass(), "endAddress", -20614472);
        setField(term6364, term6364.getClass(), "memoryRange", term6370);
        setField(term6364, term6364.getClass(), "name", "OclPbYPkcH");
        setIntField(term6385, term6385.getClass(), "startAddress", 1126618861);
        setIntField(term6385, term6385.getClass(), "endAddress", 947449400);
        setLongField(term6388, term6388.getClass(), "clockPeriodInNs", 1000L);
        setField(term6388, term6388.getClass(), "behavior", enum14);
        setIntField(term6392, term6392.getClass(), "startAddress", -763799087);
        setIntField(term6392, term6392.getClass(), "endAddress", 1207142014);
        setField(term6392, term6392.getClass(), "cpu", null);
        setField(term6392, term6392.getClass(), "deviceMap", null);
        setField(term6392, term6392.getClass(), "deviceAddressArray", null);
        setField(term6388, term6388.getClass(), "bus", term6392);
        setIntField(term6395, term6395.getClass(), "a", 0);
        setIntField(term6395, term6395.getClass(), "x", 0);
        setIntField(term6395, term6395.getClass(), "y", 0);
        setIntField(term6395, term6395.getClass(), "sp", 0);
        setIntField(term6395, term6395.getClass(), "pc", 0);
        setIntField(term6395, term6395.getClass(), "ir", 0);
        setIntField(term6395, term6395.getClass(), "nextIr", 0);
        setField(term6395, term6395.getClass(), "args", null);
        setField(term6395, term6395.getClass(), "nextArgs", null);
        setIntField(term6395, term6395.getClass(), "instSize", 0);
        setBooleanField(term6395, term6395.getClass(), "opTrap", false);
        setBooleanField(term6395, term6395.getClass(), "irqAsserted", false);
        setBooleanField(term6395, term6395.getClass(), "nmiAsserted", false);
        setIntField(term6395, term6395.getClass(), "lastPc", 0);
        setBooleanField(term6395, term6395.getClass(), "carryFlag", false);
        setBooleanField(term6395, term6395.getClass(), "negativeFlag", false);
        setBooleanField(term6395, term6395.getClass(), "zeroFlag", false);
        setBooleanField(term6395, term6395.getClass(), "irqDisableFlag", false);
        setBooleanField(term6395, term6395.getClass(), "decimalModeFlag", false);
        setBooleanField(term6395, term6395.getClass(), "breakFlag", false);
        setBooleanField(term6395, term6395.getClass(), "overflowFlag", false);
        setLongField(term6395, term6395.getClass(), "stepCounter", 0L);
        setField(term6388, term6388.getClass(), "state", term6395);
        setLongField(term6388, term6388.getClass(), "opBeginTime", -8652538484981166496L);
        setField(term6385, term6385.getClass(), "cpu", term6388);
        setField(term6385, term6385.getClass(), "deviceMap", term6417);
        setField(term6385, term6385.getClass(), "deviceAddressArray", term6422);
        setField(term6364, term6364.getClass(), "bus", term6385);
        setField(term6364, term6364.getClass(), "deviceChangeListeners", term6423);
        setField(term6349, term6349.getClass(), "memory", term6364);
        setIntField(term6349, term6349.getClass(), "size", 330043745);
        setIntField(term6431, term6431.getClass(), "startAddress", -509349195);
        setIntField(term6431, term6431.getClass(), "endAddress", -1639041228);
        setField(term6349, term6349.getClass(), "memoryRange", term6431);
        setField(term6349, term6349.getClass(), "name", "IoAlmYsBwc");
        setIntField(term6446, term6446.getClass(), "startAddress", 2027686272);
        setIntField(term6446, term6446.getClass(), "endAddress", -1494356104);
        setLongField(term6449, term6449.getClass(), "clockPeriodInNs", 1000L);
        setField(term6449, term6449.getClass(), "behavior", enum14);
        setIntField(term6451, term6451.getClass(), "startAddress", -695279311);
        setIntField(term6451, term6451.getClass(), "endAddress", 114279242);
        setLongField(term6454, term6454.getClass(), "clockPeriodInNs", 1000L);
        setField(term6454, term6454.getClass(), "behavior", enum14);
        setField(term6454, term6454.getClass(), "bus", null);
        setField(term6454, term6454.getClass(), "state", null);
        setLongField(term6454, term6454.getClass(), "opBeginTime", 4474998035090263139L);
        setField(term6451, term6451.getClass(), "cpu", term6454);
        setField(term6451, term6451.getClass(), "deviceMap", term6457);
        setField(term6451, term6451.getClass(), "deviceAddressArray", term6462);
        setField(term6449, term6449.getClass(), "bus", term6451);
        setIntField(term6463, term6463.getClass(), "a", 0);
        setIntField(term6463, term6463.getClass(), "x", 0);
        setIntField(term6463, term6463.getClass(), "y", 0);
        setIntField(term6463, term6463.getClass(), "sp", 0);
        setIntField(term6463, term6463.getClass(), "pc", 0);
        setIntField(term6463, term6463.getClass(), "ir", 0);
        setIntField(term6463, term6463.getClass(), "nextIr", 0);
        setField(term6463, term6463.getClass(), "args", term6471);
        setField(term6463, term6463.getClass(), "nextArgs", term6474);
        setIntField(term6463, term6463.getClass(), "instSize", 0);
        setBooleanField(term6463, term6463.getClass(), "opTrap", false);
        setBooleanField(term6463, term6463.getClass(), "irqAsserted", false);
        setBooleanField(term6463, term6463.getClass(), "nmiAsserted", false);
        setIntField(term6463, term6463.getClass(), "lastPc", 0);
        setBooleanField(term6463, term6463.getClass(), "carryFlag", false);
        setBooleanField(term6463, term6463.getClass(), "negativeFlag", false);
        setBooleanField(term6463, term6463.getClass(), "zeroFlag", false);
        setBooleanField(term6463, term6463.getClass(), "irqDisableFlag", false);
        setBooleanField(term6463, term6463.getClass(), "decimalModeFlag", false);
        setBooleanField(term6463, term6463.getClass(), "breakFlag", false);
        setBooleanField(term6463, term6463.getClass(), "overflowFlag", false);
        setLongField(term6463, term6463.getClass(), "stepCounter", 0L);
        setField(term6449, term6449.getClass(), "state", term6463);
        setLongField(term6449, term6449.getClass(), "opBeginTime", 2848819812340321742L);
        setField(term6446, term6446.getClass(), "cpu", term6449);
        setField(term6446, term6446.getClass(), "deviceMap", term6491);
        setField(term6446, term6446.getClass(), "deviceAddressArray", term6496);
        setField(term6349, term6349.getClass(), "bus", term6446);
        setField(term6349, term6349.getClass(), "deviceChangeListeners", term6497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term6349, args);
    }

};


