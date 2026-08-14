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

public class Crtc_getCursorBlinkRate_70997970510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4516;

    public Crtc_getCursorBlinkRate_70997970510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4697 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term4696 = ((Class) term4697).getDeclaredField((String) "CMOS_65816");
        ((Field) term4696).setAccessible(true);
        Object enum10 = ((Field) term4696).get((Object) null);
        HashMap term4590 = new HashMap();
        HashMap term4597 = new HashMap();
        Set<Object> term4963 =  ((Map) term4597).keySet();
        HashSet term4596 = new HashSet((Collection<? extends Object>) term4963);
        HashMap term4629 = new HashMap();
        HashMap term4663 = new HashMap();
        HashMap term4670 = new HashMap();
        Set<Object> term4978 =  ((Map) term4670).keySet();
        HashSet term4669 = new HashSet((Collection<? extends Object>) term4978);
        term4516 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term4531 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term4533 = (int[]) newIntArray(8);
        Object term4543 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term4558 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4561 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term4565 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4568 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term4595 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term4603 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term4618 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4621 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term4623 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4626 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term4634 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term4635 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term4643 = (int[]) newIntArray(2);
        int[] term4646 = (int[]) newIntArray(2);
        Object[] term4668 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term4516, term4516.getClass(), "horizontalDisplayed", 533197381);
        setIntField(term4516, term4516.getClass(), "verticalDisplayed", 1048271679);
        setIntField(term4516, term4516.getClass(), "scanLinesPerRow", -1529797673);
        setIntField(term4516, term4516.getClass(), "cursorStartLine", -868676396);
        setBooleanField(term4516, term4516.getClass(), "cursorEnabled", true);
        setIntField(term4516, term4516.getClass(), "cursorBlinkRate", 1922684808);
        setIntField(term4516, term4516.getClass(), "cursorStopLine", -2005784375);
        setIntField(term4516, term4516.getClass(), "startAddress", -288604325);
        setIntField(term4516, term4516.getClass(), "cursorPosition", -1268314569);
        setIntField(term4516, term4516.getClass(), "pageSize", 877649659);
        setIntField(term4516, term4516.getClass(), "currentRegister", -1332748804);
        setBooleanField(term4516, term4516.getClass(), "rowColumnAddressing", false);
        setBooleanField(term4516, term4516.getClass(), "displayEnableSkew", true);
        setBooleanField(term4516, term4516.getClass(), "cursorSkew", false);
        setBooleanField(term4531, term4531.getClass(), "readOnly", false);
        setIntElement(term4533, 0, 1774507971);
        setIntElement(term4533, 1, -1420269858);
        setIntElement(term4533, 2, -2119545015);
        setIntElement(term4533, 3, 1272542218);
        setIntElement(term4533, 4, 1209799204);
        setIntElement(term4533, 5, 1094107751);
        setIntElement(term4533, 6, 844222656);
        setIntElement(term4533, 7, -18216811);
        setField(term4531, term4531.getClass(), "mem", term4533);
        setIntField(term4531, term4531.getClass(), "size", 719656595);
        setIntField(term4543, term4543.getClass(), "startAddress", -1516995753);
        setIntField(term4543, term4543.getClass(), "endAddress", -390501023);
        setField(term4531, term4531.getClass(), "memoryRange", term4543);
        setField(term4531, term4531.getClass(), "name", "pCTimMblYc");
        setIntField(term4558, term4558.getClass(), "startAddress", -1667482829);
        setIntField(term4558, term4558.getClass(), "endAddress", 1116576792);
        setLongField(term4561, term4561.getClass(), "clockPeriodInNs", 1000L);
        setField(term4561, term4561.getClass(), "behavior", enum10);
        setIntField(term4565, term4565.getClass(), "startAddress", -942194446);
        setIntField(term4565, term4565.getClass(), "endAddress", -938508470);
        setField(term4565, term4565.getClass(), "cpu", null);
        setField(term4565, term4565.getClass(), "deviceMap", null);
        setField(term4565, term4565.getClass(), "deviceAddressArray", null);
        setField(term4561, term4561.getClass(), "bus", term4565);
        setIntField(term4568, term4568.getClass(), "a", 0);
        setIntField(term4568, term4568.getClass(), "x", 0);
        setIntField(term4568, term4568.getClass(), "y", 0);
        setIntField(term4568, term4568.getClass(), "sp", 0);
        setIntField(term4568, term4568.getClass(), "pc", 0);
        setIntField(term4568, term4568.getClass(), "ir", 0);
        setIntField(term4568, term4568.getClass(), "nextIr", 0);
        setField(term4568, term4568.getClass(), "args", null);
        setField(term4568, term4568.getClass(), "nextArgs", null);
        setIntField(term4568, term4568.getClass(), "instSize", 0);
        setBooleanField(term4568, term4568.getClass(), "opTrap", false);
        setBooleanField(term4568, term4568.getClass(), "irqAsserted", false);
        setBooleanField(term4568, term4568.getClass(), "nmiAsserted", false);
        setIntField(term4568, term4568.getClass(), "lastPc", 0);
        setBooleanField(term4568, term4568.getClass(), "carryFlag", false);
        setBooleanField(term4568, term4568.getClass(), "negativeFlag", false);
        setBooleanField(term4568, term4568.getClass(), "zeroFlag", false);
        setBooleanField(term4568, term4568.getClass(), "irqDisableFlag", false);
        setBooleanField(term4568, term4568.getClass(), "decimalModeFlag", false);
        setBooleanField(term4568, term4568.getClass(), "breakFlag", false);
        setBooleanField(term4568, term4568.getClass(), "overflowFlag", false);
        setLongField(term4568, term4568.getClass(), "stepCounter", 0L);
        setField(term4561, term4561.getClass(), "state", term4568);
        setLongField(term4561, term4561.getClass(), "opBeginTime", 5953383087795962419L);
        setField(term4558, term4558.getClass(), "cpu", term4561);
        setField(term4558, term4558.getClass(), "deviceMap", term4590);
        setField(term4558, term4558.getClass(), "deviceAddressArray", term4595);
        setField(term4531, term4531.getClass(), "bus", term4558);
        setField(term4531, term4531.getClass(), "deviceChangeListeners", term4596);
        setField(term4516, term4516.getClass(), "memory", term4531);
        setIntField(term4516, term4516.getClass(), "size", 1698510819);
        setIntField(term4603, term4603.getClass(), "startAddress", -1553893255);
        setIntField(term4603, term4603.getClass(), "endAddress", 1303442927);
        setField(term4516, term4516.getClass(), "memoryRange", term4603);
        setField(term4516, term4516.getClass(), "name", "hNxWaHcfhY");
        setIntField(term4618, term4618.getClass(), "startAddress", 794568325);
        setIntField(term4618, term4618.getClass(), "endAddress", -434468428);
        setLongField(term4621, term4621.getClass(), "clockPeriodInNs", 1000L);
        setField(term4621, term4621.getClass(), "behavior", enum10);
        setIntField(term4623, term4623.getClass(), "startAddress", 1559605714);
        setIntField(term4623, term4623.getClass(), "endAddress", 1146601902);
        setLongField(term4626, term4626.getClass(), "clockPeriodInNs", 1000L);
        setField(term4626, term4626.getClass(), "behavior", enum10);
        setField(term4626, term4626.getClass(), "bus", null);
        setField(term4626, term4626.getClass(), "state", null);
        setLongField(term4626, term4626.getClass(), "opBeginTime", 2443640364875054177L);
        setField(term4623, term4623.getClass(), "cpu", term4626);
        setField(term4623, term4623.getClass(), "deviceMap", term4629);
        setField(term4623, term4623.getClass(), "deviceAddressArray", term4634);
        setField(term4621, term4621.getClass(), "bus", term4623);
        setIntField(term4635, term4635.getClass(), "a", 0);
        setIntField(term4635, term4635.getClass(), "x", 0);
        setIntField(term4635, term4635.getClass(), "y", 0);
        setIntField(term4635, term4635.getClass(), "sp", 0);
        setIntField(term4635, term4635.getClass(), "pc", 0);
        setIntField(term4635, term4635.getClass(), "ir", 0);
        setIntField(term4635, term4635.getClass(), "nextIr", 0);
        setField(term4635, term4635.getClass(), "args", term4643);
        setField(term4635, term4635.getClass(), "nextArgs", term4646);
        setIntField(term4635, term4635.getClass(), "instSize", 0);
        setBooleanField(term4635, term4635.getClass(), "opTrap", false);
        setBooleanField(term4635, term4635.getClass(), "irqAsserted", false);
        setBooleanField(term4635, term4635.getClass(), "nmiAsserted", false);
        setIntField(term4635, term4635.getClass(), "lastPc", 0);
        setBooleanField(term4635, term4635.getClass(), "carryFlag", false);
        setBooleanField(term4635, term4635.getClass(), "negativeFlag", false);
        setBooleanField(term4635, term4635.getClass(), "zeroFlag", false);
        setBooleanField(term4635, term4635.getClass(), "irqDisableFlag", false);
        setBooleanField(term4635, term4635.getClass(), "decimalModeFlag", false);
        setBooleanField(term4635, term4635.getClass(), "breakFlag", false);
        setBooleanField(term4635, term4635.getClass(), "overflowFlag", false);
        setLongField(term4635, term4635.getClass(), "stepCounter", 0L);
        setField(term4621, term4621.getClass(), "state", term4635);
        setLongField(term4621, term4621.getClass(), "opBeginTime", -1610676979013636850L);
        setField(term4618, term4618.getClass(), "cpu", term4621);
        setField(term4618, term4618.getClass(), "deviceMap", term4663);
        setField(term4618, term4618.getClass(), "deviceAddressArray", term4668);
        setField(term4516, term4516.getClass(), "bus", term4618);
        setField(term4516, term4516.getClass(), "deviceChangeListeners", term4669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorBlinkRate", argTypes, term4516, args);
    }

};


