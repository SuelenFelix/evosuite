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

public class Crtc_getStartAddress_123110644712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5432;

    public Crtc_getStartAddress_123110644712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5605 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term5604 = ((Class) term5605).getDeclaredField((String) "NMOS_6502");
        ((Field) term5604).setAccessible(true);
        Object enum12 = ((Field) term5604).get((Object) null);
        HashMap term5503 = new HashMap();
        HashMap term5510 = new HashMap();
        Set<Object> term5868 =  ((Map) term5510).keySet();
        HashSet term5509 = new HashSet((Collection<? extends Object>) term5868);
        HashMap term5543 = new HashMap();
        HashMap term5577 = new HashMap();
        HashMap term5584 = new HashMap();
        Set<Object> term5883 =  ((Map) term5584).keySet();
        HashSet term5583 = new HashSet((Collection<? extends Object>) term5883);
        term5432 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term5447 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term5449 = (int[]) newIntArray(5);
        Object term5456 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5471 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5474 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5478 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5481 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term5508 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term5517 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5532 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5535 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5537 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5540 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term5548 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term5549 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term5557 = (int[]) newIntArray(2);
        int[] term5560 = (int[]) newIntArray(2);
        Object[] term5582 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term5432, term5432.getClass(), "horizontalDisplayed", -1284825282);
        setIntField(term5432, term5432.getClass(), "verticalDisplayed", -1941343035);
        setIntField(term5432, term5432.getClass(), "scanLinesPerRow", 947897214);
        setIntField(term5432, term5432.getClass(), "cursorStartLine", 1496340209);
        setBooleanField(term5432, term5432.getClass(), "cursorEnabled", true);
        setIntField(term5432, term5432.getClass(), "cursorBlinkRate", -1748391876);
        setIntField(term5432, term5432.getClass(), "cursorStopLine", 43258317);
        setIntField(term5432, term5432.getClass(), "startAddress", 1707220033);
        setIntField(term5432, term5432.getClass(), "cursorPosition", -1792504217);
        setIntField(term5432, term5432.getClass(), "pageSize", 1824538861);
        setIntField(term5432, term5432.getClass(), "currentRegister", 499519708);
        setBooleanField(term5432, term5432.getClass(), "rowColumnAddressing", false);
        setBooleanField(term5432, term5432.getClass(), "displayEnableSkew", false);
        setBooleanField(term5432, term5432.getClass(), "cursorSkew", false);
        setBooleanField(term5447, term5447.getClass(), "readOnly", false);
        setIntElement(term5449, 0, 1501165033);
        setIntElement(term5449, 1, 510162332);
        setIntElement(term5449, 2, 888506903);
        setIntElement(term5449, 3, 200252898);
        setIntElement(term5449, 4, -1831826725);
        setField(term5447, term5447.getClass(), "mem", term5449);
        setIntField(term5447, term5447.getClass(), "size", -1577069773);
        setIntField(term5456, term5456.getClass(), "startAddress", -266625190);
        setIntField(term5456, term5456.getClass(), "endAddress", 489201218);
        setField(term5447, term5447.getClass(), "memoryRange", term5456);
        setField(term5447, term5447.getClass(), "name", "eZFUvlxvGV");
        setIntField(term5471, term5471.getClass(), "startAddress", 464181937);
        setIntField(term5471, term5471.getClass(), "endAddress", -1455526612);
        setLongField(term5474, term5474.getClass(), "clockPeriodInNs", 1000L);
        setField(term5474, term5474.getClass(), "behavior", enum12);
        setIntField(term5478, term5478.getClass(), "startAddress", -941356098);
        setIntField(term5478, term5478.getClass(), "endAddress", -201517446);
        setField(term5478, term5478.getClass(), "cpu", null);
        setField(term5478, term5478.getClass(), "deviceMap", null);
        setField(term5478, term5478.getClass(), "deviceAddressArray", null);
        setField(term5474, term5474.getClass(), "bus", term5478);
        setIntField(term5481, term5481.getClass(), "a", 0);
        setIntField(term5481, term5481.getClass(), "x", 0);
        setIntField(term5481, term5481.getClass(), "y", 0);
        setIntField(term5481, term5481.getClass(), "sp", 0);
        setIntField(term5481, term5481.getClass(), "pc", 0);
        setIntField(term5481, term5481.getClass(), "ir", 0);
        setIntField(term5481, term5481.getClass(), "nextIr", 0);
        setField(term5481, term5481.getClass(), "args", null);
        setField(term5481, term5481.getClass(), "nextArgs", null);
        setIntField(term5481, term5481.getClass(), "instSize", 0);
        setBooleanField(term5481, term5481.getClass(), "opTrap", false);
        setBooleanField(term5481, term5481.getClass(), "irqAsserted", false);
        setBooleanField(term5481, term5481.getClass(), "nmiAsserted", false);
        setIntField(term5481, term5481.getClass(), "lastPc", 0);
        setBooleanField(term5481, term5481.getClass(), "carryFlag", false);
        setBooleanField(term5481, term5481.getClass(), "negativeFlag", false);
        setBooleanField(term5481, term5481.getClass(), "zeroFlag", false);
        setBooleanField(term5481, term5481.getClass(), "irqDisableFlag", false);
        setBooleanField(term5481, term5481.getClass(), "decimalModeFlag", false);
        setBooleanField(term5481, term5481.getClass(), "breakFlag", false);
        setBooleanField(term5481, term5481.getClass(), "overflowFlag", false);
        setLongField(term5481, term5481.getClass(), "stepCounter", 0L);
        setField(term5474, term5474.getClass(), "state", term5481);
        setLongField(term5474, term5474.getClass(), "opBeginTime", 41775768178052008L);
        setField(term5471, term5471.getClass(), "cpu", term5474);
        setField(term5471, term5471.getClass(), "deviceMap", term5503);
        setField(term5471, term5471.getClass(), "deviceAddressArray", term5508);
        setField(term5447, term5447.getClass(), "bus", term5471);
        setField(term5447, term5447.getClass(), "deviceChangeListeners", term5509);
        setField(term5432, term5432.getClass(), "memory", term5447);
        setIntField(term5432, term5432.getClass(), "size", 1374790203);
        setIntField(term5517, term5517.getClass(), "startAddress", 1160010161);
        setIntField(term5517, term5517.getClass(), "endAddress", -423900705);
        setField(term5432, term5432.getClass(), "memoryRange", term5517);
        setField(term5432, term5432.getClass(), "name", "BYqFIqCKAV");
        setIntField(term5532, term5532.getClass(), "startAddress", -525570815);
        setIntField(term5532, term5532.getClass(), "endAddress", 754055848);
        setLongField(term5535, term5535.getClass(), "clockPeriodInNs", 1000L);
        setField(term5535, term5535.getClass(), "behavior", enum12);
        setIntField(term5537, term5537.getClass(), "startAddress", -19246901);
        setIntField(term5537, term5537.getClass(), "endAddress", -370828664);
        setLongField(term5540, term5540.getClass(), "clockPeriodInNs", 1000L);
        setField(term5540, term5540.getClass(), "behavior", enum12);
        setField(term5540, term5540.getClass(), "bus", null);
        setField(term5540, term5540.getClass(), "state", null);
        setLongField(term5540, term5540.getClass(), "opBeginTime", 682356318767179819L);
        setField(term5537, term5537.getClass(), "cpu", term5540);
        setField(term5537, term5537.getClass(), "deviceMap", term5543);
        setField(term5537, term5537.getClass(), "deviceAddressArray", term5548);
        setField(term5535, term5535.getClass(), "bus", term5537);
        setIntField(term5549, term5549.getClass(), "a", 0);
        setIntField(term5549, term5549.getClass(), "x", 0);
        setIntField(term5549, term5549.getClass(), "y", 0);
        setIntField(term5549, term5549.getClass(), "sp", 0);
        setIntField(term5549, term5549.getClass(), "pc", 0);
        setIntField(term5549, term5549.getClass(), "ir", 0);
        setIntField(term5549, term5549.getClass(), "nextIr", 0);
        setField(term5549, term5549.getClass(), "args", term5557);
        setField(term5549, term5549.getClass(), "nextArgs", term5560);
        setIntField(term5549, term5549.getClass(), "instSize", 0);
        setBooleanField(term5549, term5549.getClass(), "opTrap", false);
        setBooleanField(term5549, term5549.getClass(), "irqAsserted", false);
        setBooleanField(term5549, term5549.getClass(), "nmiAsserted", false);
        setIntField(term5549, term5549.getClass(), "lastPc", 0);
        setBooleanField(term5549, term5549.getClass(), "carryFlag", false);
        setBooleanField(term5549, term5549.getClass(), "negativeFlag", false);
        setBooleanField(term5549, term5549.getClass(), "zeroFlag", false);
        setBooleanField(term5549, term5549.getClass(), "irqDisableFlag", false);
        setBooleanField(term5549, term5549.getClass(), "decimalModeFlag", false);
        setBooleanField(term5549, term5549.getClass(), "breakFlag", false);
        setBooleanField(term5549, term5549.getClass(), "overflowFlag", false);
        setLongField(term5549, term5549.getClass(), "stepCounter", 0L);
        setField(term5535, term5535.getClass(), "state", term5549);
        setLongField(term5535, term5535.getClass(), "opBeginTime", -7291743527973326814L);
        setField(term5532, term5532.getClass(), "cpu", term5535);
        setField(term5532, term5532.getClass(), "deviceMap", term5577);
        setField(term5532, term5532.getClass(), "deviceAddressArray", term5582);
        setField(term5432, term5432.getClass(), "bus", term5532);
        setField(term5432, term5432.getClass(), "deviceChangeListeners", term5583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartAddress", argTypes, term5432, args);
    }

};


