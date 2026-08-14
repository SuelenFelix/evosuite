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

public class Crtc_getCursorStartLine_21385105478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3598;

    public Crtc_getCursorStartLine_21385105478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3778 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term3777 = ((Class) term3778).getDeclaredField((String) "NMOS_6502");
        ((Field) term3777).setAccessible(true);
        Object enum8 = ((Field) term3777).get((Object) null);
        HashMap term3671 = new HashMap();
        HashMap term3678 = new HashMap();
        Set<Object> term4041 =  ((Map) term3678).keySet();
        HashSet term3677 = new HashSet((Collection<? extends Object>) term4041);
        HashMap term3711 = new HashMap();
        HashMap term3745 = new HashMap();
        HashMap term3752 = new HashMap();
        Set<Object> term4056 =  ((Map) term3752).keySet();
        HashSet term3751 = new HashSet((Collection<? extends Object>) term4056);
        term3598 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term3613 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term3615 = (int[]) newIntArray(7);
        Object term3624 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term3639 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3642 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term3646 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3649 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term3676 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term3685 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term3700 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3703 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term3705 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term3708 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term3716 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term3717 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term3725 = (int[]) newIntArray(2);
        int[] term3728 = (int[]) newIntArray(2);
        Object[] term3750 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term3598, term3598.getClass(), "horizontalDisplayed", 2058711405);
        setIntField(term3598, term3598.getClass(), "verticalDisplayed", 1743683601);
        setIntField(term3598, term3598.getClass(), "scanLinesPerRow", -945116798);
        setIntField(term3598, term3598.getClass(), "cursorStartLine", 1593461795);
        setBooleanField(term3598, term3598.getClass(), "cursorEnabled", true);
        setIntField(term3598, term3598.getClass(), "cursorBlinkRate", 515182546);
        setIntField(term3598, term3598.getClass(), "cursorStopLine", -936895502);
        setIntField(term3598, term3598.getClass(), "startAddress", -129547140);
        setIntField(term3598, term3598.getClass(), "cursorPosition", 199287428);
        setIntField(term3598, term3598.getClass(), "pageSize", -1195339592);
        setIntField(term3598, term3598.getClass(), "currentRegister", -376422566);
        setBooleanField(term3598, term3598.getClass(), "rowColumnAddressing", true);
        setBooleanField(term3598, term3598.getClass(), "displayEnableSkew", false);
        setBooleanField(term3598, term3598.getClass(), "cursorSkew", false);
        setBooleanField(term3613, term3613.getClass(), "readOnly", false);
        setIntElement(term3615, 0, 306847454);
        setIntElement(term3615, 1, 1745276158);
        setIntElement(term3615, 2, 2009020256);
        setIntElement(term3615, 3, 2049577015);
        setIntElement(term3615, 4, 1236004505);
        setIntElement(term3615, 5, 1050765721);
        setIntElement(term3615, 6, 474518942);
        setField(term3613, term3613.getClass(), "mem", term3615);
        setIntField(term3613, term3613.getClass(), "size", -249614216);
        setIntField(term3624, term3624.getClass(), "startAddress", 1870727665);
        setIntField(term3624, term3624.getClass(), "endAddress", -519881101);
        setField(term3613, term3613.getClass(), "memoryRange", term3624);
        setField(term3613, term3613.getClass(), "name", "aJlieCFVtF");
        setIntField(term3639, term3639.getClass(), "startAddress", -680920524);
        setIntField(term3639, term3639.getClass(), "endAddress", -916335264);
        setLongField(term3642, term3642.getClass(), "clockPeriodInNs", 1000L);
        setField(term3642, term3642.getClass(), "behavior", enum8);
        setIntField(term3646, term3646.getClass(), "startAddress", -919416536);
        setIntField(term3646, term3646.getClass(), "endAddress", -43417861);
        setField(term3646, term3646.getClass(), "cpu", null);
        setField(term3646, term3646.getClass(), "deviceMap", null);
        setField(term3646, term3646.getClass(), "deviceAddressArray", null);
        setField(term3642, term3642.getClass(), "bus", term3646);
        setIntField(term3649, term3649.getClass(), "a", 0);
        setIntField(term3649, term3649.getClass(), "x", 0);
        setIntField(term3649, term3649.getClass(), "y", 0);
        setIntField(term3649, term3649.getClass(), "sp", 0);
        setIntField(term3649, term3649.getClass(), "pc", 0);
        setIntField(term3649, term3649.getClass(), "ir", 0);
        setIntField(term3649, term3649.getClass(), "nextIr", 0);
        setField(term3649, term3649.getClass(), "args", null);
        setField(term3649, term3649.getClass(), "nextArgs", null);
        setIntField(term3649, term3649.getClass(), "instSize", 0);
        setBooleanField(term3649, term3649.getClass(), "opTrap", false);
        setBooleanField(term3649, term3649.getClass(), "irqAsserted", false);
        setBooleanField(term3649, term3649.getClass(), "nmiAsserted", false);
        setIntField(term3649, term3649.getClass(), "lastPc", 0);
        setBooleanField(term3649, term3649.getClass(), "carryFlag", false);
        setBooleanField(term3649, term3649.getClass(), "negativeFlag", false);
        setBooleanField(term3649, term3649.getClass(), "zeroFlag", false);
        setBooleanField(term3649, term3649.getClass(), "irqDisableFlag", false);
        setBooleanField(term3649, term3649.getClass(), "decimalModeFlag", false);
        setBooleanField(term3649, term3649.getClass(), "breakFlag", false);
        setBooleanField(term3649, term3649.getClass(), "overflowFlag", false);
        setLongField(term3649, term3649.getClass(), "stepCounter", 0L);
        setField(term3642, term3642.getClass(), "state", term3649);
        setLongField(term3642, term3642.getClass(), "opBeginTime", -4443169559037975007L);
        setField(term3639, term3639.getClass(), "cpu", term3642);
        setField(term3639, term3639.getClass(), "deviceMap", term3671);
        setField(term3639, term3639.getClass(), "deviceAddressArray", term3676);
        setField(term3613, term3613.getClass(), "bus", term3639);
        setField(term3613, term3613.getClass(), "deviceChangeListeners", term3677);
        setField(term3598, term3598.getClass(), "memory", term3613);
        setIntField(term3598, term3598.getClass(), "size", -1467089634);
        setIntField(term3685, term3685.getClass(), "startAddress", 413548937);
        setIntField(term3685, term3685.getClass(), "endAddress", 1901317214);
        setField(term3598, term3598.getClass(), "memoryRange", term3685);
        setField(term3598, term3598.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term3700, term3700.getClass(), "startAddress", 1166710220);
        setIntField(term3700, term3700.getClass(), "endAddress", -1070592289);
        setLongField(term3703, term3703.getClass(), "clockPeriodInNs", 1000L);
        setField(term3703, term3703.getClass(), "behavior", enum8);
        setIntField(term3705, term3705.getClass(), "startAddress", -1464172784);
        setIntField(term3705, term3705.getClass(), "endAddress", 32185364);
        setLongField(term3708, term3708.getClass(), "clockPeriodInNs", 1000L);
        setField(term3708, term3708.getClass(), "behavior", enum8);
        setField(term3708, term3708.getClass(), "bus", null);
        setField(term3708, term3708.getClass(), "state", null);
        setLongField(term3708, term3708.getClass(), "opBeginTime", -5788180182343976541L);
        setField(term3705, term3705.getClass(), "cpu", term3708);
        setField(term3705, term3705.getClass(), "deviceMap", term3711);
        setField(term3705, term3705.getClass(), "deviceAddressArray", term3716);
        setField(term3703, term3703.getClass(), "bus", term3705);
        setIntField(term3717, term3717.getClass(), "a", 0);
        setIntField(term3717, term3717.getClass(), "x", 0);
        setIntField(term3717, term3717.getClass(), "y", 0);
        setIntField(term3717, term3717.getClass(), "sp", 0);
        setIntField(term3717, term3717.getClass(), "pc", 0);
        setIntField(term3717, term3717.getClass(), "ir", 0);
        setIntField(term3717, term3717.getClass(), "nextIr", 0);
        setField(term3717, term3717.getClass(), "args", term3725);
        setField(term3717, term3717.getClass(), "nextArgs", term3728);
        setIntField(term3717, term3717.getClass(), "instSize", 0);
        setBooleanField(term3717, term3717.getClass(), "opTrap", false);
        setBooleanField(term3717, term3717.getClass(), "irqAsserted", false);
        setBooleanField(term3717, term3717.getClass(), "nmiAsserted", false);
        setIntField(term3717, term3717.getClass(), "lastPc", 0);
        setBooleanField(term3717, term3717.getClass(), "carryFlag", false);
        setBooleanField(term3717, term3717.getClass(), "negativeFlag", false);
        setBooleanField(term3717, term3717.getClass(), "zeroFlag", false);
        setBooleanField(term3717, term3717.getClass(), "irqDisableFlag", false);
        setBooleanField(term3717, term3717.getClass(), "decimalModeFlag", false);
        setBooleanField(term3717, term3717.getClass(), "breakFlag", false);
        setBooleanField(term3717, term3717.getClass(), "overflowFlag", false);
        setLongField(term3717, term3717.getClass(), "stepCounter", 0L);
        setField(term3703, term3703.getClass(), "state", term3717);
        setLongField(term3703, term3703.getClass(), "opBeginTime", 2936323121573284007L);
        setField(term3700, term3700.getClass(), "cpu", term3703);
        setField(term3700, term3700.getClass(), "deviceMap", term3745);
        setField(term3700, term3700.getClass(), "deviceAddressArray", term3750);
        setField(term3598, term3598.getClass(), "bus", term3700);
        setField(term3598, term3598.getClass(), "deviceChangeListeners", term3751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorStartLine", argTypes, term3598, args);
    }

};


