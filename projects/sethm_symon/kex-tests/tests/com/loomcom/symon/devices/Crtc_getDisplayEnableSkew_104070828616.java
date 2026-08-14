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

public class Crtc_getDisplayEnableSkew_104070828616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7273;

    public Crtc_getDisplayEnableSkew_104070828616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7451 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term7450 = ((Class) term7451).getDeclaredField((String) "CMOS_6502");
        ((Field) term7450).setAccessible(true);
        Object enum16 = ((Field) term7450).get((Object) null);
        HashMap term7345 = new HashMap();
        HashMap term7352 = new HashMap();
        Set<Object> term7714 =  ((Map) term7352).keySet();
        HashSet term7351 = new HashSet((Collection<? extends Object>) term7714);
        HashMap term7385 = new HashMap();
        HashMap term7419 = new HashMap();
        HashMap term7426 = new HashMap();
        Set<Object> term7729 =  ((Map) term7426).keySet();
        HashSet term7425 = new HashSet((Collection<? extends Object>) term7729);
        term7273 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term7288 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term7290 = (int[]) newIntArray(6);
        Object term7298 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term7313 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7316 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term7320 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7323 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term7350 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term7359 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term7374 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7377 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term7379 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7382 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term7390 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term7391 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term7399 = (int[]) newIntArray(2);
        int[] term7402 = (int[]) newIntArray(2);
        Object[] term7424 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term7273, term7273.getClass(), "horizontalDisplayed", 590451710);
        setIntField(term7273, term7273.getClass(), "verticalDisplayed", -1999787419);
        setIntField(term7273, term7273.getClass(), "scanLinesPerRow", -1224443634);
        setIntField(term7273, term7273.getClass(), "cursorStartLine", 1048451946);
        setBooleanField(term7273, term7273.getClass(), "cursorEnabled", false);
        setIntField(term7273, term7273.getClass(), "cursorBlinkRate", 5603560);
        setIntField(term7273, term7273.getClass(), "cursorStopLine", -1079020032);
        setIntField(term7273, term7273.getClass(), "startAddress", -1973791064);
        setIntField(term7273, term7273.getClass(), "cursorPosition", -2072158633);
        setIntField(term7273, term7273.getClass(), "pageSize", -355469363);
        setIntField(term7273, term7273.getClass(), "currentRegister", 1465188553);
        setBooleanField(term7273, term7273.getClass(), "rowColumnAddressing", false);
        setBooleanField(term7273, term7273.getClass(), "displayEnableSkew", true);
        setBooleanField(term7273, term7273.getClass(), "cursorSkew", false);
        setBooleanField(term7288, term7288.getClass(), "readOnly", false);
        setIntElement(term7290, 0, 1633913667);
        setIntElement(term7290, 1, 1292332296);
        setIntElement(term7290, 2, -1415256843);
        setIntElement(term7290, 3, 612177768);
        setIntElement(term7290, 4, -1626451656);
        setIntElement(term7290, 5, 173952451);
        setField(term7288, term7288.getClass(), "mem", term7290);
        setIntField(term7288, term7288.getClass(), "size", -1005024758);
        setIntField(term7298, term7298.getClass(), "startAddress", 2634669);
        setIntField(term7298, term7298.getClass(), "endAddress", -1912429941);
        setField(term7288, term7288.getClass(), "memoryRange", term7298);
        setField(term7288, term7288.getClass(), "name", "dWRymuLBtr");
        setIntField(term7313, term7313.getClass(), "startAddress", 1801052257);
        setIntField(term7313, term7313.getClass(), "endAddress", -2110556060);
        setLongField(term7316, term7316.getClass(), "clockPeriodInNs", 1000L);
        setField(term7316, term7316.getClass(), "behavior", enum16);
        setIntField(term7320, term7320.getClass(), "startAddress", 313459791);
        setIntField(term7320, term7320.getClass(), "endAddress", 752615112);
        setField(term7320, term7320.getClass(), "cpu", null);
        setField(term7320, term7320.getClass(), "deviceMap", null);
        setField(term7320, term7320.getClass(), "deviceAddressArray", null);
        setField(term7316, term7316.getClass(), "bus", term7320);
        setIntField(term7323, term7323.getClass(), "a", 0);
        setIntField(term7323, term7323.getClass(), "x", 0);
        setIntField(term7323, term7323.getClass(), "y", 0);
        setIntField(term7323, term7323.getClass(), "sp", 0);
        setIntField(term7323, term7323.getClass(), "pc", 0);
        setIntField(term7323, term7323.getClass(), "ir", 0);
        setIntField(term7323, term7323.getClass(), "nextIr", 0);
        setField(term7323, term7323.getClass(), "args", null);
        setField(term7323, term7323.getClass(), "nextArgs", null);
        setIntField(term7323, term7323.getClass(), "instSize", 0);
        setBooleanField(term7323, term7323.getClass(), "opTrap", false);
        setBooleanField(term7323, term7323.getClass(), "irqAsserted", false);
        setBooleanField(term7323, term7323.getClass(), "nmiAsserted", false);
        setIntField(term7323, term7323.getClass(), "lastPc", 0);
        setBooleanField(term7323, term7323.getClass(), "carryFlag", false);
        setBooleanField(term7323, term7323.getClass(), "negativeFlag", false);
        setBooleanField(term7323, term7323.getClass(), "zeroFlag", false);
        setBooleanField(term7323, term7323.getClass(), "irqDisableFlag", false);
        setBooleanField(term7323, term7323.getClass(), "decimalModeFlag", false);
        setBooleanField(term7323, term7323.getClass(), "breakFlag", false);
        setBooleanField(term7323, term7323.getClass(), "overflowFlag", false);
        setLongField(term7323, term7323.getClass(), "stepCounter", 0L);
        setField(term7316, term7316.getClass(), "state", term7323);
        setLongField(term7316, term7316.getClass(), "opBeginTime", 2135754395358000892L);
        setField(term7313, term7313.getClass(), "cpu", term7316);
        setField(term7313, term7313.getClass(), "deviceMap", term7345);
        setField(term7313, term7313.getClass(), "deviceAddressArray", term7350);
        setField(term7288, term7288.getClass(), "bus", term7313);
        setField(term7288, term7288.getClass(), "deviceChangeListeners", term7351);
        setField(term7273, term7273.getClass(), "memory", term7288);
        setIntField(term7273, term7273.getClass(), "size", 340719678);
        setIntField(term7359, term7359.getClass(), "startAddress", 299791142);
        setIntField(term7359, term7359.getClass(), "endAddress", 1862191391);
        setField(term7273, term7273.getClass(), "memoryRange", term7359);
        setField(term7273, term7273.getClass(), "name", "AijpHYOFuy");
        setIntField(term7374, term7374.getClass(), "startAddress", 1131398807);
        setIntField(term7374, term7374.getClass(), "endAddress", -344907703);
        setLongField(term7377, term7377.getClass(), "clockPeriodInNs", 1000L);
        setField(term7377, term7377.getClass(), "behavior", enum16);
        setIntField(term7379, term7379.getClass(), "startAddress", 824341437);
        setIntField(term7379, term7379.getClass(), "endAddress", -1794965320);
        setLongField(term7382, term7382.getClass(), "clockPeriodInNs", 1000L);
        setField(term7382, term7382.getClass(), "behavior", enum16);
        setField(term7382, term7382.getClass(), "bus", null);
        setField(term7382, term7382.getClass(), "state", null);
        setLongField(term7382, term7382.getClass(), "opBeginTime", 1672578078364590450L);
        setField(term7379, term7379.getClass(), "cpu", term7382);
        setField(term7379, term7379.getClass(), "deviceMap", term7385);
        setField(term7379, term7379.getClass(), "deviceAddressArray", term7390);
        setField(term7377, term7377.getClass(), "bus", term7379);
        setIntField(term7391, term7391.getClass(), "a", 0);
        setIntField(term7391, term7391.getClass(), "x", 0);
        setIntField(term7391, term7391.getClass(), "y", 0);
        setIntField(term7391, term7391.getClass(), "sp", 0);
        setIntField(term7391, term7391.getClass(), "pc", 0);
        setIntField(term7391, term7391.getClass(), "ir", 0);
        setIntField(term7391, term7391.getClass(), "nextIr", 0);
        setField(term7391, term7391.getClass(), "args", term7399);
        setField(term7391, term7391.getClass(), "nextArgs", term7402);
        setIntField(term7391, term7391.getClass(), "instSize", 0);
        setBooleanField(term7391, term7391.getClass(), "opTrap", false);
        setBooleanField(term7391, term7391.getClass(), "irqAsserted", false);
        setBooleanField(term7391, term7391.getClass(), "nmiAsserted", false);
        setIntField(term7391, term7391.getClass(), "lastPc", 0);
        setBooleanField(term7391, term7391.getClass(), "carryFlag", false);
        setBooleanField(term7391, term7391.getClass(), "negativeFlag", false);
        setBooleanField(term7391, term7391.getClass(), "zeroFlag", false);
        setBooleanField(term7391, term7391.getClass(), "irqDisableFlag", false);
        setBooleanField(term7391, term7391.getClass(), "decimalModeFlag", false);
        setBooleanField(term7391, term7391.getClass(), "breakFlag", false);
        setBooleanField(term7391, term7391.getClass(), "overflowFlag", false);
        setLongField(term7391, term7391.getClass(), "stepCounter", 0L);
        setField(term7377, term7377.getClass(), "state", term7391);
        setLongField(term7377, term7377.getClass(), "opBeginTime", 4949335493504695457L);
        setField(term7374, term7374.getClass(), "cpu", term7377);
        setField(term7374, term7374.getClass(), "deviceMap", term7419);
        setField(term7374, term7374.getClass(), "deviceAddressArray", term7424);
        setField(term7273, term7273.getClass(), "bus", term7374);
        setField(term7273, term7273.getClass(), "deviceChangeListeners", term7425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisplayEnableSkew", argTypes, term7273, args);
    }

};


